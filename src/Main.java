public class Main {
    public static void main(String[] args) {
        //задача первая//
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        //задача вторая//
        for (int i = 10; i >= 1; i-- ) {
            System.out.println("Итерация цикла " + i);
        }
        //задача третья//
        for (int i = 0; i<=17; i = i + 2 ) {
            System.out.println("Итерация цикла " + i);
        }
        //задача четвертая//
        for (int i =-10; i<=10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        //Домашнее задание 2. задача первая//
        for (int i = 1904; i<= 2094; i = i + 4) {
            System.out.println("Високосные года " + i);
        }
        //задача вторая//
        for (int i = 7; i <= 98; i = i +7) {
            System.out.println(i);
        }
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        int accumulation = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + accumulation;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        double accumulationWithPercent = 0;
        double accumulation1 = 29000;
        double total1= 0.01;
        for (int i = 1; i <= 12; i++) {
            accumulationWithPercent = (accumulationWithPercent + accumulation1 ) * (1 + total1);
            System.out.println("Месяц " + i + " сумма накоплений равна " + accumulationWithPercent + " рублей");
        }
        }
    }