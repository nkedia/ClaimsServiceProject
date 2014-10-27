package com.claims.service.impl;


import java.util.List;

import javax.jws.WebService;

import com.claims.db.ExistingClaims;
import com.claims.db.InsertNewClaim;
import com.claims.service.ClaimsService;
import com.claims.service.ClaimsType;

@WebService(serviceName = "ClaimsService", endpointInterface = "com.claims.service.ClaimsService", targetNamespace = "localhost:8080/ClaimsService/")
public class ClaimsServiceImpl implements ClaimsService {
	public void fileNewClaim(
			com.claims.service.PolicyHolderDetailsType policyHolderDetails,
			com.claims.service.VehicleDetailsType vehicleDetails,
			com.claims.service.AccidentDetailsType accidentDetails,
			com.claims.service.DriverDetailsType driverDetails,
			javax.xml.ws.Holder<java.lang.String> claimsID,
			javax.xml.ws.Holder<java.lang.Boolean> result) {

				int claimID = 0;
				try {
					claimID = InsertNewClaim.insertClaim(policyHolderDetails, vehicleDetails, 
							accidentDetails, driverDetails);
				} catch (Exception e) {
					e.printStackTrace();
					throw new RuntimeException(e);
				}
				if(claimID != 0) {
					claimsID.value = claimID + "";
					result.value = true;
				} else {
					claimsID.value = claimID + "";
					result.value = false;
				}
		return;
	}

	public java.util.List<com.claims.service.ClaimsType> getExistingClaims(
			java.lang.String policyId) {
		List<ClaimsType> list = null;
		try{
			list = ExistingClaims.getExistingClaimsByPolicyNo(policyId);
		} catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return list;
	}
}