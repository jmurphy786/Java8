import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventThree implements ActionListener {
	Random r = new Random();
	  @Override
	public void actionPerformed(ActionEvent e) {
		  JFrame frame = new JFrame();
		    frame.setLocation(r.nextInt(1000), r.nextInt(700));
		  ImageIcon icon = new ImageIcon("C://Users//Admin//Documents//ains3.jpg");
		  JLabel label = new JLabel(icon);
		  frame.add(label);
		  frame.setDefaultCloseOperation
		         (JFrame.EXIT_ON_CLOSE);
		  frame.pack();
		  frame.setVisible(true);
	 
		
	}


}