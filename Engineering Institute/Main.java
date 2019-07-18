//import required packages
import java.util.Scanner;
class Faculty
{
  public void salary(int baseSalary)
  {
    System.out.println("Base Salary: "+baseSalary);//write your Faculty class statements
  }
}
class CSE extends Faculty
{
  public void salary(int baseSalary)
  {
     System.out.println("CSE Faculty: "+(baseSalary+3000));//write your CSE class statements
  }
}
class IT extends Faculty
{
  public void salary(int baseSalary)
  {
    System.out.println("IT Faculty: "+(baseSalary+5000));//write your IT class statements
  }
}
class ECE extends Faculty
{
  public void salary(int baseSalary)
  {
    System.out.println("ECE Faculty: "+(baseSalary+4500));//write your ECE class statements
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int baseSalary=sc.nextInt();
    if(baseSalary>0)
    {
      Faculty f=new Faculty();
      f.salary(baseSalary);
      CSE c=new CSE();
      c.salary(baseSalary);
      IT i=new IT();
      i.salary(baseSalary);
      ECE obj = new ECE();
      obj.salary(baseSalary);
    }
    else
    {
      System.out.println("Null");
    }
    //implement your required concept here
  }
}