import java.util.Date;

public class HotelRoomBooking {
    private Customer customer;
    private RoomBookingDetail bookingDetail;
    private BookingDate bookingDate;

    public HotelRoomBooking(Customer customer, RoomBookingDetail bookingDetail, BookingDate bookingDate) {
        this.customer = customer;
        this.bookingDetail = bookingDetail;
        this.bookingDate = bookingDate;
    }

    public double hitungTotalBiaya() {
        double total = bookingDetail.getHargaPerMalam() * bookingDetail.getJumlahMalam();
        if (bookingDetail.getJumlahTamu() > 2) {
            total += (bookingDetail.getJumlahTamu() - 2) * 100000;
        }
        if (bookingDetail.getKodeVoucher() != null && bookingDetail.getKodeVoucher().length() > 3) {
            total -= 50000;
        }
        if (!bookingDate.isStatusAktif()) {
            total = 0;
        }
        return total;
    }

    public String klasifikasiTamu() {
        int jumlahTamu = bookingDetail.getJumlahTamu();
        if (jumlahTamu == 1) return "Individu";
        else if (jumlahTamu == 2) return "Pasangan";
        else return "Keluarga";
    }

    @Override
    public String toString() {
        return """
            ===== DETAIL PEMESANAN KAMAR =====
            Nama Pemesan : %s
            Jenis Kelamin: %s
            No. KTP      : %s
            Telepon      : %s
            Email        : %s
            Jenis Kamar  : %s
            Jumlah Tamu  : %d
            Jumlah Malam : %d
            Harga/Malam  : %.2f
            Check-in     : %s
            Check-out    : %s
            Status Aktif : %b
            Voucher      : %s
            Sudah Dibayar: %b
            Total Biaya  : Rp %.2f
            Tipe Tamu    : %s
            ===================================
        """.formatted(
            customer.getNama(),
            customer.getJenisKelamin(),
            customer.getNomorKTP(),
            customer.getNomorTelepon(),
            customer.getEmail(),
            bookingDetail.getJenisKamar(),
            bookingDetail.getJumlahTamu(),
            bookingDetail.getJumlahMalam(),
            bookingDetail.getHargaPerMalam(),
            bookingDate.getCheckIn(),
            bookingDate.getCheckOut(),
            bookingDate.isStatusAktif(),
            bookingDetail.getKodeVoucher(),
            bookingDetail.isSudahDibayar(),
            hitungTotalBiaya(),
            klasifikasiTamu()
        );
    }
}
  