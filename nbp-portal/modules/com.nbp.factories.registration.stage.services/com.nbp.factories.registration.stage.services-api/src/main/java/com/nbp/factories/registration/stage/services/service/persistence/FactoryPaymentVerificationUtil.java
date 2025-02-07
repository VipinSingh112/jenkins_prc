/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.factories.registration.stage.services.model.FactoryPaymentVerification;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the factory payment verification service. This utility wraps <code>com.nbp.factories.registration.stage.services.service.persistence.impl.FactoryPaymentVerificationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoryPaymentVerificationPersistence
 * @generated
 */
public class FactoryPaymentVerificationUtil {

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
		FactoryPaymentVerification factoryPaymentVerification) {

		getPersistence().clearCache(factoryPaymentVerification);
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
	public static Map<Serializable, FactoryPaymentVerification>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FactoryPaymentVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FactoryPaymentVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FactoryPaymentVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FactoryPaymentVerification> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FactoryPaymentVerification update(
		FactoryPaymentVerification factoryPaymentVerification) {

		return getPersistence().update(factoryPaymentVerification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FactoryPaymentVerification update(
		FactoryPaymentVerification factoryPaymentVerification,
		ServiceContext serviceContext) {

		return getPersistence().update(
			factoryPaymentVerification, serviceContext);
	}

	/**
	 * Returns the factory payment verification where caseId = &#63; or throws a <code>NoSuchFactoryPaymentVerificationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching factory payment verification
	 * @throws NoSuchFactoryPaymentVerificationException if a matching factory payment verification could not be found
	 */
	public static FactoryPaymentVerification findBygetFactoryPaymentConfBy_CI(
			String caseId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoryPaymentVerificationException {

		return getPersistence().findBygetFactoryPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns the factory payment verification where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching factory payment verification, or <code>null</code> if a matching factory payment verification could not be found
	 */
	public static FactoryPaymentVerification fetchBygetFactoryPaymentConfBy_CI(
		String caseId) {

		return getPersistence().fetchBygetFactoryPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns the factory payment verification where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factory payment verification, or <code>null</code> if a matching factory payment verification could not be found
	 */
	public static FactoryPaymentVerification fetchBygetFactoryPaymentConfBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetFactoryPaymentConfBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the factory payment verification where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the factory payment verification that was removed
	 */
	public static FactoryPaymentVerification removeBygetFactoryPaymentConfBy_CI(
			String caseId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoryPaymentVerificationException {

		return getPersistence().removeBygetFactoryPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns the number of factory payment verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factory payment verifications
	 */
	public static int countBygetFactoryPaymentConfBy_CI(String caseId) {
		return getPersistence().countBygetFactoryPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns all the factory payment verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching factory payment verifications
	 */
	public static List<FactoryPaymentVerification> findBygetFactoryPayConfBy_CI(
		String caseId) {

		return getPersistence().findBygetFactoryPayConfBy_CI(caseId);
	}

	/**
	 * Returns a range of all the factory payment verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoryPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factory payment verifications
	 * @param end the upper bound of the range of factory payment verifications (not inclusive)
	 * @return the range of matching factory payment verifications
	 */
	public static List<FactoryPaymentVerification> findBygetFactoryPayConfBy_CI(
		String caseId, int start, int end) {

		return getPersistence().findBygetFactoryPayConfBy_CI(
			caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the factory payment verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoryPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factory payment verifications
	 * @param end the upper bound of the range of factory payment verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factory payment verifications
	 */
	public static List<FactoryPaymentVerification> findBygetFactoryPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<FactoryPaymentVerification> orderByComparator) {

		return getPersistence().findBygetFactoryPayConfBy_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factory payment verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoryPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factory payment verifications
	 * @param end the upper bound of the range of factory payment verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factory payment verifications
	 */
	public static List<FactoryPaymentVerification> findBygetFactoryPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<FactoryPaymentVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFactoryPayConfBy_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first factory payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factory payment verification
	 * @throws NoSuchFactoryPaymentVerificationException if a matching factory payment verification could not be found
	 */
	public static FactoryPaymentVerification findBygetFactoryPayConfBy_CI_First(
			String caseId,
			OrderByComparator<FactoryPaymentVerification> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoryPaymentVerificationException {

		return getPersistence().findBygetFactoryPayConfBy_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first factory payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factory payment verification, or <code>null</code> if a matching factory payment verification could not be found
	 */
	public static FactoryPaymentVerification
		fetchBygetFactoryPayConfBy_CI_First(
			String caseId,
			OrderByComparator<FactoryPaymentVerification> orderByComparator) {

		return getPersistence().fetchBygetFactoryPayConfBy_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last factory payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factory payment verification
	 * @throws NoSuchFactoryPaymentVerificationException if a matching factory payment verification could not be found
	 */
	public static FactoryPaymentVerification findBygetFactoryPayConfBy_CI_Last(
			String caseId,
			OrderByComparator<FactoryPaymentVerification> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoryPaymentVerificationException {

		return getPersistence().findBygetFactoryPayConfBy_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last factory payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factory payment verification, or <code>null</code> if a matching factory payment verification could not be found
	 */
	public static FactoryPaymentVerification fetchBygetFactoryPayConfBy_CI_Last(
		String caseId,
		OrderByComparator<FactoryPaymentVerification> orderByComparator) {

		return getPersistence().fetchBygetFactoryPayConfBy_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the factory payment verifications before and after the current factory payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param factoryPaymentVerificationId the primary key of the current factory payment verification
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factory payment verification
	 * @throws NoSuchFactoryPaymentVerificationException if a factory payment verification with the primary key could not be found
	 */
	public static FactoryPaymentVerification[]
			findBygetFactoryPayConfBy_CI_PrevAndNext(
				long factoryPaymentVerificationId, String caseId,
				OrderByComparator<FactoryPaymentVerification> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoryPaymentVerificationException {

		return getPersistence().findBygetFactoryPayConfBy_CI_PrevAndNext(
			factoryPaymentVerificationId, caseId, orderByComparator);
	}

	/**
	 * Removes all the factory payment verifications where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetFactoryPayConfBy_CI(String caseId) {
		getPersistence().removeBygetFactoryPayConfBy_CI(caseId);
	}

	/**
	 * Returns the number of factory payment verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factory payment verifications
	 */
	public static int countBygetFactoryPayConfBy_CI(String caseId) {
		return getPersistence().countBygetFactoryPayConfBy_CI(caseId);
	}

	/**
	 * Caches the factory payment verification in the entity cache if it is enabled.
	 *
	 * @param factoryPaymentVerification the factory payment verification
	 */
	public static void cacheResult(
		FactoryPaymentVerification factoryPaymentVerification) {

		getPersistence().cacheResult(factoryPaymentVerification);
	}

	/**
	 * Caches the factory payment verifications in the entity cache if it is enabled.
	 *
	 * @param factoryPaymentVerifications the factory payment verifications
	 */
	public static void cacheResult(
		List<FactoryPaymentVerification> factoryPaymentVerifications) {

		getPersistence().cacheResult(factoryPaymentVerifications);
	}

	/**
	 * Creates a new factory payment verification with the primary key. Does not add the factory payment verification to the database.
	 *
	 * @param factoryPaymentVerificationId the primary key for the new factory payment verification
	 * @return the new factory payment verification
	 */
	public static FactoryPaymentVerification create(
		long factoryPaymentVerificationId) {

		return getPersistence().create(factoryPaymentVerificationId);
	}

	/**
	 * Removes the factory payment verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoryPaymentVerificationId the primary key of the factory payment verification
	 * @return the factory payment verification that was removed
	 * @throws NoSuchFactoryPaymentVerificationException if a factory payment verification with the primary key could not be found
	 */
	public static FactoryPaymentVerification remove(
			long factoryPaymentVerificationId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoryPaymentVerificationException {

		return getPersistence().remove(factoryPaymentVerificationId);
	}

	public static FactoryPaymentVerification updateImpl(
		FactoryPaymentVerification factoryPaymentVerification) {

		return getPersistence().updateImpl(factoryPaymentVerification);
	}

	/**
	 * Returns the factory payment verification with the primary key or throws a <code>NoSuchFactoryPaymentVerificationException</code> if it could not be found.
	 *
	 * @param factoryPaymentVerificationId the primary key of the factory payment verification
	 * @return the factory payment verification
	 * @throws NoSuchFactoryPaymentVerificationException if a factory payment verification with the primary key could not be found
	 */
	public static FactoryPaymentVerification findByPrimaryKey(
			long factoryPaymentVerificationId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoryPaymentVerificationException {

		return getPersistence().findByPrimaryKey(factoryPaymentVerificationId);
	}

	/**
	 * Returns the factory payment verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoryPaymentVerificationId the primary key of the factory payment verification
	 * @return the factory payment verification, or <code>null</code> if a factory payment verification with the primary key could not be found
	 */
	public static FactoryPaymentVerification fetchByPrimaryKey(
		long factoryPaymentVerificationId) {

		return getPersistence().fetchByPrimaryKey(factoryPaymentVerificationId);
	}

	/**
	 * Returns all the factory payment verifications.
	 *
	 * @return the factory payment verifications
	 */
	public static List<FactoryPaymentVerification> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the factory payment verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoryPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factory payment verifications
	 * @param end the upper bound of the range of factory payment verifications (not inclusive)
	 * @return the range of factory payment verifications
	 */
	public static List<FactoryPaymentVerification> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the factory payment verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoryPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factory payment verifications
	 * @param end the upper bound of the range of factory payment verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factory payment verifications
	 */
	public static List<FactoryPaymentVerification> findAll(
		int start, int end,
		OrderByComparator<FactoryPaymentVerification> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factory payment verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoryPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factory payment verifications
	 * @param end the upper bound of the range of factory payment verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factory payment verifications
	 */
	public static List<FactoryPaymentVerification> findAll(
		int start, int end,
		OrderByComparator<FactoryPaymentVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the factory payment verifications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of factory payment verifications.
	 *
	 * @return the number of factory payment verifications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FactoryPaymentVerificationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FactoryPaymentVerificationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FactoryPaymentVerificationPersistence _persistence;

}