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
package nl.knaw.dans.common.lang.user;

/** Use this when catching exceptions that are result of programming errors
 * and should be handled as runtime exceptions
 */
public class InternalErrorException extends RuntimeException
{
    private static final long serialVersionUID = -3027043667083250893L;

    public InternalErrorException()
    {
    }

    public InternalErrorException(String message)
    {
        super(message);
    }

    public InternalErrorException(Throwable cause)
    {
        super(cause);
    }

    public InternalErrorException(String message, Throwable cause)
    {
        super(message, cause);
    }

}
