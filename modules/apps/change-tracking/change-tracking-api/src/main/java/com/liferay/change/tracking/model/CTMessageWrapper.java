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

package com.liferay.change.tracking.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CTMessage}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CTMessage
 * @generated
 */
public class CTMessageWrapper
	extends BaseModelWrapper<CTMessage>
	implements CTMessage, ModelWrapper<CTMessage> {

	public CTMessageWrapper(CTMessage ctMessage) {
		super(ctMessage);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mvccVersion", getMvccVersion());
		attributes.put("ctMessageId", getCtMessageId());
		attributes.put("ctCollectionId", getCtCollectionId());
		attributes.put("messageContent", getMessageContent());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long mvccVersion = (Long)attributes.get("mvccVersion");

		if (mvccVersion != null) {
			setMvccVersion(mvccVersion);
		}

		Long ctMessageId = (Long)attributes.get("ctMessageId");

		if (ctMessageId != null) {
			setCtMessageId(ctMessageId);
		}

		Long ctCollectionId = (Long)attributes.get("ctCollectionId");

		if (ctCollectionId != null) {
			setCtCollectionId(ctCollectionId);
		}

		String messageContent = (String)attributes.get("messageContent");

		if (messageContent != null) {
			setMessageContent(messageContent);
		}
	}

	/**
	 * Returns the ct collection ID of this ct message.
	 *
	 * @return the ct collection ID of this ct message
	 */
	@Override
	public long getCtCollectionId() {
		return model.getCtCollectionId();
	}

	/**
	 * Returns the ct message ID of this ct message.
	 *
	 * @return the ct message ID of this ct message
	 */
	@Override
	public long getCtMessageId() {
		return model.getCtMessageId();
	}

	/**
	 * Returns the message content of this ct message.
	 *
	 * @return the message content of this ct message
	 */
	@Override
	public String getMessageContent() {
		return model.getMessageContent();
	}

	/**
	 * Returns the mvcc version of this ct message.
	 *
	 * @return the mvcc version of this ct message
	 */
	@Override
	public long getMvccVersion() {
		return model.getMvccVersion();
	}

	/**
	 * Returns the primary key of this ct message.
	 *
	 * @return the primary key of this ct message
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a ct message model instance should use the <code>CTMessage</code> interface instead.
	 */
	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the ct collection ID of this ct message.
	 *
	 * @param ctCollectionId the ct collection ID of this ct message
	 */
	@Override
	public void setCtCollectionId(long ctCollectionId) {
		model.setCtCollectionId(ctCollectionId);
	}

	/**
	 * Sets the ct message ID of this ct message.
	 *
	 * @param ctMessageId the ct message ID of this ct message
	 */
	@Override
	public void setCtMessageId(long ctMessageId) {
		model.setCtMessageId(ctMessageId);
	}

	/**
	 * Sets the message content of this ct message.
	 *
	 * @param messageContent the message content of this ct message
	 */
	@Override
	public void setMessageContent(String messageContent) {
		model.setMessageContent(messageContent);
	}

	/**
	 * Sets the mvcc version of this ct message.
	 *
	 * @param mvccVersion the mvcc version of this ct message
	 */
	@Override
	public void setMvccVersion(long mvccVersion) {
		model.setMvccVersion(mvccVersion);
	}

	/**
	 * Sets the primary key of this ct message.
	 *
	 * @param primaryKey the primary key of this ct message
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected CTMessageWrapper wrap(CTMessage ctMessage) {
		return new CTMessageWrapper(ctMessage);
	}

}