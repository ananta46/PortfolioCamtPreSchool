package Library;
public class Student {
    
    private String name;
    private String email;

    public Student(){

        name = "Unassigned";
        email = "Unassigned";
    }


    public String getEmail(){

        return email;
    }

    public String getName(){

        return name;
    }

    public void setEmail(String mail){
        email = mail;
    }

    public void setName(String stuName){
        name = stuName;
    }

}
