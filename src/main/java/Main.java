/**
 * 학생 관리 시스템
 * 변수: 학생의 이름, 나이, 점수 등을 저장
 * 연산자: 점수 합계 및 평균 계산에 사용
 * 조건문: 특정 조건(예: 평균 점수)에 따라 메시지를 출력
 * 반복문: 학생 리스트를 순회하며 정보를 출력
 * 배열: 학생 점수 저장
 * 컬렉션: 학생 객체를 저장하기 위해 ArrayList 사용
 * 클래스: 학생과 관리자 클래스를 정의
 * 상속: Person 클래스에서 Student 클래스가 상속
 * 인터페이스: 관리자 기능을 정의하는 Manageable 인터페이스를 사용
 */
public class Main {

    /**
     *  각 학생의 정보와 점수, 성적에 따른 메시지 출력
     * @param args
     */
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // 학생 추가
        Student student1 = new Student("Alice", 20, new int[]{85, 90, 95});
        Student student2 = new Student("Bob", 22, new int[]{70, 60, 80});
        Student student3 = new Student("Charlie", 21, new int[]{50, 55, 58});

        manager.addStudent(student1);
        manager.addStudent(student2);
        manager.addStudent(student3);

        // 학생 정보 출력
        manager.displayAllStudents();
    }
}
