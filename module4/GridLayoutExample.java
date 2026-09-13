package module4;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("GridLayout Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 200);
		
		LayoutManager grid = new GridLayout(3, 2, 10, 10);
		
		JPanel panel = new JPanel();
		panel.setLayout(grid);
		
		panel.add(new JLabel("Username:"));
		panel.add(new JTextField());
		panel.add(new JLabel("Password:"));
		panel.add(new JPasswordField());
		panel.add(new JButton("Reset"));
		panel.add(new JButton("Login"));
		
		frame.add(panel);
		frame.setVisible(true);

	}

}
