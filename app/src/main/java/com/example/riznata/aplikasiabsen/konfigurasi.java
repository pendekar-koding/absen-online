package com.example.riznata.aplikasiabsen;

public class konfigurasi {
    public static final String URL_ADD="http://192.168.43.236/Android/pegawai/tambahPgw.php";
    public static final String URL_GET_ALL = "http://192.168.43.236/Android/pegawai/tampilSemuaPgw.php";
    public static final String URL_GET_EMP = "http://192.168.43.236/Android/pegawai/tampilPgw.php?id=";
    public static final String URL_UPDATE_EMP = "http://192.168.43.236/Android/pegawai/updatePgw.php";
    public static final String URL_DELETE_EMP = "http://192.168.43.236/Android/pegawai/hapusPgw.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "name";
    public static final String KEY_EMP_JABATAN = "jabatan";
    public static final String KEY_EMP_PASSWORD = "pass";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "name";
    public static final String TAG_JABATAN  = "jabatan";
    public static final String TAG_PASSWORD = "pass";

    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}
