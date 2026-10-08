package String;

public class removeDupli {
    

    public static void main(String[] args) {
        String str ="aaabbbccccdeeeff";
        

         String result = helper(str);
         System.out.println(result);

    }
    public static String helper (String str) {
        if(str.length() ==0){
            return str;
        }
        String ans ="";
        boolean [] checkChar =new boolean[26];
        
    for(int i=0; i<str.length();i++){
        char ch =str.charAt(i);
        int idx = 0;

        if(ch >= 'A' && ch <= 'Z'){
            idx = ch-'A';
     }else if(ch >='a'&& ch <='z' ){
        idx = ch-'a';
     }
     if(checkChar [idx] == false){
        ans += ch;
        checkChar[idx] =true;
     }
    }
    return ans;
        
    }
}
