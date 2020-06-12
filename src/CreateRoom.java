import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class CreateRoom extends JFrame {
	
	private JPanel CreateRoomMenu;
	private ButtonGroup parameter;
	private JButton Back;
    private JRadioButton rb1, rb2, rb3;
    private JButton b1, b2, b3;
    private JButton Confirm;
    private JLabel l1, l2, l3;
    
    
    public CreateRoom() {
    	super("Create Room Menu");
	
   
    //rb1 = new JRadioButton("   Score", true);
    rb2 = new JRadioButton("   Code", false);
    rb3 = new JRadioButton("   Server Name", false);
    
   // b1 = new JButton("Score");
    b2 = new JButton("Code");
    b3 = new JButton("Server Name");
    
    //l1 = new JLabel("Score");
    l2 = new JLabel("Code");
    l3 = new JLabel("Server Name");
    
    
    parameter = new ButtonGroup(); 
    //Προσθέτει τα τρια Checkboxes στο group parameter
    
   // parameter.add(rb1);
    parameter.add(rb2);
    parameter.add(rb3);
    
    Back = new JButton("Back");
    Confirm = new JButton("Confirm");
    CreateRoomMenu = new JPanel();
    
    setSize(350,250);
	setLocation(500,280);
	CreateRoomMenu.setLayout (null);
	
	Back.setBounds(0, 0, 75, 20);
	Confirm.setBounds(100, 150, 100, 20);
	
	//rb1.setBounds(100,30,150,20);
	rb2.setBounds(100,60,150,20);
	rb3.setBounds(100,90,150,20);
	
	//l1.setBounds(120,30,150,20);
	l2.setBounds(120,60,150,20);
	l3.setBounds(120,90,150,20);
	
	CreateRoomMenu.add(Back);
	CreateRoomMenu.add(Confirm);
	
	//CreateRoomMenu.add(rb1);
	CreateRoomMenu.add(rb2);
	CreateRoomMenu.add(rb3);
	
	//CreateRoomMenu.add(l1);
	CreateRoomMenu.add(l2);
	CreateRoomMenu.add(l3);
	

	getContentPane().add(CreateRoomMenu);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    
    
 
    
    
    Confirm.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) 
        { 
            String message = " "; 

            // If condition to check if jRadioButton2 is selected. 
           /* if (rb1.isSelected()) //score//
            { 
            	ScorePanel scorepanel = new ScorePanel();
            	dispose();
            } */

            if (rb2.isSelected()) //code//
            { 
            	/*Εμφανιζει textbox και γραφει ο χρηστης τον κωδικο*/
            	CodePanel codepanel = new CodePanel();
            	dispose();
            	
            } 
            else if (rb3.isSelected()) //username//
            { 
            	UserPanel userpan = new UserPanel();
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