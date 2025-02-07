/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link WRAApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see WRAApplicationLocalService
 * @generated
 */
public class WRAApplicationLocalServiceWrapper
	implements ServiceWrapper<WRAApplicationLocalService>,
			   WRAApplicationLocalService {

	public WRAApplicationLocalServiceWrapper() {
		this(null);
	}

	public WRAApplicationLocalServiceWrapper(
		WRAApplicationLocalService wraApplicationLocalService) {

		_wraApplicationLocalService = wraApplicationLocalService;
	}

	/**
	 * Adds the wra application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraApplication the wra application
	 * @return the wra application that was added
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAApplication
		addWRAApplication(
			com.nbp.wra.application.form.service.model.WRAApplication
				wraApplication) {

		return _wraApplicationLocalService.addWRAApplication(wraApplication);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraApplicationLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new wra application with the primary key. Does not add the wra application to the database.
	 *
	 * @param wraApplicationId the primary key for the new wra application
	 * @return the new wra application
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAApplication
		createWRAApplication(long wraApplicationId) {

		return _wraApplicationLocalService.createWRAApplication(
			wraApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraApplicationLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the wra application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraApplicationId the primary key of the wra application
	 * @return the wra application that was removed
	 * @throws PortalException if a wra application with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAApplication
			deleteWRAApplication(long wraApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraApplicationLocalService.deleteWRAApplication(
			wraApplicationId);
	}

	/**
	 * Deletes the wra application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraApplication the wra application
	 * @return the wra application that was removed
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAApplication
		deleteWRAApplication(
			com.nbp.wra.application.form.service.model.WRAApplication
				wraApplication) {

		return _wraApplicationLocalService.deleteWRAApplication(wraApplication);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _wraApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _wraApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _wraApplicationLocalService.dynamicQuery();
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

		return _wraApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.WRAApplicationModelImpl</code>.
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

		return _wraApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.WRAApplicationModelImpl</code>.
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

		return _wraApplicationLocalService.dynamicQuery(
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

		return _wraApplicationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _wraApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.wra.application.form.service.model.WRAApplication
		fetchWRAApplication(long wraApplicationId) {

		return _wraApplicationLocalService.fetchWRAApplication(
			wraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _wraApplicationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _wraApplicationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _wraApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraApplicationLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.nbp.wra.application.form.service.model.WRAApplication
			getWRA_By_CaseId(String caseId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return _wraApplicationLocalService.getWRA_By_CaseId(caseId);
	}

	/**
	 * Returns the wra application with the primary key.
	 *
	 * @param wraApplicationId the primary key of the wra application
	 * @return the wra application
	 * @throws PortalException if a wra application with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAApplication
			getWRAApplication(long wraApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraApplicationLocalService.getWRAApplication(wraApplicationId);
	}

	@Override
	public com.nbp.wra.application.form.service.model.WRAApplication
			getWraApplicationBy_ApplicationNumber(String applicationNumber)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return _wraApplicationLocalService.
			getWraApplicationBy_ApplicationNumber(applicationNumber);
	}

	@Override
	public java.util.List
		<com.nbp.wra.application.form.service.model.WRAApplication>
			getWraApplicationBy_S_UI(int status, long userId) {

		return _wraApplicationLocalService.getWraApplicationBy_S_UI(
			status, userId);
	}

	@Override
	public java.util.List
		<com.nbp.wra.application.form.service.model.WRAApplication>
			getWraApplicationBy_Status(int status) {

		return _wraApplicationLocalService.getWraApplicationBy_Status(status);
	}

	@Override
	public java.util.List
		<com.nbp.wra.application.form.service.model.WRAApplication>
			getWraApplicationBy_User_Id(int status) {

		return _wraApplicationLocalService.getWraApplicationBy_User_Id(status);
	}

	/**
	 * Returns a range of all the wra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @return the range of wra applications
	 */
	@Override
	public java.util.List
		<com.nbp.wra.application.form.service.model.WRAApplication>
			getWRAApplications(int start, int end) {

		return _wraApplicationLocalService.getWRAApplications(start, end);
	}

	/**
	 * Returns the number of wra applications.
	 *
	 * @return the number of wra applications
	 */
	@Override
	public int getWRAApplicationsCount() {
		return _wraApplicationLocalService.getWRAApplicationsCount();
	}

	@Override
	public com.nbp.wra.application.form.service.model.WRAApplication
			getWraByRT_AppNo(
				String typeOfApplication, String expiredLicenseAppNumber)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return _wraApplicationLocalService.getWraByRT_AppNo(
			typeOfApplication, expiredLicenseAppNumber);
	}

	@Override
	public java.util.List<String> getWRADistinctCategories() {
		return _wraApplicationLocalService.getWRADistinctCategories();
	}

	/**
	 * Updates the wra application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraApplication the wra application
	 * @return the wra application that was updated
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAApplication
		updateWRAApplication(
			com.nbp.wra.application.form.service.model.WRAApplication
				wraApplication) {

		return _wraApplicationLocalService.updateWRAApplication(wraApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _wraApplicationLocalService.getBasePersistence();
	}

	@Override
	public WRAApplicationLocalService getWrappedService() {
		return _wraApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		WRAApplicationLocalService wraApplicationLocalService) {

		_wraApplicationLocalService = wraApplicationLocalService;
	}

	private WRAApplicationLocalService _wraApplicationLocalService;

}