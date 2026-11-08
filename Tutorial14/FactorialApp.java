package Tutorial14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialApp extends JFrame {
    JTextField numberField;
    JButton calculateButton;
    JLabel answerField;
    JButton clearButton;

    public FactorialApp() {
        setTitle("Factorial Calculator");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        topPanel.add(new JLabel("Enter a number: "));

        numberField = new JTextField(10);
        topPanel.add(numberField);

        calculateButton = new JButton("Calculate");
        topPanel.add(calculateButton);

        add(topPanel, BorderLayout.NORTH);

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        answerField = new JLabel("");
        bottomPanel.add(answerField);

        clearButton = new JButton("Clear");
        bottomPanel.add(clearButton);

        add(bottomPanel, BorderLayout.CENTER);

        calculateButton.addActionListener(new ActionListener() {
           @Override
          public void actionPerformed(ActionEvent e) {
              calculateFactorial();
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

    public void calculateFactorial() {
        String inputStr = numberField.getText().trim();

        if (inputStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a number!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int n = Integer.parseInt(inputStr);

            if (n < 0) {
                JOptionPane.showMessageDialog(this, "Please enter a non-negative integer!", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                numberField.setText("");
                return;
            }

            long f = 1, i = 1;

            while (i <= n) {
                f = f * i;
                i++;
            }

            answerField.setText(Long.toString(f, 10));
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
                new FactorialApp().setVisible(true);
            }
        });
    }
}
