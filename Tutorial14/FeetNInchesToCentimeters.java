package Tutorial14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FeetNInchesToCentimeters extends JFrame {
    JTextField feetField;
    JTextField inchesField;
    JButton calculateButton;
    JLabel answerField;
    JButton clearButton;

    public FeetNInchesToCentimeters() {
        setTitle("Factorial Calculator");
        setSize(650, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 20));

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        topPanel.add(new JLabel("Feet: "));
        feetField = new JTextField("0", 10);
        topPanel.add(feetField);

        topPanel.add(new JLabel("Inches: "));
        inchesField = new JTextField("0", 10);
        topPanel.add(inchesField);

        calculateButton = new JButton("Calculate");
        topPanel.add(calculateButton);

        add(topPanel, BorderLayout.NORTH);

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        answerField = new JLabel("0cm");
        bottomPanel.add(answerField);

        clearButton = new JButton("Clear");
        bottomPanel.add(clearButton);

        add(bottomPanel, BorderLayout.CENTER);

        calculateButton.addActionListener(new ActionListener() {
           @Override
          public void actionPerformed(ActionEvent e) {
              calculate();
          }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                feetField.setText("0");
                inchesField.setText("0");
                answerField.setText("0cm");
                feetField.requestFocus();
            }
        });
    }

    public void calculate() {
        String feetStr = feetField.getText().trim();
        String inchesStr = inchesField.getText().trim();

        if (feetStr.isEmpty() || inchesStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter 0 or some non-negative value in BOTH cells\n", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            double feet = Double.parseDouble(feetStr), inches = Double.parseDouble(inchesStr);

            double result = 0.0;
            if (feet == 0 && inches == 0) result = 0;
            else if (feet == 0 && inches > 0) result = (inches * 2.54);
            else if (feet > 0 && inches == 0) result = (feet * 30.48);
            else result = (feet * 30.48) + (inches * 2.54);

            answerField.setText(Double.toString(result));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            feetField.setText("0");
            inchesField.setText("0");
            answerField.setText("0cm");
        }


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FeetNInchesToCentimeters().setVisible(true);
            }
        });
    }
}
