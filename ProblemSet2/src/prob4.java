public class prob4 {

    public static void main(String[] args) {

        int[] inputArray = { 5,3,8,-7,2,-11 };

        int minSumindex = 0;

        for(int i = 1 ; i < inputArray.length-1  ; i++){
          if((inputArray[i] + inputArray[i+1]) >=0 && (inputArray[i] + inputArray[i+1]) <(inputArray[minSumindex] + inputArray[minSumindex+1]) ){
              minSumindex = i ;
          }
        }

        if((inputArray[minSumindex] + inputArray[minSumindex+1]) <0 )
            System.out.print("No pair exists which have sum >= 0");
        else
            System.out.print( "minimum Pair Sum is "+ (inputArray[minSumindex] + inputArray[minSumindex+1]) + "  i.e." + inputArray[minSumindex] + " + "+ inputArray[minSumindex+1] );

    }

}
