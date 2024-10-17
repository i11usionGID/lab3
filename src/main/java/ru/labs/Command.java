package ru.labs;

import java.time.LocalDate;

public class Command {

    private static int ID = 1;

    private Integer id;
    private String surname;
    private Integer company;
    private String rank;
    private LocalDate birthday;
    private LocalDate startServe;
    private Integer unitNumber;

    public Command() {
        this.id = ID++;
    }

    public Command(String surname, Integer company, String rank, LocalDate birthday) {
        this.id = ID++;
        this.surname = surname;
        this.company = company;
        this.rank = rank;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Служащий " + surname + " из " + company + " роты в звании " + rank + ", рожденный " + birthday +
                ", начавший служить " + startServe + ", из части " + unitNumber + " прибыл!";
    }

    public Integer getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getCompany() {
        return company;
    }

    public String getRank() {
        return rank;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public LocalDate getStartServe() {
        return startServe;
    }

    public Integer getUnitNumber() {
        return unitNumber;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCompany(Integer company) {
        this.company = company;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setStartServe(LocalDate startServe) {
        this.startServe = startServe;
    }

    public void setUnitNumber(Integer unitNumber) {
        this.unitNumber = unitNumber;
    }
}