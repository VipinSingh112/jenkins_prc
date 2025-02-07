/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjApplication;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for NcbjApplication. This utility wraps
 * <code>com.nbp.ncbj.application.form.service.service.impl.NcbjApplicationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicationLocalService
 * @generated
 */
public class NcbjApplicationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.ncbj.application.form.service.service.impl.NcbjApplicationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static NcbjApplication addNcbjApplication(
		NcbjApplication ncbjApplication) {

		return getService().addNcbjApplication(ncbjApplication);
	}

	/**
	 * Creates a new ncbj application with the primary key. Does not add the ncbj application to the database.
	 *
	 * @param ncbjApplicationId the primary key for the new ncbj application
	 * @return the new ncbj application
	 */
	public static NcbjApplication createNcbjApplication(
		long ncbjApplicationId) {

		return getService().createNcbjApplication(ncbjApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
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
	public static NcbjApplication deleteNcbjApplication(long ncbjApplicationId)
		throws PortalException {

		return getService().deleteNcbjApplication(ncbjApplicationId);
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
	public static NcbjApplication deleteNcbjApplication(
		NcbjApplication ncbjApplication) {

		return getService().deleteNcbjApplication(ncbjApplication);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static NcbjApplication fetchNcbjApplication(long ncbjApplicationId) {
		return getService().fetchNcbjApplication(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj application matching the UUID and group.
	 *
	 * @param uuid the ncbj application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public static NcbjApplication fetchNcbjApplicationByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchNcbjApplicationByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static NcbjApplication getNcbj_By_App_Num(String applicationNumber)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getService().getNcbj_By_App_Num(applicationNumber);
	}

	public static List<NcbjApplication> getNCBJAppBy_AppNum(
		String applicationNumber) {

		return getService().getNCBJAppBy_AppNum(applicationNumber);
	}

	public static List<NcbjApplication> getNCBJAppBy_S_U(
		long userId, int status) {

		return getService().getNCBJAppBy_S_U(userId, status);
	}

	public static List<NcbjApplication> getNCBJAppBy_Status(int status) {
		return getService().getNCBJAppBy_Status(status);
	}

	/**
	 * Returns the ncbj application with the primary key.
	 *
	 * @param ncbjApplicationId the primary key of the ncbj application
	 * @return the ncbj application
	 * @throws PortalException if a ncbj application with the primary key could not be found
	 */
	public static NcbjApplication getNcbjApplication(long ncbjApplicationId)
		throws PortalException {

		return getService().getNcbjApplication(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj application matching the UUID and group.
	 *
	 * @param uuid the ncbj application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ncbj application
	 * @throws PortalException if a matching ncbj application could not be found
	 */
	public static NcbjApplication getNcbjApplicationByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getNcbjApplicationByUuidAndGroupId(uuid, groupId);
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
	public static List<NcbjApplication> getNcbjApplications(
		int start, int end) {

		return getService().getNcbjApplications(start, end);
	}

	/**
	 * Returns all the ncbj applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the ncbj applications
	 * @param companyId the primary key of the company
	 * @return the matching ncbj applications, or an empty list if no matches were found
	 */
	public static List<NcbjApplication> getNcbjApplicationsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getNcbjApplicationsByUuidAndCompanyId(
			uuid, companyId);
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
	public static List<NcbjApplication> getNcbjApplicationsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator) {

		return getService().getNcbjApplicationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of ncbj applications.
	 *
	 * @return the number of ncbj applications
	 */
	public static int getNcbjApplicationsCount() {
		return getService().getNcbjApplicationsCount();
	}

	public static NcbjApplication getNCBJByCaseId(String caseId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getService().getNCBJByCaseId(caseId);
	}

	public static NcbjApplication getNcbjByRT_AppNo(
			String typeOfServices, String expiredLicenseAppNumber)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getService().getNcbjByRT_AppNo(
			typeOfServices, expiredLicenseAppNumber);
	}

	public static List<String> getNCBJDistinctCategory() {
		return getService().getNCBJDistinctCategory();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
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
	public static NcbjApplication updateNcbjApplication(
		NcbjApplication ncbjApplication) {

		return getService().updateNcbjApplication(ncbjApplication);
	}

	public static NcbjApplicationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<NcbjApplicationLocalService>
		_serviceSnapshot = new Snapshot<>(
			NcbjApplicationLocalServiceUtil.class,
			NcbjApplicationLocalService.class);

}