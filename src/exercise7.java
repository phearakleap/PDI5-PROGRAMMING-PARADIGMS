import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class exercise7 {
    public static void main(String[] args){
        
        
        Thread sumFromOneToN = new Thread(){
            
            @Override
            
            public void run(){
            
                Scanner sc = new Scanner(System.in);
                int n, sum = 0;
                System.out.print("[sumFromOneToN]$ Enter the number you want to sum to: ");
                n = sc.nextInt();
                sc.nextLine();

                for(int i = 1; i <= n; i++) sum += i;

                System.out.printf("[sumFromOneToN]$ The sum from 1 to %d is: %d\n", n, sum);
                sc.close();
                
            }
            
        };

        Thread primeNums = new Thread(){
            
            @Override 
            
            public void run(){
            
                System.out.println("[primeNums]$ The prime numbers from 1 to 100 are: ");
            
                for(int i = 1; i <= 100; i++){
                    if (i == 1) continue;
                    else if (i == 2) System.out.printf("[primeNums]$ %d\n", i);
                    else if (i % 2 != 0){
                        System.out.printf("[primeNums]$ %d\n", i);
                    }
                }

            }
        };
        Thread readFile = new Thread(){
            
            @Override
            
            public void run(){
            
                List<List<String>> studentList = new ArrayList<>();
                String line;
                
                try (BufferedReader br = new BufferedReader(new FileReader("studentList.csv"))){ 
            
                    while((line = br.readLine()) != null){
                        String[] entry = line.split(",");
                        studentList.add(Arrays.asList(entry));
                    }

                } catch (IOException e){
                    System.out.println("[readFile]$ Can't read the file!");
                }

                for(List<String> stuEntry : studentList){
                    
                    System.out.println("[readFile]$ ==============================================\n");
                    System.out.printf("[readFile]$\tStudent Name: %s\n", stuEntry.get(0));
                    System.out.printf("[readFile]$\tStudent ID: %s\n", stuEntry.get(1));
                    System.out.printf("[readFile]$\tStudent Age: %s\n", stuEntry.get(2));
                    System.out.printf("[readFile]$\tStudent Gender: %s\n", stuEntry.get(3));
                    System.out.println("\n[readFile]$==============================================\n");

                }
            }
        };

        sumFromOneToN.start();
        primeNums.start();
        readFile.start();
    }
}
