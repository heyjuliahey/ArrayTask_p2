package action;

import entity.CustomArray;

public class ArrayComputation {
    public int sum(CustomArray array)
    {
        int sum = 0;
        int size = array.getSize();

        for(int i = 0; i < size; i++)
            sum += array.getElement(i);

        return sum;
    }

    public int average(CustomArray array)
    {
        int sum = sum(array);

        return sum / array.getSize();
    }
}
