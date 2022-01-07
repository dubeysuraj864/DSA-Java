public class copyValueWoutConst {
    int id;
    String name;
    copyValueWoutConst(int i, String n){
        id =i;
        name =n;
    }
    copyValueWoutConst(){}

    void display(){
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        copyValueWoutConst s1 = new copyValueWoutConst(111, "Suraj Dubey");
        copyValueWoutConst s2 = new copyValueWoutConst();

        s2.id =s1.id;
        s2.name = s1.name;

        s1.display();
        s2.display();
    }

}
