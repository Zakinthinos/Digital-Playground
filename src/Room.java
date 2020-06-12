import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Room extends JFrame {
	private JButton CreateRoom;
	private JButton JoinRoom;
	private JButton Back;
	private JPanel RoomMenu;
	
	
	public Room(){
		super("Room Menu");
		
	
	CreateRoom = new JButton("Create Room");
	JoinRoom = new JButton("Join Room");
	Back = new JButton("Back");
	RoomMenu = new JPanel();
	
	setSize(350,250);
	setLocation(500,280);
	RoomMenu.setLayout (null);
	
	CreateRoom.setBounds(100,60,150,20);
	JoinRoom.setBounds(100,100,150,20);
	Back.setBounds(0, 0, 75, 20);
	
	RoomMenu.add(CreateRoom);
	RoomMenu.add(JoinRoom);
	RoomMenu.add(Back);
	
	getContentPane().add(RoomMenu);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    
    CreateRoom.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e) 
        {
        	CreateRoom createroom = new CreateRoom();
        	dispose();
        }
    } );
    
    JoinRoom.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e) 
        {
        	JoinRoom joinroom = new JoinRoom();
        	dispose();
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
