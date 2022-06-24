public class FormeGeometricheMain {
    public static void main(String[] args) {
        // Test Quadrato
        Quadrato quadrato = new Quadrato(5);
        System.out.println(quadrato);
        System.out.println("Area quadrato: " + quadrato.getArea());
        System.out.println("Perimetro quadrato: " + quadrato.getPerimeter() + "\n");

        // Test Rettangolo
        Rettangolo rettangolo = new Rettangolo(5,6);
        System.out.println(rettangolo);
        System.out.println("Area rettangolo: " + rettangolo.getArea());
        System.out.println("Perimetro rettangolo: " + rettangolo.getPerimeter());
    }
}
