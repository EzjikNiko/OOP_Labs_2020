package com.company;

public class Furniture {

    // Переменные класа SportsEquipment
    public String name;
    public String material;
    public String colour;
    public int amount;
    public int price;

    // Контструктор класса SportsEquipment
    public Furniture(String Name, String Material, String Colour, int Amount, int Price) {

        this.name = Name;
        this.material = Material;
        this.colour = Colour;
        this.amount = Amount;
        this.price = Price;

    }

    // Метод, выводящий все переменные экземпляра класса SportsEquipment
    public String OutputData() {

        StringBuilder data = new StringBuilder();
        data.append("").append(this.name);
        data.append(" / Материал = ").append(this.material);
        data.append(" / Цвет = ").append(this.colour);
        data.append(" / Количество = ").append(this.amount);
        data.append(" / Цена (грн) = ").append(this.price);
        return data.toString();

    }
}