package study.jsprendering;

public class Student {
    private String studentId;
    private String studentName;
    private String studentMobileNum;
     
    public Student() {
          
    }
    public Student(String studentId, String studentName, String studentMobileNum) {
         super();
         this.setStudentId(studentId);
         this.setStudentName(studentName);
         this.setStudentMobileNum(studentMobileNum);
    }
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentMobileNum() {
		return studentMobileNum;
	}
	public void setStudentMobileNum(String studentMobileNum) {
		this.studentMobileNum = studentMobileNum;
	}

    // getters and setters method
    //overriden toString() method
}