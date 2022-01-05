import java.util.*;

public class ItreratingArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("mango");
        list.add("New york");
        list.add("Vegas");

        Iterator itr = list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
}
