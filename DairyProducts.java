package package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.ArrayList;
public class DairyProducts {
	
	Scanner scan=new Scanner(System.in);
	LinkedHashMap<Integer,String> lh=new LinkedHashMap<Integer,String>(){{put(1,"MILK");put(2,"CURD");put(3,"BUTTER-MILK");put(4,"LASSI");put(5,"GHEE");put(6,"PANNER");put(7,"CHESSE");put(8,"ICE-CREAM");put(9,"KOVA-SWEET");}};
	
	int rate;
	static int  total_bill=0;
	int current_bill=0;
	
	
	public void display()
	{
		System.out.println("         "+" AVALIABLE PRODUCT DETAILS:");
		System.out.println("______________________________________________________");
		System.out.println(  "         " + "Item_code "      +"       "       + "Product_name"   );
		System.out.println( "        "  + "____________"     +"    "    +" _____________");
		 
	       
		for(Integer i:lh.keySet())
		{
			
			System.out.println( "         "     + i +"<----------------> "  + lh.get(i));}
		}
	public void method1()
	
	{
		System.out.println("");
		 System.out.println("**************************************************************");
			
		System.out.println(" select the product by entering item-code:");
		 
		int Item_code=scan.nextInt();
		scan.nextLine();
		
		
		switch(Item_code)
		{
		case 1:
			
			System.out.println( "       "     +"MILK PRODUCT DETAILS ");
			 System.out.println("______________________________________________________");
			 System.out.println(""    +"Product-No" +"  "   +"  Product_Quantity"  +"   " +"Product_rate ");
		     int Milk_productno[]= {1,2};
		     String Milk_Productquantity[]= {"500ml","1-Litre"};
		     int Milk_rate[]= {30,60};
		    
		     for(int i=0;i<Milk_productno.length;i++)
		     {
		    	 
		    	
		    	 System.out.println("   "    +Milk_productno[i] +"             "  +Milk_Productquantity[i] +"              " +Milk_rate[i]);
		     }
		     
		     System.out.println("Enter the Product_Num:");
		     
			 int Product_num=scan.nextInt();
			 scan.nextLine();
			 System.out.println("Enter the Product_quantity:");
			 scan.nextLine();
			 int Product_quantity1=scan.nextInt();
			 

			if(Product_num==1)
			{
				 current_bill = Product_quantity1 * Milk_rate[0];
			
			}
			else if(Product_num==2)
			{
				 current_bill = Product_quantity1 * Milk_rate[1];
			}
			
			else
			{
				System.out.println("invalid-details");
			}
			System.out.println("current-bill:"+current_bill);
		   total_bill+=current_bill;
			
		    break;
		case 2:
	
			System.out.println( "       "     +"CURD PRODUCT DETAILS ");
			 System.out.println("______________________________________________________");
			 System.out.println(""    +"Product-No" +"  "   +"  Product_Quantity"  +"   " +"Product_rate ");
		     int Curd_productno[]= {1,2};
		     String Curd_Productquantity[]= {"500ml","1-Litre"};
		     int Curd_rate[]= {25,50};
		     for(int i=0;i<Curd_productno.length;i++)
		     {
		    	 
		    	
		    	 System.out.println("   "    +Curd_productno[i] +"             "  +Curd_Productquantity[i] +"              " +Curd_rate[i]);
		     }
		     
		     System.out.println("Enter the Product_Num:");
		     
			 int Product_num1=scan.nextInt();
			 scan.nextLine();
			 System.out.println("Enter the Product_quantity:");
			 int Product_quantity2=scan.nextInt();
			 int current_bill=0;
		     if(Product_num1==1)
				{
		    	 
		    	 current_bill = Product_quantity2 * Curd_rate[0];
				}
				else if(Product_num1==2)
				{
					
					 current_bill = Product_quantity2* Curd_rate[1];
				}
		     
				else
				{
					System.out.println("invalid-details");
				}
		     System.out.println("current-bill:"+current_bill);
		     total_bill+=current_bill;
		    
			break;
			 case 3:
				 System.out.println( "       "     +"BUTTER-MILK PRODUCT DETAILS ");
				 System.out.println("______________________________________________________");
				 System.out.println(""    +"Product-No" +"  "   +"  Product_Quantity"  +"   " +"Product_rate ");
			     int Butter_productno[]= {1,2,3};
			     String Butter_Productquantity[]= {"250-ml","500-ml","1-Litre"};
			     int Butter_rate[]= {25,50,100};
			     for(int i=0;i<Butter_productno.length;i++)
			     {
			    	 
			    	
			    	 System.out.println("   "    +Butter_productno[i] +"             "  +Butter_Productquantity[i] +"              " +Butter_rate[i]);
			     }
			     System.out.println("Enter the Product_Num:");
				 int Product3_num=scan.nextInt();
				 scan.nextLine();
				 System.out.println("Enter the Product_quantity:");
				 int Product_quantity3=scan.nextInt();
				 scan.nextLine();
				  current_bill=0;
			     if(Product3_num==1)
					{
			    	 current_bill = Product_quantity3 * Butter_rate[0];
					}
					else if(Product3_num==2)
					{
						
						current_bill = Product_quantity3 * Butter_rate[1];
					}
					else if(Product3_num==3)
					{
						
						current_bill = Product_quantity3 * Butter_rate[2];
					}
					else
					{
						System.out.println("invalid-details");
					}
			     System.out.println("current-bill:"+current_bill);
			     total_bill+=current_bill;
		
			
			break;
			 case 4:
					System.out.println( "       "     +"LASSI PRODUCT DETAILS ");
					 System.out.println("______________________________________________________");
					 System.out.println(""    +"Product-No" +"  "   +"  Product_Quantity"  +"   " +"Product_rate ");
				     int Lassi_productno[]= {1,2};
				     String Lassi_Productquantity[]= {"250-ml","500-ml"};
				     int Lassi_rate[]= {40,80};
				     current_bill=0;
				     
				     for(int i=0;i<Lassi_productno.length;i++)
				     {
				    	 
				    	
				    	 System.out.println("   "    +Lassi_productno[i] +"             "  +Lassi_Productquantity[i] +"              " +Lassi_rate[i]);
				     }
				     
				     System.out.println("Enter the Product_Num:");
					 int Product4_num=scan.nextInt();
					 scan.nextLine();
					 System.out.println("Enter the Product_quantity:");
					 int Product_quantity4=scan.nextInt();
					 scan.nextLine();
					 
					if(Product4_num==1)
					{
						current_bill = Product_quantity4 * Lassi_rate[0];
					}
					else if(Product4_num==2)
					{
						
					current_bill = Product_quantity4 * Lassi_rate[1];
					}
					else
					{
						current_bill = Product_quantity4 * Lassi_rate[2];
					}
					System.out.println("current-bill:"+current_bill);
					
				   total_bill+=current_bill;
					
				    break;
			 case 5:
					System.out.println( "       "     +"GHEE PRODUCT DETAILS ");
					 System.out.println("______________________________________________________");
					 System.out.println(""    +"Product-No" +"  "   +"  Product_Quantity"  +"   " +"Product_rate ");
				     int Ghee_productno[]= {1,2,3};
				     String Ghee_Productquantity[]= {"250g","500g","1Kg"};
				     int Ghee_rate[]= {300,600,1200};
				     current_bill=0;
				     
				     for(int i=0;i<Ghee_productno.length;i++)
				     {
				    	 
				    	
				    	 System.out.println("   "    +Ghee_productno[i] +"             "  +Ghee_Productquantity[i] +"              " +Ghee_rate[i]);
				     }
				     
				     System.out.println("Enter the Product_Num:");
					 int Product5_num=scan.nextInt();
					 scan.nextLine();
					 System.out.println("Enter the Product_quantity:");
					 int Product_quantity5=scan.nextInt();
					 scan.nextLine();
					 
					if(Product5_num==1)
					{
						current_bill = Product_quantity5 * Ghee_rate[0];
					}
					else if(Product5_num==2)
					{
						
						current_bill = Product_quantity5 * Ghee_rate[1];
					}
					else if(Product5_num==3)
					{
						
						current_bill = Product_quantity5 * Ghee_rate[2];
					}
					else
					{
						System.out.println("invalid-details");
					}
					System.out.println("current-bill:"+current_bill);
					
				   total_bill+=current_bill;
					
				    break;
			 case 6:
					System.out.println( "       "     +"PANNER PRODUCT DETAILS ");
					 System.out.println("______________________________________________________");
					 System.out.println(""    +"Product-No" +"  "   +"  Product_Quantity"  +"   " +"Product_rate ");
				     int P_productno[]= {1,2,3};
				     String P_Productquantity[]= {"250g","500g","1Kg"};
				     int P_rate[]= {150,300,600};
				     current_bill=0;
				     
				     for(int i=0;i<P_productno.length;i++)
				     {
				    	 
				    	
				    	 System.out.println("   "    +P_productno[i] +"             "  +P_Productquantity[i] +"              " +P_rate[i]);
				     }
				     
				     System.out.println("Enter the Product_Num:");
					 int Product6_num=scan.nextInt();
					 scan.nextLine();
					 System.out.println("Enter the Product_quantity:");
					 int Product_quantity6=scan.nextInt();
					 scan.nextLine();
					 
					if(Product6_num==1)
					{
						current_bill = Product_quantity6 * P_rate[0];
					}
					else if(Product6_num==2)
					{
						
						current_bill = Product_quantity6 * P_rate[1];
					}
					else if(Product6_num==3)
					{
						
						current_bill = Product_quantity6 * P_rate[2];
					}
					else
					{
						System.out.println("invalid-details");
					}
					System.out.println("current-bill:"+current_bill);
				   total_bill+=current_bill;
					
				    break;
			 case 7:
					System.out.println( "       "     +"CHEESE PRODUCT DETAILS ");
					 System.out.println("______________________________________________________");
					 System.out.println(""    +"Product-No" +"  "   +"  Product_Quantity"  +"   " +"Product_rate ");
				     int C_productno[]= {1,2,3};
				     String C_Productquantity[]= {"250g","500g","1Kg"};
				     int C_rate[]= {250,500,1000};
				     current_bill=0;
				     
				     for(int i=0;i<C_productno.length;i++)
				     {
				    	 
				    	
				    	 System.out.println("   "    +C_productno[i] +"             "  +C_Productquantity[i] +"              " +C_rate[i]);
				     }
				     
				     System.out.println("Enter the Product_Num:");
					 int Product7_num=scan.nextInt();
					 scan.nextLine();
					 System.out.println("Enter the Product_quantity:");
					 int Product_quantity7=scan.nextInt();
					 scan.nextLine();
					 
					if(Product7_num==1)
					{
						current_bill = Product_quantity7 * C_rate[0];
					}
					else if(Product7_num==2)
					{
						current_bill = Product_quantity7 * C_rate[1];
					
					}
					else if(Product7_num==3)
					{
						
						current_bill = Product_quantity7 * C_rate[2];
					}
					else
					{
						System.out.println("invalid-details");
					}
					System.out.println("current-bill:"+current_bill);
					
				   total_bill+=current_bill;
					
				    break;
			 case 8:
					System.out.println( "       "     +"ICE-CREAM PRODUCT DETAILS ");
					 System.out.println("______________________________________________________");
					 System.out.println(""    +"Product-No" +"   " +"Productnames"   +"  Product_Quantity"  +"   " +"Product_rate ");
				     int IC_productno[]= {1,2,3};
				     String IC_Productnames[]= {"Vanilla","Chocolate", "Strawberry"};
				     String IC_Productquantity[]= {"250ml","500ml","1Kg"};
				     int IC_rate[]= {150,300,600};
				     current_bill=0;
				  
				     for(int i=0;i<IC_productno.length;i++)
				     {
				    	 
				    	
				    	 System.out.println("   "    +IC_productno[i] +"          "+IC_Productnames[i]  +"        "  +IC_Productquantity[i] +"              " +IC_rate[i]);
				     }
				     
				     System.out.println("Enter the Product_Num:");
					 int Product8_num=scan.nextInt();
					 scan.nextLine();
					 System.out.println("Enter the Product_quantity:");
					 int Product_quantity8=scan.nextInt();
					 scan.nextLine();
					 
					if(Product8_num==1)
					{
						current_bill = Product_quantity8 * IC_rate[0];
					}
					else if(Product8_num==2)
					{
						
						current_bill = Product_quantity8 * IC_rate[1];
					}
					else if(Product8_num==3)
					{
						
						current_bill = Product_quantity8 * IC_rate[2];
					}
					else
					{
						System.out.println("invalid-details");
					}
					System.out.println("current-bill:"+current_bill);
				   total_bill+=current_bill;
					
				    break;
			 case 9:
					System.out.println( "       "     +"KOVA-SWEET PRODUCT DETAILS ");
					 System.out.println("______________________________________________________");
					 System.out.println(""    +"Product-No" +"  "   +"  Product_Quantity"  +"   " +"Product_rate ");
				     int KV_productno[]= {1,2};
				     String KV_Productquantity[]= {"500gm","1-kg"};
				     int KV_rate[]= {300,600};
				     current_bill=0;
				     for(int i=0;i<KV_productno.length;i++)
				     {
				    	 
				    	
				    	 System.out.println("   "    +KV_productno[i] +"             "  +KV_Productquantity[i] +"              " +KV_rate[i]);
				     }
				     
				     System.out.println("Enter the Product_Num:");
					 int Product9_num=scan.nextInt();
					 scan.nextLine();
					 System.out.println("Enter the Product_quantity:");
					 int Product_quantity9=scan.nextInt();
					 scan.nextLine();
					 

					if(Product9_num==1)
					{
					 current_bill =Product_quantity9*KV_rate[0];
					}
					else if(Product9_num==2)
					{
						
						 current_bill =Product_quantity9*KV_rate[1];
					}
					else
					{
						 current_bill =Product_quantity9*KV_rate[2];
					}
					System.out.println("current-bill:"+current_bill);
				   total_bill+=current_bill;
					
				    break;
			
			
	
		
		default:
		
		
			System.out.println("invalid item-code:"+ " "+ "enter correct item-code");
			break;
			
		}
		
				
		
		m2();
		
	}
	
	public void m2()
	{
		System.out.println();
		System.out.println("do you want to buy  anymore items:( yes/no):");
		
		String answer=scan.next();
		if(answer.equalsIgnoreCase("yes"))
		{
			
			method1();
			
		}
		
		else
		{
			System.out.println("_______________________________");
			
			System.out.println("Total-Bill:"+total_bill);
			System.out.println("It was a pleasure having you. Please visit us again!");
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" !!!<> WELCOME TO DAIRY PRODUCTS <>!!!");
		System.out.println("***********************************************");
		
		
			DairyProducts aobj=new DairyProducts();
			
		aobj.display(); 
			aobj.method1();
			
			//aobj.m2();
			
			//System.out.println("TOTAL BILL:"+total_bill);
		

	}

}
