package com.snkit.shipment.common.carrier;

import org.springframework.beans.factory.annotation.Autowired;


public abstract class ShipmentWorkerInitializerHelper {
	
	@Autowired 
	private ShipmentDuplicateCheckWorker shipmentDuplicateCheckWorker;
	
	@Autowired 
	private ShipmentDefautlConversionWorker shipmentDefautlConversionWorker;
	
	public  ShipmentDuplicateCheckWorker shipmentDuplicateCheckWorker() {
		return shipmentDuplicateCheckWorker;
		
	}

	public  ShipmentDefautlConversionWorker shipmentDefautlConversionWorker() {
		return shipmentDefautlConversionWorker;
		
	}

	
}
