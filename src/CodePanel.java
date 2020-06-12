import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class CodePanel extends JFrame {
	
	private JPanel CodePanel;
	private JLabel code;
	private JTextField txtcode;
	private JButton Back, Confirm;
	
	 public CodePanel() {
	    	super("Code Panel");
    
    CodePanel = new JPanel();
	
	setSize(350,250);
	setLocation(500,280);
	CodePanel.setLayout (null);
    
	Back = new JButton("Back");
	Confirm = new JButton("Confirm");
	code = new JLabel("Code");
    txtcode = new JTextField(15);
    
    Back.setBounds(0, 0, 75, 20);
    Confirm.setBounds(120, 110, 100, 20);
    code.setBounds(50,70,150,20);
    txtcode.setBounds(100,70,150,20);
  
    
    CodePanel.add(code);
    CodePanel.add(txtcode);
    CodePanel.add(Back);
    CodePanel.add(Confirm);
    
    
    getContentPane().add(CodePanel);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    
    
    
    Confirm.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e) 
        {
        	try {
        		String txtuser;
        		File file = new File("code.txt");
                FileWriter writer = new FileWriter(file);
               
                String paswd = txtcode.getText();
                 writer.write(paswd); 
                 writer.close();
                
                 JOptionPane.showMessageDialog(null,"Code has been created.");
                 dispose();
                 
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
