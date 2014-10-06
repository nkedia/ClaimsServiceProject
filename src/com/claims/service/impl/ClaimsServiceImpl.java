package com.claims.service.impl;


import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.claims.service.ClaimsType;
import com.claims.service.*;

import javax.jws.WebService;

@WebService(serviceName = "ClaimsService", endpointInterface = "com.claims.service.ClaimsService", targetNamespace = "localhost:8080/ClaimsService/")
public class ClaimsServiceImpl implements ClaimsService {
	public void fileNewClaim(
			com.claims.service.PolicyHolderDetailsType policyHolderDetails,
			com.claims.service.VehicleDetailsType vehicleDetails,
			com.claims.service.AccidentDetailsType accidentDetails,
			com.claims.service.DriverDetailsType driverDetails,
			javax.xml.ws.Holder<java.lang.String> claimsID,
			javax.xml.ws.Holder<java.lang.Boolean> result) {
		//TODO
				//take all the input save it to Amazon RDS, create claims ID and send it back.
				claimsID = new javax.xml.ws.Holder<String>("Hello There!");
				
				//AddNewClaim
				
		return;
	}

	public java.util.List<com.claims.service.ClaimsType> getExistingClaims(
			java.lang.String policyId) {
		//TODO
				//contact Amazon RDS< on the basis of userID, get all the claims data, send it back.
				List<ClaimsType> list = new ArrayList<ClaimsType>();
				ClaimsType e = new ClaimsType();
				e.setClaimId("123");
				e.setAmountSettled("2000");
				e.setClaimStatus("settled");
				list.add(e);
				return list;
	}
}