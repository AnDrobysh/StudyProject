package Lesson_5.example.uncharted;

class Enemy extends Lesson_5.example.uncharted.Character {
    public Enemy(String enemyType) {
        super(enemyType);
    }

    @Override
    public void attack() {
        System.out.println(name + " attacks with a knife.");
    }

    @Override
    public void move() {
        System.out.println(name + " advances cautiously.");
    }
}
