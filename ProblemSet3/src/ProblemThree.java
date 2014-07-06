public class ProblemThree {

    private  static SingleLinkedList<Integer> inputLinkedList;

    public static void main(String args[]){

       setInput();
       System.out.println(inputLinkedList);
       reverceLinkedList(inputLinkedList);
       System.out.println(inputLinkedList);
    }

    private static void reverceLinkedList(SingleLinkedList<Integer> inputLinkedList) {
        /**
         * this method will reverse the given input linked list in place !!
         */

        SingleLinkedList<Integer>.Node last = inputLinkedList.getNode(inputLinkedList.size() -1);
        SingleLinkedList<Integer>.Node start = last ;
        int size = inputLinkedList.size();

        for(int i = 0 ; i < size -1 ; i ++){
            last.next = inputLinkedList.getNode(size - 2 - i);
            last = last.next;
        }
        last.next = null ;
        inputLinkedList.setStart(start);
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
        inputLinkedList.add(24);
    }
}
