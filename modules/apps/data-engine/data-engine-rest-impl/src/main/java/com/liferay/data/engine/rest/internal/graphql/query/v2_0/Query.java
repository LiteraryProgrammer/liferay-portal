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

package com.liferay.data.engine.rest.internal.graphql.query.v2_0;

import com.liferay.data.engine.rest.dto.v2_0.DataDefinition;
import com.liferay.data.engine.rest.dto.v2_0.DataLayout;
import com.liferay.data.engine.rest.dto.v2_0.DataLayoutPage;
import com.liferay.data.engine.rest.dto.v2_0.DataListView;
import com.liferay.data.engine.rest.dto.v2_0.DataModelPermission;
import com.liferay.data.engine.rest.dto.v2_0.DataRecord;
import com.liferay.data.engine.rest.dto.v2_0.DataRecordCollection;
import com.liferay.data.engine.rest.resource.v2_0.DataDefinitionResource;
import com.liferay.data.engine.rest.resource.v2_0.DataLayoutResource;
import com.liferay.data.engine.rest.resource.v2_0.DataListViewResource;
import com.liferay.data.engine.rest.resource.v2_0.DataModelPermissionResource;
import com.liferay.data.engine.rest.resource.v2_0.DataRecordCollectionResource;
import com.liferay.data.engine.rest.resource.v2_0.DataRecordResource;
import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLTypeExtension;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;

import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.validation.constraints.NotEmpty;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author Jeyvison Nascimento
 * @generated
 */
@Generated("")
public class Query {

	public static void setDataDefinitionResourceComponentServiceObjects(
		ComponentServiceObjects<DataDefinitionResource>
			dataDefinitionResourceComponentServiceObjects) {

		_dataDefinitionResourceComponentServiceObjects =
			dataDefinitionResourceComponentServiceObjects;
	}

	public static void setDataLayoutResourceComponentServiceObjects(
		ComponentServiceObjects<DataLayoutResource>
			dataLayoutResourceComponentServiceObjects) {

		_dataLayoutResourceComponentServiceObjects =
			dataLayoutResourceComponentServiceObjects;
	}

	public static void setDataListViewResourceComponentServiceObjects(
		ComponentServiceObjects<DataListViewResource>
			dataListViewResourceComponentServiceObjects) {

		_dataListViewResourceComponentServiceObjects =
			dataListViewResourceComponentServiceObjects;
	}

	public static void setDataModelPermissionResourceComponentServiceObjects(
		ComponentServiceObjects<DataModelPermissionResource>
			dataModelPermissionResourceComponentServiceObjects) {

		_dataModelPermissionResourceComponentServiceObjects =
			dataModelPermissionResourceComponentServiceObjects;
	}

	public static void setDataRecordResourceComponentServiceObjects(
		ComponentServiceObjects<DataRecordResource>
			dataRecordResourceComponentServiceObjects) {

		_dataRecordResourceComponentServiceObjects =
			dataRecordResourceComponentServiceObjects;
	}

