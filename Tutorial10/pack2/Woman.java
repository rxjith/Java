package Tutorial10.pack2;

public class Woman {
    public String name;
    public int age;

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayMe() {
        System.out.print(" Woman's Name: " + name + ", Age: " + age);
    }
}
