/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AgricultureApicultureLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureApicultureLocalService
 * @generated
 */
public class AgricultureApicultureLocalServiceWrapper
	implements AgricultureApicultureLocalService,
			   ServiceWrapper<AgricultureApicultureLocalService> {

	public AgricultureApicultureLocalServiceWrapper() {
		this(null);
	}

	public AgricultureApicultureLocalServiceWrapper(
		AgricultureApicultureLocalService agricultureApicultureLocalService) {

		_agricultureApicultureLocalService = agricultureApicultureLocalService;
	}

	/**
	 * Adds the agriculture apiculture to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureApicultureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureApiculture the agriculture apiculture
	 * @return the agriculture apiculture that was added
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureApiculture
		addAgricultureApiculture(
			com.agriculture.application.form.service.model.AgricultureApiculture
				agricultureApiculture) {

		return _agricultureApicultureLocalService.addAgricultureApiculture(
			agricultureApiculture);
	}

	/**
	 * Creates a new agriculture apiculture with the primary key. Does not add the agriculture apiculture to the database.
	 *
	 * @param agricultureApicultureId the primary key for the new agriculture apiculture
	 * @return the new agriculture apiculture
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureApiculture
		createAgricultureApiculture(long agricultureApicultureId) {

		return _agricultureApicultureLocalService.createAgricultureApiculture(
			agricultureApicultureId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureApicultureLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void deleteAgriApicultureById(long applicationId) {
		_agricultureApicultureLocalService.deleteAgriApicultureById(
			applicationId);
	}

	/**
	 * Deletes the agriculture apiculture from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureApicultureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureApiculture the agriculture apiculture
	 * @return the agriculture apiculture that was removed
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureApiculture
		deleteAgricultureApiculture(
			com.agriculture.application.form.service.model.AgricultureApiculture
				agricultureApiculture) {

		return _agricultureApicultureLocalService.deleteAgricultureApiculture(
			agricultureApiculture);
	}

	/**
	 * Deletes the agriculture apiculture with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureApicultureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureApicultureId the primary key of the agriculture apiculture
	 * @return the agriculture apiculture that was removed
	 * @throws PortalException if a agriculture apiculture with the primary key could not be found
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureApiculture
			deleteAgricultureApiculture(long agricultureApicultureId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureApicultureLocalService.deleteAgricultureApiculture(
			agricultureApicultureId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureApicultureLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _agricultureApicultureLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _agricultureApicultureLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _agricultureApicultureLocalService.dynamicQuery();
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

		return _agricultureApicultureLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureApicultureModelImpl</code>.
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

		return _agricultureApicultureLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureApicultureModelImpl</code>.
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

		return _agricultureApicultureLocalService.dynamicQuery(
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

		return _agricultureApicultureLocalService.dynamicQueryCount(
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

		return _agricultureApicultureLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.agriculture.application.form.service.model.AgricultureApiculture
		fetchAgricultureApiculture(long agricultureApicultureId) {

		return _agricultureApicultureLocalService.fetchAgricultureApiculture(
			agricultureApicultureId);
	}

	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.AgricultureApiculture>
			getAApi_by_AAI(long agricultureApplicationId) {

		return _agricultureApicultureLocalService.getAApi_by_AAI(
			agricultureApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _agricultureApicultureLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the agriculture apiculture with the primary key.
	 *
	 * @param agricultureApicultureId the primary key of the agriculture apiculture
	 * @return the agriculture apiculture
	 * @throws PortalException if a agriculture apiculture with the primary key could not be found
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureApiculture
			getAgricultureApiculture(long agricultureApicultureId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureApicultureLocalService.getAgricultureApiculture(
			agricultureApicultureId);
	}

	/**
	 * Returns a range of all the agriculture apicultures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureApicultureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture apicultures
	 * @param end the upper bound of the range of agriculture apicultures (not inclusive)
	 * @return the range of agriculture apicultures
	 */
	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.AgricultureApiculture>
			getAgricultureApicultures(int start, int end) {

		return _agricultureApicultureLocalService.getAgricultureApicultures(
			start, end);
	}

	/**
	 * Returns the number of agriculture apicultures.
	 *
	 * @return the number of agriculture apicultures
	 */
	@Override
	public int getAgricultureApiculturesCount() {
		return _agricultureApicultureLocalService.
			getAgricultureApiculturesCount();
	}

	@Override
	public com.agriculture.application.form.service.model.AgricultureApiculture
			getAgricultureById(long ApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApicultureException {

		return _agricultureApicultureLocalService.getAgricultureById(
			ApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _agricultureApicultureLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agricultureApicultureLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureApicultureLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the agriculture apiculture in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureApicultureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureApiculture the agriculture apiculture
	 * @return the agriculture apiculture that was updated
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureApiculture
		updateAgricultureApiculture(
			com.agriculture.application.form.service.model.AgricultureApiculture
				agricultureApiculture) {

		return _agricultureApicultureLocalService.updateAgricultureApiculture(
			agricultureApiculture);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _agricultureApicultureLocalService.getBasePersistence();
	}

	@Override
	public AgricultureApicultureLocalService getWrappedService() {
		return _agricultureApicultureLocalService;
	}

	@Override
	public void setWrappedService(
		AgricultureApicultureLocalService agricultureApicultureLocalService) {

		_agricultureApicultureLocalService = agricultureApicultureLocalService;
	}

	private AgricultureApicultureLocalService
		_agricultureApicultureLocalService;

}