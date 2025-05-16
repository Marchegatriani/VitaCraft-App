
# VitaCraft - Pembuat Curriculum Vitae (CV)

**Tingkatkan Karier Anda dengan Pembuatan CV Terstruktur**

VitaCraft adalah aplikasi berbasis Java yang dirancang untuk menyederhanakan pembuatan Curriculum Vitae (CV) menggunakan pendekatan berorientasi objek yang terstruktur. Dengan mengelola informasi CV ke dalam kelas-kelas Java yang berbeda, VitaCraft mendorong fleksibilitas, kemudahan pemeliharaan, dan format keluaran yang konsisten. Aplikasi ini memandu pengguna melalui *command-line interface* (CLI) untuk memasukkan detail profesional mereka dan menghasilkan representasi teks CV yang diformat dengan baik.

## ✨ Fitur Utama

* **Input Data CLI Interaktif:** Antarmuka baris perintah yang mudah digunakan meminta pengguna untuk memasukkan data CV mereka, memastikan pengumpulan informasi yang terstruktur.
* **Model Data Berorientasi Objek:** Entitas CV inti (misalnya, Pendidikan, Pengalaman) direpresentasikan sebagai kelas Java, memungkinkan organisasi dan manipulasi data yang jelas.
* **Bagian CV Modular:** Setiap bagian CV (misalnya, Bagian Pendidikan, Bagian Magang) dikelola oleh kelas khusus, mempromosikan penggunaan ulang kode dan penyesuaian yang mudah.
* **Pemformatan Konsisten:** Metode `formatForDisplay()` di dalam setiap kelas entri CV memastikan keluaran teks yang terstandarisasi dan mudah dibaca.
* **Desain yang Dapat Diperluas:** Arsitektur berorientasi objek memungkinkan penambahan bagian CV baru atau modifikasi bagian yang ada dengan mudah.
* **Keluaran Teks Terstruktur:** Aplikasi menghasilkan keluaran CV berbasis teks yang bersih dan terstruktur, siap untuk diproses lebih lanjut atau dikonversi ke format lain.

## 🗂️ Struktur Proyek

Proyek VitaCraft diorganisasikan ke dalam komponen-komponen berikut:
* Paket `GUI`:
    * `CVGUIEnhanced.java`:Memberikan Tampilan dalam bentuk aplikasi untuk memudahkan pengguna Menginput Data dan Melihat Output CV

* Paket `model`:
    * `Achievement.java`: Merepresentasikan sebuah prestasi dengan judul, deskripsi, dan tahun.
    * `AchievementSection.java`: Mengelola daftar prestasi dan memformatnya untuk CV.
    * `Contact.java`: Menyimpan informasi kontak (email, telepon, alamat).
    * `CVEntry.java`: Kelas dasar abstrak untuk semua entri CV, berisi tanggal mulai dan berakhir.
    * `CVSection.java`: Sebuah *interface* yang mendefinisikan struktur untuk bagian-bagian CV (judul dan konten yang diformat).
    * `Education.java`: Merepresentasikan riwayat pendidikan dengan gelar, institusi, dan tanggal.
    * `EducationSection.java`: Mengelola daftar entri pendidikan dan memformatnya.
    * `Internshipp.java`: Merepresentasikan pengalaman magang dengan perusahaan, posisi, tanggal, dan tanggung jawab.
    * `InternshipSection.java`: Mengelola daftar magang dan memformatnya.
    * `OrganizationExperience.java`: Merepresentasikan pengalaman organisasi dengan peran, organisasi, tanggal, dan deskripsi.
    * `OrganizationSection.java`: Mengelola daftar pengalaman organisasi dan memformatnya.
    * `Profile.java`: Menyimpan informasi profil pribadi (nama, jabatan, ringkasan).
    *`Skills.java`: Merepresentasikan keahlian dengan nama dan tingkat keahlian.
    *`SkillsSection.java`: Mengelola daftar keahlian dan memformatnya.



* `Main.java`: Titik masuk aplikasi; menangani input pengguna dan pembuatan CV.
* `InputHelper.java`: (Kelas utilitas yang diasumsikan) Menyediakan metode untuk input pengguna yang efisien melalui CLI. *Harap sertakan file ini jika tersedia.*

