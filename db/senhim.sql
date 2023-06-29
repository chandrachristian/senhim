-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 17 Jan 2023 pada 05.44
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pemrograman2`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tblogin`
--

CREATE TABLE `tblogin` (
  `username` varchar(20) NOT NULL,
  `password` varchar(15) NOT NULL,
  `nama` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tblogin`
--

INSERT INTO `tblogin` (`username`, `password`, `nama`) VALUES
('admin01', 'admin01', 'Ade Dwi Putra'),
('admin02', 'admin02', 'Mas Juned'),
('admin03', 'admin03', 'Aa Hasan');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbmasuk`
--

CREATE TABLE `tbmasuk` (
  `NIP` varchar(20) NOT NULL,
  `Nama` varchar(30) NOT NULL,
  `Posisi` varchar(20) NOT NULL,
  `Mapel` varchar(20) NOT NULL,
  `Absen` varchar(10) DEFAULT NULL,
  `Tanggal_Absen` date NOT NULL,
  `Jam` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbmasuk`
--

INSERT INTO `tbmasuk` (`NIP`, `Nama`, `Posisi`, `Mapel`, `Absen`, `Tanggal_Absen`, `Jam`) VALUES
('001', 'Ade Dwi Putra', 'Guru', 'Matematika', 'Masuk', '2022-11-15', '00:12:12'),
('001', 'Ade Dwi Putra', 'Guru', 'Matematika', 'Pulang', '2022-11-15', '00:12:21'),
('002', 'Junaedi Ahmad Basori', 'Guru', 'Bahasa Inggris', 'Masuk', '2022-11-15', '00:19:52'),
('002', 'Junaedi Ahmad Basori', 'Guru', 'Bahasa Inggris', 'Pulang', '2022-11-15', '00:20:45'),
('003', 'Dyta Puji Lestari', 'Guru', 'Bahasa Indonesia', 'Pulang', '2022-11-15', '00:20:51'),
('003', 'Dyta Puji Lestari', 'Guru', 'Bahasa Indonesia', 'Masuk', '2022-11-15', '00:20:56'),
('004', 'Hasan Maulana', 'Guru', 'Agama', 'Masuk', '2022-11-15', '13:12:19'),
('004', 'Hasan Maulana', 'Guru', 'Agama', 'Pulang', '2022-11-15', '13:12:30'),
('002', 'Junaedi Ahmad Basori', 'Guru', 'Bahasa Inggris', 'Masuk', '2022-11-16', '00:39:20'),
('002', 'Junaedi Ahmad Basori', 'Guru', 'Bahasa Inggris', 'Pulang', '2022-11-16', '00:46:50'),
('001', 'Ade Dwi Putra', 'Guru', 'Matematika', 'Masuk', '2022-12-06', '20:25:23'),
('001', 'Ade Dwi Putra', 'Guru', 'Matematika', 'Pulang', '2022-12-06', '20:25:39'),
('002', 'Junaedi Ahmad Basori', 'Guru', 'Bahasa Inggris', 'Masuk', '2022-12-06', '20:25:50'),
('002', 'Junaedi Ahmad Basori', 'Guru', 'Bahasa Inggris', 'Pulang', '2022-12-06', '20:25:58'),
('003', 'Dyta Puji Lestari', 'Guru', 'Bahasa Indonesia', 'Masuk', '2022-12-06', '20:26:08'),
('003', 'Dyta Puji Lestari', 'Guru', 'Bahasa Indonesia', 'Pulang', '2022-12-06', '20:26:41'),
('004', 'Hasan Maulana', 'Guru', 'Agama', 'Masuk', '2022-12-06', '20:26:47'),
('004', 'Hasan Maulana', 'Guru', 'Agama', 'Pulang', '2022-12-06', '20:26:51'),
('001', 'Ade Dwi Putra', 'Guru', 'Matematika', 'Masuk', '2022-12-07', '16:12:05'),
('001', 'Ade Dwi Putra', 'Guru', 'Matematika', 'Pulang', '2022-12-07', '16:12:10'),
('002', 'Junaedi Ahmad Basori', 'Guru', 'Bahasa Inggris', 'Pulang', '2022-12-07', '16:12:15'),
('002', 'Junaedi Ahmad Basori', 'Guru', 'Bahasa Inggris', 'Masuk', '2022-12-07', '16:12:20'),
('003', 'Dyta Puji Lestari', 'Guru', 'Bahasa Indonesia', 'Masuk', '2022-12-07', '16:12:24'),
('003', 'Dyta Puji Lestari', 'Guru', 'Bahasa Indonesia', 'Pulang', '2022-12-07', '16:12:30'),
('004', 'Hasan Maulana', 'Guru', 'Agama', 'Pulang', '2022-12-07', '16:12:37'),
('004', 'Hasan Maulana', 'Guru', 'Agama', 'Masuk', '2022-12-07', '16:12:44');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbpersonal`
--

CREATE TABLE `tbpersonal` (
  `NIP` varchar(20) NOT NULL,
  `Nama` varchar(30) NOT NULL,
  `Posisi` varchar(20) NOT NULL,
  `Mapel` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbpersonal`
--

INSERT INTO `tbpersonal` (`NIP`, `Nama`, `Posisi`, `Mapel`) VALUES
('001', 'Ade Dwi Putra', 'Guru', 'Matematika'),
('002', 'Junaedi Ahmad Basori', 'Guru', 'Bahasa Inggris'),
('003', 'Dyta Puji Lestari', 'Guru', 'Bahasa Indonesia'),
('004', 'Hasan Maulana', 'Guru', 'Agama');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tblogin`
--
ALTER TABLE `tblogin`
  ADD PRIMARY KEY (`username`);

--
-- Indeks untuk tabel `tbpersonal`
--
ALTER TABLE `tbpersonal`
  ADD PRIMARY KEY (`NIP`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
