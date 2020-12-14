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
        bib=new Bibliotheque(2);
    }

    @After
    public void tearDown() {
        bib=null;
    }

    @Test
    public void testAddBook() {
        bib.addBook(new Book());
        assertFalse("Full List", bib.listLength<bib.bookList.size());
    }
}
