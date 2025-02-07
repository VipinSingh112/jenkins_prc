/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicationLocalService
 * @generated
 */
public class NcbjApplicationLocalServiceWrapper
	implements NcbjApplicationLocalService,
			   ServiceWrapper<NcbjApplicationLocalService> {

	public NcbjApplicationLocalServiceWrapper() {
		this(null);
	}

	public NcbjApplicationLocalServiceWrapper(
		NcbjApplicationLocalService ncbjApplicationLocalService) {

		_ncbjApplicationLocalService = ncbjApplicationLocalService;
	}

	/**
	 * Adds the ncbj application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplication the ncbj application
	 * @return the ncbj application that was added
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjApplication
		addNcbjApplication(
			com.nbp.ncbj.application.form.service.model.NcbjApplication
				ncbjApplication) {

		return _ncbjApplicationLocalService.addNcbjApplication(ncbjApplication);
	}

	/**
	 * Creates a new ncbj application with the primary key. Does not add the ncbj application to the database.
	 *
	 * @param ncbjApplicationId the primary key for the new ncbj application
	 * @return the new ncbj application
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjApplication
		createNcbjApplication(long ncbjApplicationId) {

		return _ncbjApplicationLocalService.createNcbjApplication(
			ncbjApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjApplicationLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the ncbj application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplicationId the primary key of the ncbj application
	 * @return the ncbj application that was removed
	 * @throws PortalException if a ncbj application with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjApplication
			deleteNcbjApplication(long ncbjApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjApplicationLocalService.deleteNcbjApplication(
			ncbjApplicationId);
	}

	/**
	 * Deletes the ncbj application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplication the ncbj application
	 * @return the ncbj application that was removed
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjApplication
		deleteNcbjApplication(
			com.nbp.ncbj.application.form.service.model.NcbjApplication
				ncbjApplication) {

		return _ncbjApplicationLocalService.deleteNcbjApplication(
			ncbjApplication);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjApplicationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjApplicationLocalService.dynamicQuery();
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

		return _ncbjApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjApplicationModelImpl</code>.
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

		return _ncbjApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjApplicationModelImpl</code>.
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

		return _ncbjApplicationLocalService.dynamicQuery(
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

		return _ncbjApplicationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ncbjApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjApplication
		fetchNcbjApplication(long ncbjApplicationId) {

		return _ncbjApplicationLocalService.fetchNcbjApplication(
			ncbjApplicationId);
	}

	/**
	 * Returns the ncbj application matching the UUID and group.
	 *
	 * @param uuid the ncbj application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjApplication
		fetchNcbjApplicationByUuidAndGroupId(String uuid, long groupId) {

		return _ncbjApplicationLocalService.
			fetchNcbjApplicationByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjApplicationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _ncbjApplicationLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjApplicationLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjApplication
			getNcbj_By_App_Num(String applicationNumber)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return _ncbjApplicationLocalService.getNcbj_By_App_Num(
			applicationNumber);
	}

	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjApplication>
			getNCBJAppBy_AppNum(String applicationNumber) {

		return _ncbjApplicationLocalService.getNCBJAppBy_AppNum(
			applicationNumber);
	}

	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjApplication>
			getNCBJAppBy_S_U(long userId, int status) {

		return _ncbjApplicationLocalService.getNCBJAppBy_S_U(userId, status);
	}

	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjApplication>
			getNCBJAppBy_Status(int status) {

		return _ncbjApplicationLocalService.getNCBJAppBy_Status(status);
	}

	/**
	 * Returns the ncbj application with the primary key.
	 *
	 * @param ncbjApplicationId the primary key of the ncbj application
	 * @return the ncbj application
	 * @throws PortalException if a ncbj application with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjApplication
			getNcbjApplication(long ncbjApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjApplicationLocalService.getNcbjApplication(
			ncbjApplicationId);
	}

	/**
	 * Returns the ncbj application matching the UUID and group.
	 *
	 * @param uuid the ncbj application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ncbj application
	 * @throws PortalException if a matching ncbj application could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjApplication
			getNcbjApplicationByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjApplicationLocalService.getNcbjApplicationByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the ncbj applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @return the range of ncbj applications
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjApplication>
			getNcbjApplications(int start, int end) {

		return _ncbjApplicationLocalService.getNcbjApplications(start, end);
	}

	/**
	 * Returns all the ncbj applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the ncbj applications
	 * @param companyId the primary key of the company
	 * @return the matching ncbj applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjApplication>
			getNcbjApplicationsByUuidAndCompanyId(String uuid, long companyId) {

		return _ncbjApplicationLocalService.
			getNcbjApplicationsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of ncbj applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the ncbj applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching ncbj applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjApplication>
			getNcbjApplicationsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.ncbj.application.form.service.model.
						NcbjApplication> orderByComparator) {

		return _ncbjApplicationLocalService.
			getNcbjApplicationsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of ncbj applications.
	 *
	 * @return the number of ncbj applications
	 */
	@Override
	public int getNcbjApplicationsCount() {
		return _ncbjApplicationLocalService.getNcbjApplicationsCount();
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjApplication
			getNCBJByCaseId(String caseId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return _ncbjApplicationLocalService.getNCBJByCaseId(caseId);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjApplication
			getNcbjByRT_AppNo(
				String typeOfServices, String expiredLicenseAppNumber)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return _ncbjApplicationLocalService.getNcbjByRT_AppNo(
			typeOfServices, expiredLicenseAppNumber);
	}

	@Override
	public java.util.List<String> getNCBJDistinctCategory() {
		return _ncbjApplicationLocalService.getNCBJDistinctCategory();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjApplicationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ncbj application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplication the ncbj application
	 * @return the ncbj application that was updated
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjApplication
		updateNcbjApplication(
			com.nbp.ncbj.application.form.service.model.NcbjApplication
				ncbjApplication) {

		return _ncbjApplicationLocalService.updateNcbjApplication(
			ncbjApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjApplicationLocalService.getBasePersistence();
	}

	@Override
	public NcbjApplicationLocalService getWrappedService() {
		return _ncbjApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjApplicationLocalService ncbjApplicationLocalService) {

		_ncbjApplicationLocalService = ncbjApplicationLocalService;
	}

	private NcbjApplicationLocalService _ncbjApplicationLocalService;

}