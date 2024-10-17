package ru.labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Group {
    private static int ID = 1;

    private Integer id;
    private List<Command> group;

    public Group() {
        this.id = ID++;
        group = new ArrayList<>();
    }

    public Group(List<Command> group) {
        this.id = ID++;
        this.group = group;
    }

    public List<Command> getGroup() {
        return group;
    }

    public void setGroup(List<Command> group) {
        this.group = group;
    }

    public void setCommandInGroup(Command command) {
        group.add(command);
    }

    public Command getCommand(Command command) {
        for (Command commander:group) {
            if (commander == command ) {
                return commander;
            }
        }
        throw new NullPointerException("Такого служащего не существует");
    }

    public void deleteCommandById(int id) {
        Command commandToDelete = null;
        for (Command command:group) {
            if (command.getId().equals(id)) {
                commandToDelete = command;
            }
        }
        if (commandToDelete != null) {
            group.remove(commandToDelete);
        } else {
            System.out.println("Cлужащего с таким именем не существует");
        }
    }

    public void sortGroup() {
        Collections.sort(group, new Comparator<Command>() {
            @Override
            public int compare(Command o1, Command o2) {
                return o1.getUnitNumber().compareTo(o2.getUnitNumber());
            }
        });
    }

    @Override
    public String toString() {
        return group.toString();
    }
}
