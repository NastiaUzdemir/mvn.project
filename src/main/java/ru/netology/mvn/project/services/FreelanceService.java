package ru.netology.mvn.project.services;

public class FreelanceService {

    public int calculateRestMonths(int income, int expenses, int threshold) {
        int totalRestMonths = 0;
        int currentBalance = 0;

        for (int month = 1; month <= 12; month++) {
            if (currentBalance >= threshold) {
                // Если на счету достаточно денег, выбираем отдых
                currentBalance -= expenses; // Расходы на отдых
                currentBalance = currentBalance / 3; // Траты на отдых в три раза больше
                totalRestMonths++;
            } else {
                // Иначе работаем
                currentBalance += income;
                currentBalance -= expenses;
            }
        }

        return totalRestMonths;
    }
}
