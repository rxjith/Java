package ExamPrep;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MVC2 extends JFrame {
    JScrollBar scrollBar;
    JLabel label;

    MVC2() {
        setTitle("MVC Example: ScrollBar Program");
        setLayout(new FlowLayout());
        label = new JLabel("Scroll Value: 0");
        add(label);
        scrollBar = new JScrollBar(JScrollBar.VERTICAL, 0, 1, 0, 100);
        scrollBar.setPreferredSize(new Dimension(50, 200));
        add(scrollBar);
        scrollBar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                int value = scrollBar.getValue();
                label.setText("Scroll Value: " + value);
            }
        });
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MVC2();
    }
}
