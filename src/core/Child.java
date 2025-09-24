package core;

public class Child extends Character implements Student{
    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    public String quotes() {
        return "I don't wanna go to school";
    }

    @Override
    public void study(String subject) {
        System.out.println(getName() + " is studying " + subject);
    }
}
