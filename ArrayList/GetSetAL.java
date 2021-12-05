import java.util.ArrayList;

class GetSetAL {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("apple");
        al.add("Bannana");
        al.add("Graphs");

        System.out.println("Running element: "+ al.get(1));

        al.set(1, "Cock");

        //traversal list

        for(String fruit:al)
        System.out.println(fruit);
    }
    
}
