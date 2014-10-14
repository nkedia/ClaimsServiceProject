package com.claims.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.claims.service.AccidentDetailsType;
import com.claims.service.ClaimsType;
import com.claims.service.ClassType;
import com.claims.service.DriverDetailsType;
import com.claims.service.LicenseType;
import com.claims.service.PeriodOfInsuranceType;
import com.claims.service.PhoneType;
import com.claims.service.PolicyHolderDetailsType;
import com.claims.service.Type;
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
				int claimId = rs.getInt(1);
				getClaimStatus(conn, claimId, claim);
				getClaimPolicyHolderDetails(rs, claim);
				getClaimVehicleDetails(rs, claim);
				getClaimAccidentDetails(rs, claim);
				getClaimDriverDetails(rs, claim);
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
			claim.setClaimId(claimId +"");
			claim.setClaimStatus(claimStatus);
			claim.setAmountSettled(Float.toString(amount));
			claim.setDateOfSettlement(gc);
		}
	}

	private static void getClaimPolicyHolderDetails(ResultSet rs,
			ClaimsType claim) throws SQLException, DatatypeConfigurationException {
		
		PolicyHolderDetailsType policyHolderDetails = new PolicyHolderDetailsType();
		String policyNo = rs.getString(2);
		String coverNoteNo = rs.getString(3);
		Date insuranceFrom = rs.getDate(4);
		Date insuranceTo = rs.getDate(5);
		String nameOfInsured = rs.getString(6);
		Date dobOfInsured  = rs.getDate(7);
		String address = rs.getString(8);
		String pin = rs.getString(9);
		String officePhone = rs.getString(10);
		String residencePhone = rs.getString(11);
		String mobilePhone = rs.getString(12);
		String email = rs.getString(13);
		
		GregorianCalendar cal1 = new GregorianCalendar();
		cal1.setTime(insuranceFrom);
		XMLGregorianCalendar gc1 =
		     DatatypeFactory.newInstance().newXMLGregorianCalendar(cal1); 
		GregorianCalendar cal2 = new GregorianCalendar();
		cal2.setTime(insuranceTo);
		XMLGregorianCalendar gc2 =
		     DatatypeFactory.newInstance().newXMLGregorianCalendar(cal2); 
		GregorianCalendar cal3 = new GregorianCalendar();
		cal3.setTime(dobOfInsured);
		XMLGregorianCalendar gc3 =
		     DatatypeFactory.newInstance().newXMLGregorianCalendar(cal3); 
		
		policyHolderDetails.setPolicyNo(policyNo);
		policyHolderDetails.setCoverNoteNo(coverNoteNo);
		PeriodOfInsuranceType periodOfInsurance = new PeriodOfInsuranceType();
		periodOfInsurance.setFrom(gc1);
		periodOfInsurance.setTo(gc2);
		policyHolderDetails.setPeriodOfInsurance(periodOfInsurance );
		policyHolderDetails.setNameOfInsured(nameOfInsured);
		policyHolderDetails.setDobOfInsured(gc3);
		policyHolderDetails.setAddressOfInsured(address);
		policyHolderDetails.setPinOfInsured(pin);
		PhoneType phone = new PhoneType();
		phone.setMobile(mobilePhone);
		phone.setResidence(residencePhone);
		phone.setOffice(officePhone);
		policyHolderDetails.setPhoneOfInsured(phone);
		policyHolderDetails.setEmailOfInsured(email);
		
		claim.setPolicyHolderDetails(policyHolderDetails);
		
	}

	private static void getClaimVehicleDetails(ResultSet rs, 
			ClaimsType claim) throws SQLException, DatatypeConfigurationException {

		VehicleDetailsType vehicleDetails = new VehicleDetailsType();
		String regdNo = rs.getString(14);
		String make = rs.getString(15);
		Date dateOfFirstRegistration = rs.getDate(16);
		String chassisNo = rs.getString(17);
		String engineNo = rs.getString(18);
		Date dateOfTransfer = rs.getDate(19);
		String typeOfFuel = rs.getString(20);
		String color = rs.getString(21);
		
		GregorianCalendar cal1 = new GregorianCalendar();
		cal1.setTime(dateOfFirstRegistration);
		XMLGregorianCalendar gc1 =
		     DatatypeFactory.newInstance().newXMLGregorianCalendar(cal1); 
		GregorianCalendar cal2 = new GregorianCalendar();
		cal1.setTime(dateOfTransfer);
		XMLGregorianCalendar gc2 =
		     DatatypeFactory.newInstance().newXMLGregorianCalendar(cal2); 
		
		vehicleDetails.setRegdNo(regdNo);
		vehicleDetails.setMake(make);
		vehicleDetails.setDateOfFirstRegistration(gc1);
		vehicleDetails.setChassisNo(chassisNo);
		vehicleDetails.setEngineNo(engineNo);
		vehicleDetails.setDateOfTransfer(gc2);
		vehicleDetails.setTypeOfFuel(typeOfFuel);
		vehicleDetails.setColor(color);
		
		claim.setVehicleDetails(vehicleDetails);
		
	}

	private static void getClaimAccidentDetails(ResultSet rs, 
			ClaimsType claim) throws SQLException, DatatypeConfigurationException {
	
		AccidentDetailsType accidentDetails = new AccidentDetailsType();
		Date dateOfAccident = rs.getDate(22);
		Time timeOfAccident = rs.getTime(23);
		String speed = rs.getString(24);
		String place = rs.getString(25);
		String noOfPeople = rs.getString(26);
		String policeStationName = rs.getString(27);
		String firNo = rs.getString(28);
		String mileage = rs.getString(29);
		
		GregorianCalendar cal1 = new GregorianCalendar();
		cal1.setTime(dateOfAccident);
		XMLGregorianCalendar gc1 =
		     DatatypeFactory.newInstance().newXMLGregorianCalendar(cal1); 
		GregorianCalendar cal2 = new GregorianCalendar();
		cal1.setTime(timeOfAccident);
		XMLGregorianCalendar gc2 =
		     DatatypeFactory.newInstance().newXMLGregorianCalendar(cal2); 
		
		accidentDetails.setDateOfAccident(gc1);
		accidentDetails.setTime(gc2);
		accidentDetails.setSpeed(speed);
		accidentDetails.setPlace(place);
		accidentDetails.setNoOfPeopleTravelling(noOfPeople);
		accidentDetails.setPoliceStationName(policeStationName);
		accidentDetails.setFIRNo(firNo);
		accidentDetails.setMileage(mileage);
		
		claim.setAccidentDetails(accidentDetails);
		
	}

	private static void getClaimDriverDetails(ResultSet rs, 
			ClaimsType claim) throws SQLException, DatatypeConfigurationException {
		
		DriverDetailsType driverDetails = new DriverDetailsType();				
		String nameOfDriver = rs.getString(30);
		String relation = rs.getString(31);
		String addressOfDriver = rs.getString(32);
		String contactNo = rs.getString(33);
		Date dobOfDriver = rs.getDate(34);
		String licenseNo = rs.getString(35);
		String issuingRTO = rs.getString(36);
		Date effectiveFrom = rs.getDate(37);
		Date expiryDate = rs.getDate(38);
		String licenseClass = rs.getString(39);
		String licenseType = rs.getString(40);
		
		GregorianCalendar cal1 = new GregorianCalendar();
		cal1.setTime(dobOfDriver);
		XMLGregorianCalendar gc1 =
		     DatatypeFactory.newInstance().newXMLGregorianCalendar(cal1); 
		GregorianCalendar cal2 = new GregorianCalendar();
		cal2.setTime(effectiveFrom);
		XMLGregorianCalendar gc2 =
		     DatatypeFactory.newInstance().newXMLGregorianCalendar(cal2); 
		GregorianCalendar cal3 = new GregorianCalendar();
		cal3.setTime(expiryDate);
		XMLGregorianCalendar gc3 =
		     DatatypeFactory.newInstance().newXMLGregorianCalendar(cal3); 
		
		driverDetails.setName(nameOfDriver);
		driverDetails.setRelationWithInsured(relation);
		driverDetails.setAddress(addressOfDriver);
		driverDetails.setContactNo(contactNo);
		driverDetails.setDOB(gc1);
		LicenseType license = new LicenseType();
		license.setLicenseNo(licenseNo);
		license.setIssuingRTO(issuingRTO);
		license.setEffectiveFrom(gc2);
		license.setExpiryDate(gc3);
		license.setClazz(ClassType.valueOf(licenseClass));
		license.setType(Type.valueOf(licenseType));
		driverDetails.setLicense(license );
		
		claim.setDriverDetails(driverDetails);
	}

}
