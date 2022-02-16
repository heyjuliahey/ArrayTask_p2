package comparator;

import entity.CustomArray;

import java.util.Comparator;

public class IdComparator implements Comparator<CustomArray> {
    public int compare(CustomArray arr1, CustomArray arr2)
    {
        return Long.compare(arr1.getId(), arr2.getId());
    }
}
