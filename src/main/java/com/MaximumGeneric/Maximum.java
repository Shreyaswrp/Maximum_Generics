package com.MaximumGeneric;

public class Maximum {
    public Integer getMaxInt(Integer[] intArray) {
        if ( intArray[0].compareTo(intArray[1]) > 0 && intArray[0].compareTo(intArray[2]) > 0 )
            return intArray[0];
        else if ( intArray[1].compareTo(intArray[0]) > 0 && intArray[1].compareTo(intArray[2]) > 0 )
            return intArray[1];
        else
            return intArray[2];
    }
}
