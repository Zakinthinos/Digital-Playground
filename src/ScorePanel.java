import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class ScorePanel extends JFrame {
	
	private JPanel ScorePanelMenu;
	private ButtonGroup parameter;
	private JButton Back;
    private JRadioButton rb1, rb2, rb3, rb4;
    private JButton b1, b2, b3, b4;
    private JButton Confirm;
    private JLabel l1, l2, l3, l4;
    
    
    public ScorePanel() {
    	super("ScorePanel Menu");
	
   
    rb1 = new JRadioButton("   <=50", true);
    rb2 = new JRadioButton("   <=100", false);
    rb3 = new JRadioButton("   <=150", false);
    rb4 = new JRadioButton("   >150", false);
    
    b1 = new JButton("<=50");
    b2 = new JButton("<=100");
    b3 = new JButton("<=150");
    b4 = new JButton(">150");
    
    l1 = new JLabel("<=50");
    l2 = new JLabel("<=100");
    l3 = new JLabel("<=150");
    l4 = new JLabel(">150");
    
    
    parameter = new ButtonGroup(); 
    //Prosthetei ta tessera Checkboxes sto group parameter
    
    
    parameter.add(rb1);
    parameter.add(rb2);
    parameter.add(rb3);
    parameter.add(rb4);
    
    Back = new JButton("Back");
    Confirm = new JButton("Confirm");
    ScorePanelMenu = new JPanel();
    
    setSize(350,250);
	setLocation(500,280);
	ScorePanelMenu.setLayout (null);
	
	Back.setBounds(0, 0, 75, 20);
	Confirm.setBounds(100, 150, 100, 20);
	
	rb1.setBounds(100,30,150,20);
	rb2.setBounds(100,60,150,20);
	rb3.setBounds(100,90,150,20);
	rb4.setBounds(100,120,150,20);
	
	l1.setBounds(120,30,150,20);
	l2.setBounds(120,60,150,20);
	l3.setBounds(120,90,150,20);
	l4.setBounds(120,120,150,20);
	
	ScorePanelMenu.add(Back);
	ScorePanelMenu.add(Confirm);
	
	ScorePanelMenu.add(rb1);
	ScorePanelMenu.add(rb2);
	ScorePanelMenu.add(rb3);
	ScorePanelMenu.add(rb4);
	
	ScorePanelMenu.add(l1);
	ScorePanelMenu.add(l2);
	ScorePanelMenu.add(l3);
	ScorePanelMenu.add(l4);
	

	getContentPane().add(ScorePanelMenu);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    
    Writer writer = null;
    File check = new File("scorepanel.txt");
    if(check.exists()){

      //Checks if the file exists. will not add anything if the file does exist.
    }else{
      try{
        File texting = new File("scorepanel.txt");
        writer = new BufferedWriter(new FileWriter(texting));
        writer.write("message");
      }catch(IOException e){
        e.printStackTrace();
      }
    }
 
    
    
    Confirm.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) 
        { 
        	try {
        		File file = new File("scorepanel.txt");
                Scanner scan = new Scanner(file);;
                String line = null;
                FileWriter filewrite = new FileWriter(file, true);
                
                String message = " ";
                
                String score = " ";
             
                if (rb1.isSelected()) //<=50//
                { 
                	score = "<=50";
                	filewrite.write(score+ "\r\n");
                } 

                else if (rb2.isSelected()) //<=100//
                { 
                	score = "<=100";
                	filewrite.write(score+ "\r\n");
                } 
                else if (rb3.isSelected()) //<=150//
                {             	
                	score = "<=150";
                	filewrite.write(score+ "\r\n");
                } 
                else if (rb4.isSelected()) //>150/
                {
                	score = ">150";
                	filewrite.write(score+ "\r\n");
                }
                
                
                filewrite.close();
                JOptionPane.showMessageDialog(null,"Score Range has been created");
                dispose();
                
                //еды то MENU пяепеи ма еимаи GAME. ха то акканоуле стгм пояеиа
                //Menu menu =new Menu();
                //dispose();
                
                
        	}
            
        	catch (IOException d) 
        	{
        		d.printStackTrace();
        	}
            
        } 
    }); 
    
    
    
    
    Back.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e) 
        {
        	CreateRoom createroom = new CreateRoom();
        	dispose();
        }
    } );
	

}
}
