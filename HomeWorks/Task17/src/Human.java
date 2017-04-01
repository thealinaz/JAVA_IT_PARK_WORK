public class Human {
    private String name;
    private int age;

    public Human (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName (String name) {
        this.name = name;
    }
    public void setAge (int age) {
        this.age = age;
    }

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }

    public void sortBubble (int human[]){
        for (int i = human.length - 1 ; i > 0; i++) {
            for (int j = 0; j < i; j++)
                if (human[j] > human[j+1]){
                    int temp = human[j];
                    human[j] = human[j+1];
                    human[j+1] = temp;
                }
        }
    }

}
