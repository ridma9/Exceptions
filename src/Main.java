import com.exceptions.EmptyArrayException;

import java.security.spec.ECField;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        Calculator cal = new Calculator();
        List<Integer> list = List.of();
        try {
            cal.sum(list);
        }catch (EmptyArrayException e){
            System.out.println(e.getMessage());
        }
         */




        String x = "A String in Java is actually an object, which contain methods that can perform certain operations on strings. For example, the length of a string can be found with the length() method:";
        String []y= x.split(" ");

        String a = "";
        
        for (int i=0;i< y.length;i++){
            a=a.concat(y[y.length-i-1]+" ");
        }
        System.out.println(a);
        Collections.reverse(Arrays.asList(x.split(" ")))

    }
}