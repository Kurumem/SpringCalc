package entities;

public class CalcEntity {
    private double value;



    private double first;
    private double sec;


    public CalcEntity(double first, double sec, double value){

        this.value = value;
        this.first = first;
        this.sec = sec;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getFirst() {
        return first;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public double getSec() {
        return sec;
    }

    public void setSec(double second) {
        this.sec = second;
    }



}
