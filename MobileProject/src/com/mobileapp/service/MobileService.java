package com.mobileapp.service;

import com.mobileapp.exception.MobileNotFoundException;
import com.mobileapp.model.Mobile;

public interface MobileService {
	Mobile[] getAll();

	Mobile getById(int id) throws MobileNotFoundException;

	Mobile getBrand(String brand) throws MobileNotFoundException;

}
