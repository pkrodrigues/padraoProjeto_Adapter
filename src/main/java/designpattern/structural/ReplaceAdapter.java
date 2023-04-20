package designpattern.structural;

public class ReplaceAdapter extends Points{
    private IReplace replaceSpent;

    public ReplaceAdapter(IReplace replaceSpent){
        this.replaceSpent = replaceSpent;
    }

    public double replaceRecover(){
        return (double) Math.round(this.getPoints()/1.5);
    }

    public void replaceSave(){
        this.setPoints((int) Math.round(replaceSpent.getReplace()*1.5));
    }
}
