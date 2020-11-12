package Saroj;

import java.util.Date;

public class Rent {
    Date Startdate;
    Date endingdate;

    public Rent(Date Startdate, Date endingdate){
        this.Startdate = Startdate;
        this.endingdate = endingdate;
    }

    public Date getEndingdate() {
        return endingdate;
    }

    public void setEndingdate(Date endingdate) {
        this.endingdate = endingdate;
    }

    public Date getStartdate() {
        return Startdate;
    }

    public void setStartdate(Date startdate) {
        Startdate = startdate;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "Startdate=" + Startdate +
                ", endingdate=" + endingdate +
                '}';
    }
}