## 🚀 Memulai

Ikuti langkah-langkah berikut untuk membuat CV Anda menggunakan VitaCraft:

1.  **Kompilasi:** Kompilasi file sumber Java menggunakan *compiler* Java:

    ```bash
    javac Main.java model/*.java
    ```

2.  **Eksekusi:** Jalankan kelas `Main` untuk memulai aplikasi:

    ```bash
    java Main
    ```

3.  **Input Data:** Aplikasi akan meminta Anda untuk memasukkan informasi CV Anda langkah demi langkah. Berikan detail untuk setiap bagian sesuai permintaan.

4.  **Keluaran CV:** Setelah Anda memasukkan semua data, VitaCraft akan menampilkan CV Anda dalam format teks terstruktur di konsol.

    ```bash
    John Doe
    john.doe@example.com | 08123456789 | Makassar

    Profil 
    --------------------------------------------------------
    Software Developer with 5 years of experience.

    Pendidikan
    --------------------------------------------------------
    - Universitas A, Teknik Informatika (2015 - 2019)
    IPK: 3.5
    - Universitas B, Manajemen Teknologi (2020 - 2022)
    IPK: 3.8

    Skills
    --------------------------------------------------------
    - Java
    - Python
    - SQL

    Internship
    --------------------------------------------------------
    - Software Engineer di Perusahaan X (2020 - 2021): Mengembangkan aplikasi berbasis web.

    Prestasi
    --------------------------------------------------------
    - Penghargaan Karyawan Terbaik: Diberikan sebagai karyawan terbaik tahun 2021 (2021).

    Pengalaman Organisasi
    --------------------------------------------------------
    - Ketua Himpunan, Himpunan Mahasiswa Teknik ( 2018 - 2019): Mengorganisir kegiatan seminar dan workshop.
    ```
    ## Pembagian Kerja Tim

    Berikut adalah pembagian tugas anggota tim dalam proyek ini:

    * **Gatri**:
        * Main (Bertanggung jawab atas integrasi keseluruhan modul dan alur utama aplikasi)

    * **Fathir**:
        * `Achievement`: Kelas yang merepresentasikan informasi pencapaian.
        * `AchievementSection`: Kelas yang menangani logika dan format untuk bagian pencapaian dalam CV.
        * `Contact`: Kelas yang merepresentasikan informasi kontak.
        * `Profile`: Kelas yang merepresentasikan informasi profil pribadi.

    * **Caca**:
        * `Education`: Kelas yang merepresentasikan informasi pendidikan.
        * `EducationSection`: Kelas yang menangani logika dan format untuk bagian pendidikan dalam CV.
        * `Internship`: Kelas yang merepresentasikan informasi magang.
        * `InternshipSection`: Kelas yang menangani logika dan format untuk bagian magang dalam CV.

    * **Hanifah**:
        * `Organization experience`: Kelas yang merepresentasikan informasi pengalaman organisasi.
        * `OrganizationSection`: Kelas yang menangani logika dan format untuk bagian pengalaman organisasi dalam CV.
        * `Skills`: Kelas yang merepresentasikan informasi keterampilan.
        * `SkillsSection`: Kelas yang menangani logika dan format untuk bagian keterampilan dalam CV.

    * **Ryan**:
        * `CvEntry`: Kelas abstrak atau interface yang mendefinisikan struktur dasar untuk setiap entri dalam CV (misalnya, pendidikan, pengalaman kerja, dll.).
        * `CvSection`: Kelas abstrak atau interface yang mendefinisikan struktur dasar untuk setiap bagian dalam CV (misalnya, bagian pendidikan, bagian pengalaman kerja, dll.).
        * `Input helper`: Kelas-kelas atau fungsi-fungsi pembantu untuk memproses dan memvalidasi input pengguna dari GUI.

    ## Tanggung Jawab Bersama

    Fitur-fitur berikut akan dikerjakan secara kolaboratif oleh seluruh anggota tim:

    * **GUI**: Pengembangan antarmuka pengguna grafis untuk input data dan menampilkan hasil CV.




## 🎉 Selamat Menggunakan!

