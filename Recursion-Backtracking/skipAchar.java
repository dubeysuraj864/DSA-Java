class skipAchar{

    public static void main(String[] args) {
        skip("", "baccdah");
    }
        static void skip (String p, String up){
             if(up.isEmpty()){
                 return;
             }
             char ch = up.charAt(0);

             if(ch == 'a'){
              skip(p, up.substring(1));
             }

             else{
                 skip(p+ch,up.substring(1));
             }
        }
}