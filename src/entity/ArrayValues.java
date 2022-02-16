package entity;

public class ArrayValues {
    private int sum;
    private int average;
    private int min;
    private int max;

    public ArrayValues(int sum, int average, int min, int max)
    {
        this.sum = sum;
        this.average = average;
        this.min = min;
        this.max = max;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
