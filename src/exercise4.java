import java.util.Scanner;

public class exercise4 {
    
    static class Employee{

        private String name;
        private int age;
        private String gender;
        private String ID;
        private String position;

        public void setEmployeeInfo(String name, int age, String gender, String ID, String position){
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.ID = ID;
            this.position = position;
        }
        
        public String getName(){
            return this.name;
        }

        public int getAge(){
            return this.age;
        }

        public String getGender(){
            return this.gender;
        }

        public String getID(){
            return this.ID;
        }

        public String getPosition(){
            return this.position;
        }

    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        String name, gender, ID, position;
        int age;
        
        System.out.println("================================================");
        
        System.out.print("\nEmployee Name: ");
        name = sc.nextLine();

        System.out.print("Employee Age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Employee Gender: ");
        gender = sc.nextLine();

        System.out.print("Employee ID: ");
        ID = sc.nextLine();

        System.out.print("Employee Position: ");
        position = sc.nextLine();

        System.out.println("\n================================================");

        employee.setEmployeeInfo(
            name,
            age,
            gender,
            ID,
            position
        );

        System.out.println("\n=============== Employee's Info ================");

        System.out.printf("\nEmployee's name: %s\n", employee.getName());
        System.out.printf("Employee's age: %d\n", employee.getAge());
        System.out.printf("Employee's gender: %s\n", employee.getGender());
        System.out.printf("Employee's ID: %s\n", employee.getID());
        System.out.printf("Employee's position: %s\n", employee.getPosition());

        System.out.println("\n================================================");

        sc.close();

    }
}
