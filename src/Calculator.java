import com.exceptions.EmptyArrayException;

import java.util.List;

public class Calculator {
    int total=0;
    public void sum(List<Integer> list){
        if (list.size()!=0){
            for (int i=0;i<list.size();i++){
                total=list.get(i)+total;
            }
            System.out.println(total);
        }else {
            throw new EmptyArrayException("Empty Array");
        }


    }



}
