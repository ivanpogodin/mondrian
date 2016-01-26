/*
// This software is subject to the terms of the Eclipse Public License v1.0
// Agreement, available at the following URL:
// http://www.eclipse.org/legal/epl-v10.html.
// You must accept the terms of that agreement to use this software.
//
// Copyright (C) 2003-2005 Julian Hyde
// Copyright (C) 2005-2016 Pentaho and others
// All Rights Reserved.
*/
package mondrian.rolap;

/**
 * This exception is thrown when a query execution problem is encountered
 * despite successful parsing.
 */
public class QueryException extends RuntimeException {

  /**
   * The version identifier for this Serializable class.
   * Increment only if the <i>serialized</i> form of the
   * class changes.
   */
  private static final long serialVersionUID = 1L;

  public QueryException() {
  }

  public QueryException(String message) {
    super(message);
  }

  public QueryException(Throwable cause) {
    super(cause);
  }

  public QueryException(String message, Throwable cause) {
    super(message, cause);
  }

}
// End QueryException.java