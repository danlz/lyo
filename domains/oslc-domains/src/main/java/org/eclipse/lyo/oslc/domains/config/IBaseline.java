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

package org.eclipse.lyo.oslc.domains.config;

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

import org.eclipse.lyo.oslc.domains.config.Oslc_configDomainConstants;
import org.eclipse.lyo.oslc.domains.config.Oslc_configDomainConstants;
import org.eclipse.lyo.oslc.domains.FoafDomainConstants;
import org.eclipse.lyo.oslc.domains.ProvVocabularyConstants;
import org.eclipse.lyo.oslc.domains.IAgent;
import org.eclipse.lyo.oslc.domains.config.IBaseline;
import org.eclipse.lyo.oslc.domains.config.IComponent;
import org.eclipse.lyo.oslc.domains.config.IConfiguration;
import org.eclipse.lyo.oslc.domains.config.IContribution;
import org.eclipse.lyo.oslc.domains.IPerson;
import org.eclipse.lyo.oslc.domains.config.ISelections;
// Start of user code imports
// End of user code

@OslcNamespace(Oslc_configDomainConstants.BASELINE_NAMESPACE)
@OslcName(Oslc_configDomainConstants.BASELINE_LOCALNAME)
@OslcResourceShape(title = "The shape of a baseline. Properties of a baseline defined in this specification must be read-only unless stated otherwise", description = "", describes = Oslc_configDomainConstants.BASELINE_TYPE)
public interface IBaseline
{

    public void addCommitter(final Link committer );
    public void addWasDerivedFrom(final Link wasDerivedFrom );

    @OslcName("baselineOfStream")
    @OslcPropertyDefinition(Oslc_configDomainConstants.CONFIGURATION_MANAGEMENT_NAMSPACE + "baselineOfStream")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Oslc_configDomainConstants.CONFIGURATION_TYPE})
    @OslcReadOnly(false)
    public Link getBaselineOfStream();

    @OslcName("committed")
    @OslcPropertyDefinition(Oslc_configDomainConstants.CONFIGURATION_MANAGEMENT_NAMSPACE + "committed")
    @OslcDescription("Date and time this version resource was checked in. Absent for mutable (checked out) versions.")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.DateTime)
    @OslcReadOnly(false)
    public Date getCommitted();

    @OslcName("committer")
    @OslcPropertyDefinition(Oslc_configDomainConstants.CONFIGURATION_MANAGEMENT_NAMSPACE + "committer")
    @OslcDescription("The entity that checked in this version.")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({FoafDomainConstants.PERSON_TYPE, FoafDomainConstants.AGENT_TYPE})
    @OslcReadOnly(true)
    public Set<Link> getCommitter();

    @OslcName("previousBaseline")
    @OslcPropertyDefinition(Oslc_configDomainConstants.CONFIGURATION_MANAGEMENT_NAMSPACE + "previousBaseline")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Oslc_configDomainConstants.BASELINE_TYPE})
    @OslcReadOnly(false)
    public Link getPreviousBaseline();

    @OslcName("wasDerivedFrom")
    @OslcPropertyDefinition(ProvVocabularyConstants.PROVENANCE_NAMSPACE + "wasDerivedFrom")
    @OslcDescription("")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRepresentation(Representation.Reference)
    @OslcRange({Oslc_configDomainConstants.CONFIGURATION_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getWasDerivedFrom();


    public void setBaselineOfStream(final Link baselineOfStream );
    public void setCommitted(final Date committed );
    public void setCommitter(final Set<Link> committer );
    public void setPreviousBaseline(final Link previousBaseline );
    public void setWasDerivedFrom(final Set<Link> wasDerivedFrom );
}

