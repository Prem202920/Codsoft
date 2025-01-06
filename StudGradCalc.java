import java.util.Scanner;
public class StudentGradeCalc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("STUDENT GRADE CALCULATOR");
        System.out.println("Enter your number of subjects:");
        int s=sc.nextInt();
        int total=0;
        System.out.println("Enter the marks obtained in"+ s + "subjects respectively:");
        for(int i=0;i<s;i++)
        {
            int marks=sc.nextInt();
            total = total + marks;
        }
        double avg=(double)total/s;
        String grade;
        if(avg >=90)
        {
            grade = "A+";
        }
        else if(avg>=80)
        {
            grade = "A";
        }
        else if(avg>=70)
        {
            grade = "B+";
        }
        else if(avg>=60)
        {
            grade = "B";
        }
        else if(avg>=50)
        {
            grade = "C";
        }
        else if(avg>=45)
        {
            grade = "D";
        }
        else if(avg>=40)
        {
            grade = "E";
        }
        else
        {
            grade = "F";
        }
        System.out.println("Total Marks:"+ total);
        System.out.println("Average Percentage:"+avg+"%");
        System.out.println("Obtained Grade is:"+grade);
    }   
}
