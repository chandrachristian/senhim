-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 29, 2023 at 05:52 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `senhim`
--

-- --------------------------------------------------------

--
-- Table structure for table `tblogin`
--

CREATE TABLE `tblogin` (
  `username` varchar(20) NOT NULL,
  `password` varchar(15) NOT NULL,
  `nama` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tblogin`
--

INSERT INTO `tblogin` (`username`, `password`, `nama`) VALUES
('admin01', 'admin01', 'Chandra Christian'),
('admin02', 'admin02', 'Frisca'),
('admin03', 'admin03', 'Yasmin');

-- --------------------------------------------------------

--
-- Table structure for table `tbmasuk`
--

CREATE TABLE `tbmasuk` (
  `NIP` varchar(20) NOT NULL,
  `Nama` varchar(30) NOT NULL,
  `Posisi` varchar(20) NOT NULL,
  `Mapel` varchar(20) NOT NULL,
  `Absen` varchar(10) DEFAULT NULL,
  `Tanggal_Absen` date NOT NULL,
  `Jam` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbmasuk`
--

INSERT INTO `tbmasuk` (`NIP`, `Nama`, `Posisi`, `Mapel`, `Absen`, `Tanggal_Absen`, `Jam`) VALUES
('001', 'Chandra', 'Ketua Umum', 'BPH', 'Masuk', '2023-06-29', '08:11:06'),
('001', 'Chandra', 'Ketua Umum', 'BPH', 'Pulang', '2023-06-29', '10:39:51');

-- --------------------------------------------------------

--
-- Table structure for table `tbpersonal`
--

CREATE TABLE `tbpersonal` (
  `NIP` varchar(20) NOT NULL,
  `Nama` varchar(30) NOT NULL,
  `Posisi` varchar(20) NOT NULL,
  `Mapel` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbpersonal`
--

INSERT INTO `tbpersonal` (`NIP`, `Nama`, `Posisi`, `Mapel`) VALUES
('001', 'Chandra', 'Ketua Umum', 'BPH');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tblogin`
--
ALTER TABLE `tblogin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `tbpersonal`
--
ALTER TABLE `tbpersonal`
  ADD PRIMARY KEY (`NIP`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
