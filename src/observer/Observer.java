package observer;

import action.ArrayComputation;
import action.ArraySearch;
import entity.ArrayValues;
import entity.CustomArray;
import warehouse.Warehouse;

public class Observer {
    public void valueChanged(ArrayEvent arrayEvent)
    {
        CustomArray customArray = arrayEvent.getSource();
        Warehouse warehouse = Warehouse.getWarehouse();
        ArrayValues arrayValues = warehouse.getArrayValues(customArray.getId());
        ArrayComputation arrayComputation = new ArrayComputation();
        ArraySearch arraySearch = new ArraySearch();

        int sum = arrayComputation.sum(customArray);
        int average = arrayComputation.average(customArray);
        int min = arraySearch.min(customArray);
        int max = arraySearch.max(customArray);

        arrayValues.setSum(sum);
        arrayValues.setAverage(average);
        arrayValues.setMin(min);
        arrayValues.setMax(max);
    }
}
