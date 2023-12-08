package oop.inheritance.lesson9.task2;

public class Country {
    private long countPeople;
    private String language;
    private String continent;

    public Country(long countPeople, String language, String continent) {
        this.countPeople = countPeople;
        this.language = language;
        this.continent = continent;
    }

    public long getCountPeople() {
        return countPeople;
    }

    public String getLanguage() {
        return language;
    }

    public String getContinent() {
        return continent;
    }
}
