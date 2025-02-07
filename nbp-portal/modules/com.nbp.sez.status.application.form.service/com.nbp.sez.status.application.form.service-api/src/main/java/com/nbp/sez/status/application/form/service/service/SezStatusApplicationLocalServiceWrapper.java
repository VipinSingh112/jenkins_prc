/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezStatusApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusApplicationLocalService
 * @generated
 */
public class SezStatusApplicationLocalServiceWrapper
	implements ServiceWrapper<SezStatusApplicationLocalService>,
			   SezStatusApplicationLocalService {

	public SezStatusApplicationLocalServiceWrapper() {
		this(null);
	}

	public SezStatusApplicationLocalServiceWrapper(
		SezStatusApplicationLocalService sezStatusApplicationLocalService) {

		_sezStatusApplicationLocalService = sezStatusApplicationLocalService;
	}

	/**
	 * Adds the sez status application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusApplication the sez status application
	 * @return the sez status application that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezStatusApplication
			addSezStatusApplication(
				com.nbp.sez.status.application.form.service.model.
					SezStatusApplication sezStatusApplication) {

		return _sezStatusApplicationLocalService.addSezStatusApplication(
			sezStatusApplication);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusApplicationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez status application with the primary key. Does not add the sez status application to the database.
	 *
	 * @param sezStatusApplicationId the primary key for the new sez status application
	 * @return the new sez status application
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezStatusApplication
			createSezStatusApplication(long sezStatusApplicationId) {

		return _sezStatusApplicationLocalService.createSezStatusApplication(
			sezStatusApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusApplicationLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez status application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusApplicationId the primary key of the sez status application
	 * @return the sez status application that was removed
	 * @throws PortalException if a sez status application with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezStatusApplication
				deleteSezStatusApplication(long sezStatusApplicationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusApplicationLocalService.deleteSezStatusApplication(
			sezStatusApplicationId);
	}

	/**
	 * Deletes the sez status application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusApplication the sez status application
	 * @return the sez status application that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezStatusApplication
			deleteSezStatusApplication(
				com.nbp.sez.status.application.form.service.model.
					SezStatusApplication sezStatusApplication) {

		return _sezStatusApplicationLocalService.deleteSezStatusApplication(
			sezStatusApplication);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezStatusApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezStatusApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezStatusApplicationLocalService.dynamicQuery();
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

		return _sezStatusApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezStatusApplicationModelImpl</code>.
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

		return _sezStatusApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezStatusApplicationModelImpl</code>.
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

		return _sezStatusApplicationLocalService.dynamicQuery(
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

		return _sezStatusApplicationLocalService.dynamicQueryCount(
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

		return _sezStatusApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezStatusApplication
			fetchSezStatusApplication(long sezStatusApplicationId) {

		return _sezStatusApplicationLocalService.fetchSezStatusApplication(
			sezStatusApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezStatusApplicationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezStatusApplicationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusApplicationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.SezStatusApplication>
				getSez_By_App_Status(int status, String doYouWantTo)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezStatusApplicationException {

		return _sezStatusApplicationLocalService.getSez_By_App_Status(
			status, doYouWantTo);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezStatusApplication
				getSezByAT_AppNo(
					String typeOfTransaction, String expiredLicenseAppNumber)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezStatusApplicationException {

		return _sezStatusApplicationLocalService.getSezByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.SezStatusApplication>
			getSezByS_U(int status, long userId) {

		return _sezStatusApplicationLocalService.getSezByS_U(status, userId);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.SezStatusApplication>
			getsezByStatus(int status) {

		return _sezStatusApplicationLocalService.getsezByStatus(status);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezStatusApplication
				getSezByStatus(int status)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezStatusApplicationException {

		return _sezStatusApplicationLocalService.getSezByStatus(status);
	}

	@Override
	public java.util.List<String> getSezDistinctCategory() {
		return _sezStatusApplicationLocalService.getSezDistinctCategory();
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.SezStatusApplication>
			getSezStatus_By_EI_Status(String entityId, int status) {

		return _sezStatusApplicationLocalService.getSezStatus_By_EI_Status(
			entityId, status);
	}

	/**
	 * Returns the sez status application with the primary key.
	 *
	 * @param sezStatusApplicationId the primary key of the sez status application
	 * @return the sez status application
	 * @throws PortalException if a sez status application with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezStatusApplication
				getSezStatusApplication(long sezStatusApplicationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusApplicationLocalService.getSezStatusApplication(
			sezStatusApplicationId);
	}

	/**
	 * Returns a range of all the sez status applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @return the range of sez status applications
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.SezStatusApplication>
			getSezStatusApplications(int start, int end) {

		return _sezStatusApplicationLocalService.getSezStatusApplications(
			start, end);
	}

	/**
	 * Returns the number of sez status applications.
	 *
	 * @return the number of sez status applications
	 */
	@Override
	public int getSezStatusApplicationsCount() {
		return _sezStatusApplicationLocalService.
			getSezStatusApplicationsCount();
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezStatusApplication
				getSezStatusBY_CI(String caseId)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezStatusApplicationException {

		return _sezStatusApplicationLocalService.getSezStatusBY_CI(caseId);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezStatusApplication
				getSezStatusBy_EI_CI(String entityId, String caseId)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezStatusApplicationException {

		return _sezStatusApplicationLocalService.getSezStatusBy_EI_CI(
			entityId, caseId);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.SezStatusApplication>
			getSezStatusBy_EntityId(String entityId) {

		return _sezStatusApplicationLocalService.getSezStatusBy_EntityId(
			entityId);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezStatusApplication
				getSezStatusByAppNo(String applicationNumber)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezStatusApplicationException {

		return _sezStatusApplicationLocalService.getSezStatusByAppNo(
			applicationNumber);
	}

	/**
	 * Updates the sez status application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusApplication the sez status application
	 * @return the sez status application that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezStatusApplication
			updateSezStatusApplication(
				com.nbp.sez.status.application.form.service.model.
					SezStatusApplication sezStatusApplication) {

		return _sezStatusApplicationLocalService.updateSezStatusApplication(
			sezStatusApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezStatusApplicationLocalService.getBasePersistence();
	}

	@Override
	public SezStatusApplicationLocalService getWrappedService() {
		return _sezStatusApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		SezStatusApplicationLocalService sezStatusApplicationLocalService) {

		_sezStatusApplicationLocalService = sezStatusApplicationLocalService;
	}

	private SezStatusApplicationLocalService _sezStatusApplicationLocalService;

}