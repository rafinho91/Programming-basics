package pierwsze;

public class Element {
    Element previous;
    Element next;
    Integer value;

    @Override
    public String toString() {
        return "Element{" +
                "value=" + value +
                '}';
    }

    public Element(Integer value) {
        this.value = value;
    }

    public Element getPrevious() {
        return previous;
    }

    public void setPrevious(Element previous) {
        this.previous = previous;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
