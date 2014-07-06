
public class Prob5 {

    public static void main(String[] args){
        int[] sortedInputArray = { 0 , 1 , 2 , 3 , 4 , 5 ,  6 , 7 , 8 , 9 , 10 , 11 , 12 ,13 , 15 , 19 , 21};
        int searchKey = 15 ;
        searchSum2(sortedInputArray , searchKey);
    }


    /**
     * Linear search concepts
     * @param sortedInputArray Array where pair to be searched ;
     * @param key
     */
    private static ArrayList<Integer> searchSum(int[] sortedInputArray, int key) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        int pairCounter = 0;
        int leftPointer = 0 ;
        int rightPointer = sortedInputArray.length -1;
        while(leftPointer < rightPointer){
            while (leftPointer < rightPointer){
                if(sortedInputArray[leftPointer] + sortedInputArray[rightPointer] < key)
                    break;
                if(sortedInputArray[leftPointer] + sortedInputArray[rightPointer] ==  key) {
                    }
                rightPointer--;
            }
            leftPointer++;
        }
    }



    /**
     * Linear BINARY concepts
     * @param sortedInputArray Array where pair to be searched ;
     * @param key
     */
    private static void searchSum2(int[] sortedInputArray, int key) {

        int pairCounter = 0;
        int leftPointer = 0 ;
        int leftPointerForBinary = 0 ;
        int rightPointer = sortedInputArray.length -1;
        while(leftPointer < rightPointer){

            leftPointerForBinary = leftPointer;
            while(leftPointerForBinary < rightPointer){

             if(sortedInputArray[(leftPointerForBinary + rightPointer) / 2 ] ==  key){
                 pairCounter++;
                 System.out.println("pair["+pairCounter+"] is " + sortedInputArray[leftPointer] + " + " + sortedInputArray[rightPointer]);
                 break;
             }else if(sortedInputArray[(leftPointerForBinary + rightPointer) / 2 ] >  key) {
                 rightPointer = (leftPointerForBinary + rightPointer) / 2;
             }else
                 leftPointerForBinary = (leftPointerForBinary + rightPointer) / 2 ;
            }

            leftPointer++;
        }
    }


}
