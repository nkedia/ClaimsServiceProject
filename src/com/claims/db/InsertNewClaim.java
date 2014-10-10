package com.claims.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

import com.claims.service.AccidentDetailsType;
import com.claims.service.DriverDetailsType;
import com.claims.service.PolicyHolderDetailsType;
import com.claims.service.VehicleDetailsType;

public class InsertNewClaim {

	public static int insertClaim(PolicyHolderDetailsType policyHolderDetails,
			VehicleDetailsType vehicleDetails,
			AccidentDetailsType accidentDetails, DriverDetailsType driverDetails) {

		Connection conn = DbConnector.getConnection();
		PreparedStatement insertClaim = null;
		PreparedStatement insertClaimStatus = null;
		int claimId = 0;
		Date insuranceFrom = new Date(policyHolderDetails.getPeriodOfInsurance().getFrom().getMillisecond());
		Date insuranceTo = new Date(policyHolderDetails.getPeriodOfInsurance().getTo().getMillisecond());
		Date dobOfInsured = new Date(policyHolderDetails.getDobOfInsured().getMillisecond());
		Date dateOfFirstRegistration = new Date(vehicleDetails.getDateOfFirstRegistration().getMillisecond());
		Date dateOfTransfer = new Date(vehicleDetails.getDateOfTransfer().getMillisecond());
		Date dateOfAccident = new Date(accidentDetails.getDateOfAccident().getMillisecond());
		Time timeOfAccident = new Time(accidentDetails.getTime().getMillisecond());
		Date dateOfBirthOfDriver = new Date(driverDetails.getDOB().getMillisecond());
		Date effectiveFrom = new Date(driverDetails.getLicense().getEffectiveFrom().getMillisecond());
		Date expiryDate = new Date(driverDetails.getLicense().getExpiryDate().getMillisecond()); 
//		String insertClaimString = "INSERT INTO claims.Claims (policyNo) values (2341);";
		String insertClaimString = "INSERT INTO claims.Claims" +
									"(policyNo,"
									+ "coverNoteNo,"
									+ "insuranceFrom, "
									+ "insuranceTo, "
									+ "NameOfInsured,"
									+ "dobOfInsured, "
									+ "addressOfInsured, "
									+ "pinOfInsured, "
									+ "officePhoneOfInsured, "
									+ "residencePhoneOfInsured,"
									+ "mobilePhoneOfInsured, "
									+ "emailOfInsured, "
									+ "regdNo,"
									+ "make, "
									+ "dateOfFirstRegistration, "
									+ "chassisNo, "
									+ "engineNo,"
									+ "dateOfTransfer, "
									+ "typeOfFuel, "
									+ "color, "
									+ "dateOfAccident,"
									+ "time, "
									+ "speed, "
									+ "place, "
									+ "noOfPeopleTravelling,"
									+ "policeStationName, "
									+ "FIRNo, "
									+ "Mileage, "
									+ "nameOfDriver," 
									+ "relationWithInsured, "
									+ "addressOfDriver, "
									+ "contactNoOfDriver," 
									+ "dateOfBirthOfDriver, "
									+ "licenseNo, "
									+ "issuingRTO," 
									+ "effectiveFrom, "
									+ "expiryDate, "
									+ "class, "
									+ "licenseType)"
									+ "VALUES" 
									+ "(" 
									+ policyHolderDetails.getPolicyNo() + ",'"
									+ policyHolderDetails.getCoverNoteNo() + "',"
									+ insuranceFrom + ","
									+ insuranceTo + ",'"
									+ policyHolderDetails.getNameOfInsured() + "',"
									+ dobOfInsured + ",'"
									+ policyHolderDetails.getAddressOfInsured() + "','"
									+ policyHolderDetails.getPinOfInsured() + "',"
									+ Integer.parseInt(policyHolderDetails.getPhoneOfInsured().getOffice()) + ","
									+ Integer.parseInt(policyHolderDetails.getPhoneOfInsured().getResidence()) + ","
									+ Integer.parseInt(policyHolderDetails.getPhoneOfInsured().getMobile()) + ",'"
									+ policyHolderDetails.getEmailOfInsured() + "','"
									+ vehicleDetails.getRegdNo() + "','" 
									+ vehicleDetails.getMake() + "',"
									+ dateOfFirstRegistration + ",'"
									+ vehicleDetails.getChassisNo() + "','"
									+ vehicleDetails.getEngineNo() + "',"
									+ dateOfTransfer + ",'"
									+ vehicleDetails.getTypeOfFuel() + "','"
									+ vehicleDetails.getColor() + "',"
									+ dateOfAccident + ","
									+ timeOfAccident + ",'"
									+ accidentDetails.getSpeed() + "','"
									+ accidentDetails.getPlace() + "',"
									+ Integer.parseInt(accidentDetails.getNoOfPeopleTravelling()) + ",'"
									+ accidentDetails.getPoliceStationName() + "','"
									+ accidentDetails.getFIRNo() + "','"
									+ accidentDetails.getMileage() + "','"
									+ driverDetails.getName() + "','"
									+ driverDetails.getRelationWithInsured() + "','"
									+ driverDetails.getAddress() + "',"
									+ Integer.parseInt(driverDetails.getContactNo()) + ","
									+ dateOfBirthOfDriver + ",'"
									+ driverDetails.getLicense().getLicenseNo() + "','"
									+ driverDetails.getLicense().getIssuingRTO() + "','"		
									+ effectiveFrom + ","
									+ expiryDate + ",'"
									+ driverDetails.getLicense().getClazz().value() + "','"
									+ driverDetails.getLicense().getType().value() + "');";
		
		try{
			conn.setAutoCommit(false);
			insertClaim = conn.prepareStatement(insertClaimString);
			boolean isExexcute = insertClaim.execute();
			if(isExexcute) {
				//TODO correct select statement
				String selectClaimString = "select * from claims.Claims where policyNo=2341";
				PreparedStatement selectClaim = conn.prepareStatement(selectClaimString);
				ResultSet rs = selectClaim.executeQuery();
				while(rs.next()) {
					claimId = rs.getInt(1);
				}
				
				//insert claim status
				String insertClaimStatusString = "insert into claims.ClaimStatus"
						+ "(claimId,"
						+ "claimStatus,"
						+ "amount,"
						+ "date) VALUES ("
						+ claimId
						+ ", submitted"
						+ ", 0"
						+ ", " //TODO insert date
						+")";
				insertClaimStatus = conn.prepareStatement(insertClaimStatusString);
				isExexcute = insertClaimStatus.execute();
				if(!isExexcute) {
					throw new SQLException("insert new claim status failed");
				}
			} else {
				throw new SQLException("insert new claim failed");
			}
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
		}
		System.out.println(claimId + " this is new claim ID");
		return claimId;
	}

}
