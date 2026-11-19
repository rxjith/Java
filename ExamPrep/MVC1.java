package ExamPrep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CounterModel {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }
}

class CounterView extends JFrame {
    JButton button = new JButton("Click Me!");
    JLabel label = new JLabel("Count: 0");

    public CounterView() {
        setTitle("MVC Counter Example 1");
        setLayout(new FlowLayout());
        add(button); add(label);
        setSize(300, 150);
        setVisible(true);
    }

    public void setLabelText(String text) {
        label.setText(text);
    }
}

class CounterController {
    public CounterController(CounterModel model, CounterView view) {
        view.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.increment();
                view.setLabelText("Count: " + model.getCount());
            }
        });
    }
}

public class MVC1 {
    public static void main(String[] args) {
        CounterModel model = new CounterModel();
        CounterView view = new CounterView();
        new CounterController(model, view);
    }
}
