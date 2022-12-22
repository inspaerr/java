package lab41;

public class Tester7 {
    public static void main(String[] args) {
        Learner[] learners = new Learner[7];
        for (int i = 0; i < 4; i++){
            learners[i] = new Student();
        }
        for (int j = 0; j < 7; j++){
            learners[j] = new Schoolchild();
        }
    }
}
