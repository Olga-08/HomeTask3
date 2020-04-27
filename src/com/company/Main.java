package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Book book = new Book();
//        System.out.println("Название " + book.name);
//        System.out.println("Кооичество страниц " + book.amountOfPages);
//        System.out.println("Размер шрифта " + book.fontSize);
//        System.out.println("Цвет обложки " + book.coverColor);
//        System.out.println("Тип обложки " + book.coverType);
//        System.out.println("Тип шрифта " + book.fontType);
//        System.out.println("Формат " + book.format);
//        System.out.println("Вес " + book.weight + "\n");

        Book book = new Book("The Da Vinchi code", 308, 12, "red",
                "hard cover", "Arial", "A5", 234.5);
        System.out.println("Название " + book.name);
        System.out.println("Количество страниц " + book.amountOfPages);
        System.out.println("Размер шрифта " + book.fontSize);
        System.out.println("Цвет обложки " + book.coverColor);
        System.out.println("Тип обложки " + book.coverType);
        System.out.println("Тип шрифта " + book.fontType);
        System.out.println("Формат " + book.format);
        System.out.println("Вес " + book.weight + "\n");

        Book book1 = new Book("Pride and Prejudice", 350, 4, "green",
                "hard cover", "Arial", "A4", 237.8);
        System.out.println("Название " + book1.name);
        System.out.println("Количество страниц " + book1.amountOfPages);
        System.out.println("Размер шрифта " + book1.fontSize);
        System.out.println("Цвет обложки " + book1.coverColor);
        System.out.println("Тип обложки " + book1.coverType);
        System.out.println("Тип шрифта " + book1.fontType);
        System.out.println("Формат " + book1.format);
        System.out.println("Вес " + book1.weight + "\n");

        book.setPrice(17.8);
        book.setRead(true);
        book.setPlaceShelf('B');
        book.setPublishingHouse("Питер");
        book.setOnShelf(true);
        book.setAuthor("Dan Brown");

        System.out.println(book.toString() + "\n");

        System.out.println("Название " + book.name);
        System.out.println("Автор " + book.getAuthor() + "\n");
        System.out.println("Издательство " + book.getPublishingHouse());
        System.out.println("Цена" + book.getPrice());
        System.out.println("Количество страниц " + book.amountOfPages);
        System.out.println("Цвет обложки " + book.coverColor);
        System.out.println("Тип обложки " + book.coverType);
        System.out.println("Тип шрифта " + book.fontType);
        System.out.println("Размер шрифта " + book.fontSize);
        System.out.println("Формат " + book.format);
        System.out.println("Вес " + book.weight);
        System.out.println("Прочтена " + book.getRead());
        System.out.println("Позиция на полке " + book.getPlaceShelf());
        System.out.println("На полке " + book.getOnShelf() + "\n");

        book1.setPrice(18.0);
        book1.setRead(false);
        book1.setPlaceShelf('D');
        book1.setPublishingHouse("АСТ");
        book1.setOnShelf(false);
        book1.setAuthor("Jane Austen");

        System.out.println(book1.toString() + "\n");

        System.out.println("Название " + book1.name);
        System.out.println("Автор " + book1.getAuthor() + "\n");
        System.out.println("Издательство " + book1.getPublishingHouse());
        System.out.println("Цена " + book1.getPrice());
        System.out.println("Количество страниц " + book1.amountOfPages);
        System.out.println("Цвет обложки " + book1.coverColor);
        System.out.println("Тип обложки " + book1.coverType);
        System.out.println("Тип шрифта " + book1.fontType);
        System.out.println("Размер шрифта " + book1.fontSize);
        System.out.println("Формат " + book1.format);
        System.out.println("Вес " + book1.weight);
        System.out.println("Прочтена " + book1.getRead());
        System.out.println("Позиция на полке " + book1.getPlaceShelf());
        System.out.println("На полке " + book1.getOnShelf() + "\n");

        Book book2 = new Book("The Adventures of Sherlock Holmes", 410, 7,
                "grey", "soft cover", "Times new roman", "A5", 213.4);

        book2.setPrice(20.2);
        book2.setPublishingHouse("Махаон");
        book2.setPlaceShelf('S');
        book2.setRead(false);
        book2.setAuthor("Sir Arthur Conan Doyle");
        book2.setOnShelf(false);

        System.out.println(book2.toString() + "\n");

        System.out.println("Название " + book2.name);
        System.out.println("Автор " + book2.getAuthor() + "\n");
        System.out.println("Издательство " + book2.getPublishingHouse());
        System.out.println("Цена " + book2.getPrice());
        System.out.println("Количество страниц " + book2.amountOfPages);
        System.out.println("Цвет обложки " + book2.coverColor);
        System.out.println("Тип обложки " + book2.coverType);
        System.out.println("Тип шрифта " + book2.fontType);
        System.out.println("Размер шрифта " + book2.fontSize);
        System.out.println("Формат " + book2.format);
        System.out.println("Вес " + book2.weight);
        System.out.println("Прочтена " + book2.getRead());
        System.out.println("Позиция на полке " + book2.getPlaceShelf());
        System.out.println("На полке " + book2.getOnShelf() + "\n");

        Book book3 = new Book("Fairy tales", 287, 9, "multi-colored",
                "hard cover", "Arial", "A4", 240);

        book3.setPrice(27.8);
        book3.setPublishingHouse("Махаон");
        book3.setPlaceShelf('G');
        book3.setRead(false);
        book3.setOnShelf(false);
        book3.setAuthor("Grimm brothers");

        System.out.println(book3.toString() + "\n");

        System.out.println("Название " + book3.name);
        System.out.println("Автор " + book3.getAuthor() + "\n");
        System.out.println("Издательство " + book3.getPublishingHouse());
        System.out.println("Цена " + book2.getPrice());
        System.out.println("Количество страниц " + book3.amountOfPages);
        System.out.println("Цвет обложки " + book3.coverColor);
        System.out.println("Тип обложки " + book3.coverType);
        System.out.println("Тип шрифта " + book3.fontType);
        System.out.println("Размер шрифта " + book3.fontSize);
        System.out.println("Формат " + book3.format);
        System.out.println("Вес " + book3.weight);
        System.out.println("Прочтена " + book3.getRead());
        System.out.println("Позиция на полке " + book3.getPlaceShelf());
        System.out.println("На полке " + book3.getOnShelf() + "\n");

        Book book4 = new Book("Lolita", 489, 6, "white", "soft cover",
                "Times new roman", "A5", 310);

        book4.setPrice(18.95);
        book4.setPublishingHouse("КАРО");
        book4.setPlaceShelf('E');
        book4.setRead(false);
        book4.setOnShelf(true);
        book4.setAuthor("Vladimir Nabokov");

        System.out.println(book2.toString() + "\n");

        System.out.println("Название " + book4.name);
        System.out.println("Автор " + book4.getAuthor() + "\n");
        System.out.println("Издательство " + book4.getPublishingHouse());
        System.out.println("Цена " + book4.getPrice());
        System.out.println("Количество страниц " + book4.amountOfPages);
        System.out.println("Цвет обложки " + book4.coverColor);
        System.out.println("Тип обложки " + book4.coverType);
        System.out.println("Тип шрифта " + book4.fontType);
        System.out.println("Размер шрифта " + book4.fontSize);
        System.out.println("Формат " + book4.format);
        System.out.println("Вес " + book4.weight);
        System.out.println("Прочтена " + book4.getRead());
        System.out.println("Позиция на полке " + book4.getPlaceShelf());
        System.out.println("На полке " + book4.getOnShelf() + "\n");

        book.readSpeed(308);
        book1.readSpeed(350);
        book2.readSpeed(410);
        book3.readSpeed(287);
        book4.readSpeed(489);

        book.bookSize(308);
        book1.bookSize(350);
        book2.bookSize(410);
        book3.bookSize(287);
        book4.bookSize(489);
        book3.bookSize(-10);

        book.shelfLoad(234.5F);
        book1.shelfLoad(237.8F);
        book2.shelfLoad(213.4F);
        book3.shelfLoad(240.0F);
        book4.shelfLoad(310.0F);

        book.newPrice(17.8);
        book1.newPrice(18.0);
        book2.newPrice(20.2);
        book3.newPrice(27.8);
        book4.newPrice(18.95);

        book.setPageTurning(15, 60, 308);
        System.out.println(book.isOpen() ? "Книга открыта на " + book.getCurrentPage() + " странице" : "Книга закрыта");
        book1.setPageTurning(0, 0, 350);
        System.out.println(book1.isOpen() ? "Книга открыта на " + book1.getCurrentPage() + " странице" : "Книга закрыта");
        book2.setPageTurning(400, -316, 410);
        System.out.println(book2.isOpen() ? "Книга открыта на " + book2.getCurrentPage() + " странице" : "Книга закрыта");
        book3.setPageTurning(0, 5, 287);
        System.out.println(book3.isOpen() ? "Книга открыта на " + book3.getCurrentPage() + " странице" : "Книга закрыта");
        book4.setPageTurning(489, -489, 489);
        System.out.println(book4.isOpen() ? "Книга открыта на " + book4.getCurrentPage() + " странице" : "Книга закрыта");

        book.bookAuthor("Dan Brown");
        book.bookAuthor("Aleksandr Pushkin");
        book1.bookAuthor("Jane Austen");
        book2.bookAuthor("Sir Arthur Conan Doyle");
        book3.bookAuthor("Grimm brothers");
        book4.bookAuthor("Vladimir Nabokov");

        book.bookInProcess("The Da Vinchi code");
        book1.bookInProcess("Pride and Prejudice");
        book2.bookInProcess("The Adventures of Sherlock Holmes");
        book3.bookInProcess("Fairy tales");
        book4.bookInProcess("Lolita");

        book.bookInProcess2("The Da Vinchi code");
        book1.bookInProcess2("Pride and Prejudice");
        book2.bookInProcess2("The Adventures of Sherlock Holmes");
        book3.bookInProcess2("Fairy tales");
        book4.bookInProcess2("Lolita");

        book.printTurning(58);
        book.printTurning2(-1);

        System.out.println(Arrays.toString(Book.items));


    }
}
