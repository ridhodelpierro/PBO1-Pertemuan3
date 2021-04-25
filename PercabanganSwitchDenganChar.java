public class PercabanganSwitchDenganChar {
    public static void main(String[] args) {
        char nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Mahasiswa:\"Terimakasih Pak\"");
                System.out.println("Dosen    :\"Selamat Ya :)\"");
                break;
            case 'B':
                System.out.println("Mahasiswa:\"Alhamdulillah dapat A pak?\"");
                System.out.println("Dosen    :\"Iya Alhamdulillah\"");
                break;
            case 'C':
                System.out.println("Mahasiswa:\"Ulun Turun lawan Tugas Full tarus pak\"");
                System.out.println("Dosen    :\"Tapi nilai tugas bagus lah\"");
                System.out.println("Mahasiswa:\"HEHEHEHE\"");
                break;
            default:
                System.out.println("Mahasiswa:\"Pak ulun Turun lawan Tugas Full tarus\"");
                System.out.println("Dosen    :\"Hadang lah bapak periksa\"");
                System.out.println("Mahasiswa:\"Inggih pak\"");
                System.out.println("Dosen    :\"Oh iya nih bapak perbaiki jadi B\"");
                System.out.println("Mahasiswa:\"Alhamdulillah makasih pak\"");
                break;
        }
    }
}
