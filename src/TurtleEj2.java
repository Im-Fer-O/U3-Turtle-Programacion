import java.util.Scanner;

public class TurtleEj2 {
    public static void main(String[] args) {
        Turtle turtle = new Turtle(1000, 1000);
        Scanner teclado = new Scanner(System.in);

        System.out.println("ancho escalon?");
        int pixelesHorizontales = Integer.parseInt(teclado.nextLine());
        System.out.println("alto escalon?");
        int pixelesVerticales = Integer.parseInt(teclado.nextLine());
        System.out.println("numero de  escalones?");
        int escalones = Integer.parseInt(teclado.nextLine());

        //----------------escalon abajo -------------------
        escaleraAbajo(turtle,pixelesHorizontales,pixelesVerticales,escalones);
        turtle.forward(pixelesHorizontales*2);
        escalonArriba(turtle,pixelesHorizontales,pixelesVerticales);
       // turtle.turnRight(90);
       // escaleraArriba(turtle,pixelesHorizontales,pixelesVerticales,escalones);


        //-------------------------------------------

        turtle.markCursor(Turtle.Color.BLUE);
        turtle.show();
    } // main

    static void escalonAbajo(Turtle turtle, int pixelesHorizontales, int pixelesVerticales) {

        turtle.turnRight(90);
        turtle.forward(pixelesHorizontales);
        turtle.turnRight(90);
        turtle.forward(pixelesVerticales);
        turtle.turnRight(180);
    }

    static void escaleraAbajo(Turtle turtle, int pixelesHorizontales, int pixelesVerticales, int escalones) {
        for (int i = 0; i < escalones; i++) {
            escalonAbajo(turtle, pixelesHorizontales, pixelesVerticales);
        }
        turtle.turnRight(90);
    }

    static void escalonArriba(Turtle turtle, int pixelesHorizontales, int pixelesVerticales) {

        turtle.turnRight(90);
        turtle.forward(pixelesHorizontales);
        turtle.turnLeft(90);
        turtle.forward(pixelesVerticales);
        turtle.turnLeft(180);
    }




} //public class TurtleEj2

//  areA fuera de scope