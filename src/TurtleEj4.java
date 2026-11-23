import java.util.Scanner;

public class TurtleEj4 {
    public static void main(String[] args) {
        Turtle turtle = new Turtle(500, 500);
        Scanner teclado = new Scanner(System.in);

        System.out.println("longitud hoja?");
        int longitudHoja = Integer.parseInt(teclado.nextLine());
        System.out.println("cantidad de hojas?");
        int cantidadHojas = Integer.parseInt(teclado.nextLine());

        //______________ centrado  ____________________
        turtle.turnLeft(180);
        turtle.setPenDown(false);
        turtle.forward(longitudHoja * 4);
        turtle.turnLeft(180);
        turtle.setPenDown(true);

        //______________ arbol  _____________________
        turtle.forward(longitudHoja); // <- tronco
        numHojas(turtle, longitudHoja, cantidadHojas);
        turtle.turnRight(45);
        turtle.forward(longitudHoja / 3);

        turtle.turnRight(90); // <- giro de la punta del pino

        turtle.forward(longitudHoja / 3);
        turtle.turnRight(45);

        numHojasInvertidas(turtle, longitudHoja, cantidadHojas);
        turtle.forward(longitudHoja); // <- tronco

        // turtle.markCursor(Turtle.Color.BLUE);
        turtle.show();


    } // public static void main


    static double calcularHipotenusa(int longitudHoja) {
        return (2.0 * (double) longitudHoja) / Math.sqrt(2.0);
    }

    static void hoja(Turtle turtle, int longitudHoja) {
        turtle.turnLeft(90);
        turtle.forward(longitudHoja);
        turtle.turnRight(135);
        turtle.forward((int) Math.round(calcularHipotenusa(longitudHoja)));
        turtle.turnLeft(45);

    }

    static void numHojas(Turtle turtle, int longitudHoja, int cantidadHojas) {
        for (int i = 0; i < cantidadHojas; i++) {
            hoja(turtle, longitudHoja);
        }
    }

    static void hojaInvertida(Turtle turtle, int longitudHoja) {
        turtle.turnLeft(45);
        turtle.forward((int) Math.round(calcularHipotenusa(longitudHoja)));
        turtle.turnRight(135);
        turtle.forward(longitudHoja);
        turtle.turnLeft(90);
    }

    static void numHojasInvertidas(Turtle turtle, int longitudHoja, int cantidadHojas) {
        for (int i = 0; i < cantidadHojas; i++) {
            hojaInvertida(turtle, longitudHoja);
        }

    }


} // public class Ej4
