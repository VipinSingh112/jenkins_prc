/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.medical.stages.service.model.MedicalCertificateIssuance;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MedicalCertificateIssuance. This utility wraps
 * <code>com.nbp.medical.stages.service.service.impl.MedicalCertificateIssuanceLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalCertificateIssuanceLocalService
 * @generated
 */
public class MedicalCertificateIssuanceLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.medical.stages.service.service.impl.MedicalCertificateIssuanceLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the medical certificate issuance to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalCertificateIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalCertificateIssuance the medical certificate issuance
	 * @return the medical certificate issuance that was added
	 */
	public static MedicalCertificateIssuance addMedicalCertificateIssuance(
		MedicalCertificateIssuance medicalCertificateIssuance) {

		return getService().addMedicalCertificateIssuance(
			medicalCertificateIssuance);
	}

	/**
	 * Creates a new medical certificate issuance with the primary key. Does not add the medical certificate issuance to the database.
	 *
	 * @param medicalCertificateIssuanceId the primary key for the new medical certificate issuance
	 * @return the new medical certificate issuance
	 */
	public static MedicalCertificateIssuance createMedicalCertificateIssuance(
		long medicalCertificateIssuanceId) {

		return getService().createMedicalCertificateIssuance(
			medicalCertificateIssuanceId);
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
	 * Deletes the medical certificate issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalCertificateIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalCertificateIssuanceId the primary key of the medical certificate issuance
	 * @return the medical certificate issuance that was removed
	 * @throws PortalException if a medical certificate issuance with the primary key could not be found
	 */
	public static MedicalCertificateIssuance deleteMedicalCertificateIssuance(
			long medicalCertificateIssuanceId)
		throws PortalException {

		return getService().deleteMedicalCertificateIssuance(
			medicalCertificateIssuanceId);
	}

	/**
	 * Deletes the medical certificate issuance from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalCertificateIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalCertificateIssuance the medical certificate issuance
	 * @return the medical certificate issuance that was removed
	 */
	public static MedicalCertificateIssuance deleteMedicalCertificateIssuance(
		MedicalCertificateIssuance medicalCertificateIssuance) {

		return getService().deleteMedicalCertificateIssuance(
			medicalCertificateIssuance);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.stages.service.model.impl.MedicalCertificateIssuanceModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.stages.service.model.impl.MedicalCertificateIssuanceModelImpl</code>.
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

	public static MedicalCertificateIssuance fetchMedicalCertificateIssuance(
		long medicalCertificateIssuanceId) {

		return getService().fetchMedicalCertificateIssuance(
			medicalCertificateIssuanceId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static MedicalCertificateIssuance getCertificateIssuance(
			String caseId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalCertificateIssuanceException {

		return getService().getCertificateIssuance(caseId);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the medical certificate issuance with the primary key.
	 *
	 * @param medicalCertificateIssuanceId the primary key of the medical certificate issuance
	 * @return the medical certificate issuance
	 * @throws PortalException if a medical certificate issuance with the primary key could not be found
	 */
	public static MedicalCertificateIssuance getMedicalCertificateIssuance(
			long medicalCertificateIssuanceId)
		throws PortalException {

		return getService().getMedicalCertificateIssuance(
			medicalCertificateIssuanceId);
	}

	/**
	 * Returns a range of all the medical certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.stages.service.model.impl.MedicalCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical certificate issuances
	 * @param end the upper bound of the range of medical certificate issuances (not inclusive)
	 * @return the range of medical certificate issuances
	 */
	public static List<MedicalCertificateIssuance>
		getMedicalCertificateIssuances(int start, int end) {

		return getService().getMedicalCertificateIssuances(start, end);
	}

	/**
	 * Returns the number of medical certificate issuances.
	 *
	 * @return the number of medical certificate issuances
	 */
	public static int getMedicalCertificateIssuancesCount() {
		return getService().getMedicalCertificateIssuancesCount();
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
	 * Updates the medical certificate issuance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalCertificateIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalCertificateIssuance the medical certificate issuance
	 * @return the medical certificate issuance that was updated
	 */
	public static MedicalCertificateIssuance updateMedicalCertificateIssuance(
		MedicalCertificateIssuance medicalCertificateIssuance) {

		return getService().updateMedicalCertificateIssuance(
			medicalCertificateIssuance);
	}

	public static MedicalCertificateIssuance updateMedicalCertificateIssuance(
		String caseId, String status, String issuanceCertificate,
		String medicalCategory, java.util.Date dateOfCertificateIssuance,
		java.util.Date dateOfCertificateExpiration, long licenceFileEntryId) {

		return getService().updateMedicalCertificateIssuance(
			caseId, status, issuanceCertificate, medicalCategory,
			dateOfCertificateIssuance, dateOfCertificateExpiration,
			licenceFileEntryId);
	}

	public static MedicalCertificateIssuanceLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MedicalCertificateIssuanceLocalService>
		_serviceSnapshot = new Snapshot<>(
			MedicalCertificateIssuanceLocalServiceUtil.class,
			MedicalCertificateIssuanceLocalService.class);

}