package ExamPrep;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> animals = new Vector<>();
        animals.add("Dog"); animals.add("Cat"); animals.add("Rabbit");

        System.out.print("Vector (using get()): ");
        for (int i = 0; i < animals.size(); i++) {
            System.out.print(animals.get(i) + "\t");
        } System.out.println();

        Iterator<String> iterator = animals.iterator();
        System.out.print("Vector (using iterator): ");
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        } System.out.println();
    }
}
