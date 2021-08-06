package com.mobileapp.client;


import com.mobileapp.exception.MobileNotFoundException;
//import com.mobileapp.model.Mobile;
import com.mobileapp.service.MobileServiceImpl;

public class Main {

	public static void main(String[] args)throws MobileNotFoundException {
	MobileServiceImpl ms=new MobileServiceImpl();
	
	System.out.println(ms.getById(1));
	System.out.println(ms.getBrand("Hp"));
	}

}
