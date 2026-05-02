CREATE DATABASE bookstore;
USE bookstore;

CREATE TABLE books (
    book_id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    description TEXT,
    published_date DATE,
    price DECIMAL(10,2),
    genre VARCHAR(100),
    isbn VARCHAR(50) UNIQUE,
    image_url VARCHAR(500),
    pdf_url VARCHAR(500)
);


INSERT INTO books (title, author, description, published_date, price, genre, isbn, image_url, pdf_url)

VALUES

('Atomic Habits', 'James Clear', 'Self improvement book', '2018-10-16', 499.00, 'Self-help', 'ISBN001', '/images/atomic.jpg', '/pdfs/atomic.pdf'),

('Rich Dad Poor Dad', 'Robert Kiyosaki', 'Finance book', '1997-01-01', 399.00, 'Finance', 'ISBN002', '/images/richdad.jpg', '/pdfs/richdad.pdf');


SELECT * FROM books;