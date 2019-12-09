package com.capgimini.fms.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgimini.fms.beans.CustomerBean;
import com.capgimini.fms.beans.ProductBean;

public class CustomerDAOImpl implements CustomerDAO{
    
	Scanner sc=new Scanner(System.in);
	private List<CustomerBean> customerBean=new ArrayList<CustomerBean>();

	@Override
	public boolean addCustomer(CustomerBean bean) {
		for(CustomerBean cb2 : customerBean) {
			if(cb2.getId()==bean.getId()) {
				return false;
			}
		}	
		customerBean.add(bean);
		return true;
	}

	@Override
	public boolean deleteCustomer(int id) {
		CustomerBean bean=null;
		for(CustomerBean customerBean2: customerBean) {
			if(customerBean2.getId()==id) {
				bean= customerBean2;

			}
		}	
		if(bean!=null) {
			customerBean.remove(bean);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean modifyCustomer(int custId) {
		while (true) {
		System.out.println("1.Update CustName\n 2. Update Street Address1 \n 3. Update Street Address2"
        		+ "\n 4.Update Town +\n 5.Update PostalCode \n 6.Update email \n 7.Update Phome Number");
		int ch=sc.nextInt();
		 System.out.println("Enter the customer id to update");
			int custId1=sc.nextInt();
			switch(ch) {
			
			case 1:
				System.out.println("Enter the new Customer Name");
			    updateName(custId1,sc.next());
			    break;
			case 2:
				System.out.println("Enter the new Street Address1");
			    updateAddress1(custId1,sc.next());
			    break;
			case 3:
				System.out.println("Enter the new Street Address2");
			    updateAddress2(custId1,sc.next());
			    break;
			case 4:
				System.out.println("Enter the new new town name");
			    updateTown(custId1,sc.next());
			    break;
			case 5:
				System.out.println("Enter the new Postal Code");
			    updatePostalCode(custId1,sc.nextInt());
			    break;
			case 6:
				System.out.println("Enter the new Email");
			    updateEmail(custId1,sc.next());
			    break;
			case 7:
				System.out.println("Enter the new Phone Number");
			    updatePhone(custId1,sc.nextInt());
			    break;
			}
			return true;
			}		
	}


	

	public boolean updateName(int custId1, String newName) {
		for(int i=0;i<customerBean.size();i++) {
			if(customerBean.get(i).getId()==custId1) {
				customerBean.get(i).setName(newName);
			}
			return true;
		}
		return false;
	}
	public boolean updateAddress1(int custId1, String newAddress1) {
		for(int i=0;i<customerBean.size();i++) {
			if(customerBean.get(i).getId()==custId1) {
				customerBean.get(i).setAddress1(newAddress1);
			}
			return true;
		}
		return false;
	}

	public boolean updateAddress2(int custId1, String newAddress2) {
		for(int i=0;i<customerBean.size();i++) {
			if(customerBean.get(i).getId()==custId1) {
				customerBean.get(i).setAddress2(newAddress2);
			}
			return true;
		}
		return false;
	}
	
	public boolean updateTown(int custId1, String Town) {
		for(int i=0;i<customerBean.size();i++) {
			if(customerBean.get(i).getId()==custId1) {
				customerBean.get(i).setTown(Town);;
			}
			return true;
		}
		return false;
	}
	public boolean updatePostalCode(int custId1, int postalcode) {
		for(int i=0;i<customerBean.size();i++) {
			if(customerBean.get(i).getId()==custId1) {
				customerBean.get(i).setPostalcode(postalcode);;
			}
			return true;
		}
		return false;
	}
	public boolean updateEmail(int custId1, String email) {
		for(int i=0;i<customerBean.size();i++) {
			if(customerBean.get(i).getId()==custId1) {
				customerBean.get(i).setEmailid(email);
			}
			return true;
		}
		return false;
	}
	public boolean updatePhone(int custId1, int phnumber) {
		for(int i=0;i<customerBean.size();i++) {
			if(customerBean.get(i).getId()==custId1) {
				customerBean.get(i).setTelephoneno(phnumber);
			}
			return true;
		}
		return false;
	}




	@Override
	public List<CustomerBean> getallCustomer() {
		// TODO Auto-generated method stub
		return customerBean;
	}

}
