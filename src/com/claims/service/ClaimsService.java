package com.claims.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.11.redhat-3
 * 2014-11-14T15:19:54.309+05:30
 * Generated source version: 2.7.11.redhat-3
 * 
 */
@WebService(targetNamespace = "localhost:8080/ClaimsService/", name = "ClaimsService")
@XmlSeeAlso({ObjectFactory.class})
public interface ClaimsService {

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "updateExistingClaims", targetNamespace = "localhost:8080/ClaimsService/", className = "com.claims.service.UpdateExistingClaims")
    @WebMethod(action = "updateExistingClaims")
    @ResponseWrapper(localName = "updateExistingClaimsResponse", targetNamespace = "localhost:8080/ClaimsService/", className = "com.claims.service.UpdateExistingClaimsResponse")
    public boolean updateExistingClaims(
        @WebParam(name = "claimId", targetNamespace = "")
        java.lang.String claimId,
        @WebParam(name = "policeStationName", targetNamespace = "")
        java.lang.String policeStationName,
        @WebParam(name = "FIRNo", targetNamespace = "")
        java.lang.String firNo
    );

    @RequestWrapper(localName = "fileNewClaim", targetNamespace = "localhost:8080/ClaimsService/", className = "com.claims.service.FileNewClaim")
    @WebMethod(action = "fileNewClaim")
    @ResponseWrapper(localName = "fileNewClaimResponse", targetNamespace = "localhost:8080/ClaimsService/", className = "com.claims.service.FileNewClaimResponse")
    public void fileNewClaim(
        @WebParam(name = "policyHolderDetails", targetNamespace = "")
        com.claims.service.PolicyHolderDetailsType policyHolderDetails,
        @WebParam(name = "vehicleDetails", targetNamespace = "")
        com.claims.service.VehicleDetailsType vehicleDetails,
        @WebParam(name = "accidentDetails", targetNamespace = "")
        com.claims.service.AccidentDetailsType accidentDetails,
        @WebParam(name = "driverDetails", targetNamespace = "")
        com.claims.service.DriverDetailsType driverDetails,
        @WebParam(mode = WebParam.Mode.OUT, name = "claimsID", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> claimsID,
        @WebParam(mode = WebParam.Mode.OUT, name = "result", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Boolean> result
    );

    @WebResult(name = "claims", targetNamespace = "")
    @RequestWrapper(localName = "getExistingClaims", targetNamespace = "localhost:8080/ClaimsService/", className = "com.claims.service.GetExistingClaims")
    @WebMethod(action = "getExistingClaims")
    @ResponseWrapper(localName = "getExistingClaimsResponse", targetNamespace = "localhost:8080/ClaimsService/", className = "com.claims.service.GetExistingClaimsResponse")
    public java.util.List<com.claims.service.ClaimsType> getExistingClaims(
        @WebParam(name = "policyId", targetNamespace = "")
        java.lang.String policyId
    );
}
