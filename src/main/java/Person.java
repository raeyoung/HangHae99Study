// 모든 사람의 기본 정보를 저장
public class Person {
    protected String name;
    protected int age;

    // 생성자 초기화
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 이름과 나이 출력
     */
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
