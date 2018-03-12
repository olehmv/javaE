package epam.course.java.graph;

import java.util.ArrayList;
import java.util.List;

public class Node implements Comparable<Node> {

    String name;
    Node parent;
    List<Node> childrent=new ArrayList<>();
    Node(String name,Node parent){
        this.parent=parent;
        this.name=name;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Node o) {
        return 0;
    }
}
