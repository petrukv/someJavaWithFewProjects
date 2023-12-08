package oop.enumeration;

public enum Country {
    JAPAN ("Japan", 140_000_000, "Japanese") ,
    GREECE ("Greece", 10_000_000, "Grace"),
    ARGENTINA ("Argentina", 47_000_000, "Spanish");
    private String name;
    private long peopleCount;
    private String languge;

    Country(String name, long peopleCount, String languge) {
        this.name = name;
        this.peopleCount = peopleCount;
        this.languge = languge;
    }

    public String getName() {
        return name;
    }



    public long getPeopleCount() {
        return peopleCount;
    }

    public String getLanguge() {
        return languge;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", peopleCount=" + peopleCount +
                ", languge='" + languge + '\'' +
                '}';
    }
}
