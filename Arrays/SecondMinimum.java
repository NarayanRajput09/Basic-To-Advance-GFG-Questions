package Array;

public class SecondMin {
     public static void main(String[] args) {
        int arr[]={7,8,9,4,12,10};
        int min = Integer.MAX_VALUE;
                int smin = Integer.MIN_VALUE;

                for(int i=0;i<arr.length;i++){
                   int ele=arr[i];
                    if(min>ele){
                        smin=min;
                        min=ele;
                    }else if(smin>ele){
                        smin=ele;
                    }
                  }
                System.out.print(smin);
    }
    
}
