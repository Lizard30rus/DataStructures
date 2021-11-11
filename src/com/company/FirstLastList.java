package com.company;

public class FirstLastList {
    private Link first;
    private Link last;

    public FirstLastList() {
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int iData, double dData)
    {
        Link newLink = new Link(iData, dData);
        if (isEmpty())
            last = newLink;
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(int iData, double dData)
    {
        Link newLink = new Link(iData, dData);
        if (isEmpty())
            first = newLink;
        else
            last.next = newLink;
        last = newLink;
    }
}
