package com.hthk.calypsox.model.position.dto;

import com.hthk.fintech.enumration.CSVField;
import com.hthk.fintech.enumration.FieldOrder;

@FieldOrder({
        "liquidationKey",
        "liquidationMethod",
        "book", "product", "basketId",
        "positionId",
        "longShort", "quantity", "quantityBreakDown"
})
public class PositionCalCSVDTO {

    @CSVField(header = "Liquidation Key")
    private String liquidationKey;

    @CSVField(header = "Liquidation Method")
    private String liquidationMethod;

    @CSVField(header = "Book")
    private String book;

    @CSVField(header = "Product")
    private String product;

    @CSVField(header = "TRS_BASKET_ID")
    private String basketId;

    @CSVField(header = "Position Id")
    private String positionId;

    @CSVField(header = "Long Short")
    private String longShort;

    @CSVField(header = "Quantity")
    private String quantity;

    @CSVField(header = "BreakDown.Quantity")
    private String quantityBreakDown;

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

    public String getQuantityBreakDown() {
        return quantityBreakDown;
    }

    public void setQuantityBreakDown(String quantityBreakDown) {
        this.quantityBreakDown = quantityBreakDown;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }
}
