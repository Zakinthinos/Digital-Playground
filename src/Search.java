import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;


public class Search extends JFrame 
{

	private JPanel SearchFriendsMenu;
	private JButton Back;
	private JButton Chat;
	private JLabel text;
	private JTextField textfield;
	private String path;
	
	
	public Search()
	{
		super("Search Friends");
		
		SearchFriendsMenu=new JPanel();
		Back = new JButton("Back");
		text = new JLabel(" FRIENDS");
		textfield = new JTextField("Name of Friends",10);
		Chat = new JButton("Create Chat ");
		
		
		//********* Opening File **********
		
				File users = null;
				path =null;
				boolean flag=false;
				
				DefaultListModel<String> model = new DefaultListModel<>();
				JList<String> list = new JList<>( model );
				ArrayList<String> players = new ArrayList<String>();
				
				
				
				JOptionPane.showMessageDialog(Search.this,"Please select your file ");
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
			int result = fileChooser.showOpenDialog(fileChooser);
			
			if (result==JFileChooser.APPROVE_OPTION)
			{
				users=fileChooser.getSelectedFile();
				 path=users.getAbsolutePath();
				flag=true;
			}
			else 
			{
				JOptionPane.showMessageDialog(Search.this,"Wrong File please select again ");
				Chat chat = new Chat();
				dispose();
			}
			
			//********* Reading File ***********
			if(flag) {
			try 
			{
				BufferedReader reader = new BufferedReader( new FileReader(users));
				int countlines=1;
				String line;
				
				while((line=reader.readLine())!=null)
				{
					if(countlines%2==1)
						players.add(line);
					countlines++;
				}
				
			for (int i=0;i<players.size();i++)
				model.addElement(players.get(i));
			
			
			setSize(350,250);
			setLocation(500,280);
			SearchFriendsMenu.setLayout (null);
			
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setViewportView(list);
			
			Back.setBounds(0, 0, 75, 20);
			text.setBounds(100,30,150,20);
			scrollPane.setBounds(100,60,150,20);
			textfield.setBounds(100,90,150,20);
			Chat.setBounds(170,180,150,20);
			
			
			SearchFriendsMenu.add(Back);
			SearchFriendsMenu.add(scrollPane);
			SearchFriendsMenu.add(text);
			SearchFriendsMenu.add(textfield);
			SearchFriendsMenu.add(Chat);
			
			
			getContentPane().add(SearchFriendsMenu);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    setVisible(true);
		   
		    Back.addActionListener(new ActionListener()
		    {
		        public void actionPerformed(ActionEvent e) 
		        {
		        	Chat chat =new Chat();
		        	dispose();
		        }
		    } ); 
		    
		    Chat.addActionListener(new ActionListener()
		    {
		    	boolean flag2;
		        public void actionPerformed(ActionEvent e) 
		        {
		        	for(int i=0;i<players.size();i++)
		        	{
		        		flag2=false;
		        		if(players.get(i).equals(textfield.getText()))
		        		{
		        			JOptionPane.showMessageDialog(Search.this,"Correct name");
		        			flag2=true;
		        			try {
								CreateChat create = new CreateChat(textfield.getText());
							} catch (FileNotFoundException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
		        			dispose();
		        			textfield.setText(null);
		        			break;
		        		}
		        		
		        	}
		        	if(flag2==false)
		        	{
		        		JOptionPane.showMessageDialog(Search.this,"Wrong name, select one from above to chat");
	        			textfield.setText(null);
	        			
		        	}
		        }
		    } );
		    
			}
			
			
			
			
			
			catch (IOException e) {
				
				Chat chat = new Chat();
				dispose();
			}
			}
		
	}

	
	
}
