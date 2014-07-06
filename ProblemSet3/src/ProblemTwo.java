
public class ProblemTwo {
    private static  SingleLinkedList<Integer> inputLinkedList ;

    public static void main(String args[]){

        setInput();
        System.out.println(checkCyclic(inputLinkedList));
        removeLoop(inputLinkedList);
        System.out.println(checkCyclic(inputLinkedList));
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
        inputLinkedList.getNode(inputLinkedList.size() -1).next = inputLinkedList.getNode(0);// makingg linked list cyclic !!

    }


    public static  boolean checkCyclic(SingleLinkedList<Integer> inputLinkedList){
        /**
         * this method will check if the given input linked list is cyclic orr not ??
         */
        SingleLinkedList<Integer>.Node temp = inputLinkedList.getNode(0);
        SingleLinkedList<Integer>.Node start =temp;
        while (true){
           temp =temp.next;
            if(temp == null)
                return false;
            else if (temp == start)
                return true;

        }
    }

    public static void  removeLoop(SingleLinkedList<Integer> inputLinkedList){
        /**
         * this method will remove the loop if it is cyclic !!
         */

        if(checkCyclic(inputLinkedList)){

            SingleLinkedList<Integer>.Node temp = inputLinkedList.getNode(0);
            SingleLinkedList<Integer>.Node start =temp;
            while (temp.next != start){
                temp =temp.next;
            }
            temp.next = null ;
        }
    }
}
