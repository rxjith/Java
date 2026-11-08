package Tutorial14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class FibonacciApp extends JFrame {
    private JTextField limitField;
    private JList<String> fibList;
    private JButton generateButton;
    private JButton clearButton;

    public FibonacciApp() {
        // Frame setup
        setTitle("Fibonacci Generator");
        setSize(350, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Top Panel for Input and Generate button
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        topPanel.add(new JLabel("Enter Limit:"));

        limitField = new JTextField(10);
        topPanel.add(limitField);

        generateButton = new JButton("Generate");
        topPanel.add(generateButton);

        add(topPanel, BorderLayout.NORTH);

        // Center Panel for JList inside a ScrollPane
        fibList = new JList<>();
        JScrollPane scrollPane = new JScrollPane(fibList);

        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBorder(BorderFactory.createTitledBorder("Fibonacci Sequence"));
        centerPanel.add(scrollPane, BorderLayout.CENTER);
        add(centerPanel, BorderLayout.CENTER);

        // Bottom Panel for Clear Button
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        clearButton = new JButton("Clear");
        bottomPanel.add(clearButton); // Only add the button!
        add(bottomPanel, BorderLayout.SOUTH);

        // --- Event Handling ---

        // 1. Generate Button Action Listener
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateFibonacci();
            }
        });

        // 2. Clear Button Action Listener
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limitField.setText("");
                fibList.setListData(new Vector<>()); // Clears the list items
                limitField.requestFocus();
            }
        });
    }

    // Logic to calculate Fibonacci numbers up to the given limit using Vector
    private void generateFibonacci() {
        String inputStr = limitField.getText().trim();

        if (inputStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a limit.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int limit = Integer.parseInt(inputStr);

            if (limit < 0) {
                JOptionPane.showMessageDialog(this, "Please enter a non-negative integer.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Vector<String> items = new Vector<>();
            long t1 = 0, t2 = 1;
            int index = 1;

            while (t1 <= limit) {
                items.add("Term " + index + ": " + t1);
                long nextTerm = t1 + t2;
                t1 = t2;
                t2 = nextTerm;
                index++;
            }

            if (items.isEmpty()) {
                items.add("No Fibonacci numbers found within limit 0.");
            }

            // Pass the vector directly to the JList
            fibList.setListData(items);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid number format. Please enter a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
            limitField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FibonacciApp().setVisible(true);
            }
        });
    }
}
