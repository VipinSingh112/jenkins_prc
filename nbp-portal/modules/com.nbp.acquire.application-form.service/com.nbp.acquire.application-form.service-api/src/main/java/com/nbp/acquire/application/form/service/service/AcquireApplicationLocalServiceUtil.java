/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.application.form.service.model.AcquireApplication;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AcquireApplication. This utility wraps
 * <code>com.nbp.acquire.application.form.service.service.impl.AcquireApplicationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireApplicationLocalService
 * @generated
 */
public class AcquireApplicationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.acquire.application.form.service.service.impl.AcquireApplicationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the acquire application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireApplication the acquire application
	 * @return the acquire application that was added
	 */
	public static AcquireApplication addAcquireApplication(
		AcquireApplication acquireApplication) {

		return getService().addAcquireApplication(acquireApplication);
	}

	/**
	 * Creates a new acquire application with the primary key. Does not add the acquire application to the database.
	 *
	 * @param acquireApplicationId the primary key for the new acquire application
	 * @return the new acquire application
	 */
	public static AcquireApplication createAcquireApplication(
		long acquireApplicationId) {

		return getService().createAcquireApplication(acquireApplicationId);
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
	 * Deletes the acquire application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireApplication the acquire application
	 * @return the acquire application that was removed
	 */
	public static AcquireApplication deleteAcquireApplication(
		AcquireApplication acquireApplication) {

		return getService().deleteAcquireApplication(acquireApplication);
	}

	/**
	 * Deletes the acquire application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireApplicationId the primary key of the acquire application
	 * @return the acquire application that was removed
	 * @throws PortalException if a acquire application with the primary key could not be found
	 */
	public static AcquireApplication deleteAcquireApplication(
			long acquireApplicationId)
		throws PortalException {

		return getService().deleteAcquireApplication(acquireApplicationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireApplicationModelImpl</code>.
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

	public static AcquireApplication fetchAcquireApplication(
		long acquireApplicationId) {

		return getService().fetchAcquireApplication(acquireApplicationId);
	}

	/**
	 * Returns the acquire application matching the UUID and group.
	 *
	 * @param uuid the acquire application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public static AcquireApplication fetchAcquireApplicationByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchAcquireApplicationByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns the acquire application with the primary key.
	 *
	 * @param acquireApplicationId the primary key of the acquire application
	 * @return the acquire application
	 * @throws PortalException if a acquire application with the primary key could not be found
	 */
	public static AcquireApplication getAcquireApplication(
			long acquireApplicationId)
		throws PortalException {

		return getService().getAcquireApplication(acquireApplicationId);
	}

	/**
	 * Returns the acquire application matching the UUID and group.
	 *
	 * @param uuid the acquire application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acquire application
	 * @throws PortalException if a matching acquire application could not be found
	 */
	public static AcquireApplication getAcquireApplicationByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getAcquireApplicationByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the acquire applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @return the range of acquire applications
	 */
	public static List<AcquireApplication> getAcquireApplications(
		int start, int end) {

		return getService().getAcquireApplications(start, end);
	}

	/**
	 * Returns all the acquire applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the acquire applications
	 * @param companyId the primary key of the company
	 * @return the matching acquire applications, or an empty list if no matches were found
	 */
	public static List<AcquireApplication>
		getAcquireApplicationsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getAcquireApplicationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of acquire applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the acquire applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acquire applications, or an empty list if no matches were found
	 */
	public static List<AcquireApplication>
		getAcquireApplicationsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<AcquireApplication> orderByComparator) {

		return getService().getAcquireApplicationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acquire applications.
	 *
	 * @return the number of acquire applications
	 */
	public static int getAcquireApplicationsCount() {
		return getService().getAcquireApplicationsCount();
	}

	public static AcquireApplication getAcquireByAppNum(
			String applicationNumber)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getService().getAcquireByAppNum(applicationNumber);
	}

	public static List<AcquireApplication> getAcquireByS_U(
			int status, long userId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getService().getAcquireByS_U(status, userId);
	}

	public static List<AcquireApplication> getAcquireByStatus(int status)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getService().getAcquireByStatus(status);
	}

	public static List<String> getAcquireDistinctStages() {
		return getService().getAcquireDistinctStages();
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

	public static AcquireApplication getPharmaByCaseId(String caseId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getService().getPharmaByCaseId(caseId);
	}

	/**
	 * Updates the acquire application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireApplication the acquire application
	 * @return the acquire application that was updated
	 */
	public static AcquireApplication updateAcquireApplication(
		AcquireApplication acquireApplication) {

		return getService().updateAcquireApplication(acquireApplication);
	}

	public static AcquireApplicationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AcquireApplicationLocalService>
		_serviceSnapshot = new Snapshot<>(
			AcquireApplicationLocalServiceUtil.class,
			AcquireApplicationLocalService.class);

}