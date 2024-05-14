package MathInterpolation;

public class AntiDifferencing {
    public static void main(String[] args) {
        printIntegralTable(5);
    }

    static void printIntegralTable(int maxDegree) {
        System.out.print("\nm\t\tIntegral\n");
        for (int m = 0; m <= maxDegree; m++) {
            System.out.print(m + "\t\t");
            if (m == 1) {
                System.out.print("∫ x dx = (1/2)x^2 + C\n");
            } else if (m == 0) {
                System.out.print("∫ 1 dx = x + C\n");
            } else if (m > 1) {
                System.out.print("∫ x^" + m + " dx = (1/" + (m + 1) + ")x^(" + (m + 1) + ") + C\n");
            }
        }
    }
}