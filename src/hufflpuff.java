public class hufflpuff {

    private String name;

    private int industriousness = 0;

    private int loyalty = 0;

    private int honesty = 0;

    public hufflpuff (String name, int industriousness, int loyalty, int honesty) {

        this.name = name;
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;

    }

    public static String getName (){

        return null;
    }

    public static int getIndustriousness(){

        return 0;
    }

    public static int getLoyalty(){

        return 0;
    }

    public static int getHonesty(){

        return 0;
    }

    public String toString(){

        System.out.println("Имя студента: " + this.name + " характеристики: " + this.industriousness + ", " + this.loyalty + ", " + this.honesty);

        return null;
    }
}
