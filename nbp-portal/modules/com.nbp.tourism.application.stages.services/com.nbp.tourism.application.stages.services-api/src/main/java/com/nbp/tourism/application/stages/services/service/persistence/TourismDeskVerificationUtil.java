/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.stages.services.model.TourismDeskVerification;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism desk verification service. This utility wraps <code>com.nbp.tourism.application.stages.services.service.persistence.impl.TourismDeskVerificationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismDeskVerificationPersistence
 * @generated
 */
public class TourismDeskVerificationUtil {

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
		TourismDeskVerification tourismDeskVerification) {

		getPersistence().clearCache(tourismDeskVerification);
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
	public static Map<Serializable, TourismDeskVerification> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismDeskVerification> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismDeskVerification update(
		TourismDeskVerification tourismDeskVerification) {

		return getPersistence().update(tourismDeskVerification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismDeskVerification update(
		TourismDeskVerification tourismDeskVerification,
		ServiceContext serviceContext) {

		return getPersistence().update(tourismDeskVerification, serviceContext);
	}

	/**
	 * Returns all the tourism desk verifications where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism desk verifications
	 */
	public static List<TourismDeskVerification> findBygetTourismDV_ById(
		long tourismApplicationId) {

		return getPersistence().findBygetTourismDV_ById(tourismApplicationId);
	}

	/**
	 * Returns a range of all the tourism desk verifications where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism desk verifications
	 * @param end the upper bound of the range of tourism desk verifications (not inclusive)
	 * @return the range of matching tourism desk verifications
	 */
	public static List<TourismDeskVerification> findBygetTourismDV_ById(
		long tourismApplicationId, int start, int end) {

		return getPersistence().findBygetTourismDV_ById(
			tourismApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the tourism desk verifications where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism desk verifications
	 * @param end the upper bound of the range of tourism desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism desk verifications
	 */
	public static List<TourismDeskVerification> findBygetTourismDV_ById(
		long tourismApplicationId, int start, int end,
		OrderByComparator<TourismDeskVerification> orderByComparator) {

		return getPersistence().findBygetTourismDV_ById(
			tourismApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism desk verifications where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism desk verifications
	 * @param end the upper bound of the range of tourism desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism desk verifications
	 */
	public static List<TourismDeskVerification> findBygetTourismDV_ById(
		long tourismApplicationId, int start, int end,
		OrderByComparator<TourismDeskVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetTourismDV_ById(
			tourismApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first tourism desk verification in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism desk verification
	 * @throws NoSuchTourismDeskVerificationException if a matching tourism desk verification could not be found
	 */
	public static TourismDeskVerification findBygetTourismDV_ById_First(
			long tourismApplicationId,
			OrderByComparator<TourismDeskVerification> orderByComparator)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismDeskVerificationException {

		return getPersistence().findBygetTourismDV_ById_First(
			tourismApplicationId, orderByComparator);
	}

	/**
	 * Returns the first tourism desk verification in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism desk verification, or <code>null</code> if a matching tourism desk verification could not be found
	 */
	public static TourismDeskVerification fetchBygetTourismDV_ById_First(
		long tourismApplicationId,
		OrderByComparator<TourismDeskVerification> orderByComparator) {

		return getPersistence().fetchBygetTourismDV_ById_First(
			tourismApplicationId, orderByComparator);
	}

	/**
	 * Returns the last tourism desk verification in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism desk verification
	 * @throws NoSuchTourismDeskVerificationException if a matching tourism desk verification could not be found
	 */
	public static TourismDeskVerification findBygetTourismDV_ById_Last(
			long tourismApplicationId,
			OrderByComparator<TourismDeskVerification> orderByComparator)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismDeskVerificationException {

		return getPersistence().findBygetTourismDV_ById_Last(
			tourismApplicationId, orderByComparator);
	}

	/**
	 * Returns the last tourism desk verification in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism desk verification, or <code>null</code> if a matching tourism desk verification could not be found
	 */
	public static TourismDeskVerification fetchBygetTourismDV_ById_Last(
		long tourismApplicationId,
		OrderByComparator<TourismDeskVerification> orderByComparator) {

		return getPersistence().fetchBygetTourismDV_ById_Last(
			tourismApplicationId, orderByComparator);
	}

	/**
	 * Returns the tourism desk verifications before and after the current tourism desk verification in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismDeskVeriId the primary key of the current tourism desk verification
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism desk verification
	 * @throws NoSuchTourismDeskVerificationException if a tourism desk verification with the primary key could not be found
	 */
	public static TourismDeskVerification[] findBygetTourismDV_ById_PrevAndNext(
			long tourismDeskVeriId, long tourismApplicationId,
			OrderByComparator<TourismDeskVerification> orderByComparator)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismDeskVerificationException {

		return getPersistence().findBygetTourismDV_ById_PrevAndNext(
			tourismDeskVeriId, tourismApplicationId, orderByComparator);
	}

	/**
	 * Removes all the tourism desk verifications where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 */
	public static void removeBygetTourismDV_ById(long tourismApplicationId) {
		getPersistence().removeBygetTourismDV_ById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism desk verifications where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism desk verifications
	 */
	public static int countBygetTourismDV_ById(long tourismApplicationId) {
		return getPersistence().countBygetTourismDV_ById(tourismApplicationId);
	}

	/**
	 * Caches the tourism desk verification in the entity cache if it is enabled.
	 *
	 * @param tourismDeskVerification the tourism desk verification
	 */
	public static void cacheResult(
		TourismDeskVerification tourismDeskVerification) {

		getPersistence().cacheResult(tourismDeskVerification);
	}

	/**
	 * Caches the tourism desk verifications in the entity cache if it is enabled.
	 *
	 * @param tourismDeskVerifications the tourism desk verifications
	 */
	public static void cacheResult(
		List<TourismDeskVerification> tourismDeskVerifications) {

		getPersistence().cacheResult(tourismDeskVerifications);
	}

	/**
	 * Creates a new tourism desk verification with the primary key. Does not add the tourism desk verification to the database.
	 *
	 * @param tourismDeskVeriId the primary key for the new tourism desk verification
	 * @return the new tourism desk verification
	 */
	public static TourismDeskVerification create(long tourismDeskVeriId) {
		return getPersistence().create(tourismDeskVeriId);
	}

	/**
	 * Removes the tourism desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismDeskVeriId the primary key of the tourism desk verification
	 * @return the tourism desk verification that was removed
	 * @throws NoSuchTourismDeskVerificationException if a tourism desk verification with the primary key could not be found
	 */
	public static TourismDeskVerification remove(long tourismDeskVeriId)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismDeskVerificationException {

		return getPersistence().remove(tourismDeskVeriId);
	}

	public static TourismDeskVerification updateImpl(
		TourismDeskVerification tourismDeskVerification) {

		return getPersistence().updateImpl(tourismDeskVerification);
	}

	/**
	 * Returns the tourism desk verification with the primary key or throws a <code>NoSuchTourismDeskVerificationException</code> if it could not be found.
	 *
	 * @param tourismDeskVeriId the primary key of the tourism desk verification
	 * @return the tourism desk verification
	 * @throws NoSuchTourismDeskVerificationException if a tourism desk verification with the primary key could not be found
	 */
	public static TourismDeskVerification findByPrimaryKey(
			long tourismDeskVeriId)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismDeskVerificationException {

		return getPersistence().findByPrimaryKey(tourismDeskVeriId);
	}

	/**
	 * Returns the tourism desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismDeskVeriId the primary key of the tourism desk verification
	 * @return the tourism desk verification, or <code>null</code> if a tourism desk verification with the primary key could not be found
	 */
	public static TourismDeskVerification fetchByPrimaryKey(
		long tourismDeskVeriId) {

		return getPersistence().fetchByPrimaryKey(tourismDeskVeriId);
	}

	/**
	 * Returns all the tourism desk verifications.
	 *
	 * @return the tourism desk verifications
	 */
	public static List<TourismDeskVerification> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism desk verifications
	 * @param end the upper bound of the range of tourism desk verifications (not inclusive)
	 * @return the range of tourism desk verifications
	 */
	public static List<TourismDeskVerification> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism desk verifications
	 * @param end the upper bound of the range of tourism desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism desk verifications
	 */
	public static List<TourismDeskVerification> findAll(
		int start, int end,
		OrderByComparator<TourismDeskVerification> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism desk verifications
	 * @param end the upper bound of the range of tourism desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism desk verifications
	 */
	public static List<TourismDeskVerification> findAll(
		int start, int end,
		OrderByComparator<TourismDeskVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism desk verifications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism desk verifications.
	 *
	 * @return the number of tourism desk verifications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismDeskVerificationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismDeskVerificationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismDeskVerificationPersistence _persistence;

}