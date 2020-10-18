package com.andrius.easyGift.models;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Event {

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('BIRTHDAY','WEDDINGS','CHRISTMAS')",nullable = false)
    private GiftType type;


}
