package Saroj;

import java.util.Date;

public class Rent {
    private static Date Startdate;
    private static Date endingdate;

    public Rent(Date Startdate, Date endingdate){
        this.Startdate = Startdate;
        this.endingdate = endingdate;
    }

    public Rent() {

    }

    public void setStartdate(Date startdate) {
        Startdate = startdate;
    }

    public static Date getStartdate() {
        return Startdate;
    }

    public void setEndingdate(Date endingdate) {
        this.endingdate = endingdate;
    }

    public static Date getEndingdate() {
        return endingdate;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "Startdate=" + Startdate +
                ", endingdate=" + endingdate +
                '}';
    }
}
