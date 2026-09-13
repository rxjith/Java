package Practice;

import javax.swing.*;
import java.awt.*;

public class BasicSwingApp {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Swing basics example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setLayout(new BorderLayout());
		
		JLabel headerLabel = new JLabel("Welcome to Java Swing!", SwingConstants.CENTER);
		
		JPanel formPanel = new JPanel(new FlowLayout());
		JLabel inputLabel = new JLabel("Enter name: ");
		JTextField textField = new JTextField(15);
		
		JButton submitButton = new JButton("Submit");

		formPanel.add(inputLabel);
		formPanel.add(textField);
		
		frame.add(headerLabel, BorderLayout.NORTH);
		frame.add(formPanel, BorderLayout.CENTER);
		frame.add(submitButton, BorderLayout.SOUTH);
		
		frame.setVisible(true);
	}
}
