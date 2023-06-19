public class slytherin {
    private String name;
    private int cunning = 0;
    private int determination = 0;

    private int ambition = 0;

    private int resourcefulness = 0;

    private int powerWanter = 0;

    public slytherin (String name, int cunning, int determination, int ambition, int resourcefulness, int powerWanter) {

        this.name = name;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.powerWanter = powerWanter;

}

public static String getName(){

    return null;
}

public static int getCunning(){


    return 0;
}

public static int getDetermination() {


    return 0;
}

public static int getAmbition(){


    return 0;
}

public static int getResourcefulness(){


    return 0;
}

public static int getPowerWanter(){


    return 0;
}

public String toString(){

    System.out.println("Имя студента: " + this.name + " характеристики: " + this.cunning + ", " + this.ambition + ", " + this.determination + ", " + this.resourcefulness + ", " + this.powerWanter);

    return null;
}

}
