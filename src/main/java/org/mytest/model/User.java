package org.mytest.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="users")
public class User  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "username",nullable = false)
    private String userName;
    @Column(name = "password",nullable = false)
    private String password;
    @Column(name = "email",nullable = false)
    private String email;
    @Column(name = "createby")
    private String createBy;
    @Column(name = "updateby")
    private String updateBy;
    @Column(name = "delete")
    private Boolean deleted=false;
    @Column(name="suspend")
    private Boolean Suspended=false;
    @Column(name = "dateCreated")
    private Date dateCreated;
    @Column(name = "dateUpdate")
    private Date dateUpdated;




    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean getSuspended() {
        return Suspended;
    }

    public void setSuspended(Boolean suspended) {
        Suspended = suspended;
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
        return "User{" +
                "id=" + this.getId() +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", dateCreated=" + this.getDateCreated()+
                ", dateUpdated=" + this.getDateUpdated()+
                ", createBy='" + createBy + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", deleted=" + deleted +
                ", Suspended=" + Suspended +
                '}';
    }
}
