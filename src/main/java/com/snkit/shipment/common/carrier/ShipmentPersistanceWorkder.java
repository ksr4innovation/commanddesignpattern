package com.snkit.shipment.common.carrier;

public class ShipmentPersistanceWorkder extends ShipmentWorker {

	@Override
	public void execute(ShipmentContext context) {
		System.out.println(" From ShipmentPersistanceWorkder "+context.getName());

	}

}
