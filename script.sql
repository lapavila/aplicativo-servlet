CREATE TABLE usuario (
  id INT NOT NULL AUTO_INCREMENT,
  fullName VARCHAR(100) NULL,
  username VARCHAR(20) NULL,
  password VARCHAR(20) NULL,
  PRIMARY KEY (id));

insert into usuario (fullName, username, password) values ('Adminisrtador', 'admin', 'admin');