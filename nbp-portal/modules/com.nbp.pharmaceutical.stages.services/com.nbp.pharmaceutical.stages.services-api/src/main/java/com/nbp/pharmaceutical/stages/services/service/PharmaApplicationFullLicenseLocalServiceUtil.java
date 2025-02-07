/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationFullLicense;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for PharmaApplicationFullLicense. This utility wraps
 * <code>com.nbp.pharmaceutical.stages.services.service.impl.PharmaApplicationFullLicenseLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationFullLicenseLocalService
 * @generated
 */
public class PharmaApplicationFullLicenseLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.pharmaceutical.stages.services.service.impl.PharmaApplicationFullLicenseLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the pharma application full license to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationFullLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationFullLicense the pharma application full license
	 * @return the pharma application full license that was added
	 */
	public static PharmaApplicationFullLicense addPharmaApplicationFullLicense(
		PharmaApplicationFullLicense pharmaApplicationFullLicense) {

		return getService().addPharmaApplicationFullLicense(
			pharmaApplicationFullLicense);
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
	 * Creates a new pharma application full license with the primary key. Does not add the pharma application full license to the database.
	 *
	 * @param pharmaFullLicenseId the primary key for the new pharma application full license
	 * @return the new pharma application full license
	 */
	public static PharmaApplicationFullLicense
		createPharmaApplicationFullLicense(long pharmaFullLicenseId) {

		return getService().createPharmaApplicationFullLicense(
			pharmaFullLicenseId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the pharma application full license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationFullLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaFullLicenseId the primary key of the pharma application full license
	 * @return the pharma application full license that was removed
	 * @throws PortalException if a pharma application full license with the primary key could not be found
	 */
	public static PharmaApplicationFullLicense
			deletePharmaApplicationFullLicense(long pharmaFullLicenseId)
		throws PortalException {

		return getService().deletePharmaApplicationFullLicense(
			pharmaFullLicenseId);
	}

	/**
	 * Deletes the pharma application full license from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationFullLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationFullLicense the pharma application full license
	 * @return the pharma application full license that was removed
	 */
	public static PharmaApplicationFullLicense
		deletePharmaApplicationFullLicense(
			PharmaApplicationFullLicense pharmaApplicationFullLicense) {

		return getService().deletePharmaApplicationFullLicense(
			pharmaApplicationFullLicense);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationFullLicenseModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationFullLicenseModelImpl</code>.
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

	public static PharmaApplicationFullLicense
		fetchPharmaApplicationFullLicense(long pharmaFullLicenseId) {

		return getService().fetchPharmaApplicationFullLicense(
			pharmaFullLicenseId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
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
	 * Returns the pharma application full license with the primary key.
	 *
	 * @param pharmaFullLicenseId the primary key of the pharma application full license
	 * @return the pharma application full license
	 * @throws PortalException if a pharma application full license with the primary key could not be found
	 */
	public static PharmaApplicationFullLicense getPharmaApplicationFullLicense(
			long pharmaFullLicenseId)
		throws PortalException {

		return getService().getPharmaApplicationFullLicense(
			pharmaFullLicenseId);
	}

	/**
	 * Returns a range of all the pharma application full licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationFullLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application full licenses
	 * @param end the upper bound of the range of pharma application full licenses (not inclusive)
	 * @return the range of pharma application full licenses
	 */
	public static List<PharmaApplicationFullLicense>
		getPharmaApplicationFullLicenses(int start, int end) {

		return getService().getPharmaApplicationFullLicenses(start, end);
	}

	/**
	 * Returns the number of pharma application full licenses.
	 *
	 * @return the number of pharma application full licenses
	 */
	public static int getPharmaApplicationFullLicensesCount() {
		return getService().getPharmaApplicationFullLicensesCount();
	}

	public static List<String> getPharmaDistinctCaseIdList() {
		return getService().getPharmaDistinctCaseIdList();
	}

	public static PharmaApplicationFullLicense getPharmaFullLIcense(
			String caseId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationFullLicenseException {

		return getService().getPharmaFullLIcense(caseId);
	}

	public static PharmaApplicationFullLicense getPharmaFullLIcenseBY_LN(
			String licenseNumber)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationFullLicenseException {

		return getService().getPharmaFullLIcenseBY_LN(licenseNumber);
	}

	public static List<PharmaApplicationFullLicense> getPharmaFullLIcenseByCI(
			String caseId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationFullLicenseException {

		return getService().getPharmaFullLIcenseByCI(caseId);
	}

	/**
	 * Updates the pharma application full license in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationFullLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationFullLicense the pharma application full license
	 * @return the pharma application full license that was updated
	 */
	public static PharmaApplicationFullLicense
		updatePharmaApplicationFullLicense(
			PharmaApplicationFullLicense pharmaApplicationFullLicense) {

		return getService().updatePharmaApplicationFullLicense(
			pharmaApplicationFullLicense);
	}

	public static PharmaApplicationFullLicense
		updatePharmaApplicationFullLicense(
			String caseId, String licenseNumber, java.util.Date dateOfIssue,
			String feePaid, String receiptNumber, java.util.Date dueDate,
			String leadTime) {

		return getService().updatePharmaApplicationFullLicense(
			caseId, licenseNumber, dateOfIssue, feePaid, receiptNumber, dueDate,
			leadTime);
	}

	public static PharmaApplicationFullLicenseLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<PharmaApplicationFullLicenseLocalService>
		_serviceSnapshot = new Snapshot<>(
			PharmaApplicationFullLicenseLocalServiceUtil.class,
			PharmaApplicationFullLicenseLocalService.class);

}