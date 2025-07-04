package org.anujl.car;

import org.anujl.interfaces.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;




public class Tata implements Car {

	@Autowired
	@Qualifier("v8")
Engine engine;
////	@Autowired
//	Tata(Engine engine){
//		engine.type="v5";
//		this.engine=engine;
//	}
//	
//	
//	public Tata(){
//		super();
//	}
//	//Qualifier
//	
//	
//	@Autowired
//	void setEngine(Engine engine){
//		engine.type="v6";
//		this.engine=engine;
//	}
	
	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Tata"+engine.specs());
	}

}
