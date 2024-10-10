package ru.labs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Boss boss1 = new Boss("Капитанов", "Капитан");
        Boss boss2 = new Boss("Майоров", "Майор");
        Boss boss3 = new Boss("Полковников", "Полковник");
        Boss boss4 = new Boss("Генеральный", "Генерал");
        System.out.println(boss4);
        List bosses = new ArrayList();
        bosses.add(boss4);
        bosses.add(boss1);
        bosses.add(boss3);
        bosses.add(boss2);
        Command command = new Command(bosses);
        command.setSurname("Новиков");
        command.setCompany(9);
        command.setRank("новобранец");
        LocalDate birthday = LocalDate.of(2006, 1, 1);
        LocalDate startServe = LocalDate.of(2024, 3, 1);
        command.setBirthday(birthday);
        command.setStartServe(startServe);
        command.setUnitNumber(1);
        System.out.println(command);
        command.sortBosses();
        System.out.println(command);
        command.deleteBossById(1);
        System.out.println(command);
    }
}