package com.variables;
interface Sports
{
  // can't define instances
//final, static, abstract
// can't use concrete or instance attributes
	public abstract void run();
	public void play();
	public void takeRest();
}
 
interface Academic extends Sports
{
	public void attendance();
	public void score();
 
	default void additionalMark()
	{
	System.out.println(" add extra points if participants done well in sports");
	int marks = 78;
 
	double total = marks + ( marks * (5 /100));
	}
}
class Players implements Academic  // Multiple Inheritance
 
{

public void run()
{
System.out.println(" Ready to Run " );
} 
public void play()
{
System.out.println(" Play Well " );
 
}
public void takeRest()
{
System.out.println(" take 10 mins break " );
 
}
@Override
public void attendance() {
	// TODO Auto-generated method stub
	System.out.println(" Present " );
}
@Override
public void score() {
	// TODO Auto-generated method stub
	System.out.println(" Passed" );
	
}}
 
 
class klm implements Academic, Sports
{
public void run()
{
System.out.println("Run fast " );
} 
public void play()
{
System.out.println(" defend the opponents " );
 
}
public void takeRest()
{
System.out.println(" sleep well for 1 hour " );
 
}
@Override
public void attendance() {
	// TODO Auto-generated method stub
	System.out.println(" Absent " );
	
}
@Override
public void score() {
	// TODO Auto-generated method stub
	System.out.println(" Fail" );
	
}}
public class InterfaceSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Players obj1 =new Players();
		obj1.run();

	}

}
