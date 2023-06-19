public class griffindor {

    private String name;

    private int nobility = 0;

    private int honor = 0;

    private int brave = 0;

    public griffindor(String name, int nobility, int honor, int brave){

        this.name = name;
        this.nobility = nobility;
        this.honor = honor;
        this.brave = brave;

    }

    public static String getName(){


        return null;
    }

    public static int getNobility(){

        return 0;
    }

    public static int getHonor(){

        return 0;
    }

    public static int getBrave(){

        return 0;
    }

    public String toString(){

        System.out.println("Имя студента: " + this.name + " характеристики: " + this.nobility + ", " + this.honor + ", " + this.brave);

        return null;
    }

}
