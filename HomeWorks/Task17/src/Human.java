public class Human {
    private String name = null;
    private int age = 0;

    public Human (String name, int age) {
        this.name = name;
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setAge (int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }

    public String toString() {
        return name + ' ' + age;
    }
}
