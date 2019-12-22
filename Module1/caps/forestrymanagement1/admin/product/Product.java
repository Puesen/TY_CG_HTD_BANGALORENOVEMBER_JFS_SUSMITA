package com.caps.forestrymanagement1.admin.product;

import java.util.Scanner;

import com.caps.forestrymangement1.admin.main.MainForestry;
public class Product {
public void product(){
		
		ProductBean bean=new ProductBean();
		ProductDAO dao=ProductDAOManager.getProductDAO();
		Scanner sc=new Scanner(System.in);
		char ch='y';
		while(ch=='y'||ch=='y') {
			System.out.println("Enter 1 to insert data");
			System.out.println("Enter 2 to delete data");
			System.out.println("Enter 3 to search data");
			System.out.println("Enter 4 to get all data");
			System.out.println("Enter 5 to update the data");
			System.out.println("Enter 6 to return home");
			
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter productid...");
				int prodid=sc.nextInt();
				System.out.println("Enter productname...");
				String pname=sc.next();
				System.out.println("Enter product quantity...");
				int pqnty=sc.nextInt();
				
				ProductBean bean1=new ProductBean();
				bean1.setProdid(prodid);
				bean1.setPname(pname);
				bean1.setPqnty(pqnty);

				boolean check=dao.addProduct(bean1);
				if(check) {
					System.out.println("product details added to the list");
				}
				else
				{
					System.out.println("productid is repeated");
				}
				
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);
				break;
			case 2:
				System.out.println("Enter productid to delete");
				int prodid3=sc.nextInt();
				if(dao.deleteProduct(prodid3)) {
				
					System.out.println("given productid details has been deleted");
				}
				else {
					System.out.println("sorry....Unable to deleted");
				}

				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);

				break;
			case 3:
				System.out.println("Enter productid to search");
				int prodid1=sc.nextInt();
				if(bean!=null)
				{try {
				ProductBean bean2=dao.getProduct(prodid1);
				System.out.println(bean2.getProdid());
				System.out.println(bean2.getPname());
				System.out.println(bean2.getPqnty());
				}
				
				catch(Exception e){
					System.out.println("Check the productid");
				}
				}
				else {
					System.out.println("product details not found....!!!");
				}

				System.out.println("do u want to countinue(y/n)");
				ch=sc.next().charAt(0);

				break;
			case 4:
//				
				System.out.println(dao.getAllProducts());

				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);

				break;
			case 5:
				System.out.println("Enter productid to update");
				int prodid4=sc.nextInt();
				ProductBean beans=new ProductBean();
				System.out.println("Enter productid to update");
				beans.setProdid(sc.nextInt());
				System.out.println("Enter productname to update");
				beans.setPname(sc.next());
				System.out.println("Enter quantity to update");
				beans.setPqnty(sc.nextInt());
				
				boolean check1=dao.modifyProduct(prodid4, beans);
				if(check1) {
					System.out.println("product details updated successfully....");
					
				}
				else {
					System.out.println("Unable to update the product details...!!! Product id doesnot match");
				}
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);

				break;
			case 6:
				MainForestry m=new MainForestry();
				m.main(null);
				
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);
				
				break;
			
			default:
				System.out.println("Your choice should be 1-6");
				break;
			
		}


		}
}

}
