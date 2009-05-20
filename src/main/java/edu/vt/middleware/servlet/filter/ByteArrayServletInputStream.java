/*
  $Id$

  Copyright (C) 2009 Virginia Tech.
  All rights reserved.

  SEE LICENSE FOR MORE INFORMATION

  Author:  Middleware
  Email:   middleware@vt.edu
  Version: $Revision$
  Updated: $Date$
*/
package edu.vt.middleware.servlet.filter;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.servlet.ServletInputStream;

/**
 * Implementation of {@link ServletInputStream} that is backed by a
 * {@link ByteArrayInputStream}.
 *
 * @author Middleware
 * @version $Revision$
 *
 */
public class ByteArrayServletInputStream extends ServletInputStream
{

  /** Wrapped byte array input stream */
  private ByteArrayInputStream in;


  /**
   * Creates a new instance using the given buffer as the source of bytes
   * for read operations.
   *
   * @param buffer Source of bytes.
   */
  public ByteArrayServletInputStream(final byte[] buffer)
  {
    in = new ByteArrayInputStream(buffer);
  }


  /** {@inheritDoc} */
  public int read()
    throws IOException
  {
    return in.read();
  }


  /** {@inheritDoc} */
  @Override
  public int read(final byte[] b)
    throws IOException
  {
    return in.read(b);
  }


  /** {@inheritDoc} */
  @Override
  public int read(final byte[] b, final int off, final int len)
    throws IOException
  {
    return in.read(b, off, len);
  }
}
