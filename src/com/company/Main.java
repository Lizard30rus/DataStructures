package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        LinkList theList = new LinkList();
        theList.insertFirst(22,2.99);
        theList.insertFirst(44,3.99);
        theList.insertFirst(66,4.99);
        theList.insertFirst(88,5.99);
        theList.displayList();

        while (!theList.isEmpty())
        {
            Link aLink = theList.deleteFirst();
            System.out.print("Deleted: ");
            aLink.displayLink();
            System.out.println();
        }
        theList.displayList();

    }
}
