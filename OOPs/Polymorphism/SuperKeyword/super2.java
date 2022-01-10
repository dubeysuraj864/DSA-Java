class India{
    void delhi(){
        System.out.println("It's raining...");
    }
}
class UP extends India{
    void lucknow(){
        System.out.println("It's sunny today...");
    }
    void noida(){
        System.out.println("Cloudy...");
    }
    void weather(){
        super.delhi();
        noida();
    }
}

class super2{
    public static void main(String[] args) {
        UP s = new UP();
        s.weather();
    }
}
