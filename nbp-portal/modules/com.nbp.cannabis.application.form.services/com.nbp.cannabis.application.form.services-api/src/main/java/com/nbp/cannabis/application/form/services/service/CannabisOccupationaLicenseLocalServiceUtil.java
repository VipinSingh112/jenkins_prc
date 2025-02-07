/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.application.form.services.model.CannabisOccupationaLicense;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CannabisOccupationaLicense. This utility wraps
 * <code>com.nbp.cannabis.application.form.services.service.impl.CannabisOccupationaLicenseLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisOccupationaLicenseLocalService
 * @generated
 */
public class CannabisOccupationaLicenseLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.cannabis.application.form.services.service.impl.CannabisOccupationaLicenseLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the cannabis occupationa license to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisOccupationaLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisOccupationaLicense the cannabis occupationa license
	 * @return the cannabis occupationa license that was added
	 */
	public static CannabisOccupationaLicense addCannabisOccupationaLicense(
		CannabisOccupationaLicense cannabisOccupationaLicense) {

		return getService().addCannabisOccupationaLicense(
			cannabisOccupationaLicense);
	}

	/**
	 * Creates a new cannabis occupationa license with the primary key. Does not add the cannabis occupationa license to the database.
	 *
	 * @param cannabisOccupationaLicenseId the primary key for the new cannabis occupationa license
	 * @return the new cannabis occupationa license
	 */
	public static CannabisOccupationaLicense createCannabisOccupationaLicense(
		long cannabisOccupationaLicenseId) {

		return getService().createCannabisOccupationaLicense(
			cannabisOccupationaLicenseId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	public static void deleteCA_OL_BY_Id(long cannabisId) {
		getService().deleteCA_OL_BY_Id(cannabisId);
	}

	/**
	 * Deletes the cannabis occupationa license from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisOccupationaLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisOccupationaLicense the cannabis occupationa license
	 * @return the cannabis occupationa license that was removed
	 */
	public static CannabisOccupationaLicense deleteCannabisOccupationaLicense(
		CannabisOccupationaLicense cannabisOccupationaLicense) {

		return getService().deleteCannabisOccupationaLicense(
			cannabisOccupationaLicense);
	}

	/**
	 * Deletes the cannabis occupationa license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisOccupationaLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisOccupationaLicenseId the primary key of the cannabis occupationa license
	 * @return the cannabis occupationa license that was removed
	 * @throws PortalException if a cannabis occupationa license with the primary key could not be found
	 */
	public static CannabisOccupationaLicense deleteCannabisOccupationaLicense(
			long cannabisOccupationaLicenseId)
		throws PortalException {

		return getService().deleteCannabisOccupationaLicense(
			cannabisOccupationaLicenseId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisOccupationaLicenseModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisOccupationaLicenseModelImpl</code>.
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

	public static CannabisOccupationaLicense fetchCannabisOccupationaLicense(
		long cannabisOccupationaLicenseId) {

		return getService().fetchCannabisOccupationaLicense(
			cannabisOccupationaLicenseId);
	}

	/**
	 * Returns the cannabis occupationa license matching the UUID and group.
	 *
	 * @param uuid the cannabis occupationa license's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	public static CannabisOccupationaLicense
		fetchCannabisOccupationaLicenseByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchCannabisOccupationaLicenseByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<CannabisOccupationaLicense> getCA_OL_CAI(
		long cannabisAppicationId) {

		return getService().getCA_OL_CAI(cannabisAppicationId);
	}

	/**
	 * Returns the cannabis occupationa license with the primary key.
	 *
	 * @param cannabisOccupationaLicenseId the primary key of the cannabis occupationa license
	 * @return the cannabis occupationa license
	 * @throws PortalException if a cannabis occupationa license with the primary key could not be found
	 */
	public static CannabisOccupationaLicense getCannabisOccupationaLicense(
			long cannabisOccupationaLicenseId)
		throws PortalException {

		return getService().getCannabisOccupationaLicense(
			cannabisOccupationaLicenseId);
	}

	/**
	 * Returns the cannabis occupationa license matching the UUID and group.
	 *
	 * @param uuid the cannabis occupationa license's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis occupationa license
	 * @throws PortalException if a matching cannabis occupationa license could not be found
	 */
	public static CannabisOccupationaLicense
			getCannabisOccupationaLicenseByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getCannabisOccupationaLicenseByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the cannabis occupationa licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @return the range of cannabis occupationa licenses
	 */
	public static List<CannabisOccupationaLicense>
		getCannabisOccupationaLicenses(int start, int end) {

		return getService().getCannabisOccupationaLicenses(start, end);
	}

	/**
	 * Returns all the cannabis occupationa licenses matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis occupationa licenses
	 * @param companyId the primary key of the company
	 * @return the matching cannabis occupationa licenses, or an empty list if no matches were found
	 */
	public static List<CannabisOccupationaLicense>
		getCannabisOccupationaLicensesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getCannabisOccupationaLicensesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of cannabis occupationa licenses matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis occupationa licenses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching cannabis occupationa licenses, or an empty list if no matches were found
	 */
	public static List<CannabisOccupationaLicense>
		getCannabisOccupationaLicensesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<CannabisOccupationaLicense> orderByComparator) {

		return getService().getCannabisOccupationaLicensesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of cannabis occupationa licenses.
	 *
	 * @return the number of cannabis occupationa licenses
	 */
	public static int getCannabisOccupationaLicensesCount() {
		return getService().getCannabisOccupationaLicensesCount();
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

	/**
	 * Updates the cannabis occupationa license in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisOccupationaLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisOccupationaLicense the cannabis occupationa license
	 * @return the cannabis occupationa license that was updated
	 */
	public static CannabisOccupationaLicense updateCannabisOccupationaLicense(
		CannabisOccupationaLicense cannabisOccupationaLicense) {

		return getService().updateCannabisOccupationaLicense(
			cannabisOccupationaLicense);
	}

	public static CannabisOccupationaLicenseLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CannabisOccupationaLicenseLocalService>
		_serviceSnapshot = new Snapshot<>(
			CannabisOccupationaLicenseLocalServiceUtil.class,
			CannabisOccupationaLicenseLocalService.class);

}