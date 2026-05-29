package org.tnsif.inheritence;

class Device {
	
	void DeviceType() {
		System.out.println("Device : Phone");
	}
}

class Phone extends Device {
	
	void PhoneType() {
		System.out.println("Type of phone : Smartphone");
	}
}

class Features extends Phone {
	
	void FeaturesPresent() {
		System.out.println("Features : Touch screen , Camera , Memory");
	}
}

public class multiLevel {

	public static void main(String[] args) {
		
		Features phone = new Features();
		phone.DeviceType();
		phone.PhoneType();
		phone.FeaturesPresent();
		
	}

}
