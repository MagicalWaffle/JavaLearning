package CarpetCostCalculator;

public class Calcuator {

   private  Floor floor;
   private Carpet carpet;

   public Calcuator(Floor floor, Carpet carpet){
       this.floor=floor;
       this.carpet=carpet;
   }

    public double getTotalCost(){
        double area,cost;
        area= floor.getArea();
        cost= carpet.getCost();

        return area*cost;
    }
}
