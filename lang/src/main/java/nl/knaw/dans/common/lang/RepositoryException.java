/*******************************************************************************
 * Copyright 2015 DANS - Data Archiving and Networked Services
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package nl.knaw.dans.common.lang;

/**
 * Signals an exception while opening, using or closing a repository.
 * 
 * @author ecco Sep 4, 2009
 */
public class RepositoryException extends Exception
{

    private static final long serialVersionUID = 7465810880323799020L;

    // CHECKSTYLE: OFF 

    public RepositoryException()
    {
    }

    public RepositoryException(final String message)
    {
        super(message);
    }

    public RepositoryException(final Throwable cause)
    {
        super(cause);
    }

    public RepositoryException(final String message, final Throwable cause)
    {
        super(message, cause);
    }

}
