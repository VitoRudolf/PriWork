package exercise;

public class PassengerCar  extends Auto{
    private int passengerNum;
    
    public int getPassengerNum(){
    	return passengerNum;
    }
    public void setPassengerNum(int passengerNum){
    	this.passengerNum = passengerNum;
    }
    
    public PassengerCar(String name,int price,int i){
    	super();
    	super.setName(name);
    	super.setUnitPrice(price);
    	this.passengerNum = i;
    }
    
    public String Display(){
    	return this.getName()+" "+
               this.getUnitPrice()+"元/天"+" "+this.passengerNum+"人";
    }
}
