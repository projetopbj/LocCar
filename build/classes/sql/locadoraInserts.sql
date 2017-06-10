-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: locadora
-- ------------------------------------------------------
-- Server version	5.5.56-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categoria` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(25) DEFAULT NULL,
  `valorDia` double NOT NULL,
  `valorKm` double NOT NULL,
  `ar` tinyint(1) DEFAULT NULL,
  `vidro` tinyint(1) DEFAULT NULL,
  `direcao` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'Economico',15,25,0,0,0),(2,'Utilitário Topper',25.9,18.9,1,1,1),(3,'Utilitário',13.9,5.6,0,0,0),(4,'Esportivo',300,125,1,1,1);
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nomeCliente` varchar(64) NOT NULL,
  `rgCliente` varchar(16) NOT NULL,
  `cpfCliente` varchar(16) NOT NULL,
  `estadoCivilCliente` varchar(4) NOT NULL,
  `sexoCliente` varchar(4) NOT NULL,
  `data_nascimentoCliente` date DEFAULT NULL,
  `emailCliente` varchar(64) NOT NULL,
  `telefoneCliente` varchar(16) NOT NULL,
  `celularCliente` varchar(16) NOT NULL,
  `ruaCliente` varchar(64) DEFAULT NULL,
  `cepCliente` varchar(12) DEFAULT NULL,
  `complementoCliente` varchar(32) NOT NULL,
  `bairroCliente` varchar(64) DEFAULT NULL,
  `cidadeCliente` varchar(32) DEFAULT NULL,
  `ufCliente` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cpfCliente` (`cpfCliente`),
  UNIQUE KEY `emailCliente` (`emailCliente`),
  UNIQUE KEY `celularCliente` (`celularCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Fulana de Talz','111100000','000.000.000-10','C','F','1987-05-09','fulana@tals.com','(89)3255-1414','(83)98855-1416','Paulino dos Santos Coelho, 589','58052-000','Casa','Bancários','João Pessoa','PB'),(2,'Teste de Client','0000001','111.111.111-11','D','F','2015-02-02','allll@com.com','(99)9999-9999','(95)55555-5555','aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, 09','58411-111','casa','oaiao','fdoasodo','ES'),(3,'Aleff Santos','12340000','555.444.333-00','S','M','1994-07-05','aleff.abg@gmail.com','(83)3235-7104','(83)99669-1549','Eloy de Medeiros Costa, 587','58052-530','Casa','Jardim Cd Universitária','João Pessoa','PB'),(4,'Monkey D. Luffy','99955512','999.777.555-66','S','M','1998-06-21','luffy@onepiece.com','(99)5555-5555','(88)88888-8888','Grand Line. 55','99999-999','Barco','Mar','Agua','AC');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `locacao`
--

DROP TABLE IF EXISTS `locacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `locacao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(64) NOT NULL,
  `qtdDias` int(11) NOT NULL,
  `dataDoAluguel` date NOT NULL,
  `dataDaDevolucao` date NOT NULL,
  `subTotal` double NOT NULL,
  `atrasoLocacao` tinyint(1) DEFAULT NULL,
  `diasAtraso` int(11) DEFAULT NULL,
  `dataRetorno` date DEFAULT NULL,
  `valorFinal` double DEFAULT NULL,
  `desconto` tinyint(1) DEFAULT NULL,
  `valorDesconto` double DEFAULT NULL,
  `statusLocacao` tinyint(1) DEFAULT NULL,
  `idCliente` int(11) NOT NULL,
  `idVeiculo` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idCliente` (`idCliente`),
  KEY `idVeiculo` (`idVeiculo`),
  CONSTRAINT `locacao_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`id`),
  CONSTRAINT `locacao_ibfk_2` FOREIGN KEY (`idVeiculo`) REFERENCES `veiculo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `locacao`
--

LOCK TABLES `locacao` WRITE;
/*!40000 ALTER TABLE `locacao` DISABLE KEYS */;
INSERT INTO `locacao` VALUES (11,'Palio Vermelho',120,'2017-06-12','2017-10-10',1800,NULL,NULL,NULL,NULL,0,0,0,4,8);
/*!40000 ALTER TABLE `locacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `loginUser` varchar(8) NOT NULL,
  `senhaUser` varchar(12) NOT NULL,
  `nomeUser` varchar(64) NOT NULL,
  `acessoUser` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'','','Admin Padrão','Admin');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `veiculo`
--

DROP TABLE IF EXISTS `veiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `veiculo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `placa` varchar(8) NOT NULL,
  `modelo` varchar(16) NOT NULL,
  `chassi` varchar(24) NOT NULL,
  `ano` int(11) NOT NULL,
  `marca` varchar(32) NOT NULL,
  `numPortas` int(2) DEFAULT NULL,
  `cor` varchar(24) DEFAULT NULL,
  `alugado` tinyint(1) DEFAULT NULL,
  `idCategoria` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `placa` (`placa`),
  UNIQUE KEY `chassi` (`chassi`),
  KEY `idCategoria` (`idCategoria`),
  CONSTRAINT `veiculo_ibfk_1` FOREIGN KEY (`idCategoria`) REFERENCES `categoria` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `veiculo`
--

LOCK TABLES `veiculo` WRITE;
/*!40000 ALTER TABLE `veiculo` DISABLE KEYS */;
INSERT INTO `veiculo` VALUES (1,'AVC-1234','Uno','000000000000001',2001,'Fiat',2,'Cinza',0,1),(2,'GGG-5544','Saveiro','1100000000000',2015,'VW',2,'Preto Ninja',0,2),(3,'POI-9866','Fiorino','540000000000',2005,'Fiat',2,'Branco',0,3),(4,'YUI-7898','Uno','777777777700',2015,'Fiat',4,'Bege',0,1),(6,'AVC-1342','Gol','1234',2010,'VW',4,'Branco',0,1),(7,'GHJ-6666','Courier','22222233',2005,'Ford',2,'Azul',0,3),(8,'OPI-0099','Palio','55555544',2009,'Fiat',4,'Vermelho',1,1);
/*!40000 ALTER TABLE `veiculo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-10  2:25:55
