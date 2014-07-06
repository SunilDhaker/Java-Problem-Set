import java.util.ArrayList;


public class prob4 {

    public static void main(String[] args) {


        method1();
        method2();

    }


    public static void method1() {


        int[] inputArray = {2, 5, -12, 5, 4, 2, -5, 6};

		
		/*
		 * 
		 * so wht i did is
		 * 
		 * start adding term from first term
		 * 
		 * if sum + next term is greater than max than its the maximum
		 * 
		 * if sum is less but not negative than it will be tempmax
		 * 
		 * 
		 * if sum become less than zero than make sum = 0 , and start sub
		 * sequence from here
		 */

        // taking input
        int temp;
        ArrayList<Integer> inputArrayList = new ArrayList<Integer>();
        for (int i = 0; i < inputArray.length; i++)
            inputArrayList.add(inputArray[i]);

        int tempMax = inputArrayList.get(0);
        int startTempMax = 0, btempMax = 0; // /starting and end index of tempMax
        int max = inputArrayList.get(0);
        int startMax = 0, endMax = 0; // index of maximas

        for (int i = 0; i < inputArrayList.size(); i++) {

            if (tempMax + inputArrayList.get(i) > tempMax) {

                tempMax += inputArrayList.get(i);
                btempMax = i;

                if (tempMax > max) {

                    max = tempMax;
                    startMax = startTempMax;
                    endMax = btempMax;
                }
            } else {

                if (tempMax + inputArrayList.get(i) <= 0) {

                    // if the max is negative than

                    if ((tempMax + inputArrayList.get(i)) > max) {

                        max = tempMax;
                        startMax = startTempMax;
                        endMax = btempMax;
                    }

                    // set tempMax to zero

                    tempMax = 0;
                    startTempMax = i + 1;
                    btempMax = i + 1;
                } else {

                    tempMax = tempMax + inputArrayList.get(i);
                    btempMax = i;
                }
            }
        }

        System.out.println("max sum is  " + max + "  sub sequence is "
                + inputArrayList.subList(startMax, endMax + 1));


    }

    public static void method2() {

        /**
         *
         * Method to calculate substring  without data stucture
         *
         */


        int[] inputArray = {2, 5, -12, 5, 4, 2, -5, 6};


        // taking input
        int temp;


        int tempMax = 0;
        int startTempMax = 0, btempMax = 0; // /starting and end index of tempMax
        int max = inputArray[0];
        int startMax = 0, endMax = 0; // index of maximas

        for (int i = 0; i < inputArray.length; i++) {


            if (tempMax + inputArray[i] > tempMax) {

                tempMax += inputArray[i];
                btempMax = i;

                if (tempMax > max) {

                    max = tempMax;
                    startMax = startTempMax;
                    endMax = btempMax;
                }
            } else {//case when next term is nagative


                //case when subsequence sum become nagative
                if (tempMax + inputArray[i] <= 0) {


                    // set tempMax to zero

                    tempMax = 0;
                    startTempMax = i + 1;
                    btempMax = i + 1;
                } else {

                    tempMax = tempMax + inputArray[i];
                    btempMax = i;
                }
            }
        }

        System.out.println("max sum is  " + max + "  sub sequence index are is " + startMax + " " + endMax);

    }


}
