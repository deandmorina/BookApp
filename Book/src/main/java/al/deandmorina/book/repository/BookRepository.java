package al.deandmorina.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository<Book> extends JpaRepository<Book, Long> {
}
