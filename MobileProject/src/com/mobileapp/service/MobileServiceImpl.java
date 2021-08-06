package com.mobileapp.service;

import com.mobileapp.exception.MobileNotFoundException;
import com.mobileapp.model.Mobile;

public  class MobileServiceImpl implements MobileService {

	@Override
	public Mobile getById(int id) throws MobileNotFoundException {
		boolean flag=false;
		Mobile nmobile=null;
		for(Mobile mobile:allMobiles()) {
			if(mobile.getMobileId()==id)
			{
				flag=true;
				nmobile=mobile;
			}
		}
		if(flag==false)
			throw new MobileNotFoundException("Invalid Id..");
				
		return nmobile;
	}

	@Override
	public Mobile[] getAll() {
		// TODO Auto-generated method stub
		return allMobiles();
	}
	@Override
	public Mobile getBrand(String brand) throws MobileNotFoundException {
		Mobile nbrand=null;
		boolean flag=false;
		for(Mobile brands:allMobiles())
		{
			if(brands.getBrand().equals(brand))
			
			{
				flag=true;
				nbrand=brands;
			}
		}
		if(flag==false)
			throw new MobileNotFoundException("Invalid Brand..");
				
		return nbrand;
		
	}
	
	private Mobile[] allMobiles()
	{
		Mobile[] mobiles=new Mobile[3];
		mobiles[0]=new Mobile("A123","Samsung",900,1);
		mobiles[1]=new Mobile("A123","Honor",900,2);
		mobiles[2]=new Mobile("A123","Hp",900,3);
		return mobiles;
	}

	

}
