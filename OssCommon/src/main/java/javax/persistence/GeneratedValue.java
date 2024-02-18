package javax.persistence;

import jakarta.persistence.GenerationType;

public @interface GeneratedValue {

	GenerationType strategy();

}
