public class Car {

int car_no ; // to specify the number of the car

string model; // Model of the car

double rate; // rate of the car

boolean isrunning; // to tell if the car is running or not

 public Car() {
 
car_no =4563; 

model= “Maruti Suzuki ”; 

 rate=500000.00; 

isrunning = false;
}

public Car( int x, String str, double y)
 { 
car_no = x; 

model = str; 

rate = y; 

isrunning = false;

}

//function called to know the status of the car

void status(Car sk) {

System.out.println("Here is a car..!"); 

System.out.println(“Model:”+sk.model);

System.out.println(“Car No:”+sk.car_no):

System.out.println(“Price:”+sk.rate);

if(isrunning==true)

System.out.println(“The car is Running...!”);

else 

System.out.println(“Oops..! The car is not running...!”);


} 
