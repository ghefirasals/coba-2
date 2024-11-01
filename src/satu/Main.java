package satu;

class MenuKue {
    private String nmakue; //namaKua
    private int pricekue; //hargaKue
    private String deskripsiKue;
    private boolean isAvailable; //ketersediaan
    private int jumlahkue; //stokKue

    public MenuKue(String nmakue, int pricekue, String deskripsiKue, boolean isAvailable, int jumlahkue) {
        this.nmakue = nmakue;
        this.pricekue = pricekue;
        this.deskripsiKue = deskripsiKue;
        this.isAvailable = isAvailable;
        this.jumlahkue = jumlahkue;
    }

    public void tampilkanMenu() {
        System.out.println("Nama Kue: " + nmakue);
        System.out.println("Harga Kue: " + pricekue);
        System.out.println("Deskripsi Kue: " + deskripsiKue);
        System.out.println("Availability: " + (isAvailable ? "Tersedia" : "Tidak Tersedia"));
        System.out.println("Stok Kue: " + jumlahkue);
    }

    public void updateStok(int jumlahStok) {
        jumlahkue += jumlahStok;
    }

    public void setAvailability(boolean availability) {
        isAvailable = availability;
    }

    public static void main(String[] args) {
        MenuKue Kue1 = new MenuKue("Roti", 5000, "Roti yang Lembut", true, 10);
        MenuKue Kue2 = new MenuKue("Wafer", 3000, "Wafer yang Renyah", false, 5);

        Kue1.tampilkanMenu();
        Kue2.tampilkanMenu();

        Kue1.updateStok(5);
        Kue2.setAvailability(true);

        Kue1.tampilkanMenu();
        Kue2.tampilkanMenu();
    }
}