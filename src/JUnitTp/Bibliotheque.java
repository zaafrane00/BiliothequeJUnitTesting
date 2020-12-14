package JUnitTp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bibliotheque {
    public List<Book> bookList;
    public int listLength;

    public Bibliotheque(int listLength) {
        this.bookList=new ArrayList<Book>();
        this.listLength=listLength;

        //remplissage

        addBook(new Book(1,"t","a"));
        addBook(new Book());
        addBook(new Book(2,"tf","af"));
    }

    public void addBook(Book b){
        this.bookList.add(b);
    }

    public Book getBook(int pos){
        return this.bookList.get(pos);
    }

    public void affiche(){
        System.out.println(Arrays.deepToString(this.bookList.toArray()));
    }

    public static void  main(String ...args){
        Bibliotheque bb=new Bibliotheque(3);
        bb.addBook(new Book(1,"bok","55"));
        bb.affiche();
    }

}
