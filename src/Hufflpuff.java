public class Hufflpuff extends Hogwarts {


    private int industriousness = 0;

    private int loyalty = 0;

    private int honesty = 0;

    public Hufflpuff (String name, int industriousness, int loyalty, int honesty) {

        super(name);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;

    }

    public int getIndustriousness(){

        return industriousness;
    }

    public int getLoyalty(){

        return loyalty;
    }

    public int getHonesty(){

        return honesty;
    }

    public String toString(){

        System.out.println("Имя студента: " + this.name + " характеристики: " + this.industriousness + ", " + this.loyalty + ", " + this.honesty);

        return null;
    }
}
