import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Game extends JFrame {
	
	private JButton SnakeGame;
	//private JButton CreateChat;
	private JButton Back;
	private JButton PinBall;
	private static JPanel GameMenu;
	private static int game = 0;
	
	public static int getGame() {
		return game;
	}
	
	public static JPanel returnGame() {
		return GameMenu;
	}
	
	public Game() 
	{
		super ("Game Menu");
	
		SnakeGame=new JButton("SnakeGame");
		PinBall = new JButton("Flipper");
		Back  = new JButton("Back");
		GameMenu = new JPanel();
		
		setSize(350,250);
		setLocation(500,280);
		GameMenu.setLayout (null);
		
		SnakeGame.setBounds(100,90,150,20);
		PinBall.setBounds(100, 45, 150,20);
		Back.setBounds(0, 0, 75, 20);
		
		GameMenu.add(SnakeGame);
		GameMenu.add(PinBall);
		GameMenu.add(Back);
		
		getContentPane().add(GameMenu);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	    setVisible(true);
	    
	    SnakeGame.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e) 
	        {
	        	JFrame frame = new JFrame();
	            Fidaki screen = new Fidaki();
	            game = 1;
	           
	            frame.add(screen);
	            frame.setTitle("Snake");
	            frame.setResizable(false);
	            frame.pack();
	            frame.setLocationRelativeTo(null);
	            frame.setVisible(true);
	            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	            
	        } 
	    } );

	    PinBall.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	        	JFrame frame = new JFrame();
	        	Flipper screen = new Flipper();
	        	game = 2;
	      
	        	frame.setSize(400,600);
	        	frame.add(screen);
	        	frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	            frame.setTitle("Flipper");
	            frame.setVisible(true);
	        }
	        
	    } );

	    
	    Back.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e) 
	        {
	        	Menu menu = new Menu();
	        	dispose();
	        }
	    } );

	}
}
