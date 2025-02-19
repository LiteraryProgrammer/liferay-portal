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

package com.liferay.portal.tools.service.builder.test.model;

import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.math.BigDecimal;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the BigDecimalEntry service. Represents a row in the &quot;BigDecimalEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.portal.tools.service.builder.test.model.impl.BigDecimalEntryModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.portal.tools.service.builder.test.model.impl.BigDecimalEntryImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BigDecimalEntry
 * @generated
 */
@ProviderType
public interface BigDecimalEntryModel
	extends BaseModel<BigDecimalEntry>, ShardedModel {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a big decimal entry model instance should use the {@link BigDecimalEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this big decimal entry.
	 *
	 * @return the primary key of this big decimal entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this big decimal entry.
	 *
	 * @param primaryKey the primary key of this big decimal entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the big decimal entry ID of this big decimal entry.
	 *
	 * @return the big decimal entry ID of this big decimal entry
	 */
	public long getBigDecimalEntryId();

	/**
	 * Sets the big decimal entry ID of this big decimal entry.
	 *
	 * @param bigDecimalEntryId the big decimal entry ID of this big decimal entry
	 */
	public void setBigDecimalEntryId(long bigDecimalEntryId);

	/**
	 * Returns the company ID of this big decimal entry.
	 *
	 * @return the company ID of this big decimal entry
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this big decimal entry.
	 *
	 * @param companyId the company ID of this big decimal entry
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the big decimal value of this big decimal entry.
	 *
	 * @return the big decimal value of this big decimal entry
	 */
	public BigDecimal getBigDecimalValue();

	/**
	 * Sets the big decimal value of this big decimal entry.
	 *
	 * @param bigDecimalValue the big decimal value of this big decimal entry
	 */
	public void setBigDecimalValue(BigDecimal bigDecimalValue);

}