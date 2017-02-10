package com.company;

/**
 * Created by Anna on 09.02.2017.
 */
public class Smart_watch extends Electronics {


    protected String compatibleOS;
    protected double weight;
    static protected int goodsQuantity = 0;
    static protected double summaryCost = 0;

    public Smart_watch() {
    }

    public Smart_watch(String name, double cost, String manufacturer, String compatibleOS, double weight) {
        super(name, cost, manufacturer);
        this.compatibleOS = compatibleOS;
        this.weight = weight;
        goodsQuantity++;
        summaryCost += cost;
    }

    public String getCompatibleOS() {
        return compatibleOS;
    }

    public void setCompatibleOS(String compatibleOS) {
        this.compatibleOS = compatibleOS;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    static public void avgCost(){
        System.out.println("Средняя стоимость умных часов составляет " + summaryCost/goodsQuantity + " грн.");
    }

    @Override
    public String toString() {
        return "Умные часы: название модели -- " + name + ", цена -- " + cost +
                " грн., производитель -- " + manufacturer + ", совместимы с ОС -- " + compatibleOS +
                ", вес -- " + weight + " гр.";
    }
}
