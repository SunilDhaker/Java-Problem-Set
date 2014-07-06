import java.util.ArrayList;

public class ProblemThree {
    private static int[][] sorted2DArray;
    private static int searchKey;

    public static void main(String[] args) {

        setInput();
        setSearchKey();
        ArrayList<Integer> results = search2DimensionalSortedArray(sorted2DArray, searchKey);
        printOutput(results);
    }


    public static void setInput() {
        /**
         *sets the input 2D SortedArray
         */

        //TODO: check whether array is sorted or not ??
        sorted2DArray = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    }


    public static void setSearchKey() {
        /**
         *this method simply sets the input keys
         */

        searchKey = 12;
    }


    private static void printOutput(ArrayList<Integer> results) {
        /**
         *this method prints the result of searched array
         */
        for (int i = 0; i < results.size(); i += 2)
            System.out.println("Found AT  (" + results.get(i) + "," + results.get(i + 1) + ")");
    }


    public static ArrayList<Integer> search2DimensionalSortedArray(int[][] sorted2DArray, int searchKey) {
        /**
         *this method searches the given key inside the given sorted 2d Array and returnd integer array
         *containing the indexes of sorted2D array where key is found
         *Linear Search is Used
         * Binary search me panga ho rha tha ..mene try kiya >>
         */

        int start = 0;
        ArrayList<Integer> results = new ArrayList<Integer>();
        int noOfRows = sorted2DArray.length;
        int noOfColumn = sorted2DArray[0].length;
        Integer end = new Integer(noOfColumn);
        for (int i = 0; i < noOfRows; i++) { // Linear searching of 2D array
            for (int j = 0; j < end; j++) {
                if (sorted2DArray[i][j] == searchKey) {
                    results.add(i);
                    results.add(j);
                }
                if (sorted2DArray[i][j] > searchKey) {
                    end = j;
                    break;
                }
            }
        }//


        return results;
    }

}