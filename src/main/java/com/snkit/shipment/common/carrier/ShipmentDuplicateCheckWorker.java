package com.snkit.shipment.common.carrier;

public class ShipmentDuplicateCheckWorker extends ShipmentWorker {

	
	
	@Override
	public void execute(ShipmentContext context) {
		System.out.println(" From ShipmentDuplicateCheckWorker "+context.getName());
		System.out.println(" From ShipmentDuplicateCheckWorker "+context.getName());

	}

}
