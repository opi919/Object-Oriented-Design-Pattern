package MVCPattern;

public class StudentModel {
    private String rollNo;
    private String name;

    public String getRoll(){
        return rollNo;
    }

    public String getName(){
        return name;
    }

    public void setRoll(String rollNo){
        this.rollNo = rollNo;
    }

    public void setName(String name){
        this.name = name;
    }
}
