package com.snkit.shipment.common.carrier;

public class ShipmentDefautlConversionWorker extends ShipmentWorker {

	@Override
	public void execute(ShipmentContext context) {
		System.out.println(" From ShipmentDefautlConversionWorker "+context.getName());

	}

}
