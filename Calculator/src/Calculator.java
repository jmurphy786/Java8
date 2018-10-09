import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Calculator {
	
public static void main(String[] args) {
		
		Frame f = new Frame("My Frame");
		f.setVisible(true);
		f.setSize(400,400);	
		f.setAlwaysOnTop (true);
		
		Button add,sub,mult,div,equals,sin, cos, tan, zero, one, two, three, four, five, six, seven, eight, nine, dot, clear;
		TextField t1;
		
		
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		
		t1 = new TextField();
		
		add = new Button("+");
		sub = new Button("-");
		mult = new Button("*");
		div = new Button("/");
		equals = new Button("=");
		zero = new Button("0");
		one = new Button("1");
		two = new Button("2");
	    three = new Button("3");
		four = new Button("4");
		five = new Button("5");
		six = new Button("6");
		seven = new Button("7");
		eight = new Button("8");
		nine = new Button("9");
		dot = new Button(".");
		sin = new Button("sin()");
		cos = new Button("cos()");
		tan = new Button("tan()");
		equals = new Button("=");
		clear = new Button("CE");
		
	
		
		FlowLayout flow = new FlowLayout();
		
	    p2.setLayout(new GridLayout(5, 5));
	    p1.setLayout(flow);
	    p1.add(t1);
		f.setSize(400, 400);
		p1.add(t1);
		
		p2.add(sin);
		p2.add(cos);
		p2.add(tan);
		p2.add(div);
		p2.add(seven);
		p2.add(eight);
		p2.add(nine);
		p2.add(add);
		p2.add(six);
		p2.add(five);
		p2.add(four);
		p2.add(mult);
		p2.add(three);
		p2.add(two);
		p2.add(one);
		p2.add(sub);
		p2.add(zero);
		p2.add(dot);
		p2.add(equals);
		p2.add(clear);

		f.add(p1, BorderLayout.NORTH);
		f.add(p2, BorderLayout.CENTER);

		Events e = new Events(t1);
		
		add.addActionListener(e);
		dot.addActionListener(e);
		mult.addActionListener(e);
		div.addActionListener(e);
		sub.addActionListener(e);
		zero.addActionListener(e);
		one.addActionListener(e);
		two.addActionListener(e);
		three.addActionListener(e);
		four.addActionListener(e);
		five.addActionListener(e);
		six.addActionListener(e);
		seven.addActionListener(e);
		eight.addActionListener(e);
		nine.addActionListener(e);
		equals.addActionListener(e);
		clear.addActionListener(e);


	}
}
