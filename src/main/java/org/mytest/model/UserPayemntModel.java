package org.mytest.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "userPayment")
public class UserPayemntModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "user_id",nullable = false)
    private long userId;
    @Column(name = "payment_methode")
    private String Modelpayment;
    @Column(name="card")
    private String card;
    @Column(name="Bank")
    private String Bank;
    @Column(name="cardExpired")
    private Date expiredCard;
    @Column(name = "dateCreated")
    private java.util.Date dateCreated;
    @Column(name = "dateUpdate")
    private java.util.Date dateUpdated;

    @Override
    public String toString() {
        return "UserPayemntModel{" +
                "userId=" + userId +
                ", Modelpayment='" + Modelpayment + '\'' +
                ", card='" + card + '\'' +
                ", Bank='" + Bank + '\'' +
                ", expiredCard=" + expiredCard +
                '}';
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getModelpayment() {
        return Modelpayment;
    }

    public void setModelpayment(String modelpayment) {
        Modelpayment = modelpayment;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getBank() {
        return Bank;
    }

    public void setBank(String bank) {
        Bank = bank;
    }

    public Date getExpiredCard() {
        return expiredCard;
    }

    public void setExpiredCard(Date expiredCard) {
        this.expiredCard = expiredCard;
    }
    public long getId() {
        return id;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public java.util.Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
