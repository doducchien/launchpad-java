package com.example.launchpadjava.dto.request;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PoolRequest {

    private String type;
    private Timestamp startTime;
    private Timestamp endTime;
    private Long priceEachToken;
    private Long numberTokenRaise;
    private Long fundRaise;
    private Long maxAllocationPerWallet;
}
