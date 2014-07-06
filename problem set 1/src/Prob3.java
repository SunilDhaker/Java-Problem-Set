
public class Prob3 {

	

	public static void main(String[] args) {
		
		
		int inputArray[][] = {{1  ,2 , 3 , 4} , {5 , 6 , 7 , 8} , {9 , 10 , 11 , 12 }};// input
		
		//linear search for each row 
		
		int start = 0 , end = 3 ,  noOfRows = 3;
		int key = 1 ;// key to be searched ;
		
		
		for(int i = 0 ; i < noOfRows ; i++){
			
			if(inputArray[i][0] > key)
				break;
			if(searchSubArray(key, inputArray[i], start, end, end))
				System.out.println("found at "+ i + " "+ end);
		    
		}
		
	}
	
	/**
	 * this method search (binary) a given element in a subarray from  startingIndex to  lastIndex
	 * @param array  input array whose sub array to be searched 
	 * @param startingIndex lastIndex  -> starting and last index of the sub array 
	 * @param key -> key to be searched
	 * @param result  index of element  in case of found , index of nearest smaller element 
	 * @return found - > true notfound ->false
	 */	
	private static boolean searchSubArray(int key , int[] array , int startingIndex , int lastIndex , int result){
		 
		int binaryStart = startingIndex;
		int binaryEnd   = lastIndex;
		
		
		do{
			result = (binaryEnd + binaryStart)/2;//go to middle
			if(array[result] == key ){
				return true ;
			}else if(array[result]  > key ){
				
				result--;
				binaryEnd = result;
			
			}
			else{
				binaryStart = result;
			}
			
			
		}while(binaryStart >= binaryEnd);
		
		
		return false ;
		
		
	}
	
	
	
	   
	
	
	
}
