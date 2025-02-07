/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AgriculturePoultryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgriculturePoultryLocalService
 * @generated
 */
public class AgriculturePoultryLocalServiceWrapper
	implements AgriculturePoultryLocalService,
			   ServiceWrapper<AgriculturePoultryLocalService> {

	public AgriculturePoultryLocalServiceWrapper() {
		this(null);
	}

	public AgriculturePoultryLocalServiceWrapper(
		AgriculturePoultryLocalService agriculturePoultryLocalService) {

		_agriculturePoultryLocalService = agriculturePoultryLocalService;
	}

	/**
	 * Adds the agriculture poultry to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriculturePoultryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriculturePoultry the agriculture poultry
	 * @return the agriculture poultry that was added
	 */
	@Override
	public com.agriculture.application.form.service.model.AgriculturePoultry
		addAgriculturePoultry(
			com.agriculture.application.form.service.model.AgriculturePoultry
				agriculturePoultry) {

		return _agriculturePoultryLocalService.addAgriculturePoultry(
			agriculturePoultry);
	}

	/**
	 * Creates a new agriculture poultry with the primary key. Does not add the agriculture poultry to the database.
	 *
	 * @param agriculturePoultryId the primary key for the new agriculture poultry
	 * @return the new agriculture poultry
	 */
	@Override
	public com.agriculture.application.form.service.model.AgriculturePoultry
		createAgriculturePoultry(long agriculturePoultryId) {

		return _agriculturePoultryLocalService.createAgriculturePoultry(
			agriculturePoultryId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agriculturePoultryLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the agriculture poultry from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriculturePoultryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriculturePoultry the agriculture poultry
	 * @return the agriculture poultry that was removed
	 */
	@Override
	public com.agriculture.application.form.service.model.AgriculturePoultry
		deleteAgriculturePoultry(
			com.agriculture.application.form.service.model.AgriculturePoultry
				agriculturePoultry) {

		return _agriculturePoultryLocalService.deleteAgriculturePoultry(
			agriculturePoultry);
	}

	/**
	 * Deletes the agriculture poultry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriculturePoultryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriculturePoultryId the primary key of the agriculture poultry
	 * @return the agriculture poultry that was removed
	 * @throws PortalException if a agriculture poultry with the primary key could not be found
	 */
	@Override
	public com.agriculture.application.form.service.model.AgriculturePoultry
			deleteAgriculturePoultry(long agriculturePoultryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agriculturePoultryLocalService.deleteAgriculturePoultry(
			agriculturePoultryId);
	}

	@Override
	public void deleteAgriPoultryById(long applicationId) {
		_agriculturePoultryLocalService.deleteAgriPoultryById(applicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agriculturePoultryLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _agriculturePoultryLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _agriculturePoultryLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _agriculturePoultryLocalService.dynamicQuery();
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

		return _agriculturePoultryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgriculturePoultryModelImpl</code>.
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

		return _agriculturePoultryLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgriculturePoultryModelImpl</code>.
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

		return _agriculturePoultryLocalService.dynamicQuery(
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

		return _agriculturePoultryLocalService.dynamicQueryCount(dynamicQuery);
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

		return _agriculturePoultryLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.agriculture.application.form.service.model.AgriculturePoultry
		fetchAgriculturePoultry(long agriculturePoultryId) {

		return _agriculturePoultryLocalService.fetchAgriculturePoultry(
			agriculturePoultryId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _agriculturePoultryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.agriculture.application.form.service.model.AgriculturePoultry
			getAgricultureById(long ApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgriculturePoultryException {

		return _agriculturePoultryLocalService.getAgricultureById(
			ApplicationId);
	}

	/**
	 * Returns a range of all the agriculture poultries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgriculturePoultryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture poultries
	 * @param end the upper bound of the range of agriculture poultries (not inclusive)
	 * @return the range of agriculture poultries
	 */
	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.AgriculturePoultry>
			getAgriculturePoultries(int start, int end) {

		return _agriculturePoultryLocalService.getAgriculturePoultries(
			start, end);
	}

	/**
	 * Returns the number of agriculture poultries.
	 *
	 * @return the number of agriculture poultries
	 */
	@Override
	public int getAgriculturePoultriesCount() {
		return _agriculturePoultryLocalService.getAgriculturePoultriesCount();
	}

	/**
	 * Returns the agriculture poultry with the primary key.
	 *
	 * @param agriculturePoultryId the primary key of the agriculture poultry
	 * @return the agriculture poultry
	 * @throws PortalException if a agriculture poultry with the primary key could not be found
	 */
	@Override
	public com.agriculture.application.form.service.model.AgriculturePoultry
			getAgriculturePoultry(long agriculturePoultryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agriculturePoultryLocalService.getAgriculturePoultry(
			agriculturePoultryId);
	}

	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.AgriculturePoultry>
			getAP_by_AAI(long agricultureApplicationId) {

		return _agriculturePoultryLocalService.getAP_by_AAI(
			agricultureApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _agriculturePoultryLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agriculturePoultryLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agriculturePoultryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the agriculture poultry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriculturePoultryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriculturePoultry the agriculture poultry
	 * @return the agriculture poultry that was updated
	 */
	@Override
	public com.agriculture.application.form.service.model.AgriculturePoultry
		updateAgriculturePoultry(
			com.agriculture.application.form.service.model.AgriculturePoultry
				agriculturePoultry) {

		return _agriculturePoultryLocalService.updateAgriculturePoultry(
			agriculturePoultry);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _agriculturePoultryLocalService.getBasePersistence();
	}

	@Override
	public AgriculturePoultryLocalService getWrappedService() {
		return _agriculturePoultryLocalService;
	}

	@Override
	public void setWrappedService(
		AgriculturePoultryLocalService agriculturePoultryLocalService) {

		_agriculturePoultryLocalService = agriculturePoultryLocalService;
	}

	private AgriculturePoultryLocalService _agriculturePoultryLocalService;

}