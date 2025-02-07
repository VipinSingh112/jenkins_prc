/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.application.form.service.model.JADSCApplication;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for JADSCApplication. This utility wraps
 * <code>com.nbp.jadsc.application.form.service.service.impl.JADSCApplicationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCApplicationLocalService
 * @generated
 */
public class JADSCApplicationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jadsc.application.form.service.service.impl.JADSCApplicationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static JADSCApplication addJADSCApplication(
		JADSCApplication jadscApplication) {

		return getService().addJADSCApplication(jadscApplication);
	}

	/**
	 * Creates a new jadsc application with the primary key. Does not add the jadsc application to the database.
	 *
	 * @param jadscApplicationId the primary key for the new jadsc application
	 * @return the new jadsc application
	 */
	public static JADSCApplication createJADSCApplication(
		long jadscApplicationId) {

		return getService().createJADSCApplication(jadscApplicationId);
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
	 * Deletes the jadsc application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplication the jadsc application
	 * @return the jadsc application that was removed
	 */
	public static JADSCApplication deleteJADSCApplication(
		JADSCApplication jadscApplication) {

		return getService().deleteJADSCApplication(jadscApplication);
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
	public static JADSCApplication deleteJADSCApplication(
			long jadscApplicationId)
		throws PortalException {

		return getService().deleteJADSCApplication(jadscApplicationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.application.form.service.model.impl.JADSCApplicationModelImpl</code>.
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

	public static JADSCApplication fetchJADSCApplication(
		long jadscApplicationId) {

		return getService().fetchJADSCApplication(jadscApplicationId);
	}

	/**
	 * Returns the jadsc application matching the UUID and group.
	 *
	 * @param uuid the jadsc application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchJADSCApplicationByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchJADSCApplicationByUuidAndGroupId(
			uuid, groupId);
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

	public static JADSCApplication getFireBrigadeByAppNo(
			String applicationNumber)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getService().getFireBrigadeByAppNo(applicationNumber);
	}

	public static JADSCApplication getFireBrigadeByEI_CI(
			String entityId, String caseId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getService().getFireBrigadeByEI_CI(entityId, caseId);
	}

	public static List<JADSCApplication> getFireBrigadeByEntityId_Status(
		String entityId, int status) {

		return getService().getFireBrigadeByEntityId_Status(entityId, status);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the jadsc application with the primary key.
	 *
	 * @param jadscApplicationId the primary key of the jadsc application
	 * @return the jadsc application
	 * @throws PortalException if a jadsc application with the primary key could not be found
	 */
	public static JADSCApplication getJADSCApplication(long jadscApplicationId)
		throws PortalException {

		return getService().getJADSCApplication(jadscApplicationId);
	}

	/**
	 * Returns the jadsc application matching the UUID and group.
	 *
	 * @param uuid the jadsc application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc application
	 * @throws PortalException if a matching jadsc application could not be found
	 */
	public static JADSCApplication getJADSCApplicationByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getJADSCApplicationByUuidAndGroupId(uuid, groupId);
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
	public static List<JADSCApplication> getJADSCApplications(
		int start, int end) {

		return getService().getJADSCApplications(start, end);
	}

	/**
	 * Returns all the jadsc applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc applications
	 * @param companyId the primary key of the company
	 * @return the matching jadsc applications, or an empty list if no matches were found
	 */
	public static List<JADSCApplication> getJADSCApplicationsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getJADSCApplicationsByUuidAndCompanyId(
			uuid, companyId);
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
	public static List<JADSCApplication> getJADSCApplicationsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return getService().getJADSCApplicationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of jadsc applications.
	 *
	 * @return the number of jadsc applications
	 */
	public static int getJADSCApplicationsCount() {
		return getService().getJADSCApplicationsCount();
	}

	public static List<JADSCApplication> getJadscByEntityId(String entityId) {
		return getService().getJadscByEntityId(entityId);
	}

	public static List<JADSCApplication> getJADSCByS_U(
		int status, long userId) {

		return getService().getJADSCByS_U(status, userId);
	}

	public static List<JADSCApplication> getJadscByStatus(int status) {
		return getService().getJadscByStatus(status);
	}

	public static List<String> getJadscDistinctCategory() {
		return getService().getJadscDistinctCategory();
	}

	public static JADSCApplication getJADSCRegstByAT_AppNo(
			String breachOfConfidentiality, String expiredLicenseAppNumber)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getService().getJADSCRegstByAT_AppNo(
			breachOfConfidentiality, expiredLicenseAppNumber);
	}

	public static JADSCApplication getJADSCStatusByCaseId(String caseId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getService().getJADSCStatusByCaseId(caseId);
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
	 * Updates the jadsc application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JADSCApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplication the jadsc application
	 * @return the jadsc application that was updated
	 */
	public static JADSCApplication updateJADSCApplication(
		JADSCApplication jadscApplication) {

		return getService().updateJADSCApplication(jadscApplication);
	}

	public static JADSCApplicationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<JADSCApplicationLocalService>
		_serviceSnapshot = new Snapshot<>(
			JADSCApplicationLocalServiceUtil.class,
			JADSCApplicationLocalService.class);

}