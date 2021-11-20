package guiapplication;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

class Loginwindow extends Frame
{
	//Constructor for login window
	Loginwindow()
	{
		Font f3,f4;
		f3 = new Font("TimesRoman",Font.PLAIN,10);//creates an object with the font initialized with font(Font style,font display,font size)
		f4 = new Font("TimesRoman",Font.BOLD,10);
		setLayout(null); //To indicate that we arent following any kind of layout 
		Color bg=new Color(250,255,255);// Color(R,G,B) and creates opaque color acc to values
		setBackground(bg);//sets the color of background
		setForeground(Color.BLACK);//Sets the color of foreground
		
		//GUI code
		Label l1=new Label("Username :");//Displays a label on the frame
		add(l1);
		l1.setBounds(90,90,70,20);
		final TextField t1 = new TextField(40);
		add (t1);
		t1.setBounds(170,90,150,20);
		Label l2=new Label("Password :");//Displays a label on the frame
		add(l2);
		l2.setBounds(90,150,80,20);
		
		final TextField t2 = new TextField(40);
		t2.setEchoChar('*');
		add (t2);
		t2.setBounds(170,150,150,20);
		final Button b2 = new Button("Submit");
		add(b2);
		b2.setBounds(180,200,80,20);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				String username=t1.getText();
				String password=t2.getText();
			
			if(username.equals("uname")&&password.equals("1234"))
			{
				GUIEmail g = new GUIEmail();
				g.setVisible(true);//the GUIEmail window is displayed
				g.setLocation(300,70);// (horizontal,vertical)
			}
			else
				if(username.equals("uname")&& !password.equals("1234"))
				{
					JOptionPane.showMessageDialog(b2, "Invalid Password ");
				}
				else
			{
				JOptionPane.showMessageDialog(b2, "Invalid Username ");
			}
			}
		});
		
		//for close
		addWindowListener(new WindowAdapter() //contains methods regarding the operations on windows
		{
			public void windowClosing(WindowEvent we) {
				System.exit(0);//This allows the window to close when clicked on the X button
			}
		});
		
		
		//Control frame
		setVisible(true); //make frame visible
		setSize(400,250); //set the size of frame first value is horizontal and second is vertical measure
		setTitle("Login Window"); // Title of Frame
		setResizable(true);//allows resizing of the window
		
	}	
public static void main(String[] args) {
Loginwindow g=new Loginwindow();
g.setLocation(450,150);
}
		}
	


