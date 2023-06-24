public class Ravenclaw extends Hogwarts {

    private int mind = 0;

    private int wisdom = 0;

    private int creative = 0;

    public Ravenclaw (String name, int mind, int wisdom, int creative, int magicPower, int transressionLiMit){

        super(name, magicPower,transressionLiMit);
        this.mind = mind;
        this.wisdom = wisdom;
        this.creative = creative;

    }

    public int getMind(){

        return mind;
    }

    public int getWisdom(){

        return wisdom;
    }

    public int getCreative(){

        return creative;
    }

    public String toString(){

        System.out.println("Имя студента: " + this.name + " характеристики: " + this.mind + ", " + this.wisdom + ", " + this.creative);

        return null;
    }
}
