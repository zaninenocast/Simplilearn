package com.product;

import java.util.List;
import java.util.Scanner;

import com.product.bo.ProductBO;
import com.product.bo.impl.ProductBoImpl;
import com.product.dao.impl.ProductDaoImpl;
import com.product.exception.BusinessException;
import com.product.model.Product;
import com.product.dao.*;
import com.product.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("*************welcome*****************");
		 System.out.println("APPLICATION NAME ---->  LOCKME.com");
         System.out.println("DEVELOPER NAME ------> KOMAL JATYANI");
         
         System.out.println("**************************************************************************");
         Scanner scer = new Scanner(System.in);
         int ch = 0;
        ProductBO  productBO = new ProductBoImpl();
         do {
         
         System.out.println("Main Menu");
         System.out.println("-------------------------------");
         System.out.println("1) Create a Product");
         System.out.println("2) Update a Product");
         System.out.println("3) Get Product by ID");
         System.out.println("4) Get Product by manufacturerName");
         System.out.println("5) Get All Products ");
         System.out.println("6) Delete product");
         System.out.println("7) Exit");
         System.out.println("--------------------------------");
         System.out.println("Enter Your Choice:");
         try {
        	  ch = Integer.parseInt(scer.nextLine());
        	  
         }catch(NumberFormatException e) {
        	 System.out.println("");
         }
         switch (ch) {
         case 1:Product product=new Product();
         System.out.println("Enter Product NAme");
         product.setName(scer.nextLine());
         System.out.println("Enter Product Manufacturer Name");
         product.setManufacturerName(scer.nextLine());
         try {
         System.out.println("Enter Product Cost");
         product.setCost(Double.parseDouble(scer.nextLine()));
         System.out.println("Enter your Rating");
         product.setRating(Float.parseFloat(scer.nextLine()));
         
			product = productBO.addProduct(product);
			if (product.getId()!=0)
			{
				System.out.println("Product Added successesfully:");
				System.out.println(product);
			}
         } catch (BusinessException e) {
			// TODO Auto-generated catch block
		      System.out.println(e.getMessage());
		}
         
         catch(NumberFormatException e)
         {
        	 System.out.println("********************Sorry*****************");
        	 System.out.println("Enter correcxt cost or rating");
         }
        	 break;
         case 2:System.out.println("Thank you for using My app Lockme.com");
        	 break;	 
         case 3:System.out.println("Thank you for using My app Lockme.com");
        	 break;
         case 4:System.out.println("Thank you for using My app Lockme.com");
        	 break;
         case 5:try {
				List<Product> productList = new ProductDaoImpl().getAllProducts();
				System.out.println("Printiing all product ");
				for (Product p:productList) {
					System.out.println(p);
				}
				
			} catch (BusinessException e) {
			  System.out.println(e.getMessage());
			}
         
        	 break;
         case 6:System.out.println("Thank you for using My app Lockme.com");
        	 break;
         case 7:System.out.println("Thank you for using My app Lockme.com");
        	 break;
         default:System.out.println("Enter choice is invlaid..");
         break;
         }
         }while(ch!=0);
	}

}
