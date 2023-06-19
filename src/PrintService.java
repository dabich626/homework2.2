public class PrintService {

    public void print(griffindor[] students){

        System.out.println("имя ученика" + griffindor.getName() + " характеристики: " + griffindor.getNobility() + ", " + griffindor.getHonor() + ", " + griffindor.getBrave());

        }

    public void print(slytherin[] students){

        System.out.println("имя ученика" + slytherin.getName() + " характеристики: " + slytherin.getCunning() + ", " + slytherin.getAmbition() + ", " + slytherin.getDetermination() + ", " + slytherin.getResourcefulness() +  ", " + slytherin.getPowerWanter());

    }

    public void print(hufflpuff[] students){

        System.out.println("имя ученика" +   " характеристики: " + hufflpuff.getName() + ", " + hufflpuff.getIndustriousness() + ", " + hufflpuff.getHonesty() + ", " + hufflpuff.getLoyalty());

    }

    public void print(ravenclaw[] students){

        System.out.println("имя ученика" + ravenclaw.getName() + " характеристики: " + ravenclaw.getMind() + ", " + ravenclaw.getWisdom() + ", " + ravenclaw.getCreative());

    }
    }

