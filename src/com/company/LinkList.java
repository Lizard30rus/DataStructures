package com.company;

import java.io.IOException;

public class LinkList {
    private Link first;

    public LinkList() {
        this.first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst (int id, double dd)
    {
        Link newLink = new Link(id, dd);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst()
    {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link findKey (int key)
    {
        Link currentLink = first;
        if (currentLink == null)
            return null;
        else
        {
            while (currentLink.iData != key)
            {
                if (currentLink.next == null)
                    return null;
                else
                {
                    currentLink = currentLink.next;
                }
            }
            return currentLink;
        }
    }

    public Link deleteKey (int key)
    {
        Link previousLink = first;
        Link currentLink = first;
        if (previousLink == null)
            return null;
        else
        {
            while (currentLink.iData != key)
            {
                if (currentLink.next == null)
                    return null;
                else
                {
                    previousLink = currentLink;
                    currentLink = currentLink.next;
                }
            }
            if (currentLink == first)
            {
                first = currentLink.next;
            }
            previousLink.next = currentLink.next;
            return currentLink;
        }
    }

    public void displayList(){
       try
       {
           System.out.print("Link: ");
           Link current = first;
           while (current.next != null)
           {
               current.displayLink();
               current = current.next;
           }
           System.out.println(" :Link");
       } catch (Exception e)
       {
           System.out.println("Я Русский!");
       }

    }
}
