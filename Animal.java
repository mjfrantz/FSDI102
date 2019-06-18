public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void attack(String n) {
        System.out.println(this.name + " attacks " + n);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}