package drugie.binaryTree;

public class Tree {
    public static void main(String[] args) {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");
        Node nodeG = new Node("G");

        nodeA.addLeftChild(nodeB);
        nodeA.addRightChild(nodeC);

        nodeB.addLeftChild(nodeD);
        nodeB.addRightChild(nodeE);

        nodeC.addLeftChild(nodeF);
        nodeC.addRightChild(nodeG);

        System.out.println(heightOfTree(nodeA));

        printPreOrder(nodeA);
        System.out.println();
        printInOrder(nodeA);
        System.out.println();
        printPostOrder(nodeA);
    }

    private static int heightOfTree(Node node){
        if(node == null) {
            return 0;
        }
        int leftHeight = heightOfTree(node.getLeft());
        int rightHeight = heightOfTree(node.getRight());
        return Math.max(leftHeight, rightHeight) + 1;

    }

    private static void printPreOrder (Node node){
        System.out.print(node.toString() + " ");
        if (node.getLeft() != null){
            printPreOrder(node.getLeft());
        }
        if (node.getRight() != null){
            printPreOrder(node.getRight());
        }
    }
    private static void printInOrder (Node node){
        if (node.getLeft() != null){
            printInOrder(node.getLeft());
        }
        System.out.print(node.toString() + " ");
        if (node.getRight() != null){
            printInOrder(node.getRight());
        }
    }
    private static void printPostOrder (Node node){
        if (node.getLeft() != null){
            printPostOrder(node.getLeft());
        }
        if (node.getRight() != null){
            printPostOrder(node.getRight());
        }
        System.out.print(node.toString() + " ");
    }
}
