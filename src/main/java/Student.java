class Student extends Person {
    private int[] scores;

    public Student(String name, int age, int[] scores) {
        super(name, age);
        this.scores = scores;
    }

    /**
     * 점수 배열의 총합 계산
     * @return
     */
    public int calculateTotalScore() {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total;
    }

    /**
     * 평균 점수 계산
     * @return
     */
    public double calculateAverageScore() {
        return calculateTotalScore() / (double) scores.length;
    }

    /**
     * 모든 점수를 출력
     */
    public void displayScores() {
        System.out.print("Scores: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }

    /**
     * 이름, 나이, 점수, 총점, 평균 점수를 출력
     * Person 메서드를 오버라이딩
     */
    @Override
    public void displayInfo() {
        super.displayInfo();
        displayScores();
        System.out.printf("Total: %d, Average: %.2f%n", calculateTotalScore(), calculateAverageScore());
    }
}
