package drugie;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    Node parent;
    List<Node> children;
    T data;

    public Node(Node parent, T data) {
        this.data = data;
        this.parent = parent;
        this.children = new ArrayList<>();
    }

    public void addChild (Node node){
        node.setParent(this); //this to node dla ktorego wywolujemy te funkcje
        children.add(node);
    }

    public T getData(){
        return data;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}
