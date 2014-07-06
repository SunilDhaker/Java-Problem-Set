package com.company;
public class Prob2{

    public static  void  main(String args[]){

        int[] inputArray = { 1 , 5 , 4 , 9 , 7 , 6 , 3 , 0};

        System.out.println(find_Kth_SmallestElement2(inputArray , 4));
    }

// WITHOUT USING ANY DATA_STRUCTURE



    /**
     * Selection Sorting
     * this method linearly searches the kth smallest element
     * @param inputArray array to be searched/sorted
     * @param  k kth smallest element to be searched
     * @return  index of kth element
     */
    private static int find_Kth_SmallestElement(int[] inputArray , int k){

        int tempMin = inputArray[0] ;
        for(int i = 0 ; i <  k ; i++){
             for(int j = i+1 ; j < inputArray.length ; j++){
                 if(inputArray[i] > inputArray[j]){
                     swap(i , j , inputArray);
                 }
             }
        }
        return inputArray[k-1];

        /* SPACE COMPLEXITY

          time to swap === constant c
          time to compare == t
          than

          O(n) = k*c + tn  +   t* n-1 ..... + t* n-k

          O(n) = k*c + t * k*(n - k+1 )

          complexity = O(kn)


          IF K > n/2 THAN FINDING N-K th GREATEST ELEMENT WILL BE MORE  FEASIBLE

         */

    }

    /**
     *
     * this method  searches the kth smallest element using INSERTION SORT
     * @param inputArray array to be searched/sorted
     * @param  k kth smallest element to be searched
     * @return  index of kth element
     */
   private static int find_Kth_SmallestElement2(int[] inputArray , int k ){
        for(int i = 2 ; i < inputArray.length ; i++ ){
            for(int j = i ; j > 1 && inputArray[j] < inputArray[j-1] ; j--){
                swap(j, j - 1 ,inputArray);
            }
        }
       return  inputArray[k-1] ;
   }
    /**
     *
     * this method  searches the kth smallest element using BUBBLE SORT
     * @param inputArray array to be searched/sorted
     * @param  k kth smallest element to be searched
     * @return  index of kth element
     */
   private static  int find_Kth_SmallestElement3(int[] inputArray , int k ){

       for(int i = 0; i < k ;i++){
           for(int j = i+1 ; j < inputArray.length ; i++ ){
               if(inputArray[j-1] > inputArray[j]){
                   swap(j-1 , j , inputArray);
               }
           }
       }
       return inputArray[k-1];

   }
   private  static void swap(int i , int j , int[] inputArray){

        int temp = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = temp;
    }
}