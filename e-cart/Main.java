//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  public void setPrice(int price)
  {
    this.price=price;
  }
  public int getPrice()
  {
    return price;
  }//create various method to return attribute value(s)
}
   
class Customer extends Item
{
  private String product;
  private int quantity;
  public void setProduct(String product)
  {
    this.product=product;
  }
  public String getProduct()
  {
    return product;
  }
  public void setQuantity(int quantity)
  {
    this.quantity=quantity;
  }
  public int getQuantity()
  {
    return quantity;
  }//create various method to return attribute value(s)
}

class Bill extends Customer
{
  public int result(int p,int q)
  {
    int result=p*q;
    return result;
  }//implement your logic to calculate total price
}
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String product=sc.nextLine();
    int price=sc.nextInt();
    int quantity=sc.nextInt();
    
    Item i = new Item();
    Customer c = new Customer();
    i.setPrice(price);
    c.setQuantity(quantity);
    int q=c.getQuantity();
    int p=i.getPrice();
    Bill obj = new Bill();
    int res=obj.result(p,q);
    System.out.println("Total Price is : "+res);
    //write the logic here
  }
}