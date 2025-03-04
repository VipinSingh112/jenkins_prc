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

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AttractionCarRentLicenceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCarRentLicenceLocalService
 * @generated
 */
public class AttractionCarRentLicenceLocalServiceWrapper
	implements AttractionCarRentLicenceLocalService,
			   ServiceWrapper<AttractionCarRentLicenceLocalService> {

	public AttractionCarRentLicenceLocalServiceWrapper() {
		this(null);
	}

	public AttractionCarRentLicenceLocalServiceWrapper(
		AttractionCarRentLicenceLocalService
			attractionCarRentLicenceLocalService) {

		_attractionCarRentLicenceLocalService =
			attractionCarRentLicenceLocalService;
	}

	/**
	 * Adds the attraction car rent licence to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionCarRentLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionCarRentLicence the attraction car rent licence
	 * @return the attraction car rent licence that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCarRentLicence
		addAttractionCarRentLicence(
			com.nbp.jtb.application.form.service.model.AttractionCarRentLicence
				attractionCarRentLicence) {

		return _attractionCarRentLicenceLocalService.
			addAttractionCarRentLicence(attractionCarRentLicence);
	}

	/**
	 * Creates a new attraction car rent licence with the primary key. Does not add the attraction car rent licence to the database.
	 *
	 * @param attractionCarRentLicenceId the primary key for the new attraction car rent licence
	 * @return the new attraction car rent licence
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCarRentLicence
		createAttractionCarRentLicence(long attractionCarRentLicenceId) {

		return _attractionCarRentLicenceLocalService.
			createAttractionCarRentLicence(attractionCarRentLicenceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionCarRentLicenceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the attraction car rent licence from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionCarRentLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionCarRentLicence the attraction car rent licence
	 * @return the attraction car rent licence that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCarRentLicence
		deleteAttractionCarRentLicence(
			com.nbp.jtb.application.form.service.model.AttractionCarRentLicence
				attractionCarRentLicence) {

		return _attractionCarRentLicenceLocalService.
			deleteAttractionCarRentLicence(attractionCarRentLicence);
	}

	/**
	 * Deletes the attraction car rent licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionCarRentLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionCarRentLicenceId the primary key of the attraction car rent licence
	 * @return the attraction car rent licence that was removed
	 * @throws PortalException if a attraction car rent licence with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCarRentLicence
			deleteAttractionCarRentLicence(long attractionCarRentLicenceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionCarRentLicenceLocalService.
			deleteAttractionCarRentLicence(attractionCarRentLicenceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionCarRentLicenceLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _attractionCarRentLicenceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _attractionCarRentLicenceLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _attractionCarRentLicenceLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _attractionCarRentLicenceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionCarRentLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _attractionCarRentLicenceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionCarRentLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _attractionCarRentLicenceLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _attractionCarRentLicenceLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _attractionCarRentLicenceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCarRentLicence
		fetchAttractionCarRentLicence(long attractionCarRentLicenceId) {

		return _attractionCarRentLicenceLocalService.
			fetchAttractionCarRentLicence(attractionCarRentLicenceId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _attractionCarRentLicenceLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the attraction car rent licence with the primary key.
	 *
	 * @param attractionCarRentLicenceId the primary key of the attraction car rent licence
	 * @return the attraction car rent licence
	 * @throws PortalException if a attraction car rent licence with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCarRentLicence
			getAttractionCarRentLicence(long attractionCarRentLicenceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionCarRentLicenceLocalService.
			getAttractionCarRentLicence(attractionCarRentLicenceId);
	}

	/**
	 * Returns a range of all the attraction car rent licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionCarRentLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rent licences
	 * @param end the upper bound of the range of attraction car rent licences (not inclusive)
	 * @return the range of attraction car rent licences
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AttractionCarRentLicence>
			getAttractionCarRentLicences(int start, int end) {

		return _attractionCarRentLicenceLocalService.
			getAttractionCarRentLicences(start, end);
	}

	/**
	 * Returns the number of attraction car rent licences.
	 *
	 * @return the number of attraction car rent licences
	 */
	@Override
	public int getAttractionCarRentLicencesCount() {
		return _attractionCarRentLicenceLocalService.
			getAttractionCarRentLicencesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _attractionCarRentLicenceLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionCarRentLicenceLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractionCarRentLicenceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the attraction car rent licence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionCarRentLicenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionCarRentLicence the attraction car rent licence
	 * @return the attraction car rent licence that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractionCarRentLicence
		updateAttractionCarRentLicence(
			com.nbp.jtb.application.form.service.model.AttractionCarRentLicence
				attractionCarRentLicence) {

		return _attractionCarRentLicenceLocalService.
			updateAttractionCarRentLicence(attractionCarRentLicence);
	}

	@Override
	public AttractionCarRentLicenceLocalService getWrappedService() {
		return _attractionCarRentLicenceLocalService;
	}

	@Override
	public void setWrappedService(
		AttractionCarRentLicenceLocalService
			attractionCarRentLicenceLocalService) {

		_attractionCarRentLicenceLocalService =
			attractionCarRentLicenceLocalService;
	}

	private AttractionCarRentLicenceLocalService
		_attractionCarRentLicenceLocalService;

}