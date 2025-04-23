import java.util.Date;

public class BookingDate {
    private Date checkIn;
    private Date checkOut;
    private boolean statusAktif;

    public BookingDate(Date checkIn, Date checkOut, boolean statusAktif) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.statusAktif = statusAktif;
    }

    public Date getCheckIn() { return checkIn; }
    public Date getCheckOut() { return checkOut; }
    public boolean isStatusAktif() { return statusAktif; }
}
