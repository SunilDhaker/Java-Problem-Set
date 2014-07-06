public class ProblemOne {

    private static int elementFromLast;
    private static  SingleLinkedList<Integer> inputLinkedList;

    public static void main(String args[]) {

        setInput();
        setElementFromLast();
        int result = printElementFromEnd(inputLinkedList , elementFromLast);
        System.out.print(result);
    }

    public static void setInput(){
        /**
         * this method will set the input for the problem
         */

        inputLinkedList = new SingleLinkedList<Integer>();
        inputLinkedList.add(5);
        inputLinkedList.add(25);
        inputLinkedList.add(30);
        inputLinkedList.add(15);
        inputLinkedList.add(20);
        inputLinkedList.add(55);
        inputLinkedList.add(22);
    }


    public static void setElementFromLast(){
        /**
         * this method will set the element from last to be printed
         */

        elementFromLast = 2 ;
    }


    public static int printElementFromEnd(SingleLinkedList<Integer> inputLinkedList , int elementFromLast){
        /**
         * this method will find "elemenFromLst"th element from end return it ..
         */

        int size =  inputLinkedList.size();
        int result = -1 ;
        try{
         result =  inputLinkedList.get(size - elementFromLast);
        }catch (Exception e){
            System.out.println("Array Index Out Of Bound Exception");
        }
        return result ;
    } // prob set 1 ki prob 1
}
