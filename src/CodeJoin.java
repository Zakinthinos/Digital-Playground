import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class CodeJoin extends JFrame {
	
	private JPanel CodeJoin;
	private JLabel code;
	private JTextField txtcode;
	private JButton Back, Confirm;
	private static String game;
	 public CodeJoin() {super("Code Join");
    
	 CodeJoin = new JPanel();
	
	setSize(350,250);
	setLocation(500,280);
	CodeJoin.setLayout (null);
    
	Back = new JButton("Back");
	Confirm = new JButton("Confirm");
	code = new JLabel("Code");
    txtcode = new JTextField(15);
    
    Back.setBounds(0, 0, 75, 20);
    Confirm.setBounds(120, 110, 100, 20);
    code.setBounds(50,70,150,20);
    txtcode.setBounds(100,70,150,20);
  
    
    CodeJoin.add(code);
    CodeJoin.add(txtcode);
    CodeJoin.add(Back);
    CodeJoin.add(Confirm);
    
    
    getContentPane().add(CodeJoin);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    
    
    
    Confirm.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e) 
        {
        	File f = new File("code.txt");
			try {
				FileReader fr=new FileReader(f);
				BufferedReader reader = new BufferedReader(fr);
				if(reader.readLine().equals(txtcode.getText()))
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
					JOptionPane.showMessageDialog(null,"Wrong Code");
					CodeJoin cj = new CodeJoin();
					dispose();
				}
				
				
			} catch (IOException e1) {
				
				JOptionPane.showMessageDialog(null,"Code was not right");
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
