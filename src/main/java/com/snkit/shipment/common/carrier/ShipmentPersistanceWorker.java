package com.snkit.shipment.common.carrier;

public class ShipmentPersistanceWorker extends ShipmentWorker {

	@Override
	public void execute(ShipmentContext context) {
		System.out.println(" From ShipmentPersistanceWorkder "+context.getName());

	}

}
