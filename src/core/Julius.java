package core;

public class Julius extends Adult{

    public Julius() {
        super("Julius", 40);
    }

    @Override
    public String quotes() {
        return "This cost 32 cents";
    }

    public double calculateAmount(double value) {
        double total = Math.max(0, value * 0.90); // fixed didactic rule (without Strategy)
        System.out.println("Julius calculated fixed savings: of $" + value + " per $" + total);
        return total;
    }
}
