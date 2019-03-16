package com.padcmyanmar.xyz.teashop;

import java.sql.Timestamp;
import java.util.*;

public class Sale {

    private Timestamp timestamp;
    private List<SaleItem> saleItems;

    public Sale() {
        this.saleItems = new ArrayList<>();
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

    public void addNewSaleItem(SaleItem saleItem) {
        saleItems.add(saleItem);
    }

    public List<SaleItem> getSaleItems() {
        return saleItems;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}
