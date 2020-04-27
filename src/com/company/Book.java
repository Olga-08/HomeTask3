package com.company;

public class Book {
    public String name = "The Da Vinchi code";
    public static int amountOfPages;
    public int fontSize = 7;
    public String coverColor;
    public String coverType;
    public String fontType;
    public String format;
    public double weight;
    public float days;
    //стартовая страница
    public int startPage;
    //количество страниц, на которое пролистали книгу
    public int countPage;
    public double load;
    public double newPrice;
    //процент увеличения цены
    public double x;
    private boolean read;
    private double price;
    private char placeShelf;
    private String publishingHouse;
    private boolean onShelf = true;
    //текущая страница
    private static int currentPage;
    private String author;
    public static int items[];

    public Book() {
        amountOfPages = 308;
        coverColor = "red";
        weight = 234.5F;
    }

    public Book(String name, int amountOfPages, int fontSize, String coverColor, String coverType,
                String fontType, String format, double weight) {
        this.name = name;
        this.amountOfPages = amountOfPages + 36;
        this.fontSize = fontSize + 9;
        this.coverColor = coverColor;
        this.coverType = coverType;
        this.fontType = fontType;
        this.format = format;
        this.weight = weight * 1.1D;
        SomeClass(amountOfPages);
    }

    public boolean getRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public char getPlaceShelf() {
        return placeShelf;
    }

    public void setPlaceShelf(char placeShelf) {
        this.placeShelf = placeShelf;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public boolean getOnShelf() {
        return onShelf;
    }

    public void setOnShelf(boolean onShelf) {
        this.onShelf = onShelf;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", amountOfPages=" + amountOfPages +
                ", fontSize=" + fontSize +
                ", coverColor='" + coverColor + '\'' +
                ", coverType='" + coverType + '\'' +
                ", fontType='" + fontType + '\'' +
                ", format='" + format + '\'' +
                ", read=" + read +
                ", price=" + price +
                ", placeShelf=" + placeShelf +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", weight=" + weight +
                ", onShelf=" + onShelf +
                ", days=" + days +
                ", startPage=" + startPage +
                ", currentPage=" + currentPage +
                ", countPage=" + countPage +
                ", load=" + load +
                ", newPrice=" + newPrice +
                ", x=" + x +
                ", author='" + author + '\'' +
                '}';
    }

    public void readSpeed(int amountOfPages) {
        days = (float) amountOfPages / 12;
        //рассчитываем, за сколько дней прочитаем книгу при условии, что в день прочитываем по 12 страниц
        System.out.println("Книга будет прочитана за " + days + " дней");
    }

    public void shelfLoad(double weight) {
        load = weight * 15 / 1000;
        //рассчитываем нагрузкку на книжную полку при условии, что на одной полке стоит 15 книг одного типа
        System.out.println("Нагрузка на полку составит " + load + " кг");
    }

    public void newPrice(double price) {
        x = 3;
        newPrice = price + price * x / 100;
        //рассчитываем новую цену книги после увеличения начальной цены на x%
        System.out.println("Новая цена " + newPrice + "руб.");
    }

    public void setPageTurning(int startPage, int countPage, int amountOfPages) {
        currentPage = startPage + countPage < 0 ? 0 :
                (startPage + countPage) > amountOfPages ? amountOfPages : (startPage + countPage);
    }

    public static int getCurrentPage() {
        return currentPage;
    }

    public boolean isOpen() {
        return currentPage > 0;
    }

    public void bookAuthor(String author) {
        this.author = author;
        switch (author) {
            case "Dan Brown":
                System.out.println("Книга The Da Vinchi code " + author);
                break;
            case "Jane Austen":
                System.out.println("Книга Pride and Prejudice " + author);
                break;
            case "Sir Arthur Conan Doyle":
                System.out.println("Книга The Adventures of Sherlock Holmes " + author);
                break;
            case "Grimm brothers":
                System.out.println("Книга Fairy tales " + author);
                break;
            case "Vladimir Nabokov":
                System.out.println("Книга Lolita " + author);
            default:
                System.out.println("This book is not available");
        }
    }

    public void bookSize(int amountOfPages) {
        this.amountOfPages = amountOfPages;
        if (amountOfPages > 5 && amountOfPages <= 150) {
            System.out.println("Эта книга тонкая");
        } else if (amountOfPages > 150 && amountOfPages <= 350) {
            System.out.println("Эта книга средней толщины");
        } else if (amountOfPages > 350 && amountOfPages <= 750) {
            System.out.println("Это толстая книга");
        } else if (amountOfPages > 750) {
            System.out.println("Это фолиант");
        } else {
            System.out.println("Такой книги не существует");
        }
    }

    public void bookInProcess(String name) {
        this.name = name;
        if (onShelf) {
            System.out.println("Книга на полке");
        } else {
            System.out.println("Книгу читают");
        }
    }

    public void bookInProcess2(String name) {
        this.name = name;
        System.out.println(onShelf ? "Книга на полке" : "Книгу читают");
    }

    public int bookTurning(int targetPage) {
        int i = -1;
        int page = currentPage;

        if (targetPage == currentPage) {
            return 0;
        }
        while (page != targetPage && targetPage >= 0 && targetPage <= amountOfPages) {
            page = (int) (Math.random() * (amountOfPages + 1));
            i++;
        }
        return i == -1 ? i : i + 1;
    }

    public void printTurning(int targetPage) {
        int n = bookTurning(targetPage);
        switch (n) {
            case -1:
                System.out.println("Страница с номером " + targetPage + " не существует");
                break;
            case 0:
                System.out.println("Заданная страница открыта");
                break;
            default:
                System.out.println("Открыли нужную страницу с " + n + " попытки");
                break;
        }
    }

    public int bookTurning2(int targetPage) {
        int i = -1;
        int page;

        if (currentPage == targetPage) {
            i = -2;

        } else if (targetPage >= 0 && targetPage <= amountOfPages) {

            do {
                page = (int) (Math.random() * (amountOfPages + 1));
                i++;

            } while (page != targetPage);
        }
        return i > -1 ? i + 1 : (i == -1 ? i : 0);
    }

    public void printTurning2(int targetPage) {
        int k = bookTurning2(targetPage);
        switch (k) {
            case 0:
                System.out.println("Открыта заданная страница");
                break;
            case 1:
                System.out.println("Заданная страница открыта с " + k + " попытки");
                break;
            case -1:
                System.out.println("Такой страницы не существует");
        }
    }

    public void SomeClass(int amountOfPages) {

        if (items != null) {
            int[] temp;
            temp = items;
            items = new int[temp.length + 1];
            for (int i = 0; i < items.length; i++) {
                if (i == temp.length) {
                    items[i] = amountOfPages;
                } else {
                    items[i] = temp[i];
                }

            }
        } else {
            items = new int[]{amountOfPages};
        }

    }
}












