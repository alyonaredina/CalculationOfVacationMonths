package ru.netology.services;

public class CalcVService {
    public int calcVacation(int income, int expense, int threshold) {
        int count = 0; //счётчик месяцев отдыха
        int money = 0; //количество денег на счету

        for (int month = 1; month <= 12; month++) {
            if (money < threshold) { //можем ли отдыхать
                System.out.println("Месяц " + month + ". Денег " + money + " Придется работать. Заработал +" + income + ". Потратил -" + expense);
                money = money + income - expense;

            } else {
                int moneyVacation = (money - expense) - ((money - expense) / 3);
                int moneyBalance = (money - expense);
                System.out.println("Месяц " + month + ". Денег" + money + " Буду отдыхать. Потратил -" + expense + ". Затем ещё -" + moneyVacation);
                money = (money - expense) / 3;
                count++;
            }
        }
        return count;

    }
}
