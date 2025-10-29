package BookProject;

public class Course {
    String courseName;
    String enrollStudent;
    boolean isEnrolled;
    static int maxCaocity=100;
    int enrollments;
    String [] enrolledStudents=new String[maxCaocity];
   static void setCapacity(int capacity){
       Course.maxCaocity=capacity;
   }

    void enrollStudent(String studentName){

        enrolledStudents[enrollments]=studentName;
        System.out.println(studentName +  " you are enroled");
        enrollments++;

    }
    void unEnrollStudent(String studentName){
       int index=-1;
       for(int i=0;i<enrollments;i++){
           if(enrolledStudents[i].equals(studentName)){
               index=i;
               break;
           }
       }
       if(index==-1){
           System.out.println("not present in our db");
           return;
       }
       for(int i=index;i<enrollments-1;i++){
           enrolledStudents[i]=enrolledStudents[i+1];


       }
       enrolledStudents[enrollments-1]=null;
       enrollments--;
        System.out.println(studentName+ "you are unenrolled ");



    }

}
