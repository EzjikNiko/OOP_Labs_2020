import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Object> Necklace = new ArrayList<Object>();
        float NecklacePrice = 0;
        float NecklaceWeight = 0;

        FirstPrec Diamond = new FirstPrec("�����", 200, 0.1, 0.9);
        FirstPrec Ruby = new FirstPrec("�����", 150, 0.4, 0.8);
        SecondPrec Sampfire = new SecondPrec("�������", 125, 0.36, 0.5);
        FourthPrec Amethyst = new FourthPrec("�������", 56, 0.22, 0.7);
        FirstSemiPrec Malachite = new FirstSemiPrec("�������", 37, 0.4, 0.2);
        ThirdPrec Topaz = new ThirdPrec("�����", 78, 0.4, 0.8);
        FirstSemiPrec Nephritis = new FirstSemiPrec("������", 25, 0.5, 0.2);
        FirstSemiPrec Lapis = new FirstSemiPrec("�������", 40, 0.6, 0.3);
        SecondSemiPrec Opal = new SecondSemiPrec("����", 35, 0.8, 0.4);
        SecondSemiPrec Hematite = new SecondSemiPrec("�������", 10, 2, 0.3);

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
        
        // ������� � ������� ����� ��������� ������
        for (Object necklaceElement: Necklace) {
            NecklacePrice += ((CanBePutIntoNecklace)necklaceElement).getPrice();
            NecklaceWeight += ((CanBePutIntoNecklace)necklaceElement).getWeight();
        }
        System.out.println("����� ��������� �������: " + Math.round(NecklacePrice));
        System.out.println("����� ��� �������: " + Math.round(NecklaceWeight));

        // ��������� ����� �� �������� (������� ������)
        PriceComparator MyComparator = new PriceComparator();
        Necklace.sort(MyComparator);

        // ���� ����� � ������ ������� ��������� ����� ������
        Scanner MyScanner = new Scanner(System.in);
        System.out.println("������� ����� �������:");
        float leftBorder = MyScanner.nextFloat();
        System.out.println("������� ������ �������:");
        float rightBorder = MyScanner.nextFloat();

        // ����� �������, ��� ����� ������ � ��������� ��������
        System.out.println("�����, ������������ ������� ������ � ��������� ��������:");
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