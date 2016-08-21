package exercise;
import java.util.*;
public class RentSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("欢迎您使用达达租车系统！");
		System.out.println("请问您是否要使用达达租车系统？");
		System.out.println("1.是         2.否");
		
		Scanner input = new Scanner(System.in);
        if(input.nextInt() != 1){
        	System.out.println("谢谢光临！");
        	input.close();
        	return;
        }
        
        System.out.println("您可租车的类型以及价目表:");
        System.out.println("序号  汽车名  租金  容量");
        PassengerCar car1 = new PassengerCar("奥迪A4", 500, 4);
        PassengerCar car2 = new PassengerCar("马自达6", 400, 4);
        Pickup car3 = new Pickup("皮卡雪6", 450, 4, 2); 
        PassengerCar car4 = new PassengerCar("金龙", 800, 20); 
        Truck car5 = new Truck("松花江", 400, 4); 
        Truck car6 = new Truck("依维柯", 1000, 20);
        
        Auto []cars = {car1,car2,car3,car4,car5,car6};
        for(int a = 0; a < cars.length; a++){
        	System.out.println((a+1)+".   "+cars[a].Display());
        }
        
        System.out.println("请输入您要的租车数量：");
        int b = input.nextInt();
        int []nums = new int[b];
        for(int c=0; c < b; c++){
        	System.out.println("请输入第"+(c+1)+"辆汽车编号：");
        	int d = input.nextInt();
        	if(d >= 1 && d <= 6){
        		nums[c]=d;
        	}else{
        		System.out.println("输入错误！请重新输入！");
        		c--;
        	}
        }
        
        int totalPrice = 0,totalPassengerNum = 0;
        double totalCargoCapacity = 0;
        StringBuffer passengerName = new StringBuffer(); 
        StringBuffer truckName = new StringBuffer();
        
        for(int e = 0; e < nums.length;e++){
        	switch (nums[e]) { 
        	case 1: 
        		passengerName.append(car1.getName() + " "); 
        		totalPrice += car1.getUnitPrice(); 
        		totalPassengerNum += car1.getPassengerNum();
        		break; 
        	case 2:
        		passengerName.append(car2.getName() + " "); 
        		totalPrice += car2.getUnitPrice();
        		totalPassengerNum += car2.getPassengerNum();
        		break; 
        	case 3: 
        		passengerName.append(car3.getName() + " "); 
        		truckName.append(car3.getName() + " "); 
        		totalPrice += car3.getUnitPrice(); 
        		totalPassengerNum += car3.getPassengerNum(); 
        		totalCargoCapacity += car3.getCargoCapacity(); 
        		break;
        	case 4:
        		passengerName.append(car4.getName() + " ");
        		totalPrice += car4.getUnitPrice(); 
        		totalPassengerNum += car4.getPassengerNum(); 
        		break; 
        	case 5: 
        		truckName.append(car5.getName() + " ");
        		totalPrice += car5.getUnitPrice();
        		totalCargoCapacity += car5.getCargoCapacity(); 
        		break; 
        	case 6: 
        		truckName.append(car6.getName() + " ");
        		totalPrice += car6.getUnitPrice();
        		totalCargoCapacity += car6.getCargoCapacity();
        		break; 
        	default:
        		break;
        	}
        }
        
        System.out.println("请输入租车天数："); 
        int days = input.nextInt(); 
        // 输出最后信息 
        System.out.println("您的账单：\n***可载人的车有："); 
        System.out.println(passengerName + "共载人：" + totalPassengerNum + "人"); 
        System.out.println("***载货的车有："); 
        System.out.println(truckName + "共载货：" + totalCargoCapacity + "吨"); 
        System.out.println("***租车的总价格：" + days * totalPrice + "元"); 
        System.out.println("感谢您使用哒哒租车系统");
        
        input.close();
	}
}
