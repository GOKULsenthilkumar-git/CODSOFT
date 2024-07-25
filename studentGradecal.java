package codsoft;
import java.util.Scanner;

public class studentGradecal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numofsubjects = scanner.nextInt();

        int totalmarks = 0;

        for (int i = 1; i <= numofsubjects; i++) {
            while (true) {
                System.out.print("Enter your marks for subject " + i + ": ");
                int marks = scanner.nextInt();

                if (marks < 0 || marks > 100) {
                    System.out.println("Please enter a valid mark (between 0 and 100).");
                } else {
                    totalmarks += marks;
                    break;
                }
            }
        }

        float average =  totalmarks / numofsubjects;
        System.out.println("Your average mark is: " + average);
        if (average>=90.00){
        System.out.println("Your grade is: A" );}
        else if(average>=75)
        {
        System.out.println("Your grade is: B" );}
        else if(average>=45)
        {
        System.out.println("Your grade is: C" );}
        else 
        {
        System.out.println("Your grade is: D" );}
         }
}