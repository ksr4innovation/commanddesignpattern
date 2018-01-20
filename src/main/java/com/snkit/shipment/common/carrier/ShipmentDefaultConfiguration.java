package com.snkit.shipment.common.carrier;

import org.springframework.context.annotation.Bean;


public abstract class ShipmentDefaultConfiguration {
	
	
	
	 @Bean 
	  ShipmentDuplicateCheckWorker shipmentDuplicateCheckWorker() {
		
		  	return new ShipmentDuplicateCheckWorker();
	  }
	  @Bean 
	  ShipmentDefautlConversionWorker shipmentDefautlConversionWorker() {
		
		  	return new ShipmentDefautlConversionWorker();
	  }
	
}
