// Start of user code Copyright
/*
 * Copyright (c) 2020 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Simple
 *
 * This file is generated by Lyo Designer (https://www.eclipse.org/lyo/)
 */
// End of user code

package org.eclipse.lyo.oslc.domains.promcode;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

import org.eclipse.lyo.oslc4j.core.annotation.OslcAllowedValue;
import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcMemberProperty;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRdfCollectionType;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRepresentation;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.Representation;
import org.eclipse.lyo.oslc4j.core.model.ValueType;

import org.eclipse.lyo.oslc.domains.promcode.Oslc_promcodeDomainConstants;
import org.eclipse.lyo.oslc.domains.promcode.Oslc_promcodeDomainConstants;
import org.eclipse.lyo.oslc.domains.promcode.IArtifact;
import org.eclipse.lyo.oslc.domains.promcode.IIssue;
import org.eclipse.lyo.oslc.domains.promcode.IProject;
import org.eclipse.lyo.oslc.domains.promcode.IRisk;
import org.eclipse.lyo.oslc.domains.promcode.IScopeItem;
import org.eclipse.lyo.oslc.domains.promcode.IWorkItem;
// Start of user code imports
// End of user code

@OslcNamespace(Oslc_promcodeDomainConstants.ISSUECOLLECTION_NAMESPACE)
@OslcName(Oslc_promcodeDomainConstants.ISSUECOLLECTION_LOCALNAME)
@OslcResourceShape(title = "IssueCollection Shape", description = "An IssueCollection is a resource which is a subclass of ManagedItemCollection. An IssueCollection only collects Issues. All of Issues raised in a project should be collected by an IssueCollection.", describes = Oslc_promcodeDomainConstants.ISSUECOLLECTION_TYPE)
public interface IIssueCollection
{

    public void addOslc_promcodeCollects(final Link collects );

    @OslcName("belongsTo")
    @OslcPropertyDefinition(Oslc_promcodeDomainConstants.PROMCODE_NAMSPACE + "belongsTo")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Oslc_promcodeDomainConstants.PROJECT_TYPE})
    @OslcReadOnly(false)
    public Link getOslc_promcodeBelongsTo();

    @OslcName("collects")
    @OslcPropertyDefinition(Oslc_promcodeDomainConstants.PROMCODE_NAMSPACE + "collects")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Oslc_promcodeDomainConstants.ISSUE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOslc_promcodeCollects();


    public void setOslc_promcodeBelongsTo(final Link belongsTo );
    public void setOslc_promcodeCollects(final Set<Link> collects );
}

