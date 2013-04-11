/*******************************************************************************
 * Copyright (c) 2009-2013, University of Manchester
 *  
 * Licensed under the New BSD License.
 * Please see LICENSE file that is distributed with the source code
 ******************************************************************************/

package uk.ac.manchester.cs.owl.semspreadsheets.model.skos;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;

public class SKOSDetector {
	
	//determines whether the ontology passed is a SKOS document
	public static boolean isSKOS(OWLOntology ontology) {
		return ontology.containsClassInSignature(IRI.create("http://www.w3.org/2004/02/skos/core#Concept"));
	}
}