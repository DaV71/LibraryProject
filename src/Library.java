import org.w3c.dom.stylesheets.LinkStyle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class Library {
    public static List<Book> bookList = new ArrayList<>();
    public static void main(String[] args) {
        File file = new File("ListOfBooks.txt");
        RandomAccessFile raf = null;
        try {
            raf= new RandomAccessFile(file,"rwd");

        } catch (FileNotFoundException e){
            System.out.println("Nie ma takiego pliku");
            return;
        }

        String line = "";

        try {
            while ((line = raf.readLine())!=null){
                String arr[]=line.split(";");
                /*for (int i=0;i<arr.length;i++){
                    System.out.println(i+" "+arr[i]);
                }*/

               bookList.add(new Book(arr[1],arr[2],arr[3],Integer.parseInt(arr[4]),arr[5],arr[6],Integer.parseInt(arr[7])));
            }

        } catch (IOException e){
            System.out.println("Bład I/O");
            return;
        }

        bookList.add( new Book());
        bookList.add( new Book("Pan Tadeusz","Adam","Mickiewicz",2016,"lektura"));


    Show ();




        try {
            for (int i=0;i<bookList.size();i++) {
                raf.writeBytes(bookList.get(i).toStringF()+"\n");

            }raf.close();
        } catch (IOException e){
            System.out.println("Bład I/O");
            return;
        }
    }

    public static void Show(){
        System.out.println("Id\tTitle\tName\tSurname\tYear\tCategory");
        for (int i=0;i<bookList.size();i++){
            System.out.println(bookList.get(i));

        }

    }





}


