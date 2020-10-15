package com.hendisantika.springbootresterrorhandling.controller;

import com.hendisantika.springbootresterrorhandling.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-rest-error-handling
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/10/20
 * Time: 17.41
 */
@RestController
@Validated
public class BookController {

    @Autowired
    private BookRepository repository;
}
