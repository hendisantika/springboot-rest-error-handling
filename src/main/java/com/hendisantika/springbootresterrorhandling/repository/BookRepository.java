package com.hendisantika.springbootresterrorhandling.repository;

import com.hendisantika.springbootresterrorhandling.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-rest-error-handling
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/10/20
 * Time: 17.32
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}
