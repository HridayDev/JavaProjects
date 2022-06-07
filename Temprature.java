import java.awt.event.*;
import javax.swing.*;

public class Temprature implements ActionListener {
	JFrame frame = new JFrame();
	JTextField value = new JTextField();
	JButton cel = new JButton("ºF To ºC");
	JButton far = new JButton("ºC To ºF");
	JLabel ans = new JLabel("");
	public Temprature(){
		frame.setSize(365, 120);
		frame.setTitle("Temprature Converter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(value);
		frame.add(cel);
		frame.add(far);
		frame.add(ans);
		
		frame.setLayout(null);
		value.setBounds(10, 10, 180, 24);
		ans.setBounds(230, 10, 180, 24);
		cel.setBounds(10, 40, 150, 24);
		far.setBounds(190, 40, 150, 24);
		
		far.addActionListener(this);
		cel.addActionListener(this);
	frame.setVisible(true);}
		
	public static void main(String[] args) { new Temprature(); }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cel) {
			float con = Float.parseFloat(value.getText());
			ans.setText(String.valueOf((con - 32) * 5/9));}
		
		if(e.getSource()==far) {
			float con = Float.parseFloat(value.getText());
			ans.setText(String.valueOf((con * 9/5) + 32));}
	}
}