	public static void setDataRecordCollectionResourceComponentServiceObjects(
		ComponentServiceObjects<DataRecordCollectionResource>
			dataRecordCollectionResourceComponentServiceObjects) {

		_dataRecordCollectionResourceComponentServiceObjects =
			dataRecordCollectionResourceComponentServiceObjects;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dataDefinitionByContentTypeContentType(contentType: ___, keywords: ___, page: ___, pageSize: ___, sorts: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DataDefinitionPage dataDefinitionByContentTypeContentType(
			@GraphQLName("contentType") String contentType,
			@GraphQLName("keywords") String keywords,
			@GraphQLName("pageSize") int pageSize,
			@GraphQLName("page") int page,
			@GraphQLName("sort") String sortsString)
		throws Exception {

		return _applyComponentServiceObjects(
			_dataDefinitionResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataDefinitionResource -> new DataDefinitionPage(
				dataDefinitionResource.
					getDataDefinitionByContentTypeContentTypePage(
						contentType, keywords, Pagination.of(page, pageSize),
						_sortsBiFunction.apply(
							dataDefinitionResource, sortsString))));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dataDefinitionDataDefinitionFieldFieldTypes{}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public String dataDefinitionDataDefinitionFieldFieldTypes()
		throws Exception {

		return _applyComponentServiceObjects(
			_dataDefinitionResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataDefinitionResource ->
				dataDefinitionResource.
					getDataDefinitionDataDefinitionFieldFieldTypes());
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dataDefinition(dataDefinitionId: ___){availableLanguageIds, contentType, dataDefinitionFields, dataDefinitionKey, dateCreated, dateModified, defaultLanguageId, description, id, name, siteId, storageType, userId}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DataDefinition dataDefinition(
			@GraphQLName("dataDefinitionId") Long dataDefinitionId)
		throws Exception {

		return _applyComponentServiceObjects(
			_dataDefinitionResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataDefinitionResource -> dataDefinitionResource.getDataDefinition(
				dataDefinitionId));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dataDefinitionDataDefinitionFieldLinks(dataDefinitionId: ___, fieldName: ___){}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public String dataDefinitionDataDefinitionFieldLinks(
			@GraphQLName("dataDefinitionId") Long dataDefinitionId,
			@GraphQLName("fieldName") String fieldName)
		throws Exception {

		return _applyComponentServiceObjects(
			_dataDefinitionResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataDefinitionResource ->
				dataDefinitionResource.
					getDataDefinitionDataDefinitionFieldLinks(
						dataDefinitionId, fieldName));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {siteDataDefinitionByContentTypeContentType(contentType: ___, keywords: ___, page: ___, pageSize: ___, siteKey: ___, sorts: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DataDefinitionPage siteDataDefinitionByContentTypeContentType(
			@GraphQLName("siteKey") @NotEmpty String siteKey,
			@GraphQLName("contentType") String contentType,
			@GraphQLName("keywords") String keywords,
			@GraphQLName("pageSize") int pageSize,
			@GraphQLName("page") int page,
			@GraphQLName("sort") String sortsString)
		throws Exception {

		return _applyComponentServiceObjects(
			_dataDefinitionResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataDefinitionResource -> new DataDefinitionPage(
				dataDefinitionResource.
					getSiteDataDefinitionByContentTypeContentTypePage(
						Long.valueOf(siteKey), contentType, keywords,
						Pagination.of(page, pageSize),
						_sortsBiFunction.apply(
							dataDefinitionResource, sortsString))));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dataDefinitionByContentTypeByDataDefinitionKey(contentType: ___, dataDefinitionKey: ___, siteKey: ___){availableLanguageIds, contentType, dataDefinitionFields, dataDefinitionKey, dateCreated, dateModified, defaultLanguageId, description, id, name, siteId, storageType, userId}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DataDefinition dataDefinitionByContentTypeByDataDefinitionKey(
			@GraphQLName("siteKey") @NotEmpty String siteKey,
			@GraphQLName("contentType") String contentType,
			@GraphQLName("dataDefinitionKey") String dataDefinitionKey)
		throws Exception {

		return _applyComponentServiceObjects(
			_dataDefinitionResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataDefinitionResource ->
				dataDefinitionResource.
					getSiteDataDefinitionByContentTypeByDataDefinitionKey(
						Long.valueOf(siteKey), contentType, dataDefinitionKey));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dataDefinitionDataLayouts(dataDefinitionId: ___, keywords: ___, page: ___, pageSize: ___, sorts: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DataLayoutPage dataDefinitionDataLayouts(
			@GraphQLName("dataDefinitionId") Long dataDefinitionId,
			@GraphQLName("keywords") String keywords,
			@GraphQLName("pageSize") int pageSize,
			@GraphQLName("page") int page,
			@GraphQLName("sort") String sortsString)
		throws Exception {

		return _applyComponentServiceObjects(
			_dataLayoutResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataLayoutResource -> new DataLayoutPage(
				dataLayoutResource.getDataDefinitionDataLayoutsPage(
					dataDefinitionId, keywords, Pagination.of(page, pageSize),
					_sortsBiFunction.apply(dataLayoutResource, sortsString))));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dataLayout(dataLayoutId: ___){dataDefinitionId, dataLayoutKey, dataLayoutPages, dateCreated, dateModified, description, id, name, paginationMode, siteId, userId}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DataLayout dataLayout(@GraphQLName("dataLayoutId") Long dataLayoutId)
		throws Exception {

		return _applyComponentServiceObjects(
			_dataLayoutResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataLayoutResource -> dataLayoutResource.getDataLayout(
				dataLayoutId));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dataLayouts(keywords: ___, page: ___, pageSize: ___, siteKey: ___, sorts: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DataLayoutPage dataLayouts(
			@GraphQLName("siteKey") @NotEmpty String siteKey,
			@GraphQLName("keywords") String keywords,
			@GraphQLName("pageSize") int pageSize,
			@GraphQLName("page") int page,
			@GraphQLName("sort") String sortsString)
		throws Exception {

		return _applyComponentServiceObjects(
			_dataLayoutResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataLayoutResource -> new DataLayoutPage(
				dataLayoutResource.getSiteDataLayoutsPage(
					Long.valueOf(siteKey), keywords,
					Pagination.of(page, pageSize),
					_sortsBiFunction.apply(dataLayoutResource, sortsString))));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dataLayoutByDataLayoutKey(dataLayoutKey: ___, siteKey: ___){dataDefinitionId, dataLayoutKey, dataLayoutPages, dateCreated, dateModified, description, id, name, paginationMode, siteId, userId}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DataLayout dataLayoutByDataLayoutKey(
			@GraphQLName("siteKey") @NotEmpty String siteKey,
			@GraphQLName("dataLayoutKey") String dataLayoutKey)
		throws Exception {

		return _applyComponentServiceObjects(
			_dataLayoutResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataLayoutResource ->
				dataLayoutResource.getSiteDataLayoutByDataLayoutKey(
					Long.valueOf(siteKey), dataLayoutKey));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dataDefinitionDataListViews(dataDefinitionId: ___, keywords: ___, page: ___, pageSize: ___, sorts: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DataListViewPage dataDefinitionDataListViews(
			@GraphQLName("dataDefinitionId") Long dataDefinitionId,
			@GraphQLName("keywords") String keywords,
			@GraphQLName("pageSize") int pageSize,
			@GraphQLName("page") int page,
			@GraphQLName("sort") String sortsString)
		throws Exception {

		return _applyComponentServiceObjects(
			_dataListViewResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataListViewResource -> new DataListViewPage(
				dataListViewResource.getDataDefinitionDataListViewsPage(
					dataDefinitionId, keywords, Pagination.of(page, pageSize),
					_sortsBiFunction.apply(
						dataListViewResource, sortsString))));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dataListView(dataListViewId: ___){appliedFilters, dataDefinitionId, dateCreated, dateModified, fieldNames, id, name, siteId, sortField, userId}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DataListView dataListView(
			@GraphQLName("dataListViewId") Long dataListViewId)
		throws Exception {

		return _applyComponentServiceObjects(
			_dataListViewResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataListViewResource -> dataListViewResource.getDataListView(
				dataListViewId));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dataDefinitionDataModelPermissions(dataDefinitionId: ___, roleNames: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DataModelPermissionPage dataDefinitionDataModelPermissions(
			@GraphQLName("dataDefinitionId") Long dataDefinitionId,
			@GraphQLName("roleNames") String roleNames)
		throws Exception {

		return _applyComponentServiceObjects(
			_dataModelPermissionResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataModelPermissionResource -> new DataModelPermissionPage(
				dataModelPermissionResource.
					getDataDefinitionDataModelPermissionsPage(
						dataDefinitionId, roleNames)));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dataLayoutDataModelPermissions(dataLayoutId: ___, roleNames: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DataModelPermissionPage dataLayoutDataModelPermissions(
			@GraphQLName("dataLayoutId") Long dataLayoutId,
			@GraphQLName("roleNames") String roleNames)
		throws Exception {

		return _applyComponentServiceObjects(
			_dataModelPermissionResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataModelPermissionResource -> new DataModelPermissionPage(
				dataModelPermissionResource.
					getDataLayoutDataModelPermissionsPage(
						dataLayoutId, roleNames)));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dataRecordCollectionDataModelPermissions(dataRecordCollectionId: ___, roleNames: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DataModelPermissionPage dataRecordCollectionDataModelPermissions(
			@GraphQLName("dataRecordCollectionId") Long dataRecordCollectionId,
			@GraphQLName("roleNames") String roleNames)
		throws Exception {

		return _applyComponentServiceObjects(
			_dataModelPermissionResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataModelPermissionResource -> new DataModelPermissionPage(
				dataModelPermissionResource.
					getDataRecordCollectionDataModelPermissionsPage(
						dataRecordCollectionId, roleNames)));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dataRecordCollectionDataModelPermissionByCurrentUser(dataRecordCollectionId: ___){}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public String dataRecordCollectionDataModelPermissionByCurrentUser(
			@GraphQLName("dataRecordCollectionId") Long dataRecordCollectionId)
		throws Exception {

		return _applyComponentServiceObjects(
			_dataModelPermissionResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataModelPermissionResource ->
				dataModelPermissionResource.
					getDataRecordCollectionDataModelPermissionByCurrentUser(
						dataRecordCollectionId));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dataDefinitionDataRecords(dataDefinitionId: ___, keywords: ___, page: ___, pageSize: ___, sorts: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DataRecordPage dataDefinitionDataRecords(
			@GraphQLName("dataDefinitionId") Long dataDefinitionId,
			@GraphQLName("keywords") String keywords,
			@GraphQLName("pageSize") int pageSize,
			@GraphQLName("page") int page,
			@GraphQLName("sort") String sortsString)
		throws Exception {

		return _applyComponentServiceObjects(
			_dataRecordResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataRecordResource -> new DataRecordPage(
				dataRecordResource.getDataDefinitionDataRecordsPage(
					dataDefinitionId, keywords, Pagination.of(page, pageSize),
					_sortsBiFunction.apply(dataRecordResource, sortsString))));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dataRecordCollectionDataRecords(dataRecordCollectionId: ___, keywords: ___, page: ___, pageSize: ___, sorts: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DataRecordPage dataRecordCollectionDataRecords(
			@GraphQLName("dataRecordCollectionId") Long dataRecordCollectionId,
			@GraphQLName("keywords") String keywords,
			@GraphQLName("pageSize") int pageSize,
			@GraphQLName("page") int page,
			@GraphQLName("sort") String sortsString)
		throws Exception {

		return _applyComponentServiceObjects(
			_dataRecordResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataRecordResource -> new DataRecordPage(
				dataRecordResource.getDataRecordCollectionDataRecordsPage(
					dataRecordCollectionId, keywords,
					Pagination.of(page, pageSize),
					_sortsBiFunction.apply(dataRecordResource, sortsString))));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dataRecordCollectionDataRecordExport(dataRecordCollectionId: ___, page: ___, pageSize: ___){}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public String dataRecordCollectionDataRecordExport(
			@GraphQLName("dataRecordCollectionId") Long dataRecordCollectionId,
			@GraphQLName("pageSize") int pageSize,
			@GraphQLName("page") int page)
		throws Exception {

		return _applyComponentServiceObjects(
			_dataRecordResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataRecordResource ->
				dataRecordResource.getDataRecordCollectionDataRecordExport(
					dataRecordCollectionId, Pagination.of(page, pageSize)));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dataRecord(dataRecordId: ___){dataRecordCollectionId, dataRecordValues, id}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DataRecord dataRecord(@GraphQLName("dataRecordId") Long dataRecordId)
		throws Exception {

		return _applyComponentServiceObjects(
			_dataRecordResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataRecordResource -> dataRecordResource.getDataRecord(
				dataRecordId));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dataDefinitionDataRecordCollection(dataDefinitionId: ___){dataDefinitionId, dataRecordCollectionKey, description, id, name, siteId}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DataRecordCollection dataDefinitionDataRecordCollection(
			@GraphQLName("dataDefinitionId") Long dataDefinitionId)
		throws Exception {

		return _applyComponentServiceObjects(
			_dataRecordCollectionResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataRecordCollectionResource ->
				dataRecordCollectionResource.
					getDataDefinitionDataRecordCollection(dataDefinitionId));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dataDefinitionDataRecordCollections(dataDefinitionId: ___, keywords: ___, page: ___, pageSize: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DataRecordCollectionPage dataDefinitionDataRecordCollections(
			@GraphQLName("dataDefinitionId") Long dataDefinitionId,
			@GraphQLName("keywords") String keywords,
			@GraphQLName("pageSize") int pageSize,
			@GraphQLName("page") int page)
		throws Exception {

		return _applyComponentServiceObjects(
			_dataRecordCollectionResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataRecordCollectionResource -> new DataRecordCollectionPage(
				dataRecordCollectionResource.
					getDataDefinitionDataRecordCollectionsPage(
						dataDefinitionId, keywords,
						Pagination.of(page, pageSize))));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dataRecordCollection(dataRecordCollectionId: ___){dataDefinitionId, dataRecordCollectionKey, description, id, name, siteId}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DataRecordCollection dataRecordCollection(
			@GraphQLName("dataRecordCollectionId") Long dataRecordCollectionId)
		throws Exception {

		return _applyComponentServiceObjects(
			_dataRecordCollectionResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataRecordCollectionResource ->
				dataRecordCollectionResource.getDataRecordCollection(
					dataRecordCollectionId));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dataRecordCollections(keywords: ___, page: ___, pageSize: ___, siteKey: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DataRecordCollectionPage dataRecordCollections(
			@GraphQLName("siteKey") @NotEmpty String siteKey,
			@GraphQLName("keywords") String keywords,
			@GraphQLName("pageSize") int pageSize,
			@GraphQLName("page") int page)
		throws Exception {

		return _applyComponentServiceObjects(
			_dataRecordCollectionResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataRecordCollectionResource -> new DataRecordCollectionPage(
				dataRecordCollectionResource.getSiteDataRecordCollectionsPage(
					Long.valueOf(siteKey), keywords,
					Pagination.of(page, pageSize))));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {dataRecordCollectionByDataRecordCollectionKey(dataRecordCollectionKey: ___, siteKey: ___){dataDefinitionId, dataRecordCollectionKey, description, id, name, siteId}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField
	public DataRecordCollection dataRecordCollectionByDataRecordCollectionKey(
			@GraphQLName("siteKey") @NotEmpty String siteKey,
			@GraphQLName("dataRecordCollectionKey") String
				dataRecordCollectionKey)
		throws Exception {

		return _applyComponentServiceObjects(
			_dataRecordCollectionResourceComponentServiceObjects,
			this::_populateResourceContext,
			dataRecordCollectionResource ->
				dataRecordCollectionResource.
					getSiteDataRecordCollectionByDataRecordCollectionKey(
						Long.valueOf(siteKey), dataRecordCollectionKey));
	}

	@GraphQLTypeExtension(DataRecordCollection.class)
	public class GetDataRecordCollectionDataModelPermissionsPageTypeExtension {

		public GetDataRecordCollectionDataModelPermissionsPageTypeExtension(
			DataRecordCollection dataRecordCollection) {

			_dataRecordCollection = dataRecordCollection;
		}

		@GraphQLField
		public DataModelPermissionPage dataModelPermissions(
				@GraphQLName("roleNames") String roleNames)
			throws Exception {

			return _applyComponentServiceObjects(
				_dataModelPermissionResourceComponentServiceObjects,
				Query.this::_populateResourceContext,
				dataModelPermissionResource -> new DataModelPermissionPage(
					dataModelPermissionResource.
						getDataRecordCollectionDataModelPermissionsPage(
							_dataRecordCollection.getId(), roleNames)));
		}

		private DataRecordCollection _dataRecordCollection;

	}

	@GraphQLTypeExtension(DataDefinition.class)
	public class GetDataDefinitionDataRecordCollectionsPageTypeExtension {

		public GetDataDefinitionDataRecordCollectionsPageTypeExtension(
			DataDefinition dataDefinition) {

			_dataDefinition = dataDefinition;
		}

		@GraphQLField
		public DataRecordCollectionPage dataRecordCollections(
				@GraphQLName("keywords") String keywords,
				@GraphQLName("pageSize") int pageSize,
				@GraphQLName("page") int page)
			throws Exception {

			return _applyComponentServiceObjects(
				_dataRecordCollectionResourceComponentServiceObjects,
				Query.this::_populateResourceContext,
				dataRecordCollectionResource -> new DataRecordCollectionPage(
					dataRecordCollectionResource.
						getDataDefinitionDataRecordCollectionsPage(
							_dataDefinition.getId(), keywords,
							Pagination.of(page, pageSize))));
		}

		private DataDefinition _dataDefinition;

	}

	@GraphQLTypeExtension(DataRecordCollection.class)
	public class
		GetDataRecordCollectionDataModelPermissionByCurrentUserTypeExtension {

		public GetDataRecordCollectionDataModelPermissionByCurrentUserTypeExtension(
			DataRecordCollection dataRecordCollection) {

			_dataRecordCollection = dataRecordCollection;
		}

		@GraphQLField
		public String dataModelPermissionByCurrentUser() throws Exception {
			return _applyComponentServiceObjects(
				_dataModelPermissionResourceComponentServiceObjects,
				Query.this::_populateResourceContext,
				dataModelPermissionResource ->
					dataModelPermissionResource.
						getDataRecordCollectionDataModelPermissionByCurrentUser(
							_dataRecordCollection.getId()));
		}

		private DataRecordCollection _dataRecordCollection;

	}

	@GraphQLTypeExtension(DataDefinition.class)
	public class GetDataDefinitionDataDefinitionFieldLinksTypeExtension {

		public GetDataDefinitionDataDefinitionFieldLinksTypeExtension(
			DataDefinition dataDefinition) {

			_dataDefinition = dataDefinition;
		}

		@GraphQLField
		public String dataDefinitionFieldLinks(
				@GraphQLName("fieldName") String fieldName)
			throws Exception {

			return _applyComponentServiceObjects(
				_dataDefinitionResourceComponentServiceObjects,
				Query.this::_populateResourceContext,
				dataDefinitionResource ->
					dataDefinitionResource.
						getDataDefinitionDataDefinitionFieldLinks(
							_dataDefinition.getId(), fieldName));
		}

		private DataDefinition _dataDefinition;

	}

	@GraphQLTypeExtension(DataDefinition.class)
	public class GetDataDefinitionDataRecordCollectionTypeExtension {

		public GetDataDefinitionDataRecordCollectionTypeExtension(
			DataDefinition dataDefinition) {

			_dataDefinition = dataDefinition;
		}

		@GraphQLField
		public DataRecordCollection dataRecordCollection() throws Exception {
			return _applyComponentServiceObjects(
				_dataRecordCollectionResourceComponentServiceObjects,
				Query.this::_populateResourceContext,
				dataRecordCollectionResource ->
					dataRecordCollectionResource.
						getDataDefinitionDataRecordCollection(
							_dataDefinition.getId()));
		}

		private DataDefinition _dataDefinition;

	}

	@GraphQLTypeExtension(DataRecord.class)
	public class GetDataRecordCollectionTypeExtension {

		public GetDataRecordCollectionTypeExtension(DataRecord dataRecord) {
			_dataRecord = dataRecord;
		}

		@GraphQLField
		public DataRecordCollection collection() throws Exception {
			return _applyComponentServiceObjects(
				_dataRecordCollectionResourceComponentServiceObjects,
				Query.this::_populateResourceContext,
				dataRecordCollectionResource ->
					dataRecordCollectionResource.getDataRecordCollection(
						_dataRecord.getDataRecordCollectionId()));
		}

		private DataRecord _dataRecord;

	}

	@GraphQLTypeExtension(DataRecordCollection.class)
	public class GetDataRecordCollectionDataRecordExportTypeExtension {

		public GetDataRecordCollectionDataRecordExportTypeExtension(
			DataRecordCollection dataRecordCollection) {

			_dataRecordCollection = dataRecordCollection;
		}

		@GraphQLField
		public String dataRecordExport(
				@GraphQLName("pageSize") int pageSize,
				@GraphQLName("page") int page)
			throws Exception {

			return _applyComponentServiceObjects(
				_dataRecordResourceComponentServiceObjects,
				Query.this::_populateResourceContext,
				dataRecordResource ->
					dataRecordResource.getDataRecordCollectionDataRecordExport(
						_dataRecordCollection.getId(),
						Pagination.of(page, pageSize)));
		}

		private DataRecordCollection _dataRecordCollection;

	}

	@GraphQLTypeExtension(DataLayout.class)
	public class GetDataLayoutDataModelPermissionsPageTypeExtension {

		public GetDataLayoutDataModelPermissionsPageTypeExtension(
			DataLayout dataLayout) {

			_dataLayout = dataLayout;
		}

		@GraphQLField
		public DataModelPermissionPage dataModelPermissions(
				@GraphQLName("roleNames") String roleNames)
			throws Exception {

			return _applyComponentServiceObjects(
				_dataModelPermissionResourceComponentServiceObjects,
				Query.this::_populateResourceContext,
				dataModelPermissionResource -> new DataModelPermissionPage(
					dataModelPermissionResource.
						getDataLayoutDataModelPermissionsPage(
							_dataLayout.getId(), roleNames)));
		}

		private DataLayout _dataLayout;

	}

	@GraphQLTypeExtension(DataRecordCollection.class)
	public class GetDataDefinitionTypeExtension {

		public GetDataDefinitionTypeExtension(
			DataRecordCollection dataRecordCollection) {

			_dataRecordCollection = dataRecordCollection;
		}

		@GraphQLField
		public DataDefinition dataDefinition() throws Exception {
			return _applyComponentServiceObjects(
				_dataDefinitionResourceComponentServiceObjects,
				Query.this::_populateResourceContext,
				dataDefinitionResource ->
					dataDefinitionResource.getDataDefinition(
						_dataRecordCollection.getDataDefinitionId()));
		}

		private DataRecordCollection _dataRecordCollection;

	}

	@GraphQLTypeExtension(DataDefinition.class)
	public class GetDataDefinitionDataListViewsPageTypeExtension {

		public GetDataDefinitionDataListViewsPageTypeExtension(
			DataDefinition dataDefinition) {

			_dataDefinition = dataDefinition;
		}

		@GraphQLField
		public DataListViewPage dataListViews(
				@GraphQLName("keywords") String keywords,
				@GraphQLName("pageSize") int pageSize,
				@GraphQLName("page") int page,
				@GraphQLName("sort") String sortsString)
			throws Exception {

			return _applyComponentServiceObjects(
				_dataListViewResourceComponentServiceObjects,
				Query.this::_populateResourceContext,
				dataListViewResource -> new DataListViewPage(
					dataListViewResource.getDataDefinitionDataListViewsPage(
						_dataDefinition.getId(), keywords,
						Pagination.of(page, pageSize),
						_sortsBiFunction.apply(
							dataListViewResource, sortsString))));
		}

		private DataDefinition _dataDefinition;

	}

	@GraphQLTypeExtension(DataDefinition.class)
	public class GetDataDefinitionDataRecordsPageTypeExtension {

		public GetDataDefinitionDataRecordsPageTypeExtension(
			DataDefinition dataDefinition) {

			_dataDefinition = dataDefinition;
		}

		@GraphQLField
		public DataRecordPage dataRecords(
				@GraphQLName("keywords") String keywords,
				@GraphQLName("pageSize") int pageSize,
				@GraphQLName("page") int page,
				@GraphQLName("sort") String sortsString)
			throws Exception {

			return _applyComponentServiceObjects(
				_dataRecordResourceComponentServiceObjects,
				Query.this::_populateResourceContext,
				dataRecordResource -> new DataRecordPage(
					dataRecordResource.getDataDefinitionDataRecordsPage(
						_dataDefinition.getId(), keywords,
						Pagination.of(page, pageSize),
						_sortsBiFunction.apply(
							dataRecordResource, sortsString))));
		}

		private DataDefinition _dataDefinition;

	}

	@GraphQLTypeExtension(DataDefinition.class)
	public class GetDataDefinitionDataLayoutsPageTypeExtension {

		public GetDataDefinitionDataLayoutsPageTypeExtension(
			DataDefinition dataDefinition) {

			_dataDefinition = dataDefinition;
		}

		@GraphQLField
		public DataLayoutPage dataLayouts(
				@GraphQLName("keywords") String keywords,
				@GraphQLName("pageSize") int pageSize,
				@GraphQLName("page") int page,
				@GraphQLName("sort") String sortsString)
			throws Exception {

			return _applyComponentServiceObjects(
				_dataLayoutResourceComponentServiceObjects,
				Query.this::_populateResourceContext,
				dataLayoutResource -> new DataLayoutPage(
					dataLayoutResource.getDataDefinitionDataLayoutsPage(
						_dataDefinition.getId(), keywords,
						Pagination.of(page, pageSize),
						_sortsBiFunction.apply(
							dataLayoutResource, sortsString))));
		}

		private DataDefinition _dataDefinition;

	}

	@GraphQLTypeExtension(DataRecordCollection.class)
	public class GetDataRecordCollectionDataRecordsPageTypeExtension {

		public GetDataRecordCollectionDataRecordsPageTypeExtension(
			DataRecordCollection dataRecordCollection) {

			_dataRecordCollection = dataRecordCollection;
		}

		@GraphQLField
		public DataRecordPage dataRecords(
				@GraphQLName("keywords") String keywords,
				@GraphQLName("pageSize") int pageSize,
				@GraphQLName("page") int page,
				@GraphQLName("sort") String sortsString)
			throws Exception {

			return _applyComponentServiceObjects(
				_dataRecordResourceComponentServiceObjects,
				Query.this::_populateResourceContext,
				dataRecordResource -> new DataRecordPage(
					dataRecordResource.getDataRecordCollectionDataRecordsPage(
						_dataRecordCollection.getId(), keywords,
						Pagination.of(page, pageSize),
						_sortsBiFunction.apply(
							dataRecordResource, sortsString))));
		}

		private DataRecordCollection _dataRecordCollection;

	}

	@GraphQLTypeExtension(DataDefinition.class)
	public class GetDataDefinitionDataModelPermissionsPageTypeExtension {

		public GetDataDefinitionDataModelPermissionsPageTypeExtension(
			DataDefinition dataDefinition) {

			_dataDefinition = dataDefinition;
		}

		@GraphQLField
		public DataModelPermissionPage dataModelPermissions(
				@GraphQLName("roleNames") String roleNames)
			throws Exception {

			return _applyComponentServiceObjects(
				_dataModelPermissionResourceComponentServiceObjects,
				Query.this::_populateResourceContext,
				dataModelPermissionResource -> new DataModelPermissionPage(
					dataModelPermissionResource.
						getDataDefinitionDataModelPermissionsPage(
							_dataDefinition.getId(), roleNames)));
		}

		private DataDefinition _dataDefinition;

	}

	@GraphQLName("DataDefinitionPage")
	public class DataDefinitionPage {

		public DataDefinitionPage(Page dataDefinitionPage) {
			items = dataDefinitionPage.getItems();
			lastPage = dataDefinitionPage.getLastPage();
			page = dataDefinitionPage.getPage();
			pageSize = dataDefinitionPage.getPageSize();
			totalCount = dataDefinitionPage.getTotalCount();
		}

		@GraphQLField
		protected java.util.Collection<DataDefinition> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("DataLayoutPage")
	public class DataLayoutPage {

		public DataLayoutPage(Page dataLayoutPage) {
			items = dataLayoutPage.getItems();
			lastPage = dataLayoutPage.getLastPage();
			page = dataLayoutPage.getPage();
			pageSize = dataLayoutPage.getPageSize();
			totalCount = dataLayoutPage.getTotalCount();
		}

		@GraphQLField
		protected java.util.Collection<DataLayout> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("DataListViewPage")
	public class DataListViewPage {

		public DataListViewPage(Page dataListViewPage) {
			items = dataListViewPage.getItems();
			lastPage = dataListViewPage.getLastPage();
			page = dataListViewPage.getPage();
			pageSize = dataListViewPage.getPageSize();
			totalCount = dataListViewPage.getTotalCount();
		}

		@GraphQLField
		protected java.util.Collection<DataListView> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("DataModelPermissionPage")
	public class DataModelPermissionPage {

		public DataModelPermissionPage(Page dataModelPermissionPage) {
			items = dataModelPermissionPage.getItems();
			lastPage = dataModelPermissionPage.getLastPage();
			page = dataModelPermissionPage.getPage();
			pageSize = dataModelPermissionPage.getPageSize();
			totalCount = dataModelPermissionPage.getTotalCount();
		}

		@GraphQLField
		protected java.util.Collection<DataModelPermission> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("DataRecordPage")
	public class DataRecordPage {

		public DataRecordPage(Page dataRecordPage) {
			items = dataRecordPage.getItems();
			lastPage = dataRecordPage.getLastPage();
			page = dataRecordPage.getPage();
			pageSize = dataRecordPage.getPageSize();
			totalCount = dataRecordPage.getTotalCount();
		}

		@GraphQLField
		protected java.util.Collection<DataRecord> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	@GraphQLName("DataRecordCollectionPage")
	public class DataRecordCollectionPage {

		public DataRecordCollectionPage(Page dataRecordCollectionPage) {
			items = dataRecordCollectionPage.getItems();
			lastPage = dataRecordCollectionPage.getLastPage();
			page = dataRecordCollectionPage.getPage();
			pageSize = dataRecordCollectionPage.getPageSize();
			totalCount = dataRecordCollectionPage.getTotalCount();
		}

		@GraphQLField
		protected java.util.Collection<DataRecordCollection> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(
			DataDefinitionResource dataDefinitionResource)
		throws Exception {

		dataDefinitionResource.setContextAcceptLanguage(_acceptLanguage);
		dataDefinitionResource.setContextCompany(_company);
		dataDefinitionResource.setContextHttpServletRequest(
			_httpServletRequest);
		dataDefinitionResource.setContextHttpServletResponse(
			_httpServletResponse);
		dataDefinitionResource.setContextUriInfo(_uriInfo);
		dataDefinitionResource.setContextUser(_user);
	}

	private void _populateResourceContext(DataLayoutResource dataLayoutResource)
		throws Exception {

		dataLayoutResource.setContextAcceptLanguage(_acceptLanguage);
		dataLayoutResource.setContextCompany(_company);
		dataLayoutResource.setContextHttpServletRequest(_httpServletRequest);
		dataLayoutResource.setContextHttpServletResponse(_httpServletResponse);
		dataLayoutResource.setContextUriInfo(_uriInfo);
		dataLayoutResource.setContextUser(_user);
	}

	private void _populateResourceContext(
			DataListViewResource dataListViewResource)
		throws Exception {

		dataListViewResource.setContextAcceptLanguage(_acceptLanguage);
		dataListViewResource.setContextCompany(_company);
		dataListViewResource.setContextHttpServletRequest(_httpServletRequest);
		dataListViewResource.setContextHttpServletResponse(
			_httpServletResponse);
		dataListViewResource.setContextUriInfo(_uriInfo);
		dataListViewResource.setContextUser(_user);
	}

	private void _populateResourceContext(
			DataModelPermissionResource dataModelPermissionResource)
		throws Exception {

		dataModelPermissionResource.setContextAcceptLanguage(_acceptLanguage);
		dataModelPermissionResource.setContextCompany(_company);
		dataModelPermissionResource.setContextHttpServletRequest(
			_httpServletRequest);
		dataModelPermissionResource.setContextHttpServletResponse(
			_httpServletResponse);
		dataModelPermissionResource.setContextUriInfo(_uriInfo);
		dataModelPermissionResource.setContextUser(_user);
	}

	private void _populateResourceContext(DataRecordResource dataRecordResource)
		throws Exception {

		dataRecordResource.setContextAcceptLanguage(_acceptLanguage);
		dataRecordResource.setContextCompany(_company);
		dataRecordResource.setContextHttpServletRequest(_httpServletRequest);
		dataRecordResource.setContextHttpServletResponse(_httpServletResponse);
		dataRecordResource.setContextUriInfo(_uriInfo);
		dataRecordResource.setContextUser(_user);
	}

	private void _populateResourceContext(
			DataRecordCollectionResource dataRecordCollectionResource)
		throws Exception {

		dataRecordCollectionResource.setContextAcceptLanguage(_acceptLanguage);
		dataRecordCollectionResource.setContextCompany(_company);
		dataRecordCollectionResource.setContextHttpServletRequest(
			_httpServletRequest);
		dataRecordCollectionResource.setContextHttpServletResponse(
			_httpServletResponse);
		dataRecordCollectionResource.setContextUriInfo(_uriInfo);
		dataRecordCollectionResource.setContextUser(_user);
	}

	private static ComponentServiceObjects<DataDefinitionResource>
		_dataDefinitionResourceComponentServiceObjects;
	private static ComponentServiceObjects<DataLayoutResource>
		_dataLayoutResourceComponentServiceObjects;
	private static ComponentServiceObjects<DataListViewResource>
		_dataListViewResourceComponentServiceObjects;
	private static ComponentServiceObjects<DataModelPermissionResource>
		_dataModelPermissionResourceComponentServiceObjects;
	private static ComponentServiceObjects<DataRecordResource>
		_dataRecordResourceComponentServiceObjects;
	private static ComponentServiceObjects<DataRecordCollectionResource>
		_dataRecordCollectionResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private BiFunction<Object, String, Filter> _filterBiFunction;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private com.liferay.portal.kernel.model.Company _company;
	private com.liferay.portal.kernel.model.User _user;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private UriInfo _uriInfo;

}