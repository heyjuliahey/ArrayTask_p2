package observer;

import entity.CustomArray;

import java.util.EventObject;

public class ArrayEvent extends EventObject {
    public ArrayEvent(CustomArray customArray)
    {
        super(customArray);
    }

    public CustomArray getSource()
    {
        return (CustomArray)super.getSource();
    }
}
