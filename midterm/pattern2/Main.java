package midterm.pattern2;

public class Main{
    public static void main (String... args){
        System.out.println("Sendind soldiers...\n");

        Soldier soldier1 = new Soldier("Soldier1");
        soldier1.getName();
        soldier1.setMoveBehaviour(new MoveWithHorseRiding());
        soldier1.setAttackBehaviour(new AttackWithGun());

        System.out.println("\n");
        
        Soldier soldier2 = new Soldier("Soldier2");
        soldier2.getName();
        soldier1.setMoveBehaviour(new MoveWithWalking());
        soldier2.setAttackBehaviour(new AttackWithKnife());
    }
}
