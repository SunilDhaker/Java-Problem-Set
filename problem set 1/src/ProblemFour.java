public class ProblemFour {

    private static int[] inputArray;

    public static void main(String args[]) {

        setInput();
        int[] result = findIndexOfMaxSubArray(inputArray);
        printOutput(result);
    }

    private static void printOutput(int[] result) {
        /**
         * this method will print
         */

        System.out.print("Maximum sum is " + result[2] + " index is from " + result[0] + " to " + result[1]);

    }

    private static int[] findIndexOfMaxSubArray(int[] inputArray) {
        /**
         * this method will find the Subarray of maximum sum
         * will return a integer array of DImension 3 containing starting ,endIndex and maximum sum respectivilly
         */

        int result[] = new int[3];
        int tempMax = 0;
        int startTempMax = 0, bTempMax = 0; // /starting and end index of tempMax
        int max = inputArray[0];
        int startMax = 0 , endMax = 0; // index of maximas
        for (int i = 0; i < inputArray.length; i++) {
            if (tempMax + inputArray[i] > tempMax) {
                tempMax += inputArray[i];
                bTempMax = i;
                if (tempMax > max) {
                    max = tempMax;
                    startMax = startTempMax;
                    endMax = bTempMax;
                }
            } else {
                if (tempMax + inputArray[i] <= 0) {
                    tempMax = 0;
                    startTempMax = i + 1;
                    bTempMax = i + 1;
                } else {
                    tempMax = tempMax + inputArray[i];
                    bTempMax = i;
                }
            }
        }
        result[0] = startMax;
        result[1] = endMax ;
        result[2] = max ;

        return result;
    }

    private static void setInput() {
        /**
         * This method simply sets the input array
         */

        inputArray = new int[]{2, 5, -12, 5, 4, 2, -5, 6};
    }
}
