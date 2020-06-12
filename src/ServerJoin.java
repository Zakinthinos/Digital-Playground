import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class ServerJoin extends JFrame {
	
	private JPanel ServerJoin;
	private JLabel Server_Name;
	private JTextField txtserver;
	private JButton Back, Confirm;
	private static String game;
	 public ServerJoin() {super("Server Join");
    
	 ServerJoin = new JPanel();
	
	setSize(350,250);
	setLocation(500,280);
	ServerJoin.setLayout (null);
    
	Back = new JButton("Back");
	Confirm = new JButton("Confirm");
	Server_Name = new JLabel("Server_Name:");
	txtserver = new JTextField(15);
    
    Back.setBounds(0, 0, 75, 20);
    Confirm.setBounds(120, 110, 100, 20);
    Server_Name.setBounds(5,70,150,20);
    txtserver.setBounds(100,70,150,20);
  
    
    ServerJoin.add(Server_Name);
    ServerJoin.add(txtserver);
    ServerJoin.add(Back);
    ServerJoin.add(Confirm);
    
    
    getContentPane().add(ServerJoin);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    
    
    
    Confirm.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e) 
        {
        	File f = new File("Server_Name.txt");
			try {
				FileReader fr=new FileReader(f);
				BufferedReader reader = new BufferedReader(fr);
				if(reader.readLine().equals(txtserver.getText()))
						{
							JOptionPane.showMessageDialog(null,"Room joined , Opening Game");
							JFrame frame = new JFrame();
				            Fidaki screen = new Fidaki();
				            game = "SnakeGame";
				           
				            frame.add(screen);
				            frame.setTitle("Snake");
				            frame.setResizable(false);
				            frame.pack();
				            frame.setLocationRelativeTo(null);
				            frame.setVisible(true);
				            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
							dispose();
							Menu menu=new Menu();
							dispose();
						}
				else
				{
					JOptionPane.showMessageDialog(null,"Wrong Server Name");
					ServerJoin sj= new ServerJoin();
					dispose();
				}
				
				
			} catch (IOException e1) {
				
				JOptionPane.showMessageDialog(null,"Server Name was not right");
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
