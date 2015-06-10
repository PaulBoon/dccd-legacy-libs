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
package nl.knaw.dans.common.lang.search;

/**
 * A sort field is a field that contains a sort order as a value. 
 * Additionally a sort type can be set. The default sort type is 
 * BY_VALUE.
 *
 * @author lobo
 */
public interface SortField extends Field<SortOrder>
{
    void setSortType(SortType sortType);

    SortType getSortType();
}