package telran.reflection;

public class Runner extends Sportsman {
    private String speed;

    public Runner(String name, String speed) {
        super(name);
        this.speed = speed;
    }

    @Override
    public void action() {
        System.out.printf("I'm runner, name %s, speed %s", getName(), speed);
    }

}
