public class bank {
    int getRateOfInterest(){
        return 0;
    }
}

class sbi extends bank{
    int getRateOfInterest(){
        return 8;
    }
}
class axis extends bank{
    int getRateOfInterest(){
        return 7;
    }
}
class icici extends bank{
    int getRateOfInterest(){
        return 10;
    }
}

class test123{
    public static void main(String[] args) {
        // bank obj = new bank();
        sbi s = new sbi();
        axis a = new axis();
        icici i = new icici();
        System.out.println("Sbi rate of interest: "+ s.getRateOfInterest());
        System.out.println("Axis rate of interest: "+a.getRateOfInterest());
        System.out.println("Icici rate of interest: "+i.getRateOfInterest());
    }
}
