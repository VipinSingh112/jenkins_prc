/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.miic.application.form.services.model.MiicApplication;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MiicApplication. This utility wraps
 * <code>com.nbp.miic.application.form.services.service.impl.MiicApplicationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplicationLocalService
 * @generated
 */
public class MiicApplicationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.miic.application.form.services.service.impl.MiicApplicationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static MiicApplication addMiicApplication(
		MiicApplication miicApplication) {

		return getService().addMiicApplication(miicApplication);
	}

	/**
	 * Creates a new miic application with the primary key. Does not add the miic application to the database.
	 *
	 * @param miicApplicationId the primary key for the new miic application
	 * @return the new miic application
	 */
	public static MiicApplication createMiicApplication(
		long miicApplicationId) {

		return getService().createMiicApplication(miicApplicationId);
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
	public static MiicApplication deleteMiicApplication(long miicApplicationId)
		throws PortalException {

		return getService().deleteMiicApplication(miicApplicationId);
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
	public static MiicApplication deleteMiicApplication(
		MiicApplication miicApplication) {

		return getService().deleteMiicApplication(miicApplication);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.application.form.services.model.impl.MiicApplicationModelImpl</code>.
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

	public static MiicApplication fetchMiicApplication(long miicApplicationId) {
		return getService().fetchMiicApplication(miicApplicationId);
	}

	/**
	 * Returns the miic application matching the UUID and group.
	 *
	 * @param uuid the miic application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	public static MiicApplication fetchMiicApplicationByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchMiicApplicationByUuidAndGroupId(uuid, groupId);
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
	 * Returns the miic application with the primary key.
	 *
	 * @param miicApplicationId the primary key of the miic application
	 * @return the miic application
	 * @throws PortalException if a miic application with the primary key could not be found
	 */
	public static MiicApplication getMiicApplication(long miicApplicationId)
		throws PortalException {

		return getService().getMiicApplication(miicApplicationId);
	}

	/**
	 * Returns the miic application matching the UUID and group.
	 *
	 * @param uuid the miic application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching miic application
	 * @throws PortalException if a matching miic application could not be found
	 */
	public static MiicApplication getMiicApplicationByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getMiicApplicationByUuidAndGroupId(uuid, groupId);
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
	public static List<MiicApplication> getMiicApplications(
		int start, int end) {

		return getService().getMiicApplications(start, end);
	}

	/**
	 * Returns all the miic applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the miic applications
	 * @param companyId the primary key of the company
	 * @return the matching miic applications, or an empty list if no matches were found
	 */
	public static List<MiicApplication> getMiicApplicationsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getMiicApplicationsByUuidAndCompanyId(
			uuid, companyId);
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
	public static List<MiicApplication> getMiicApplicationsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator) {

		return getService().getMiicApplicationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of miic applications.
	 *
	 * @return the number of miic applications
	 */
	public static int getMiicApplicationsCount() {
		return getService().getMiicApplicationsCount();
	}

	public static MiicApplication getMIICByAppNo(String applicationNumber)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getService().getMIICByAppNo(applicationNumber);
	}

	public static MiicApplication getMIICByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getService().getMIICByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	public static MiicApplication getMIICByEI_CI(String entityId, String caseId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getService().getMIICByEI_CI(entityId, caseId);
	}

	public static List<MiicApplication> getMIICByEntityId(String entityId) {
		return getService().getMIICByEntityId(entityId);
	}

	public static List<MiicApplication> getMIICByEntityId_Status(
		String entityId, int status) {

		return getService().getMIICByEntityId_Status(entityId, status);
	}

	public static List<MiicApplication> getMIICByS_U(int status, long userId) {
		return getService().getMIICByS_U(status, userId);
	}

	public static List<MiicApplication> getMIICByStatus(int status) {
		return getService().getMIICByStatus(status);
	}

	public static List<String> getMiicDistinctCategories() {
		return getService().getMiicDistinctCategories();
	}

	public static MiicApplication getMIICStatusByCaseId(String caseId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicationException {

		return getService().getMIICStatusByCaseId(caseId);
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
	 * Updates the miic application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplication the miic application
	 * @return the miic application that was updated
	 */
	public static MiicApplication updateMiicApplication(
		MiicApplication miicApplication) {

		return getService().updateMiicApplication(miicApplication);
	}

	public static MiicApplicationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MiicApplicationLocalService>
		_serviceSnapshot = new Snapshot<>(
			MiicApplicationLocalServiceUtil.class,
			MiicApplicationLocalService.class);

}