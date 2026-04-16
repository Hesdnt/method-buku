public class buku {
    String judul;
    String penulis;
    int tahunTerbit;

    public buku() {
        this.judul = "Tidak Diketahui";
        this.penulis = "Tidak Diketahui";
        this.tahunTerbit = 0;
    }

    public buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }
    
    public void tampilkaninformasi() {
        System.out.println("Judul Buku : " + this.judul);
        System.out.println("Penulis : " + this.penulis);
        System.out.println("Tahun Terbit : " + this.tahunTerbit);
    }
}

