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


INSERT INTO books (title, author, description, published_date, price, genre, isbn, image_url, pdf_url) VALUES
                                                                                                           ('The Alchemist', 'Paulo Coelho', 'Spiritual journey story', '1988-01-01', 299.00, 'Fiction', 'ISBN003', '/images/alchemist.jpg', '/pdfs/alchemist.pdf'),
                                                                                                           ('Think and Grow Rich', 'Napoleon Hill', 'Success philosophy', '1937-01-01', 350.00, 'Self-help', 'ISBN004', '/images/think.jpg', '/pdfs/think.pdf'),
                                                                                                           ('Ikigai', 'Hector Garcia', 'Japanese life philosophy', '2016-01-01', 420.00, 'Self-help', 'ISBN005', '/images/ikigai.jpg', '/pdfs/ikigai.pdf'),
                                                                                                           ('Deep Work', 'Cal Newport', 'Focus and productivity', '2016-01-01', 450.00, 'Productivity', 'ISBN006', '/images/deepwork.jpg', '/pdfs/deepwork.pdf'),
                                                                                                           ('Zero to One', 'Peter Thiel', 'Startup mindset', '2014-01-01', 500.00, 'Business', 'ISBN007', '/images/zero.jpg', '/pdfs/zero.pdf'),
                                                                                                           ('The Power of Habit', 'Charles Duhigg', 'Habit science', '2012-01-01', 410.00, 'Self-help', 'ISBN008', '/images/habit.jpg', '/pdfs/habit.pdf'),
                                                                                                           ('Start With Why', 'Simon Sinek', 'Leadership principles', '2009-01-01', 380.00, 'Business', 'ISBN009', '/images/why.jpg', '/pdfs/why.pdf'),
                                                                                                           ('Sapiens', 'Yuval Noah Harari', 'Human history', '2011-01-01', 550.00, 'History', 'ISBN010', '/images/sapiens.jpg', '/pdfs/sapiens.pdf'),
                                                                                                           ('Homo Deus', 'Yuval Noah Harari', 'Future of humanity', '2015-01-01', 600.00, 'History', 'ISBN011', '/images/homodeus.jpg', '/pdfs/homodeus.pdf'),
                                                                                                           ('The Monk Who Sold His Ferrari', 'Robin Sharma', 'Life lessons', '1997-01-01', 300.00, 'Self-help', 'ISBN012', '/images/monk.jpg', '/pdfs/monk.pdf'),
                                                                                                           ('The 5 AM Club', 'Robin Sharma', 'Morning routine', '2018-01-01', 420.00, 'Self-help', 'ISBN013', '/images/5am.jpg', '/pdfs/5am.pdf'),
                                                                                                           ('Rework', 'Jason Fried', 'Startup advice', '2010-01-01', 370.00, 'Business', 'ISBN014', '/images/rework.jpg', '/pdfs/rework.pdf'),
                                                                                                           ('The Lean Startup', 'Eric Ries', 'Startup methodology', '2011-01-01', 480.00, 'Business', 'ISBN015', '/images/lean.jpg', '/pdfs/lean.pdf'),
                                                                                                           ('Thinking Fast and Slow', 'Daniel Kahneman', 'Psychology of decisions', '2011-01-01', 520.00, 'Psychology', 'ISBN016', '/images/thinking.jpg', '/pdfs/thinking.pdf'),
                                                                                                           ('Can’t Hurt Me', 'David Goggins', 'Motivation and discipline', '2018-01-01', 450.00, 'Motivation', 'ISBN017', '/images/goggins.jpg', '/pdfs/goggins.pdf'),
                                                                                                           ('The Subtle Art of Not Giving a F*ck', 'Mark Manson', 'Life philosophy', '2016-01-01', 430.00, 'Self-help', 'ISBN018', '/images/subtle.jpg', '/pdfs/subtle.pdf'),
                                                                                                           ('The Psychology of Money', 'Morgan Housel', 'Money behavior', '2020-01-01', 390.00, 'Finance', 'ISBN019', '/images/money.jpg', '/pdfs/money.pdf'),
                                                                                                           ('Atomic Focus', 'Anonymous', 'Focus building', '2021-01-01', 350.00, 'Productivity', 'ISBN020', '/images/focus.jpg', '/pdfs/focus.pdf');

DELETE FROM books
WHERE book_id IN (15, 16, 17, 18, 19, 20, 21, 22);
SELECT * FROM books;

