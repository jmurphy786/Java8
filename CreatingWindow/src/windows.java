

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.JPanel;

import java.awt.event.*;

public class windows {

	public static void main(String[] args) {
		
		Frame f = new Frame("MyFrame");
		TextField txtbox = new TextField();
		
		f.setAlwaysOnTop (true);
		Button bt1 = new Button("Shafeed");
		Button bt2 = new Button("click");
		Button bt3 = new Button("clock");
		
		Random r = new Random();
		f.setVisible(true);
		f.setSize(400,400);
	    f.setLocation(r.nextInt(400), r.nextInt(400));
		f.add(bt1, BorderLayout.NORTH);
		f.add(txtbox, BorderLayout.WEST);
		f.add(bt2, BorderLayout.CENTER);
		f.add(bt3, BorderLayout.EAST);
		
		
		Event E = new Event(txtbox);
		EventTwo Et = new EventTwo();
		EventThree Etr = new EventThree();
		
		bt1.addActionListener(E);
		bt2.addActionListener(Et);
		bt3.addActionListener(Etr);
	}
	

}
