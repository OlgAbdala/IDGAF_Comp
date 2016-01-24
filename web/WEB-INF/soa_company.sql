-- phpMyAdmin SQL Dump
-- version 4.4.10
-- http://www.phpmyadmin.net
--
-- Client :  localhost:8889
-- Généré le :  Dim 24 Janvier 2016 à 12:13
-- Version du serveur :  5.5.42
-- Version de PHP :  5.6.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `soa_company`
--

-- --------------------------------------------------------

--
-- Structure de la table `Applications`
--

CREATE TABLE `Applications` (
  `ID` int(11) NOT NULL,
  `studentMail` varchar(255) NOT NULL,
  `internshipID` int(11) NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `Applications`
--

INSERT INTO `Applications` (`ID`, `studentMail`, `internshipID`, `status`) VALUES
(1, 'testStudentMail', 1, 'NEW');

-- --------------------------------------------------------

--
-- Structure de la table `Employees`
--

CREATE TABLE `Employees` (
  `ID` int(11) NOT NULL,
  `login` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `surname` varchar(255) NOT NULL,
  `mail` varchar(255) NOT NULL,
  `tel` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `Employees`
--

INSERT INTO `Employees` (`ID`, `login`, `password`, `name`, `surname`, `mail`, `tel`) VALUES
(1, 'employee', 'employee', 'employeeName', 'employeeSurname', 'employeeMail', 'employeeTel');

-- --------------------------------------------------------

--
-- Structure de la table `Internships`
--

CREATE TABLE `Internships` (
  `ID` int(11) NOT NULL,
  `shortDescription` varchar(255) NOT NULL,
  `completeDescription` varchar(255) NOT NULL,
  `responsibleMail` varchar(255) NOT NULL,
  `startDate` datetime NOT NULL,
  `endDate` datetime NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `Internships`
--

INSERT INTO `Internships` (`ID`, `shortDescription`, `completeDescription`, `responsibleMail`, `startDate`, `endDate`) VALUES
(1, 'testShortDescription', 'testCompleteDescription', 'testResponsibleMail', '2016-01-01 00:00:00', '2016-01-29 00:00:00'),
(2, 'testShortDescription2', 'testCompleteDescription2', 'responsiblemail2', '2016-01-22 00:00:00', '2016-01-30 00:00:00');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `Applications`
--
ALTER TABLE `Applications`
  ADD PRIMARY KEY (`ID`);

--
-- Index pour la table `Employees`
--
ALTER TABLE `Employees`
  ADD PRIMARY KEY (`ID`);

--
-- Index pour la table `Internships`
--
ALTER TABLE `Internships`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `Applications`
--
ALTER TABLE `Applications`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `Employees`
--
ALTER TABLE `Employees`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `Internships`
--
ALTER TABLE `Internships`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
