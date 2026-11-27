import java.util.Scanner;
public class TurtleEj8 {
    static void main(String []args) {

        Scanner teclado=new Scanner(System.in);
        System.out.println("lado ?(100)");
        int lado=Integer.parseInt(teclado.nextLine());
        System.out.println("cantidad 4");
        int cantidad=Integer.parseInt(teclado.nextLine());


        Turtle turtle = new Turtle(500, 500);

        for(int i=0;i<cantidad;i++){
            triangulo (turtle,lado);
            turtle.turnLeft(360/cantidad);
        }

        turtle.markCursor(Turtle.Color.RED);
        turtle.show();
    }

    static void triangulo (Turtle turtle, int lado){

        turtle.turnRight(30);
        turtle.forward(lado);
        turtle.turnLeft(120);
        turtle.forward(lado);
        turtle.turnLeft(120);
        turtle.forward(lado);
        turtle.turnLeft(150);
    }
}
