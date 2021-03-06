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
package nl.knaw.dans.common.wicket.components.editablepanel;

import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;

import wicket.contrib.tinymce.TinyMceBehavior;
import wicket.contrib.tinymce.settings.TinyMCESettings;

@SuppressWarnings("serial")
public class EditPanel extends Panel
{
    public EditPanel(String id, IModel<String> model, TinyMCESettings settings)
    {
        super(id, model);
        final TextArea<String> textArea = new TextArea<String>("text", model);

        if (settings != null)
        {
            textArea.add(new TinyMceBehavior(settings));
        }

        textArea.setEscapeModelStrings(false);
        add(textArea);
    }
}
