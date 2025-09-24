package core;

public class Drew extends Child {

    public Drew(){
        super("Drew", 11);
    }

    @Override
    public String quotes(){
        // "Wasn’t me"
        return "Nao foi eu";
    }
}
