import java.util.ArrayList;

class StudentManager implements Manageable {
    private ArrayList<Student> students = new ArrayList<>();

    /**
     * 학생 객체를 리스트에 추가
     * @param student
     */
    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * 모든 학생의 정보를 순회하며 출력
     */
    @Override
    public void displayAllStudents() {
        for (Student student : students) {
            student.displayInfo();
            if (student.calculateAverageScore() >= 90) {
                System.out.println("Excellent student!");
            } else if (student.calculateAverageScore() < 60) {
                System.out.println("Needs improvement.");
            }
            System.out.println("-------------------------");
        }
    }
}