package com.systechafrica.pos.posdatabase;

public class PosItems {
  private int id;
  private String item;
  private int quantity;
  private int unitPrice;

  private final String defaultPassword = "Admin123";

  public PosItems() {
  }

  public PosItems(String item, int quantity, int unitPrice) {
    this.item = item;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }

  public PosItems(int id, String item, int quantity, int unitPrice) {
    this.id = id;
    this.item = item;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public int getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(int unitPrice) {
    this.unitPrice = unitPrice;
  }

  public String getDefaultPassword() {
    return defaultPassword;
  }

  @Override
  public String toString() {
    return "PosItems [id=" + id + ", item=" + item + ", Quantity=" + quantity + ", unitPrice=" + unitPrice + "]";
  }

}
