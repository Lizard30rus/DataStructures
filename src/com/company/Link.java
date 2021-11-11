package com.company;

public class Link {
    public int iData;         //Данные
    public double dData;      //Данные
    public Link next;        //Следующий элемент списка

    public Link(int id, double dd) {
        this.iData = id;
        this.dData = dd;
        this.next = null;
    }

    public void displayLink()
    {
        System.out.print("{" + iData + ". " + dData + "} ");
    }
}
