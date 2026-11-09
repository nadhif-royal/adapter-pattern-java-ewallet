package com.kuliah.pattern.adapter;

// Implementasi pembayaran tunai
public class PembayaranTunai implements Pembayaran {
    @Override
    public void prosesBayar(double nominalRupiah) {
        System.out.println("[Kasir Kampus] Pembayaran Tunai diterima sebesar Rp"
                + String.format("%,.0f", nominalRupiah));
    }
}