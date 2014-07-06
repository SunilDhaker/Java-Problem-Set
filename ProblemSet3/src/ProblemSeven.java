public class ProblemSeven {

    private static SingleLinkedList<Integer> inputLinkedList;

    public static  void main(String args[]){

        setInput();
        System.out.print(isEvenLength(inputLinkedList) ? "Length is even " : "length is odd");
    }

    public static void setInput() {
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
        inputLinkedList.add(10);
    }


    public static boolean isEvenLength(SingleLinkedList<Integer> inputLinkedList){
        /**
         * this method will check if the length of the inputLinked list is even or not without using a counter
         */

        SingleLinkedList<Integer>.Node odd = inputLinkedList.getNode(0);
        SingleLinkedList<Integer>.Node even ;
        while(true){
            if(odd.next == null)
                return false ;
            even = odd.next;
            if(even.next == null)
                return  true ;
            odd = even.next ;
        }
    }
}