//Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//Given A = [1, 2, 3], the function should return 4.
//
//Given A = [−1, −3], the function should return 1.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [1..100,000];
//each element of array A is an integer within the range [−1,000,000..1,000,000].

import java.util.Arrays;

public class DemoTest{
    public static void main(String args[]){  
        int[] givenArray=new int[]{1, 3, 6, 4, 1, 2,7,8};
        System.out.println(solution(givenArray));  
    }  

    public static int solution(int[] A) {
        
        Arrays.sort(A);
        int currentSmallestNumber=1;
        for (int i = 0; i < A.length; i++) {
           if(currentSmallestNumber==A[i] && A[i]>0){
            if(i==A.length-1){
                return ++currentSmallestNumber;
            }else{
                currentSmallestNumber++;
            }
           }else if(currentSmallestNumber<A[i]){
              return currentSmallestNumber;
           }
        }
        return currentSmallestNumber;
    }
}