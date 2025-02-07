/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiicApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplicationLocalService
 * @generated
 */
public class MiicApplicationLocalServiceWrapper
	implements MiicApplicationLocalService,
			   ServiceWrapper<MiicApplicationLocalService> {

	public MiicApplicationLocalServiceWrapper() {
		this(null);
	}

	public MiicApplicationLocalServiceWrapper(
		MiicApplicationLocalService miicApplicationLocalService) {

		_miicApplicationLocalService = miicApplicationLocalService;
	}

	/**
	 * Adds the miic application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplication the miic application
	 * @return the miic application that was added
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicApplication
		addMiicApplication(
			com.nbp.miic.application.form.services.model.MiicApplication
				miicApplication) {

		return _miicApplicationLocalService.addMiicApplication(miicApplication);
	}

	/**
	 * Creates a new miic application with the primary key. Does not add the miic application to the database.
	 *
	 * @param miicApplicationId the primary key for the new miic application
	 * @return the new miic application
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicApplication
		createMiicApplication(long miicApplicationId) {

		return _miicApplicationLocalService.createMiicApplication(
			miicApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicApplicationLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the miic application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplicationId the primary key of the miic application
	 * @return the miic application that was removed
	 * @throws PortalException if a miic application with the primary key could not be found
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicApplication
			deleteMiicApplication(long miicApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicApplicationLocalService.deleteMiicApplication(
			miicApplicationId);
	}

	/**
	 * Deletes the miic application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplication the miic application
	 * @return the miic application that was removed
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicApplication
		deleteMiicApplication(
			com.nbp.miic.application.form.services.model.MiicApplication
				miicApplication) {

		return _miicApplicationLocalService.deleteMiicApplication(
			miicApplication);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicApplicationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miicApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miicApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miicApplicationLocalService.dynamicQuery();
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

		return _miicApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicApplicationModelImpl</code>.
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

		return _miicApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicApplicationModelImpl</code>.
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

		return _miicApplicationLocalService.dynamicQuery(
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

		return _miicApplicationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _miicApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.miic.application.form.services.model.MiicApplication
		fetchMiicApplication(long miicApplicationId) {

		return _miicApplicationLocalService.fetchMiicApplication(
			miicApplicationId);
	}

	/**
	 * Returns the miic application matching the UUID and group.
	 *
	 * @param uuid the miic application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicApplication
		fetchMiicApplicationByUuidAndGroupId(String uuid, long groupId) {

		return _miicApplicationLocalService.
			fetchMiicApplicationByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miicApplicationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _miicApplicationLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miicApplicationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the miic application with the primary key.
	 *
	 * @param miicApplicationId the primary key of the miic application
	 * @return the miic application
	 * @throws PortalException if a miic application with the primary key could not be found
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicApplication
			getMiicApplication(long miicApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicApplicationLocalService.getMiicApplication(
			miicApplicationId);
	}

	/**
	 * Returns the miic application matching the UUID and group.
	 *
	 * @param uuid the miic application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching miic application
	 * @throws PortalException if a matching miic application could not be found
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicApplication
			getMiicApplicationByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicApplicationLocalService.getMiicApplicationByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the miic applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @return the range of miic applications
	 */
	@Override
	public java.util.List
		<com.nbp.miic.application.form.services.model.MiicApplication>
			getMiicApplications(int start, int end) {

		return _miicApplicationLocalService.getMiicApplications(start, end);
	}

	/**
	 * Returns all the miic applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the miic applications
	 * @param companyId the primary key of the company
	 * @return the matching miic applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.miic.application.form.services.model.MiicApplication>
			getMiicApplicationsByUuidAndCompanyId(String uuid, long companyId) {

		return _miicApplicationLocalService.
			getMiicApplicationsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of miic applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the miic applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching miic applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.miic.application.form.services.model.MiicApplication>
			getMiicApplicationsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.miic.application.form.services.model.
						MiicApplication> orderByComparator) {

		return _miicApplicationLocalService.
			getMiicApplicationsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of miic applications.
	 *
	 * @return the number of miic applications
	 */
	@Override
	public int getMiicApplicationsCount() {
		return _miicApplicationLocalService.getMiicApplicationsCount();
	}

	@Override
	public com.nbp.miic.application.form.services.model.MiicApplication
			getMIICByAppNo(String applicationNumber)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return _miicApplicationLocalService.getMIICByAppNo(applicationNumber);
	}

	@Override
	public com.nbp.miic.application.form.services.model.MiicApplication
			getMIICByAT_AppNo(
				String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return _miicApplicationLocalService.getMIICByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	@Override
	public com.nbp.miic.application.form.services.model.MiicApplication
			getMIICByEI_CI(String entityId, String caseId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return _miicApplicationLocalService.getMIICByEI_CI(entityId, caseId);
	}

	@Override
	public java.util.List
		<com.nbp.miic.application.form.services.model.MiicApplication>
			getMIICByEntityId(String entityId) {

		return _miicApplicationLocalService.getMIICByEntityId(entityId);
	}

	@Override
	public java.util.List
		<com.nbp.miic.application.form.services.model.MiicApplication>
			getMIICByEntityId_Status(String entityId, int status) {

		return _miicApplicationLocalService.getMIICByEntityId_Status(
			entityId, status);
	}

	@Override
	public java.util.List
		<com.nbp.miic.application.form.services.model.MiicApplication>
			getMIICByS_U(int status, long userId) {

		return _miicApplicationLocalService.getMIICByS_U(status, userId);
	}

	@Override
	public java.util.List
		<com.nbp.miic.application.form.services.model.MiicApplication>
			getMIICByStatus(int status) {

		return _miicApplicationLocalService.getMIICByStatus(status);
	}

	@Override
	public java.util.List<String> getMiicDistinctCategories() {
		return _miicApplicationLocalService.getMiicDistinctCategories();
	}

	@Override
	public com.nbp.miic.application.form.services.model.MiicApplication
			getMIICStatusByCaseId(String caseId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return _miicApplicationLocalService.getMIICStatusByCaseId(caseId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miicApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicApplicationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the miic application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplication the miic application
	 * @return the miic application that was updated
	 */
	@Override
	public com.nbp.miic.application.form.services.model.MiicApplication
		updateMiicApplication(
			com.nbp.miic.application.form.services.model.MiicApplication
				miicApplication) {

		return _miicApplicationLocalService.updateMiicApplication(
			miicApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miicApplicationLocalService.getBasePersistence();
	}

	@Override
	public MiicApplicationLocalService getWrappedService() {
		return _miicApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		MiicApplicationLocalService miicApplicationLocalService) {

		_miicApplicationLocalService = miicApplicationLocalService;
	}

	private MiicApplicationLocalService _miicApplicationLocalService;

}