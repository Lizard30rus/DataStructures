




public class Link {
    public long dData;
    public Link next;

    public Link(long dData) {
        this.dData = dData;
        next = null;
    }

    public void displayLink()
    {
        System.out.println(dData + " ");
    }
}


