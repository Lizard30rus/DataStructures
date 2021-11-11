import java.util.ListIterator;

public class LinkList {

    private Link first;

    public LinkList() {
        this.first  = null;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public Link getFirst() {
        return first;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public CustomLIstIterator getIterator()
    {
        return new CustomLIstIterator(this);
    }

    public void displayList()
    {
        Link current = first;
        while (current != null)
        {
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }
}
