package com.company;

public class CycleArray {
    public static int

    public int bookTurning(int targetPage) {

        int i = -1;
        int page = Book.getCurrentPage();

        if (targetPage == Book.getCurrentPage()) {
            return 0;
        }
        while (page != targetPage && targetPage >= 0 && targetPage <= Book.amountOfPages) {
            page = (int) (Math.random() * (Book.amountOfPages + 1));
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

        if (Book.getCurrentPage() == targetPage) {
            i = -2;

        } else if (targetPage >= 0 && targetPage <= Book.amountOfPages) {

            do {
                page = (int) (Math.random() * (Book.amountOfPages + 1));
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
    //создаём массив книг, элементами которого явлются значения количества страниц в книгах
    public void createArray(int amountOfPages){

        int[] booksArray = new int[];
        if(booksArray!=null){
            int[]temp;
            temp=booksArray;
            booksArray=new int[temp.length+1];
            for(int i=0;i<booksArray.length;i++){
                if(i==temp.length){
                    booksArray[i]=amountOfPages;
                }
                else{
                    booksArray[i]=temp[i];
                }

            }
        }
        else{
            booksArray=new int[]{amountOfPages};
        }
        }
    }






