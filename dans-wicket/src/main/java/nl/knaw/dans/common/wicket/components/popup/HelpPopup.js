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
/*
 * Create a DANS-namespace
 */
var DANS = function () {};

DANS.createHelpPopup = function(anchor) {
	var popupButton = new YAHOO.widget.Button('popupButton'+anchor);
	var popupDialog = new YAHOO.widget.Dialog('popupDialog'+anchor, { 
		xy:[500,10], 
		visible:false,
		close: true,
		constraintoviewport: true,
		modal: true });
	popupDialog.render();
	
	YAHOO.util.Event.addListener('popupButton'+anchor, 'click', showPopup, popupButton, true);
	
	function showPopup () {
		document.getElementById('popupDialog'+anchor).style.display = 'block';
		popupDialog.show();
	}
}

