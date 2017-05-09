package uk.doh.oht.database.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import uk.doh.oht.database.validation.StartDateFormDate;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by peterwhitehead on 04/05/2017.
 */
@Data
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegistrationData implements Serializable {
    private long registrationId;
    private UserDetails userDetails;
    private List<Address> addresses;
    private String benefitType;
    private String issueType;
    private String registrationStatus;
    private String country;
    private Date entitlementDate;
    private StartDateFormDate startDate;
    private String hasForeignPension;
    private String requestedBy;
    private StartDateFormDate s073StartDate;
    private String caseId;
}