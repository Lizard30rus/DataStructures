package com.company;
//Приоритетная очередь, реализованная по возрастанию приоритетов
public class PriorityQ {
    private int maxSize;
    private int[] prArray;
    private int nItems;

    public PriorityQ(int size) {
        maxSize = size;
        nItems = 0;           //количество элементов
        prArray = new int[maxSize];
    }

    public void insert(int value)
    {
        int j;

        if (nItems == 0)
            prArray[nItems++] = value;
        else
        {
            for(j = nItems - 1; j >= 0; j--)
            {
                if (value > prArray[j])
                    prArray[j+1] = prArray[j];
                else
                    break;
            }
            prArray[j+1] = value;
            nItems++;
        }
    }

    public void display()
    {
        for (int i = 0; i < nItems; i++)
        {
            System.out.print(prArray[i] +  " ");
        }
    }

    public int remove()   //Извлечение минимального элемента
    {
        return prArray[--nItems];
    }

    public int peelMin()
    {
        return prArray[nItems - 1];
    }

    public boolean isEmpty()
    {
        return (nItems == 0);
    }

    public boolean isFull()
    {
        return (nItems == maxSize);
    }


}
