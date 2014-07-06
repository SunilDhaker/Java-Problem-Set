package com.company;
public class ProblemTwo {

    private static  int[] inputArray;
    private static int kValue;


    public static void main(String[]  args){

        setinput();
        setindex();
        int result  = smallestElementUsingSelectionSort(kValue , inputArray);
        printResult(result);
    }


    public static  void setinput(){
        /**
         * this method will set the input for the question
         */
         inputArray = new int[]{ 1 , 5 , 4 , 9 , 7 , 6 , 3 , 0};
    }


    public static void setindex(){
        /**
         * this method will set the index of the k value
         */
         kValue = 4;
    }


    public static int smallestElementUsingSelectionSort(int kValue , int[] inputArray){
        /**
         * this method will find Kth smallest element using selection sort
         */

        //TODO: note if kValue > inputArray.length/2 then calculating n - k th greatest element will be more feasible
        for(int i = 0 ; i <  kValue ; i++){
            for(int j = i+1 ; j < inputArray.length ; j++){
                if(inputArray[i] > inputArray[j]){
                    swap(i , j , inputArray);
                }
            }
        }

        return inputArray[kValue - 1] ;
    }


    public static int smallestElementUsingInsertionSort(int[] inputArray , int k ){
        /**
         * this method  searches the kth smallest element using INSERTION SORT
         * @param inputArray array to be searched/sorted
         * @param  k kth smallest element to be searched
         * @return  index of kth element
         */
        for(int i = 2 ; i < inputArray.length ; i++ ){
            for(int j = i ; j > 1 && inputArray[j] < inputArray[j-1] ; j--){
                swap(j, j - 1 ,inputArray);
            }
        }
        return  inputArray[k-1] ;
    }


    private static  int smallestElementUsingBubbleSort(int[] inputArray , int k ){
        /**
         * this method  searches the kth smallest element using BUBBLE SORT
         * @param inputArray array to be searched/sorted
         * @param  k kth smallest element to be searched
         * @return  index of kth element
         */
        for(int i = 0; i < k ;i++){
            for(int j = i+1 ; j < inputArray.length ; i++ ){
                if(inputArray[j-1] > inputArray[j]){
                    swap(j-1 , j , inputArray);
                }
            }
        }
        return inputArray[k-1];
    }


    public  static  void printResult(int result){
        /**
         * this method will print the input for this question
         */

        System.out.println(result);
    }


    private static void swap(int indexOfFirstElement  , int indexOfLastElement , int[] inputArray){
        /**
         * this method will swap two given integer  ...helper method for the sorting menthod
         */

        int temp ;
        temp = inputArray[indexOfFirstElement];
        inputArray[indexOfFirstElement] = inputArray[indexOfLastElement];
        inputArray[indexOfLastElement] = temp;
    }


}
