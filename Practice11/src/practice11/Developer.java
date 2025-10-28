package practice11;
import java.util.Date;

public class Developer {
    private String surname;
    private Date receivedDate;
    private Date submittedDate;

    public Developer(String surname, Date receivedDate){
        this.surname = surname;
        this.receivedDate = receivedDate;
        this.submittedDate = new Date();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public Date getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(Date submittedDate) {
        this.submittedDate = submittedDate;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "surname='" + surname + '\'' +
                ", receivedDate=" + receivedDate +
                ", submittedDate=" + submittedDate +
                '}';
    }

}
