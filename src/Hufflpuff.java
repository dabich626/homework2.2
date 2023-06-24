import java.util.Objects;

public class Hufflpuff extends Hogwarts {


    private int industriousness = 0;

    private int loyalty = 0;

    private int honesty = 0;

    public Hufflpuff (String name, int industriousness, int loyalty, int honesty, int magicPower, int transressionLiMit) {

        super(name, magicPower, transressionLiMit);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;

    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hufflpuff)) return false;
        Hufflpuff hufflpuff = (Hufflpuff) o;
        return getIndustriousness() == hufflpuff.getIndustriousness() && getLoyalty() == hufflpuff.getLoyalty() && getHonesty() == hufflpuff.getHonesty();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIndustriousness(), getLoyalty(), getHonesty());
    }

    public static void compare(Hufflpuff s) {

        int sum = industriousness + loyalty + honesty;
        int sSum = s.industriousness + s.loyalty + s.honesty;
        if (sum>sSum) {

            System.out.println(getName()) + " обладает большим колличеством очков по качества факултета, чем " + s.getName());

        } else {

            System.out.println(getName()) + " обладает меньшим колличеством очков по качества факултета, чем " + s.getName());
        }
    }

    }

