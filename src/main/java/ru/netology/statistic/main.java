package ru.netology.statistic;

public class main {
    public static void main(String[] args) {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println(service.sum(sales));
        System.out.println(service.average(sales));
        System.out.println(service.minSales(sales));
        System.out.println(service.maxSales(sales));
        System.out.println(service.countBelowAvg(sales));
        System.out.println(service.countAboveAvg(sales));
    }
}
