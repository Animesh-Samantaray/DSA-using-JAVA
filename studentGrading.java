class student{
    String studentName;
    int rollNumber;
    double marks;
    char grade ;
     void calculateGrade(double d){
         if(d>=90)
         grade = 'A';

        else if(d>=75 && d<90)
         grade = 'B';

         else if(d>= 50 && d<75)
         grade = 'C';

         else 
         grade = 'D';
     }
      void displayStudentInfo(){
        System.out.println("Name : "+this.studentName);
        System.out.println(" roll - "+this.rollNumber);
        System.out.println(" Marks : "+this.marks);
        System.out.println("grade - "+this.grade);
     }
}
public class studentGrading {
    
    public static void main(String[] args) {
        student s = new student();
        s.studentName="Animesh Samantaray";
        s.rollNumber = 1;
        s.marks = 500;
        s.calculateGrade((s.marks/600)*100);
        s.displayStudentInfo();
    }
}
