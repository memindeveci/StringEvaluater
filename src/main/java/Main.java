import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        long startTime = System.nanoTime();

        Scanner sc = new Scanner(System.in);
        boolean use = true;

        while(use){
            System.out.println("Enter the String you want evaluated: ");
            String stringToEvaluate = sc.nextLine();
            int result = Parser.parseInput(stringToEvaluate);
            System.out.println(result);

            System.out.println("Do you want to continue? (true/false)");
            use = sc.nextBoolean();
        }

        System.out.println("Thank you for using String Evaluater.");
        //System.out.println("Enter the String you want evaluated:");


        //String str = "5+12*1";
        //int res = Parser.parseInput("4+5*2");

        long endTime = System.nanoTime();
        long elapsed = endTime - startTime;

        //System.out.println(res);
        //System.out.println("Execution in nanosecond: "+ elapsed);
        //System.out.println("Execution in milliseconds: "+ elapsed / 1000000);

    }
}
