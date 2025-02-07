/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.stages.services.model.JanaacPaymentVerification;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the janaac payment verification service. This utility wraps <code>com.nbp.janaac.stages.services.service.persistence.impl.JanaacPaymentVerificationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JanaacPaymentVerificationPersistence
 * @generated
 */
public class JanaacPaymentVerificationUtil {

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
		JanaacPaymentVerification janaacPaymentVerification) {

		getPersistence().clearCache(janaacPaymentVerification);
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
	public static Map<Serializable, JanaacPaymentVerification>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JanaacPaymentVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JanaacPaymentVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JanaacPaymentVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JanaacPaymentVerification> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JanaacPaymentVerification update(
		JanaacPaymentVerification janaacPaymentVerification) {

		return getPersistence().update(janaacPaymentVerification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JanaacPaymentVerification update(
		JanaacPaymentVerification janaacPaymentVerification,
		ServiceContext serviceContext) {

		return getPersistence().update(
			janaacPaymentVerification, serviceContext);
	}

	/**
	 * Returns the janaac payment verification where caseId = &#63; or throws a <code>NoSuchJanaacPaymentVerificationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac payment verification
	 * @throws NoSuchJanaacPaymentVerificationException if a matching janaac payment verification could not be found
	 */
	public static JanaacPaymentVerification findBygetJanaacPaymentBy_CI(
			String caseId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacPaymentVerificationException {

		return getPersistence().findBygetJanaacPaymentBy_CI(caseId);
	}

	/**
	 * Returns the janaac payment verification where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac payment verification, or <code>null</code> if a matching janaac payment verification could not be found
	 */
	public static JanaacPaymentVerification fetchBygetJanaacPaymentBy_CI(
		String caseId) {

		return getPersistence().fetchBygetJanaacPaymentBy_CI(caseId);
	}

	/**
	 * Returns the janaac payment verification where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac payment verification, or <code>null</code> if a matching janaac payment verification could not be found
	 */
	public static JanaacPaymentVerification fetchBygetJanaacPaymentBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetJanaacPaymentBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the janaac payment verification where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the janaac payment verification that was removed
	 */
	public static JanaacPaymentVerification removeBygetJanaacPaymentBy_CI(
			String caseId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacPaymentVerificationException {

		return getPersistence().removeBygetJanaacPaymentBy_CI(caseId);
	}

	/**
	 * Returns the number of janaac payment verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac payment verifications
	 */
	public static int countBygetJanaacPaymentBy_CI(String caseId) {
		return getPersistence().countBygetJanaacPaymentBy_CI(caseId);
	}

	/**
	 * Returns all the janaac payment verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac payment verifications
	 */
	public static List<JanaacPaymentVerification> findBygetJanaacPayConfBy_CI(
		String caseId) {

		return getPersistence().findBygetJanaacPayConfBy_CI(caseId);
	}

	/**
	 * Returns a range of all the janaac payment verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac payment verifications
	 * @param end the upper bound of the range of janaac payment verifications (not inclusive)
	 * @return the range of matching janaac payment verifications
	 */
	public static List<JanaacPaymentVerification> findBygetJanaacPayConfBy_CI(
		String caseId, int start, int end) {

		return getPersistence().findBygetJanaacPayConfBy_CI(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the janaac payment verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac payment verifications
	 * @param end the upper bound of the range of janaac payment verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac payment verifications
	 */
	public static List<JanaacPaymentVerification> findBygetJanaacPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<JanaacPaymentVerification> orderByComparator) {

		return getPersistence().findBygetJanaacPayConfBy_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the janaac payment verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac payment verifications
	 * @param end the upper bound of the range of janaac payment verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac payment verifications
	 */
	public static List<JanaacPaymentVerification> findBygetJanaacPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<JanaacPaymentVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacPayConfBy_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first janaac payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac payment verification
	 * @throws NoSuchJanaacPaymentVerificationException if a matching janaac payment verification could not be found
	 */
	public static JanaacPaymentVerification findBygetJanaacPayConfBy_CI_First(
			String caseId,
			OrderByComparator<JanaacPaymentVerification> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacPaymentVerificationException {

		return getPersistence().findBygetJanaacPayConfBy_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first janaac payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac payment verification, or <code>null</code> if a matching janaac payment verification could not be found
	 */
	public static JanaacPaymentVerification fetchBygetJanaacPayConfBy_CI_First(
		String caseId,
		OrderByComparator<JanaacPaymentVerification> orderByComparator) {

		return getPersistence().fetchBygetJanaacPayConfBy_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last janaac payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac payment verification
	 * @throws NoSuchJanaacPaymentVerificationException if a matching janaac payment verification could not be found
	 */
	public static JanaacPaymentVerification findBygetJanaacPayConfBy_CI_Last(
			String caseId,
			OrderByComparator<JanaacPaymentVerification> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacPaymentVerificationException {

		return getPersistence().findBygetJanaacPayConfBy_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last janaac payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac payment verification, or <code>null</code> if a matching janaac payment verification could not be found
	 */
	public static JanaacPaymentVerification fetchBygetJanaacPayConfBy_CI_Last(
		String caseId,
		OrderByComparator<JanaacPaymentVerification> orderByComparator) {

		return getPersistence().fetchBygetJanaacPayConfBy_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the janaac payment verifications before and after the current janaac payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param janaacPaymentVerificationId the primary key of the current janaac payment verification
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac payment verification
	 * @throws NoSuchJanaacPaymentVerificationException if a janaac payment verification with the primary key could not be found
	 */
	public static JanaacPaymentVerification[]
			findBygetJanaacPayConfBy_CI_PrevAndNext(
				long janaacPaymentVerificationId, String caseId,
				OrderByComparator<JanaacPaymentVerification> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacPaymentVerificationException {

		return getPersistence().findBygetJanaacPayConfBy_CI_PrevAndNext(
			janaacPaymentVerificationId, caseId, orderByComparator);
	}

	/**
	 * Removes all the janaac payment verifications where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetJanaacPayConfBy_CI(String caseId) {
		getPersistence().removeBygetJanaacPayConfBy_CI(caseId);
	}

	/**
	 * Returns the number of janaac payment verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac payment verifications
	 */
	public static int countBygetJanaacPayConfBy_CI(String caseId) {
		return getPersistence().countBygetJanaacPayConfBy_CI(caseId);
	}

	/**
	 * Caches the janaac payment verification in the entity cache if it is enabled.
	 *
	 * @param janaacPaymentVerification the janaac payment verification
	 */
	public static void cacheResult(
		JanaacPaymentVerification janaacPaymentVerification) {

		getPersistence().cacheResult(janaacPaymentVerification);
	}

	/**
	 * Caches the janaac payment verifications in the entity cache if it is enabled.
	 *
	 * @param janaacPaymentVerifications the janaac payment verifications
	 */
	public static void cacheResult(
		List<JanaacPaymentVerification> janaacPaymentVerifications) {

		getPersistence().cacheResult(janaacPaymentVerifications);
	}

	/**
	 * Creates a new janaac payment verification with the primary key. Does not add the janaac payment verification to the database.
	 *
	 * @param janaacPaymentVerificationId the primary key for the new janaac payment verification
	 * @return the new janaac payment verification
	 */
	public static JanaacPaymentVerification create(
		long janaacPaymentVerificationId) {

		return getPersistence().create(janaacPaymentVerificationId);
	}

	/**
	 * Removes the janaac payment verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param janaacPaymentVerificationId the primary key of the janaac payment verification
	 * @return the janaac payment verification that was removed
	 * @throws NoSuchJanaacPaymentVerificationException if a janaac payment verification with the primary key could not be found
	 */
	public static JanaacPaymentVerification remove(
			long janaacPaymentVerificationId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacPaymentVerificationException {

		return getPersistence().remove(janaacPaymentVerificationId);
	}

	public static JanaacPaymentVerification updateImpl(
		JanaacPaymentVerification janaacPaymentVerification) {

		return getPersistence().updateImpl(janaacPaymentVerification);
	}

	/**
	 * Returns the janaac payment verification with the primary key or throws a <code>NoSuchJanaacPaymentVerificationException</code> if it could not be found.
	 *
	 * @param janaacPaymentVerificationId the primary key of the janaac payment verification
	 * @return the janaac payment verification
	 * @throws NoSuchJanaacPaymentVerificationException if a janaac payment verification with the primary key could not be found
	 */
	public static JanaacPaymentVerification findByPrimaryKey(
			long janaacPaymentVerificationId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacPaymentVerificationException {

		return getPersistence().findByPrimaryKey(janaacPaymentVerificationId);
	}

	/**
	 * Returns the janaac payment verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param janaacPaymentVerificationId the primary key of the janaac payment verification
	 * @return the janaac payment verification, or <code>null</code> if a janaac payment verification with the primary key could not be found
	 */
	public static JanaacPaymentVerification fetchByPrimaryKey(
		long janaacPaymentVerificationId) {

		return getPersistence().fetchByPrimaryKey(janaacPaymentVerificationId);
	}

	/**
	 * Returns all the janaac payment verifications.
	 *
	 * @return the janaac payment verifications
	 */
	public static List<JanaacPaymentVerification> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the janaac payment verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac payment verifications
	 * @param end the upper bound of the range of janaac payment verifications (not inclusive)
	 * @return the range of janaac payment verifications
	 */
	public static List<JanaacPaymentVerification> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the janaac payment verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac payment verifications
	 * @param end the upper bound of the range of janaac payment verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of janaac payment verifications
	 */
	public static List<JanaacPaymentVerification> findAll(
		int start, int end,
		OrderByComparator<JanaacPaymentVerification> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the janaac payment verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac payment verifications
	 * @param end the upper bound of the range of janaac payment verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of janaac payment verifications
	 */
	public static List<JanaacPaymentVerification> findAll(
		int start, int end,
		OrderByComparator<JanaacPaymentVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the janaac payment verifications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of janaac payment verifications.
	 *
	 * @return the number of janaac payment verifications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JanaacPaymentVerificationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JanaacPaymentVerificationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JanaacPaymentVerificationPersistence _persistence;

}