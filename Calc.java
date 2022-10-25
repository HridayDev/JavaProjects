import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Calc implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("ADD");
	JButton sub = new JButton("MINUS");
	JButton mul = new JButton("MULTIPLY");
	JButton div = new JButton("DIVIDE");
	JTextField n1 = new JTextField();
	JTextField n2 = new JTextField();
	JLabel op = new JLabel("");
	JLabel is = new JLabel("=");
	JLabel ans = new JLabel("");
	public Calc(){
		frame.setVisible(true);
		frame.setSize(520, 140);
		frame.setTitle("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		panel.add(n1);
		panel.add(n2);
		panel.add(op);
		panel.add(is);
		panel.add(ans);
		
		add.setBounds(015, 50, 100, 25);
		sub.setBounds(140, 50, 100, 25);
		mul.setBounds(265, 50, 100, 25);
		div.setBounds(390, 50, 100, 25);
		n1.setBounds(15, 5, 100, 25);
		n2.setBounds(180, 5, 100, 25);
		op.setBounds(144, 5, 100, 25);
		is.setBounds(300, 5, 100, 25);
		ans.setBounds(350, 5, 1000, 25);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);}
		
	public static void main(String[] args) { new Calc(); }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==add) {
			double nn1 = Double.parseDouble(n1.getText()) ;
			double nn2 = Double.parseDouble(n2.getText());
			ans.setText(String.valueOf(nn1+nn2));
			op.setText("+");}
		
		if(e.getSource()==sub) {
			double nn1 = Double.parseDouble(n1.getText()) ;
			double nn2 = Double.parseDouble(n2.getText());
			ans.setText(String.valueOf(nn1-nn2));
			op.setText("-");}
		
		if(e.getSource()==mul) {
			double nn1 = Double.parseDouble(n1.getText()) ;
			double nn2 = Double.parseDouble(n2.getText());
			ans.setText(String.valueOf(nn1*nn2));
			op.setText("�");}
		
		if(e.getSource()==div) {
			double nn1 = Double.parseDouble(n1.getText()) ;
			double nn2 = Double.parseDouble(n2.getText());
			ans.setText(String.valueOf(nn1/nn2));
			op.setText("�");}
	}
}