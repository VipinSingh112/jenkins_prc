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

import com.npm.cannabis.application.stages.services.model.CannabisConditionalLicense;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CannabisConditionalLicense. This utility wraps
 * <code>com.npm.cannabis.application.stages.services.service.impl.CannabisConditionalLicenseLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConditionalLicenseLocalService
 * @generated
 */
public class CannabisConditionalLicenseLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.npm.cannabis.application.stages.services.service.impl.CannabisConditionalLicenseLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the cannabis conditional license to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConditionalLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConditionalLicense the cannabis conditional license
	 * @return the cannabis conditional license that was added
	 */
	public static CannabisConditionalLicense addCannabisConditionalLicense(
		CannabisConditionalLicense cannabisConditionalLicense) {

		return getService().addCannabisConditionalLicense(
			cannabisConditionalLicense);
	}

	/**
	 * Creates a new cannabis conditional license with the primary key. Does not add the cannabis conditional license to the database.
	 *
	 * @param cannabisConditonalLicenseId the primary key for the new cannabis conditional license
	 * @return the new cannabis conditional license
	 */
	public static CannabisConditionalLicense createCannabisConditionalLicense(
		long cannabisConditonalLicenseId) {

		return getService().createCannabisConditionalLicense(
			cannabisConditonalLicenseId);
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
	 * Deletes the cannabis conditional license from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConditionalLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConditionalLicense the cannabis conditional license
	 * @return the cannabis conditional license that was removed
	 */
	public static CannabisConditionalLicense deleteCannabisConditionalLicense(
		CannabisConditionalLicense cannabisConditionalLicense) {

		return getService().deleteCannabisConditionalLicense(
			cannabisConditionalLicense);
	}

	/**
	 * Deletes the cannabis conditional license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConditionalLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConditonalLicenseId the primary key of the cannabis conditional license
	 * @return the cannabis conditional license that was removed
	 * @throws PortalException if a cannabis conditional license with the primary key could not be found
	 */
	public static CannabisConditionalLicense deleteCannabisConditionalLicense(
			long cannabisConditonalLicenseId)
		throws PortalException {

		return getService().deleteCannabisConditionalLicense(
			cannabisConditonalLicenseId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisConditionalLicenseModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisConditionalLicenseModelImpl</code>.
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

	public static CannabisConditionalLicense fetchCannabisConditionalLicense(
		long cannabisConditonalLicenseId) {

		return getService().fetchCannabisConditionalLicense(
			cannabisConditonalLicenseId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the cannabis conditional license with the primary key.
	 *
	 * @param cannabisConditonalLicenseId the primary key of the cannabis conditional license
	 * @return the cannabis conditional license
	 * @throws PortalException if a cannabis conditional license with the primary key could not be found
	 */
	public static CannabisConditionalLicense getCannabisConditionalLicense(
			long cannabisConditonalLicenseId)
		throws PortalException {

		return getService().getCannabisConditionalLicense(
			cannabisConditonalLicenseId);
	}

	public static CannabisConditionalLicense
			getCannabisConditionalLicenseByCaseId(String caseId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicenseException {

		return getService().getCannabisConditionalLicenseByCaseId(caseId);
	}

	/**
	 * Returns a range of all the cannabis conditional licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisConditionalLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis conditional licenses
	 * @param end the upper bound of the range of cannabis conditional licenses (not inclusive)
	 * @return the range of cannabis conditional licenses
	 */
	public static List<CannabisConditionalLicense>
		getCannabisConditionalLicenses(int start, int end) {

		return getService().getCannabisConditionalLicenses(start, end);
	}

	/**
	 * Returns the number of cannabis conditional licenses.
	 *
	 * @return the number of cannabis conditional licenses
	 */
	public static int getCannabisConditionalLicensesCount() {
		return getService().getCannabisConditionalLicensesCount();
	}

	public static List<CannabisConditionalLicense> getCCL_BycaseId(
		String caseId) {

		return getService().getCCL_BycaseId(caseId);
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
	 * Updates the cannabis conditional license in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConditionalLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConditionalLicense the cannabis conditional license
	 * @return the cannabis conditional license that was updated
	 */
	public static CannabisConditionalLicense updateCannabisConditionalLicense(
		CannabisConditionalLicense cannabisConditionalLicense) {

		return getService().updateCannabisConditionalLicense(
			cannabisConditionalLicense);
	}

	public static CannabisConditionalLicense updateCannabisConditionalLicense(
		String caseId, String numberOfextension, java.util.Date issueDate,
		java.util.Date expirationDate, String listOfPreConditions,
		long licenseFileId) {

		return getService().updateCannabisConditionalLicense(
			caseId, numberOfextension, issueDate, expirationDate,
			listOfPreConditions, licenseFileId);
	}

	public static CannabisConditionalLicenseLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CannabisConditionalLicenseLocalService>
		_serviceSnapshot = new Snapshot<>(
			CannabisConditionalLicenseLocalServiceUtil.class,
			CannabisConditionalLicenseLocalService.class);

}