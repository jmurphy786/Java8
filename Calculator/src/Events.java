import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Events implements ActionListener {

	TextField t1;
	Button bt;
	double i,z;
	ArrayList<Double> values= new ArrayList<Double>();
	ArrayList<Character> ops = new ArrayList<Character>();
	double result;
	String str = "";
    JFrame frame;
    int ainsrate;
	public Events(TextField t1) {
		this.t1 = t1;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		bt = (Button)arg0.getSource();
		String btSource = bt.getLabel();
		
		
		if(btSource.equals("+")) {
			result = Double.parseDouble(t1.getText());
			values.add(result);
			str = "";
			ops.add('+');
			t1.setText("");
		}
		
		else if(btSource.equals("-")) {
			result = Double.parseDouble(t1.getText());
			values.add(result);
			str = "";
			ops.add('-');
			t1.setText("");
		}
		
		else if(btSource.equals("/")) {
			result = Double.parseDouble(t1.getText());
			values.add(result);
			str = "";
			ops.add('/');
			t1.setText("");
		}
		
		else if(btSource.equals("*")) {
			result = Double.parseDouble(t1.getText());
			values.add(result);
			str = "";
			ops.add('*');
			t1.setText("");
		}
		
		
		else if(btSource.equals("=")) {
			result = Double.parseDouble(t1.getText());
			values.add(result);
			int counter = 0;
			z = 0;
			for(int i = 0 ; i < ops.size(); i++) {
				
				if(i > ops.size()) {
					break;
				}
				else if (ops.get(i) == '+') {
				z = values.get(counter)  + values.get(counter + 1); 
				}
				else if (ops.get(i) == '-') {
				z = values.get(counter) - values.get(counter + 1); 
				}
				else if (ops.get(i) == '*') {
				z = values.get(counter)  * values.get(counter + 1); 
				}
				else if (ops.get(i) == '/') {
				z = values.get(counter)  / values.get(counter + 1); 
				}
		
				counter++;
			}
			Random r = new Random();
			int i = 0;
			ainsrate = (int) z;
			while(i < ainsrate){
				frame = new JFrame();
			    frame.setLocation(r.nextInt(1000), r.nextInt(700));
				  ImageIcon icon = new ImageIcon("C://Users//Admin//Documents//ains3.jpg");
				  JLabel label = new JLabel(icon);
				  frame.add(label);
				  frame.setDefaultCloseOperation
				         (JFrame.EXIT_ON_CLOSE);
				  frame.pack();
				  frame.setVisible(true);
				  i++;
			}

				  
			values.clear();
			ops.clear();
			str = "";
			t1.setText("" + z);
		}
		else if(btSource.equals(".")) {
			System.out.println(btSource);
			str += btSource;
			t1.setText(str);
		}
		else if(btSource.equals("CE")) {
			values.clear();
			ops.clear();
			str = "";
			t1.setText(str);
	
		}
		else {
	
			str += btSource;
			t1.setText(str);
		}

	}
}
