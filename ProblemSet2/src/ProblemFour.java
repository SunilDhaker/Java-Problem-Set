public class ProblemFour {

    private static  int[] inputArray;


    public static  void main(String args[]){
        setInput();
        int reuslt =  findPairWithMinimumSumGreaterThanZero(inputArray);
        printResult(reuslt , inputArray);
    }

    public static void setInput(){
    	/**
    	*this method will set input and blaa ..blaa.
    	*/

    	inputArray = new int[]{ 0 , 5 , 25 , 30 , -80 , 20 , 6};
    }


    public static void  printResult(int reuslt , int[] inputArray){
    	/**
    	*this method will print output for the qsn
    	*/

    	if (reuslt == -1) {
    		System.out.println("no such pair exists");
    	}else{
    		System.out.println("Minimum pair sum which is greater than zero is " + (inputArray[reuslt] + inputArray[reuslt + 1] ) + " which is " + inputArray[reuslt] +" + " + inputArray[reuslt + 1]  );
    	}
    }


    public static int findPairWithMinimumSumGreaterThanZero(int[] inputArray){
     /**
     *this method will return index of element whose sum with the next element is minimum and greater than zero
     *returns -1 if no such pair exists
     */

      int minSumindex = 0;
      for(int i = 1 ; i < inputArray.length-1  ; i++){
          if((inputArray[i] + inputArray[i+1]) >=0 && (inputArray[i] + inputArray[i+1]) <(inputArray[minSumindex] + inputArray[minSumindex+1]) ){
              minSumindex = i ;
          }
      }
      if((inputArray[minSumindex] + inputArray[minSumindex+1]) <0 )
            return -1 ;
      else
            return minSumindex;
    }
}
