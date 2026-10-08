package Array;

public class SumOfDigit {
        public static void main(String[]args){

        int []arr1={4,5,6,7,8};
        int []arr2={3,9,2,1,4};
        
        int sum1=0;
        int sum2=0;

        for(int i=0;i<arr1.length;i++){
            sum1 += arr1[i];

        }

        for(int i=0;i<arr2.length;i++){
            sum2 += arr2[i];
        }
        int sum =sum1+sum2;
        System.out.println("SumOfArray1="+sum1);
        System.out.println("SumOfArray2="+sum2);

        System.out.println("sum="+sum);
    }

}
