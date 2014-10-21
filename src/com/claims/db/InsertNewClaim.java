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
		
		Date insuranceFrom = java.sql.Date.valueOf( 
				policyHolderDetails.getPeriodOfInsurance().getFrom().getYear() + "-" + 
						policyHolderDetails.getPeriodOfInsurance().getFrom().getMonth() + "-" + 
						policyHolderDetails.getPeriodOfInsurance().getFrom().getDay() );
		Date insuranceTo = java.sql.Date.valueOf( 
				policyHolderDetails.getPeriodOfInsurance().getTo().getYear() + "-" + 
						policyHolderDetails.getPeriodOfInsurance().getTo().getMonth() + "-" + 
						policyHolderDetails.getPeriodOfInsurance().getTo().getDay() );
		Date dobOfInsured = java.sql.Date.valueOf( 
				policyHolderDetails.getDobOfInsured().getYear() + "-" + 
						policyHolderDetails.getDobOfInsured().getMonth() + "-" + 
						policyHolderDetails.getDobOfInsured().getDay() );
		Date dateOfFirstRegistration = java.sql.Date.valueOf( 
				vehicleDetails.getDateOfFirstRegistration().getYear() + "-" + 
						vehicleDetails.getDateOfFirstRegistration().getMonth() + "-" + 
						vehicleDetails.getDateOfFirstRegistration().getDay() );
		Date dateOfTransfer = java.sql.Date.valueOf( 
				vehicleDetails.getDateOfTransfer().getYear() + "-" + 
						vehicleDetails.getDateOfTransfer().getMonth() + "-" + 
						vehicleDetails.getDateOfTransfer().getDay() );
		Date dateOfAccident = java.sql.Date.valueOf( 
				accidentDetails.getDateOfAccident().getYear() + "-" + 
						accidentDetails.getDateOfAccident().getMonth() + "-" + 
						accidentDetails.getDateOfAccident().getDay() );
		Date dateOfBirthOfDriver = java.sql.Date.valueOf( 
				driverDetails.getDOB().getYear() + "-" + 
						driverDetails.getDOB().getMonth() + "-" + 
						driverDetails.getDOB().getDay() );
		Date effectiveFrom = java.sql.Date.valueOf( 
				driverDetails.getLicense().getEffectiveFrom().getYear() + "-" + 
						driverDetails.getLicense().getEffectiveFrom().getMonth() + "-" + 
						driverDetails.getLicense().getEffectiveFrom().getDay() );
		Date expiryDate = java.sql.Date.valueOf( 
				driverDetails.getLicense().getExpiryDate().getYear() + "-" + 
						driverDetails.getLicense().getExpiryDate().getMonth() + "-" + 
						driverDetails.getLicense().getExpiryDate().getDay() );
		
		Time timeOfAccident = new Time(accidentDetails.getTime().getMillisecond());

		String insertClaimString = "INSERT INTO claims.Claims" +
									"(policyNo, "
									+ "coverNoteNo, "
									+ "insuranceFrom, "
									+ "insuranceTo, "
									+ "NameOfInsured, "
									+ "dobOfInsured, "
									+ "addressOfInsured, "
									+ "pinOfInsured, "
									+ "officePhoneOfInsured, "
									+ "residencePhoneOfInsured, "
									+ "mobilePhoneOfInsured, "
									+ "emailOfInsured, "
									+ "regdNo, "
									+ "make, "
									+ "dateOfFirstRegistration, "
									+ "chassisNo, "
									+ "engineNo, "
									+ "dateOfTransfer, "
									+ "typeOfFuel, "
									+ "color, "
									+ "dateOfAccident, "
									+ "time, "
									+ "speed, "
									+ "place, "
									+ "noOfPeopleTravelling, "
									+ "policeStationName, "
									+ "FIRNo, "
									+ "Mileage, "
									+ "nameOfDriver, "
									+ "relationWithInsured, "
									+ "addressOfDriver, "
									+ "contactNoOfDriver, " 
									+ "dateOfBirthOfDriver, "
									+ "licenseNo, "
									+ "issuingRTO, " 
									+ "effectiveFrom, "
									+ "expiryDate, "
									+ "class, "
									+ "licenseType)"
									+ "VALUES" 
									+ "('" 
									+ policyHolderDetails.getPolicyNo() + "','"
									+ policyHolderDetails.getCoverNoteNo() + "','"
									+ insuranceFrom + "','"
									+ insuranceTo + "','"
									+ policyHolderDetails.getNameOfInsured() + "','"
									+ dobOfInsured + "','"
									+ policyHolderDetails.getAddressOfInsured() + "','"
									+ policyHolderDetails.getPinOfInsured() + "','"
									+ policyHolderDetails.getPhoneOfInsured().getOffice() + "','"
									+ policyHolderDetails.getPhoneOfInsured().getResidence() + "','"
									+ policyHolderDetails.getPhoneOfInsured().getMobile() + "','"
									+ policyHolderDetails.getEmailOfInsured() + "','"
									+ vehicleDetails.getRegdNo() + "','" 
									+ vehicleDetails.getMake() + "','"
									+ dateOfFirstRegistration + "','"
									+ vehicleDetails.getChassisNo() + "','"
									+ vehicleDetails.getEngineNo() + "','"
									+ dateOfTransfer + "','"
									+ vehicleDetails.getTypeOfFuel() + "','"
									+ vehicleDetails.getColor() + "','"
									+ dateOfAccident + "','"
									+ timeOfAccident + "','" 
									+ accidentDetails.getSpeed() + "','"
									+ accidentDetails.getPlace() + "','"
									+ accidentDetails.getNoOfPeopleTravelling() + "','"
									+ accidentDetails.getPoliceStationName() + "','"
									+ accidentDetails.getFIRNo() + "','"
									+ accidentDetails.getMileage() + "','"
									+ driverDetails.getName() + "','"
									+ driverDetails.getRelationWithInsured() + "','"
									+ driverDetails.getAddress() + "','"
									+ driverDetails.getContactNo() + "','"
									+ dateOfBirthOfDriver + "','"
									+ driverDetails.getLicense().getLicenseNo() + "','"
									+ driverDetails.getLicense().getIssuingRTO() + "','"		
									+ effectiveFrom + "','"
									+ expiryDate + "','"
									+ driverDetails.getLicense().getClazz().value().toUpperCase() +  "','" 
									+ driverDetails.getLicense().getType().value().toUpperCase() + "');";
		
		System.out.println(insertClaimString);
		
		try{
			conn.setAutoCommit(false);
			insertClaim = conn.prepareStatement(insertClaimString);
		    insertClaim.execute();
			String selectClaimString = "select * from claims.Claims where policyNo='" + policyHolderDetails.getPolicyNo() + "';";
			PreparedStatement selectClaim = conn.prepareStatement(selectClaimString);
			ResultSet rs = selectClaim.executeQuery();
			while(rs.next()) {
				claimId = rs.getInt(1);
			}
			//insert claim status
			Date currDate = new Date((new java.util.Date()).getTime());
			String insertClaimStatusString = "insert into claims.ClaimStatus"
					+ "(claimId,"
					+ "claimStatus,"
					+ "amount,"
					+ "date) VALUES ("
					+ claimId
					+ ", 'submitted'"
					+ ", 0,'"
					+ currDate
					+"')";
			insertClaimStatus = conn.prepareStatement(insertClaimStatusString);
			insertClaimStatus.execute();
			conn.commit();
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
		}
		System.out.println(claimId + " this is new claim ID");
		
		return claimId;
	}

}
