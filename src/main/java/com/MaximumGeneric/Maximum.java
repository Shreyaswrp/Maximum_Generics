package com.MaximumGeneric;

public class Maximum<E extends Comparable> {
    E[] inputArray;

    public Maximum(E[] inputArray) {
        this.inputArray = inputArray;
    }

    public void getMax(E[] inputArray) {
        E max = inputArray[0];
        for ( int i = 1; i < inputArray.length; i++ )
            if ( inputArray[i].compareTo(max) > 0 )
                max = inputArray[i];
        printMax(max);
    }
    public void printMax(E max){
        System.out.println("The max value is: "+max);
    }

    public static void main(String[] args) {
        Integer[] intArray={1,2,3};
        Float[] floatsArray={1.1f,2.2f,3.3f,4.4f};
        String[] stringsArray={"apple","banana","orange","mango"};

         new Maximum(intArray).getMax(intArray);
         new Maximum(floatsArray).getMax(floatsArray);
         new Maximum(stringsArray).getMax(stringsArray);
    }
}