import java.util.Objects;

public class Griffindor extends Hogwarts {


    private int nobility = 0;

    private int honor = 0;

    private int brave = 0;

    public Griffindor(String name, int nobility, int honor, int brave, int magicPower, int transressionLiMit){

        super(name,magicPower,transressionLiMit);
        this.nobility = nobility;
        this.honor = honor;
        this.brave = brave;

    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBrave() {
        return brave;
    }

    public void setBrave(int brave) {
        this.brave = brave;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Griffindor)) return false;
        Griffindor that = (Griffindor) o;
        return getNobility() == that.getNobility() && getHonor() == that.getHonor() && getBrave() == that.getBrave();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNobility(), getHonor(), getBrave());
    }

    public static void compare(Griffindor s) {

        int sum = nobility + honor + brave;
        int sSum = s.nobility + s.honor + s.brave;

        if (sum>sSum) {

            System.out.println(getName()) + " обладает большим колличеством очков по качества факултета, чем " + s.getName());

        } else {

            System.out.println(getName()) + " обладает меньшим колличеством очков по качества факултета, чем " + s.getName());
        }
    }

}
