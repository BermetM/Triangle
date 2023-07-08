public class Triangle {

    double a;
    double b;
    double c;

    public double area(double a, double b, double c) {
        double san = (a + b + c) / 2;
        double san1 = san * (san - a) * (san - b) * (san - c);
        return Math.sqrt(san1);
    }
}