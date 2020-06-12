import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class UserPanel extends JFrame {
		
		private JPanel UserPanel;
		private JLabel username;
		private JTextField txtuser; 
		private JButton Back, Confirm;
		
		 public UserPanel() {
		    	super("User Panel");
	    
	    UserPanel = new JPanel();
		
		setSize(350,250);
		setLocation(500,280);
		UserPanel.setLayout (null);
	    
		Back = new JButton("Back");
		Confirm = new JButton("Confirm");
		username = new JLabel("Server Name: ");
	    txtuser = new JTextField(15);
	   
	    
	    Back.setBounds(0, 0, 75, 20);
	    Confirm.setBounds(120, 110, 100, 20);
	    username.setBounds(20,70,150,20);
	    txtuser.setBounds(110,70,150,20);
	   
	  
	    
	    UserPanel.add(username);
	    UserPanel.add(txtuser);
	    
	    UserPanel.add(Back);
	    UserPanel.add(Confirm);
	    
	    
	    getContentPane().add(UserPanel);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
	    
	    Confirm.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e) 
	        {
	        	try {
	        		File file = new File("Server_Name.txt");
	                FileWriter writer = new FileWriter(file);
	               

	                String line ;
	                String paswd = txtuser.getText();
	                 writer.write(paswd); 
	                 writer.close();
	                 JOptionPane.showMessageDialog(null,"Server Name has been insert.");
	                 
	                 Menu menu =new Menu();
	                 dispose();
	                
	                
	                
	                
	        	}
	            
	        	catch (IOException d) 
	        	{
	        		d.printStackTrace();
	        	}
	        	 
	        }
	        
	    } );
	    
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
