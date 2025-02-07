/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.stage.services.model.OsiInsolDataVerification;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi insol data verification service. This utility wraps <code>com.nbp.osi.insolvency.stage.services.service.persistence.impl.OsiInsolDataVerificationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolDataVerificationPersistence
 * @generated
 */
public class OsiInsolDataVerificationUtil {

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
		OsiInsolDataVerification osiInsolDataVerification) {

		getPersistence().clearCache(osiInsolDataVerification);
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
	public static Map<Serializable, OsiInsolDataVerification>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiInsolDataVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiInsolDataVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiInsolDataVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OsiInsolDataVerification> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiInsolDataVerification update(
		OsiInsolDataVerification osiInsolDataVerification) {

		return getPersistence().update(osiInsolDataVerification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiInsolDataVerification update(
		OsiInsolDataVerification osiInsolDataVerification,
		ServiceContext serviceContext) {

		return getPersistence().update(
			osiInsolDataVerification, serviceContext);
	}

	/**
	 * Returns the osi insol data verification where caseId = &#63; or throws a <code>NoSuchOsiInsolDataVerificationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi insol data verification
	 * @throws NoSuchOsiInsolDataVerificationException if a matching osi insol data verification could not be found
	 */
	public static OsiInsolDataVerification findBygetOSIIRDataVerificationBy_CI(
			String caseId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolDataVerificationException {

		return getPersistence().findBygetOSIIRDataVerificationBy_CI(caseId);
	}

	/**
	 * Returns the osi insol data verification where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi insol data verification, or <code>null</code> if a matching osi insol data verification could not be found
	 */
	public static OsiInsolDataVerification fetchBygetOSIIRDataVerificationBy_CI(
		String caseId) {

		return getPersistence().fetchBygetOSIIRDataVerificationBy_CI(caseId);
	}

	/**
	 * Returns the osi insol data verification where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insol data verification, or <code>null</code> if a matching osi insol data verification could not be found
	 */
	public static OsiInsolDataVerification fetchBygetOSIIRDataVerificationBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetOSIIRDataVerificationBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the osi insol data verification where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi insol data verification that was removed
	 */
	public static OsiInsolDataVerification
			removeBygetOSIIRDataVerificationBy_CI(String caseId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolDataVerificationException {

		return getPersistence().removeBygetOSIIRDataVerificationBy_CI(caseId);
	}

	/**
	 * Returns the number of osi insol data verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi insol data verifications
	 */
	public static int countBygetOSIIRDataVerificationBy_CI(String caseId) {
		return getPersistence().countBygetOSIIRDataVerificationBy_CI(caseId);
	}

	/**
	 * Caches the osi insol data verification in the entity cache if it is enabled.
	 *
	 * @param osiInsolDataVerification the osi insol data verification
	 */
	public static void cacheResult(
		OsiInsolDataVerification osiInsolDataVerification) {

		getPersistence().cacheResult(osiInsolDataVerification);
	}

	/**
	 * Caches the osi insol data verifications in the entity cache if it is enabled.
	 *
	 * @param osiInsolDataVerifications the osi insol data verifications
	 */
	public static void cacheResult(
		List<OsiInsolDataVerification> osiInsolDataVerifications) {

		getPersistence().cacheResult(osiInsolDataVerifications);
	}

	/**
	 * Creates a new osi insol data verification with the primary key. Does not add the osi insol data verification to the database.
	 *
	 * @param osiInsolDataVerificationId the primary key for the new osi insol data verification
	 * @return the new osi insol data verification
	 */
	public static OsiInsolDataVerification create(
		long osiInsolDataVerificationId) {

		return getPersistence().create(osiInsolDataVerificationId);
	}

	/**
	 * Removes the osi insol data verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiInsolDataVerificationId the primary key of the osi insol data verification
	 * @return the osi insol data verification that was removed
	 * @throws NoSuchOsiInsolDataVerificationException if a osi insol data verification with the primary key could not be found
	 */
	public static OsiInsolDataVerification remove(
			long osiInsolDataVerificationId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolDataVerificationException {

		return getPersistence().remove(osiInsolDataVerificationId);
	}

	public static OsiInsolDataVerification updateImpl(
		OsiInsolDataVerification osiInsolDataVerification) {

		return getPersistence().updateImpl(osiInsolDataVerification);
	}

	/**
	 * Returns the osi insol data verification with the primary key or throws a <code>NoSuchOsiInsolDataVerificationException</code> if it could not be found.
	 *
	 * @param osiInsolDataVerificationId the primary key of the osi insol data verification
	 * @return the osi insol data verification
	 * @throws NoSuchOsiInsolDataVerificationException if a osi insol data verification with the primary key could not be found
	 */
	public static OsiInsolDataVerification findByPrimaryKey(
			long osiInsolDataVerificationId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolDataVerificationException {

		return getPersistence().findByPrimaryKey(osiInsolDataVerificationId);
	}

	/**
	 * Returns the osi insol data verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiInsolDataVerificationId the primary key of the osi insol data verification
	 * @return the osi insol data verification, or <code>null</code> if a osi insol data verification with the primary key could not be found
	 */
	public static OsiInsolDataVerification fetchByPrimaryKey(
		long osiInsolDataVerificationId) {

		return getPersistence().fetchByPrimaryKey(osiInsolDataVerificationId);
	}

	/**
	 * Returns all the osi insol data verifications.
	 *
	 * @return the osi insol data verifications
	 */
	public static List<OsiInsolDataVerification> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi insol data verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolDataVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insol data verifications
	 * @param end the upper bound of the range of osi insol data verifications (not inclusive)
	 * @return the range of osi insol data verifications
	 */
	public static List<OsiInsolDataVerification> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi insol data verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolDataVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insol data verifications
	 * @param end the upper bound of the range of osi insol data verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi insol data verifications
	 */
	public static List<OsiInsolDataVerification> findAll(
		int start, int end,
		OrderByComparator<OsiInsolDataVerification> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi insol data verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolDataVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insol data verifications
	 * @param end the upper bound of the range of osi insol data verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi insol data verifications
	 */
	public static List<OsiInsolDataVerification> findAll(
		int start, int end,
		OrderByComparator<OsiInsolDataVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi insol data verifications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi insol data verifications.
	 *
	 * @return the number of osi insol data verifications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiInsolDataVerificationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OsiInsolDataVerificationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OsiInsolDataVerificationPersistence _persistence;

}