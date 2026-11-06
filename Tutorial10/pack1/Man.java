package Tutorial10.pack1;

public class Man {
    public String name;
    public int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayMe() {
        System.out.print("Man's Name: " + name + ", Age: " + age);
    }
}
