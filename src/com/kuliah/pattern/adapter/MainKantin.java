package com.kuliah.pattern.adapter;

public class MainKantin {
    public static void main(String[] args) {

        System.out.println("=== SIMULASI KASIR KANTIN KAMPUS ===\n");

        // Skenario 1: Mahasiswa membayar menggunakan Tunai
        Pembayaran kasirTunai = new PembayaranTunai();
        kasirTunai.prosesBayar(15000);

        System.out.println("\n------------------------------------\n");

        // Skenario 2: Mahasiswa membayar menggunakan GoPay
        VendorGoPayService sdkGoPay =
                new VendorGoPayService("MCH-KAMPUS-UNIV");

        Pembayaran kasirGoPay = new GoPayAdapter(sdkGoPay);
        kasirGoPay.prosesBayar(25000);

        System.out.println("\n------------------------------------\n");

        // Skenario 3: Mahasiswa membayar menggunakan DANA
        VendorDanaService sdkDana =
                new VendorDanaService("081298765432");

        Pembayaran kasirDana = new DanaAdapter(sdkDana);
        kasirDana.prosesBayar(30000);

        System.out.println("\n------------------------------------\n");

        // Skenario 4: Mahasiswa membayar menggunakan OVO
        VendorOVOService sdkOvo =
                new VendorOVOService("MCH-KANTIN-OVO");

        Pembayaran kasirOvo = new OVOAdapter(sdkOvo);
        kasirOvo.prosesBayar(35000);
    }
}