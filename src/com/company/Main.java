package com.company;

/**
 * Created by Anna on 09.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        Smart_watch watch1 = new Smart_watch("Huawei Watch Black leather", 8600, "Huawei","Android 4.3, iOS 8", 134);
        Smart_watch watch2 = new Smart_watch("Apple Watch Series 2", 12535, "Apple","iOS 8", 52);
        Smart_watch watch3 = new Smart_watch("Samsung Gear S3 Frontier", 9800, "Samsung","Android 5.0", 63);

        Electronic_book eBook1 = new Electronic_book("PocketBook 614 Basic 2", 2500, "PocketBook", 6, 4);
        Electronic_book eBook2 = new Electronic_book("Amazon Kindle 6", 2370, "Amazon Kindle", 6, 4);
        Electronic_book eBook3 = new Electronic_book("AirBook City Base", 2250, "AirBook", 6, 4);

        Smart_watch.avgCost();
        Electronic_book.avgCost();
        System.out.println();

        Container container = new Container();
        container.addGoods(watch1);
        container.addGoods(watch2);
        container.addGoods(watch3);
        container.addGoods(eBook1);
        container.addGoods(eBook2);
        container.addGoods(eBook3);

        System.out.println("В контейнере находятся следующие товары:");
        container.printContentOf();
        System.out.println();

        container.sortByCost();
        System.out.println("Товары в контейнере, отсортированные по цене:");
        container.printContentOf();


    }
}
