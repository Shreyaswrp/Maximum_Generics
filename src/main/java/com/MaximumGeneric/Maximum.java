package com.MaximumGeneric;

public class Maximum <E extends Comparable>{
    E firstValue;
    E secondValue;
    E thirdValue;

    public Maximum(E firstValue, E secondValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public  E getMax() {
        if ( firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0 )
            return firstValue;
        else if ( secondValue.compareTo(firstValue) > 0 && secondValue.compareTo(thirdValue) > 0 )
            return secondValue;
        else
            return thirdValue;
    }
}
