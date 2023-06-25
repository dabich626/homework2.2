import java.util.Objects;

public class Slytherin extends Hogwarts {
    private int cunning = 0;
    private int determination = 0;

    private int ambition = 0;

    private int resourcefulness = 0;

    private int powerWanter = 0;

    public Slytherin(String name, int cunning, int determination, int ambition, int resourcefulness, int powerWanter, int magicPower, int transressionLiMit) {

        super(name, magicPower, transressionLiMit);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.powerWanter = powerWanter;

    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getPowerWanter() {
        return powerWanter;
    }

    public void setPowerWanter(int powerWanter) {
        this.powerWanter = powerWanter;
    }

    public String toString() {

        System.out.println("Имя студента: " + " характеристики: " + this.cunning + ", " + this.ambition + ", " + this.determination + ", " + this.resourcefulness + ", " + this.powerWanter);

        return null;
    }

    public void compare(Slytherin s) {

        int sum = cunning + determination + ambition + resourcefulness + powerWanter;
        int sSum = s.cunning + s.ambition + s.determination + s.resourcefulness + s.powerWanter;

        if (sum > sSum) {

            System.out.println(getName()) + " обладает большим колличеством очков по качества факултета, чем " + s.getName())
            ;

        } else {

            System.out.println(getName()) + " обладает меньшим колличеством очков по качества факултета, чем " + s.getName())
            ;
        }
    }


    public boolean equals(Object s) {

        super.equals(Object s);
        if (this == s) return true;
        if (!(s instanceof Slytherin)) return false;
        Slytherin slytherin = (Slytherin) s;
        return getCunning() == slytherin.getCunning() && getDetermination() == slytherin.getDetermination() && getAmbition() == slytherin.getAmbition() && resourcefulness == slytherin.resourcefulness && powerWanter == slytherin.powerWanter;
    }


    public int hashCode() {
        super.hashCode();
        return Objects.hash(getCunning(), getDetermination(), getAmbition(), resourcefulness, powerWanter);
    }
}
