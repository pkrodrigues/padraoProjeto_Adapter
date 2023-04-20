package designpattern.structural;

public class Guest {
   IReplace spent;
   ReplaceAdapter converter;

   public Guest(){
      spent = new Spent();
      converter = new ReplaceAdapter(spent);
   }
   public void setSpent(double guestValue){
      spent.setReplace(guestValue);
      converter.replaceSave();
   }

   public double getSpent(){
      return converter.replaceRecover();
   }

   public int getPoints(){
      return converter.getPoints();
   }
}
