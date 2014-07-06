
public class Prob3 {

    public static  void main(String args[]){
        int[][] inputArray = {{0,1,2,9},
                              {3,4,5,10},
                              {6,7,8,11}};

        int lastVisitedRow = inputArray.length-1 ;
        int firstVisitedRow = 0 ;
        
        int firstVisitedColumn  = 0;
        int lastVisitedColumn = inputArray[0].length -1  ;

        while(true){
          // visiting the upper row

          for(int i = firstVisitedColumn  ;i <= lastVisitedColumn ; i++ )
              System.out.print(inputArray[firstVisitedRow][i]+ " ");
          if(firstVisitedRow == lastVisitedRow)
               break;
          firstVisitedRow++;

          //visiting the right column


          for(int i = firstVisitedRow  ;i <= lastVisitedRow ; i++ )
            System.out.print(inputArray[i][lastVisitedColumn]+" ");
          if(firstVisitedColumn == lastVisitedColumn)
              break;
          lastVisitedColumn--;


          //reverse visiting of bottom row

          for(int i = lastVisitedColumn ; i >= firstVisitedColumn ; i--)
              System.out.print(inputArray[lastVisitedRow][i] + " ");
          if(lastVisitedRow == firstVisitedRow)
              break;
           lastVisitedRow--;




          //visiting the left column

          for(int i = lastVisitedRow  ;i>= firstVisitedRow ; i-- )
                System.out.print(inputArray[i][firstVisitedColumn] + " ");
          if(firstVisitedColumn == lastVisitedColumn)
                break;
          firstVisitedColumn++;
        }
    }
}
