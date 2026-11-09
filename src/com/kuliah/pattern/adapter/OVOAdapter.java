package com.kuliah.pattern.adapter;

// Adapter yang membuat SDK OVO dapat digunakan melalui interface Pembayaran
public class OVOAdapter implements Pembayaran {
    private VendorOVOService ovoService;

    public OVOAdapter(VendorOVOService ovoService) {
        this.ovoService = ovoService;
    }

    @Override
    public void prosesBayar(double nominalRupiah) {
        long amount = Math.round(nominalRupiah);
        String referenceId = "TRX-OVO-" + System.currentTimeMillis();

        // Adapter menerjemahkan pemanggilan standar ke method milik OVO
        ovoService.charge(amount, referenceId);
    }
}