package m01.s09.ex;

import java.util.Arrays;

public class Two {
    public static void main(String[] args) {
        String[][] two = { { "ciao", "buongiorno" }, { "hello", "good morning" } };

        System.out.print("First subelement in the second element is: ");
        System.out.println(two[1][0]);

        // TODO:
        // (1) Convert the full array in a string and print it
        System.out.print(Arrays.deepToString(two));
       
        // (2) Convert just the Italian greetings in a string and print it
        System.out.println(Arrays.toString(two[0]));
}
}
    
    
