/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.npm.cannabis.application.stages.services.model.CannabisLicense;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CannabisLicense. This utility wraps
 * <code>com.npm.cannabis.application.stages.services.service.impl.CannabisLicenseLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisLicenseLocalService
 * @generated
 */
public class CannabisLicenseLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.npm.cannabis.application.stages.services.service.impl.CannabisLicenseLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the cannabis license to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisLicense the cannabis license
	 * @return the cannabis license that was added
	 */
	public static CannabisLicense addCannabisLicense(
		CannabisLicense cannabisLicense) {

		return getService().addCannabisLicense(cannabisLicense);
	}

	/**
	 * Creates a new cannabis license with the primary key. Does not add the cannabis license to the database.
	 *
	 * @param cannabisLicenseId the primary key for the new cannabis license
	 * @return the new cannabis license
	 */
	public static CannabisLicense createCannabisLicense(
		long cannabisLicenseId) {

		return getService().createCannabisLicense(cannabisLicenseId);
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
	 * Deletes the cannabis license from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisLicense the cannabis license
	 * @return the cannabis license that was removed
	 */
	public static CannabisLicense deleteCannabisLicense(
		CannabisLicense cannabisLicense) {

		return getService().deleteCannabisLicense(cannabisLicense);
	}

	/**
	 * Deletes the cannabis license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisLicenseId the primary key of the cannabis license
	 * @return the cannabis license that was removed
	 * @throws PortalException if a cannabis license with the primary key could not be found
	 */
	public static CannabisLicense deleteCannabisLicense(long cannabisLicenseId)
		throws PortalException {

		return getService().deleteCannabisLicense(cannabisLicenseId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisLicenseModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisLicenseModelImpl</code>.
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

	public static CannabisLicense fetchCannabisLicense(long cannabisLicenseId) {
		return getService().fetchCannabisLicense(cannabisLicenseId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the cannabis license with the primary key.
	 *
	 * @param cannabisLicenseId the primary key of the cannabis license
	 * @return the cannabis license
	 * @throws PortalException if a cannabis license with the primary key could not be found
	 */
	public static CannabisLicense getCannabisLicense(long cannabisLicenseId)
		throws PortalException {

		return getService().getCannabisLicense(cannabisLicenseId);
	}

	public static CannabisLicense getCannabisLicenseBy_LN(
		String licenseNumber) {

		return getService().getCannabisLicenseBy_LN(licenseNumber);
	}

	public static CannabisLicense getCannabisLicenseByCaseId(String caseId) {
		return getService().getCannabisLicenseByCaseId(caseId);
	}

	/**
	 * Returns a range of all the cannabis licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis licenses
	 * @param end the upper bound of the range of cannabis licenses (not inclusive)
	 * @return the range of cannabis licenses
	 */
	public static List<CannabisLicense> getCannabisLicenses(
		int start, int end) {

		return getService().getCannabisLicenses(start, end);
	}

	/**
	 * Returns the number of cannabis licenses.
	 *
	 * @return the number of cannabis licenses
	 */
	public static int getCannabisLicensesCount() {
		return getService().getCannabisLicensesCount();
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
	 * Updates the cannabis license in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisLicense the cannabis license
	 * @return the cannabis license that was updated
	 */
	public static CannabisLicense updateCannabisLicense(
		CannabisLicense cannabisLicense) {

		return getService().updateCannabisLicense(cannabisLicense);
	}

	public static CannabisLicense updateCannabisLicenseInfo(
		String caseId, java.util.Date expirationDate, java.util.Date issueDate,
		String licenseCondtions, String nameOfBPMStep, String payentAmtDue,
		String licenseNumber) {

		return getService().updateCannabisLicenseInfo(
			caseId, expirationDate, issueDate, licenseCondtions, nameOfBPMStep,
			payentAmtDue, licenseNumber);
	}

	public static CannabisLicenseLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CannabisLicenseLocalService>
		_serviceSnapshot = new Snapshot<>(
			CannabisLicenseLocalServiceUtil.class,
			CannabisLicenseLocalService.class);

}