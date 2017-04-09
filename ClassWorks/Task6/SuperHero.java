package program;

public abstract class SuperHero {
    protected int numOfEnemy = 0;
    protected String name;

    public SuperHero (int numOfEnemy,  String name) {
        this.numOfEnemy = numOfEnemy;
        this.name =  name;
    }

    public int getNumOfEnemy() {
        return numOfEnemy;
    }

    public String getName() {
        return name;
    }

}
