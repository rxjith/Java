package module4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {

	JTextField op1, op2;
	JButton addButton, subtractButton;
	JLabel operand1, operand2, result, resultField;
	
	SimpleCalculator() {
		setTitle("Simple Calculator Program");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200);
		
		LayoutManager g = new GridLayout(4, 2, 5, 5);
		
		JPanel p = new JPanel();
		p.setLayout(g);
		
		operand1 = new JLabel("Operand 1");
		operand2 = new JLabel("Operand 2");
		result = new JLabel("Result");
		
		addButton = new JButton("Add");
		subtractButton = new JButton("Subtract");
		
		addButton.addActionListener(this);
		subtractButton.addActionListener(this);
		
		op1 = new JTextField(10);
		op2 = new JTextField(10);
		resultField = new JLabel("0");
		
		p.add(operand1);
		p.add(op1);
		p.add(operand2);
		p.add(op2);
		p.add(addButton);
		p.add(subtractButton);
		p.add(result);
		p.add(resultField);
		
		add(p);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			double n1 = Double.parseDouble(op1.getText());
			double n2 = Double.parseDouble(op2.getText());
			double res = 0;
			
			if (e.getSource() == addButton) {
				res = n1 + n2;
			} else if (e.getSource() == subtractButton) {
				res = n1 - n2;
			}
			
			resultField.setText(String.valueOf(res));
		} catch (NumberFormatException ex) {
			resultField.setText("Invalid Input");
		}
	}
	
	public static void main(String[] args) {
		new SimpleCalculator();
	}

}
