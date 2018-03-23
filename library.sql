-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 29, 2016 at 09:15 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `book_id` varchar(50) NOT NULL,
  `book_name` varchar(50) NOT NULL,
  `author_name` varchar(50) NOT NULL,
  `edition` varchar(20) NOT NULL,
  `subject` varchar(50) NOT NULL,
  `total_copy` varchar(20) NOT NULL,
  `available_copy` varchar(20) NOT NULL,
  `shelf` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`book_id`, `book_name`, `author_name`, `edition`, `subject`, `total_copy`, `available_copy`, `shelf`) VALUES
('2', 'Teach Yourself C++', 'Herbert Schildt', 'Third', 'Programming Language 2', '10', '10', ''),
('', '', '', '', '', '', '', ''),
('5', 'BIOLOGY', 'SOME ONE ', '3', 'BIOLOGY', '5', '1', '452'),
('9', 'Teach yourself c', 'some one ', '5th', 'programming', '6', '1', '263'),
('7', 'database ', 'some body', '6th', 'database', '7', '1', '123'),
('7', 'database ', 'some body', '6th', 'database', '7', '1', '123'),
('7', 'database ', 'some body', '6th', 'database', '7', '1', '123'),
('7', 'database ', 'some body', '6th', 'database', '7', '1', '123'),
('7', 'bd', 'fakrul', '4th', 'bangla', '6', '1', '654'),
('65', 'as', 'ghrhj', 'rtrtrtr', 'adwdg', '12', '6', '456');

-- --------------------------------------------------------

--
-- Table structure for table `info`
--

CREATE TABLE `info` (
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `user_name` varchar(500) NOT NULL,
  `mobile_number` varchar(30) NOT NULL,
  `password` varchar(50) NOT NULL,
  `re_password` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `info`
--

INSERT INTO `info` (`first_name`, `last_name`, `gender`, `email`, `user_name`, `mobile_number`, `password`, `re_password`) VALUES
('Shohrab', 'Hossen', 'Male', 'shohrab@gmail.com', 'shohrab', '0172123654', '12345', 12345),
('Fakrul', 'Islam', 'Male', 'fakrul@gmail.com', 'fakrul', '0167951347', '12345', 12345),
('Anika', 'Sultana', 'Female', 'anika@gmail.com', 'anika', '0167852369', '123654', 123654),
('Sadiqur', 'Saddam', 'Male', 'sabik@gmail.com', 'sabik', '0172963258', '123987', 123987),
('Ahosan', 'Ullah', 'Male', 'ahosan@gmail.com', 'ahosan', '01723698521', '123654', 123654),
('Sadequr ', 'Rahoman', 'Male', 'sadequr@gmail.com', 'sadaqur', '01764123456', '12345', 12345),
('monir', 'hossain', 'Male', 'monir@gmai.com', 'monir', '01675122912', '12344', 12345),
('jahid', 'hossain', 'Male', 'ja@gmail.com', 'jahidss', '0687687648', '12345', 12345);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
