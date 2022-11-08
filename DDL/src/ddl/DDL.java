package ddl;

public class DDL {

    public static double hengerTerfogat(double r, double m) {
        return (Math.pow(r, 2) * Math.PI * m);
    }

    public static double hengerFelszin(double r, double m) {
        return (2 * Math.pow(r, 2) * Math.PI + 2 * r * Math.PI * m);
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
