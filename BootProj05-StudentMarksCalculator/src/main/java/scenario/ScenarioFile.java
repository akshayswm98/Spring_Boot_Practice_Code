package scenario;

public class ScenarioFile {

}
/*
 Scenario 5: Student Marks Calculator (Spring Component Based)
--------------------------------------------------------------------------------

Components
1. MarksService

Methods:

int totalMarks(int s1, int s2, int s3)

double percentage(int total)

(total / 300.0) * 100

String grade(double percentage)

≥90 → A

≥75 → B

≥50 → C

else → FAIL

2. StudentReportService

Has-A: MarksService
Methods:

void printReport(String name, int s1, int s2, int s3)
 */