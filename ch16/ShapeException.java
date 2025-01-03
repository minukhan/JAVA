package chapter16;

/* This page is part of the Game of Life source code */

/**
 * Copyright 1996-2004 Edwin Martin <edwin@bitstorm.nl>
 * @author Edwin Martin
 */


/**
 * Exception for shapes (too big, not found...).
 *
 * @author Edwin Martin
 */
public class ShapeException extends Exception {
    /**
     * Constructs a ShapeException.
     */
    public ShapeException() {
        super();
    }
    /**
     * Constructs a ShapeException with a description.
     */
    public ShapeException( String s ) {
        super( s );
    }
}