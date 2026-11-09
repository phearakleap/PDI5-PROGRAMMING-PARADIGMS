import java.util.Arrays;
import java.util.stream.IntStream;

public class exercise11 {
    public static void main(String[] args){
        
        int[] numbers = {5, 2, 9, 1, 3, 8};
        System.out.println("The min and max in this list is: ");
        System.out.println("\tMin: " + IntStream.of(numbers).min().getAsInt());
        System.out.println("\tMax: " + IntStream.of(numbers).max().getAsInt());

    }
}
