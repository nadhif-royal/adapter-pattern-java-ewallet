package com.kuliah.pattern.adapter;

// Kelas simulasi SDK pihak ketiga OVO (Adaptee)
public class VendorOVOService {
    private String merchantCode;

    public VendorOVOService(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    // Method asli vendor OVO: nama dan parameter berbeda
    public void charge(long amount, String referenceId) {
        System.out.println("[Vendor OVO] Memproses pembayaran e-Wallet...");
        System.out.println("  - Merchant Code: " + merchantCode);
        System.out.println("  - Reference ID : " + referenceId);
        System.out.println("  - Total Bayar  : Rp" + String.format("%,d", amount));
        System.out.println("[Vendor OVO] Status: PEMBAYARAN BERHASIL!");
    }
}