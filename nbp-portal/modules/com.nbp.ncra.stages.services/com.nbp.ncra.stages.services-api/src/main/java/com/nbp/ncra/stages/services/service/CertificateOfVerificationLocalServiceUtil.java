/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncra.stages.services.model.CertificateOfVerification;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CertificateOfVerification. This utility wraps
 * <code>com.nbp.ncra.stages.services.service.impl.CertificateOfVerificationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CertificateOfVerificationLocalService
 * @generated
 */
public class CertificateOfVerificationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.ncra.stages.services.service.impl.CertificateOfVerificationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the certificate of verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CertificateOfVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param certificateOfVerification the certificate of verification
	 * @return the certificate of verification that was added
	 */
	public static CertificateOfVerification addCertificateOfVerification(
		CertificateOfVerification certificateOfVerification) {

		return getService().addCertificateOfVerification(
			certificateOfVerification);
	}

	/**
	 * Creates a new certificate of verification with the primary key. Does not add the certificate of verification to the database.
	 *
	 * @param certificateOfVerificationId the primary key for the new certificate of verification
	 * @return the new certificate of verification
	 */
	public static CertificateOfVerification createCertificateOfVerification(
		long certificateOfVerificationId) {

		return getService().createCertificateOfVerification(
			certificateOfVerificationId);
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
	 * Deletes the certificate of verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CertificateOfVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param certificateOfVerification the certificate of verification
	 * @return the certificate of verification that was removed
	 */
	public static CertificateOfVerification deleteCertificateOfVerification(
		CertificateOfVerification certificateOfVerification) {

		return getService().deleteCertificateOfVerification(
			certificateOfVerification);
	}

	/**
	 * Deletes the certificate of verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CertificateOfVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param certificateOfVerificationId the primary key of the certificate of verification
	 * @return the certificate of verification that was removed
	 * @throws PortalException if a certificate of verification with the primary key could not be found
	 */
	public static CertificateOfVerification deleteCertificateOfVerification(
			long certificateOfVerificationId)
		throws PortalException {

		return getService().deleteCertificateOfVerification(
			certificateOfVerificationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.stages.services.model.impl.CertificateOfVerificationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.stages.services.model.impl.CertificateOfVerificationModelImpl</code>.
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

	public static CertificateOfVerification fetchCertificateOfVerification(
		long certificateOfVerificationId) {

		return getService().fetchCertificateOfVerification(
			certificateOfVerificationId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the certificate of verification with the primary key.
	 *
	 * @param certificateOfVerificationId the primary key of the certificate of verification
	 * @return the certificate of verification
	 * @throws PortalException if a certificate of verification with the primary key could not be found
	 */
	public static CertificateOfVerification getCertificateOfVerification(
			long certificateOfVerificationId)
		throws PortalException {

		return getService().getCertificateOfVerification(
			certificateOfVerificationId);
	}

	/**
	 * Returns a range of all the certificate of verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.stages.services.model.impl.CertificateOfVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of certificate of verifications
	 * @param end the upper bound of the range of certificate of verifications (not inclusive)
	 * @return the range of certificate of verifications
	 */
	public static List<CertificateOfVerification> getCertificateOfVerifications(
		int start, int end) {

		return getService().getCertificateOfVerifications(start, end);
	}

	/**
	 * Returns the number of certificate of verifications.
	 *
	 * @return the number of certificate of verifications
	 */
	public static int getCertificateOfVerificationsCount() {
		return getService().getCertificateOfVerificationsCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static CertificateOfVerification getNcra_By_CaseId(String caseId)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchCertificateOfVerificationException {

		return getService().getNcra_By_CaseId(caseId);
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
	 * Updates the certificate of verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CertificateOfVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param certificateOfVerification the certificate of verification
	 * @return the certificate of verification that was updated
	 */
	public static CertificateOfVerification updateCertificateOfVerification(
		CertificateOfVerification certificateOfVerification) {

		return getService().updateCertificateOfVerification(
			certificateOfVerification);
	}

	public static CertificateOfVerification updateNcraCertificateOfVerification(
		String caseId, String nameOfApplicant, String productName,
		java.util.Date dateCertificateIssued, java.util.Date dateOfExpiration,
		String certificateNumber) {

		return getService().updateNcraCertificateOfVerification(
			caseId, nameOfApplicant, productName, dateCertificateIssued,
			dateOfExpiration, certificateNumber);
	}

	public static CertificateOfVerificationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CertificateOfVerificationLocalService>
		_serviceSnapshot = new Snapshot<>(
			CertificateOfVerificationLocalServiceUtil.class,
			CertificateOfVerificationLocalService.class);

}