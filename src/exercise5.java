public class exercise5 {
    
    public static int factorialProcedural(int num){
        
        int factorial = 1;
        if (num == 0) factorial = 1;
        else{
            for(int i = 1; i <= num; i++){
                factorial *= i;
            }
        }
       
        return factorial;

    }

    public static int factorialRecurse(int num){
        if (num == 0) return 1;
        else return num * factorialRecurse(num - 1);
    }

    
    public static void main(String[] args){
        System.out.println("The Factorial of 3 is: ");
        System.out.printf("\tProcedural: %d\n", factorialProcedural(3));
        System.out.printf("\tRecursive: %d\n", factorialRecurse(3));

        System.out.println("\nThe Factorial of 6 is: ");
        System.out.printf("\tProcedural: %d\n", factorialProcedural(6));
        System.out.printf("\tRecursive: %d\n", factorialRecurse(6));

        System.out.println("\nThe Factorial of 10 is: ");
        System.out.printf("\tProcedural: %d\n", factorialProcedural(10));
        System.out.printf("\tRecursive: %d\n", factorialRecurse(10));

        System.out.println("\nThe Factorial of 50 is: ");
        System.out.printf("\tProcedural: %d\n", factorialProcedural(50));
        System.out.printf("\tRecursive: %d\n", factorialRecurse(50));
        // Output is 0 because the biggest number that primitive int can store 2^31 - 1 numbers (int32)
    }
}
