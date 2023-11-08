package Problem;

import java.util.ArrayList;

public class Person {

    ArrayList<Problem> problems = new ArrayList<>();
    public void addProblem(Problem problem) {
        problems.add(problem);
    }
    public void solveProblem(Problem problem){
        problems.remove(problem);
    }
    public ArrayList<Problem> getUnsolvedProblems(){
        return problems;
    }
}
