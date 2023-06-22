public class Griffindor extends Hogwarts {


    private int nobility = 0;

    private int honor = 0;

    private int brave = 0;

    public Griffindor(String name, int nobility, int honor, int brave){

        super(name);
        this.nobility = nobility;
        this.honor = honor;
        this.brave = brave;

    }


    public  int getNobility(){

        return nobility;
    }

    public int getHonor(){

        return honor;
    }

    public int getBrave(){

        return brave;
    }

    public String toString(){

        System.out.println("Имя студента: " + " характеристики: " + this.nobility + ", " + this.honor + ", " + this.brave);

        return null;
    }

}
