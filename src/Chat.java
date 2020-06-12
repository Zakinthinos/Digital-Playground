import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.JFileChooser;


public class Chat extends JFrame 
{
	private JButton SearchFriends;
	//private JButton CreateChat;
	private JButton Back;
	private JPanel ChatMenu;
	
	
	public Chat() 
	{
		super ("Chat Menu");
		SearchFriends=new JButton("Search Friends");
		Back = new JButton("Back");
		ChatMenu = new JPanel();
		
		setSize(350,250);
		setLocation(500,280);
		ChatMenu.setLayout (null);
		
		SearchFriends.setBounds(100,90,150,20);
		Back.setBounds(0, 0, 75, 20);
		
		ChatMenu.add(SearchFriends);
		ChatMenu.add(Back);
		
		getContentPane().add(ChatMenu);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
		
		SearchFriends.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							Search search = new Search();
							dispose();
						}
					}
				
				
				);
		
		
		
		
		
		Back.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e) 
	        {
	        	Menu menu =new Menu();
	        	dispose();
	        }
	    } );
	    
		
		
		
		
	} 
}
	
	
	
	

