public class ProblemOne {

	private static int[] inputArray;
	private static int rotateIndex;


	private static void setInputArray() {
		/**
		* Sets the inputArray which is to be rotated.
		*/

		inputArray = new int[] {2, 3, 4, 5, 6,7, 8, 9, 10};
	}


	private static void setRotateIndex() {
		/**
		* Sets the rotateIndex about which inputArray is to be rotated.
		*/

		// TODO: Check whether the rotateIndex is less than the inputArray.length
		rotateIndex = 3;
	}


	public static void setInput() {
		/**
		* Sets  the inputArray which is to be rotated and also sets the rotateIndex about which rotateIndex is to be rotated
		*/

		setInputArray();
		setRotateIndex();
	}


	public static int[] rotateArrayWithoutExtraSpace(int[] inputArray, int rotateIndex) {
		/**
		* Rotates the inputArray without using extra space.
		*/

		reverse(inputArray , 0 , rotateIndex - 1);
		reverse(inputArray , rotateIndex  ,inputArray.length-1 );
        reverse(inputArray , 0 , inputArray.length-1);

		return inputArray;
	}


	public static int[] rotateArrayWithExtraSpace(int[] inputArray, int rotateIndex) {
		/**
		* Rotates the inputArray using extra space.
		*/

		int[] outputArray = new int[inputArray.length];
        for(int i = 0 ; i < inputArray.length ; i++){
            outputArray[i] = inputArray[( i + rotateIndex ) % inputArray.length ] ;
        }

		return outputArray;
	}


	public static  void printOutput(int[] outputArray) {
		/**
		* Prints the rotaed Array as output.
		*/

		for (int i = 0; i < outputArray.length; i++) {
			System.out.print(outputArray[i] + " ");
		}
        System.out.println();
	}

	
	public static void main(String[] args) {

		setInput();
     int[] outputArray = rotateArrayWithExtraSpace(inputArray, rotateIndex);
     printOutput(outputArray);
		rotateArrayWithoutExtraSpace(inputArray, rotateIndex);
		printOutput(inputArray);
	}	


	private static void reverse(int[] inputArray , int startingIndex , int endIndex){
  /**
	*this method reverse a input subArray with startingIndex and end endindex    
	*/
		while (startingIndex < endIndex) {
			
			swap(inputArray, startingIndex, endIndex);

			startingIndex++;
			endIndex++;
		}
	}


    private  static void swap( int[] inputArray , int startingIndex , int endIndex){

        int temp = inputArray[startingIndex];
        inputArray[startingIndex] = inputArray[endIndex];
        inputArray[endIndex] = inputArray[startingIndex];
    }
}