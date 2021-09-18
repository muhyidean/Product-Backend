
INSERT into PRODUCT (id, title, price, category)  VALUES (1, 'Macbook Pro M1',1500,'Laptop');
INSERT into PRODUCT (id, title, price, category)  VALUES (2, 'Macbook Air M1',999,'Laptop');
INSERT into PRODUCT (id, title, price, category)  VALUES (3, 'iPhone 13 Pro Max',1300,'Smartphone');
INSERT into PRODUCT (id, title, price, category)  VALUES (4, 'iPhone 13 Pro',1000,'Smartphone');


INSERT into USER (id, name, username, password, IS_Enabled)  VALUES (111, 'Dean','dean','$2y$12$ZULYuC/Cz4RQhK4DngP8s.SfhJA35gNayrpKGZTHCryBvcnKL8u4a',true);
INSERT into USER (id, name, username, password, IS_Enabled)  VALUES (112, 'Zaineh','zaineh','$2y$12$ZULYuC/Cz4RQhK4DngP8s.SfhJA35gNayrpKGZTHCryBvcnKL8u4a',true);

INSERT INTO ROLE(ROLE_ID, ROLE) VALUES (1, 'USER');
INSERT INTO ROLE(ROLE_ID, ROLE) VALUES (2, 'ADMIN');

insert into USER_ROLES(USER_ID, ROLE_ID) values (111, 2);
insert into USER_ROLES(USER_ID, ROLE_ID) values (112, 1);

