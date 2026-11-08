package Tutorial14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimeApp extends JFrame {
    JTextField numberField;
    JButton checkButton;
    JLabel answerField;
    JButton clearButton;

    public PrimeApp() {
        setTitle("Prime Number Checker");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        topPanel.add(new JLabel("Enter a number: "));

        numberField = new JTextField(10);
        topPanel.add(numberField);

        checkButton = new JButton("Check");
        topPanel.add(checkButton);

        add(topPanel, BorderLayout.NORTH);

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        answerField = new JLabel("");
        bottomPanel.add(answerField);

        clearButton = new JButton("Clear");
        bottomPanel.add(clearButton);

        add(bottomPanel, BorderLayout.CENTER);

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkPrime();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberField.setText("");
                answerField.setText("");
                numberField.requestFocus();
            }
        });
    }

    public void checkPrime() {
        String inputStr = numberField.getText().trim();

        if (inputStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a number!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int n = Integer.parseInt(inputStr);

            if (n < 0) {
                answerField.setText("Not Prime!");
                return;
            } else if (n == 0 || n == 1) {
                answerField.setText("Neither prime nor composite!");
                return;
            } else {
                for (int i = 2; i*i <= n; i++) {
                    if (n % i == 0) {
                        answerField.setText("Not Prime!");
                        return;
                    }
                }
            }
            answerField.setText("Prime!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid non-negative integer only!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            numberField.setText("");
            numberField.requestFocus();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PrimeApp().setVisible(true);
            }
        });
    }
}
