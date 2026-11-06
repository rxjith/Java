package Tutorial10;

import Tutorial10.pack1.Man;
import Tutorial10.pack2.Woman;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Smith", 40);
        Woman woman = new Woman("Jane", 35);

        man.displayMe();
        woman.displayMe();
        System.out.println();
    }
}
