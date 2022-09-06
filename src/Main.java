import com.exceptions.EmptyArrayException;

import java.security.spec.ECField;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        List<Integer> list = List.of();
        try {
            cal.sum(list);
        }catch (EmptyArrayException e){
            System.out.println(e.getMessage());
        }


    }
}