import javax.print.PrintService;
import java.util.Objects;

public class Hogwarts {

    private String name;

    private int magicPower;

    private int transgressionLimit;

    public Hogwarts(String name, int magicPower, int transgressionLimit) {

        this.magicPower = magicPower;
        this.name = name;
        this.transgressionLimit = transgressionLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionLimit() {
        return transgressionLimit;
    }

    public void setTransgressionLimit(int transgressionLimit) {
        this.transgressionLimit = transgressionLimit;
    }

    @Override
    public boolean equals(Object s) {
        if (this == s) return true;
        if (!(s instanceof Hogwarts)) return false;
        Hogwarts hogwarts = (Hogwarts) s;
        return getMagicPower() == hogwarts.getMagicPower() && getTransgressionLimit() == hogwarts.getTransgressionLimit() && Objects.equals(getName(), hogwarts.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMagicPower(), getTransgressionLimit());
    }

    public static void compare(Hogwarts s) {
        if (this.getMagicPower() > s.magicPower) {

            System.out.println(this.name + " обладает большей силой магии, чем " + s.name);
        } else {

            System.out.println(this.name + " обладает меньшей силой магии, чем " + s.name);
        }

        if (this.getTransgressionLimit() > s.transgressionLimit) {

            System.out.println(this.name + " трансгрессирует дальше чем " + s.name);

        } else {

            System.out.println(this.name + " трансгрессирует на более короткие дистанции, чем " + s.name);
        }
    }
}
}






