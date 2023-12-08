-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 08 Des 2023 pada 04.12
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `laundry`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `datalaundry`
--

CREATE TABLE `datalaundry` (
  `id` int(8) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `jenislayanan` varchar(50) DEFAULT NULL,
  `harga` int(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `datalaundry`
--

INSERT INTO `datalaundry` (`id`, `nama`, `jenislayanan`, `harga`) VALUES
(12644, 'Dayat', 'Cuci kiloan', 25000),
(21343, 'Joandri', 'Cuci satuan', 10000),
(23456, 'Sealti', 'Cuci Kiloan', 25000),
(24215, 'Luna', 'Cuci satuan', 12000);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `datalaundry`
--
ALTER TABLE `datalaundry`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
