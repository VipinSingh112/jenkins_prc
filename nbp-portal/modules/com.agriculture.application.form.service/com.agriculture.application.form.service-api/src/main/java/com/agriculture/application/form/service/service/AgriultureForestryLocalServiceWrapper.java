/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AgriultureForestryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgriultureForestryLocalService
 * @generated
 */
public class AgriultureForestryLocalServiceWrapper
	implements AgriultureForestryLocalService,
			   ServiceWrapper<AgriultureForestryLocalService> {

	public AgriultureForestryLocalServiceWrapper() {
		this(null);
	}

	public AgriultureForestryLocalServiceWrapper(
		AgriultureForestryLocalService agriultureForestryLocalService) {

		_agriultureForestryLocalService = agriultureForestryLocalService;
	}

	/**
	 * Adds the agriulture forestry to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriultureForestryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriultureForestry the agriulture forestry
	 * @return the agriulture forestry that was added
	 */
	@Override
	public com.agriculture.application.form.service.model.AgriultureForestry
		addAgriultureForestry(
			com.agriculture.application.form.service.model.AgriultureForestry
				agriultureForestry) {

		return _agriultureForestryLocalService.addAgriultureForestry(
			agriultureForestry);
	}

	/**
	 * Creates a new agriulture forestry with the primary key. Does not add the agriulture forestry to the database.
	 *
	 * @param agriultureForestryId the primary key for the new agriulture forestry
	 * @return the new agriulture forestry
	 */
	@Override
	public com.agriculture.application.form.service.model.AgriultureForestry
		createAgriultureForestry(long agriultureForestryId) {

		return _agriultureForestryLocalService.createAgriultureForestry(
			agriultureForestryId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agriultureForestryLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void deleteAgriForestryById(long applicationId) {
		_agriultureForestryLocalService.deleteAgriForestryById(applicationId);
	}

	/**
	 * Deletes the agriulture forestry from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriultureForestryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriultureForestry the agriulture forestry
	 * @return the agriulture forestry that was removed
	 */
	@Override
	public com.agriculture.application.form.service.model.AgriultureForestry
		deleteAgriultureForestry(
			com.agriculture.application.form.service.model.AgriultureForestry
				agriultureForestry) {

		return _agriultureForestryLocalService.deleteAgriultureForestry(
			agriultureForestry);
	}

	/**
	 * Deletes the agriulture forestry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriultureForestryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriultureForestryId the primary key of the agriulture forestry
	 * @return the agriulture forestry that was removed
	 * @throws PortalException if a agriulture forestry with the primary key could not be found
	 */
	@Override
	public com.agriculture.application.form.service.model.AgriultureForestry
			deleteAgriultureForestry(long agriultureForestryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agriultureForestryLocalService.deleteAgriultureForestry(
			agriultureForestryId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agriultureForestryLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _agriultureForestryLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _agriultureForestryLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _agriultureForestryLocalService.dynamicQuery();
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

		return _agriultureForestryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgriultureForestryModelImpl</code>.
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

		return _agriultureForestryLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgriultureForestryModelImpl</code>.
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

		return _agriultureForestryLocalService.dynamicQuery(
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

		return _agriultureForestryLocalService.dynamicQueryCount(dynamicQuery);
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

		return _agriultureForestryLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.agriculture.application.form.service.model.AgriultureForestry
		fetchAgriultureForestry(long agriultureForestryId) {

		return _agriultureForestryLocalService.fetchAgriultureForestry(
			agriultureForestryId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _agriultureForestryLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.AgriultureForestry>
			getAF_by_AAI(long agricultureApplicatiId) {

		return _agriultureForestryLocalService.getAF_by_AAI(
			agricultureApplicatiId);
	}

	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.AgriultureForestry>
			getAForest_by_AAI(long agricultureApplicationId) {

		return _agriultureForestryLocalService.getAForest_by_AAI(
			agricultureApplicationId);
	}

	@Override
	public com.agriculture.application.form.service.model.AgriultureForestry
			getAgricultureById(long ApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgriultureForestryException {

		return _agriultureForestryLocalService.getAgricultureById(
			ApplicationId);
	}

	/**
	 * Returns a range of all the agriulture forestries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgriultureForestryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriulture forestries
	 * @param end the upper bound of the range of agriulture forestries (not inclusive)
	 * @return the range of agriulture forestries
	 */
	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.AgriultureForestry>
			getAgriultureForestries(int start, int end) {

		return _agriultureForestryLocalService.getAgriultureForestries(
			start, end);
	}

	/**
	 * Returns the number of agriulture forestries.
	 *
	 * @return the number of agriulture forestries
	 */
	@Override
	public int getAgriultureForestriesCount() {
		return _agriultureForestryLocalService.getAgriultureForestriesCount();
	}

	/**
	 * Returns the agriulture forestry with the primary key.
	 *
	 * @param agriultureForestryId the primary key of the agriulture forestry
	 * @return the agriulture forestry
	 * @throws PortalException if a agriulture forestry with the primary key could not be found
	 */
	@Override
	public com.agriculture.application.form.service.model.AgriultureForestry
			getAgriultureForestry(long agriultureForestryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agriultureForestryLocalService.getAgriultureForestry(
			agriultureForestryId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _agriultureForestryLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agriultureForestryLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agriultureForestryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the agriulture forestry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriultureForestryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriultureForestry the agriulture forestry
	 * @return the agriulture forestry that was updated
	 */
	@Override
	public com.agriculture.application.form.service.model.AgriultureForestry
		updateAgriultureForestry(
			com.agriculture.application.form.service.model.AgriultureForestry
				agriultureForestry) {

		return _agriultureForestryLocalService.updateAgriultureForestry(
			agriultureForestry);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _agriultureForestryLocalService.getBasePersistence();
	}

	@Override
	public AgriultureForestryLocalService getWrappedService() {
		return _agriultureForestryLocalService;
	}

	@Override
	public void setWrappedService(
		AgriultureForestryLocalService agriultureForestryLocalService) {

		_agriultureForestryLocalService = agriultureForestryLocalService;
	}

	private AgriultureForestryLocalService _agriultureForestryLocalService;

}