<?php
	if($_SERVER['REQUEST_METHOD']=='POST'){
		$name = $_POST['id'];
		$jabatan = $_POST['nama'];
		$pass = $_POST['password'];
		$sql = "INSERT INTO tb_pengguna (id,nama,password) VALUES ('$id','$nama','$password')";
		
		//Import File Koneksi database
		require_once('koneksi.php');
		
		//Eksekusi Query database
		if(mysqli_query($con,$sql)){
			echo 'Berhasil Menambahkan Pegawai';
		}else{
			echo 'Gagal Menambahkan Pegawai';
		}
		
		mysqli_close($con);
	}
?>