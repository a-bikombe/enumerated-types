package EnumeratedTypes;

public class EnumeratedTypes {

    public static void main(String[] args) {    // create a main method which creates three Books and assigns three different conditions to them
        
        Book paperback = new Book();
        Book hardcover = new Book ();
        Book ebook = new Book();
        
        paperback.condition = Book.Condition.FAIR;
        hardcover.condition = Book.Condition.VERY_GOOD;
        ebook.condition = Book.Condition.EXCELLENT;
    }
    
}

class Book {    // create a class named Book
    
    enum Condition {    // within the class, create an enumerated type of Condition
        EXCELLENT, VERY_GOOD, GOOD, FAIR, POOR    // define five conditions, excellent, very good, good, fair, poor (constants)
    }
    
    Condition condition;
    
}