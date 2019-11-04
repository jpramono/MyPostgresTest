package org.mytest.model.DTO;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public class BiodataRequest {
    private String firstName;
    private String middleName;
    private String lastName;
    private Date DOB;
    private String POB;
    private String address;

    private Date dateUpdated;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getPOB() {
        return POB;
    }

    public void setPOB(String POB) {
        this.POB = POB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
