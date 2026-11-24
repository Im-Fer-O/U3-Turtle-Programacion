import java.util.Scanner;

public class TurtleEj6 {
    public static void main(String[] args) {

        Turtle turtle = new Turtle(500, 500);

        Scanner teclado = new Scanner(System.in);
        System.out.println("medida del lado?");
        int lado = Integer.parseInt(teclado.nextLine());
        System.out.println("vueltas?");
        int mediaVuelta = Integer.parseInt(teclado.nextLine());
        int vueltas = (mediaVuelta * 2);


        // _______________________________________________

        poligono(turtle, lado, vueltas);


        // _______________________________________________

        turtle.markCursor(Turtle.Color.RED);
        turtle.show();

    } //public static void main


    static double hipotenusa(int lado) { // double es as exacto para calcular hipotenusa
        return ((double) lado) * Math.sqrt(2.0); // calculo longitud hiptenusa
    }

    static void segmento(Turtle turtle, int lado) {
        turtle.forward(lado);
        turtle.turnRight(45);
        turtle.forward((int) Math.round(hipotenusa(lado))); //puede haber una funcion y parametro a la vez?(hipotenusa(lado))
        turtle.turnRight(45);
        turtle.forward(lado);
        turtle.turnRight(45);
        turtle.forward((int) Math.round(hipotenusa(lado)));
        turtle.turnRight(45);
    }

    static void poligono(Turtle turtle, int lado, int vueltas) { // ESTE MANEJA LA DISTANCIA ENTRE POLIGONOS
        for (int i = 0; i < vueltas; i++) {
            segmento(turtle, lado);
            lado = lado + (lado / 8);
        }
    }


} //public class TurtleEj6


