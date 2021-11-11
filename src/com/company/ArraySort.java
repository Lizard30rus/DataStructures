package com.company;

public class ArraySort {
    private int[] array;
    private int nElms;
    private boolean isFull;
    private boolean isEmpty;

    public ArraySort(int size) {
        array = new int[size];
        nElms = 0;
        isFull = false;
        isEmpty = true;
    }

    public void insert (int value) throws ArrayIndexOutOfBoundsException
    {
        try {
            array[nElms] = value;
            nElms++;
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Insert failed!");
        }
    }

    public void display()
    {
        System.out.print("[ ");
        for (int i = 0; i < nElms; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    public void BubbleSort(){
        int i, j;
        for (j = nElms-1; j > 1; j--)
        {
            for (i = 0; i < j; i++)
            {
                if (array[i] > array[i+1])
                    swap(i, i+1);
            }
        }
    }

    public void SelectSort()
    {
        int in, out, min;
        for (out = 0; out < nElms - 1; out++)
        {
            min = out;
            for (in = out+1; in < nElms; in++)
            {
                if (array[in] < array[min])
                    array[min] = array[in];
            }
            swap(in,min);
        }
    }

    public void InsertSort()
    {
        int in, out;

        for (out =1; out < nElms; out++)
        {
            int temp = array[out];
            in = out;
            while (in > 0 && array[in - 1] >= temp)
            {
                array[in] = array[in-1];
                --in;
            }
            array[in] = temp;
        }
    }

    private void swap (int one, int two)
    {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}
