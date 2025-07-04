package org.anujl.car;

import org.anujl.interfaces.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class Mahindra implements Car {
	
	@Autowired
	@Qualifier("NA")
Engine engine;
	@Override
	public void name() {
		System.out.println("Mahindra"+ engine.type);

	}

}
