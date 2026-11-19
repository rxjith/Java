package ExamPrep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingWordCharVowelConsonantCounter extends JFrame implements ActionListener {
    private JTextArea inputArea;
    private JButton analyzeButton, clearButton;
    private JLabel resultLabel;

    public SwingWordCharVowelConsonantCounter() {
        setTitle("String Analyzer");
        setSize(420, 260);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        inputArea = new JTextArea(5, 25);
        inputArea.setLineWrap(true);
        inputArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(inputArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new BorderLayout());

        JPanel buttonPanel = new JPanel(new FlowLayout());
        analyzeButton = new JButton("Analyze");
        clearButton = new JButton("Clear");
        buttonPanel.add(analyzeButton);
        buttonPanel.add(clearButton);

        resultLabel = new JLabel("Words: 0 | Characters: 0 | Vowels: 0 | Consonants: 0");

        bottomPanel.add(buttonPanel, BorderLayout.NORTH);
        bottomPanel.add(resultLabel, BorderLayout.SOUTH);
        add(bottomPanel, BorderLayout.SOUTH);

        analyzeButton.addActionListener(this);
        clearButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == analyzeButton) {
            analyzeText();
        } else if (src == clearButton) {
            inputArea.setText("");
            resultLabel.setText("Words: 0 | Characters: 0 | Vowels: 0 | Consonants: 0");
            inputArea.requestFocus();
        }
    }

    private void analyzeText() {
        String text = inputArea.getText();
        String trimmed = text.trim();

        if (trimmed.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter some text.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Count words by splitting on one or more whitespace characters
        String[] words = trimmed.split("\\s+");
        int wordCount = words.length;

        // Count total characters in the entered text
        int charCount = text.length();

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        resultLabel.setText(
            "Words: " + wordCount +
            " | Characters: " + charCount +
            " | Vowels: " + vowelCount +
            " | Consonants: " + consonantCount
        );
    }

    public static void main(String[] args) {
        new SwingWordCharVowelConsonantCounter().setVisible(true);
    }
}
