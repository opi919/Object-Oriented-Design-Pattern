package MVCPattern;

public class StudentController {
    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view){
        this.model=model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public void setStudentRollNo(String roll){
        model.setRoll(roll);
    }

    public String getStudentName(){
        return model.getName();
    }

    public String getStudentRollNo(){
        return model.getRoll();
    }

    public void view(){
        view.printStudentDetails(model.getName(), model.getRoll());
    }
}
