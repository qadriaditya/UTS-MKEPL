public class RoomBookingDetail {
    private String jenisKamar;
    private int jumlahTamu;
    private int jumlahMalam;
    private double hargaPerMalam;
    private String kodeVoucher;
    private boolean sudahDibayar;

    public RoomBookingDetail(String jenisKamar, int jumlahTamu, int jumlahMalam, double hargaPerMalam, String kodeVoucher, boolean sudahDibayar) {
        this.jenisKamar = jenisKamar;
        this.jumlahTamu = jumlahTamu;
        this.jumlahMalam = jumlahMalam;
        this.hargaPerMalam = hargaPerMalam;
        this.kodeVoucher = kodeVoucher;
        this.sudahDibayar = sudahDibayar;
    }

    public String getJenisKamar() { return jenisKamar; }
    public int getJumlahTamu() { return jumlahTamu; }
    public int getJumlahMalam() { return jumlahMalam; }
    public double getHargaPerMalam() { return hargaPerMalam; }
    public String getKodeVoucher() { return kodeVoucher; }
    public boolean isSudahDibayar() { return sudahDibayar; }
}