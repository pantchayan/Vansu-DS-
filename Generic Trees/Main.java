import java.util.ArrayList;
// RECURSION 
// Basic set:
// size (Number of nodes)
// maximum element
// minimum element
// height -> 2 (distance between root and deepest leaf/leaves)
// sum of tree (sum of all the nodes)


// preOrder array -> Tree construct 
// Find
// Node to Root Path



public class Main {
    static Node root;

    public static class Node{
        int data;
        // -> Node next;

        // (-> x N)
        // Node[] children;
        ArrayList<Node> children;
        // Node(){
        //     // children = new Node[5];
        //     children = new ArrayList<>();
        // }
        Node(int data){
            // this();
            children = new ArrayList<>();
            this.data = data;
        }
    }

    public static void display(Node node){
        // 10 -> 20, 30, 40,
        // 20 -> .
        // 30 -> 50, 60,
        // 50 -> .
        // 60 -> .
        // 40 -> .

        System.out.print(node.data+" -> ");
        
        if(node.children.size()>0){
            for(Node child: node.children){
                System.out.print(child.data+", ");
            }
        }
        else{
            System.out.print(".");
        }

        System.out.println();

        for(Node child: node.children){
            display(child);
        }
    }
    // arraylist_name.add();

    public static void main(String[] args) {
        Node node1 = new Node(10);
        root = node1;

        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(50);
        Node node6 = new Node(60);

        root.children.add(node2);
        root.children.add(node3);
        root.children.add(node4);

        root.children.get(1).children.add(node5);
        root.children.get(1).children.add(node6);

        // node3.children.add(node5);
        // node3.children.add(node6);


        display(root);
    }
}
