public class Main {
	public static void main(String[] args) {
	   Customers obj1 = new Customers();
       obj1.Customers(1001,"Saakshi",9000000000L,"Bangalore","16-Jul-1990",'F',"Lakme Kajal,Salwar");
       Customers obj2 = new Customers(); 
       obj2.Customers(1008,"Rahul",9000000001L,"Chennai","27-Jan-1992",'M',"T-Shirt,Jeans");
       Suppliers obj3 = new Suppliers();
       obj3.Suppliers(7901,"ABC Traders",8000000000L,"Mumbai",10,"Paid",4.75f);
       Suppliers obj4 = new Suppliers();
       obj4.Suppliers(7972,"XYZ Enterprises",8000000900L,"Kolkata",7,"Unpaid",4.35f);
       obj1.displayProfileDetails();
       obj2.displayProfileDetails();
       obj3.displayProfileDetails();
       obj4.displayProfileDetails();
       obj1.editAddress("Coimbatore");
       obj3.editAddress("Delhi");
       obj1.placeOrder();
       obj3.increaseStockLevel(5);
       obj4.increaseStockLevel(10);//write the logic for the main function
    }	
}

class Users {
  int id;
  String name;
  long mobileNumber;
  String address;
  public void editAddress(String add)
  {
    System.out.println(name+", "+address);
    this.address=add;
    System.out.println(name+", "+address);
  }
  public void displayProfileDetails()
  {
    System.out.println(name+", "+mobileNumber);
  }//write the logic for the class Users	      
}

class Customers extends Users{
		String dateOfBirth;
        char gender;
        String orderHistory;
  public void Customers(int id,String name,long mobileNumber,String address,String dateOfBirth,char gender,String orderHistory)
  {
    this.id=id;
    this.name=name;
    this.mobileNumber=mobileNumber;
    this.address=address;
    this.dateOfBirth=dateOfBirth;
    this.gender=gender;
    this.orderHistory=orderHistory;
  }
  public void placeOrder()
  {
    System.out.println("Order placed successfully!");
  }//write the logic for the class Customers	
}

class Suppliers extends Users {
   int itemStock;
   String paymentStatus;
   float feedback;
   public void Suppliers(int s,String n,long m,String a,int i,String p,float f)
  {
    this.id=s;
    this.name=n;
    this.mobileNumber=m;
    this.address=a;
    this.itemStock=i;
    this.paymentStatus=p;
    this.feedback=f;
   }
  public void increaseStockLevel(int stock)
  {
    System.out.println(name+", "+(itemStock+stock));
  }//write the logic for the class Suppliers
}