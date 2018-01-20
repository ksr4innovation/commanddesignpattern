package com.snkit.shipment.common.carrier;

import java.util.ArrayList;
import java.util.List;


public abstract class ShipmentWorkerInitializer {
	
	private List<ShipmentWorker> shipmentWorkerList;
	
	private ShipmentWorkerInitializerHelper helper; 
	
	private boolean applyDefaultWorker = false;
	
	public ShipmentWorkerInitializer(boolean applyDefaultWorker,ShipmentWorkerInitializerHelper helper){
		
		shipmentWorkerList = new ArrayList<ShipmentWorker>();
		this.applyDefaultWorker = applyDefaultWorker;
		this.helper = helper;
		if (this.applyDefaultWorker) {
				getDefaultWorkers();
		}
		
	}
	
 public ShipmentWorkerInitializer(){
		
		shipmentWorkerList = new ArrayList<ShipmentWorker>();
		if (applyDefaultWorker) {
				getDefaultWorkers();
		}
		
	}
	
	public void getDefaultWorkers() {
		this.getWorkersList().add(helper.shipmentDuplicateCheckWorker());
		this.getWorkersList().add(helper.shipmentDefautlConversionWorker());
		
	}

  	public List<ShipmentWorker> getWorkersList(){
  		return this.shipmentWorkerList;
  	}
	
  abstract public List<ShipmentWorker> getVenderWorker();

public boolean isApplyDefaultWorker() {
	return applyDefaultWorker;
}
	
}
