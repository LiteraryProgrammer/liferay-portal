/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.segments.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.segments.model.SegmentsEntryRel;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for SegmentsEntryRel. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Eduardo Garcia
 * @see SegmentsEntryRelServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface SegmentsEntryRelService extends BaseService {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SegmentsEntryRelServiceUtil} to access the segments entry rel remote service. Add custom service methods to <code>com.liferay.segments.service.impl.SegmentsEntryRelServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 SegmentsEntryService#addSegmentsEntryClassPKs(
	 long, long[], ServiceContext)}
	 */
	@Deprecated
	public SegmentsEntryRel addSegmentsEntryRel(
			long segmentsEntryId, long classNameId, long classPK,
			ServiceContext serviceContext)
		throws PortalException;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 SegmentsEntryService#deleteSegmentsEntryClassPKs(
	 long, long[])}
	 */
	@Deprecated
	public void deleteSegmentsEntryRel(long segmentsEntryRelId)
		throws PortalException;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 SegmentsEntryService#deleteSegmentsEntryClassPKs(
	 long, long[])}
	 */
	@Deprecated
	public void deleteSegmentsEntryRel(
			long segmentsEntryId, long classNameId, long classPK)
		throws PortalException;

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SegmentsEntryRel> getSegmentsEntryRels(long segmentsEntryId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SegmentsEntryRel> getSegmentsEntryRels(
			long segmentsEntryId, int start, int end,
			OrderByComparator<SegmentsEntryRel> orderByComparator)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<SegmentsEntryRel> getSegmentsEntryRels(
			long groupId, long classNameId, long classPK)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getSegmentsEntryRelsCount(long segmentsEntryId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getSegmentsEntryRelsCount(
			long groupId, long classNameId, long classPK)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasSegmentsEntryRel(
		long segmentsEntryId, long classNameId, long classPK);

}