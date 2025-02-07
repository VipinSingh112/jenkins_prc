/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncra.stages.services.model.CertificateOfVerification;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the certificate of verification service. This utility wraps <code>com.nbp.ncra.stages.services.service.persistence.impl.CertificateOfVerificationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CertificateOfVerificationPersistence
 * @generated
 */
public class CertificateOfVerificationUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		CertificateOfVerification certificateOfVerification) {

		getPersistence().clearCache(certificateOfVerification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, CertificateOfVerification>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CertificateOfVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CertificateOfVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CertificateOfVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CertificateOfVerification> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CertificateOfVerification update(
		CertificateOfVerification certificateOfVerification) {

		return getPersistence().update(certificateOfVerification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CertificateOfVerification update(
		CertificateOfVerification certificateOfVerification,
		ServiceContext serviceContext) {

		return getPersistence().update(
			certificateOfVerification, serviceContext);
	}

	/**
	 * Returns the certificate of verification where caseId = &#63; or throws a <code>NoSuchCertificateOfVerificationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching certificate of verification
	 * @throws NoSuchCertificateOfVerificationException if a matching certificate of verification could not be found
	 */
	public static CertificateOfVerification findBygetNcra_By_CaseId(
			String caseId)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchCertificateOfVerificationException {

		return getPersistence().findBygetNcra_By_CaseId(caseId);
	}

	/**
	 * Returns the certificate of verification where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching certificate of verification, or <code>null</code> if a matching certificate of verification could not be found
	 */
	public static CertificateOfVerification fetchBygetNcra_By_CaseId(
		String caseId) {

		return getPersistence().fetchBygetNcra_By_CaseId(caseId);
	}

	/**
	 * Returns the certificate of verification where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching certificate of verification, or <code>null</code> if a matching certificate of verification could not be found
	 */
	public static CertificateOfVerification fetchBygetNcra_By_CaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetNcra_By_CaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the certificate of verification where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the certificate of verification that was removed
	 */
	public static CertificateOfVerification removeBygetNcra_By_CaseId(
			String caseId)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchCertificateOfVerificationException {

		return getPersistence().removeBygetNcra_By_CaseId(caseId);
	}

	/**
	 * Returns the number of certificate of verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching certificate of verifications
	 */
	public static int countBygetNcra_By_CaseId(String caseId) {
		return getPersistence().countBygetNcra_By_CaseId(caseId);
	}

	/**
	 * Caches the certificate of verification in the entity cache if it is enabled.
	 *
	 * @param certificateOfVerification the certificate of verification
	 */
	public static void cacheResult(
		CertificateOfVerification certificateOfVerification) {

		getPersistence().cacheResult(certificateOfVerification);
	}

	/**
	 * Caches the certificate of verifications in the entity cache if it is enabled.
	 *
	 * @param certificateOfVerifications the certificate of verifications
	 */
	public static void cacheResult(
		List<CertificateOfVerification> certificateOfVerifications) {

		getPersistence().cacheResult(certificateOfVerifications);
	}

	/**
	 * Creates a new certificate of verification with the primary key. Does not add the certificate of verification to the database.
	 *
	 * @param certificateOfVerificationId the primary key for the new certificate of verification
	 * @return the new certificate of verification
	 */
	public static CertificateOfVerification create(
		long certificateOfVerificationId) {

		return getPersistence().create(certificateOfVerificationId);
	}

	/**
	 * Removes the certificate of verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param certificateOfVerificationId the primary key of the certificate of verification
	 * @return the certificate of verification that was removed
	 * @throws NoSuchCertificateOfVerificationException if a certificate of verification with the primary key could not be found
	 */
	public static CertificateOfVerification remove(
			long certificateOfVerificationId)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchCertificateOfVerificationException {

		return getPersistence().remove(certificateOfVerificationId);
	}

	public static CertificateOfVerification updateImpl(
		CertificateOfVerification certificateOfVerification) {

		return getPersistence().updateImpl(certificateOfVerification);
	}

	/**
	 * Returns the certificate of verification with the primary key or throws a <code>NoSuchCertificateOfVerificationException</code> if it could not be found.
	 *
	 * @param certificateOfVerificationId the primary key of the certificate of verification
	 * @return the certificate of verification
	 * @throws NoSuchCertificateOfVerificationException if a certificate of verification with the primary key could not be found
	 */
	public static CertificateOfVerification findByPrimaryKey(
			long certificateOfVerificationId)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchCertificateOfVerificationException {

		return getPersistence().findByPrimaryKey(certificateOfVerificationId);
	}

	/**
	 * Returns the certificate of verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param certificateOfVerificationId the primary key of the certificate of verification
	 * @return the certificate of verification, or <code>null</code> if a certificate of verification with the primary key could not be found
	 */
	public static CertificateOfVerification fetchByPrimaryKey(
		long certificateOfVerificationId) {

		return getPersistence().fetchByPrimaryKey(certificateOfVerificationId);
	}

	/**
	 * Returns all the certificate of verifications.
	 *
	 * @return the certificate of verifications
	 */
	public static List<CertificateOfVerification> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the certificate of verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CertificateOfVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of certificate of verifications
	 * @param end the upper bound of the range of certificate of verifications (not inclusive)
	 * @return the range of certificate of verifications
	 */
	public static List<CertificateOfVerification> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the certificate of verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CertificateOfVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of certificate of verifications
	 * @param end the upper bound of the range of certificate of verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of certificate of verifications
	 */
	public static List<CertificateOfVerification> findAll(
		int start, int end,
		OrderByComparator<CertificateOfVerification> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the certificate of verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CertificateOfVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of certificate of verifications
	 * @param end the upper bound of the range of certificate of verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of certificate of verifications
	 */
	public static List<CertificateOfVerification> findAll(
		int start, int end,
		OrderByComparator<CertificateOfVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the certificate of verifications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of certificate of verifications.
	 *
	 * @return the number of certificate of verifications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CertificateOfVerificationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CertificateOfVerificationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CertificateOfVerificationPersistence _persistence;

}