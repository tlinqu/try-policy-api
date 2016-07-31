package gov.samhsa.mhc.trypolicy.service;


import gov.samhsa.mhc.trypolicy.service.exception.TryPolicyException;

public interface TryPolicyService {
    String getSegmentDocXHTML(String patientUsername, String patientId, String documentId, String consentId, String purposeOfUse) throws TryPolicyException;
}
