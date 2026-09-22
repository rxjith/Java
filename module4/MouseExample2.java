package module4;
import javax.swing.*;
import java.awt.event.*;

public class MouseExample2 extends JFrame implements MouseListener {
 JLabel label;

    public MouseExample2() {

        label = new JLabel("Move or click the mouse");

        add(label);

        addMouseListener(this); // link the frame with MouseListener

        setSize(300, 300);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked: X = " + e.getX() + 
                      ", Y = " + e.getY());
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered: X = " + e.getX() + 
                      ", Y = " + e.getY());
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited: X = " + e.getX() + 
                      ", Y = " + e.getY());
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed: X = " + e.getX() + 
                      ", Y = " + e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released: X = " + e.getX() + 
                      ", Y = " + e.getY());
    }

    public static void main(String args[]) {
        new MouseExample2();
    }
}