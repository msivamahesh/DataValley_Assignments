import java.util.ArrayList;
import java.util.List;

class StudentProject {
    String name;
    int daysToComplete;

    public StudentProject(String name, int daysToComplete) {
        this.name = name;
        this.daysToComplete = daysToComplete;
    }
}

public class ProjectAnalyzer {
    public static void analyzeProjects(List<StudentProject> projects) {
        int onTimeCount = 0, lateCount = 0, earlyCount = 0;
        double totalDays = 0;

        for (StudentProject project : projects) {
            totalDays += project.daysToComplete;
            if (project.daysToComplete == 0) onTimeCount++;
            else if (project.daysToComplete < 0) earlyCount++;
            else lateCount++;
        }

        double averageDays = totalDays / projects.size();

        System.out.println("On Time: " + onTimeCount);
        System.out.println("Late: " + lateCount);
        System.out.println("Early: " + earlyCount);
        System.out.println("Average Days: " + averageDays);
    }

    public static void main(String[] args) {
        List<StudentProject> projects = new ArrayList<>();
        projects.add(new StudentProject("Project A", 3));
        projects.add(new StudentProject("Project B", 0));
        projects.add(new StudentProject("Project C", -2));

        analyzeProjects(projects);
    }
}
