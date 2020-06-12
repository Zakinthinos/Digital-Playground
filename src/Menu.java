import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Menu extends JFrame{
	private JButton Chat;
	private JButton Room;
	private JButton Score1;
	private JButton Game1;
	private static JPanel MainMenu;
	private JButton LogOut;
	
	private ArrayList <String> name = new ArrayList<String>();
	private ArrayList<Integer> points = new ArrayList<Integer>();
	
	public static JPanel returnMenu() {
		return MainMenu;
	}
	
	public Menu(){
		super("Main Menu");
	
	Chat = new JButton("Chat");
	Room = new JButton("Room");
	Score1 = new JButton("Score");
	Game1 = new JButton("Game");
	MainMenu = new JPanel();
	LogOut = new JButton("LogOut");
	
	setSize(350,250);
	setLocation(500,280);
	MainMenu.setLayout (null);
	
	Chat.setBounds(100,30,150,20);
	Room.setBounds(100,70,150,20);
	Score1.setBounds(100,110,150,20);
	Game1.setBounds(100,150,150,20);
	LogOut.setBounds(250, 190, 80, 20);
	
	
	MainMenu.add(Chat);
	MainMenu.add(Room);
	MainMenu.add(Score1);
	MainMenu.add(Game1);
	MainMenu.add(LogOut);
	
	getContentPane().add(MainMenu);
    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    setVisible(true);
    
    
    Room.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e) 
        {
        	Room newroom = new Room();
        	dispose();
        }
    } );
    
    Score1.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e) 
        {
        	if(Game.getGame()==0) {
    			JOptionPane.showMessageDialog(null, "You did not play any game");
    		}
        	else {
        	Score score = new Score();
        	dispose();
        	}
    	}
    } );
    
    Game1.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e) 
        {
        	Game newgame = new Game();
        	dispose();
        }
    } );
    
    LogOut.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e) 
        {
        	login l = new login();
        	dispose();
        }
    } );
    
    Chat.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e) 
        {
        	Chat chat = new Chat();
        	dispose();
        }
    }); 
    
   }
}