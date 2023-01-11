public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
    }

    public static void task1 () {
        System.out.println("Задача 1");
      for(int i=1;i<=10;i++){
          System.out.println(i);
      }

    }

    public static void task2 () {
        System.out.println("Задача 2");
        for(int i=10;i>0;i=i-1){
            System.out.println(i);
        }

    }
    public static void task3 () {
        System.out.println("Задача 3");
        for(int i=2;i<17;i=i+2){
            System.out.println(i);
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        for(int i=10;i>=-10;i=i-1){
            System.out.println(i);
        }

    }
    public static void task5 () {
        System.out.println("Задача 5");
        for(int i=1904;i<=2096;i=i+4){
            System.out.println(i+" год является високосным");
        }

    }
    public static void task6 () {
        System.out.println("Задача 6");
        for (int i=7;i<=98;i=i+7){
            System.out.print(i+" ");
        }
        System.out.println();

    }
    public static void task7 () {
        System.out.println("Задача 7");
        for (int i=1;i<=512;i=i*2){
            System.out.print(i+" ");
        }
        System.out.println();

    }
    public static void task8 () {
        System.out.println("Задача 8-9");
        int month=29000;
        int total=0;
        for (int i=1;i<=12;i=i+1){
            total=total+total/100;
            total=total+month;
            System.out.println("Месяц "+i+", сумма накоплений равна "+total+" рублей");
        }
        System.out.println(total);

    }
    public static void task9 () {
        System.out.println("Задача 10");
        int a=2;
        for (int i=1;i<=10;i=i+1){
            int b=a*i;
            System.out.println(a+"*"+i+"="+b);
        }
    }
    public static void task10 () {
        System.out.println("Часть 2.Задача 1");
        int deposit=15000;
        int total=0;
        int month=0;
        while (total<=2_459_000){
            total=total+deposit;
            month++;
            System.out.println("Месяц "+month+", сумма накоплений равна "+total+" рублей");
        }

    }
    public static void task11 () {
        System.out.println("Часть 2.Задача 2");
        int c=0;
        while(c<10){
            c++;
            System.out.print(c+" ");
        }
        System.out.println();
        for(int i=10;i>0;i=i-1){
            System.out.print(i+" ");
        }
        System.out.println();

    }
    public static void task12 () {
        System.out.println("Часть 2.Задача 3");
        int population=12_000_000;
        int natality=17*(population/1000);
        int mortalitiRate=8*(population/1000);
        int i=0;
        while(i<10){
            i++;
            population=population+natality-mortalitiRate;
            System.out.println("Год "+i+", численность населения составляет "+population);
        }


    }
    public static void task13 () {
        System.out.println("Часть 2.Задача 4");
        int deposit = 15000;
        int total = 0;
        int month = 0;
        while (total <= 12_000_000) {
            total =(int)(total + total * 0.07);
            total = total + deposit;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task14 () {
        System.out.println("Часть 2.Задача 5");
        int deposit = 15000;
        int total = 0;
        int month = 0;
        while (total <= 12_000_000) {
            total =(int)(total + total * 0.07);
            total = total + deposit;
            month++;
            if(month%6==0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }
    public static void task15 () {
        System.out.println("Часть 2.Задача 6");
        int deposit = 15000;
        int total = 0;
        int month = 0;
        while (month <= 108) {
            total = (int) (total + total * 0.07);
            total = total + deposit;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }
        public static void task16 () {
            System.out.println("Часть 2.Задача 7");
            int firstFriday=6;
            while(firstFriday<=31){
                System.out.println("Сегодня пятница, "+firstFriday+"-е число. Необходимо подготовить отчет");
                firstFriday=firstFriday+7;

            }

            }
    public static void task17 () {
        System.out.println("Часть 2.Задача 8");
        int start=1823;
        while(start<=2123){
            start++;
            if(start%79==0) {
                System.out.println(start);
            }
        }

    }

}