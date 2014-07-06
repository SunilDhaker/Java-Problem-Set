import java.util.ArrayList;


public class prob2 {
	
	
	
	public static void main(String[] args) {

		int[] usrIn = { 1 , 2 , 3 , 5  , 6 , 7};
		int index = 3; 
        rotate(usrIn, index);
        System.out.println();
        int[] outPut =  rotate1(usrIn, index);
        for(int i = 0 ; i <  usrIn.length ; i++)
            System.out.print(outPut[i] + " ");
        inPlaceRotation(usrIn , index);
        for(int i = 0 ; i <  usrIn.length ; i++)
        System.out.print(usrIn[i] + " ");

	}

	/**
	 * prints the rotated array
	 * @param usrIn  input Array
	 * @param index   index about which array is rotated
	 */
	public static void rotate(int[] usrIn, int index) {

		
		for (int i = 0; i < usrIn.length; i++) {
		
		   System.out.print(usrIn[(index+i)%usrIn.length] + ",");
		}
	}
	
	
	/**
	 *@return returns the rotated arrayList
	 * @param usrIn  input Array
	 * @param index   index about which array is rotated
	 */	
	
public static int[] rotate1(int[] usrIn, int index) {

		int[] out  = new int[usrIn.length];
		for (int i = 0; i < usrIn.length; i++) {
		
			out[i] = usrIn[(index+i)%usrIn.length];
		}
		return out;
	}


private static void inPlaceRotation(int[] usrIn , int index){

   int temp ;


    for(int i = index ; i >= 0 ; i--){
     for(int j = 0  ; j < usrIn.length - index - 1 ; j++){
         
         temp = usrIn[ j + index ];
         usrIn[ j + index ] = usrIn [ j + index + 1];
         usrIn[j + index  +1 ] = temp ;

     }

   }

}

}
