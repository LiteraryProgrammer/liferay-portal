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

package com.liferay.layout.taglib.internal.display.context;

import com.liferay.frontend.taglib.clay.servlet.taglib.display.context.SearchContainerManagementToolbarDisplayContext;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Pavel Savinov
 */
public class LayoutClassedModelUsagesManagementToolbarDisplayContext
	extends SearchContainerManagementToolbarDisplayContext {

	public LayoutClassedModelUsagesManagementToolbarDisplayContext(
		HttpServletRequest httpServletRequest,
		LiferayPortletRequest liferayPortletRequest,
		LiferayPortletResponse liferayPortletResponse,
		SearchContainer searchContainer) {

		super(
			httpServletRequest, liferayPortletRequest, liferayPortletResponse,
			searchContainer);
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #LayoutClassedModelUsagesManagementToolbarDisplayContext(
	 *             HttpServletRequest, LiferayPortletRequest,
	 *             LiferayPortletResponse, SearchContainer)}
	 */
	@Deprecated
	public LayoutClassedModelUsagesManagementToolbarDisplayContext(
		LiferayPortletRequest liferayPortletRequest,
		LiferayPortletResponse liferayPortletResponse,
		HttpServletRequest httpServletRequest,
		SearchContainer searchContainer) {

		this(
			httpServletRequest, liferayPortletRequest, liferayPortletResponse,
			searchContainer);
	}

	@Override
	protected String[] getOrderByKeys() {
		return new String[] {"modified-date"};
	}

}