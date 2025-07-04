package org.anujl.car;

import org.anujl.interfaces.EngineType;

public class Engine implements EngineType {

	String type;
	
	
	
	
	public Engine(String type) {
		super();
		this.type = type;
	}




	public Engine() {
		super();
	type="NA";
	}




	@Override
	public String specs() {
		// TODO Auto-generated method stub
//System.out.println(type);
		return type;
	}

}
