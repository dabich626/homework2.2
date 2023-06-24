public class Slytherin extends Hogwarts {
    private int cunning = 0;
    private int determination = 0;

    private int ambition = 0;

    private int resourcefulness = 0;

    private int powerWanter = 0;

    public Slytherin (String name, int cunning, int determination, int ambition, int resourcefulness, int powerWanter, int magicPower, int transressionLiMit) {

        super(name,magicPower,transressionLiMit);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.powerWanter = powerWanter;

}
}

public int getCunning(){


    return cunning();
}

public  int getDetermination() {


    return determination();
}

public  int getAmbition(){


    return ambition();
}

public static int getResourcefulness(){


    return Resourcefulness;
}

public static int getPowerWanter(){


    return PowerWanter();
}

public String toString(){

    System.out.println("Имя студента: " + " характеристики: " + this.cunning + ", " + this.ambition + ", " + this.determination + ", " + this.resourcefulness + ", " + this.powerWanter);

    return null;
}


}
