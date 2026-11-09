package com.kuliah.pattern.adapter;

// Kelas dari vendor luar (SDK GoPay) yang method-nya tidak kompatibel
public class VendorGoPayService {
    private String merchantId;

    public VendorGoPayService(String merchantId) {
        this.merchantId = merchantId;
    }

    // Method asli milik vendor (beda nama method & beda parameter)
    public void kirimSaldo(long jumlahInRupiah, String idTransaksi) {
        System.out.println("[Vendor GoPay] Memproses pembayaran e-Wallet...");
        System.out.println("  - Merchant ID : " + merchantId);
        System.out.println("  - ID Transaksi: " + idTransaksi);
        System.out.println("  - Total Bayar : Rp" + String.format("%,d", jumlahInRupiah));
        System.out.println("[Vendor GoPay] Status: PEMBAYARAN BERHASIL!");
    }
}