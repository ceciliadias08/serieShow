package core;

public abstract class Character {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Character(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract String quotes();
}
