package company.beans;

import org.joda.time.DateTime;

public class Internship {
	private long ID;
	private String shortDescription;
	private String completeDescription;
	private String responsibleMail;
	private DateTime startDate;
	private DateTime endDate;
	
	public long getID() {
		return ID;
	}
	public void setID(long ID) {
		this.ID = ID;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getCompleteDescription() {
		return completeDescription;
	}
	public void setCompleteDescription(String completeDescription) {
		this.completeDescription = completeDescription;
	}
	public String getResponsibleMail() {
		return responsibleMail;
	}
	public void setResponsibleMail(String responsibleMail) {
		this.responsibleMail = responsibleMail;
	}
	public DateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}
	public DateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Internship [ID=" + ID + ", shortDescription=" + shortDescription + ", completeDescription="
				+ completeDescription + ", responsibleMail=" + responsibleMail + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}
	

}
