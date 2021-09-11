public abstract class Healer implements Mover {
    protected String name;
    public String secondName;
    protected int hp;

    @Override
    public void move() {
        System.out.println("Ella is moving");
    }

    public Healer(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public abstract void doNothing();

    public void healing(String name) {
        System.out.println("I am healing " + name);
    }

    public Healer(String name, String secondName, int hp) {
        this.name = name;
        this.secondName = secondName;
        this.hp = hp;
    }

    public void healing(String name, String secondName) {
        System.out.println("I am heling " + name + " and " + secondName);
    }


    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

}

