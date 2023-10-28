package MVCPattern;

public class MVCPatternDemo {
    public static void main(String[] args) {
        StudentModel model = retrieveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model,view);

        controller.view();

        controller.setStudentName("Khandoker");

        controller.view();
    }

    private static StudentModel retrieveStudentFromDatabase(){
        StudentModel model = new StudentModel();
        model.setName("Momen");
        model.setRoll("1910776142");
        return model;
    }
}
