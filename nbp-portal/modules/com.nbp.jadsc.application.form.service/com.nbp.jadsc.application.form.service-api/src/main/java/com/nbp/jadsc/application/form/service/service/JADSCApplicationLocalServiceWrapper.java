/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JADSCApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCApplicationLocalService
 * @generated
 */
public class JADSCApplicationLocalServiceWrapper
	implements JADSCApplicationLocalService,
			   ServiceWrapper<JADSCApplicationLocalService> {

	public JADSCApplicationLocalServiceWrapper() {
		this(null);
	}

	public JADSCApplicationLocalServiceWrapper(
		JADSCApplicationLocalService jadscApplicationLocalService) {

		_jadscApplicationLocalService = jadscApplicationLocalService;
	}

	/**
	 * Adds the jadsc application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplication the jadsc application
	 * @return the jadsc application that was added
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCApplication
		addJADSCApplication(
			com.nbp.jadsc.application.form.service.model.JADSCApplication
				jadscApplication) {

		return _jadscApplicationLocalService.addJADSCApplication(
			jadscApplication);
	}

	/**
	 * Creates a new jadsc application with the primary key. Does not add the jadsc application to the database.
	 *
	 * @param jadscApplicationId the primary key for the new jadsc application
	 * @return the new jadsc application
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCApplication
		createJADSCApplication(long jadscApplicationId) {

		return _jadscApplicationLocalService.createJADSCApplication(
			jadscApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscApplicationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the jadsc application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplication the jadsc application
	 * @return the jadsc application that was removed
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCApplication
		deleteJADSCApplication(
			com.nbp.jadsc.application.form.service.model.JADSCApplication
				jadscApplication) {

		return _jadscApplicationLocalService.deleteJADSCApplication(
			jadscApplication);
	}

	/**
	 * Deletes the jadsc application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplicationId the primary key of the jadsc application
	 * @return the jadsc application that was removed
	 * @throws PortalException if a jadsc application with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCApplication
			deleteJADSCApplication(long jadscApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscApplicationLocalService.deleteJADSCApplication(
			jadscApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscApplicationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jadscApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jadscApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jadscApplicationLocalService.dynamicQuery();
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

		return _jadscApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCApplicationModelImpl</code>.
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

		return _jadscApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCApplicationModelImpl</code>.
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

		return _jadscApplicationLocalService.dynamicQuery(
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

		return _jadscApplicationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _jadscApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCApplication
		fetchJADSCApplication(long jadscApplicationId) {

		return _jadscApplicationLocalService.fetchJADSCApplication(
			jadscApplicationId);
	}

	/**
	 * Returns the jadsc application matching the UUID and group.
	 *
	 * @param uuid the jadsc application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCApplication
		fetchJADSCApplicationByUuidAndGroupId(String uuid, long groupId) {

		return _jadscApplicationLocalService.
			fetchJADSCApplicationByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jadscApplicationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _jadscApplicationLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCApplication
			getFireBrigadeByAppNo(String applicationNumber)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return _jadscApplicationLocalService.getFireBrigadeByAppNo(
			applicationNumber);
	}

	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCApplication
			getFireBrigadeByEI_CI(String entityId, String caseId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return _jadscApplicationLocalService.getFireBrigadeByEI_CI(
			entityId, caseId);
	}

	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCApplication>
			getFireBrigadeByEntityId_Status(String entityId, int status) {

		return _jadscApplicationLocalService.getFireBrigadeByEntityId_Status(
			entityId, status);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jadscApplicationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the jadsc application with the primary key.
	 *
	 * @param jadscApplicationId the primary key of the jadsc application
	 * @return the jadsc application
	 * @throws PortalException if a jadsc application with the primary key could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCApplication
			getJADSCApplication(long jadscApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscApplicationLocalService.getJADSCApplication(
			jadscApplicationId);
	}

	/**
	 * Returns the jadsc application matching the UUID and group.
	 *
	 * @param uuid the jadsc application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc application
	 * @throws PortalException if a matching jadsc application could not be found
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCApplication
			getJADSCApplicationByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscApplicationLocalService.
			getJADSCApplicationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the jadsc applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @return the range of jadsc applications
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCApplication>
			getJADSCApplications(int start, int end) {

		return _jadscApplicationLocalService.getJADSCApplications(start, end);
	}

	/**
	 * Returns all the jadsc applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc applications
	 * @param companyId the primary key of the company
	 * @return the matching jadsc applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCApplication>
			getJADSCApplicationsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _jadscApplicationLocalService.
			getJADSCApplicationsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of jadsc applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jadsc applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCApplication>
			getJADSCApplicationsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.jadsc.application.form.service.model.
						JADSCApplication> orderByComparator) {

		return _jadscApplicationLocalService.
			getJADSCApplicationsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of jadsc applications.
	 *
	 * @return the number of jadsc applications
	 */
	@Override
	public int getJADSCApplicationsCount() {
		return _jadscApplicationLocalService.getJADSCApplicationsCount();
	}

	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCApplication>
			getJadscByEntityId(String entityId) {

		return _jadscApplicationLocalService.getJadscByEntityId(entityId);
	}

	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCApplication>
			getJADSCByS_U(int status, long userId) {

		return _jadscApplicationLocalService.getJADSCByS_U(status, userId);
	}

	@Override
	public java.util.List
		<com.nbp.jadsc.application.form.service.model.JADSCApplication>
			getJadscByStatus(int status) {

		return _jadscApplicationLocalService.getJadscByStatus(status);
	}

	@Override
	public java.util.List<String> getJadscDistinctCategory() {
		return _jadscApplicationLocalService.getJadscDistinctCategory();
	}

	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCApplication
			getJADSCRegstByAT_AppNo(
				String breachOfConfidentiality, String expiredLicenseAppNumber)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return _jadscApplicationLocalService.getJADSCRegstByAT_AppNo(
			breachOfConfidentiality, expiredLicenseAppNumber);
	}

	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCApplication
			getJADSCStatusByCaseId(String caseId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return _jadscApplicationLocalService.getJADSCStatusByCaseId(caseId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jadscApplicationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the jadsc application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplication the jadsc application
	 * @return the jadsc application that was updated
	 */
	@Override
	public com.nbp.jadsc.application.form.service.model.JADSCApplication
		updateJADSCApplication(
			com.nbp.jadsc.application.form.service.model.JADSCApplication
				jadscApplication) {

		return _jadscApplicationLocalService.updateJADSCApplication(
			jadscApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jadscApplicationLocalService.getBasePersistence();
	}

	@Override
	public JADSCApplicationLocalService getWrappedService() {
		return _jadscApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		JADSCApplicationLocalService jadscApplicationLocalService) {

		_jadscApplicationLocalService = jadscApplicationLocalService;
	}

	private JADSCApplicationLocalService _jadscApplicationLocalService;

}