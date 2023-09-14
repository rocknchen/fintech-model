package com.hthk.calypsox.model.position.dto;

import com.hthk.fintech.enumration.FieldOrder;

@FieldOrder({
        "liquidationKey",
        "liquidationMethod",
        "book", "product", "basketId",
        "longShort", "quantity"
})
public class PositionCalCSVDTO {

    private String liquidationKey;

    private String liquidationMethod;

    private String book;

    private String product;

    private String basketId;

    private String longShort;

    private String quantity;

    public String getLiquidationKey() {
        return liquidationKey;
    }

    public void setLiquidationKey(String liquidationKey) {
        this.liquidationKey = liquidationKey;
    }

    public String getLiquidationMethod() {
        return liquidationMethod;
    }

    public void setLiquidationMethod(String liquidationMethod) {
        this.liquidationMethod = liquidationMethod;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getBasketId() {
        return basketId;
    }

    public void setBasketId(String basketId) {
        this.basketId = basketId;
    }

    public String getLongShort() {
        return longShort;
    }

    public void setLongShort(String longShort) {
        this.longShort = longShort;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

}
