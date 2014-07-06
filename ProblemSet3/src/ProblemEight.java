public class ProblemEight {

     private  static SingleLinkedList<Integer> inputLinkedList1 ;
     private static  SingleLinkedList<Integer> inputLinkedList2 ;
    public static void main(String args[]){

        setInput();
        mergeSortedLinkedList(inputLinkedList1 , inputLinkedList2);
        System.out.println(inputLinkedList1);
    }

    public static void setInput(){
        /**
         * as alwAYS this will set the input :)
         */

        inputLinkedList1 = new SingleLinkedList<Integer>();
        inputLinkedList1.add(1);
        inputLinkedList1.add(3);
        inputLinkedList1.add(5);
        inputLinkedList1.add(7);
        inputLinkedList2 = new SingleLinkedList<Integer>();
        inputLinkedList2.add(2);
        inputLinkedList2.add(4);
        inputLinkedList2.add(6);
        inputLinkedList2.add(8);
        inputLinkedList2.add(10);
    }


    public static void mergeSortedLinkedList(SingleLinkedList<Integer> inputLinkedList1 , SingleLinkedList<Integer> inputLinkedList2){
        /**
         * this method will be merge inputLinkedList2 in inputLinkedList1 such that its make sure that final linked list is sorted
         */

        SingleLinkedList<Integer>.Node currentNode1 = inputLinkedList1.getNode(0);
        SingleLinkedList<Integer>.Node temp;
        SingleLinkedList<Integer>.Node currentNode2 = inputLinkedList2.getNode(0);
        while(true){
            if(currentNode1.next ==null) {
                currentNode1.next = currentNode2 ;
                return;
            }
            if(currentNode2.next ==null) {
                return;
            }

            if(currentNode2.data < currentNode1.data) {   // this case will occur only when first element of 2nd_LL is smaller then that of 1st_LL
               currentNode2.next = currentNode1;
               currentNode1 = currentNode2;
               inputLinkedList1.setStart(currentNode1);
            }else if(currentNode1.next.data >= currentNode2.data){

                temp = currentNode1.next ;
                currentNode1.next = currentNode2;
                currentNode2 = currentNode2.next ;
                currentNode1.next.next = temp;
            }else {
                currentNode1  = currentNode1.next ;
            }
        }
      }
}
