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

package com.liferay.portal.kernel.model;

import com.liferay.portal.kernel.bean.AutoEscape;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the CompanyInfo service. Represents a row in the &quot;CompanyInfo&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.portal.model.impl.CompanyInfoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.portal.model.impl.CompanyInfoImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanyInfo
 * @generated
 */
@ProviderType
public interface CompanyInfoModel
	extends BaseModel<CompanyInfo>, MVCCModel, ShardedModel {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a company info model instance should use the {@link CompanyInfo} interface instead.
	 */

	/**
	 * Returns the primary key of this company info.
	 *
	 * @return the primary key of this company info
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this company info.
	 *
	 * @param primaryKey the primary key of this company info
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the mvcc version of this company info.
	 *
	 * @return the mvcc version of this company info
	 */
	@Override
	public long getMvccVersion();

	/**
	 * Sets the mvcc version of this company info.
	 *
	 * @param mvccVersion the mvcc version of this company info
	 */
	@Override
	public void setMvccVersion(long mvccVersion);

	/**
	 * Returns the company info ID of this company info.
	 *
	 * @return the company info ID of this company info
	 */
	public long getCompanyInfoId();

	/**
	 * Sets the company info ID of this company info.
	 *
	 * @param companyInfoId the company info ID of this company info
	 */
	public void setCompanyInfoId(long companyInfoId);

	/**
	 * Returns the company ID of this company info.
	 *
	 * @return the company ID of this company info
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this company info.
	 *
	 * @param companyId the company ID of this company info
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the key of this company info.
	 *
	 * @return the key of this company info
	 */
	@AutoEscape
	public String getKey();

	/**
	 * Sets the key of this company info.
	 *
	 * @param key the key of this company info
	 */
	public void setKey(String key);

}