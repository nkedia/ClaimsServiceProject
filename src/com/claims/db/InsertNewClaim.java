package com.claims.db;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Time;

import com.claims.service.AccidentDetailsType;
import com.claims.service.DriverDetailsType;
import com.claims.service.PolicyHolderDetailsType;
import com.claims.service.VehicleDetailsType;

public class InsertNewClaim {

	public static int insertClaim(PolicyHolderDetailsType policyHolderDetails,
			VehicleDetailsType vehicleDetails,
			AccidentDetailsType accidentDetails, DriverDetailsType driverDetails) {
		
		PreparedStatement insertClaim = null;
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
		String insertClaimString = "INSERT INTO claims.claims" +
									"(`policyNo`,"
									+ "`coverNoteNo`,"
									+ "`insuranceFrom`, "
									+ "`insuranceTo`, "
									+ "`NameOfInsured`,"
									+ "`dobOfInsured`, "
									+ "`addressOfInsured`, "
									+ "`pinOfInsured`,"
									+ "`officePhoneOfInsured`, "
									+ "`residencePhoneOfInsured`,"
									+ "`mobilePhoneOfInsured`, "
									+ "`emailOfInsured`, "
									+ "`regdNo`,"
									+ "`make`, "
									+ "`dateOfFirstRegistration`, "
									+ "`chassisNo`, "
									+ "`engineNo`,"
									+ "`dateOfTransfer`, "
									+ "`typeOfFuel`, "
									+ "`color`, "
									+ "`dateOfAccident`,"
									+ "`time`, "
									+ "`speed`, "
									+ "`place`, "
									+ "`noOfPeopleTravelling`,"
									+ "`policeStationName`, "
									+ "`FIRNo`, "
									+ "`Mileage`, "
									+ "`nameOfDriver`," 
									+ "`relationWithInsured`, "
									+ "`addressOfDriver`, "
									+ "`contactNoOfDriver`," 
									+ "`dateOfBirthOfDriver`, "
									+ "`licenseNo`, "
									+ "`issuingRTO`," 
									+ "`effectiveFrom`, "
									+ "`expiryDate`, "
									+ "`class`, "
									+ "`licenseType`)"
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
									+ driverDetails.getLicense().getType().value() + "');";						;
		
		return 0;
	}

}
