public class Employee {
    float salary= 40000;
}
class Programmer extends Employee{
    int bonus = 10000;
    public static void main(String[] args) {
        Programmer p1 = new Programmer();

        System.out.println("Programmer salary is: "+ p1.salary);
        System.out.println("Bonus of programmer is: "+p1.bonus);
    }
}
