import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Object> Necklace = new ArrayList<Object>();
        float NecklacePrice = 0;
        float NecklaceWeight = 0;

        FirstPrec Diamond = new FirstPrec("Алмаз", 200, 0.1, 0.9);
        FirstPrec Ruby = new FirstPrec("Рубин", 150, 0.4, 0.8);
        SecondPrec Sampfire = new SecondPrec("Сампфир", 125, 0.36, 0.5);
        FourthPrec Amethyst = new FourthPrec("Аметист", 56, 0.22, 0.7);
        FirstSemiPrec Malachite = new FirstSemiPrec("Малахит", 37, 0.4, 0.2);
        ThirdPrec Topaz = new ThirdPrec("Топаз", 78, 0.4, 0.8);
        FirstSemiPrec Nephritis = new FirstSemiPrec("Нефрит", 25, 0.5, 0.2);
        FirstSemiPrec Lapis = new FirstSemiPrec("Лазурит", 40, 0.6, 0.3);
        SecondSemiPrec Opal = new SecondSemiPrec("Опал", 35, 0.8, 0.4);
        SecondSemiPrec Hematite = new SecondSemiPrec("Гематит", 10, 2, 0.3);

        Necklace.add(Diamond);
        Necklace.add(Ruby);
        Necklace.add(Sampfire);
        Necklace.add(Amethyst);
        Necklace.add(Malachite);
        Necklace.add(Topaz);
        Necklace.add(Nephritis);
        Necklace.add(Lapis);
        Necklace.add(Opal);
        Necklace.add(Hematite);
        
        // Считаем и выводим общую стоимость букета
        for (Object necklaceElement: Necklace) {
            NecklacePrice += ((CanBePutIntoNecklace)necklaceElement).getPrice();
            NecklaceWeight += ((CanBePutIntoNecklace)necklaceElement).getWeight();
        }
        System.out.println("Общая стоимость намиста: " + Math.round(NecklacePrice));
        System.out.println("Общий вес намиста: " + Math.round(NecklaceWeight));

        // Сортируем цветы по свежести (сначала свежие)
        PriceComparator MyComparator = new PriceComparator();
        Necklace.sort(MyComparator);

        // Ввод левой и правой границы диапазона длины цветка
        Scanner MyScanner = new Scanner(System.in);
        System.out.println("Введите левую границу:");
        float leftBorder = MyScanner.nextFloat();
        System.out.println("Введите правую границу:");
        float rightBorder = MyScanner.nextFloat();

        // Вывод цветков, чья длина входит в указанный диапазон
        System.out.println("Камни, прозрачность которых входит в указанный диапазон:");
        for (Object necklaceElement: Necklace) {
            if (necklaceElement instanceof Stone) {
                double stoneTransparency = ((Stone)necklaceElement).getTransparency();
                if ((stoneTransparency >= leftBorder) && (((Stone)necklaceElement).getTransparency() <= rightBorder)) {
                    System.out.println(((Stone)necklaceElement).getName());
                }
            }
        }

    }
}