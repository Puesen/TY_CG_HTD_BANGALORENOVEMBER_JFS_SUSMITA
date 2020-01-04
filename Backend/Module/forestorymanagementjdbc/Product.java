package com.capgimini.forestrymanagementjdbc.admin.product;

import java.util.Scanner;

import com.capgimini.forestrymanagementjdbc.admin.main.MainForestry;

public class Product {//create one class
	public void product(){//create one method

		ProductBean bean=new ProductBean(); //create one ProductBean object
		ProductDAO dao=ProductDAOManager.getProductDAO();//create one ProductDAO object
		Scanner sc=new Scanner(System.in);
		char ch='y';
		while(ch=='y'||ch=='y') {//check if the condition true enter the while loop
			System.out.println("Enter 1 to insert data");
			System.out.println("Enter 2 to delete data");
			System.out.println("Enter 3 to get all data");
			System.out.println("Enter 4 to update the data");
			System.out.println("Enter 5 to return home");

			int choice=sc.nextInt();
			switch (choice) {//create one switch case
			//switch case for addition of a product
			case 1:
				ProductBean bean1=new ProductBean();//create  one ProductBean object

				boolean again;
				System.out.println("Enter 4 digit Product Id........");
				int prodid=sc.nextInt();
				bean1.setProdid(prodid);

				System.out.println("Enter productname...");
				String pname=sc.next();
				System.out.println("Enter product Description...");
				String pdesc=sc.next();

				bean1.setPname(pname);
				bean1.setPdesc(pdesc);

				boolean check=dao.addProduct(bean1);
				//check if the product id is not present in the list then add the product details in the list
				if(check) {
					System.out.println("product details added to the list");
				}
				else
				{
					System.out.println("productid is repeated");
				}

				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);//returns next token as a string
				break;
				//if the product is present in the list then using product id you can delete the product
			case 2:
				System.out.println("Enter productid to delete");
				int prodid3=sc.nextInt();
				if(dao.deleteProduct(prodid3)) {

					System.out.println("given productid details has been deleted");
				}
				else {
					System.out.println("sorry....Unable to delete. Product id not present in the list.");
				}

				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);

				break;
				//list all the products present in the database
			case 3:

				System.out.println(dao.getAllProductss());

				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);

				break;
				//if the product is present in the list then using product id you can update the product

			case 4:
				ProductService services= ProductDAOManager.instanceOfProductServiceImpl();
				 bean=new ProductBean();
				System.out.println("Enter Product Id .....");
				bean.setProdid(sc.nextInt());
				System.out.println("Enter Product name to update.......");
				bean.setPname(sc.next());
				if(services.modifyProduct(bean)) {
					System.out.println("product details updated successfully....");
				}
				else {
					System.out.println("Unable to update the product details...!!! Product id doesnot match");
				}
//				System.out.println(services.modifyProduct(bean2));
				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);

				break;

				//this switch case use to go back to main menu
			case 5:
				MainForestry m=new MainForestry();
				m.main(null);

				System.out.println("do u want to countinue(y/n) ");
				ch=sc.next().charAt(0);

				break;
				//if we choose other then 1-6 then display one message 
			default:
				System.err.println("Your choice should be 1-5");
				Product p=new Product();
				p.product();
				break;

			}//end of switch case


		}//end of while loop
	}//end of product ()

}//end of class
