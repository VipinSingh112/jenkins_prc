/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.medical.stages.service.model.MedicalCertificateIssuance;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the medical certificate issuance service. This utility wraps <code>com.nbp.medical.stages.service.service.persistence.impl.MedicalCertificateIssuancePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalCertificateIssuancePersistence
 * @generated
 */
public class MedicalCertificateIssuanceUtil {

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
		MedicalCertificateIssuance medicalCertificateIssuance) {

		getPersistence().clearCache(medicalCertificateIssuance);
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
	public static Map<Serializable, MedicalCertificateIssuance>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MedicalCertificateIssuance> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MedicalCertificateIssuance> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MedicalCertificateIssuance> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MedicalCertificateIssuance> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MedicalCertificateIssuance update(
		MedicalCertificateIssuance medicalCertificateIssuance) {

		return getPersistence().update(medicalCertificateIssuance);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MedicalCertificateIssuance update(
		MedicalCertificateIssuance medicalCertificateIssuance,
		ServiceContext serviceContext) {

		return getPersistence().update(
			medicalCertificateIssuance, serviceContext);
	}

	/**
	 * Returns the medical certificate issuance where caseId = &#63; or throws a <code>NoSuchMedicalCertificateIssuanceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching medical certificate issuance
	 * @throws NoSuchMedicalCertificateIssuanceException if a matching medical certificate issuance could not be found
	 */
	public static MedicalCertificateIssuance findBygetMedical_Issuance_By_CI(
			String caseId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalCertificateIssuanceException {

		return getPersistence().findBygetMedical_Issuance_By_CI(caseId);
	}

	/**
	 * Returns the medical certificate issuance where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching medical certificate issuance, or <code>null</code> if a matching medical certificate issuance could not be found
	 */
	public static MedicalCertificateIssuance fetchBygetMedical_Issuance_By_CI(
		String caseId) {

		return getPersistence().fetchBygetMedical_Issuance_By_CI(caseId);
	}

	/**
	 * Returns the medical certificate issuance where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical certificate issuance, or <code>null</code> if a matching medical certificate issuance could not be found
	 */
	public static MedicalCertificateIssuance fetchBygetMedical_Issuance_By_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetMedical_Issuance_By_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the medical certificate issuance where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the medical certificate issuance that was removed
	 */
	public static MedicalCertificateIssuance removeBygetMedical_Issuance_By_CI(
			String caseId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalCertificateIssuanceException {

		return getPersistence().removeBygetMedical_Issuance_By_CI(caseId);
	}

	/**
	 * Returns the number of medical certificate issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching medical certificate issuances
	 */
	public static int countBygetMedical_Issuance_By_CI(String caseId) {
		return getPersistence().countBygetMedical_Issuance_By_CI(caseId);
	}

	/**
	 * Caches the medical certificate issuance in the entity cache if it is enabled.
	 *
	 * @param medicalCertificateIssuance the medical certificate issuance
	 */
	public static void cacheResult(
		MedicalCertificateIssuance medicalCertificateIssuance) {

		getPersistence().cacheResult(medicalCertificateIssuance);
	}

	/**
	 * Caches the medical certificate issuances in the entity cache if it is enabled.
	 *
	 * @param medicalCertificateIssuances the medical certificate issuances
	 */
	public static void cacheResult(
		List<MedicalCertificateIssuance> medicalCertificateIssuances) {

		getPersistence().cacheResult(medicalCertificateIssuances);
	}

	/**
	 * Creates a new medical certificate issuance with the primary key. Does not add the medical certificate issuance to the database.
	 *
	 * @param medicalCertificateIssuanceId the primary key for the new medical certificate issuance
	 * @return the new medical certificate issuance
	 */
	public static MedicalCertificateIssuance create(
		long medicalCertificateIssuanceId) {

		return getPersistence().create(medicalCertificateIssuanceId);
	}

	/**
	 * Removes the medical certificate issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalCertificateIssuanceId the primary key of the medical certificate issuance
	 * @return the medical certificate issuance that was removed
	 * @throws NoSuchMedicalCertificateIssuanceException if a medical certificate issuance with the primary key could not be found
	 */
	public static MedicalCertificateIssuance remove(
			long medicalCertificateIssuanceId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalCertificateIssuanceException {

		return getPersistence().remove(medicalCertificateIssuanceId);
	}

	public static MedicalCertificateIssuance updateImpl(
		MedicalCertificateIssuance medicalCertificateIssuance) {

		return getPersistence().updateImpl(medicalCertificateIssuance);
	}

	/**
	 * Returns the medical certificate issuance with the primary key or throws a <code>NoSuchMedicalCertificateIssuanceException</code> if it could not be found.
	 *
	 * @param medicalCertificateIssuanceId the primary key of the medical certificate issuance
	 * @return the medical certificate issuance
	 * @throws NoSuchMedicalCertificateIssuanceException if a medical certificate issuance with the primary key could not be found
	 */
	public static MedicalCertificateIssuance findByPrimaryKey(
			long medicalCertificateIssuanceId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalCertificateIssuanceException {

		return getPersistence().findByPrimaryKey(medicalCertificateIssuanceId);
	}

	/**
	 * Returns the medical certificate issuance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalCertificateIssuanceId the primary key of the medical certificate issuance
	 * @return the medical certificate issuance, or <code>null</code> if a medical certificate issuance with the primary key could not be found
	 */
	public static MedicalCertificateIssuance fetchByPrimaryKey(
		long medicalCertificateIssuanceId) {

		return getPersistence().fetchByPrimaryKey(medicalCertificateIssuanceId);
	}

	/**
	 * Returns all the medical certificate issuances.
	 *
	 * @return the medical certificate issuances
	 */
	public static List<MedicalCertificateIssuance> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the medical certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical certificate issuances
	 * @param end the upper bound of the range of medical certificate issuances (not inclusive)
	 * @return the range of medical certificate issuances
	 */
	public static List<MedicalCertificateIssuance> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the medical certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical certificate issuances
	 * @param end the upper bound of the range of medical certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical certificate issuances
	 */
	public static List<MedicalCertificateIssuance> findAll(
		int start, int end,
		OrderByComparator<MedicalCertificateIssuance> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical certificate issuances
	 * @param end the upper bound of the range of medical certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical certificate issuances
	 */
	public static List<MedicalCertificateIssuance> findAll(
		int start, int end,
		OrderByComparator<MedicalCertificateIssuance> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the medical certificate issuances from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of medical certificate issuances.
	 *
	 * @return the number of medical certificate issuances
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MedicalCertificateIssuancePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MedicalCertificateIssuancePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MedicalCertificateIssuancePersistence _persistence;

}