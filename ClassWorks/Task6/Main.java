package program;

public class Main {

    public void sortEnemy (SuperHero superhero[]) {
        for (int i = superhero.length - 1; i > 0; i--){
            for (int j= 0; j < i; j++){
                if (superhero[i].numOfEnemy > superhero[i+1].numOfEnemy) {
                    SuperHero temp = superhero[j];
                    superhero[j] = superhero[j+1];
                    superhero[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        SuperHero superHeroes[] = new SuperHero[6];
        superHeroes[0] = new Mutants(6, "A");
        superHeroes[1] = new Mutants(8, "B");
        superHeroes[2] = new Mutants(1, "C");
        superHeroes[3] = new Humans(6, "g");
        superHeroes[4] = new Humans(75, "s");
        superHeroes[5] = new Humans(52, "k");

        SuperHero.sortEnemy(superHeroes);

        for (int i = 0; i < superHeroes.length; i++) {
            System.out.println(superHeroes[i]);
        }
    }
}
