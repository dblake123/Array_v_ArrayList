import java.util.Arrays;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Arrays");
        String names[] = {"Andy","John", "Jack", "Sarah"};
        String blah[] = {"", "", "","", ""};
        String[] doh = new String[10];

        blah[0] = "Hello";
        blah[1] = "World";
        for (String n : names) {
            System.out.println(n);
        }
        
        for(String n : blah){
            System.out.println(n);
        }
        for(String n : doh){
            System.out.println(n);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        doh = Arrays.copyOf(names,10);

        for(String n : doh){
            System.out.println(n);
        }

        System.out.println();
        System.out.println();
        System.out.println("Array Lists");

        // Array Lists 
        ArrayList<String> namesList = new ArrayList<String>();
        //String names[] = {"Andy","John", "Jack", "Sarah"};
        namesList.add("Andy");
        namesList.add("John");
        namesList.add("Jack");
        namesList.add("Sarah");
        
        System.out.println("The names in the Array List:" + namesList);

        System.out.println("index of john is:" + namesList.indexOf("John"));
        System.out.println("Is Jack in Array" + namesList.contains("Jack"));
        System.out.println("Is Jimmy in Array" + namesList.contains("Jimmy"));
        namesList.remove("Jack");
        System.out.println("The names in the Array List after jack has been removed:" + namesList);
    
    }
}
