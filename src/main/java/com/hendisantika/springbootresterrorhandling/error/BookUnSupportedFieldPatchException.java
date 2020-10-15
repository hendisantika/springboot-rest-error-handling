package com.hendisantika.springbootresterrorhandling.error;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-rest-error-handling
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/10/20
 * Time: 17.35
 */
public class BookUnSupportedFieldPatchException extends RuntimeException {

    public BookUnSupportedFieldPatchException(Set<String> keys) {
        super("Field " + keys.toString() + " update is not allow.");
    }
}
