package module4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VelocityConverter extends JFrame implements ActionListener {
	JLabel velocityLabel, answerLabel, velocityAnsLabel;
	JTextField velocityInput;
	JButton converter, reset;
	
	VelocityConverter() {
		super("Velocity Converter Program");
		JPanel p = new JPanel();
		LayoutManager g = new GridLayout(3, 2);
		p.setLayout(g);
		
		velocityLabel = new JLabel("Velocity (in km/h):");
		p.add(velocityLabel);
		
		velocityInput = new JTextField();
		p.add(velocityInput);
		
		converter = new JButton("Convert");
		reset = new JButton("Reset");
		
		p.add(converter); p.add(reset);
		converter.addActionListener(this);
		reset.addActionListener(this);
		
		answerLabel = new JLabel("Velocity (in m/s):");
		p.add(answerLabel);
		
		velocityAnsLabel = new JLabel();
		p.add(velocityAnsLabel);
		
		add(p);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 200);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == converter) {
			try {
				float velocity = Float.parseFloat(velocityInput.getText());
				float result = velocity * (5.0f / 18.0f); 
				velocityAnsLabel.setText(String.format("%.2f m/s", result));
			} catch (NumberFormatException ex) {
				velocityAnsLabel.setText("Please enter a valid number!");
			}
		} else {
			velocityInput.setText(null);
			velocityAnsLabel.setText(null);
		}
	}
	
	public static void main(String[] args) {
		new VelocityConverter();
	}
}
