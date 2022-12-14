public class Main {
    public static void main(String[] args) {

        //      task1();
        //      task2();
        //      task3();
        //      task4();
        //      task5();
        //       task6();
        //       task7();
        task8();
    }

    //С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при
// условии, что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
    public static void task1() {
        System.out.println("задача 1");
        int salary = 15_000;
        int total = 0;
        int expected = 2_459_000;
        int mounthNumber = 0;
        while (total < 2_459_000) {
            total += 15_000;
            total = total + salary;
            mounthNumber++;
            System.out.println("Месяц " + mounthNumber + " сумма накоплений равна " + total + " рублей");
            if (total >= expected) {
                break;
            }
        }
    }

    //Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
//На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
    public static void task2() {
        System.out.println("задача 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i);
        }
        {
            System.out.println();
        }
        for (int ii = 10; ii >= 1; ii = ii - 1) {
            System.out.print(ii);
        }

        System.out.println();
    }


    //В стране Y население равно 12 миллионов человек.
//Рождаемость составляет 17 человек на 1000, смертность — 8 человек.
// Рассчитайте, какая численность населения будет через 10 лет,
// если показатели рождаемости и смертности постоянны.
    public static void task3() {
        System.out.println("задача 3");
        int population = 12_000_000;
        int mortality = (12_000_000 / 1_000) * 8;
        int fertiliti = (12_000_000 / 1_000) * 17;
        int year = 0;
        while (year < 10) {
            year++;
            population = population + fertiliti - mortality;

            System.out.println("Год " + year + " численность населения составляет " + population);
        }
    }

    //Василий решил положить деньги на накопительный счет,
    // где каждый месяц к сумме его вклада добавляется еще 7%.
    // Первоначальная сумма вклада — 15 тысяч рублей.
    //Вычислите и выведите в консоль, сколько месяцев
    // Василию нужно будет копить, чтобы собрать сумму в 12 миллионов рублей при условии,
    // что процент банка от накоплений не меняется, а всегда равен 7%.
    public static void task4() {
        System.out.println("задача 4");
        int sum = 15_000;
        int monthNum = 1;
        while (sum < 12_000_000) {
            sum *= 1.07;
            monthNum++;
            System.out.println(monthNum + " месяц сумма накоплений " + sum + " рублей");
        }
    }

    //Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд,
// а только каждый шестой. Должны быть видны накопления за 6, 12, 18, 24-й и следующие месяцы.
    public static void task5() {
        int sum = 15_000;
        int monthNum = 1;
        while (sum < 12_000_000) {
            sum *= 1.07;
            if (monthNum % 6 == 0) {
                System.out.println(monthNum + " месяц сумма накоплений " + sum + " рублей");
            }
            monthNum++;
        }
    }

    //Василий решил, что будет копить деньги ближайшие 9 лет.
// Он хочет знать, какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
//Исходная сумма всё та же — 15 тысяч рублей, проценты банка – 7% ежемесячно.
//Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.
    public static void task6() {
        System.out.println("задача 6");
        int sum = 15_000;
        for (int i = 1; i < 9 * 12; i += 6) {
            int sumBefore = sum;
            sum *= 1 + 0.07 * 6;
            {
                System.out.println(" месяц сумма накоплений " + sum + " рублей");
            }
        }
//В компании пятница — отчетный день.
//Нужно написать программу, которая считает дни месяца по датам, определяет,
// какой день пятница, и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.
//Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
    }


    public static void task7() {
        System.out.println("задача 7");
        int firstDay = 6;
        for (int currentDay = firstDay; currentDay <= 31; currentDay += 7) {
            System.out.println("Сегодня пятница, " + currentDay + " -е число." + " Необходимо подготовить отчет»");
        }
    }

    public static void task8() {
        System.out.println("задача 8");
        int currentYear=2022;
        int beginning=currentYear-200;
        int ending=currentYear+100;
        for (int i=beginning;i<ending;++i){
            System.out.println(i);
        }

    }
}