package com.example.launchpadjava.dto.request;

import java.sql.Timestamp;
import java.util.List;

import com.example.launchpadjava.entity.Pool;

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
    private Long totalNumberTokenRaise;
    private Long targetTotalFundRaise;
    private Long totalFundRaise;
    private Long nftDistributionDate;

    private List<PoolRequest> pools;
}
