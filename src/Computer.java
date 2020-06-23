import java.util.Random;
import java.util.Scanner;

public class Computer {
    Scanner s = new Scanner(System.in);

    public void setProcessor(String processor) {
        Processor = processor;
    }

    public void setHardDiscName(String hardDiscName) {
        HardDiscName = hardDiscName;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    String Processor;
    String HardDiscName;
    String RAM;
    boolean koleso = true;
    int FullCiclResurs = 0;

    public void setFullCiclResurs(int fullCiclResurs) {
        FullCiclResurs = fullCiclResurs;
    }

    public int getFullCiclResurs() {
        return FullCiclResurs;
    }

    boolean NoBurned = true;
    static int count = 0;

    public void FullProg() {
        while (koleso) {

            int choice;
            System.out.println("ВЫБЕРИТЕ ДЕЙСТВИЕ:");
            System.out.println();
            System.out.println("1.ВЫВЕСТИ ДАННЫЕ О КОМПЬЮТЕРЕ.");
            System.out.println("2.ВКЛЮЧИТЬ КОМПЬЮТЕР.");
            System.out.println("3.ВЫКЛЮЧИТЬ КОМПЬЮТЕР.");
            System.out.println();
            System.out.print("ВВОД:");
            choice = s.nextInt();
            System.out.println();

            if (choice == 1) {
                OutPut();

            } else if (choice == 2) {
                ComputerOn();
            } else if (choice == 3) {
                System.out.println("КОМПЬЮТЕР ВЫКЛЮЧЕН ... .. .. . .");
                System.out.println();

            }
        }


    }


    public void OutPut() {
        System.out.println("Компьютер имеет следующие характеристики: ");
        System.out.println();
        System.out.println("Процессор :" + Processor);
        System.out.println("Оперативную память: " + RAM);
        System.out.println("Жесткий диск : " + HardDiscName);
        System.out.println("Ресурс полных циклов работы: " + FullCiclResurs);
        System.out.println();
    }


    void ComputerOn() {
        Scanner s = new Scanner(System.in);
        int x;
        Random r = new Random();
        if (FullCiclResurs != count && NoBurned) {
            System.out.println("КОМПЬЮТЕР ВКЛЮЧЕН... .. . . .......    ..   . .");
            System.out.println(); count++;
            System.out.println("###223142@34421@#4%&*%@*#");
            int y = r.nextInt(1);
            System.out.print("ПРОИЗОШЕЛ СБОЙ ЧТОБЫ ИСПРАВИТЬ И ВЫКЛЮЧИТЬ КОМПЬЮТЕР УГАДАЙТЕ ЧИСЛО 0/1 : ");

            x = s.nextInt();
             for(int i =0;i<1223;i++) {
                 if(x!=0&&x!=1){
                System.out.println(" 1 или 0 :");
                x = s.nextInt();

            }else {
                 break;}
             }
            if (x == y) {
                System.out.println("ВЕРНОЕ ЧИСЛО. \nВЫКЛЮЧЕНИЕ. .. ... . .. .. .");

            } else {
                System.out.println();
                System.out.println("ВЫ ВВЕЛИ НЕВЕРНОЕ ЧИСЛО КОМПЬЮТЕР СГОРЕЛ");
                NoBurned = false;

            }
        } else {
            System.out.println("ПРЕВЫШЕН РЕСУРС КОМПЬЮТЕРА ЛИБО ОН СГОРЕЛ");
            System.out.println();
        }
        {

        }

    }
}
