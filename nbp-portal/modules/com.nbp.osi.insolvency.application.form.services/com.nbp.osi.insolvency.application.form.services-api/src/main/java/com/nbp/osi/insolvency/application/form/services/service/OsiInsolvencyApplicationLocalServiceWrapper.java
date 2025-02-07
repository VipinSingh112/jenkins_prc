/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiInsolvencyApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyApplicationLocalService
 * @generated
 */
public class OsiInsolvencyApplicationLocalServiceWrapper
	implements OsiInsolvencyApplicationLocalService,
			   ServiceWrapper<OsiInsolvencyApplicationLocalService> {

	public OsiInsolvencyApplicationLocalServiceWrapper() {
		this(null);
	}

	public OsiInsolvencyApplicationLocalServiceWrapper(
		OsiInsolvencyApplicationLocalService
			osiInsolvencyApplicationLocalService) {

		_osiInsolvencyApplicationLocalService =
			osiInsolvencyApplicationLocalService;
	}

	/**
	 * Adds the osi insolvency application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyApplication the osi insolvency application
	 * @return the osi insolvency application that was added
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyApplication addOsiInsolvencyApplication(
			com.nbp.osi.insolvency.application.form.services.model.
				OsiInsolvencyApplication osiInsolvencyApplication) {

		return _osiInsolvencyApplicationLocalService.
			addOsiInsolvencyApplication(osiInsolvencyApplication);
	}

	/**
	 * Creates a new osi insolvency application with the primary key. Does not add the osi insolvency application to the database.
	 *
	 * @param osiInsolvencyId the primary key for the new osi insolvency application
	 * @return the new osi insolvency application
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyApplication createOsiInsolvencyApplication(
			long osiInsolvencyId) {

		return _osiInsolvencyApplicationLocalService.
			createOsiInsolvencyApplication(osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyApplicationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi insolvency application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyId the primary key of the osi insolvency application
	 * @return the osi insolvency application that was removed
	 * @throws PortalException if a osi insolvency application with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyApplication deleteOsiInsolvencyApplication(
				long osiInsolvencyId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyApplicationLocalService.
			deleteOsiInsolvencyApplication(osiInsolvencyId);
	}

	/**
	 * Deletes the osi insolvency application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyApplication the osi insolvency application
	 * @return the osi insolvency application that was removed
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyApplication deleteOsiInsolvencyApplication(
			com.nbp.osi.insolvency.application.form.services.model.
				OsiInsolvencyApplication osiInsolvencyApplication) {

		return _osiInsolvencyApplicationLocalService.
			deleteOsiInsolvencyApplication(osiInsolvencyApplication);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyApplicationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiInsolvencyApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiInsolvencyApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiInsolvencyApplicationLocalService.dynamicQuery();
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

		return _osiInsolvencyApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvencyApplicationModelImpl</code>.
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

		return _osiInsolvencyApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvencyApplicationModelImpl</code>.
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

		return _osiInsolvencyApplicationLocalService.dynamicQuery(
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

		return _osiInsolvencyApplicationLocalService.dynamicQueryCount(
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

		return _osiInsolvencyApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyApplication fetchOsiInsolvencyApplication(
			long osiInsolvencyId) {

		return _osiInsolvencyApplicationLocalService.
			fetchOsiInsolvencyApplication(osiInsolvencyId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiInsolvencyApplicationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiInsolvencyApplicationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiInsolvencyApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi insolvency application with the primary key.
	 *
	 * @param osiInsolvencyId the primary key of the osi insolvency application
	 * @return the osi insolvency application
	 * @throws PortalException if a osi insolvency application with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyApplication getOsiInsolvencyApplication(
				long osiInsolvencyId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyApplicationLocalService.
			getOsiInsolvencyApplication(osiInsolvencyId);
	}

	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			OsiInsolvencyApplication> getOsiInsolvencyApplicationByS_U(
				int status, long userId) {

		return _osiInsolvencyApplicationLocalService.
			getOsiInsolvencyApplicationByS_U(status, userId);
	}

	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			OsiInsolvencyApplication> getOsiInsolvencyApplicationByS_UId(
				long userId, int status) {

		return _osiInsolvencyApplicationLocalService.
			getOsiInsolvencyApplicationByS_UId(userId, status);
	}

	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			OsiInsolvencyApplication> getOsiInsolvencyApplicationByStatus(
				int status) {

		return _osiInsolvencyApplicationLocalService.
			getOsiInsolvencyApplicationByStatus(status);
	}

	/**
	 * Returns a range of all the osi insolvency applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @return the range of osi insolvency applications
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			OsiInsolvencyApplication> getOsiInsolvencyApplications(
				int start, int end) {

		return _osiInsolvencyApplicationLocalService.
			getOsiInsolvencyApplications(start, end);
	}

	/**
	 * Returns the number of osi insolvency applications.
	 *
	 * @return the number of osi insolvency applications
	 */
	@Override
	public int getOsiInsolvencyApplicationsCount() {
		return _osiInsolvencyApplicationLocalService.
			getOsiInsolvencyApplicationsCount();
	}

	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			OsiInsolvencyApplication>
				getOsiInsolvencyByApplicationStatus_Status(
					String applicantStatus, int status) {

		return _osiInsolvencyApplicationLocalService.
			getOsiInsolvencyByApplicationStatus_Status(applicantStatus, status);
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyApplication getOsiInsolvencyByAppNum(
				String applicationNumber)
			throws com.nbp.osi.insolvency.application.form.services.exception.
				NoSuchOsiInsolvencyApplicationException {

		return _osiInsolvencyApplicationLocalService.getOsiInsolvencyByAppNum(
			applicationNumber);
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyApplication getOsiInsolvencyByCaseId(String caseId)
			throws com.nbp.osi.insolvency.application.form.services.exception.
				NoSuchOsiInsolvencyApplicationException {

		return _osiInsolvencyApplicationLocalService.getOsiInsolvencyByCaseId(
			caseId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyApplicationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the osi insolvency application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyApplication the osi insolvency application
	 * @return the osi insolvency application that was updated
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyApplication updateOsiInsolvencyApplication(
			com.nbp.osi.insolvency.application.form.services.model.
				OsiInsolvencyApplication osiInsolvencyApplication) {

		return _osiInsolvencyApplicationLocalService.
			updateOsiInsolvencyApplication(osiInsolvencyApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiInsolvencyApplicationLocalService.getBasePersistence();
	}

	@Override
	public OsiInsolvencyApplicationLocalService getWrappedService() {
		return _osiInsolvencyApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		OsiInsolvencyApplicationLocalService
			osiInsolvencyApplicationLocalService) {

		_osiInsolvencyApplicationLocalService =
			osiInsolvencyApplicationLocalService;
	}

	private OsiInsolvencyApplicationLocalService
		_osiInsolvencyApplicationLocalService;

}