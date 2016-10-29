-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 30, 2016 at 07:05 PM
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
-- Table structure for table `appearance`
--

CREATE TABLE `appearance` (
  `PID` int(11) NOT NULL,
  `ill_Looking` tinyint(1) NOT NULL,
  `Lethargic` tinyint(1) NOT NULL,
  `Unconscious` tinyint(1) NOT NULL,
  `Cachexia` tinyint(1) NOT NULL,
  `Obesity` tinyint(1) NOT NULL,
  `Cyanosis` tinyint(1) NOT NULL,
  `Edema` tinyint(1) NOT NULL,
  `Pale` tinyint(1) NOT NULL,
  `Uphoric` tinyint(1) NOT NULL,
  `Pathetic` tinyint(1) NOT NULL,
  `Violent` tinyint(1) NOT NULL,
  `CalmnCoOp` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `appearance`
--

INSERT INTO `appearance` (`PID`, `ill_Looking`, `Lethargic`, `Unconscious`, `Cachexia`, `Obesity`, `Cyanosis`, `Edema`, `Pale`, `Uphoric`, `Pathetic`, `Violent`, `CalmnCoOp`) VALUES
(101, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0),
(102, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0),
(103, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1),
(104, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0),
(105, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1),
(106, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1),
(107, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0),
(108, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
(109, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0),
(110, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `bloodpressure`
--

CREATE TABLE `bloodpressure` (
  `PID` int(11) NOT NULL,
  `Date` datetime NOT NULL,
  `Systolic` int(3) NOT NULL,
  `Diastolic` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bloodpressure`
--

INSERT INTO `bloodpressure` (`PID`, `Date`, `Systolic`, `Diastolic`) VALUES
(101, '2016-08-01 04:02:11', 110, 62),
(101, '2016-08-01 06:03:29', 90, 58),
(101, '2016-08-01 08:04:18', 112, 60),
(101, '2016-08-01 10:06:20', 110, 70),
(101, '2016-08-01 12:04:22', 100, 60),
(102, '2016-07-01 02:02:35', 110, 70),
(102, '2016-07-01 04:03:16', 110, 60),
(102, '2016-07-01 06:07:11', 110, 65),
(102, '2016-07-01 08:04:18', 112, 80),
(102, '2016-07-01 10:02:35', 120, 80),
(103, '2016-08-03 00:04:25', 100, 70),
(103, '2016-08-03 02:02:11', 110, 62),
(103, '2016-08-03 06:05:29', 110, 70),
(103, '2016-08-03 08:03:18', 105, 90),
(103, '2016-08-03 10:06:20', 110, 70),
(104, '2016-08-02 02:06:28', 100, 60),
(104, '2016-08-02 04:04:22', 110, 62),
(104, '2016-08-02 06:04:16', 90, 58),
(104, '2016-08-02 08:02:00', 112, 60),
(104, '2016-08-02 10:01:22', 112, 70),
(105, '2016-08-03 02:09:09', 110, 60),
(105, '2016-08-03 04:06:38', 105, 90),
(105, '2016-08-03 06:07:18', 110, 60),
(105, '2016-08-03 08:06:35', 110, 70),
(105, '2016-08-03 10:09:26', 120, 80),
(106, '2016-08-04 04:06:25', 112, 60),
(106, '2016-08-04 06:04:33', 110, 70),
(106, '2016-08-04 08:06:44', 110, 62),
(106, '2016-08-04 10:04:29', 110, 70),
(106, '2016-08-30 12:07:29', 110, 65),
(107, '2016-08-05 04:03:17', 110, 62),
(107, '2016-08-05 06:05:20', 112, 60),
(107, '2016-08-05 08:09:08', 110, 70),
(107, '2016-08-05 10:06:33', 105, 90),
(107, '2016-08-05 12:06:26', 110, 70),
(108, '2016-08-12 04:06:30', 90, 58),
(108, '2016-08-12 06:07:34', 110, 62),
(108, '2016-08-12 10:04:35', 110, 70),
(108, '2016-08-12 14:00:00', 105, 90),
(108, '2016-08-30 12:03:33', 110, 55),
(109, '2016-08-15 02:03:27', 100, 60),
(109, '2016-08-15 04:02:02', 110, 62),
(109, '2016-08-15 06:00:00', 90, 58),
(109, '2016-08-15 08:09:30', 112, 60),
(109, '2016-08-15 10:05:25', 110, 70),
(110, '2016-08-10 02:02:26', 110, 70),
(110, '2016-08-10 04:00:00', 105, 95),
(110, '2016-08-10 06:07:22', 110, 100),
(110, '2016-08-10 08:07:17', 110, 90),
(110, '2016-08-10 10:00:15', 110, 70);

-- --------------------------------------------------------

--
-- Table structure for table `cbc`
--

CREATE TABLE `cbc` (
  `Report_ID` int(2) NOT NULL,
  `TID` int(2) NOT NULL,
  `White_Blood_Cell` varchar(50) NOT NULL,
  `Red_Blood_Cell` varchar(50) NOT NULL,
  `Hemoglobin` varchar(50) NOT NULL,
  `Hematocrit` varchar(50) NOT NULL,
  `Mean_Corpuscular_Volume` varchar(50) NOT NULL,
  `Mean_Corpuscular_Hb` varchar(50) NOT NULL,
  `Mean_Corpuscular_Hb_Conc` varchar(50) NOT NULL,
  `RBC_Distribution_Width` varchar(50) NOT NULL,
  `Platelet_Count` varchar(50) NOT NULL,
  `Mean_Platelet_Volume` varchar(50) NOT NULL,
  `Neutrophils` varchar(50) NOT NULL,
  `Lymphocytes` varchar(50) NOT NULL,
  `Monoyte` varchar(50) NOT NULL,
  `Eosinophil` varchar(50) NOT NULL,
  `Basophil` varchar(50) NOT NULL,
  `PID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `complaint`
--

CREATE TABLE `complaint` (
  `PID` int(11) NOT NULL,
  `Date` date NOT NULL,
  `Value` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `ID` int(20) NOT NULL,
  `Name` text NOT NULL,
  `Age` int(2) NOT NULL,
  `Gender` char(6) NOT NULL,
  `Contact` int(15) NOT NULL,
  `PASSWOARD` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`ID`, `Name`, `Age`, `Gender`, `Contact`, `PASSWOARD`) VALUES
(111111, 'Dr. Imtiaz Faruk', 40, 'Male', 1723156879, '12345'),
(111121, 'Dr. Fatema Ahmed', 32, 'Female', 1530264355, '12345'),
(111131, 'Dr. A. B. M Syeed Hossain', 52, 'Male', 1845632456, '12345'),
(111321, 'Dr. Farhad Uddin Ahmed', 45, 'Male', 1256578545, '12345'),
(111523, 'Dr. Enamul Haque Chowdhury', 37, 'Male', 1840234568, '12345');

-- --------------------------------------------------------

--
-- Table structure for table `drug_usage`
--

CREATE TABLE `drug_usage` (
  `PID` int(11) NOT NULL,
  `Drug` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `drug_usage`
--

INSERT INTO `drug_usage` (`PID`, `Drug`) VALUES
(101, 'Steroid, Ebastin, Naproxen.'),
(102, 'Azithromycin, Cefradin'),
(103, 'Cefixime, Ebastin, Keforoatae, Bpomazepam.'),
(104, 'Bromazepam, Prednisolone.'),
(105, 'Kaforotac, Prednisolone, Cefixime.'),
(106, 'Prednisolone, Bromazepam.'),
(107, 'Ebastin, Keforoatae, Bpomazepam.'),
(108, 'Prednisolone, Cefixime, Ebastin, Keforoatae, Bpomazepam.'),
(109, 'Cefixime, Ebastin, Keforoatae, Bpomazepam.'),
(110, 'Prednisolone, Cefixime, Ebastin, Keforoatae, Bpomazepam.');

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE `history` (
  `PID` int(11) NOT NULL,
  `Date` int(11) NOT NULL,
  `Description` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `lipid_profile`
--

CREATE TABLE `lipid_profile` (
  `PID` int(11) NOT NULL,
  `Report_ID` int(2) NOT NULL,
  `TID` int(2) NOT NULL,
  `LDL_Choloesterol` varchar(50) NOT NULL,
  `HDL_Choloesterol` varchar(50) NOT NULL,
  `VLDL_Choloesterol` varchar(50) NOT NULL,
  `Choloesterol_Total` varchar(50) NOT NULL,
  `Triglycerides` varchar(50) NOT NULL,
  `NON_HDL_Chol_LDL_VDL` varchar(50) NOT NULL,
  `APOB100_Calc` varchar(50) NOT NULL,
  `LDL_R` varchar(50) NOT NULL,
  `LP_Cholesterol` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `liver_function_test`
--

CREATE TABLE `liver_function_test` (
  `PID` int(11) NOT NULL,
  `TID` int(2) NOT NULL,
  `Report_ID` int(2) NOT NULL,
  `Bilirubin_Total` varchar(50) NOT NULL,
  `Alkaline_Phosphate` varchar(50) NOT NULL,
  `GGT` varchar(50) NOT NULL,
  `ALT` varchar(50) NOT NULL,
  `Albumin` varchar(50) NOT NULL,
  `Globulin` varchar(50) NOT NULL,
  `Calcium` varchar(50) NOT NULL,
  `Phosphorus` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `PID` int(11) NOT NULL,
  `Name` text NOT NULL,
  `Age` int(11) NOT NULL,
  `Sex` text NOT NULL,
  `Height` varchar(10) NOT NULL,
  `Weight` int(3) NOT NULL,
  `Religion` text NOT NULL,
  `Marital_Status` varchar(10) NOT NULL,
  `Occupation` text NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Contact` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`PID`, `Name`, `Age`, `Sex`, `Height`, `Weight`, `Religion`, `Marital_Status`, `Occupation`, `Address`, `Contact`) VALUES
(101, 'Anisur Rahman Akash', 23, 'Male', '5''5"', 75, 'Islam', 'Unmarried', 'Student', 'Khilkhet, Dhaka', 1532045684),
(102, 'Akib Shahriar Khan', 24, 'Male', '5''8"', 65, 'Islam', 'Unmarried', 'Student', 'Airport, Dhaka', 1683245689),
(103, 'Abir Prochchhod', 25, 'Male', '5''5"', 65, 'Islam', 'Unmarried', 'Student', 'Mirpur-10, Dhaka', 1533265893),
(104, 'Joy Julian Gomes', 30, 'Male', '5''6"', 60, 'Christian', 'Unmarried', 'Employee', 'Shavar, Dhaka', 1685324520),
(105, 'Rahul Karmoker', 28, 'Male', '5''8"', 58, 'Hindu', 'Unmarried', 'Student', 'Khilkhet,Dhaka', 1685324562),
(106, 'Projna Saha', 35, 'Female', '5''4"', 55, 'Hindu', 'Married', 'Employee', 'Farmgate, Dhaka', 1532648525),
(107, 'Tamanna Chowdhury', 36, 'Female', '5''3"', 57, 'Islam', 'Married', 'House Wife', 'Banosree, Mirpur, Dhaka', 1842356984),
(108, 'Tariqur Rahman Bijoy', 52, 'Male', '5''9"', 75, 'Islam', 'Married', 'Employee', 'House Building, Uttora, Dhaka', 125689423),
(109, 'Dia Tasneem', 56, 'Female', '5''5"', 63, 'Islam', 'Married', 'Employee', 'Mirpur-10, Dhaka', 1265489352),
(110, 'Dollon Haidar', 65, 'Female', '5''4"', 65, 'Islam', 'Married', 'House Wife', 'Malibag, Dhaka', 1536547896);

-- --------------------------------------------------------

--
-- Table structure for table `pulse`
--

CREATE TABLE `pulse` (
  `PID` int(11) NOT NULL,
  `Date` datetime NOT NULL,
  `Value` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pulse`
--

INSERT INTO `pulse` (`PID`, `Date`, `Value`) VALUES
(101, '2016-08-01 04:02:11', 72),
(101, '2016-08-01 06:03:29', 74),
(101, '2016-08-01 08:04:18', 73),
(101, '2016-08-01 10:06:20', 74),
(101, '2016-08-01 12:04:22', 75),
(102, '2016-07-01 02:02:35', 74),
(102, '2016-07-01 04:03:16', 76),
(102, '2016-07-01 06:07:11', 73),
(102, '2016-07-01 08:04:18', 75),
(102, '2016-07-01 10:02:35', 77),
(103, '2016-08-03 00:04:25', 79),
(103, '2016-08-03 02:02:11', 85),
(103, '2016-08-03 06:05:29', 82),
(103, '2016-08-03 08:03:18', 75),
(103, '2016-08-03 10:06:20', 73),
(104, '2016-08-02 02:06:28', 75),
(104, '2016-08-02 04:04:22', 76),
(104, '2016-08-02 06:04:16', 70),
(104, '2016-08-02 08:02:00', 77),
(104, '2016-08-02 10:01:22', 73),
(105, '2016-08-03 02:09:09', 70),
(105, '2016-08-03 04:06:38', 68),
(105, '2016-08-03 06:07:18', 68),
(105, '2016-08-03 08:06:35', 69),
(105, '2016-08-03 10:09:26', 72),
(106, '2016-08-04 04:06:25', 65),
(106, '2016-08-04 06:04:33', 68),
(106, '2016-08-04 08:06:44', 69),
(106, '2016-08-04 10:04:29', 70),
(106, '2016-08-30 12:07:29', 70),
(107, '2016-08-05 04:03:17', 85),
(107, '2016-08-05 06:05:20', 83),
(107, '2016-08-05 08:09:08', 85),
(107, '2016-08-05 10:06:33', 80),
(107, '2016-08-05 12:06:26', 79),
(108, '2016-08-12 04:06:30', 65),
(108, '2016-08-12 06:07:34', 63),
(108, '2016-08-12 10:04:35', 63),
(108, '2016-08-12 14:00:00', 66),
(108, '2016-08-15 02:03:27', 69),
(108, '2016-08-30 12:03:33', 68),
(109, '2016-08-15 04:02:02', 70),
(109, '2016-08-15 06:00:00', 75),
(109, '2016-08-15 08:09:30', 69),
(109, '2016-08-15 10:05:25', 72),
(110, '2016-08-10 02:02:26', 85),
(110, '2016-08-10 04:00:00', 82),
(110, '2016-08-10 06:07:22', 80),
(110, '2016-08-10 08:07:17', 80),
(110, '2016-08-10 10:00:15', 79);

-- --------------------------------------------------------

--
-- Table structure for table `respiratory`
--

CREATE TABLE `respiratory` (
  `PID` int(11) NOT NULL,
  `Date` datetime NOT NULL,
  `Value` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `respiratory`
--

INSERT INTO `respiratory` (`PID`, `Date`, `Value`) VALUES
(101, '2016-08-01 04:02:11', '15'),
(101, '2016-08-01 06:03:29', '13'),
(101, '2016-08-01 08:04:18', '16'),
(101, '2016-08-01 10:06:20', '15'),
(101, '2016-08-01 12:04:22', '13'),
(102, '2016-07-01 02:02:35', '13'),
(102, '2016-07-01 04:03:16', '14'),
(102, '2016-07-01 06:07:11', '15'),
(102, '2016-07-01 08:04:18', '16'),
(102, '2016-07-01 10:02:35', '13'),
(103, '2016-08-03 00:04:25', '12'),
(103, '2016-08-03 02:02:11', '16'),
(103, '2016-08-03 06:05:29', '14'),
(103, '2016-08-03 08:03:18', '14'),
(103, '2016-08-03 10:06:20', '13'),
(104, '2016-08-02 02:06:28', '18'),
(104, '2016-08-02 04:04:22', '14'),
(104, '2016-08-02 06:04:16', '15'),
(104, '2016-08-02 08:02:00', '16'),
(104, '2016-08-02 10:01:22', '13'),
(105, '2016-08-03 02:09:09', '15'),
(105, '2016-08-03 04:06:38', '16'),
(105, '2016-08-03 06:07:18', '14'),
(105, '2016-08-03 08:06:35', '14'),
(105, '2016-08-03 10:09:26', '16'),
(106, '2016-08-04 04:06:25', '17'),
(106, '2016-08-04 06:04:33', '16'),
(106, '2016-08-04 08:06:44', '16'),
(106, '2016-08-04 10:04:29', '17'),
(106, '2016-08-30 12:07:29', '13'),
(107, '2016-08-05 04:03:17', '18'),
(107, '2016-08-05 06:05:20', '16'),
(107, '2016-08-05 08:09:08', '16'),
(107, '2016-08-05 10:06:33', '13'),
(107, '2016-08-05 12:06:26', '15'),
(108, '2016-08-12 04:06:30', '20'),
(108, '2016-08-12 06:07:34', '18'),
(108, '2016-08-12 10:04:35', '21'),
(108, '2016-08-12 14:00:00', '23'),
(108, '2016-08-30 12:03:33', '19'),
(109, '2016-08-15 02:03:27', '22'),
(109, '2016-08-15 04:02:02', '25'),
(109, '2016-08-15 06:00:00', '19'),
(109, '2016-08-15 08:09:30', '21'),
(109, '2016-08-15 10:05:25', '19'),
(110, '2016-08-10 02:02:26', '27'),
(110, '2016-08-10 04:00:00', '28'),
(110, '2016-08-10 06:07:22', '25'),
(110, '2016-08-10 08:07:17', '19'),
(110, '2016-08-10 10:00:15', '23');

-- --------------------------------------------------------

--
-- Table structure for table `stool_test`
--

CREATE TABLE `stool_test` (
  `PID` int(11) NOT NULL,
  `TID` int(2) NOT NULL,
  `Report_ID` int(2) NOT NULL,
  `Absent` varchar(50) NOT NULL,
  `Hymenolepis_nana` varchar(50) NOT NULL,
  `Giardia_lamblia` varchar(50) NOT NULL,
  `Entamoeba_coli` varchar(50) NOT NULL,
  `Endolima_nana` varchar(50) NOT NULL,
  `Trichocephalus_trichiurus` varchar(50) NOT NULL,
  `Entamoeba_histolytica` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `systemic_finding`
--

CREATE TABLE `systemic_finding` (
  `PID` int(11) NOT NULL,
  `Alimentary` tinyint(1) NOT NULL,
  `Respiratory` tinyint(1) NOT NULL,
  `Cardiovasculat` tinyint(1) NOT NULL,
  `Nervous` tinyint(1) NOT NULL,
  `Locmotor` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `temp`
--

CREATE TABLE `temp` (
  `PID` int(11) NOT NULL,
  `Date` datetime NOT NULL,
  `Value` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `temp`
--

INSERT INTO `temp` (`PID`, `Date`, `Value`) VALUES
(101, '2016-08-01 04:02:11', '97'),
(101, '2016-08-01 06:03:29', '97'),
(101, '2016-08-01 08:04:18', '98'),
(101, '2016-08-01 10:06:20', '97'),
(101, '2016-08-01 12:04:22', '97'),
(102, '2016-07-01 02:02:35', '98'),
(102, '2016-07-01 04:03:16', '97'),
(102, '2016-07-01 06:07:11', '97'),
(102, '2016-07-01 08:04:18', '97'),
(102, '2016-07-01 10:02:35', '98'),
(103, '2016-08-03 00:04:25', '97'),
(103, '2016-08-03 02:02:11', '98'),
(103, '2016-08-03 06:05:29', '98'),
(103, '2016-08-03 08:03:18', '98'),
(103, '2016-08-03 10:06:20', '98'),
(104, '2016-08-02 02:06:28', '97'),
(104, '2016-08-02 04:04:22', '98'),
(104, '2016-08-02 06:04:16', '97'),
(104, '2016-08-02 08:02:00', '97'),
(104, '2016-08-02 10:01:22', '97'),
(105, '2016-08-03 02:09:09', '97'),
(105, '2016-08-03 04:06:38', '97'),
(105, '2016-08-03 06:07:18', '97'),
(105, '2016-08-03 08:06:35', '97'),
(105, '2016-08-03 10:09:26', '98'),
(106, '2016-08-04 04:06:25', '98'),
(106, '2016-08-04 06:04:33', '98'),
(106, '2016-08-04 08:06:44', '97'),
(106, '2016-08-04 10:04:29', '97'),
(106, '2016-08-30 12:07:29', '97'),
(107, '2016-08-05 04:03:17', '99'),
(107, '2016-08-05 06:05:20', '99'),
(107, '2016-08-05 08:09:08', '98'),
(107, '2016-08-05 10:06:33', '98'),
(107, '2016-08-05 12:06:26', '98'),
(108, '2016-08-12 04:06:30', '97'),
(108, '2016-08-12 06:07:34', '97'),
(108, '2016-08-12 10:04:35', '97'),
(108, '2016-08-12 14:00:00', '98'),
(108, '2016-08-30 12:03:33', '97'),
(109, '2016-08-15 02:03:27', '98'),
(109, '2016-08-15 04:02:02', '98'),
(109, '2016-08-15 06:00:00', '97'),
(109, '2016-08-15 08:09:30', '96'),
(109, '2016-08-15 10:05:25', '97'),
(110, '2016-08-10 02:02:26', '97'),
(110, '2016-08-10 04:00:00', '97'),
(110, '2016-08-10 06:07:22', '97'),
(110, '2016-08-10 08:07:17', '97'),
(110, '2016-08-10 10:00:15', '97');

-- --------------------------------------------------------

--
-- Table structure for table `test`
--

CREATE TABLE `test` (
  `TID` int(2) NOT NULL,
  `Name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `test`
--

INSERT INTO `test` (`TID`, `Name`) VALUES
(1, 'Urine_Test'),
(2, 'Lipid_Profile'),
(3, 'CBC'),
(4, 'Liver_Function_Test'),
(5, 'Stool_Test');

-- --------------------------------------------------------

--
-- Table structure for table `urine_test`
--

CREATE TABLE `urine_test` (
  `PID` int(11) NOT NULL,
  `Report_ID` int(2) NOT NULL,
  `TID` int(2) NOT NULL,
  `Volume` varchar(50) NOT NULL,
  `Color` varchar(50) NOT NULL,
  `Appearance` varchar(50) NOT NULL,
  `Specific_Gravity` varchar(50) NOT NULL,
  `PH` varchar(50) NOT NULL,
  `Protein` varchar(50) NOT NULL,
  `Sugar` varchar(50) NOT NULL,
  `Urobilinogen` varchar(50) NOT NULL,
  `Urine_Ketone` varchar(50) NOT NULL,
  `Bile_Salts` varchar(50) NOT NULL,
  `Bile_Pigments` varchar(50) NOT NULL,
  `Occult_Blood` varchar(50) NOT NULL,
  `Pus_Cell` varchar(50) NOT NULL,
  `Red_Blood_Cell` varchar(50) NOT NULL,
  `Epithelial_Cell` varchar(50) NOT NULL,
  `Cast` varchar(50) NOT NULL,
  `Crystals` varchar(50) NOT NULL,
  `Others` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `appearance`
--
ALTER TABLE `appearance`
  ADD PRIMARY KEY (`PID`,`ill_Looking`,`Lethargic`,`Unconscious`,`Cachexia`,`Obesity`,`Cyanosis`,`Edema`,`Pale`,`Uphoric`,`Pathetic`,`Violent`);

--
-- Indexes for table `bloodpressure`
--
ALTER TABLE `bloodpressure`
  ADD PRIMARY KEY (`PID`,`Date`);

--
-- Indexes for table `cbc`
--
ALTER TABLE `cbc`
  ADD PRIMARY KEY (`Report_ID`,`TID`,`PID`),
  ADD KEY `TID` (`TID`),
  ADD KEY `PID` (`PID`);

--
-- Indexes for table `complaint`
--
ALTER TABLE `complaint`
  ADD PRIMARY KEY (`PID`,`Date`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `drug_usage`
--
ALTER TABLE `drug_usage`
  ADD PRIMARY KEY (`PID`);

--
-- Indexes for table `history`
--
ALTER TABLE `history`
  ADD PRIMARY KEY (`PID`);

--
-- Indexes for table `lipid_profile`
--
ALTER TABLE `lipid_profile`
  ADD PRIMARY KEY (`PID`,`Report_ID`,`TID`),
  ADD KEY `TID` (`TID`);

--
-- Indexes for table `liver_function_test`
--
ALTER TABLE `liver_function_test`
  ADD PRIMARY KEY (`PID`,`TID`,`Report_ID`),
  ADD KEY `TID` (`TID`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`PID`);

--
-- Indexes for table `pulse`
--
ALTER TABLE `pulse`
  ADD PRIMARY KEY (`PID`,`Date`);

--
-- Indexes for table `respiratory`
--
ALTER TABLE `respiratory`
  ADD PRIMARY KEY (`PID`,`Date`);

--
-- Indexes for table `stool_test`
--
ALTER TABLE `stool_test`
  ADD PRIMARY KEY (`PID`,`TID`,`Report_ID`),
  ADD KEY `TID` (`TID`);

--
-- Indexes for table `systemic_finding`
--
ALTER TABLE `systemic_finding`
  ADD PRIMARY KEY (`PID`);

--
-- Indexes for table `temp`
--
ALTER TABLE `temp`
  ADD PRIMARY KEY (`PID`,`Date`);

--
-- Indexes for table `test`
--
ALTER TABLE `test`
  ADD PRIMARY KEY (`TID`);

--
-- Indexes for table `urine_test`
--
ALTER TABLE `urine_test`
  ADD PRIMARY KEY (`PID`,`Report_ID`,`TID`),
  ADD UNIQUE KEY `Report_ID` (`Report_ID`),
  ADD UNIQUE KEY `Test_ID` (`TID`),
  ADD UNIQUE KEY `Report_ID_2` (`Report_ID`,`TID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `PID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=111;
--
-- AUTO_INCREMENT for table `test`
--
ALTER TABLE `test`
  MODIFY `TID` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `appearance`
--
ALTER TABLE `appearance`
  ADD CONSTRAINT `appearance_ibfk_1` FOREIGN KEY (`PID`) REFERENCES `patient` (`PID`);

--
-- Constraints for table `bloodpressure`
--
ALTER TABLE `bloodpressure`
  ADD CONSTRAINT `bloodpressure_ibfk_1` FOREIGN KEY (`PID`) REFERENCES `patient` (`PID`);

--
-- Constraints for table `cbc`
--
ALTER TABLE `cbc`
  ADD CONSTRAINT `cbc_ibfk_1` FOREIGN KEY (`TID`) REFERENCES `test` (`TID`),
  ADD CONSTRAINT `cbc_ibfk_2` FOREIGN KEY (`PID`) REFERENCES `patient` (`PID`);

--
-- Constraints for table `drug_usage`
--
ALTER TABLE `drug_usage`
  ADD CONSTRAINT `drug_usage_ibfk_1` FOREIGN KEY (`PID`) REFERENCES `patient` (`PID`);

--
-- Constraints for table `history`
--
ALTER TABLE `history`
  ADD CONSTRAINT `history_ibfk_1` FOREIGN KEY (`PID`) REFERENCES `patient` (`PID`);

--
-- Constraints for table `lipid_profile`
--
ALTER TABLE `lipid_profile`
  ADD CONSTRAINT `lipid_profile_ibfk_1` FOREIGN KEY (`TID`) REFERENCES `test` (`TID`),
  ADD CONSTRAINT `lipid_profile_ibfk_2` FOREIGN KEY (`PID`) REFERENCES `patient` (`PID`);

--
-- Constraints for table `liver_function_test`
--
ALTER TABLE `liver_function_test`
  ADD CONSTRAINT `liver_function_test_ibfk_1` FOREIGN KEY (`TID`) REFERENCES `test` (`TID`),
  ADD CONSTRAINT `liver_function_test_ibfk_2` FOREIGN KEY (`PID`) REFERENCES `patient` (`PID`);

--
-- Constraints for table `pulse`
--
ALTER TABLE `pulse`
  ADD CONSTRAINT `pulse_ibfk_1` FOREIGN KEY (`PID`) REFERENCES `patient` (`PID`);

--
-- Constraints for table `respiratory`
--
ALTER TABLE `respiratory`
  ADD CONSTRAINT `respiratory_ibfk_1` FOREIGN KEY (`PID`) REFERENCES `patient` (`PID`);

--
-- Constraints for table `stool_test`
--
ALTER TABLE `stool_test`
  ADD CONSTRAINT `stool_test_ibfk_1` FOREIGN KEY (`PID`) REFERENCES `patient` (`PID`),
  ADD CONSTRAINT `stool_test_ibfk_2` FOREIGN KEY (`TID`) REFERENCES `test` (`TID`);

--
-- Constraints for table `temp`
--
ALTER TABLE `temp`
  ADD CONSTRAINT `temp_ibfk_1` FOREIGN KEY (`PID`) REFERENCES `patient` (`PID`);

--
-- Constraints for table `urine_test`
--
ALTER TABLE `urine_test`
  ADD CONSTRAINT `urine_test_ibfk_1` FOREIGN KEY (`TID`) REFERENCES `test` (`TID`),
  ADD CONSTRAINT `urine_test_ibfk_2` FOREIGN KEY (`PID`) REFERENCES `patient` (`PID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
