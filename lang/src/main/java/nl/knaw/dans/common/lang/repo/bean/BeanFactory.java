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
package nl.knaw.dans.common.lang.repo.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeanFactory
{

    private static final Logger logger = LoggerFactory.getLogger(BeanFactory.class);

    private static BeanFactoryDelegator delegator;

    public BeanFactory(BeanFactoryDelegator delegator)
    {
        logger.debug("Created " + this + " with " + delegator);
        BeanFactory.delegator = delegator;
    }

    public static DublinCoreMetadata newDublinCoreMetadata()
    {
        return delegator.newDublinCoreMetadata();
    }

    public static JumpoffDmoMetadata newJumpoffDmoMetadata()
    {
        return delegator.newJumpoffDmoMetadata();
    }

}
