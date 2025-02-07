/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcraApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcraApplicationLocalService
 * @generated
 */
public class NcraApplicationLocalServiceWrapper
	implements NcraApplicationLocalService,
			   ServiceWrapper<NcraApplicationLocalService> {

	public NcraApplicationLocalServiceWrapper() {
		this(null);
	}

	public NcraApplicationLocalServiceWrapper(
		NcraApplicationLocalService ncraApplicationLocalService) {

		_ncraApplicationLocalService = ncraApplicationLocalService;
	}

	/**
	 * Adds the ncra application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraApplication the ncra application
	 * @return the ncra application that was added
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraApplication
		addNcraApplication(
			com.nbp.ncra.application.form.service.model.NcraApplication
				ncraApplication) {

		return _ncraApplicationLocalService.addNcraApplication(ncraApplication);
	}

	/**
	 * Creates a new ncra application with the primary key. Does not add the ncra application to the database.
	 *
	 * @param ncraApplicationId the primary key for the new ncra application
	 * @return the new ncra application
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraApplication
		createNcraApplication(long ncraApplicationId) {

		return _ncraApplicationLocalService.createNcraApplication(
			ncraApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraApplicationLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the ncra application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraApplicationId the primary key of the ncra application
	 * @return the ncra application that was removed
	 * @throws PortalException if a ncra application with the primary key could not be found
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraApplication
			deleteNcraApplication(long ncraApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraApplicationLocalService.deleteNcraApplication(
			ncraApplicationId);
	}

	/**
	 * Deletes the ncra application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraApplication the ncra application
	 * @return the ncra application that was removed
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraApplication
		deleteNcraApplication(
			com.nbp.ncra.application.form.service.model.NcraApplication
				ncraApplication) {

		return _ncraApplicationLocalService.deleteNcraApplication(
			ncraApplication);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraApplicationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncraApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncraApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncraApplicationLocalService.dynamicQuery();
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

		return _ncraApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraApplicationModelImpl</code>.
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

		return _ncraApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraApplicationModelImpl</code>.
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

		return _ncraApplicationLocalService.dynamicQuery(
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

		return _ncraApplicationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ncraApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncra.application.form.service.model.NcraApplication
		fetchNcraApplication(long ncraApplicationId) {

		return _ncraApplicationLocalService.fetchNcraApplication(
			ncraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncraApplicationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncraApplicationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the ncra application with the primary key.
	 *
	 * @param ncraApplicationId the primary key of the ncra application
	 * @return the ncra application
	 * @throws PortalException if a ncra application with the primary key could not be found
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraApplication
			getNcraApplication(long ncraApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraApplicationLocalService.getNcraApplication(
			ncraApplicationId);
	}

	/**
	 * Returns a range of all the ncra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @return the range of ncra applications
	 */
	@Override
	public java.util.List
		<com.nbp.ncra.application.form.service.model.NcraApplication>
			getNcraApplications(int start, int end) {

		return _ncraApplicationLocalService.getNcraApplications(start, end);
	}

	/**
	 * Returns the number of ncra applications.
	 *
	 * @return the number of ncra applications
	 */
	@Override
	public int getNcraApplicationsCount() {
		return _ncraApplicationLocalService.getNcraApplicationsCount();
	}

	@Override
	public com.nbp.ncra.application.form.service.model.NcraApplication
			getNcraByAppNum(String applicationNumber)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return _ncraApplicationLocalService.getNcraByAppNum(applicationNumber);
	}

	@Override
	public com.nbp.ncra.application.form.service.model.NcraApplication
			getNcraByCaseId(String caseId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return _ncraApplicationLocalService.getNcraByCaseId(caseId);
	}

	@Override
	public com.nbp.ncra.application.form.service.model.NcraApplication
			getNcraByEI_CI(String entityId, String caseId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return _ncraApplicationLocalService.getNcraByEI_CI(entityId, caseId);
	}

	@Override
	public java.util.List
		<com.nbp.ncra.application.form.service.model.NcraApplication>
			getNcraByEntityId(String entityId) {

		return _ncraApplicationLocalService.getNcraByEntityId(entityId);
	}

	@Override
	public java.util.List
		<com.nbp.ncra.application.form.service.model.NcraApplication>
			getNcraByEntityId_Status(String entityId, int status) {

		return _ncraApplicationLocalService.getNcraByEntityId_Status(
			entityId, status);
	}

	@Override
	public com.nbp.ncra.application.form.service.model.NcraApplication
			getNcraByRT_AppNo(
				String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return _ncraApplicationLocalService.getNcraByRT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	@Override
	public java.util.List
		<com.nbp.ncra.application.form.service.model.NcraApplication>
			getNcraByS_U(int status, long userId) {

		return _ncraApplicationLocalService.getNcraByS_U(status, userId);
	}

	@Override
	public java.util.List
		<com.nbp.ncra.application.form.service.model.NcraApplication>
			getNcraByStatus(int status) {

		return _ncraApplicationLocalService.getNcraByStatus(status);
	}

	@Override
	public java.util.List<String> getNCRADistinctCategory() {
		return _ncraApplicationLocalService.getNCRADistinctCategory();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncraApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraApplicationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ncra application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraApplication the ncra application
	 * @return the ncra application that was updated
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraApplication
		updateNcraApplication(
			com.nbp.ncra.application.form.service.model.NcraApplication
				ncraApplication) {

		return _ncraApplicationLocalService.updateNcraApplication(
			ncraApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncraApplicationLocalService.getBasePersistence();
	}

	@Override
	public NcraApplicationLocalService getWrappedService() {
		return _ncraApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		NcraApplicationLocalService ncraApplicationLocalService) {

		_ncraApplicationLocalService = ncraApplicationLocalService;
	}

	private NcraApplicationLocalService _ncraApplicationLocalService;

}