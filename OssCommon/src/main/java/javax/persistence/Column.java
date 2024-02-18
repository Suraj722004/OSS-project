package javax.persistence;

public @interface Column {

	int length();

	boolean nullable();

	boolean unique();

}
