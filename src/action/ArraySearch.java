package action;

import entity.CustomArray;

public class ArraySearch {
    public int min(CustomArray array)
    {
        int min = array.getElement(0);
        int size = array.getSize();

        for(int i = 1; i < size; i++)
        {
            int current = array.getElement(i);

            if(current < min)
            {
                min = current;
            }
        }
        return min;
    }

    public int max(CustomArray array)
    {
        int max = array.getElement(0);
        int size = array.getSize();

        for(int i = 1; i < size; i++)
        {
            int current = array.getElement(i);

            if(current > max)
            {
                max = current;
            }
        }
        return max;
    }
}
