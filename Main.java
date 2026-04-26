public class Main {
    public static void main(String[] args) {

        Kue[] daftarKue = new Kue[20];

        daftarKue[0] = new KuePesanan("Brownies", 25000, 1.5);
        daftarKue[1] = new KueJadi("Donat", 3000, 10);
        daftarKue[2] = new KuePesanan("Lapis Legit", 50000, 2);
        daftarKue[3] = new KueJadi("Kue Cubit", 2000, 15);
        daftarKue[4] = new KuePesanan("Cheesecake", 60000, 1);
        daftarKue[5] = new KueJadi("Klepon", 2500, 20);
        daftarKue[6] = new KuePesanan("Black Forest", 55000, 1.2);
        daftarKue[7] = new KueJadi("Onde-onde", 3000, 12);
        daftarKue[8] = new KuePesanan("Red Velvet", 65000, 1.3);
        daftarKue[9] = new KueJadi("Risoles", 4000, 10);
        daftarKue[10] = new KuePesanan("Tiramisu", 70000, 1);
        daftarKue[11] = new KueJadi("Pastel", 3500, 14);
        daftarKue[12] = new KuePesanan("Pandan Cake", 30000, 1.8);
        daftarKue[13] = new KueJadi("Lemper", 5000, 8);
        daftarKue[14] = new KuePesanan("Strawberry Cake", 60000, 1.1);
        daftarKue[15] = new KueJadi("Bolu Kukus", 2500, 16);
        daftarKue[16] = new KuePesanan("Chocolate Cake", 55000, 1.4);
        daftarKue[17] = new KueJadi("Serabi", 3000, 11);
        daftarKue[18] = new KuePesanan("Matcha Cake", 65000, 1.2);
        daftarKue[19] = new KueJadi("Putu Ayu", 2000, 18);

        double totalSemua = 0;

        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;

        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;

        Kue kueTermahal = daftarKue[0];

        System.out.println("\n-------------------------------------");
        System.out.println("Afimarsiemo Abdhira Mahdi");
        System.out.println("255150707111002");
        System.out.println("Teknologi Informasi - A");
        System.out.println("-------------------------------------\n");

        System.out.println("KUE PESANAN");
        for (Kue kue : daftarKue) {
            if (kue instanceof KuePesanan) {
                System.out.println(kue);

                double hargaAkhir = kue.hitungHarga();
                totalSemua += hargaAkhir;
                totalHargaPesanan += hargaAkhir;
                totalBeratPesanan += ((KuePesanan) kue).berat;

                if (hargaAkhir > kueTermahal.hitungHarga()) {
                    kueTermahal = kue;
                }
            }
        }

        System.out.println("\nKUE JADI");
        for (Kue kue : daftarKue) {
            if (kue instanceof KueJadi) {
                System.out.println(kue);

                double hargaAkhir = kue.hitungHarga();
                totalSemua += hargaAkhir;
                totalHargaJadi += hargaAkhir;
                totalJumlahJadi += ((KueJadi) kue).jumlah;

                if (hargaAkhir > kueTermahal.hitungHarga()) {
                    kueTermahal = kue;
                }
            }
        }

        System.out.println("\nTotal semua harga: " + totalSemua);

        System.out.println("\nKuePesanan");
        System.out.println("Total harga: " + totalHargaPesanan);
        System.out.println("Total berat: " + totalBeratPesanan);

        System.out.println("\nKueJadi");
        System.out.println("Total harga: " + totalHargaJadi);
        System.out.println("Total jumlah: " + totalJumlahJadi);

        System.out.println("\nKue dengan harga terbesar:");
        System.out.println(kueTermahal);
    }
}