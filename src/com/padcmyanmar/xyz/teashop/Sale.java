package com.padcmyanmar.xyz.teashop;

import java.util.ArrayList;
import java.util.List;

public class Sale {

    private List<SaleItem> saleItems;

    public Sale() {
        this.saleItems = new ArrayList<>();
    }

    public void addNewSaleItem(SaleItem saleItem) {
        saleItems.add(saleItem);
    }

    public List<SaleItem> getSaleItems() {
        return saleItems;
    }
}
