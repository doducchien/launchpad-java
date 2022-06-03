package com.example.launchpadjava.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "project")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String type;
    private String name;
    private String description;
    private String tokenType;
    private String tokenSymbol;
    private String tokenAddress;
    private String tokenVesting;
    private Timestamp tokenListingDate;
    private String websiteLink;
    private String fundRaiseIn;
    private int totalNumberTokenRaise;
    private int targetTotalFundRaise;
    private int totalFundRaise;
    private int nftDistributionDate;
    
}
