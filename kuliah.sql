-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 07, 2020 at 04:25 PM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuliah`
--

-- --------------------------------------------------------

--
-- Table structure for table `dokter`
--

CREATE TABLE `dokter` (
  `id` int(255) NOT NULL,
  `id_dokter` varchar(255) NOT NULL,
  `nama_dokter` varchar(255) NOT NULL,
  `bidang_dokter` varchar(255) NOT NULL,
  `ruang_praktik` varchar(255) NOT NULL,
  `jadwal_praktik` varchar(255) NOT NULL,
  `jam_praktik` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dokter`
--

INSERT INTO `dokter` (`id`, `id_dokter`, `nama_dokter`, `bidang_dokter`, `ruang_praktik`, `jadwal_praktik`, `jam_praktik`) VALUES
(29, '1', 'dr.lisa', 'Spesialis Kandungan', 'Lt.1/1A', 'Senin', '07.00'),
(30, '2', 'dr.roky', 'Spesialis Kandungan', 'Lt.1/1B', 'Selasa', '07.00'),
(31, '3', 'dr.roy', 'Spesialis Kandungan', 'Lt.1/1C', 'Rabu', '07.00'),
(32, '4', 'dr.gunawan', 'Spesialis Kandungan', 'Lt.2/2A', 'Kamis', '07.00'),
(35, '5', 'dr.yuni', 'Spesialis Anak', 'Lt.1/1A', 'Senin', '07.00'),
(37, '7', 'dr.rani', 'Spesialis Anak', 'Lt.1/1C', 'Rabu', '09.00'),
(38, '8', 'dr.rudi', 'Spesialis Anak', 'Lt.2/2A', 'Kamis', '07.00'),
(39, '9', 'dr.eri', 'Spesialis Penyakit Dalam', 'Lt.1/1A', 'Senin', '13.00'),
(40, '9', 'dr.egy', 'Spesialis Penyakit Dalam', 'Lt.1/1B', 'Selasa', '13.00'),
(41, '10', 'dr.rangga', 'Spesialis Penyakit Dalam', 'Lt.1/1C', 'Rabu', '13.00'),
(42, '11', 'dr.tery', 'Spesialis Penyakit Dalam', 'Lt.2/2A', 'Kamis', '13.00'),
(43, '12', 'dr.yeni', 'Spesialis Bedah Umum', 'Lt.1/1A', 'Senin', '15.00'),
(44, '13', 'dr.untung', 'Spesialis Bedah Umum', 'Lt.1/1B', 'Selasa', '15.00'),
(45, '14', 'dr.intan', 'Spesialis Bedah Umum', 'Lt.1/1C', 'Rabu', '15.00'),
(46, '15', 'dr.oki', 'Spesialis Bedah Umum', 'Lt.2/2A', 'Kamis', '15.00'),
(47, '16', 'dr.putri', 'Spesialis Gigi', 'Lt.2/2B', 'Senin', '15.00'),
(48, '17', 'dr.anisa', 'Spesialis Gigi', 'Lt.2/2B', 'Senin', '19.00'),
(51, '18', 'dr.dewi', 'Spesialis Kandungan', 'Lt.1/1B', 'Senin', '07.00');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(355) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE `pasien` (
  `id` int(255) NOT NULL,
  `id_pasien` varchar(255) NOT NULL,
  `nama_pasien` varchar(255) NOT NULL,
  `ruangan` varchar(255) NOT NULL,
  `jenis_kelamin` varchar(255) NOT NULL,
  `usia` int(255) NOT NULL,
  `tanggal_masuk` varchar(255) NOT NULL,
  `keluhan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pasien`
--

INSERT INTO `pasien` (`id`, `id_pasien`, `nama_pasien`, `ruangan`, `jenis_kelamin`, `usia`, `tanggal_masuk`, `keluhan`) VALUES
(11, '1', 'reza gunawan', 'VIP', 'Laki-Laki', 20, '27 Juni 2020', 'demam'),
(12, '2', 'dewi putri', 'President Suite', 'Perempuan', 21, '26 Juni 2020', 'Sakit Mata'),
(13, '3', 'rudi gunawan', 'VIP', 'Laki-Laki', 20, '27 Juni 2020', 'Sakit Mata');

-- --------------------------------------------------------

--
-- Table structure for table `semester_1`
--

CREATE TABLE `semester_1` (
  `idsemester` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `nim` varchar(255) NOT NULL,
  `matkul` varchar(255) NOT NULL,
  `nilai` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `semester_1`
--

INSERT INTO `semester_1` (`idsemester`, `nama`, `nim`, `matkul`, `nilai`) VALUES
(7, 'alan', '1837632', 'pemogramna java', '80'),
(8, 'udin', '182520065', 'bahasa indonesia', '90'),
(9, 'agung', '182520089', 'pend pancasila', '80'),
(18, 'haryono', '74738347', 'smbd', '54'),
(19, 'suyono', '28927', 'pyton', '53'),
(20, 'qory', '737398', 'java', '90'),
(33, 'Galuh', '18252001', 'Aik', '90'),
(34, 'Farid', '18252002', 'pancasila', '80'),
(35, 'Soleh', '18252003', 'pemograman java', '70'),
(36, 'Qila', '18252004', 'praktikum java', '100'),
(37, 'dewi', '18252006', 'Pancasila', '50'),
(38, 'yanto', '18252008', 'pancasila', '40'),
(39, 'muhamad abdul basid', '182520046', 'Pemograman Java', '98'),
(40, 'muhamad abdul basid', '182520046', 'aik', '49'),
(41, 'muhamad abdul basid', '182520046', 'pancasila', '90'),
(42, 'Muhamad abdul basid', '182520046', 'praktikum java', '80'),
(43, 'iwan', '182520044', 'aik', '90');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dokter`
--
ALTER TABLE `dokter`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `semester_1`
--
ALTER TABLE `semester_1`
  ADD PRIMARY KEY (`idsemester`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dokter`
--
ALTER TABLE `dokter`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `pasien`
--
ALTER TABLE `pasien`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `semester_1`
--
ALTER TABLE `semester_1`
  MODIFY `idsemester` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
