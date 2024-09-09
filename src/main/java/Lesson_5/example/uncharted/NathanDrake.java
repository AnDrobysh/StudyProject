package Lesson_5.example.uncharted;

//Создадим классы NathanDrake и Enemy, которые наследуют от класса Character и реализуют свои собственные версии методов attack и move.

class NathanDrake extends Lesson_5.example.uncharted.Character {
    public NathanDrake() {
        super("Nathan Drake");
    }

    @Override
    public void attack() {
        System.out.println(name + " shoots with his pistol.");
    }

    @Override
    public void move() {
        System.out.println(name + " runs swiftly across the terrain.");
    }
}

