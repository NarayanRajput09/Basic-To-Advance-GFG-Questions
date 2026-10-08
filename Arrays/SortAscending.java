package Array;

public class shorteAssending {
        public static void main(String[] args) {
        int arr[]={1,6,9,11,13,13,14,15};
        boolean res = check (arr);
        System.out.println(res);
        }
    public static boolean check(int [] arr){
 
        for(int i=1;i<arr.length;i++){
       int curr =arr[i];
       int pre=arr[i-1];
       if(pre>curr){
        return false;
       }
        }

        return true;
    }
}
