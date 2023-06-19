public class ravenclaw {


    private String name;

    private int mind = 0;

    private int wisdom = 0;

    private int creative = 0;

    public ravenclaw (String name, int mind, int wisdom, int creative){

        this.name = name;
        this.mind = mind;
        this.wisdom = wisdom;
        this.creative = creative;

    }

    public static String getName (){

        return null;
    }

    public static int getMind(){

        return 0;
    }

    public static int getWisdom(){

        return 0;
    }

    public static int getCreative(){

        return 0;
    }

    public String toString(){

        System.out.println("Имя студента: " + this.name + " характеристики: " + this.mind + ", " + this.wisdom + ", " + this.creative);

        return null;
    }
}
