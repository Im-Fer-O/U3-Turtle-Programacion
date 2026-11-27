import java.util.Scanner;

public class TurtleEj7 {
    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);
        System.out.println("longitud hoja 4");
        int avance= Integer.parseInt(teclado.nextLine());

        System.out.println("curva hoja 1?");
        int curva =Integer.parseInt(teclado.nextLine());

        Turtle turtle = new Turtle(5000, 5000);

        hoja(turtle,avance,curva);


       //turtle.markCursor(Turtle.Color.RED);

        turtle.show();


    } // public static void main


    static void hoja (Turtle turtle,int avance,int curva){

        //  turtle.turnLeft(45);
        //---------- lado derecho hoja------
        for (int t =0; t<100;t++){
            turtle.forward(avance);
            turtle.turnRight(curva);
        }

        turtle.goTo(0,0);
        //---------- lado izquierdo hoja------
        for (int t=0;t<100;t++){
            turtle.forward(avance);
            turtle.turnLeft(curva);
        }

    }


} // public class TurtleEj7


























/*   import java.util.Scanner;

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

   */