-- V2: Migrations to add rank on tb_register

ALTER TABLE tb_register
ADD COLUMN rank VARCHAR(255);