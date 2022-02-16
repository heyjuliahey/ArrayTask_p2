package repository;

import action.ArrayComputation;
import entity.CustomArray;

public class SumSpecification implements Specification {
    @Override
    public boolean specify(CustomArray customArray)
    {
        ArrayComputation arrayComputation = new ArrayComputation();
        int sum = 20;

        boolean result = arrayComputation.sum(customArray) > 20;

        return result;
    }
}
