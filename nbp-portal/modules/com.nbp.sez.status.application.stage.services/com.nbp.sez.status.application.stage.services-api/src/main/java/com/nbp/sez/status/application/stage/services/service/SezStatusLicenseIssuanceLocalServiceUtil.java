/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.stage.services.model.SezStatusLicenseIssuance;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for SezStatusLicenseIssuance. This utility wraps
 * <code>com.nbp.sez.status.application.stage.services.service.impl.SezStatusLicenseIssuanceLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusLicenseIssuanceLocalService
 * @generated
 */
public class SezStatusLicenseIssuanceLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.sez.status.application.stage.services.service.impl.SezStatusLicenseIssuanceLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the sez status license issuance to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusLicenseIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusLicenseIssuance the sez status license issuance
	 * @return the sez status license issuance that was added
	 */
	public static SezStatusLicenseIssuance addSezStatusLicenseIssuance(
		SezStatusLicenseIssuance sezStatusLicenseIssuance) {

		return getService().addSezStatusLicenseIssuance(
			sezStatusLicenseIssuance);
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
	 * Creates a new sez status license issuance with the primary key. Does not add the sez status license issuance to the database.
	 *
	 * @param sezStatusLicIssuedId the primary key for the new sez status license issuance
	 * @return the new sez status license issuance
	 */
	public static SezStatusLicenseIssuance createSezStatusLicenseIssuance(
		long sezStatusLicIssuedId) {

		return getService().createSezStatusLicenseIssuance(
			sezStatusLicIssuedId);
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
	 * Deletes the sez status license issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusLicenseIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusLicIssuedId the primary key of the sez status license issuance
	 * @return the sez status license issuance that was removed
	 * @throws PortalException if a sez status license issuance with the primary key could not be found
	 */
	public static SezStatusLicenseIssuance deleteSezStatusLicenseIssuance(
			long sezStatusLicIssuedId)
		throws PortalException {

		return getService().deleteSezStatusLicenseIssuance(
			sezStatusLicIssuedId);
	}

	/**
	 * Deletes the sez status license issuance from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusLicenseIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusLicenseIssuance the sez status license issuance
	 * @return the sez status license issuance that was removed
	 */
	public static SezStatusLicenseIssuance deleteSezStatusLicenseIssuance(
		SezStatusLicenseIssuance sezStatusLicenseIssuance) {

		return getService().deleteSezStatusLicenseIssuance(
			sezStatusLicenseIssuance);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusLicenseIssuanceModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusLicenseIssuanceModelImpl</code>.
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

	public static SezStatusLicenseIssuance fetchSezStatusLicenseIssuance(
		long sezStatusLicIssuedId) {

		return getService().fetchSezStatusLicenseIssuance(sezStatusLicIssuedId);
	}

	/**
	 * Returns the sez status license issuance matching the UUID and group.
	 *
	 * @param uuid the sez status license issuance's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sez status license issuance, or <code>null</code> if a matching sez status license issuance could not be found
	 */
	public static SezStatusLicenseIssuance
		fetchSezStatusLicenseIssuanceByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchSezStatusLicenseIssuanceByUuidAndGroupId(
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

	public static SezStatusLicenseIssuance getSezStatus_License_Issuance_By_Id(
			String caseId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusLicenseIssuanceException {

		return getService().getSezStatus_License_Issuance_By_Id(caseId);
	}

	/**
	 * Returns the sez status license issuance with the primary key.
	 *
	 * @param sezStatusLicIssuedId the primary key of the sez status license issuance
	 * @return the sez status license issuance
	 * @throws PortalException if a sez status license issuance with the primary key could not be found
	 */
	public static SezStatusLicenseIssuance getSezStatusLicenseIssuance(
			long sezStatusLicIssuedId)
		throws PortalException {

		return getService().getSezStatusLicenseIssuance(sezStatusLicIssuedId);
	}

	/**
	 * Returns the sez status license issuance matching the UUID and group.
	 *
	 * @param uuid the sez status license issuance's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sez status license issuance
	 * @throws PortalException if a matching sez status license issuance could not be found
	 */
	public static SezStatusLicenseIssuance
			getSezStatusLicenseIssuanceByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getSezStatusLicenseIssuanceByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the sez status license issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @return the range of sez status license issuances
	 */
	public static List<SezStatusLicenseIssuance> getSezStatusLicenseIssuances(
		int start, int end) {

		return getService().getSezStatusLicenseIssuances(start, end);
	}

	/**
	 * Returns all the sez status license issuances matching the UUID and company.
	 *
	 * @param uuid the UUID of the sez status license issuances
	 * @param companyId the primary key of the company
	 * @return the matching sez status license issuances, or an empty list if no matches were found
	 */
	public static List<SezStatusLicenseIssuance>
		getSezStatusLicenseIssuancesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getSezStatusLicenseIssuancesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of sez status license issuances matching the UUID and company.
	 *
	 * @param uuid the UUID of the sez status license issuances
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of sez status license issuances
	 * @param end the upper bound of the range of sez status license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching sez status license issuances, or an empty list if no matches were found
	 */
	public static List<SezStatusLicenseIssuance>
		getSezStatusLicenseIssuancesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<SezStatusLicenseIssuance> orderByComparator) {

		return getService().getSezStatusLicenseIssuancesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of sez status license issuances.
	 *
	 * @return the number of sez status license issuances
	 */
	public static int getSezStatusLicenseIssuancesCount() {
		return getService().getSezStatusLicenseIssuancesCount();
	}

	public static SezStatusLicenseIssuance updateSezStatus_License_(
		String caseId, String nameOfApplicant, String licenseNumber,
		String sezStatus, java.util.Date dateOfLicenseIssued,
		java.util.Date dateOfLicenseExpiration, long licenceFileEntryId,
		String sezDeveloperNumber) {

		return getService().updateSezStatus_License_(
			caseId, nameOfApplicant, licenseNumber, sezStatus,
			dateOfLicenseIssued, dateOfLicenseExpiration, licenceFileEntryId,
			sezDeveloperNumber);
	}

	public static SezStatusLicenseIssuance updateSezStatus_License_Issuance(
		String caseId, java.util.Date dateOfLicenseIssued,
		java.util.Date dateOfLicenseExpiration, long licenceFileEntryId) {

		return getService().updateSezStatus_License_Issuance(
			caseId, dateOfLicenseIssued, dateOfLicenseExpiration,
			licenceFileEntryId);
	}

	public static SezStatusLicenseIssuance updateSezStatus_License_Issuance_(
		String caseId, String nameOfApplicant, String licenseNumber,
		String sezStatus, java.util.Date dateOfLicenseIssued,
		java.util.Date dateOfLicenseExpiration, long licenceFileEntryId) {

		return getService().updateSezStatus_License_Issuance_(
			caseId, nameOfApplicant, licenseNumber, sezStatus,
			dateOfLicenseIssued, dateOfLicenseExpiration, licenceFileEntryId);
	}

	/**
	 * Updates the sez status license issuance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusLicenseIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusLicenseIssuance the sez status license issuance
	 * @return the sez status license issuance that was updated
	 */
	public static SezStatusLicenseIssuance updateSezStatusLicenseIssuance(
		SezStatusLicenseIssuance sezStatusLicenseIssuance) {

		return getService().updateSezStatusLicenseIssuance(
			sezStatusLicenseIssuance);
	}

	public static SezStatusLicenseIssuanceLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<SezStatusLicenseIssuanceLocalService>
		_serviceSnapshot = new Snapshot<>(
			SezStatusLicenseIssuanceLocalServiceUtil.class,
			SezStatusLicenseIssuanceLocalService.class);

}