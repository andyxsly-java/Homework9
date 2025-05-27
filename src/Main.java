public class Main {
    public static void main(String[] args) {
    //Задача 1
    int[] monthlyExpenses = {11000, 15000, 12000, 5000, 14000};
    int total = 0;
    for (int i = 0; i < monthlyExpenses.length; i++) {
        total += monthlyExpenses[i];
    }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
    //Задача 2
        int [] mondayExpenses = {10000, 12000, 11000, 17000, 13000};
        int max = mondayExpenses[0];
        int min = mondayExpenses[0];
        for (int i = 1; i < mondayExpenses.length; i++) {
            if (mondayExpenses[i] > max) {
                max = mondayExpenses[i];
            }
            if (mondayExpenses[i] < min) {
                min = mondayExpenses[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей.");
        //Задача 3
        int weeklyExpenses [] = {7000, 15000, 5000, 23000, 31000};
        int totals = 0;
        for (int i = 0; i < weeklyExpenses.length; i++) {
            totals += weeklyExpenses[i];
        }
        double averageValue = (double) totals / weeklyExpenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");
        //Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
            if (i > 0) {
            }
        }
        System.out.println();
    }
}
