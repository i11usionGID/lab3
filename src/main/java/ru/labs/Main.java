package ru.labs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Command command1 = new Command("Ротов", 3, "Новобранец",LocalDate.of(2006, 1, 20));
        Command command2 = new Command("Новобранченко", 2, "Новобранец",LocalDate.of(2006, 2, 19));
        Command command3 = new Command("Новиков", 1, "Новобранец",LocalDate.of(2006, 3, 14));
        Command command4 = new Command("Сортиров", 9, "Новобранец",LocalDate.of(2006, 1, 3));
        command1.setUnitNumber(4);
        command1.setStartServe(LocalDate.of(2024, 3, 12));
        command2.setUnitNumber(3);
        command2.setStartServe(LocalDate.of(2024, 4, 13));
        command3.setUnitNumber(2);
        command3.setStartServe(LocalDate.of(2024, 5, 14));
        command4.setUnitNumber(1);
        command4.setStartServe(LocalDate.of(2024, 2, 15));
        System.out.println(command4);
        ArrayList<Command> command = new ArrayList<>();
        command.add(command1);
        command.add(command1);
        command.add(command1);
        command.add(command1);
        Group group = new Group(command);
        group.getGroup();
        group.getCommand(command1);
        group.sortGroup();
        System.out.println(group);
        group.deleteCommandById(1);
        System.out.println(group);
    }
}