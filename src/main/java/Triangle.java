public class Triangle {
    public static void main(String[] args) {
        double sideA = 5.6;
        double sideB = 7.4;
        double sideC = 9.2;
        double S = (sideA+sideB+sideC)/2;
        double area = Math.sqrt(S*(S-sideA)*(S-sideB)*(S-sideC));

        System.out.println("Triangle area = " + area);
    }
}
