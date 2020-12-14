package Test;

import JUnitTp.Bibliotheque;
import JUnitTp.Book;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestBibliotheque extends TestCase {
Bibliotheque bib;

    public TestBibliotheque() {

    }
    @Before
    public void setUp(){
        System.out.println("bgeins");
        bib=new Bibliotheque(10);
    }

    @After
    public void tearDown() {
        bib=null;
    }

    @Test
    public void testAddBook() {
        bib.addBook(new Book(1,"ff","fqsf"));
        assertFalse("Full List", bib.listLength<bib.bookList.size());
    }

    @Test
    public void testGetLivre(){
        Book book=bib.getBook(3);
        System.out.println(book);

        assertNotNull("livre null", book);
        /*
        if(book!=null) true TUC
        else if(book==null) false TIC
         */


    }
}
