import java.util.Scanner;

public class exercise2 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int option = 0, n = 0, sumToN = 0;
        double numA, numB;
        
        do{

            switch (option) {
                
                case 0:

                    System.out.println("========================= CALC MENU =========================");
                    System.out.println("\t1. ADD");
                    System.out.println("\t2. SUBTRACT");
                    System.out.println("\t3. MULTIPLY");
                    System.out.println("\t4. DIVIDE");
                    System.out.println("\t5. SUM FROM 1 TO N");
                    System.out.println("\t6. EXIT");
                    System.out.println("=============================================================");
                    System.out.print("Select an option: ");
                    option = sc.nextInt();
                    sc.nextLine();
                    break;

                case 1:

                    System.out.println("\n++ ======================================================= ++");
                    System.out.print("\tNum A: ");
                    numA = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("\tNum B: ");
                    numB = sc.nextDouble();
                    sc.nextLine();
                    System.out.printf("\tThe sum of those two numbers are: %f\n", numA+numB);
                    System.out.println("\n++ ======================================================= ++");
                    System.out.print("Would you like to continue adding? (1) or go back? (0): ");
                    option = sc.nextInt();
                    sc.nextLine();
                    break;
                
                case 2:
                    
                    System.out.println("\n-- ======================================================= --");
                    System.out.print("\tNum A: ");
                    numA = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("\tNum B: ");
                    numB = sc.nextDouble();
                    sc.nextLine();
                    System.out.printf("\tThe difference of those two numbers are: %f\n", numA-numB);
                    System.out.println("\n-- ======================================================= --");
                    System.out.print("Would you like to continue subtracting? (2) or go back? (0): ");
                    option = sc.nextInt();
                    sc.nextLine();
                    break;

                case 3:
                    
                    System.out.println("\n** ======================================================= **");
                    System.out.print("\tNum A: ");
                    numA = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("\tNum B: ");
                    numB = sc.nextDouble();
                    sc.nextLine();
                    System.out.printf("\tThe product of those two numbers are: %f\n", numA*numB);
                    System.out.println("\n** ======================================================= **");
                    System.out.print("Would you like to continue multiplying? (3) or go back? (0): ");
                    option = sc.nextInt();
                    sc.nextLine();
                    break;

                case 4:
                    
                    System.out.println("\n// ======================================================= //");
                    System.out.print("\tNumerator: ");
                    numA = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("\tDenominator: ");
                    numB = sc.nextDouble();
                    sc.nextLine();

                    if(numB == 0){
                        System.out.println("\tDenominator should not be 0! Result would be infinite.\n");
                        continue;
                    }

                    System.out.printf("\tThe quotient of those two numbers are: %f\n", numA/numB);
                    System.out.println("\n// ======================================================= //");
                    System.out.print("Would you like to continue dividing? (4) or go back? (0): ");
                    option = sc.nextInt();
                    sc.nextLine();
                    break;

                case 5:
                    
                    System.out.println("\n1-N ===================================================== 1-N");
                    System.out.print("\tEnter N: ");
                    n = sc.nextInt();
                    sc.nextLine();

                    if(n <= 1){
                        System.out.println("Pick another number greater than 1!");
                        continue;
                    }

                    sumToN = 0;

                    for(int i = 1; i <= n; i++){
                        sumToN += i;
                    }
                    
                    System.out.printf("\tThe sum from 1 to %d is: %d\n", n, sumToN);
                    System.out.println("\n1-N ===================================================== 1-N");
                    System.out.print("Would you like to continue summing to N? (5) or go back? (0): ");
                    option = sc.nextInt();
                    sc.nextLine();
                    break;

            }

        } while(option != 6);

        System.out.println("Exiting Program..");

        sc.close();
    }
}
