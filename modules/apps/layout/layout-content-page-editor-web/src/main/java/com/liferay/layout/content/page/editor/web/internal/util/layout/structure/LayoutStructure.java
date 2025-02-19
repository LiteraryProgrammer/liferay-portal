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

package com.liferay.layout.content.page.editor.web.internal.util.layout.structure;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author Víctor Galán
 */
public class LayoutStructure {

	public LayoutStructure(
		Map<String, LayoutStructureItem> layoutStructureItems,
		String mainItemId) {

		_layoutStructureItems = layoutStructureItems;
		_mainItemId = mainItemId;
	}

	public void addFragmentLayoutStructureItem(
		long fragmentEntryLinkId, String parentItemId, int position) {

		addLayoutStructureItem(
			JSONUtil.put("fragmentEntryLinkId", fragmentEntryLinkId),
			String.valueOf(UUID.randomUUID()), "fragment", parentItemId,
			position);
	}

	public void addLayoutStructureItem(
		JSONObject itemConfigJSONObject, String itemId, String itemType,
		String parentItemId, int position) {

		LayoutStructureItem layoutStructureItem = new LayoutStructureItem(
			itemConfigJSONObject, itemId, parentItemId, itemType);

		addLayoutStructureItem(layoutStructureItem, parentItemId, position);
	}

	public void addLayoutStructureItem(
		LayoutStructureItem layoutStructureItem, String parentItemId,
		int position) {

		_layoutStructureItems.put(
			layoutStructureItem.getItemId(), layoutStructureItem);

		if (Validator.isNull(parentItemId)) {
			return;
		}

		LayoutStructureItem parentLayoutStructureItem =
			_layoutStructureItems.get(parentItemId);

		parentLayoutStructureItem.addChildrenItem(
			position, layoutStructureItem.getItemId());
	}

	public void deleteLayoutStructureItem(String itemId) {
		LayoutStructureItem layoutStructureItem = _layoutStructureItems.get(
			itemId);

		LayoutStructureItem parentLayoutStructureItem =
			_layoutStructureItems.get(layoutStructureItem.getParentItemId());

		parentLayoutStructureItem.deleteChildrenItem(itemId);

		_layoutStructureItems.remove(itemId);
	}

	public void duplicateLayoutStructureItem(
		long fragmentEntryLinkId, String itemId) {

		LayoutStructureItem layoutStructureItem = getLayoutStructureItem(
			itemId);

		LayoutStructureItem parentLayoutStructureItem = getLayoutStructureItem(
			layoutStructureItem.getParentItemId());

		List<String> childrenItemIds =
			parentLayoutStructureItem.getChildrenItemIds();

		addLayoutStructureItem(
			JSONUtil.put("fragmentEntryLinkId", fragmentEntryLinkId),
			String.valueOf(UUID.randomUUID()),
			layoutStructureItem.getItemType(),
			layoutStructureItem.getParentItemId(),
			childrenItemIds.indexOf(itemId) + 1);
	}

	public LayoutStructureItem getLayoutStructureItem(String itemId) {
		return _layoutStructureItems.get(itemId);
	}

	public void moveLayoutStructureItem(
		String itemId, String parentItemId, int position) {

		LayoutStructureItem layoutStructureItem = _layoutStructureItems.get(
			itemId);

		LayoutStructureItem oldParentLayoutStructureItem =
			_layoutStructureItems.get(layoutStructureItem.getParentItemId());

		oldParentLayoutStructureItem.deleteChildrenItem(itemId);

		LayoutStructureItem newParentLayoutStructureItem =
			_layoutStructureItems.get(parentItemId);

		newParentLayoutStructureItem.addChildrenItem(position, itemId);
	}

	public JSONObject toJSONObject() {
		JSONObject layoutStructureItemsJSONObject =
			JSONFactoryUtil.createJSONObject();

		for (Map.Entry<String, LayoutStructureItem> entry :
				_layoutStructureItems.entrySet()) {

			LayoutStructureItem layoutStructureItem = entry.getValue();

			layoutStructureItemsJSONObject.put(
				entry.getKey(), layoutStructureItem.toJSONObject());
		}

		return JSONUtil.put(
			"items", layoutStructureItemsJSONObject
		).put(
			"rootItems", JSONUtil.put("main", _mainItemId)
		).put(
			"version", 1
		);
	}

	private final Map<String, LayoutStructureItem> _layoutStructureItems;
	private final String _mainItemId;

}