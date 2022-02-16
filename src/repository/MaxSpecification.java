package repository;

import action.ArraySearch;
import entity.CustomArray;

public class MaxSpecification implements Specification {
    @Override
    public boolean specify(CustomArray customArray) {
        ArraySearch arraySearch = new ArraySearch();

        boolean result = arraySearch.max(customArray) > 10;

        return result;
    }
}
