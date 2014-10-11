package com.claims.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.claims.service.AccidentDetailsType;
import com.claims.service.ClaimsType;
import com.claims.service.DriverDetailsType;
import com.claims.service.PolicyHolderDetailsType;
import com.claims.service.VehicleDetailsType;

public class ExistingClaims {
	
	public static List<ClaimsType> getExistingClaimsByPolicyNo(String policyNo) {
		
		List<ClaimsType> claims = new ArrayList<ClaimsType>();
		Connection conn = DbConnector.getConnection();
		PreparedStatement getClaims = null;
		String getClaimsString = "select * from claims.Claims where policyNo = " + policyNo;
		
		try {
			getClaims = conn.prepareStatement(getClaimsString);
			ResultSet rs = getClaims.executeQuery();
			while (rs.next()) {
				ClaimsType claim = new ClaimsType();
				PolicyHolderDetailsType policyHolderDetails = new PolicyHolderDetailsType();
				VehicleDetailsType vehicleDetails = new VehicleDetailsType();
				AccidentDetailsType accidentDetails = new AccidentDetailsType();
				DriverDetailsType driverDetails = new DriverDetailsType();
				int claimId = rs.getInt(1);
				
				
				//add all details
				claim.setPolicyHolderDetails(policyHolderDetails);
				claim.setVehicleDetails(vehicleDetails);
				claim.setAccidentDetails(accidentDetails);
				claim.setDriverDetails(driverDetails);
				getClaimStatus(conn, claimId, claim);
				claims.add(claim);
			}
		} catch(SQLException | DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return claims;
	}

	private static void getClaimStatus(Connection conn, int claimId,
			ClaimsType claim) throws SQLException, DatatypeConfigurationException {
		PreparedStatement getClaimsStatus = null;
		String getClaimsStatusString = "select * from claims.ClaimsStatus where claimId = " + claimId;
		getClaimsStatus = conn.prepareStatement(getClaimsStatusString);
		ResultSet rs = getClaimsStatus.executeQuery();
		while(rs.next()) {
			String claimStatus = rs.getString(2);
			float amount = rs.getFloat(3);
			Date dateOfSettlement = rs.getDate(4);
			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(dateOfSettlement);
			XMLGregorianCalendar gc =
			     DatatypeFactory.newInstance().newXMLGregorianCalendar(cal); 
			
			claim.setClaimStatus(claimStatus);
			claim.setAmountSettled(Float.toString(amount));
			claim.setDateOfSettlement(gc);
			
			
		}
		
	}


}
