import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class exercise10 {
    public static void main (String[] args){
        String line;
        
        List<String> stuNameList = new ArrayList<>();
        
        System.out.println("List of students: ");

        try (BufferedReader br = new BufferedReader(new FileReader("studentList.csv"))){
            while((line = br.readLine()) != null){
                String[] entry = line.split(",");
                Arrays.stream(entry).limit(1).forEach(stuNameList::add);
            }
        } catch (IOException e){
            System.out.println("Can't read file! Might be because it's nonexistent, not in the same path,\nor bugs in the code!");
        }

        stuNameList.stream().sorted().forEach(System.out::println);

    }
}
