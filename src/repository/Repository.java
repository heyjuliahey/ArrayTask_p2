package repository;

import entity.CustomArray;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Repository {
    private List<CustomArray> arrays;

    public boolean add(CustomArray a) { return arrays.add(a); }

    public boolean addAll(Collection<? extends CustomArray> a) { return arrays.addAll(a); }

    public boolean remove(CustomArray a) { return arrays.remove(a); }
    public boolean removeAll(Collection<? extends CustomArray> a) { return arrays.removeAll(a); }

    public CustomArray getArray(int index) { return arrays.get(index); }
    public void setArrays(int index, CustomArray a) { arrays.set(index, a); }

    public void query(Specification specification)
    {
        for(int i = 0; i < arrays.size(); i++)
        {
            if(!specification.specify(arrays.get(i)))
                arrays.remove(arrays.get(i));
        }
    }

    public void streamQuery(Specification specification)
    {
        List<CustomArray> list = arrays.stream().filter(o -> specification.specify(o)).collect(Collectors.toList());
    }
}
