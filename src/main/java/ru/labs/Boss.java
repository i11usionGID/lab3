package ru.labs;

import java.time.LocalDate;

public class Boss {
    private static int ID = 1;

    private Integer id;
    private String surname;
    private String rank;

    public Boss(String surname, String rank) {
        this.id = ID++;
        this.surname = surname;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Начальник " + surname + " в звании " + rank + " под номером " + id;
    }

    public Integer getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getRank() {
        return rank;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
