package comparator;

import action.ArrayComputation;
import entity.CustomArray;

import java.util.Comparator;

public class SumComparator implements Comparator <CustomArray> {
    public int compare(CustomArray arr1, CustomArray arr2)
    {
        ArrayComputation arrayComputation = new ArrayComputation();
        return arrayComputation.sum(arr1) - arrayComputation.sum(arr2);
    }
}
