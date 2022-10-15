import java.util.*;
public class Main
    {
        public static void main(String[] args)
        {
           
            Scanner sc = new Scanner(System.in);
            int choice1 = sc.nextInt();
            int choice2 = sc.nextInt();
            ComputeAdd compute = new ComputeAdd(choice1,choice2);
            System.out.print(compute.toString() + compute.computeadd());
        }
    }
