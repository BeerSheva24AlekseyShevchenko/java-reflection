package telran.reflection;

public abstract class Sportsman {
    private String name;

    abstract void action();

    protected Sportsman(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
