
package com.claim.service;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.claim.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.claim.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VehicleDetailsType }
     * 
     */
    public VehicleDetailsType createVehicleDetailsType() {
        return new VehicleDetailsType();
    }

    /**
     * Create an instance of {@link AccidentDetailsType }
     * 
     */
    public AccidentDetailsType createAccidentDetailsType() {
        return new AccidentDetailsType();
    }

    /**
     * Create an instance of {@link PolicyHolderDetailsType }
     * 
     */
    public PolicyHolderDetailsType createPolicyHolderDetailsType() {
        return new PolicyHolderDetailsType();
    }

    /**
     * Create an instance of {@link PhoneType }
     * 
     */
    public PhoneType createPhoneType() {
        return new PhoneType();
    }

    /**
     * Create an instance of {@link PeriodOfInsuranceType }
     * 
     */
    public PeriodOfInsuranceType createPeriodOfInsuranceType() {
        return new PeriodOfInsuranceType();
    }

    /**
     * Create an instance of {@link GetExistingClaims }
     * 
     */
    public GetExistingClaims createGetExistingClaims() {
        return new GetExistingClaims();
    }

    /**
     * Create an instance of {@link FileNewClaim }
     * 
     */
    public FileNewClaim createFileNewClaim() {
        return new FileNewClaim();
    }

    /**
     * Create an instance of {@link DriverDetailsType }
     * 
     */
    public DriverDetailsType createDriverDetailsType() {
        return new DriverDetailsType();
    }

    /**
     * Create an instance of {@link GetExistingClaimsResponse }
     * 
     */
    public GetExistingClaimsResponse createGetExistingClaimsResponse() {
        return new GetExistingClaimsResponse();
    }

    /**
     * Create an instance of {@link ClaimsType }
     * 
     */
    public ClaimsType createClaimsType() {
        return new ClaimsType();
    }

    /**
     * Create an instance of {@link FileNewClaimResponse }
     * 
     */
    public FileNewClaimResponse createFileNewClaimResponse() {
        return new FileNewClaimResponse();
    }

    /**
     * Create an instance of {@link LicenseType }
     * 
     */
    public LicenseType createLicenseType() {
        return new LicenseType();
    }

}
