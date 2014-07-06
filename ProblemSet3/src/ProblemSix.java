public class ProblemSix {

    private static  SingleLinkedList<Integer> inputLinkedList;
    public static void main(String args[]) {

        setInput();
        printLinkedListFromLast(inputLinkedList);
    }

    private static void printLinkedListFromLast(SingleLinkedList<Integer> inputLinkedList) {

        for(int i = 0 ; i < inputLinkedList.size() ; i++){
            System.out.print(inputLinkedList.get(inputLinkedList.size() - 1 - i) + "<-");
        }
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
