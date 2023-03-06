package selfEd.RPG;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        BaseHero war = new Warrior();
        BaseHero archer = new Archer();
        BaseHero.duel(war, archer);
        
    }

}
