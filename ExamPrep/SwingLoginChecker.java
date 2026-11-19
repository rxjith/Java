package ExamPrep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingLoginChecker extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton, clearButton;
    private JLabel statusLabel;

    private final String validUser = "admin";
    private final String validPass = "1234";

    public SwingLoginChecker() {
        setTitle("Login Checker");
        setSize(320, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new GridLayout(2, 2));
        formPanel.add(new JLabel("Username:"));
        usernameField = new JTextField(15);
        formPanel.add(usernameField);

        formPanel.add(new JLabel("Password:"));
        passwordField = new JPasswordField(15);
        formPanel.add(passwordField);

        add(formPanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new FlowLayout());
        loginButton = new JButton("Login");
        clearButton = new JButton("Clear");
        statusLabel = new JLabel("");

        bottomPanel.add(loginButton);
        bottomPanel.add(clearButton);
        bottomPanel.add(statusLabel);

        add(bottomPanel, BorderLayout.SOUTH);

        loginButton.addActionListener(this);
        clearButton.addActionListener(this);
        passwordField.addActionListener(this);

        // setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == loginButton || src == passwordField) {
            checkLogin();
        } else if (src == clearButton) {
            usernameField.setText("");
            passwordField.setText("");
            statusLabel.setText("");
            usernameField.requestFocus();
        }
    }

    private void checkLogin() {
        String user = usernameField.getText().trim();
        String pass = new String(passwordField.getPassword());

        if (user.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter both username and password.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (user.equals(validUser) && pass.equals(validPass)) {
            statusLabel.setText("Login successful");
            JOptionPane.showMessageDialog(this, "Welcome, " + user);
        } else {
            statusLabel.setText("Invalid credentials");
            passwordField.setText("");
            passwordField.requestFocus();
        }
    }

    public static void main(String[] args) {
        // SwingUtilities.invokeLater(() -> new SwingLoginChecker().setVisible(true));
        new SwingLoginChecker().setVisible(true);
    }
}
