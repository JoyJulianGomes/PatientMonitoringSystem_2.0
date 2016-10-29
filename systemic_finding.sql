-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 31, 2016 at 07:14 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javaproject`
--

-- --------------------------------------------------------

--
-- Table structure for table `systemic_finding`
--


--
-- Dumping data for table `systemic_finding`
--

INSERT INTO `systemic_finding` (`PID`, `Alimentary`, `Respiratory`, `Cardiovasculat`, `Nervous`, `Locmotor`) VALUES
(101, 1, 0, 0, 1, 0),
(102, 0, 1, 0, 0, 1),
(103, 1, 0, 0, 0, 0),
(104, 0, 1, 0, 0, 0),
(105, 0, 0, 0, 1, 0),
(106, 0, 0, 0, 1, 1),
(107, 0, 1, 0, 1, 0),
(108, 0, 1, 0, 0, 0),
(109, 0, 0, 0, 0, 1),
(110, 0, 0, 1, 0, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `systemic_finding`
--
ALTER TABLE `systemic_finding`
  ADD PRIMARY KEY (`PID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
