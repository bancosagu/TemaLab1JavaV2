
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello \n" +
                "Augustin");

        System.out.println("Avem doua numere intregi, si anume 100 si 31");
        int resultSum = sum (100, 31);
        System.out.println("Rezultatul adunarii celor doua numere este " + resultSum + "\n");

        double resultDivide = divide(100, 31);
        System.out.println("Rezultatul impartirii celor doua numere este " + resultDivide + "\n");

        int resultPctA = pctA(-5, 8, 6);
        System.out.println("a.  -5 + 8 * 6 = "+ resultPctA + "\n");

        float resultPctB = pctB(55, 9);
        System.out.println("b.  (55 + 9) % 9 = " + resultPctB + "\n");

        float resultPctC = pctC(20, -3, 5, 8);
        System.out.println("c.  20 + -3 * 5 / 8 = " +  resultPctC + "\n");

        int resultPctD = pctD(5, 15, 3, 2, 8);
        System.out.println("d.  5 + 15 / 3 * 2 - 8 % 3 = " + resultPctD + "\n");

    }

    public static int sum(int a, int b){
        int resultSum = a + b;
        return resultSum;

    }

    public static double divide(double a, double b){
        double resultDivide = a / b;
        return resultDivide;

    }

    public static int pctA(int a, int b, int c){
        int resultPctA = a + b * c;
        return resultPctA;

    }

    public static float pctB(float a, float b) {
        float resultPctB = (a + b) / b;
        return resultPctB;

    }

    public static float pctC(float a, float b, float c, float d){
        float resultPctC = a + b * c / d;
        return resultPctC;

    }

    public static int pctD(int a, int b, int c, int d, int e){
        int resultPctD = a + b / c * d - e % c;
        return resultPctD;
    }
}