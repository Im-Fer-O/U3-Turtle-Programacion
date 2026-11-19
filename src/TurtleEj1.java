// los angulos se sacan con coseno.

import java.util.Scanner;

public class TurtleEj1 {

    public static void main(String[]args){
        Turtle turtle=new Turtle(500,500); // <- pizarra
        Scanner teclado= new Scanner (System.in);

        System.out.println("longitud costado?");
        int costado = Integer.parseInt(teclado.nextLine());
        System.out.println("cuantos cuadrados horizontales?");
        int cuadradosHorizontal=Integer.parseInt(teclado.nextLine());
        System.out.println("cuantos cuadrados verticales?");
        int cuadradosVertical=Integer.parseInt(teclado.nextLine());
// ----------------------------SECUENCIA --------------------------------------------

       filaHorizontal(turtle, costado, cuadradosHorizontal);
       filasVerticales(turtle, costado, cuadradosHorizontal, cuadradosVertical);

// --------------------------------------------------------------------
        turtle.markCursor(Turtle.Color.BLUE);
        turtle.show(); // <- print
    }


    static void Cuadrado (Turtle turtle, int costado){
        for(int i=0;i<4;i++){
            turtle.forward(costado);
            turtle.turnRight(90);

        }
      //  turtle.markCursor(Turtle.Color.BLUE); //dejar fuera del bucle

    }

    static void espacioHorizontal(Turtle turtle, int costado){
        turtle.setPenDown(false);
        turtle.turnRight(90);
        turtle.forward(costado + costado/2); // es cost + cost/2 xq el lapiz termina desde donnde empezo
        turtle.turnLeft(90);
        turtle.setPenDown(true);
      //  turtle.markCursor(Turtle.Color.RED);

    }

    static void filaHorizontal(Turtle turtle, int costado, int cuadradosHorizontal) {
        int i;
        for(i=0;i< cuadradosHorizontal;i++ ){
            Cuadrado(turtle,costado);
            espacioHorizontal(turtle, costado);
        }
       saltoLinea(turtle, costado, cuadradosHorizontal);
    }


    static void saltoLinea (Turtle turtle,int costado,int cuadradosHorizontal){
        turtle.setPenDown(false);
        turtle.turnLeft(90);
        turtle.forward((costado +(costado/2))*cuadradosHorizontal);
        turtle.turnLeft(90);
        turtle.forward(costado+(costado/2));
        turtle.turnRight(180);
        turtle.setPenDown(true);
    }

    static void filasVerticales(Turtle turtle, int costado, int cuadradosHorizontal, int cuadradosVertical) {
        for (int i = 1; i < cuadradosVertical; i++) { // EL CONTADOR EMPIEZA DE 1 !! NO DE CERO
            filaHorizontal(turtle, costado, cuadradosHorizontal);
        }
    }
    }







