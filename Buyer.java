import structure5.*;
public class Buyer{
    
    protected String a = "";
    protected Courses b;
    protected Book[] c;
    protected int aSection;
    protected Listing alist;
    protected ListingDatabase listStored;

    public Buyer(String courseName, int section, Courses dataBase, ListingDatabase someData){
    a = courseName;
    b = dataBase;
    aSection = section;
    listStored = someData;
}
    public Book[] getBooks(String courseName){
	//get all the books associated with the Course.
	c = b.getBook(courseName, aSection);
       return c;
    }

    //Pre: Pass in a book from the Vector of Books
    //Post: get back all the listings associated with the book.
    	public Vector<Listing> showListings(Book aBook) {
       	    for(int i = 0; i<listStored.size; ++i){
		if(aBook.equals(listStored.getKey())){
		   Vector<Listing> a = listStored.getValue(i);
		   break;
		}
	    }
	    return a;
	}
    //PRE: Listings are numbered 1- n
    //POST: Return a Seller (SellerProgram) associated with this list object.  
    public Seller getSeller(int i){
	int location = i-1; 
	Seller seller = a.get(location).getSeller();
	return seller; 
	
    }
}