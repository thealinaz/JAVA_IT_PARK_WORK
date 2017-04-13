public class Human {
    private String name = null;
    private int age = 0;

    public Human (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setAge (int age) {
        if (age > 0) this.age = age;
        else System.out.println("Age must be more than 0!");
    }

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }

    public String toString() {
        return getName() + " " + getAge();
    }
}
