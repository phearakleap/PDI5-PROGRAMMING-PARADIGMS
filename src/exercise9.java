import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class exercise9 {
    public static void main (String[] args){
        List<Integer> nums = Arrays.asList(5, 2, 9, -1, 3, -8, 20, -50);
        
        System.out.println("The Cubed Numbers are: ");
        nums.stream().map(n -> n*n*n).forEach(System.out::println);
        
        System.out.println("\nThe Positive numbers in that list are: ");
        nums.stream().filter(n -> n > 0).forEach(System.out::println);
        
        System.out.println("\nWhen sorted, the list is: ");
        List<Integer> sortedNums = new ArrayList<>();
        nums.stream().sorted().forEach(sortedNums::add);
        System.out.println(sortedNums);
    }
}
