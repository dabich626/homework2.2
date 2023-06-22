public class PrintService {

    public void print(Griffindor[] students){

        System.out.println("имя ученика" + Griffindor.getName() + " характеристики: " + Griffindor.getNobility() + ", " + Griffindor.getHonor() + ", " + Griffindor.getBrave());

        }

    public void print(Slytherin[] students){

        System.out.println("имя ученика" + Slytherin.getName() + " характеристики: " + Slytherin.getCunning() + ", " + Slytherin.getAmbition() + ", " + Slytherin.getDetermination() + ", " + Slytherin.getResourcefulness() +  ", " + Slytherin.getPowerWanter());

    }

    public void print(Hufflpuff[] students){

        System.out.println("имя ученика" +   " характеристики: " + Hufflpuff.getName() + ", " + Hufflpuff.getIndustriousness() + ", " + Hufflpuff.getHonesty() + ", " + Hufflpuff.getLoyalty());

    }

    public void print(Ravenclaw[] students){

        System.out.println("имя ученика" + Ravenclaw.getName() + " характеристики: " + Ravenclaw.getMind() + ", " + Ravenclaw.getWisdom() + ", " + Ravenclaw.getCreative());

    }
    }

