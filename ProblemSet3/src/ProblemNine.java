public class ProblemNine {

    private static  SingleLinkedList<Integer> inputLinkedList;
    public static void main(String args[]) {

        setInput();
        reverseLinkedLisInPair(inputLinkedList);
        System.out.print(inputLinkedList);
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


    private static void reverseLinkedLisInPair(SingleLinkedList<Integer> inputLinkedList) {

        int size = inputLinkedList.size();
        SingleLinkedList<Integer>.Node temp1 , temp2 ;
        //TODO :: take care of the case when size is less than 3
        //swaping first two element
        temp1 = inputLinkedList.getNode(0);
        inputLinkedList.setStart(inputLinkedList.getNode(1));
        temp2 = inputLinkedList.getNode(1);
        inputLinkedList.getNode(0).next =temp1;
        inputLinkedList.getNode(0).next.next = temp2 ;

        for(int i = 2 ; i < inputLinkedList.size() ; i+=2){
            if(inputLinkedList.getNode(i).next == null) // taking care of the case when odd size is there
                break ;
            temp1 = inputLinkedList.getNode(i-1);
            temp2 = inputLinkedList.getNode(i);
            temp1.next = temp2.next;
            temp2.next = temp2.next.next;
            temp1.next.next = temp2 ;

        }
    }
}