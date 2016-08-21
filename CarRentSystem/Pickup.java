package exercise;

public class Pickup extends Auto{
    private int passengerNum;
    private double cargoCapacity;
    

    public int getPassengerNum(){
    	return passengerNum;
    }
    public void setPassengerNum(int passengerNum){
    	this.passengerNum = passengerNum;
    }
	public double getCargoCapacity(){
		return cargoCapacity;
	}
    public void setCargoCapacity(double cargoCapacity){
    	this.cargoCapacity = cargoCapacity;
    }
    
    public Pickup(String name,int price,int i,int m){
    	super();
    	super.setName(name);
    	super.setUnitPrice(price);
    	this.cargoCapacity=m;
    	this.passengerNum=i;
    }
    public String Display(){
    	return this.getName()+" "+
               this.getUnitPrice()+"元/天"+" "+this.passengerNum+"人"+" "+
    		   this.cargoCapacity+"吨";
    }
}
