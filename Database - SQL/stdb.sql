-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Mar 21, 2021 at 09:39 PM
-- Server version: 8.0.21
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `fee`
--

DROP TABLE IF EXISTS `fee`;
CREATE TABLE IF NOT EXISTS `fee` (
  `id` int DEFAULT NULL,
  `month` varchar(50) DEFAULT NULL,
  `fee` int DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fee`
--

INSERT INTO `fee` (`id`, `month`, `fee`) VALUES
(1, '22-03-2021', 2000),
(2, '22-03-2021', 2000);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `id` int DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `nic` varchar(12) NOT NULL,
  `mobilenumber` varchar(10) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `fee` int DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `name`, `nic`, `mobilenumber`, `email`, `gender`, `age`, `fee`) VALUES
(1, 'A B R Obesekara', '96558942', '712569814', 'Obe@gmail.com', 'Male', 25, 1000),
(2, 'S M D Thiranjaya', '2000115596', '0716985367', 'thira@gmail.com', 'Male', 20, 1000);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
