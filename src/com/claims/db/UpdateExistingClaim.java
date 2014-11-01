package com.claims.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.NamingException;

public class UpdateExistingClaim {

	public static boolean updateClaim(String claimId, String policeStationName,
			String firNo) throws ClassNotFoundException, SQLException, NamingException {
		
		Connection conn = DbConnector.getConnection();
		PreparedStatement updateClaim = null;
		String updateClaimString = "UPDATE claims.Claims SET policeStationName='" 
					+ policeStationName + "', FIRNo='" + firNo + "' WHERE claimId='" + claimId + "';";
		System.out.println(updateClaimString);
		updateClaim =  conn.prepareStatement(updateClaimString);
		int rowCount = updateClaim.executeUpdate();
		if(rowCount != 0)
			return true;
		else
			return false;
	}

}
