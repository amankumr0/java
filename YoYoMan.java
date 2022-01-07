import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class YoYoMan {
    public static void main(String[] args) {
      
        List<Integer> ll = new LinkedList<>();
        List<Integer> al = new ArrayList<>();
        getTimeDiff(ll);
        getTimeDiff(al);
    }

    public static void getTimeDiff(List list) {
        long start = System.currentTimeMillis();
        for(long i =0;i<100000;i++){
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.println(list.getClass().getName() + "-->" + (end-start));
    }

}