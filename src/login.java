import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public final class login extends JFrame {
	private JButton blogin;
	private JPanel loginpanel;
	private JTextField txuser;
	private JTextField pass;
	private JButton newUSer;
	private JLabel username;
	private JLabel password;
	
	private boolean flag = false;
	private boolean flag2=false;
	private static ArrayList <String> name = new ArrayList <String>();
	
	public static ArrayList<String> getUser() {
		 return name;
	}
	
	public boolean getFlag() {
		return flag;
	}

  public login(){
    super("Login Autentification");
    
    blogin = new JButton("Login");
    loginpanel = new JPanel();
    txuser = new JTextField(15);
    pass = new JPasswordField(15);
    newUSer = new JButton("New User?");
    username = new JLabel("Username");
    password = new JLabel("Password");

    setSize(350,250);
    setLocation(500,280);
    loginpanel.setLayout (null); 

    txuser.setBounds(100,30,150,20);
    pass.setBounds(100,65,150,20);
    blogin.setBounds(130,100,80,20);
    newUSer.setBounds(130,135,80,20);
    username.setBounds(20,28,80,20);
    password.setBounds(20,63,80,20);
    

    loginpanel.add(blogin);
    loginpanel.add(txuser);
    loginpanel.add(pass);
    loginpanel.add(newUSer);
    loginpanel.add(username);
    loginpanel.add(password);
    

    getContentPane().add(loginpanel);
    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    setVisible(true);

    
    blogin.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          File file = new File("userPass.txt");
          FileReader fr = new FileReader(file);
          BufferedReader reader = new BufferedReader(fr);

          String line ;
          
          String puname = txuser.getText();
          String ppaswd = pass.getText();
          String username;
          String password;
           name.add(puname);
          
          line = reader.readLine();
          
          while(line!=null)
          {
        	  username=line;
        	  line = reader.readLine();
        	  password=line;
        	  if(username.equals(puname)&& (password.equals(ppaswd)))
        	  {
        		  flag2=true;
        		  JOptionPane.showMessageDialog(null,"You logged in successfully");
        		  Menu menu =new Menu();
                  dispose();
        		  break;
        	  }
        	 /* if(flag2==false)
              {
            	  JOptionPane.showMessageDialog(null,"Wrong username/password , Try again");
            	  break;
              } */
          }
          if(flag2==false) 
        	  JOptionPane.showMessageDialog(null,"Wrong username/password , Try again");
          
          
          
          }
         catch (IOException d) {
        	 JOptionPane.showMessageDialog(null,"File did not opened");
        }
        
      }
    });

    newUSer.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {
        NewUser user = new NewUser();
        dispose();
        }
    });
  }
}	