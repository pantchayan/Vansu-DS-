public class Main {
    

    public static class LinkedList {
        Node head;

        public static class Node {
            Node next;
            int data;

            Node(int data) {
                this.data = data;
            }
        }

        public boolean isSimilar(Node head1, Node head2) {
            boolean flag = true;
            Node temp1 = head1;
            Node temp2 = head2;
            while (temp1 != null && temp2 != null) {
                if(temp1.data != temp2.data){
                    flag = false;
                    break;
                }

                temp1 = temp1.next;
                temp2 = temp2.next;
            }

            if(temp1!=null || temp2!=null){
                flag =false;
            }
            // 1->2
            // 1->2->3
            return flag;
        }

    }

    public static void main(String[] args) {
        // LINKEDLIST 1
        LinkedList l1 = new LinkedList();

        LinkedList.Node node1 = new LinkedList.Node(10);

        LinkedList.Node node2 = new LinkedList.Node(20);

        l1.head = node1;
        l1.head.next = node2;

        // LINKEDLIST 2
        LinkedList l2 = new LinkedList();

        LinkedList.Node node3 = new LinkedList.Node(10);

        LinkedList.Node node4 = new LinkedList.Node(20);

        l2.head = node3;
        l2.head.next = node4;

        // class is a blueprint of an object
        System.out.println(l1.isSimilar(l1.head,l2.head));
        System.out.println(l2.isSimilar(l1.head,l2.head));

    }
}