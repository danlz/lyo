// Start of user code Copyright
/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *  
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *     Russell Boykin       - initial API and implementation
 *     Alberto Giammaria    - initial API and implementation
 *     Chris Peters         - initial API and implementation
 *     Gianluca Bernardini  - initial API and implementation
 *     Michael Fiedler      - Bugzilla adpater implementations
 *     Jad El-khoury        - initial implementation of code generator (https://bugs.eclipse.org/bugs/show_bug.cgi?id=422448)
 * 
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/
// End of user code

package org.eclipse.lyo.store.resources;

import org.eclipse.lyo.oslc4j.core.model.OslcConstants;


// Start of user code imports
// End of user code

public interface Nsp1DomainConstants
{
    // Start of user code user constants
    // End of user code

    public static String TESTDOMAIN_DOMAIN = "http://your.organisation.test/nsp1#";
    public static String TESTDOMAIN_NAMSPACE = "http://your.organisation.test/nsp1#";
    public static String TESTDOMAIN_NAMSPACE_PREFIX = "nsp1";

    public static String BLANKRESOURCE_PATH = "blankResource";
    public static String BLANKRESOURCE_NAMESPACE = TESTDOMAIN_NAMSPACE; //namespace of the rdfs:class the resource describes
    public static String BLANKRESOURCE_LOCALNAME = "BlankResource"; //localName of the rdfs:class the resource describes
    public static String BLANKRESOURCE_TYPE = BLANKRESOURCE_NAMESPACE + BLANKRESOURCE_LOCALNAME; //fullname of the rdfs:class the resource describes
    public static String WITHBLANKRESOURCE_PATH = "withBlankResource";
    public static String WITHBLANKRESOURCE_NAMESPACE = TESTDOMAIN_NAMSPACE; //namespace of the rdfs:class the resource describes
    public static String WITHBLANKRESOURCE_LOCALNAME = "WithBlankResource"; //localName of the rdfs:class the resource describes
    public static String WITHBLANKRESOURCE_TYPE = WITHBLANKRESOURCE_NAMESPACE + WITHBLANKRESOURCE_LOCALNAME; //fullname of the rdfs:class the resource describes
    public static String WITHTWODEPTHBLANKRESOURCE_PATH = "withTwoDepthBlankResource";
    public static String WITHTWODEPTHBLANKRESOURCE_NAMESPACE = TESTDOMAIN_NAMSPACE; //namespace of the rdfs:class the resource describes
    public static String WITHTWODEPTHBLANKRESOURCE_LOCALNAME = "WithTwoDepthBlankResource"; //localName of the rdfs:class the resource describes
    public static String WITHTWODEPTHBLANKRESOURCE_TYPE = WITHTWODEPTHBLANKRESOURCE_NAMESPACE + WITHTWODEPTHBLANKRESOURCE_LOCALNAME; //fullname of the rdfs:class the resource describes
}
