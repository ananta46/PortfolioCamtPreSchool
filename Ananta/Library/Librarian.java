package Library;
public class Librarian {
    public static void main(String[] args) {
        Student student = new Student();
        LibraryCard card1 = new LibraryCard();

        student.setName("Edward Evergarden");
        student.setEmail("ee@gmail.com");

        card1.setOwner(student);
        card1.checkOut(3);
        card1.checkOut(3);
        
        System.out.println("Card info: "+card1.toString()+"\n");
    }
}
