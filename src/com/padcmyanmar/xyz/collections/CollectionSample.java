package com.padcmyanmar.xyz.collections;

import com.padcmyanmar.xyz.teashop.SaleItem;

import java.util.*;

public class CollectionSample {

    private List<SaleItem> saleItems;
    private Map<Integer, SaleItem> saleItemsMap;
    private Set<SaleItem> saleItemsSet;

    public CollectionSample() {
        this.saleItems = new ArrayList<>();
        this.saleItemsMap = new HashMap<>();
        this.saleItemsSet = new HashSet<>();
    }

    public void addNewSaleItem(SaleItem saleItem) {
        saleItems.add(saleItem);
        saleItems.add(3, saleItem);
        saleItems.set(3, saleItem);
        //saleItems.addAll();
        saleItems.get(3);

        saleItemsMap.put(1, saleItem);
        saleItemsMap.put(2, saleItem);
        //saleItemsMap.putAll();
        //saleItemsMap.put(1, anotherSaleItem);
        //saleItemsMap.putIfAbsent(saleItem);
        saleItemsMap.get("abc");

        saleItemsSet.add(saleItem);
        //saleItemsSet.addAll();
        saleItemsSet.iterator().next();
        for(SaleItem saleItem1 : saleItemsSet) {

        }
    }

    public List<SaleItem> getSaleItems() {
        return saleItems;
    }
}
