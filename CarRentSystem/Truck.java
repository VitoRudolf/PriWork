package exercise;

public class Truck extends Auto {
	private double cargoCapacity;
	
	public double getCargoCapacity(){
		return cargoCapacity;
	}
    public void setCargoCapacity(double cargoCapacity){
    	this.cargoCapacity = cargoCapacity;
    }
    
    public Truck(String name,int price,double i){
    	super();
    	super.setName(name);
    	super.setUnitPrice(price);
    	this.cargoCapacity = i;
    }
    
    public String Display(){
    	return this.getName()+" "+
               this.getUnitPrice()+"元/天"+" "+this.cargoCapacity+"吨";
    }
}
