import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Events implements ActionListener {

	
	TextField t1,t2,t3;
	Button bt;
	int i, j, z;
	
	public Events(TextField t1, TextField t2, TextField t3) {
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		bt = (Button)arg0.getSource();
		String btSource = bt.getLabel();
		String str = t1.getText();
		i = Integer.parseInt(str);
		str = t2.getText();
		j = Integer.parseInt(str);
		
		if(btSource.equals("+")) {
			z = i + j;
		}
		
		t3.setText("" + z);
	}

}
