package designpattern.structural;

public class Spent implements IReplace {
    private double value;

    @Override
    public double getReplace(){
        return this.value;
    }

    @Override
    public void setReplace(double value){
        this.value = value;
    }

}
