package core;

public class Julius extends Adult{

    public Julius() {
        super("Julius", 40);
    }

    @Override
    public String quotes() {
        return "Isso custou 32 centavos";
    }

    public double calcularConta(double valor) {
        double total = Math.max(0, valor * 0.90); // regra fixa didática (sem Strategy)
        System.out.println("Julius calculou economia fixa: de $" + valor + " por $" + total);
        return total;
    }
}
