package com.mobile.mobile.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Mobile {
    private double mobileCost;
    @Id
    private String mobilEname;
    private String mobileFeatures;
}
