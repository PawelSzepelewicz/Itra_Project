package com.moshecorp.universityunion.enums;

public enum Categories {

    BUSINESS_AND_FINANCE("Business & finance", "Бизнес и Финансы"),
    COMPUTERS("Computers", "Компьютеры"),
    FOODSTUFFS("Foodstuffs", "Продукты питания"),
    EQUIPMENT("Equipment", "Оборудование"),
    SERVICES("Services", "Услуги"),
    ADVERTISING("Advertising", "Реклама"),
    LEISURE_AND_ENTERTAINMENT("Leisure & Entertainment", "Досуг и Развлечение"),
    MEDIA("Media", "СМИ"),
    REAL_PROPERTY("Real property", "Недвижимость"),
    AUTO_MOTO("Auto & Moto", "Авто и Мото"),
    RESTAURANTS_CAFE_BARS("Restaurants, Cafe & Bars", "Рестораны, Кафе, Бары"),
    BUILDING("Building", "Строительство"),
    INDUSTRY_AND_PRODUCTION("Industry & Production", "Промышленность и Производство"),
    DOMESTIC_SERVICES("Domestic services", "Бытовые услуги");

    private final String rusName;
    private final String engName;

    Categories(String engName, String rusName) {

        this.rusName = rusName;
        this.engName = engName;

    }
}
