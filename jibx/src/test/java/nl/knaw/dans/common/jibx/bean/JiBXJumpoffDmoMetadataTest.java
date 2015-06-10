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
package nl.knaw.dans.common.jibx.bean;

import static org.junit.Assert.assertEquals;
import nl.knaw.dans.common.jibx.JiBXObjectFactory;
import nl.knaw.dans.common.lang.repo.bean.JumpoffDmoMetadata.MarkupVersionID;
import nl.knaw.dans.common.lang.test.Tester;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JiBXJumpoffDmoMetadataTest
{
    private static final Logger logger = LoggerFactory.getLogger(JiBXJumpoffDmoMetadataTest.class);

    private boolean verbose = Tester.isVerbose();

    @Test
    public void serializeDeserializeEmpty() throws Exception
    {
        JiBXJumpoffDmoMetadata jomd = new JiBXJumpoffDmoMetadata();
        //if (verbose)
        logger.debug("\n" + jomd.asXMLString(4) + "\n");

        JiBXJumpoffDmoMetadata jomd2 = (JiBXJumpoffDmoMetadata) JiBXObjectFactory.unmarshal(JiBXJumpoffDmoMetadata.class, jomd.asObjectXML());
        assertEquals(jomd.asXMLString(), jomd2.asXMLString());
    }

    @Test
    public void serializeDeserializeFull() throws Exception
    {
        JiBXJumpoffDmoMetadata jomd = new JiBXJumpoffDmoMetadata();
        jomd.setDefaultMarkupVersionID(MarkupVersionID.HTML_MU);
        jomd.getHtmlMarkupMetadata().setLastEditedBy("html-author-id");
        jomd.getTextMarkupMetadata().setLastEditedBy("text-author-id");

        //if (verbose)
        logger.debug("\n" + jomd.asXMLString(4) + "\n");

        JiBXJumpoffDmoMetadata jomd2 = (JiBXJumpoffDmoMetadata) JiBXObjectFactory.unmarshal(JiBXJumpoffDmoMetadata.class, jomd.asObjectXML());
        assertEquals(jomd.asXMLString(), jomd2.asXMLString());
        assertEquals(jomd2.getHtmlMarkupMetadata(), jomd2.getDefaultMarkupMetadata());
    }

}
