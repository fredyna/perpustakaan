-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jul 16, 2018 at 12:36 PM
-- Server version: 10.1.26-MariaDB
-- PHP Version: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_perpus`
--

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `id_buku` varchar(15) NOT NULL,
  `judul` varchar(100) NOT NULL,
  `pengarang` varchar(100) NOT NULL,
  `penerbit` varchar(100) NOT NULL,
  `isbn` varchar(20) NOT NULL,
  `tahun` year(4) NOT NULL,
  `jumlah` smallint(6) NOT NULL,
  `id_supplier` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`id_buku`, `judul`, `pengarang`, `penerbit`, `isbn`, `tahun`, `jumlah`, `id_supplier`) VALUES
('12345678', 'AYAT AYAT CINTA', 'SDFDFDF', 'SFDFD', '3434-3434-3434-34', 2017, 2, 'SP000001'),
('19345678', 'KAKAKAKAK', 'WPREPORPERO', 'SFLDFKDLFK', '121-212-12-1', 2015, 2, 'SP000002'),
('23232323232', 'SDFDF', 'SDFDF', 'SDFDF', '234-234-23-2', 2015, 5, 'SP000001'),
('32132132', 'SDF SDFDFD FAF', 'SDFD SDFDF', 'SDFDF SDFDQE3', '2323-232-232-2', 2017, 4, 'SP000002'),
('8765431', 'SFSF', 'SFSDF', 'SFDF', '243-3-234-342', 2012, 3, 'SP000001'),
('87654321', 'CONTOH1', 'PENGARANG', 'PENERBIT', '2323-232-32-2', 2015, 5, 'SP000002');

-- --------------------------------------------------------

--
-- Table structure for table `retur`
--

CREATE TABLE `retur` (
  `id_return` int(11) NOT NULL,
  `id_buku` varchar(15) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `keterangan` varchar(100) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `retur`
--

INSERT INTO `retur` (`id_return`, `id_buku`, `jumlah`, `keterangan`, `tanggal`) VALUES
(1, '19345678', 3, 'SGFASFK FSFLJSF	ALK SF SF SJ FSFJ SDF ', '2018-05-15'),
(2, '19345678', 3, 'SFDFSDFDFSDF', '2018-06-04'),
(3, '12345678', 3, 'SFDFD', '2018-06-06');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `id_supplier` varchar(8) NOT NULL,
  `nama_supplier` varchar(100) NOT NULL,
  `no_hp` varchar(13) NOT NULL,
  `alamat` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`id_supplier`, `nama_supplier`, `no_hp`, `alamat`) VALUES
('SP000001', 'BOOKNESIA', '02153651495', 'JAKARTA, INDONESIA'),
('SP000002', 'ERLANGGA', '0283324511', 'Kota Tegal, Jawa Tengah');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id_user` varchar(8) NOT NULL,
  `username` varchar(30) NOT NULL,
  `nama_user` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `role` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id_user`, `username`, `nama_user`, `password`, `role`) VALUES
('USER0001', 'ADMIN', 'FREDY NUR APRIYANTO', '21232f297a57a5a743894a0e4a801fc3', 1),
('USER0002', 'FREDD', 'APRI', '900150983cd24fb0d6963f7d28e17f72', 2),
('USER0003', 'CONTOH', 'CONTOH1', '7815696ecbf1c96e6894b779456d330e', 2),
('USER0004', 'HANYACONTOH1', 'CONTOH', '4553eb3ff328b4868a7a1e6e53cd28b4', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id_buku`);

--
-- Indexes for table `retur`
--
ALTER TABLE `retur`
  ADD PRIMARY KEY (`id_return`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id_supplier`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `retur`
--
ALTER TABLE `retur`
  MODIFY `id_return` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
