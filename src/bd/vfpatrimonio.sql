-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 30-Dez-2016 às 14:44
-- Versão do servidor: 10.1.13-MariaDB
-- PHP Version: 7.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `vfpatrimonio`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cad_equipamento`
--

CREATE TABLE `cad_equipamento` (
  `id_equipamento` int(11) NOT NULL,
  `descricao` text NOT NULL,
  `modelo` text NOT NULL,
  `num_serie` text NOT NULL,
  `marca` text NOT NULL,
  `processador` text NOT NULL,
  `frequencia` text NOT NULL,
  `ram` text NOT NULL,
  `hd` text NOT NULL,
  `filial` text NOT NULL,
  `departamento` text NOT NULL,
  `usuario` text NOT NULL,
  `observacao` text NOT NULL,
  `ult_verificacao` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cad_equipamento`
--

INSERT INTO `cad_equipamento` (`id_equipamento`, `descricao`, `modelo`, `num_serie`, `marca`, `processador`, `frequencia`, `ram`, `hd`, `filial`, `departamento`, `usuario`, `observacao`, `ult_verificacao`) VALUES
(1, 'WERWERWE', '151515', '545454', 'Selecione', 'Selecione', '1.1 Ghz', '5 GB', '454GB', 'Selecione', 'Selecione', '45454', '54545454', '2016-12-10'),
(2, 'Computador', 'OPTIPLEX 7010', '2SM5012', 'Dell', 'Intel Core i5', 'Selecione', '8 GB', '500GB', 'Selecione', 'Selecione', 'RONALDO', 'PC EM OTIMO ESTADO, NOME DA MAQUINA VF-TIL01', '2016-12-23');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cad_filial`
--

CREATE TABLE `cad_filial` (
  `id_filial` int(11) NOT NULL,
  `cnpj` text NOT NULL,
  `inscricao_estadual` text NOT NULL,
  `razao_social` text NOT NULL,
  `endereco` text NOT NULL,
  `numero` text NOT NULL,
  `bairro` text NOT NULL,
  `cep` text NOT NULL,
  `cidade` text NOT NULL,
  `telefone` text NOT NULL,
  `uf` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cad_filial`
--

INSERT INTO `cad_filial` (`id_filial`, `cnpj`, `inscricao_estadual`, `razao_social`, `endereco`, `numero`, `bairro`, `cep`, `cidade`, `telefone`, `uf`) VALUES
(1, '06.233.034/0003-74', '1454154878', 'VIA FERTIL PRODUTOS AGROPECUARIOS LTDA', 'AV LIONS INTERNACIONAL ', '3000W', 'CENTRO', '78300000', 'TANGARA DA SERRA', '(65) 3325-1111', 'MT'),
(3, '06.233.034/0004-55', '134282426', 'VIA FERTIL PRODUTOS AGROPECUARIOS LTDA', 'AVENIDA OLACYR FRANCISCO DE MORAES', '1040', 'CENTRO', '78360000', 'CAMPO NOVO DO PARECIS', '(65) 3382-4600', 'MT'),
(4, '06.233.034/0002-93', '133791424', 'VIA FERTIL PRODUTOS AGROPECUARIOS LTDA', 'AVENIDA ADELINO JOSE RAMO', '45', 'CENTRO', '78307000', 'CAMPOS DE JULIO', '(65) 3387-1700', 'MT'),
(5, '06.233.034/0001-02', '132540142', 'VIA FERTIL PRODUTOS AGROPECUARIOS', 'AVENIDA ENGENHEIRO JOSE DA SILVA THIAGO', '230', 'AGUA CLARA', '78365000', 'SAPEZAL', '(65) 3383-2486', 'MT'),
(6, '06.233.034/0005-36', '134476530', 'VIA FERTIL PRODUTOS AGROPECUARIOS', 'ROD SENADOR ROBERTO CAMPOS', 'S/N', 'NOVO DIAMANTINO', '78402000', 'DIAMANTINO', '(65) 3337-1711', 'MT');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cad_equipamento`
--
ALTER TABLE `cad_equipamento`
  ADD PRIMARY KEY (`id_equipamento`);

--
-- Indexes for table `cad_filial`
--
ALTER TABLE `cad_filial`
  ADD PRIMARY KEY (`id_filial`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cad_equipamento`
--
ALTER TABLE `cad_equipamento`
  MODIFY `id_equipamento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `cad_filial`
--
ALTER TABLE `cad_filial`
  MODIFY `id_filial` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
