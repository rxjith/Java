package module4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginChecker extends JFrame implements ActionListener {
	
	JLabel username, password, output;
	JTextField user;
	JPasswordField pass;
	JButton login, reset;
	
	LoginChecker() {
		super("Login Checker");
		JPanel p = new JPanel();
		LayoutManager g = new GridLayout(4,2);
		p.setLayout(g);
		
		username = new JLabel("Username:");
		password = new JLabel("Password:");
		
		user = new JTextField();
		pass = new JPasswordField();
		
		login = new JButton("Login");
		reset = new JButton("Reset");
		
		output = new JLabel();
		
		p.add(username); p.add(user);
		p.add(password); p.add(pass); 
		p.add(login); p.add(reset);
		login.addActionListener(this); reset.addActionListener(this);
		p.add(output); p.add(new JLabel());
		add(p);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 300);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String enteredUsername = user.getText();
		String enteredPassword = new String(pass.getPassword());
		
		if (e.getSource() == login) {
			if (enteredUsername.equals("admin") && enteredPassword.equals("admin123")) {
				output.setText("Welcome " + enteredUsername + "!");
			} else {
				output.setText("Invalid user!");
			}
		} else {
			user.setText(null);
			pass.setText("");
			output.setText(null);
		}
	}
	
	public static void main(String[] args) {
		new LoginChecker();
	}

}
