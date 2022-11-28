-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  lun. 28 nov. 2022 à 14:48
-- Version du serveur :  10.3.16-MariaDB
-- Version de PHP :  7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `gestion_ordinateurs`
--

-- --------------------------------------------------------

--
-- Structure de la table `labo`
--

CREATE TABLE `labo` (
  `id` int(11) NOT NULL,
  `Matricule` varchar(20) NOT NULL,
  `PC` varchar(50) NOT NULL,
  `Processeur` varchar(52) NOT NULL,
  `Ram` varchar(50) DEFAULT NULL,
  `DisqueDur` int(12) DEFAULT NULL,
  `Graphique` varchar(35) NOT NULL,
  `Generation` int(11) NOT NULL,
  `Nombre` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `labo`
--

INSERT INTO `labo` (`id`, `Matricule`, `PC`, `Processeur`, `Ram`, `DisqueDur`, `Graphique`, `Generation`, `Nombre`) VALUES
(1, '1', 'ACER', 'core i5', '4', 250, 'Gforce', 4, 0),
(4, '24', 'TOCHIBA', 'core i9', '8', 250, 'Nvidia', 5, 0),
(6, '78', 'TOCHIBA', 'corei 8', '8', 253, 'gforce', 6, 8);

-- --------------------------------------------------------

--
-- Structure de la table `labo_c`
--

CREATE TABLE `labo_c` (
  `id` int(11) NOT NULL,
  `Matricule` varchar(20) NOT NULL,
  `PC` varchar(50) NOT NULL,
  `Processeur` varchar(52) NOT NULL,
  `Ram` varchar(50) DEFAULT NULL,
  `DisqueDur` int(12) DEFAULT NULL,
  `Graphique` varchar(35) NOT NULL,
  `Generation` int(11) NOT NULL,
  `Nombre` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `labo_e`
--

CREATE TABLE `labo_e` (
  `id` int(11) NOT NULL,
  `Matricule` varchar(20) NOT NULL,
  `PC` varchar(50) NOT NULL,
  `Processeur` varchar(52) NOT NULL,
  `Ram` varchar(50) DEFAULT NULL,
  `DisqueDur` int(12) DEFAULT NULL,
  `Graphique` varchar(35) NOT NULL,
  `Generation` int(11) NOT NULL,
  `Nombre` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `labo_ind`
--

CREATE TABLE `labo_ind` (
  `id` int(11) NOT NULL,
  `Matricule` varchar(20) NOT NULL,
  `PC` varchar(50) NOT NULL,
  `Processeur` varchar(52) NOT NULL,
  `Ram` varchar(50) DEFAULT NULL,
  `DisqueDur` int(12) DEFAULT NULL,
  `Graphique` varchar(35) NOT NULL,
  `Generation` int(11) NOT NULL,
  `Nombre` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `labo_t`
--

CREATE TABLE `labo_t` (
  `id` int(11) NOT NULL,
  `Matricule` varchar(20) NOT NULL,
  `PC` varchar(50) NOT NULL,
  `Processeur` varchar(52) NOT NULL,
  `Ram` varchar(50) DEFAULT NULL,
  `DisqueDur` int(12) DEFAULT NULL,
  `Graphique` varchar(35) NOT NULL,
  `Generation` int(11) NOT NULL,
  `Nombre` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `t_panne`
--

CREATE TABLE `t_panne` (
  `id` int(11) NOT NULL,
  `Num_panne` int(11) NOT NULL,
  `Matricule` int(11) NOT NULL,
  `PC` varchar(55) NOT NULL,
  `Panne` varchar(11) NOT NULL,
  `Nbn_panne` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `t_panne`
--

INSERT INTO `t_panne` (`id`, `Num_panne`, `Matricule`, `PC`, `Panne`, `Nbn_panne`) VALUES
(1, 1, 1, 'ACER', 'disque dur', 1),
(33, 9, 24, 'AMD', 'Ram', 2),
(34, 8, 24, 'TOCHIBA', 'Processeur', 3),
(35, 8, 1, 'ACER', 'pROCESSEUR', 6),
(36, 8, 1, 'ACER', 'pROCESSEUR', 1),
(37, 52, 35, 'MacBook', 'Ram', 1),
(38, 5, 6, 'TOCHIBA', 'gene', 2),
(39, 5, 6, 'TOCHIBA', 'gene', 2),
(40, 3, 24, 'AMD', 'GRP', 1),
(41, 63, 24, 'TOCHIBA', 'frein', 1),
(42, 589, 24, 'TOCHIBA', 'capiton', 1),
(43, 3333, 35, 'MacBook', 'reto', 2),
(44, 325, 35, 'MacBook', 'freine', 1),
(45, 0, 24, 'TOCHIBA', '0', 0),
(46, 4, 2, 'DELL', 'piece', 1),
(47, 6, 24, 'TOCHIBA', 'poo', 0),
(48, 6, 24, 'TOCHIBA', 'poo', 0),
(49, 65, 2, 'DELL', 'poo', 1),
(50, 65, 2, 'DELL', 'poo', 1),
(51, 52, 1, 'ACER', 'moto', 2),
(53, 56, 2, 'DELL', 'moto', 2),
(54, 56, 2, 'DELL', 'moto', 8),
(55, 56, 2, 'DELL', 'moto', 0),
(56, 56, 2, 'DELL', 'moto', 0),
(57, 36, 78, 'TOCHIBA', 'porte', 1),
(58, 0, 2, 'DELL', '0', 0),
(59, 58, 5, 'pour', 'pannne', 8),
(60, 0, 5, 'pour', 'pannne', 8),
(61, 0, 5, 'pour', 'pannne', 0);

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE `utilisateur` (
  `id` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `utilisateur`
--

INSERT INTO `utilisateur` (`id`, `id_user`, `username`, `password`, `type`) VALUES
(7, 1, 'tahiry', 'tahiry', 'Responsable'),
(8, 2, 'admin', 'admin', 'utilisateur'),
(9, 5, 'fredy', '659', 'directeur');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `labo`
--
ALTER TABLE `labo`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `labo_c`
--
ALTER TABLE `labo_c`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `labo_e`
--
ALTER TABLE `labo_e`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `labo_ind`
--
ALTER TABLE `labo_ind`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `labo_t`
--
ALTER TABLE `labo_t`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `t_panne`
--
ALTER TABLE `t_panne`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `labo`
--
ALTER TABLE `labo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `labo_c`
--
ALTER TABLE `labo_c`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `labo_e`
--
ALTER TABLE `labo_e`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `labo_ind`
--
ALTER TABLE `labo_ind`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `labo_t`
--
ALTER TABLE `labo_t`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `t_panne`
--
ALTER TABLE `t_panne`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=62;

--
-- AUTO_INCREMENT pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
