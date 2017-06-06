

CREATE TABLE `Cliente` (
    id int NOT NULL AUTO_INCREMENT,
    nomeCliente varchar(64) NOT NULL,
    rgCliente varchar(16) NOT NULL,
    cpfCliente varchar(12) NOT NULL UNIQUE,
    estadoCivilCliente varchar(4) NOT NULL, -- S (solteiro), C (casado), V (viúvo), UE (União Estável), D (divorciado) 
    sexoCliente varchar(4) NOT NULL, -- M (masculino),  F (feminino)
    data_nascimentoCliente date DEFAULT NULL,
    emailCliente varchar(64) NOT NULL UNIQUE,
    telefoneCliente int(12) NOT NULL,
    celularCliente int(12) NOT NULL UNIQUE,
    ruaCliente varchar(64),
    cepCliente varchar(16) DEFAULT NULL,
    complementoCliente varchar(32) NOT NULL,
    bairroCliente varchar(64) DEFAULT NULL,
    cidadeCliente varchar(32) DEFAULT NULL,
    ufCliente varchar(4) DEFAULT NULL, -- sigla do estado 'PB'
    PRIMARY KEY(id)
) ;

CREATE TABLE `Categoria` (
    id int not null AUTO_INCREMENT,
    nome varchar(25),
    valorDia double not null,
    valorKm double not null,
    ar boolean,
    vidro boolean,
    direcao boolean,
    PRIMARY KEY(id)
);

CREATE TABLE `Veiculo` (
    id int NOT NULL AUTO_INCREMENT,
    placa varchar(8) NOT NULL UNIQUE,
    modelo varchar(16) NOT NULL, -- modelo do veículo Gol, Siena, Palio, etc.
    chassi varchar(24) NOT NULL UNIQUE,
    ano int NOT NULL, -- ano de fabricação do veículo
    marca varchar(32) NOT NULL,
    numPortas int (2),
    cor varchar(24),
    alugado boolean,
    idCategoria int not null,
    PRIMARY KEY(id),
    foreign key(idCategoria) references `Categoria`(id)
) ;

CREATE TABLE `Locacao`(
    id int not null AUTO_INCREMENT,
    descricao varchar(64) not null,
    qtdDias int not null,
    dataDoAluquel date not null,
    dataDaDevolucao date not null,
    valorDiaria double not null,
    subTotal double not null,
    atrasoLocacao boolean,
    diasAtraso int,
    dataRetorno date,
    valorFinal double,
    isDesconto boolean,
    valorDesconto double,
    idCliente int not null, -- chave estrangeira para o cliente
    idVeiculo int not null, -- chave estrangeira para o veículo
    PRIMARY KEY(id),
    foreign key(idCliente) references `Cliente`(id),
    foreign key(idVeiculo) references `Veiculo`(id)
);


CREATE TABLE `Usuario`(
    id int not null AUTO_INCREMENT,
    loginUser varchar(8) not null,
    senhaUser varchar(12) not null,
    nomeUser varchar(64) not null,
    acessoUser varchar(10),
    PRIMARY KEY(id)
);
