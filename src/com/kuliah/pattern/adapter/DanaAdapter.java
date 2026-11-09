package com.kuliah.pattern.adapter;

// Adapter yang membuat SDK DANA dapat digunakan melalui interface Pembayaran
public class DanaAdapter implements Pembayaran {
    private VendorDanaService danaService;

    public DanaAdapter(VendorDanaService danaService) {
        this.danaService = danaService;
    }

    @Override
    public void prosesBayar(double nominalRupiah) {
        // Konversi tipe data dari double ke int sesuai kebutuhan VendorDanaService
        int nominalInt = (int) Math.round(nominalRupiah);

        // Adapter menerjemahkan pemanggilan standar ke method milik DANA
        danaService.bayarDana(nominalInt);
    }
}