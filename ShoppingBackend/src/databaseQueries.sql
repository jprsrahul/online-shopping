create table cateogry
id IDENTITY,
name VARCHAR(50),
description VARCHAR(255),
image_url VARCHAR(50),
is_active BOOLEAN,
CONSTRAINT pk_cateogry_id PRIMARY KEY(id)
);

INSERT INTO cateogry(name,description,image_url,is_active) VALUES ('Laptop','This is description of Laptop',"lp.jpg",'TRUE');

INSERT INTO cateogry(name,description,image_url,is_active) VALUES ('Television','This is description of television',"tv.jpg",'TRUE');

INSERT INTO cateogry(name,description,image_url,is_active) VALUES ('Mobile','This is description of mobile',"mb.jpg",'TRUE');

create table user_detail(
id IDENTITY,
first_name VARCHAR(50),
last_name VARCHAR(50),
role VARCHAR(50),
enabled BOOLEAN,
password VARCHAR(50),
email VARCHAR(100),
contact_number VARCHAR(50),

CONSTRAINT pk_user_id PRIMARY KEY(id)
);

INSERT INTO user_detail(`first_name`,`last_name`,`role`,`enabled`,`password`,`email`,`contact_number`) VALUES ('virat','kohli','ADMIN','true','admin','vk@gmail.com','77777777');

INSERT INTO INSERT INTO user_detail(`first_name`,`last_name`,`role`,`enabled`,`password`,`email`,`contact_number`) VALUES ('sk','ranjan','Supplier','true','slok','sl@gmail.com','5555555');

INSERT INTO user_detail(`first_name`,`last_name`,`role`,`enabled`,`password`,`email`,`contact_number`) VALUES ('rk','sharma','Supplier','true','rahul','rk@gmail.com','88888888');

create table product(
id IDENTITY,
code VARCHAR(50),
name VARCHAR(50),
brand VARCHAR(50),
description VARCHAR(255),
unit_price DECIMAL(10,2),
quantity INT,
is_active BOOLEAN,
cateogry_id INT,
supplier_id INT,
purchases INT DEFAULT 0,
views INT DEFAULT 0,

CONSTRAINT pk_product_id PRIMARY KEY(id)
CONSTRAINT fk_product_cateogry_id FOREIGN KEY(cateogry_id) REFERENCES cateogry(id),
CONSTRAINT fk_product_supplier_id FOREIGN KEY(supplier_id) REFERENCES user_detail(id),
);

INSERT INTO product(`code`,`name`,`brand`,`description`,`unit_price`,`quantity`,`is_active`,`cateogry_id`,`supplier_id`)
VALUES ('prdmno123px','googlepix','google','This is one of the android phone',57000,5,'TRUE',3,2);




INSERT INTO product(`code`,`name`,`brand`,`description`,`unit_price`,`quantity`,`is_active`,`cateogry_id`,`supplier_id`)
VALUES ('prdmno123px','mackbookpro','apple','This is avaavible market',54000,5,'TRUE',1,2);




INSERT INTO product(`code`,`name`,`brand`,`description`,`unit_price`,`quantity`,`is_active`,`cateogry_id`,`supplier_id`)
VALUES ('prdmnoABCss','dell3542','dell','This is one of the laptop',57000,5,'TRUE',1,3);





