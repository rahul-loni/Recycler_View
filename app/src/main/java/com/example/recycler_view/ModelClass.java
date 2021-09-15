package com.example.recycler_view;

public class ModelClass {

    private int itemImage;
    private String itemName;
    private String itemDec;
    private String itemPrice;


    public ModelClass(int itemImage, String itemName, String itemDec, String itemPrice) {
        this.itemImage = itemImage;
        this.itemName = itemName;
        this.itemDec = itemDec;
        this.itemPrice = itemPrice;
    }

    public int getItemImage() {
        return itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDec() {
        return itemDec;
    }

    public String getItemPrice() {
        return itemPrice;
    }
}
