public class Main {

    public static void main(String[] args) {
       
        Punto p = new Punto(-1, 1);
        // 0,0
        System.out.printf("Punto: {%f, %f}\n", p.x(), p.y());
        // 1*sqrt(2)
        System.out.println("Radio Polar: " + p.radio());
        // -45
        System.out.println("Angulo Polar: " + Math.toDegrees(p.angulo()));
        // 2
        System.out.println("Angulo Polar: " + p.distancia(new Punto(1, 1)));

        System.out.println();

        Fecha f1 = new Fecha(1, 8, 2017);
        Fecha f2 = new Fecha(2, 5, 2016);
        System.out.println(f1);
        System.out.println(f2);
        // 1
        System.out.println(f1.comparar(f2));
    }

}