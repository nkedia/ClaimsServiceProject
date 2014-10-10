package com.claims.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
		PreparedStatement getClaimsStatus = null;
		String getClaimsString = "select * from claims.Claims where policyNo = " + policyNo;
		String getClaimsStatusString = "select * from claims.ClaimsStatus where claimId = ?";
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
				getClaimStatus(conn, claimId, claim);
			}
		} catch(SQLException sqle) {
			
		}
		return claims;
	}


}
