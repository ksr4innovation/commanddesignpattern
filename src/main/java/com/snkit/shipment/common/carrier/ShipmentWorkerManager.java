package com.snkit.shipment.common.carrier;

import java.util.List;


public class ShipmentWorkerManager {
	
	private List<ShipmentWorker> shipmentworkerList;
	
	public ShipmentWorkerManager(List<ShipmentWorker> shipmentworkerList ){
		
		this.shipmentworkerList = shipmentworkerList;
		
	}
	
	
	public void executor(ShipmentContext context) {
		
		shipmentworkerList.forEach(shipmentWorker -> {
			shipmentWorker.execute(context);
		});
	}
	

}
