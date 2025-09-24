package core;

public class Adult extends Character implements Workable{
    public Adult(String name, int age){
        super(name, age);
    }

    @Override
    public String quotes(){
        return "I don't wanna work";
    }

    @Override
    public void work(String activities, int hours) {
        System.out.println(getName() + " is working " + activities + " for " + hours + " hours.");
    }
}
