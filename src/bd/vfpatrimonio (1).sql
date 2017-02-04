-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 03-Fev-2017 às 21:47
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
-- Estrutura da tabela `cad_dpto`
--

CREATE TABLE `cad_dpto` (
  `id_dpto` int(11) NOT NULL,
  `nome_dpto` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cad_dpto`
--

INSERT INTO `cad_dpto` (`id_dpto`, `nome_dpto`) VALUES
(1, 'ADMINISTRATIVO'),
(2, 'FINANCEIRO'),
(3, 'CONTABILIDADE'),
(5, 'RH'),
(6, 'TI'),
(7, 'GERENCIA'),
(8, 'FATURAMENTO'),
(9, 'ESTOQUE'),
(10, 'COMERCIAL');

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
(2, 'Computador', 'OPTIPLEX 7010', '2SM5012', 'Dell', 'Intel Core i5', 'Selecione', '8 GB', '500GB', 'Selecione', 'Selecione', 'RONALDO', 'PC EM OTIMO ESTADO, NOME DA MAQUINA VF-TIL01', '2016-12-23'),
(3, 'COMPUTADOR', 'OPTIPLEX 7010', '2SM5012', 'DELL', 'Intel Core i5', '3470 – 3.2 GHz', '8 GB', '999GB', 'TANGARA DA SERRA', 'TI', 'RONALDO', 'ADICIONADO MANUALMENTE 4GB DE RAM E 500HD', '2017-01-17'),
(4, 'COMPUTADOR', 'OPTIPLEX 7080', '5A54DTG6', 'DELL', 'Intel Core i3', '3240 – 3.4 GHz', '8 GB', '500GB', 'SAPEZAL', 'CONTABILIDADE', 'ODIRLEI', '', '2017-01-17'),
(5, 'COMPUTADOR', 'optiasd', '5454', 'asdas', 'Intel Core i5', '2400S – 2.5 GHz', '6 GB', '454GB', 'TANGARA DA SERRA', 'ADMINISTRATIVO', 'qweqw', 'qwe', '2017-01-09'),
(6, 'COMPUTADOR', 'asda', '123', 'asdas', 'Intel Core i3', '2100T – 2.5 GHz', '1 GB', '123GB', 'TANGARA DA SERRA', 'GERENCIA', 'qwe', 'qwe', '2017-01-24'),
(7, 'COMPUTADOR', '65', '5', '5', 'Intel Core i5', '2400S – 2.5 GHz', '5 GB', '222GB', 'TANGARA DA SERRA', 'TI', 'qwe', 'qw', '2017-01-10'),
(8, 'COMPUTADOR', 'we', '.6', 'qwe', 'Intel Core i3', '2100 – 3.1 GHz', '6 GB', '656GB', 'TANGARA DA SERRA', 'ADMINISTRATIVO', 'q', 'q', '2017-01-25'),
(9, 'Selecione', 'qwe', '123', 'qw', 'Intel Core i3', 'Selecione i3', '1 GB', '123GB', 'CAMPO NOVO DO PARECIS', 'FINANCEIRO', '123', '123', '2017-01-24');

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
-- Indexes for table `cad_dpto`
--
ALTER TABLE `cad_dpto`
  ADD PRIMARY KEY (`id_dpto`);

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
-- AUTO_INCREMENT for table `cad_dpto`
--
ALTER TABLE `cad_dpto`
  MODIFY `id_dpto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `cad_equipamento`
--
ALTER TABLE `cad_equipamento`
  MODIFY `id_equipamento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `cad_filial`
--
ALTER TABLE `cad_filial`
  MODIFY `id_filial` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
