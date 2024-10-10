package ru.labs;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Command {

    private static int ID = 1;

    private Integer id;
    private String surname;
    private Integer company;
    private String rank;
    private LocalDate birthday;
    private LocalDate startServe;
    private Integer unitNumber;

    private List<Boss> bosses;

    public Command() {
        this.id = ID++;
    }

    public Command(List<Boss> bosses) {
        this.id = ID++;
        this.bosses = bosses;
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
                ", начавший служить " + startServe + ", из части " + unitNumber + " под начальством " +
                bosses.toString() + " прибыл!";
    }

    public List<Boss> getBosses() {
        return bosses;
    }

    public void setBosses(List<Boss> bosses) {
        this.bosses = bosses;
    }

    public Boss getBossByIndex(int index) {
        if (bosses.size() > index) {
            return bosses.get(index);
        } else {
            throw new NullPointerException("У служащего нет такого начальника");
        }
    }

    public void setBoss(Boss boss) {
        bosses.add(boss);
    }

    public String getBossById(int id) {
        for (Boss boss:bosses) {
            if (boss.getId() == id) {
                return boss.toString();
            }
        }
        return "Начальника с таким номером не существует";
    }

    public void deleteBossById(int id) {
        Boss bossToDelete = null;
        for (Boss boss:bosses) {
            if (boss.getId() == id) {
                bossToDelete = boss;
            }
        }
        bosses.remove(bossToDelete);
        System.out.println("Начальника с таким номером не существует");
    }

    public void sortBosses() {
        Collections.sort(bosses, new Comparator<Boss>() {
            @Override
            public int compare(Boss o1, Boss o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
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
