import java.util.Scanner;

public class TurtleEj5 {
    public static void main(String[] args) {

        Turtle turtle = new Turtle(500, 500);

        Scanner teclado = new Scanner(System.in);
        System.out.println("longitud del cuadrado?");
        int lado = Integer.parseInt(teclado.nextLine());
        System.out.println("cantidad de cuadrados?");
        int cantidadCuadrados = Integer.parseInt(teclado.nextLine());


        cuadradoInicial(turtle,lado);
        espacio(turtle, lado);

        cuadradoMultiple(turtle,lado,cantidadCuadrados);

        turtle.markCursor(Turtle.Color.RED);
        turtle.show();

    } //  public static void main

    static void cuadradoInicial(Turtle turtle, int lado){

        for ( int j=0;j<4;j++){
            turtle.forward(lado);
            turtle.turnRight(90);
        }
    }

    static void espacio (Turtle turtle, int lado){

        turtle.setPenDown(false);

        turtle.turnLeft(180);
        turtle.forward(lado/2);
        turtle.turnRight(90);
        turtle.forward(lado/2);
        turtle.turnRight(90);

        turtle.setPenDown(true);

    }

    static void cuadradoMultiple(Turtle turtle, int lado, int cantidadCuadrados){
        for(int multiplicador=2 ;multiplicador<= cantidadCuadrados;multiplicador++){ // multiplicador=2 xq ya se considera el cuadrado inicial.sino dibuja de mas
            int costado= lado*multiplicador;


        for ( int i=0;i<4;i++){  // dibuja el cuadrado actual
            turtle.forward(costado);
            turtle.turnRight(90);
        }
        espacio(turtle, lado);
        }
    }


} // public class TurtleEj5
