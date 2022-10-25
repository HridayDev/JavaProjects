import java.awt.event.*;
import javax.swing.*;

public class USDtoINR implements ActionListener {
	JFrame frame = new JFrame();
	JTextField value = new JTextField();
	JButton inr = new JButton("USD To INR");
	JButton usd = new JButton("INR To USD");
	JLabel ans = new JLabel("");
	float val = 82.71050000000001024F;
	public USDtoINR(){
		frame.setSize(365, 120);
		frame.setTitle("Currency Converter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(value);
		frame.add(inr);
		frame.add(usd);
		frame.add(ans);
		
		frame.setLayout(null);
		value.setBounds(10, 10, 180, 24);
		ans.setBounds(230, 10, 180, 24);
		inr.setBounds(10, 40, 150, 24);
		usd.setBounds(190, 40, 150, 24);
		
		usd.addActionListener(this);
		inr.addActionListener(this);
	frame.setVisible(true);}
		
	public static void main(String[] args) { new USDtoINR(); }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==inr) {
			float con = Float.parseFloat(value.getText());
			ans.setText(String.valueOf(con*val));}
		
		if(e.getSource()==usd) {
			float con = Float.parseFloat(value.getText());
			ans.setText(String.valueOf(con/val));}
	}
}