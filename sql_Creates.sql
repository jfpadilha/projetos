-------------| Creates |----------------

CREATE TABLE cidade(
codCid INT NOT NULL,
nome VARCHAR(100),
uf CHAR(2),
CONSTRAINT pkCidade PRIMARY KEY(codCid));

CREATE TABLE cliente(
codCli INT NOT NULL,
nome VARCHAR(100),
endereco VARCHAR(150),
codCid INT NOT NULL,
CONSTRAINT pkCliente PRIMARY KEY(codCli),
CONSTRAINT fkCliente FOREIGN KEY(codCid) REFERENCES cidade(codCid));

CREATE TABLE projeto(
idProj CHAR(10) NOT NULL,
nome VARCHAR(100) NOT NULL,
tipo VARCHAR(100) NOT NULL,
dataIniPrev DATE NOT NULL,
dataFimPrev DATE NOT NULL,
dataIniReal DATE,
dataFimReal DATE,
custoEst DECIMAL(12,3),
codCli INT NOT NULL,
CONSTRAINT pkProjeto PRIMARY KEY(idProj),
CONSTRAINT fkProjeto FOREIGN KEY(codCli) REFERENCES cliente(codCli));


CREATE TABLE pessoa(
codPess INT NOT NULL,
nome VARCHAR(100) NOT NULL,
endereco VARCHAR (150) NOT NULL,
tipo CHAR(1),
admissao DATE,
codCli INT NOT NULL,
codCid INT NOT NULL,
CONSTRAINT pkPessoa PRIMARY KEY(codPess),
CONSTRAINT fkPessoaCli FOREIGN KEY(codCli) REFERENCES pessoa(codPess),
CONSTRAINT fkPessoaCid FOREIGN KEY (codCid) REFERENCES cidade(codCid));

CREATE TABLE funcao(
codFunc INT NOT NULL,
nome VARCHAR(100) NOT NULL,
CONSTRAINT pkFuncao PRIMARY KEY(codFunc));

CREATE TABLE fase(
codFase INT NOT NULL,
nome VARCHAR(100),
CONSTRAINT pkFase PRIMARY KEY(codFase));

CREATE TABLE faseProjeto(
idProj CHAR(10),
codFase INT NOT NULL,
CONSTRAINT pkFaseProjProj PRIMARY KEY(idProj, codFase),
CONSTRAINT fkFaseProjProj FOREIGN KEY(idProj) REFERENCES projeto(idProj),
CONSTRAINT fkFaseProjFase FOREIGN KEY(codFase) REFERENCES fase(codFase));

CREATE TABLE atividade(
idProj CHAR(10) NOT NULL,
sequencia INT NOT NULL,
nome VARCHAR(200) NOT NULL,
dataIniPrev DATE NOT NULL,
dataFimPrev DATE NOT NULL,
dataIniReal DATE,
dataFimReal DATE,
horaIniPrev TIME,
horaFimPrev TIME,
horaIniReal TIME,
horaFimReal TIME,
duracaoEst DECIMAL(13,3) NOT NULL,
duracaoReal DECIMAL(13,3),
custoEst DECIMAL(13,3) NOT NULL,
custoReal DECIMAL(13,3),
status VARCHAR(50) NOT NULL,
codFase INT NOT NULL,
CONSTRAINT pkAtividade PRIMARY KEY(idProj, sequencia),
CONSTRAINT fkAtividade FOREIGN KEY(codFase) REFERENCES fase(codFase));

CREATE TABLE participanteAtiv(
idProj CHARACTER(10) NOT NULL,
sequencia INT NOT NULL,
codPess INT NOT NULL,
codFunc INT NOT NULL,
CONSTRAINT pkParticipanteAtiv PRIMARY KEY(idProj, sequencia, codPess),
CONSTRAINT fkParticipanteAtiv1 FOREIGN KEY(idProj, sequencia) REFERENCES atividade(idProj, sequencia),
CONSTRAINT fkParticipanteAtiv2 FOREIGN KEY(codPess) REFERENCES pessoa(codPess),
CONSTRAINT fkParticipanteAtiv3 FOREIGN KEY(codFunc) REFERENCES funcao(codFunc));

CREATE TABLE dependeciaAtiv(
idProj CHARACTER(10) NOT NULL,
sequencia INT NOT NULL,
sequenciaDep INT NOT NULL,
CONSTRAINT pkDependenciaAtiv PRIMARY KEY(idProj, sequencia, sequenciaDep),
CONSTRAINT fkDependenciaAtiv FOREIGN KEY(idProj, sequencia) REFERENCES atividade(idProj, sequencia));

CREATE TABLE ocorrencia(
idProj CHARACTER(10),
sequencia INT NOT NULL,
dataOcor DATE NOT NULL, 
horaOcor TIME NOT NULL,
descricao VARCHAR(250),
CONSTRAINT pkOcorrencia PRIMARY KEY (idProj, sequencia, dataOcor, horaOcor),
CONSTRAINT fkOcorrencia FOREIGN KEY(idProj, sequencia) REFERENCES atividade(idProj, sequencia))

