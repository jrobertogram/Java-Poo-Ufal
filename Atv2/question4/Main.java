import java.util.ArrayList;
import java.util.Scanner;
public class Main {
        
        public static void main(String[] args) {
            ArrayList<Shape> shapes = new   ArrayList<>();
            Scanner teclado = new Scanner(System.in);
            System.out.print("Rectangle or Circle (r/c)?");
            String option = teclado.next();

            Color color = Color.valueOf("RED");
            if (option.equals("r")){
                System.out.println("width and height ");
                
                Rectangle rtg = new Rectangle(color, 4,5);
                System.out.println(rtg.getArea());

            if (option.equals("c")){
                Circle cl = new Circle(color, 3);
                System.out.println(cl.getArea());
            }
            shapes.add(rtg);
            teclado.close();  
        }
    }
}

