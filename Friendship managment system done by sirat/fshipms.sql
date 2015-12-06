-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 11, 2015 at 05:33 AM
-- Server version: 5.6.16
-- PHP Version: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `fshipms`
--
CREATE DATABASE IF NOT EXISTS `fshipms` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `fshipms`;

-- --------------------------------------------------------

--
-- Table structure for table `new_friend`
--

DROP TABLE IF EXISTS `new_friend`;
CREATE TABLE IF NOT EXISTS `new_friend` (
  `name` varchar(20) NOT NULL,
  `age` int(3) NOT NULL,
  `gender` varchar(6) NOT NULL,
  `language` varchar(20) NOT NULL,
  `education` varchar(20) NOT NULL,
  `religion` varchar(10) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `facebook` varchar(40) NOT NULL,
  `email` varchar(40) NOT NULL,
  `country` varchar(15) NOT NULL,
  `city` varchar(15) NOT NULL,
  `street` varchar(15) NOT NULL,
  PRIMARY KEY (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `new_friend`
--

INSERT INTO `new_friend` (`name`, `age`, `gender`, `language`, `education`, `religion`, `phone`, `facebook`, `email`, `country`, `city`, `street`) VALUES
('as', 3, 'ytig', 'kyg', 'iyguk', 'gu', '123123', 'ik', 'giuk', 'giuy', 'giug', 'yyigi'),
('wewef', 15, 'werw', 'cvcvb', 'ergd', 'xrrfge', 'ertgfgd', 'ertvg', 'dgerg', 'dgrg', 'erterg', 'dfgdg');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
