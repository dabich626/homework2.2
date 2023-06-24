import javax.print.PrintService;

public class Hogwarts {

    private String name;

    private int magicPower;

    private int transgressionLimit;

    public Hogwarts (String name, int magicPower, int transgressionLimit) {

        this.magicPower = magicPower;
        this.name = name;
        this.transgressionLimit = transgressionLimit;
    }

    public String getName() {

        return name;
    }

    public int getMagicPower(){

        return magicPower;
    }

    public int getTransgressionLimit(){

        return transgressionLimit;
    }




    }






