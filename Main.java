package Book;

import java.util.Scanner;

public class Main {
    private static Book bookObj=null;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=0;
        boolean flag=true;
        do{
            showMenu();
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    editBook();
                    break;
                case 3:
                    infoBook();
                    break;
                case 4:
                    flag=false;
                    break;
                default:
                    break;
            }
        }
        while(flag==true);
        sc.close();
    }
    public static void showMenu(){
        System.out.println("=========BOOK MANAGER===========");
        System.out.println("1. Add Book");
        System.out.println("2. Edit Book");
        System.out.println("3. Info Book");
        System.out.println("4.Exit");
        System.out.println("Your Choice [1-4]: ");
    }
    public static void addBook(){

        Scanner sc=new Scanner(System.in);
        String ID="";
        String name="";
        Double price=0.0;

        System.out.println("ID: ");
        ID=sc.nextLine();

        System.out.println("Name: ");
        name=sc.nextLine();

        System.out.println("Price: ");
        price=sc.nextDouble();

        bookObj =new Book(ID, name, price);
        sc.close();
        
    }
    public static void editBook(){
        Scanner sc=new Scanner(System.in);
       if(bookObj==null){
        System.out.println("Book don't exist");
       }
       else{
        String name="";
        Double price=0.0;

        System.out.println("Name: ");
        name=sc.nextLine();

        System.out.println("Price: ");
        price=sc.nextDouble();

        bookObj.setname(name);
        bookObj.setprice(price);
       }
       sc.close();
    }
    public static void infoBook(){
        if(bookObj==null){
            System.out.println("Book don't exist");
        }
        else{
            bookObj.showinfo();
        }
    }
}
