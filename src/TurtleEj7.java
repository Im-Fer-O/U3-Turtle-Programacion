import java.util.Scanner;

public class TurtleEj7 {
    public static void main(String[] args) {

        Turtle turtle = new Turtle(5000, 5000);
        Scanner teclado = new Scanner(System.in);

        //------ variables-----------
        int radio = 120; // int
        int pasos = 90;  // 90 pasos * 1 grado = 90 grados (un cuarto de circunferencia)
        double longitudArco = (Math.PI * radio) / 2.0;
        int pasoAvance = Math.max(1, (int) Math.round(longitudArco / pasos));

        //------------------------


        turtle.goTo(0, 0);
        turtle.turnLeft(45);

        hoja(turtle, pasos, pasoAvance);


        turtle.markCursor(Turtle.Color.RED);

        turtle.show();


    } // public static void main


    static void hoja(Turtle turtle, int pasos, int pasoAvance) {

        //--lado derecho---
        for (int i = 0; i < pasos; i++) {
            turtle.forward(pasoAvance);
            turtle.turnRight(1);
        }

        turtle.goTo(0, 0);

        //--lado izquierdo---
        for (int i = 0; i < pasos; i++) {
            turtle.forward(pasoAvance);
            turtle.turnLeft(1);
        }

        turtle.goTo(0, 0);
        turtle.resetAngle();
    } // hoja
} // public class TurtleEj7

