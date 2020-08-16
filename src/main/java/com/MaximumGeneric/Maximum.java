package com.MaximumGeneric;

public class Maximum<E extends Comparable> {
    E[] inputArray;

    public Maximum(E[] inputArray) {
        this.inputArray = inputArray;
    }

    public E getMax(E[] inputArray) {
        E max = inputArray[0];
        for ( int i = 1; i < inputArray.length; i++ )
            if ( inputArray[i].compareTo(max) > 0 )
                max = inputArray[i];
        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray={1,2,3};
        Float[] floatsArray={1.1f,2.2f,3.3f,4.4f};
        String[] stringsArray={"apple","banana","orange","mango"};

        Comparable maxInt = new Maximum(intArray).getMax(intArray);
        Comparable maxFloat = new Maximum(floatsArray).getMax(floatsArray);
        Comparable maxString = new Maximum(stringsArray).getMax(stringsArray);
    }
}