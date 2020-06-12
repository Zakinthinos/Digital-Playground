import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class JoinRoom extends JFrame {

	private JPanel JoinRoomMenu;
	private ButtonGroup parameter;
	private JButton Back;
    private JRadioButton rb1, rb2, rb3;
    private JButton b1, b2, b3;
    private JButton Confirm;
    private JLabel l1, l2, l3;
    
    
    public JoinRoom() {
    	super("Join Room Menu");
	
   
  
    rb2 = new JRadioButton("   Code", false);
    rb3 = new JRadioButton("   Username", false);
    
   
    b2 = new JButton("Code");
    b3 = new JButton("Username");
    
    
    l2 = new JLabel("Code");
    l3 = new JLabel("Username");
    
    
    parameter = new ButtonGroup(); 
    //Προσθέτει τα τρια Checkboxes στο group parameter
    
   
    parameter.add(rb2);
    parameter.add(rb3);
    
    Back = new JButton("Back");
    Confirm = new JButton("Confirm");
    JoinRoomMenu = new JPanel();
    
    setSize(350,250);
	setLocation(500,280);
	JoinRoomMenu.setLayout (null);
	
	Back.setBounds(0, 0, 75, 20);
	Confirm.setBounds(100, 150, 100, 20);
	
	
	rb2.setBounds(100,60,150,20);
	rb3.setBounds(100,90,150,20);
	
	
	l2.setBounds(120,60,150,20);
	l3.setBounds(120,90,150,20);
	
	JoinRoomMenu.add(Back);
	JoinRoomMenu.add(Confirm);
	
	
	JoinRoomMenu.add(rb2);
	JoinRoomMenu.add(rb3);
	
	
	JoinRoomMenu.add(l2);
	JoinRoomMenu.add(l3);
	

	getContentPane().add(JoinRoomMenu);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    
    
    
    
    Confirm.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) 
        { 
            
            if (rb2.isSelected()) //code//
            { 
            	CodeJoin cj= new CodeJoin();
            	dispose();
            } 
            else if (rb3.isSelected()) //username//
            {             	 
            	ServerJoin uj= new ServerJoin();
            	dispose();
            } 
            
 
            
        } 
    }); 
    
    
    
    
    Back.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e) 
        {
        	Room newroom = new Room();
        	dispose();
        }
    } );
    
	

}

}
