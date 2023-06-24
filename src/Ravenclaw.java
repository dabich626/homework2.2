import java.util.Objects;

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

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ravenclaw)) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return getMind() == ravenclaw.getMind() && getWisdom() == ravenclaw.getWisdom() && getCreative() == ravenclaw.getCreative();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMind(), getWisdom(), getCreative());
    }

    public static void compare(Ravenclaw s) {

        int sum =  mind + wisdom + creative;
        int sSum = s.mind + s.wisdom + s.creative;

        if (sum>sSum) {

            System.out.println(getName()) + " обладает большим колличеством очков по качества факултета, чем " + s.getName());

        } else {

            System.out.println(getName()) + " обладает меньшим колличеством очков по качества факултета, чем " + s.getName());
        }
    }
}
