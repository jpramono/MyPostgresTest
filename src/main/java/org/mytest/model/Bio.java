package org.mytest.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;


import java.util.Date;

@Entity
@Table(name = "UserDetail")
public class Bio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "user_id",nullable = false)
    private long userid;
    @Column(name = "firstname",nullable = false)
    private String firstName;
    @Column(name = "midname")
    private String middleName;
    @Column(name= "lastname")
    private String lastName;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DOB",nullable = false)
    private Date DOB;
    @Column(name="POB")
    private String POB;
    @Column(name = "address")
    private String address;
    @Column(name = "dateCreated")
    private Date dateCreated;
    @Column(name = "dateUpdate")
    private Date dateUpdated;





    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
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
    public long getId() {
        return id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Override
    public String toString() {
        return "Bio{" +
                "id=" + getId() +
                ", userid=" + userid +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", DOB=" + DOB +
                ", POB='" + POB + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
