package com.saraya.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CarService {
	private static ArrayList<Car> cars = new ArrayList<Car>();
	private static int count = 10;
	
	static {
		cars.add(new Car(1, 2020, "BMW", "X6", "https://images.unsplash.com/photo-1617531653520-4893f7bbf978?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1171&q=80"));
		cars.add(new Car(2, 2021, "Mercedes", "Benz","https://images.unsplash.com/photo-1615228939096-9ead6c74008e?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8bWVyY2VkZXMlMjBiZW56fGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"));
		cars.add(new Car(3, 2022, "Bugati", "GT","https://images.unsplash.com/photo-1600712242805-5f78671b24da?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=400&q=80"));
		cars.add(new Car(4, 2019, "Range Rover", "LandRover","https://images.unsplash.com/photo-1563720223185-11003d516935?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80"));
		cars.add(new Car(5, 2020, "Chrysler", "nouvea","https://images.unsplash.com/photo-1623371857133-6d5552bbdc13?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=334&q=80"));
		cars.add(new Car(6, 2018, "Tesla", "Vt","https://images.unsplash.com/photo-1576221162298-3d9f04e9f661?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=750&q=80"));
		cars.add(new Car(7, 2016, "Ford", "Fiesta","https://images.unsplash.com/photo-1579272154060-4e7a4d0f5033?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=552&q=80"));
		cars.add(new Car(8, 2021, "Chevy", "Equinox","https://images.unsplash.com/photo-1579272154060-4e7a4d0f5033?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=552&q=80"));
		cars.add(new Car(9, 2022, "Kia", "Sportage" ,"https://images.unsplash.com/photo-1625037669880-959e0b2f4410?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80"));
		cars.add(new Car(10, 2020, "Hyundai", "Santa Fe","https://images.unsplash.com/photo-1619767886558-efdc259cde1a?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=751&q=80"));
		
	}
	
	public List<Car> getAllCars(){
		return cars;
	}
	
	public void addCar(int year, String make, String model, String image) {
		cars.add(new Car(++count, year, make, model, image));
	}
	
	public void removeCar(int id) {
		Iterator<Car> tounkara = cars.iterator();
		while(tounkara.hasNext()) {
		
			Car car = tounkara.next();
			if(car.getId() == id) {
				tounkara.remove();
			}
		}
	}

	public void deleteCar(int id) {
		// TODO Auto-generated method stub
		Iterator<Car> iterate=cars.iterator();
		while(iterate.hasNext()) {
			Car car=iterate.next();
			if(car.getId()==id) {
				iterate.remove();
	}
	
}
}
	public Car findById(int id) {
	for(Car c:cars) {
		if(c.getId()==id) {
			return c;
		}
	}
	return null;
}
	public void updateByCar(Car c) {
		cars.remove(c);
		cars.add(c);
	}
		
	}
	
	
	


