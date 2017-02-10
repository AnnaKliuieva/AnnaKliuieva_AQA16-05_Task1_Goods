package com.company;

/**
 * Created by Anna on 09.02.2017.
 */
public class Electronic_book extends Electronics {

    protected double displayDiagonal;
    protected int memorySize;
    static protected int goodsQuantity = 0;
    static protected double summaryCost = 0;

    public Electronic_book() {
    }

    public Electronic_book(String name, double cost, String manufacturer, double displayDiagonal, int memorySize) {
        super(name, cost, manufacturer);
        this.displayDiagonal = displayDiagonal;
        this.memorySize = memorySize;
        goodsQuantity++;
        summaryCost += cost;
    }

    public double getDisplayDiagonal() {
        return displayDiagonal;
    }

    public void setDisplayDiagonal(double displayDiagonal) {
        this.displayDiagonal = displayDiagonal;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    static public void avgCost(){
        System.out.println("Средняя стоимость электронных книг составляет " + summaryCost/goodsQuantity + " грн.");
    }

    @Override
    public String toString() {
        return "Электронная книга: название модели -- " + name + ", цена -- " + cost +
                ", производитель -- " + manufacturer + ", диагональ экрана -- " + displayDiagonal +
                " дюймов, объем памяти -- " + memorySize + " Гбайт.";
    }
}
