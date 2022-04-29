package com.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	@Autowired
	 MobileProcessor mobile;

	public MobileProcessor getMobile() {
		return mobile;
	}

	public void setMobile(MobileProcessor mobile) {
		this.mobile = mobile;
	}
	public void MobileConfig()
	{
		System.out.println("Android version -11 ram-6 version-kernal");
		mobile.details();
	}
}
	
	
		


