package Task_2;

import java.util.Scanner;

class Grade{
    public void studentGrade() {
    	 Scanner sc = new Scanner(System.in);
    	 
	        
	        System.out.println("Enter the number of subjects");
	        int tsubs = sc.nextInt();
	        if(tsubs>10 || tsubs<=0) {
            	while(true) {
            	System.out.println("your entered subject is out of range or invalid number");
            	System.out.println("Please enter number of subjects");
            	tsubs=sc.nextInt();
            	if(tsubs<10) break;
            	}
	        }
	        int tmarks = 0;

	        
	        for (int i = 0; i < tsubs; i++) {
	            System.out.println("Enter the marks obtained in subject " + (i + 1));
	            int marks = sc.nextInt();
	            if(marks>=101 || marks<=0) {
	            	while(true) {
	            	System.out.println("you entered subject" +(i+1)+ " marks is out of range or invalid number");
	            	System.out.println("Please Enter the marks obtained in subject " + (i + 1));
	            	marks=sc.nextInt();
	            	if(marks<101) break;
	            	}
	            }
	            tmarks += marks;
	        }
	        int avgp = tmarks / tsubs;

	        String Grade = grade(avgp);

	        System.out.println("Total marks :" +tsubs*100);
	        System.out.println("Total marks obtained : " + tmarks);
	        System.out.println("Percentage obtained : " + avgp+"%");
	        System.out.println("Grade obtained : " + Grade);

	        sc.close();   
    }
    
    public String grade(int avgp){
        switch (avgp / 10) {
            case 10:
                return "A+";
            case 9:
                return "A";
            case 8:
                return "B+";
            case 7:
                return "B";
            case 6:
                return "C";
            case 5:
                return "D";
            default:
                return "F";
        }
    }
}

public class StudentGradeCalculator {

	public static void main(String[] args) {
		 Grade g = new Grade();
	     g.studentGrade();
	}
}
