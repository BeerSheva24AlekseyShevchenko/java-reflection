package telran.reflection;

public class Footballer extends Sportsman {
    private String team;

    public Footballer(String name, String team) {
        super(name);
        this.team = team;
    }

    @Override
    public void action() {
        System.out.printf("I'm footballer, name %s, team %s", getName(), team);
    }

}
