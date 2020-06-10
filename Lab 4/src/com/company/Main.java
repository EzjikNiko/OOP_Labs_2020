package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Создаём экземпляры класса Sports Equipment
        Furniture WoodChair = new Furniture("Деревянный стул", "Дерево", "Бежевый", 24, 800);
        Furniture OfficeChair = new Furniture("Офисный стул", "Обшивка: кожа; Корпус: меттал", "Черный", 5, 1700);
        Furniture WoodTable = new Furniture("Деревянный стол", "Дерево", "Темно-коричневый", 12, 1200);
        Furniture MetalTable = new Furniture("Металлический стол", "Металл", "Серебристый", 3, 3800);
        Furniture Closet = new Furniture("Шкаф-купе", "Дерево", "Бежевый", 8, 4440);
        Furniture DuoSofa = new Furniture("Двухмеснный диван", "Обивка: хлопок; Каркас: дерево", "Серый", 10, 4000);

        ArrayList<Furniture> MyArray = new ArrayList<Furniture>();

        // Добавляём экземпляры класса Sports Equipment в массив MyArray
        MyArray.add(WoodChair);
        MyArray.add(OfficeChair);
        MyArray.add(WoodTable);
        MyArray.add(MetalTable);
        MyArray.add(Closet);
        MyArray.add(DuoSofa);

        // Выыводим несортированный массив
        System.out.println("Каталог мебели до сортировки:");
        for (Furniture equipment : MyArray) {
            System.out.println(equipment.OutputData());
        }

        // Сортируем массив по цене по убыванию
        PriceComparator MyPriceComparator = new PriceComparator();
        MyArray.sort(MyPriceComparator);
        System.out.println("\nСКаталог мебели после сортировки по цене по убыванию:");
        for (Furniture equipment : MyArray) {
            System.out.println(equipment.OutputData());
        }

        // Сортируем массив по именам по возростанию
        AmountComparator MyAmountComparator = new AmountComparator();
        MyArray.sort(MyAmountComparator);
        System.out.println("\nКаталог мебели после сортировки по количеству по возростанию:");
        for (Furniture equipment : MyArray) {
            System.out.println(equipment.OutputData());
        }
    }
}
