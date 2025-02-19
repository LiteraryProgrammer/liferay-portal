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

package com.liferay.talend.properties.parameters;

import static org.talend.daikon.properties.property.PropertyFactory.newProperty;

import com.liferay.talend.common.oas.OASParameter;
import com.liferay.talend.common.util.StringUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.apache.commons.lang3.reflect.TypeLiteral;

import org.talend.components.api.properties.ComponentPropertiesImpl;
import org.talend.daikon.properties.presentation.Form;
import org.talend.daikon.properties.property.Property;

/**
 * @author Ivica Cardic
 * @author Igor Beslic
 */
public class RequestParameterProperties extends ComponentPropertiesImpl {

	public RequestParameterProperties(String name) {
		super(name);
	}

	public void addParameters(List<OASParameter> oasParameters) {
		if (oasParameters.isEmpty()) {
			return;
		}

		List<String> parameterLocations = parameterLocationColumn.getValue();
		List<String> parameterNames = parameterNameColumn.getValue();
		List<String> parameterValues = parameterValueColumn.getValue();

		for (OASParameter oasParameter : oasParameters) {
			String name = oasParameter.getName();

			if (Objects.equals(name, "page") ||
				Objects.equals(name, "pageSize")) {

				continue;
			}

			if (oasParameter.isRequired() || oasParameter.isLocationPath()) {
				name = name + "*";
			}

			parameterNames.add(name);

			OASParameter.Location location = oasParameter.getLocation();

			parameterLocations.add(StringUtil.toLowerCase(location.toString()));

			parameterValues.add("");
		}
	}

	public List<RequestParameter> getRequestParameters() {
		if (isEmpty()) {
			return Collections.emptyList();
		}

		List<String> parameterLocations = parameterLocationColumn.getValue();
		List<String> parameterNames = parameterNameColumn.getValue();
		List<String> parameterValues = parameterValueColumn.getValue();

		List<RequestParameter> requestParameters = new ArrayList<>();

		for (int i = 0; i < parameterLocations.size(); i++) {
			String name = parameterNames.get(i);

			if (Objects.equals(name, "includeFieldsParameters")) {
				requestParameters.addAll(
					_toRequestParameters(parameterValues.get(i)));

				continue;
			}

			requestParameters.add(
				new RequestParameter(
					parameterLocations.get(i), name, parameterValues.get(i)));
		}

		return requestParameters;
	}

	public boolean isEmpty() {
		List<String> parameterNames = parameterNameColumn.getValue();

		if (parameterNames.isEmpty()) {
			return true;
		}

		return false;
	}

	public void removeAll() {
		parameterLocationColumn.setValue(new ArrayList<>());
		parameterNameColumn.setValue(new ArrayList<>());
		parameterValueColumn.setValue(new ArrayList<>());
	}

	@Override
	public void setupLayout() {
		super.setupLayout();

		Form mainForm = new Form(this, Form.MAIN);

		mainForm.addColumn(parameterLocationColumn);
		mainForm.addColumn(parameterNameColumn);
		mainForm.addColumn(parameterValueColumn);
	}

	@Override
	public void setupProperties() {
		super.setupProperties();

		parameterLocationColumn.setTaggedValue(_ADD_QUOTES, true);
		parameterLocationColumn.setValue(new ArrayList<>());

		parameterNameColumn.setTaggedValue(_ADD_QUOTES, true);
		parameterNameColumn.setValue(new ArrayList<>());

		parameterValueColumn.setTaggedValue(_ADD_QUOTES, true);
		parameterValueColumn.setValue(new ArrayList<>());
	}

	public Property<List<String>> parameterLocationColumn = newProperty(
		_LIST_STRING_TYPE, "parameterLocationColumn");
	public Property<List<String>> parameterNameColumn = newProperty(
		_LIST_STRING_TYPE, "parameterNameColumn");
	public Property<List<String>> parameterValueColumn = newProperty(
		_LIST_STRING_TYPE, "parameterValueColumn");

	private List<RequestParameter> _toRequestParameters(String expression) {
		if ((expression == null) || expression.isEmpty()) {
			return Collections.emptyList();
		}

		List<RequestParameter> requestParameters = new ArrayList<>();

		String[] parameterNameValues = expression.split(",");

		for (String parameterNameValue : parameterNameValues) {
			String[] nameValue = parameterNameValue.split("=");

			requestParameters.add(
				new RequestParameter("query", nameValue[0], nameValue[1]));
		}

		return requestParameters;
	}

	private static final String _ADD_QUOTES = "ADD_QUOTES";

	private static final TypeLiteral<List<String>> _LIST_STRING_TYPE =
		new TypeLiteral<List<String>>() {
		};

	private static final long serialVersionUID = 3473102423403696544L;

}