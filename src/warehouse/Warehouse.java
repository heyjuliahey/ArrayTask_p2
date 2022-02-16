package warehouse;

import entity.ArrayValues;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private Map<Long, ArrayValues> arrayValuesMap = new HashMap<>();
    private static Warehouse warehouse = new Warehouse();

    public static Warehouse getWarehouse()
    {
        return warehouse;
    }

    public ArrayValues putArrayValues(long id, ArrayValues arrayValues)
    {
        return arrayValuesMap.put(id, arrayValues);
    }

    public ArrayValues removeArrayValue(long id)
    {
        return arrayValuesMap.remove(id);
    }

    public ArrayValues getArrayValues(long id)
    {
        return arrayValuesMap.get(id);
    }
}
