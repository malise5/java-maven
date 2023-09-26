CREATE TABLE IF NOT EXISTS sales (id INT AUTO_INCREMENT PRIMARY KEY,item VARCHAR(100) NOT NULL,quantity INT,unit_price INT)ENGINE=INNODB;

INSERT INTO sales (item, quantity, unit_price) VALUES(?,?,?);