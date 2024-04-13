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

import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
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
import org.eclipse.lyo.oslc4j.core.model.ResourceShape;
import org.eclipse.lyo.oslc4j.core.model.ResourceShapeFactory;

import org.eclipse.lyo.oslc.domains.promcode.Oslc_promcodeDomainConstants;
import org.eclipse.lyo.oslc.domains.promcode.ManagedItem;
import org.eclipse.lyo.oslc.domains.promcode.Oslc_promcodeDomainConstants;
import org.eclipse.lyo.oslc.domains.promcode.Artifact;
import org.eclipse.lyo.oslc.domains.promcode.ScopeItem;
import org.eclipse.lyo.oslc.domains.promcode.WorkItem;
// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(Oslc_promcodeDomainConstants.WORKITEM_NAMESPACE)
@OslcName(Oslc_promcodeDomainConstants.WORKITEM_LOCALNAME)
@OslcResourceShape(title = "WorkItem Shape", description = "A work item describes work to be performed in a project delivery contract. It adds detail to the description of work that is described by a scope item. These details typically include cost, schedule, and resource requirements. The set of all work items in a project form a work breakdown structure.", describes = Oslc_promcodeDomainConstants.WORKITEM_TYPE)
public class WorkItem
    extends ManagedItem
    implements IWorkItem
{
    // Start of user code attributeAnnotation:actualEndDate
    // End of user code
    private Date actualEndDate;
    // Start of user code attributeAnnotation:actualStartDate
    // End of user code
    private Date actualStartDate;
    // Start of user code attributeAnnotation:isPartOf
    // End of user code
    private Link isPartOf;
    // Start of user code attributeAnnotation:plannedEndDate
    // End of user code
    private Date plannedEndDate;
    // Start of user code attributeAnnotation:plannedStartDate
    // End of user code
    private Date plannedStartDate;
    // Start of user code attributeAnnotation:representedBy
    // End of user code
    private Link representedBy;
    // Start of user code attributeAnnotation:requiredBy
    // End of user code
    private Set<Link> requiredBy = new HashSet<Link>();
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public WorkItem()
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public WorkItem(final URI about)
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        Oslc_promcodeDomainConstants.WORKITEM_PATH,
        WorkItem.class);
    }
    
    
    public String toString()
    {
        return toString(false);
    }
    
    public String toString(boolean asLocalResource)
    {
        String result = "";
        // Start of user code toString_init
        // End of user code
    
        if (asLocalResource) {
            result = result + "{a Local WorkItem Resource} - update WorkItem.toString() to present resource as desired.";
            // Start of user code toString_bodyForLocalResource
            // End of user code
        }
        else {
            result = String.valueOf(getAbout());
        }
    
        // Start of user code toString_finalize
        // End of user code
    
        return result;
    }
    
    public void addRequiredBy(final Link requiredBy)
    {
        this.requiredBy.add(requiredBy);
    }
    
    
    // Start of user code getterAnnotation:actualEndDate
    // End of user code
    @OslcName("actualEndDate")
    @OslcPropertyDefinition(Oslc_promcodeDomainConstants.PROMCODE_NAMSPACE + "actualEndDate")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.DateTime)
    @OslcReadOnly(false)
    public Date getActualEndDate()
    {
        // Start of user code getterInit:actualEndDate
        // End of user code
        return actualEndDate;
    }

    // Start of user code getterAnnotation:actualStartDate
    // End of user code
    @OslcName("actualStartDate")
    @OslcPropertyDefinition(Oslc_promcodeDomainConstants.PROMCODE_NAMSPACE + "actualStartDate")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.DateTime)
    @OslcReadOnly(false)
    public Date getActualStartDate()
    {
        // Start of user code getterInit:actualStartDate
        // End of user code
        return actualStartDate;
    }

    // Start of user code getterAnnotation:isPartOf
    // End of user code
    @OslcName("isPartOf")
    @OslcPropertyDefinition(Oslc_promcodeDomainConstants.PROMCODE_NAMSPACE + "isPartOf")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Oslc_promcodeDomainConstants.WORKITEM_TYPE})
    @OslcReadOnly(false)
    public Link getIsPartOf()
    {
        // Start of user code getterInit:isPartOf
        // End of user code
        return isPartOf;
    }

    // Start of user code getterAnnotation:plannedEndDate
    // End of user code
    @OslcName("plannedEndDate")
    @OslcPropertyDefinition(Oslc_promcodeDomainConstants.PROMCODE_NAMSPACE + "plannedEndDate")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.DateTime)
    @OslcReadOnly(false)
    public Date getPlannedEndDate()
    {
        // Start of user code getterInit:plannedEndDate
        // End of user code
        return plannedEndDate;
    }

    // Start of user code getterAnnotation:plannedStartDate
    // End of user code
    @OslcName("plannedStartDate")
    @OslcPropertyDefinition(Oslc_promcodeDomainConstants.PROMCODE_NAMSPACE + "plannedStartDate")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.DateTime)
    @OslcReadOnly(false)
    public Date getPlannedStartDate()
    {
        // Start of user code getterInit:plannedStartDate
        // End of user code
        return plannedStartDate;
    }

    // Start of user code getterAnnotation:representedBy
    // End of user code
    @OslcName("representedBy")
    @OslcPropertyDefinition(Oslc_promcodeDomainConstants.PROMCODE_NAMSPACE + "representedBy")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcReadOnly(false)
    public Link getRepresentedBy()
    {
        // Start of user code getterInit:representedBy
        // End of user code
        return representedBy;
    }

    // Start of user code getterAnnotation:requiredBy
    // End of user code
    @OslcName("requiredBy")
    @OslcPropertyDefinition(Oslc_promcodeDomainConstants.PROMCODE_NAMSPACE + "requiredBy")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Oslc_promcodeDomainConstants.SCOPEITEM_TYPE, Oslc_promcodeDomainConstants.ARTIFACT_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getRequiredBy()
    {
        // Start of user code getterInit:requiredBy
        // End of user code
        return requiredBy;
    }

    // Start of user code setterAnnotation:actualEndDate
    // End of user code
    public void setActualEndDate(final Date actualEndDate )
    {
        // Start of user code setterInit:actualEndDate
        // End of user code
        this.actualEndDate = actualEndDate;
        // Start of user code setterFinalize:actualEndDate
        // End of user code
    }

    // Start of user code setterAnnotation:actualStartDate
    // End of user code
    public void setActualStartDate(final Date actualStartDate )
    {
        // Start of user code setterInit:actualStartDate
        // End of user code
        this.actualStartDate = actualStartDate;
        // Start of user code setterFinalize:actualStartDate
        // End of user code
    }

    // Start of user code setterAnnotation:isPartOf
    // End of user code
    public void setIsPartOf(final Link isPartOf )
    {
        // Start of user code setterInit:isPartOf
        // End of user code
        this.isPartOf = isPartOf;
        // Start of user code setterFinalize:isPartOf
        // End of user code
    }

    // Start of user code setterAnnotation:plannedEndDate
    // End of user code
    public void setPlannedEndDate(final Date plannedEndDate )
    {
        // Start of user code setterInit:plannedEndDate
        // End of user code
        this.plannedEndDate = plannedEndDate;
        // Start of user code setterFinalize:plannedEndDate
        // End of user code
    }

    // Start of user code setterAnnotation:plannedStartDate
    // End of user code
    public void setPlannedStartDate(final Date plannedStartDate )
    {
        // Start of user code setterInit:plannedStartDate
        // End of user code
        this.plannedStartDate = plannedStartDate;
        // Start of user code setterFinalize:plannedStartDate
        // End of user code
    }

    // Start of user code setterAnnotation:representedBy
    // End of user code
    public void setRepresentedBy(final Link representedBy )
    {
        // Start of user code setterInit:representedBy
        // End of user code
        this.representedBy = representedBy;
        // Start of user code setterFinalize:representedBy
        // End of user code
    }

    // Start of user code setterAnnotation:requiredBy
    // End of user code
    public void setRequiredBy(final Set<Link> requiredBy )
    {
        // Start of user code setterInit:requiredBy
        // End of user code
        this.requiredBy.clear();
        if (requiredBy != null)
        {
            this.requiredBy.addAll(requiredBy);
        }
        // Start of user code setterFinalize:requiredBy
        // End of user code
    }

}
