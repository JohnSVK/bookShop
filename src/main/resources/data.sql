
/*AUTHOR TABLE*/
ALTER TABLE author MODIFY COLUMN id BIGINT(20) NOT NULL AUTO_INCREMENT ;
insert into author (country, name, surname) values ('Rusko', 'Anastasia', 'Novych');
insert into author (country, name, surname) values ('Anglicko', 'J.R.R.', 'Tolkien');

/*BOOK CATEGORY TABLE*/
ALTER TABLE book_category MODIFY COLUMN id BIGINT(20) NOT NULL AUTO_INCREMENT ;
insert into book_category (name, description) values ('Odborná a náučná', 'Odborná a náučná literatúra.');
insert into book_category (name, description) values ('Fantasy a Sci-Fi', 'Fantasy a Sci-Fi literatúra.');

/*BOOK TYPE TABLE*/
ALTER TABLE book_type MODIFY COLUMN id BIGINT(20) NOT NULL AUTO_INCREMENT ;
insert into book_type (name, description) values ('Pevná väzba', 'Pevná fyzická väzba.');
insert into book_type (name, description) values ('Elektronická kópia', 'Elektronická kópia.');

/*BOOK TABLE*/
ALTER TABLE book MODIFY COLUMN id BIGINT(20) NOT NULL AUTO_INCREMENT ;
insert into book (name, description, author_id, book_category_id, book_type_id)
    values ('Allatra', 'Kniha, ktorá zmení svet.', 1, 1, 1);
insert into book (name, description, author_id, book_category_id, book_type_id)
    values ('Sensei zo Šambaly I', 'Kniha, ktorá zmení svet.', 1, 1, 1);
insert into book (name, description, author_id, book_category_id, book_type_id)
    values ('Sensei zo Šambaly II', 'Kniha, ktorá zmení svet.', 1, 1, 1);
insert into book (name, description, author_id, book_category_id, book_type_id)
    values ('Sensei zo Šambaly III', 'Kniha, ktorá zmení svet.', 1, 1, 1);
insert into book (name, description, author_id, book_category_id, book_type_id)
    values ('Sensei zo Šambaly IV', 'Kniha, ktorá zmení svet.', 1, 1, 1);
insert into book (name, description, author_id, book_category_id, book_type_id)
    values ('Pán prsteňov I.- Spoločenstvo prsteňa', 'Prvý slovenský preklad prvej časti slávnej trilógie.', 2, 2, 2);
insert into book (name, description, author_id, book_category_id, book_type_id)
    values ('Pán prsteňov II.- Dve veže', 'Prvý slovenský preklad druhej časti slávnej trilógie.', 2, 2, 2);
insert into book (name, description, author_id, book_category_id, book_type_id)
    values ('Pán prsteňov III.- Návrat kráľa', 'Prvý slovenský preklad tretej časti slávnej trilógie.', 2, 2, 2);
