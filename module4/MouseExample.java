package module4;
import javax.swing.*;
import java.awt.event.*;

public class MouseExample extends JFrame implements MouseListener {
	MouseExample() {
		addMouseListener(this);
		
		setSize(300, 300);
		setTitle("Mouse Event Demo");
		setVisible(true);
	}
	
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse Clicked!");
		System.out.println("X Position: " + e.getX());
		System.out.println("Y Position: " + e.getY());
	}
	
	public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
        System.out.println("X Position = " + e.getX());
        System.out.println("Y Position = " + e.getY());
    }
	
	public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
        System.out.println("X Position = " + e.getX());
        System.out.println("Y Position = " + e.getY());
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
    }

    public static void main(String args[]) {
        new MouseExample();
    }
}
