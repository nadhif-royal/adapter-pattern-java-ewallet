# Campus Canteen Payment System (Adapter Pattern)

## Deskripsi Proyek
Proyek ini adalah implementasi **Adapter Design Pattern** menggunakan bahasa pemrograman Java. Studi kasus yang digunakan adalah sebuah sistem kasir kantin kampus yang pada awalnya hanya menerima pembayaran tunai, kemudian dikembangkan agar dapat menerima pembayaran dari berbagai vendor dompet digital (e-wallet) pihak ketiga seperti GoPay, DANA, dan OVO.

Tantangan utama dari integrasi ini adalah setiap vendor memiliki nama metode dan tipe data parameter yang berbeda beda. Adapter Pattern digunakan sebagai jembatan pembungkus agar sistem kasir tetap bisa memanggil satu metode standar tanpa harus merombak struktur kode dari vendor luar.

## Struktur Kode

### Target Interface
*   **`Pembayaran`**: Antarmuka standar yang dikenali oleh sistem kasir kampus, mewajibkan implementasi metode `prosesBayar(double nominal)`.
*   **`PembayaranTunai`**: Implementasi langsung dari antarmuka pembayaran untuk transaksi uang fisik.

### Adaptee (Sistem Pihak Ketiga)
Kelas kelas ini mensimulasikan SDK dari vendor luar yang memiliki metode spesifik dan tidak kompatibel secara langsung dengan antarmuka target.
*   **`VendorGoPayService`**: Menggunakan metode `kirimSaldo(long, String)`.
*   **`VendorDanaService`**: Menggunakan metode `bayarDana(int)`.
*   **`VendorOVOService`**: Menggunakan metode `charge(long, String)`.

### Adapter
Kelas kelas konverter yang mengimplementasikan antarmuka `Pembayaran` dan meneruskan instruksi ke spesifikasi masing masing vendor.
*   **`GoPayAdapter`**
*   **`DanaAdapter`**
*   **`OVOAdapter`**

### Client
*   **`MainKantin`**: Kelas utama untuk menjalankan simulasi transaksi dan mencetak hasil integrasi ke konsol.

## Cara Menjalankan
1. Pastikan Anda memiliki Java Development Kit (JDK) yang sudah terinstal.
2. Clone repository ini ke mesin lokal Anda.
3. Buka proyek menggunakan IDE seperti IntelliJ IDEA.
4. Jalankan file `MainKantin.java` untuk melihat output simulasi transaksi dari berbagai metode pembayaran.
