public class tiling {
    public static void main(String[] args) {
        System.out.println(tilingWays(4));
    }
    
    static int tilingWays(int n){
        if(n ==0 ){
            return 0;
        }
        if(n==1 ){
            return 1;
        }
        else
        return tilingWays(n-1)+tilingWays(n-2);
    }

}
