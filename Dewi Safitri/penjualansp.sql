-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 18, 2018 at 05:38 PM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `penjualansp`
--

-- --------------------------------------------------------

--
-- Table structure for table `master`
--

CREATE TABLE `master` (
  `kd_brg` varchar(12) NOT NULL,
  `nama_brg` varchar(50) NOT NULL,
  `harga_jual` int(6) NOT NULL,
  `harga_beli` int(6) NOT NULL,
  `satuan` varchar(50) NOT NULL,
  `kategori` varchar(50) NOT NULL,
  `stok_brg` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `master`
--

INSERT INTO `master` (`kd_brg`, `nama_brg`, `harga_jual`, `harga_beli`, `satuan`, `kategori`, `stok_brg`) VALUES
('A001', 'Spion', 30000, 25000, 'Unit', 'Baru', 8),
('A002', 'Ban Dalam IRC', 40000, 36000, 'Unit', 'Baru', 12),
('A003', 'Skok', 50000, 45000, 'Unit', 'Baru', 12),
('A004', 'Dasbor Honda', 60000, 55000, 'Unit', 'Baru', 8);

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `tgl_faktur` date NOT NULL,
  `no_faktur` varchar(50) NOT NULL,
  `nama_konsumen` varchar(50) NOT NULL,
  `kd_brg` varchar(12) NOT NULL,
  `jumlah` int(6) NOT NULL,
  `harga_satuan` int(6) NOT NULL,
  `harga_total` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`tgl_faktur`, `no_faktur`, `nama_konsumen`, `kd_brg`, `jumlah`, `harga_satuan`, `harga_total`) VALUES
('2018-10-15', 'NF_013', 'Safitri', 'A001', 2, 30000, 60000),
('2018-10-16', 'NF_014', 'Dewi', 'A002', 3, 40000, 120000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `master`
--
ALTER TABLE `master`
  ADD PRIMARY KEY (`kd_brg`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
