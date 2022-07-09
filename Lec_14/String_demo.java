package Lec_14;

public class String_demo {
    public static void main(String[] args) {
        String str = "ABCDE";
        
        int len = str.length();
        System.out.println(len);
        
        char ch = str.charAt(str.length()-1);
        System.out.println(ch);
        
        System.out.println(str.substring(1,2));
        for(int s =0;s<str.length();s++){
            for(int e = s+1;e<=str.length();e++){
                System.out.println(str.substring(s,e));
            }
        }
        str ="nitin";
        int ans = str.indexOf("iti");
        System.out.println(ans);
        System.out.println(str.indexOf("bcd"));
        System.out.println(str.lastIndexOf("bcd"));
        
        System.out.println(str.startsWith("niti"));
        System.out.println(str.endsWith("ini"));
        
        System.out.println(isPalin("LULKY"));
        
        
   }
   public static boolean isPalin(String str){
       int s = 0; int e = str.length()-1;
       
       while(s<e){
           if(str.charAt(s)==str.charAt(e)){
               s++;
               e--;
           }else{
                return false;
            }
       }
       return true;
   }
}