package drugie.completeTree;

public class Node {
    private Integer index;
    private String value;

    public Node(String value) {
        this.value = value;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return value;
    }
}
