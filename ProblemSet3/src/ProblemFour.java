public class ProblemFour {


    private static SingleLinkedList<Integer> inputLinkedList1 ;
    private  static SingleLinkedList<Integer> inputLinkedList2 ;
    public static void main(String args[]){

        setInput();
        SingleLinkedList<Integer>.Node ans = findIntersectionNode(inputLinkedList1 , inputLinkedList2);
        System.out.println(ans.data);
    }


    public static void setInput(){
        /**
         * this method will set the input for the problem ie. linked list will be merged at 3rd node !
         */

        inputLinkedList1 = new SingleLinkedList<Integer>();
        inputLinkedList1.add(5);
        inputLinkedList1.add(25);
        inputLinkedList1.add(30);
        inputLinkedList1.add(15);
        inputLinkedList1.add(20);
        inputLinkedList1.add(55);
        inputLinkedList1.add(22);
        inputLinkedList1.add(24);

        inputLinkedList2 = new SingleLinkedList<Integer>();
        inputLinkedList2.add(55);
        inputLinkedList2.add(48);
        inputLinkedList2.add(2);
        inputLinkedList2.getNode(inputLinkedList2.size() - 1).next = inputLinkedList1.getNode(3);

    }


    private static SingleLinkedList<Integer>.Node findIntersectionNode(SingleLinkedList<Integer> inputLinkedList1, SingleLinkedList<Integer> inputLinkedList2) {
        /**
         * this method will return the common node !!!
         */

         SingleLinkedList<Integer>.Node start1 = inputLinkedList1.getNode(0);
         SingleLinkedList<Integer>.Node start2  = inputLinkedList2.getNode(0);
        SingleLinkedList<Integer>.Node start = start2;

         while(start1 != null){
             start2 = start ;
             while (start2 != null){
                 if(start2 == start1)
                     return  start1;
                 start2 = start2.next ;
             }
            start1 = start1.next ;
         }

        return null;
    }

}
