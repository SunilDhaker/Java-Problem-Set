public class ProblemFive {

    private static  SingleLinkedList<Integer> inputLinkedList;
    public static void main(String args[]) {

        setInput();
        int result = findMiddleOfLinkedList(inputLinkedList);
        System.out.print(result);
    }

    private static int findMiddleOfLinkedList(SingleLinkedList<Integer> inputLinkedList) {
        /**
         * This method will find the middle element of the given linked list
         */

        return inputLinkedList.get(inputLinkedList.size()/2);
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

}
