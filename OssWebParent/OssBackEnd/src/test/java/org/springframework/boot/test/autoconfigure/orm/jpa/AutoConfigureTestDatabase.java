package org.springframework.boot.test.autoconfigure.orm.jpa;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

public @interface AutoConfigureTestDatabase {

	Replace replace();

}
