package com.example.launchpadjava.dto.request;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class ProjectRequest {
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
