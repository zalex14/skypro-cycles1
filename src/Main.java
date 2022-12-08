public class Main {
    public static void main(String[] args) {
    // Циклы. Задача 1
        System.out.println("\nЦиклы. Задача 1");
        for (int i=1; i<=10; i++) {
            System.out.println( i );
        }

    // Циклы. Задача 2
        System.out.println("\nЦиклы. Задача 2");
        for (int i=10; i>0; i--) {
            System.out.println( i );
        }

    // Циклы. Задача 3
        System.out.println("\nЦиклы. Задача 3");
        for (int i=0; i<=17; i=i+2) {
                System.out.println(i);
            }

    // Циклы. Задача 4
        System.out.println("\nЦиклы. Задача 4");
        for (int i=10; i> -11; i--) {
            System.out.println(i);
        }

    // Циклы. Задача 5 По заданию проверка високосных лет вне заданного диапазона не является целью задания
        System.out.println("\nЦиклы. Задача 5");
        for ( int i = 1904; i < 2097; i +=4 ) {
            System.out.println( i + " год является високосным" );
        }

    // Циклы. Задача 6
        System.out.println("\nЦиклы. Задача 6");
        for ( int i=7; i < 99; i +=7 ) {
            System.out.print( i + " " );
        }

    // Циклы. Задача 7
        System.out.println("\n\nЦиклы. Задача 7");
        for (int i=1; i < 513; i = i*2) {
            System.out.print( i + " ");
        }

    // Циклы. Задача 8 Зарпплата в целых рублях
        System.out.println("\n\nЦиклы. Задача 8");
        int bankDeposit = 0;
        int salary = 29000;
        for (int i=1; i < 13; i++) {
            bankDeposit = bankDeposit + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + bankDeposit + " рублей");
        }

    // Циклы. Задача 9 Зарплата и проценты в целых рублях, как в лекции. Проценты на остаток по счету без копеек
        System.out.println("\nЦиклы. Задача 9");
        int myDeposit = 0;
        int incomeSalary = 29000;
        for (int i=1; i < 13; i++) {
            myDeposit = myDeposit + myDeposit / 100 + incomeSalary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + myDeposit + " рублей");
        }

    // Циклы. Задача 10
        System.out.println("\nЦиклы. Задача 10 Таблица умножения");
        for (int i=1; i < 11; i++) {
            System.out.println("2*" + i + "=" +  (2 * i) );
        }


    }
}