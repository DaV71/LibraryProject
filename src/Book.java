import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Book {
    private static int nr=0;
    private int id;
    private String title;
    private String surname;
    private String name;
    private int year;
    private  String category;
    private boolean isRent;
    private int numberOfRents;

    private static int Id(){
        return nr++;

    }

    public Book(){
        this.id=Id();
        this.title="Unknown";
        this.surname="Unknown";
        this.name="Unknown";
        this.year=2000;
        this.category="Unknown";
        this.isRent=false;
        this.numberOfRents=0;



    }

    public Book(String title, String name, String surname, int year, String category){
        this.id=Id();
        this.title=title;
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.category=category;
        this.isRent=false;
        this.numberOfRents=0;



    }

    public Book(String title, String name, String surname, int year, String category,String isRent,int numberOfRents){
        this.id=Id();
        this.title=title;
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.category=category;
        this.isRent=isRent.equals("true");
        this.numberOfRents=numberOfRents;



    }

    public String toString (){
        String isRentS;
        if (isRent){
            isRentS="yes";
        } else isRentS="no";
        String s=""+id+"\t"+title+"\t"+name+"\t"+surname+"\t"+year+"\t"+category+"\t"+isRentS+"\t"+numberOfRents;
        return s;

    }

    public String toStringF (){
        String s=""+";"+title+";"+name+";"+surname+";"+year+";"+category+";"+isRent+";"+numberOfRents;
        return s;

    }
}
