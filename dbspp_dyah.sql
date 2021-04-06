-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 05, 2021 at 04:43 AM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.1.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbspp_dyah`
--

-- --------------------------------------------------------

--
-- Table structure for table `kelas`
--

CREATE TABLE `kelas` (
  `id_kelas` int(11) NOT NULL,
  `nama_kelas` varchar(100) NOT NULL,
  `kompetensi_keahlian` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kelas`
--

INSERT INTO `kelas` (`id_kelas`, `nama_kelas`, `kompetensi_keahlian`) VALUES
(1, 'X-1', 'RPL'),
(2, 'XI-1', 'RPL'),
(3, 'XII-1', 'RPL'),
(4, 'X-2', 'Multimedia'),
(5, 'XI-2', 'Multimedia'),
(6, 'XII-2', 'Multimedia');

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE `pembayaran` (
  `id_pembayaran` varchar(11) NOT NULL,
  `id_petugas` int(11) NOT NULL,
  `nisn` varchar(10) NOT NULL,
  `tgl_bayar` date NOT NULL,
  `bulan_dibayar` varchar(8) NOT NULL,
  `tahun_dibayar` varchar(4) NOT NULL,
  `id_spp` int(11) NOT NULL,
  `jumlah_bayar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pembayaran`
--

INSERT INTO `pembayaran` (`id_pembayaran`, `id_petugas`, `nisn`, `tgl_bayar`, `bulan_dibayar`, `tahun_dibayar`, `id_spp`, `jumlah_bayar`) VALUES
('TRS0001', 1, '005431110', '2021-04-04', 'januari', '2020', 2, 200000);

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `id_petugas` int(11) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(32) NOT NULL,
  `nama_petugas` varchar(35) NOT NULL,
  `level` enum('petugas','admin') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `petugas`
--

INSERT INTO `petugas` (`id_petugas`, `username`, `password`, `nama_petugas`, `level`) VALUES
(1, 'admin', 'admin', 'Dyah Nurul Huda ', 'admin'),
(2, 'petugas', 'petugas', 'petugas', 'petugas');

-- --------------------------------------------------------

--
-- Table structure for table `siswa`
--

CREATE TABLE `siswa` (
  `nisn` char(10) NOT NULL,
  `nis` char(8) NOT NULL,
  `nama` varchar(35) NOT NULL,
  `id_kelas` int(11) NOT NULL,
  `alamat` text NOT NULL,
  `no_telp` varchar(13) NOT NULL,
  `id_spp` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `siswa`
--

INSERT INTO `siswa` (`nisn`, `nis`, `nama`, `id_kelas`, `alamat`, `no_telp`, `id_spp`) VALUES
('0012345628', '1819017', 'MUstika Wati', 6, 'Kp. Cibodas', '089134567859', 3),
('001281786', '1920015', 'Satria Tegar', 2, 'Jl. Sinarsari', '083317718779', 2),
('001656727', '20210013', 'Bila Nabila', 2, 'Kp. Hegarmanah', '084276789179', 1),
('001778937', '2021004', 'Bella Melayni', 1, 'Jl. Cangkorah', '084716324138', 1),
('001923933', '1920005', 'Erna Birulah', 3, 'Kp. Hegarmanah', '083616788778', 2),
('002127632', '2021014', 'Damay ', 2, 'Jl. Selacau', '083200013000', 1),
('002345678', '1819001', 'Adinda Nurul', 5, 'Kp. Cibodas', '089134567854', 3),
('002346556', '1819004', 'Aura Maliya', 5, 'Kp. Selacau', '084716371138', 3),
('002346570', '2021002', 'Algi Albiagi', 1, 'Jl. Batujajar', '083452332910', 1),
('002347333', '1920012', 'Anggi Dean', 4, 'Kp. Sukamanah', '081376788732', 2),
('002534677', '2021012', 'Arbani Yasiz', 2, 'Kp. Rancatiis', '082329788999', 1),
('002677356', '1920013', 'Cecep Pujianto', 2, 'Kp. Cihurip', '081536676707', 2),
('002827288', '1920002', 'Alika Dewi', 3, 'Kp. Hegarwangi', '085627288898', 2),
('002868878', '1819021', 'Revina Anggraeni', 6, 'Kp. Babakan Sari', '083672676898', 3),
('002877337', '1819018', 'Nadia Dewi Ayuni', 6, 'Kp. Cihurip', '083452368916', 3),
('002877677', '1819002', 'Aldi Septiansyah', 5, 'Kp. Cihurup', '083452368910', 3),
('002926556', '1819020', 'Ramdan Maulana', 6, 'Kp. Selacau', '084716371138', 3),
('002998878', '1819005', 'Citra Desty', 5, 'Kp. Babakan Sari', '083672676868', 3),
('003434086', '1819019', 'Novan Maulana', 6, 'Kp. Cigorowong', '086389929489', 3),
('003434456', '1819003', 'Annisa Nurrahma', 5, 'Kp. Cigorowong', '086389929429', 3),
('003867273', '2021015', 'Lala Lidia', 2, 'Kp. GiriMukti', '089828376863', 1),
('003882789', '2021003', 'Berlina Putri', 1, 'Kp. Sinarmukti', '086389925029', 1),
('003886822', '1920004', 'Didin Rohman', 3, 'Gg. Hj. Umar', '083316578686', 2),
('004676884', '1920003', 'Aulia Lacuba', 3, 'Kp. GiriMukti', '083256578688', 2),
('005431110', '1920001', 'Alvin Ramdani', 3, 'Blok. Sinarjaya', '082187867680', 2),
('005716788', '1920011', 'Ajeng Agustina', 4, 'Kp. Sukasari', '085276828933', 2),
('006266288', '2021005', 'Cici Renia', 1, 'Jl. Citunjung', '083672670068', 1),
('007381266', '2021001', 'Aldebaran Putra', 1, 'Jl. Cipatik', '089138967854', 1),
('009917281', '1920014', 'Fauzan Alfiansyah', 4, 'Blok. Babakansari', '086176787917', 2),
('009973689', '2021011', 'Agung Kustanto', 2, 'Blok. Ranca', '082388389210', 1);

-- --------------------------------------------------------

--
-- Table structure for table `spp`
--

CREATE TABLE `spp` (
  `id_spp` int(11) NOT NULL,
  `tahun` int(11) NOT NULL,
  `nominal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `spp`
--

INSERT INTO `spp` (`id_spp`, `tahun`, `nominal`) VALUES
(1, 2021, 250000),
(2, 2020, 200000),
(3, 2019, 150000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kelas`
--
ALTER TABLE `kelas`
  ADD PRIMARY KEY (`id_kelas`);

--
-- Indexes for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`id_pembayaran`),
  ADD KEY `id_petugas` (`id_petugas`),
  ADD KEY `id_spp` (`id_spp`),
  ADD KEY `nisn` (`nisn`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`id_petugas`);

--
-- Indexes for table `siswa`
--
ALTER TABLE `siswa`
  ADD PRIMARY KEY (`nisn`),
  ADD KEY `id_spp` (`id_spp`),
  ADD KEY `id_kelas` (`id_kelas`);

--
-- Indexes for table `spp`
--
ALTER TABLE `spp`
  ADD PRIMARY KEY (`id_spp`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kelas`
--
ALTER TABLE `kelas`
  MODIFY `id_kelas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `petugas`
--
ALTER TABLE `petugas`
  MODIFY `id_petugas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `spp`
--
ALTER TABLE `spp`
  MODIFY `id_spp` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD CONSTRAINT `pembayaran_ibfk_2` FOREIGN KEY (`nisn`) REFERENCES `siswa` (`nisn`),
  ADD CONSTRAINT `pembayaran_ibfk_4` FOREIGN KEY (`id_spp`) REFERENCES `siswa` (`id_spp`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `pembayaran_ibfk_5` FOREIGN KEY (`id_petugas`) REFERENCES `petugas` (`id_petugas`);

--
-- Constraints for table `siswa`
--
ALTER TABLE `siswa`
  ADD CONSTRAINT `siswa_ibfk_1` FOREIGN KEY (`id_spp`) REFERENCES `spp` (`id_spp`),
  ADD CONSTRAINT `siswa_ibfk_2` FOREIGN KEY (`id_kelas`) REFERENCES `kelas` (`id_kelas`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
