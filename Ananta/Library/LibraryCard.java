package Library;
public class LibraryCard {
    
    private Student owner;
    private int borrowCount;

    public LibraryCard(){

        owner = null;
        borrowCount = 0;
    }

    public void checkOut(int numOfBook){

        borrowCount = borrowCount + numOfBook;
    }

    public int getNumberOfBook(){

        return borrowCount;
    }

    public String getOwner(){

        return owner.getName();
    }

    public void setOwner(Student student){

        owner = student;
    }

    public String toString(){
        return "owner name: "+owner.getName()+"\n"+"     email:"+owner.getEmail()+
        "\n"+"Book borrwed: "+borrowCount;
    }
}
