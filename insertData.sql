-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Czas generowania: 22 Sty 2021, 00:09
-- Wersja serwera: 10.4.17-MariaDB
-- Wersja PHP: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `hw2`
--

--
-- Zrzut danych tabeli `tproduct`
--

INSERT INTO `tproduct` (`id`, `name`, `description`, `type`, `amount`) VALUES
(1, 'Gun case', 'Ramps asymmetrical chambray, coloring book 90\'s normcore +1 flexitarian. Pabst chicharrones 90\'s cliche. Dreamcatcher blue bottle kombucha beard, semiotics jean shorts lumber letterpress church-key kickstarter iPhone enamel pin fanny pack banh mi brooklyn humblebrag copper mug food truck celiac. Tousled sartorial unicorn, semiotics paleo iceland subway tile franzen hell of vape vinyl. Swag thundercats pok pok.', 'https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.caseclub.com%2Fwp-content%2Fuploads%2F2016%2F12%2Fdiscreet-gun-case-1024x522.jpg&f=1&nofb=1', 10),
(2, 'Laptop', 'Whatever 90\'s church-key schlitz forage hoodie. Shaman cold-pressed kale chips church-key disrupt stumptown occupy, vegan vice drinking vinegar. Hashtag activated charcoal neutra roof party, pok pok XOXO street art semiotics offal. Direct trade chartreuse biodiesel vice you probably haven\'t heard of them brooklyn. Master cleanse quinoa kickstarter shabby chic pitchfork taxidermy kitsch small batch', 'https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fpngimg.com%2Fuploads%2Flaptop%2Flaptop_PNG5901.png&f=1&nofb=1', 1),
(3, 'Hammer', 'Flannel direct trade man bun pork belly, iceland roof party migas salvia hashtag. Plaid gluten-free yuccie skateboard meditation tumeric irony direct trade keytar. Bitters butcher kinfolk humblebrag fanny pack flannel adaptogen poutine. Scenester affogato offal neutra sriracha next level franzen hella four loko blue bottle banh mi. Pok pok YOLO wayfarers beard, man bun poutine pug XOXO tilde. ', 'https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fupload.wikimedia.org%2Fwikipedia%2Fde%2Fd%2Fd0%2FWHammer.jpg&f=1&nofb=1', 5);

--
-- Zrzut danych tabeli `tuser`
--

INSERT INTO `tuser` (`id`, `login`, `pass`, `role`) VALUES
(1, 'polska', 'polska', 'USER');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
