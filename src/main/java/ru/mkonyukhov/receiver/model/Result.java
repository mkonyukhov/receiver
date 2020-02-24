package ru.mkonyukhov.receiver.model;

public class Result {
    private String id;
    private String name;
    private int multipliedSum;

    public Result() {
    }

    public Result(String id, String name, int multipliedSum) {
        this.id = id;
        this.name = name;
        this.multipliedSum = multipliedSum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMultipliedSum() {
        return multipliedSum;
    }

    public void setMultipliedSUm(int multipliedSum) {
        this.multipliedSum = multipliedSum;
    }
}
