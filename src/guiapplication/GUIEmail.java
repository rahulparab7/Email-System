package guiapplication;

import java.awt.*;
import java.awt.event.*;

class GUIEmail extends Frame {
	
		//Constructor for GUIEmail Class
		GUIEmail()
		{
			Font f1,f2;
			f1 = new Font("TimesRoman",Font.PLAIN,18);//creates an object with the font initialized with font(Font style,font display,font size)
			f2 = new Font("TimesRoman",Font.BOLD,15);
			setLayout(null); //To indicate that we arent following any kind of layout 
			Color bg=new Color(250,255,255);// Color(R,G,B) and creates opaque color acc to values
			setBackground(bg);//sets the color of background
			setForeground(Color.BLACK);//Sets the color of foreground
			//GUI code
			Label l1=new Label("NEW MESSAGE");//Displays a label on the frame
			l1.setFont(f1);//set the specified font to the label
			add(l1);
			l1.setBounds(300,40,150,30);//x,y,width,height, used for positing of the component
			Label l2=new Label("To:");
			l2.setFont(f2);
			add(l2);
			l2.setBounds(50,80,40,30);//x,y,width,height
			TextField t1 = new TextField("To",60);// A single line textbox for To
			//t1.setText("TO"); - This was meant for initializing the textbox
			add(t1);
			t1.setBounds(120,80,500,30);//x,y,width,height
			Label l3=new Label("Cc:");
			l3.setFont(f2);
			add(l3);
			l3.setBounds(50,125,40,30);//x,y,width,height
			TextField t2 = new TextField(60);
			add(t2);
			t2.setBounds(120,125,500,30);//x,y,width,height
			Label l4=new Label("Bcc:");
			l4.setFont(f2);
			add(l4);
			l4.setBounds(50,170,40,30);//x,y,width,height
			TextField t3 = new TextField(60);
			add(t3);
			t3.setBounds(120,170,500,30);//x,y,width,height
			Label l5=new Label("Subject:");
			l5.setFont(f2);
			add(l5);
			l5.setBounds(50,215,53,30);//x,y,width,height
			TextField t4 = new TextField(500);
			add(t4);
			t4.setBounds(120,215,500,30);//x,y,width,height
			Label l6=new Label("Email:");
			l6.setFont(f2);
			add(l6);
			l6.setBounds(50,260,40,30);//x,y,width,height
			TextArea a = new TextArea(50,50);// A text area with multiple lines
			add(a);
			a.setBounds(120,260,500,250);//x,y,width,height
			Button b1 = new Button("SEND");//Creates a button with label 
			add(b1);
			b1.setBounds(250,520,200,40);
			//close
			addWindowListener(new WindowAdapter() //contains methods regarding the operations on windows
			{
				public void windowClosing(WindowEvent we) {
					System.exit(0);//This allows the window to close when clicked on the X button
				}
			});
		
			
			
			//Control frame
			setVisible(true); //make frame visible
			setSize(700,600); //set the size of frame first value is horizontal and second is vertical measure
			setTitle("Email"); // Title of Frame
			setResizable(true);//allows resizing of the window
			
			
		}	
public static void main(String[] args) {
	GUIEmail g=new GUIEmail();
	g.setLocation(300,70);// (horizontal,vertical)
}
		
}



