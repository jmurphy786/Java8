import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jaco.mp3.player.MP3Player;
import java.io.File;
import java.io.FileInputStream;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Event implements ActionListener {
	Random r = new Random();
	TextField txt;
	@Override
	public void actionPerformed(ActionEvent arg0) {
		  JFrame frame = new JFrame();
		    frame.setLocation(r.nextInt(1000), r.nextInt(700));
			  ImageIcon icon = new ImageIcon("C://Users//Admin//Documents//ains.jpg");
			  JLabel label = new JLabel(icon);
			  frame.add(label);
			  frame.setDefaultCloseOperation
			         (JFrame.EXIT_ON_CLOSE);
			  frame.pack();
			  frame.setVisible(true);
			  txt.setText("It's ya boy Ains!");
	}
	
	public Event(TextField txt) {
		this.txt = txt;
	}
	
}
