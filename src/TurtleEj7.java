import java.util.Scanner;

public class TurtleEj7 {
    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);

        System.out.println("rev del bucle 30");
        int rev =Integer.parseInt(teclado.nextLine());

        System.out.println("avance vector hoja 10");
        int avance= Integer.parseInt(teclado.nextLine());

        int anguloAvance =2; // ENCONTRAR LA PROPORCION CON EL ANGULO |/
      //  int anguloAvance =avance/(5);

        Turtle turtle = new Turtle(500, 500);


        turtle.goTo(0, -200);

        turtle.turnLeft(10);
        for (int i = 0; i < rev; i++) {
            turtle.turnRight(anguloAvance); //<-----
            turtle.forward(avance);
        }
        turtle.markCursor(Turtle.Color.BLUE);

        turtle.goTo(0, -200);

        turtle.turnRight(10);

        for (int i = 0; i < rev; i++) {
            turtle.turnLeft(anguloAvance); // <-----
            turtle.forward(avance);
        }


        turtle.markCursor(Turtle.Color.RED);

        turtle.show();
    }
}

