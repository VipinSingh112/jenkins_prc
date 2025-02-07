/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AgricultureAquacultureLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureAquacultureLocalService
 * @generated
 */
public class AgricultureAquacultureLocalServiceWrapper
	implements AgricultureAquacultureLocalService,
			   ServiceWrapper<AgricultureAquacultureLocalService> {

	public AgricultureAquacultureLocalServiceWrapper() {
		this(null);
	}

	public AgricultureAquacultureLocalServiceWrapper(
		AgricultureAquacultureLocalService agricultureAquacultureLocalService) {

		_agricultureAquacultureLocalService =
			agricultureAquacultureLocalService;
	}

	/**
	 * Adds the agriculture aquaculture to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureAquacultureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureAquaculture the agriculture aquaculture
	 * @return the agriculture aquaculture that was added
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureAquaculture
		addAgricultureAquaculture(
			com.agriculture.application.form.service.model.
				AgricultureAquaculture agricultureAquaculture) {

		return _agricultureAquacultureLocalService.addAgricultureAquaculture(
			agricultureAquaculture);
	}

	/**
	 * Creates a new agriculture aquaculture with the primary key. Does not add the agriculture aquaculture to the database.
	 *
	 * @param agricultureAquacultureId the primary key for the new agriculture aquaculture
	 * @return the new agriculture aquaculture
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureAquaculture
		createAgricultureAquaculture(long agricultureAquacultureId) {

		return _agricultureAquacultureLocalService.createAgricultureAquaculture(
			agricultureAquacultureId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureAquacultureLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the agriculture aquaculture from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureAquacultureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureAquaculture the agriculture aquaculture
	 * @return the agriculture aquaculture that was removed
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureAquaculture
		deleteAgricultureAquaculture(
			com.agriculture.application.form.service.model.
				AgricultureAquaculture agricultureAquaculture) {

		return _agricultureAquacultureLocalService.deleteAgricultureAquaculture(
			agricultureAquaculture);
	}

	/**
	 * Deletes the agriculture aquaculture with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureAquacultureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureAquacultureId the primary key of the agriculture aquaculture
	 * @return the agriculture aquaculture that was removed
	 * @throws PortalException if a agriculture aquaculture with the primary key could not be found
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureAquaculture
			deleteAgricultureAquaculture(long agricultureAquacultureId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureAquacultureLocalService.deleteAgricultureAquaculture(
			agricultureAquacultureId);
	}

	@Override
	public void deleteAquaById(long applicationId) {
		_agricultureAquacultureLocalService.deleteAquaById(applicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureAquacultureLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _agricultureAquacultureLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _agricultureAquacultureLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _agricultureAquacultureLocalService.dynamicQuery();
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

		return _agricultureAquacultureLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureAquacultureModelImpl</code>.
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

		return _agricultureAquacultureLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureAquacultureModelImpl</code>.
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

		return _agricultureAquacultureLocalService.dynamicQuery(
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

		return _agricultureAquacultureLocalService.dynamicQueryCount(
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

		return _agricultureAquacultureLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.agriculture.application.form.service.model.AgricultureAquaculture
		fetchAgricultureAquaculture(long agricultureAquacultureId) {

		return _agricultureAquacultureLocalService.fetchAgricultureAquaculture(
			agricultureAquacultureId);
	}

	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.AgricultureAquaculture>
			getAAqa_by_AAI(long agricultureApplicationId) {

		return _agricultureAquacultureLocalService.getAAqa_by_AAI(
			agricultureApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _agricultureAquacultureLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the agriculture aquaculture with the primary key.
	 *
	 * @param agricultureAquacultureId the primary key of the agriculture aquaculture
	 * @return the agriculture aquaculture
	 * @throws PortalException if a agriculture aquaculture with the primary key could not be found
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureAquaculture
			getAgricultureAquaculture(long agricultureAquacultureId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureAquacultureLocalService.getAgricultureAquaculture(
			agricultureAquacultureId);
	}

	/**
	 * Returns a range of all the agriculture aquacultures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureAquacultureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture aquacultures
	 * @param end the upper bound of the range of agriculture aquacultures (not inclusive)
	 * @return the range of agriculture aquacultures
	 */
	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.AgricultureAquaculture>
			getAgricultureAquacultures(int start, int end) {

		return _agricultureAquacultureLocalService.getAgricultureAquacultures(
			start, end);
	}

	/**
	 * Returns the number of agriculture aquacultures.
	 *
	 * @return the number of agriculture aquacultures
	 */
	@Override
	public int getAgricultureAquaculturesCount() {
		return _agricultureAquacultureLocalService.
			getAgricultureAquaculturesCount();
	}

	@Override
	public com.agriculture.application.form.service.model.AgricultureAquaculture
			getAgricultureById(long ApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureAquacultureException {

		return _agricultureAquacultureLocalService.getAgricultureById(
			ApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _agricultureAquacultureLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agricultureAquacultureLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureAquacultureLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the agriculture aquaculture in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureAquacultureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureAquaculture the agriculture aquaculture
	 * @return the agriculture aquaculture that was updated
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureAquaculture
		updateAgricultureAquaculture(
			com.agriculture.application.form.service.model.
				AgricultureAquaculture agricultureAquaculture) {

		return _agricultureAquacultureLocalService.updateAgricultureAquaculture(
			agricultureAquaculture);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _agricultureAquacultureLocalService.getBasePersistence();
	}

	@Override
	public AgricultureAquacultureLocalService getWrappedService() {
		return _agricultureAquacultureLocalService;
	}

	@Override
	public void setWrappedService(
		AgricultureAquacultureLocalService agricultureAquacultureLocalService) {

		_agricultureAquacultureLocalService =
			agricultureAquacultureLocalService;
	}

	private AgricultureAquacultureLocalService
		_agricultureAquacultureLocalService;

}