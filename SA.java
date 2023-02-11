import java.util.Scanner;
public class SA {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("lenght ="  );
        double A = sc.nextDouble();
        System.out.print("width ="  );
        double B = sc.nextDouble();
        System.out.print("lenght of none shaded area ="  );
        double C = sc.nextDouble();
        
        double Sa;
        Sa = (A * B) - (0.5 * B * C );
        System.out.println("Area of shaded area =" + Sa  );
        
    }
}