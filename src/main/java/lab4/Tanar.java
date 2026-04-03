package lab4;

public class Tanar{
    private String name;
    private int age;
    private String address;

    public Tanar(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ") - " + address;
    }
}
