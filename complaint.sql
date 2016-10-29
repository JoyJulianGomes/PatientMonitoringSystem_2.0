-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 31, 2016 at 06:37 AM
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
-- Table structure for table `complaint`
--


INSERT INTO `complaint` (`PID`, `Date`, `Value`) VALUES
(101, '2016-08-01', 'Diabetic'),
(102, '2016-07-01', 'Chest Pain'),
(103, '2016-08-03', 'Hapatitis'),
(104, '2016-08-02', 'Dengue'),
(105, '2016-08-03', 'Typhoid'),
(106, '2016-08-04', 'Hapatitis'),
(107, '2016-08-05', 'Loose Mussion, Vomit'),
(108, '2016-08-12', 'High Pressure'),
(109, '2016-08-15', 'Dengue'),
(110, '2016-08-10', 'Lower Abdominal Pain');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `complaint`
--
ALTER TABLE `complaint`
  ADD PRIMARY KEY (`PID`,`Date`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
