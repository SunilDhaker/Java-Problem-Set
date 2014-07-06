import java.util.ArrayList;

public class ProblemFive {

    private static int searchKey;
    private static int[] inputArray;

    public static void main(String[] args) {

        setInput();
        setSearchKey();
        ArrayList<Integer> result = findPairWithSumUsingLinearSearch(inputArray, searchKey);
        printresult(result, inputArray);
    }

    private static void printresult(ArrayList<Integer> result, int[] inputArray) {
        /**
         * this method will print ..bla bla..
         */

        for (int i = 0; i < result.size(); i += 2) {
            System.out.println("" + inputArray[result.get(i)] + "+" + inputArray[result.get(i+1)]);
        }
    }


    public static void setSearchKey() {
        /**
         *this method will set the key i.e . sum  to be searched
         */

        searchKey = 15;
    }


    public static void setInput() {
        /**
         *this method will set input for us ...
         */

        inputArray =new int[] { 0 , 1 , 2 , 3 , 4 , 5 ,  6 , 7 , 8 , 9 , 10 , 11 , 12 ,13 , 15 , 19 , 21};
    }


    public static ArrayList<Integer> findPairWithSumUsingLinearSearch(int[] inputArray, int key) {
        /**
         *this method will search for the pair having sum equals to key ..
         */

        ArrayList<Integer> result = new ArrayList<Integer>();
        int leftPointer = 0;
        int rightPointer = inputArray.length - 1;
        while (leftPointer < rightPointer) {
            while (leftPointer < rightPointer) {
                if (inputArray[leftPointer] + inputArray[rightPointer] < key) {
                    break;
                }
                if (inputArray[leftPointer] + inputArray[rightPointer] == key) {
                    result.add(leftPointer);
                    result.add(rightPointer);
                }
                rightPointer--;
            }
            leftPointer++;
        }

        return result;
    }


    public static ArrayList<Integer> findPairWithSumUsingBinarySearch(int[] inputArray, int key) {
        /**
         *this method will search for the pair having sum equals to key ..
         */

        ArrayList<Integer> result = new ArrayList<Integer>(); int pairCounter = 0;
        int leftPointer = 0 ;
        int leftPointerForBinary = 0 ;
        int rightPointer = inputArray.length -1;
        while(leftPointer < rightPointer){

            leftPointerForBinary = leftPointer;
            while(leftPointerForBinary < rightPointer){

                if(inputArray[(leftPointerForBinary + rightPointer) / 2 ] ==  - inputArray[leftPointer] + key){
                    result.add(leftPointer);
                    result.add((leftPointerForBinary + rightPointer) / 2);
                    break;
                }else if(inputArray[(leftPointerForBinary + rightPointer) / 2 ] >  key  - inputArray[leftPointer]) {
                    rightPointer = (leftPointerForBinary + rightPointer) / 2;
                }else
                    leftPointerForBinary = (leftPointerForBinary + rightPointer) / 2 ;
            }
            leftPointer++;
        }
        return result;
    }
}