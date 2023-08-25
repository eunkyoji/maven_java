package co.yedam.Hello.product.service;

import lombok.Data;

@Data
public class ProductVO {
	private String 	productId;
	private String 	productName;
	private int 	productPrice;
	private String 	productModel;
	
	
	public String toString() {
		System.out.print(productId  + " : ");
		System.out.print(productName  + " : ");
		System.out.print(productPrice  + " : ");
		System.out.print(productModel  + " \n ");
		return null;
	}
}
