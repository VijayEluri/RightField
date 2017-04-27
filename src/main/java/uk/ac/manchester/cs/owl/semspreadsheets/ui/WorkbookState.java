/*******************************************************************************
 * Copyright (c) 2009, 2017, The University of Manchester
 *
 * Licensed under the New BSD License.
 * Please see LICENSE file that is distributed with the source code
 *  
 *******************************************************************************/
package uk.ac.manchester.cs.owl.semspreadsheets.ui;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Stores the state of the workbook
 * 
 * @author Stuart Owen
 *
 */
public class WorkbookState {
	
	private static Logger logger = LogManager.getLogger();
	
	private boolean changesSaved = true;

	public boolean isChangesSaved() {
		return changesSaved;
	}

	public void changesSaved() {
		this.changesSaved = true;
		logger.debug("Changes saved");
	}
	
	public void changesUnsaved() {				
		this.changesSaved = false;
		logger.debug("Unsaved changes");
	}

}
