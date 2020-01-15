package com.commerceFlow.automate;

public interface CommerceFlowUtils {

	
	String COMMERCE_FLOW_FILE_PATH = "/commerceFlow/src/test/resources/commerceFlowbody/commerceFlow.json";
	
	
	String USERNAME = "username";
	String MODELCODE = "quoteItems[0].modelCode";
	String QUANTITY =  "quoteItems[0].quantity";
	String PROMOCODE = "quoteItems[0].promoCode";
	
	String EPCID = "ecpdId";
	String ACCOUNTNUMBER = "accountNumber";
	String SUBACCOUNTNUMBER = "subAccountNumber";
	String SHIPPING_MATERIAL_METHOD = "shippingMaterialMethod";
	String ECODE = "eCode";
	
	
	String FIRSTNAME = "contacts[0].firstName";
	String LASTNAME = "contacts[0].lastName";
	String COMPANYNAME = "contacts[0].companyName";
	String ADDRESSLINE1 = "contacts[0].addressLine1";
	String ADDRESSLINE2 = "contacts[0].addressLine2";
	String CITY = "contacts[0].city";
	String STATE = "contacts[0].state";
	String ZIP = "contacts[0].zip";
	String PHONE = "contacts[0].phone";
	String EMAIL = "contacts[0].email";	
	String NUMBEROFPHONES =  "contacts[0].numberOfPhones";
	String NUMBEROFTABLETS = "contacts[0].numberOfTablets";
	String NUMBERO0FOTHERDEVICES = "contacts[0].numberOfOtherDevices";
	String 	ISPRIMARY = "contacts[0].isPrimary";

}