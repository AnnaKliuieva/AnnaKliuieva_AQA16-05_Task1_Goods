package com.company;

/**
 * Created by Anna on 09.02.2017.
 */
abstract public class Electronics implements Comparable<Electronics>{

    protected String name;
    protected double cost;
    protected String manufacturer;

    public Electronics(){}

    public Electronics(String name, double cost, String manufacturer) {
        this.name = name;
        this.cost = cost;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    abstract public String toString();

   @Override
    public int compareTo(Electronics o) {
        if (this.cost < o.getCost())
            return -1;
        else if (this.cost == o.getCost())
            return 0;
        else
            return 1;
    }
}
