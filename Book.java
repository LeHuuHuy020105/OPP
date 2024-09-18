package Book;
public class Book {
    private String ID;
    private String name;
    private double price;
    public Book(String ID, String name, Double price){
        this.ID=ID;
        this.name=name;
        this.price=price;
    }
    //GET
    public String getID(){
        return ID;
    }
    public String getname(){
        return name;
    }
    public double getprice(){
        return price;
    }
    //SET
    public void setID(String ID){
        this.ID=ID;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setprice(double price){
        this.price=price;
    }
    public void showinfo(){
        System.out.println("________BOOK INFO_________");
        System.out.println("ID Sach: "+ ID);
        System.out.println("Ten Sach: "+ name);
        System.out.println("Gia Sach: "+ price);
    }
}
