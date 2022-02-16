package repository;

import entity.CustomArray;

public class IdSpecification implements Specification {
    private long id;

    public IdSpecification(long id)
    {
        this.id = id;
    }

    @Override
    public boolean specify(CustomArray customArray)
    {
        boolean result = customArray.getId() == id;
        return result;
    }
}
