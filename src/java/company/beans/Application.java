package company.beans;
//To be included in the company only
public class Application {
	    
	    @Override
	public String toString() {
		return "Application [ID=" + ID + ", studentMail=" + studentMail + ", internshipID=" + internshipID + ", status="
				+ status + "]";
	}
		public enum ApplicationStatus{
	        NEW,
	        REJECTED,
	        SUMMONED,
	        ACCEPTED;
	    }
	    
	    private Long ID;
	    private String studentMail;
	    private int internshipID;
	    private ApplicationStatus status;
	    
		public Long getID() {
			return ID;
		}
		public void setID(Long iD) {
			ID = iD;
		}
		public String getStudentMail() {
			return studentMail;
		}
		public void setStudentMail(String studentMail) {
			this.studentMail = studentMail;
		}
		public int getInternshipID() {
			return internshipID;
		}
		public void setInternshipID(int internshipID) {
			this.internshipID = internshipID;
		}
		public ApplicationStatus getStatus() {
			return status;
		}
		public void setStatusNEW(ApplicationStatus status) {
			this.status = ApplicationStatus.NEW;
		}
		public void setStatusREJECTED(ApplicationStatus status) {
			this.status = ApplicationStatus.REJECTED;
		}
		public void setStatusSUMMONED(ApplicationStatus status) {
			this.status = ApplicationStatus.SUMMONED;
		}
		public void setStatusACCEPTED(ApplicationStatus status) {
			this.status = ApplicationStatus.ACCEPTED;
		}
		public void setStatus(ApplicationStatus status){
			this.status=status;
		}
	    
	   
}
