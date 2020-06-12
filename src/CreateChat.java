import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class CreateChat extends JFrame
{
	private JPanel Chat;
	private JLabel l;
	private JTextField text;
	private JButton b;
	private JButton back;
	private int counter;
	
	public CreateChat(String name) throws FileNotFoundException
	{
		super("Chat");
		
		
		l = new JLabel("CHATTING WITH: "+name,10);
		Chat= new JPanel();
		text=new JTextField("Type something here ",150);
		b = new JButton("Enter");
		back = new JButton("Back");
		
		setSize(350,250);
		setLocation(500,280);
		Chat.setLayout (null);
		
		l.setBounds(100,30,150,20);
		text.setBounds(50,50,150,20);
		b.setBounds(170,180,150,20);
		back.setBounds(0, 0, 75, 20);
		
		Chat.add(l);
		Chat.add(text);
		Chat.add(b);
		Chat.add(back);
		
		getContentPane().add(Chat);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
	    
	   
	    counter=1;
	    b.addActionListener(new ActionListener() {

	        public void actionPerformed(ActionEvent e) 
	        { 
	        	PrintWriter writer;
				try {
					writer = new PrintWriter("Messages_"+counter+".txt");
					writer.println("Chatting With: "+name);
					writer.println(text.getText());
					text.setText(null);
					writer.close();
				
				} 
				
				catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	           counter++; 
	        } 
	    });
	    
	    back.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e) 
	        {
	        	Chat menu = new Chat();
	        	dispose();
	        }
	    } );
	}
}
