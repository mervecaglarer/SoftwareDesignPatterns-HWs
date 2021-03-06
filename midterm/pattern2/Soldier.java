package midterm.pattern2;

public class Soldier{
    String name;

    AttackBehaviour attackBehaviour;
    MoveBehaviour moveBehaviour;

    public void setAttackBehaviour(AttackBehaviour attackBehaviour) {
        this.attackBehaviour = attackBehaviour;
        attackBehaviour.attack();
    }

    public void setMoveBehaviour(MoveBehaviour moveBehaviour) {
        this.moveBehaviour = moveBehaviour;
        moveBehaviour.move();
    }

    public Soldier(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(name);;
    }
}
