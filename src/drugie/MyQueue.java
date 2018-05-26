package drugie;

public class MyQueue {
    private Element head;
    private Element tail;
    private int count;

    public boolean isEmpty(){
        return head == null;
    }

    public void add(Element elementToAdd){
        if (isEmpty()){
            head = elementToAdd;
            tail = elementToAdd;
        } else {
            Element currentLast = tail;
            currentLast.setNext(elementToAdd);
            tail = elementToAdd;
        }
        count++;
    }

    public Element remove(){
        Element currentHead = this.head;
        if(currentHead == null){
            return null;
        }
        this.head = currentHead.getNext();
        count--;
        return currentHead;
    }
}
