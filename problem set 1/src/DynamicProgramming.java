public class DynamicProgramming{

    private static int n;
    public static void main(String[] args) {

        setInput();
        System.out.println(noOfWaysToGoToDiagonalEnd(n));
    }

    public static void setInput(){

        n = 3;
    }


    public static int noOfWaysToGoToDiagonalEnd(int n){
        /**
         * here n is the dimension of the grid i.e n*n grid
         */
        //***********ALGORITHM***********//
        // total no of ways ::
        // starting from top|left corner there is only one point ..
        // no of ways to go to next point is 2C1
        // so now we are on next point that can be either 0,1 or 1,0(no of points 2)
        // for each of these two point they can go either right or bottom  : no of case 2 * 2C1
        // now we are on where x + y = 2 (i.e  0,2 or 1,1 or 2,0 )
        // for each point we have 2 ways either right or bottom : no of ways = 3 * 2C1
        // this goes until diagonal is reached ( x+y = n )
        // after this 2 points will only one way to go (ie point at bottom will only go to right and point at right can only go to dawn) so the no of case to next step after diagonal points =     (2 * 1 + (n -1 -2 ) * 2C1
        // this will go on untill last point is reached
        // all these case should multiplied as each case is subcase of a case from last step
        // 2C1 == 2

        int noOfWays = 1;
        // before diagonal is reached
        for(int i = 1 ; i < n ; i++){
            noOfWays = noOfWays + (2 * i) ;
        }
        //after diagonal
        for (int i = n ; i > 1 ; i --) {
            noOfWays = noOfWays  +  ( 2 + ( i - 2 ));
        }
        return noOfWays;
    }
}