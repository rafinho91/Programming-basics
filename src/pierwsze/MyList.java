package pierwsze;

public class MyList {
    Element head;
    Element tail;
    int count = 0;

    public void displayList(){
        Element currentElement = head;
        do {
            System.out.println(currentElement.toString());
            currentElement = currentElement.getNext();
        }while(currentElement!=null);
    }

    public void removeElement(Element element){
        if (!isEmpty()){
            Element currentElement = head;
            while(currentElement!=null){
                if (currentElement.equals(element)) {
                    Element prevElement = currentElement.getPrevious();
                    Element nextElement = currentElement.getNext();
                    if (prevElement != null){
                        prevElement.setNext(nextElement);
                    }else{
                        head = nextElement;
                    }
                    if (nextElement != null) {
                        nextElement.setPrevious(prevElement);
                    }else {
                        tail = prevElement;
                    }
                    currentElement = null;
                }else {
                    currentElement = currentElement.getNext();
                }
            }
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addElementHead(Element firstElement){
        if (isEmpty()){
            head = firstElement;
            tail = firstElement;
        }else {
            firstElement.setPrevious(head);
            head.setPrevious(firstElement);
            head = firstElement;
        }
        count++;
    }

    public void addElementTail(Element lastElement){
        if (isEmpty()){
            head = lastElement;
            tail = lastElement;
        }else {
            lastElement.setPrevious(tail);
            tail.setNext(lastElement);
            tail = lastElement;
        }
        count++;
    }
}
