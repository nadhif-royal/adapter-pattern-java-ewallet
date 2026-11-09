package com.kuliah.pattern.adapter;

// Kelas simulasi SDK pihak ketiga DANA (Adaptee)
public class VendorDanaService {
    private String nomorPelanggan;

    public VendorDanaService(String nomorPelanggan) {
        this.nomorPelanggan = nomorPelanggan;
    }

    // Method asli vendor DANA: nama method dan tipe parameter (int) berbeda
    public void bayarDana(int jumlah) {
        System.out.println("[Vendor DANA] Memproses pembayaran e-Wallet...");
        System.out.println("  - Nomor Tujuan: " + nomorPelanggan);
        System.out.println("  - Total Bayar : Rp" + String.format("%,d", jumlah));
        System.out.println("[Vendor DANA] Status: PEMBAYARAN BERHASIL!");
    }
}