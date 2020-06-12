import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Score extends JFrame  {
	private JButton Snake;
	private JButton Pinball;
	private JButton Back;
	public static JPanel Score;
    static boolean flag = false;
	int i=0;
    
	private ArrayList <String> name = new ArrayList<String>();
	private ArrayList<Integer> points = new ArrayList<Integer>();
	
	public static boolean getFlag() {
		return flag;
	}
	
	public static void setVisible() {};
 	
	public Score() {
		super("SCORE"); 
		Snake = new JButton("SnakeGame Score");
		Pinball = new JButton("Flipper Score");
		Back = new JButton("Back");
		Score = new JPanel();
		flag = true;
		
		setSize(350,250);
		setLocation(500,280);
		Score.setLayout (null);
		
		Snake.setBounds(100,45,150,20);
		Pinball.setBounds(100,90,150,20);
		Back.setBounds(0, 0, 75, 20);
		
		Score.add(Snake);
		Score.add(Pinball);
		Score.add(Back);
		
		getContentPane().add(Score);
		setVisible(true);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		Snake.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if (Game.getGame()==1){
					points.add(Fidaki.getScore());
					try {
				          File file = new File("PlayerScores.txt");
				          if(!file.exists()) {
				        	  file.createNewFile();
				          }
				          PrintWriter pw = new PrintWriter(file);
						  JOptionPane.showMessageDialog(null,"Score in SnakeGame: "+points.get(i));
				          pw.print("Score: "+i+": " +points.get(i));
				          i++;
				          pw.close();
				          }
				         catch (IOException d) {
				        	 JOptionPane.showMessageDialog(null,"File did not open");
				        }
				}
				else {
					JOptionPane.showMessageDialog(null, "You did not play Snake Game");
				}
			}
		});
		
		Pinball.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{	if (Game.getGame()==2) {
				points.add(Flipper.getPoints());
				try {
			          File file = new File("PlayerScores.txt");
			          if(!file.exists()) {
			        	  file.createNewFile();
			          }
			          PrintWriter pw = new PrintWriter(file);
					  JOptionPane.showMessageDialog(null,"Score in Flipper: "+points.get(i));
			          pw.print("Score: "+i+": " +points.get(i));
			          i++;
			          pw.close();
			          }
			         catch (IOException d) {
			        	 JOptionPane.showMessageDialog(null,"File did not opened");
			        }
				}else {
					JOptionPane.showMessageDialog(null, "You did not play Flipper");
				}
			}
		});
		
		Back.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e) 
	        {
	        	Menu menu=new Menu();
	        	dispose();
	        }
	    } );
	}
}	


