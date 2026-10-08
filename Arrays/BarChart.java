package Array;

public class Barchart {
        public static void main(String[] args) {
      
        int arr[]={4,3,2,0,1,5};
        int maxlevel=0;
        for(int i=0;i<arr.length;i++){
            if(maxlevel<arr[i]){
                maxlevel=arr[i];
            }
        }

        for(int i = maxlevel;i >=1;i-- ){
            int currentlevel=i;

            for(int j=0;j<arr.length;j++){
                if(currentlevel<=arr[j]){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
