/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.stages.services.model.TourismPaymentConfirmation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism payment confirmation service. This utility wraps <code>com.nbp.tourism.application.stages.services.service.persistence.impl.TourismPaymentConfirmationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismPaymentConfirmationPersistence
 * @generated
 */
public class TourismPaymentConfirmationUtil {

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
		TourismPaymentConfirmation tourismPaymentConfirmation) {

		getPersistence().clearCache(tourismPaymentConfirmation);
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
	public static Map<Serializable, TourismPaymentConfirmation>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismPaymentConfirmation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismPaymentConfirmation update(
		TourismPaymentConfirmation tourismPaymentConfirmation) {

		return getPersistence().update(tourismPaymentConfirmation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismPaymentConfirmation update(
		TourismPaymentConfirmation tourismPaymentConfirmation,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismPaymentConfirmation, serviceContext);
	}

	/**
	 * Returns the tourism payment confirmation where caseId = &#63; or throws a <code>NoSuchTourismPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching tourism payment confirmation
	 * @throws NoSuchTourismPaymentConfirmationException if a matching tourism payment confirmation could not be found
	 */
	public static TourismPaymentConfirmation
			findBygetTourismPaymentConfirmationBy_CI(String caseId)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismPaymentConfirmationException {

		return getPersistence().findBygetTourismPaymentConfirmationBy_CI(
			caseId);
	}

	/**
	 * Returns the tourism payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching tourism payment confirmation, or <code>null</code> if a matching tourism payment confirmation could not be found
	 */
	public static TourismPaymentConfirmation
		fetchBygetTourismPaymentConfirmationBy_CI(String caseId) {

		return getPersistence().fetchBygetTourismPaymentConfirmationBy_CI(
			caseId);
	}

	/**
	 * Returns the tourism payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism payment confirmation, or <code>null</code> if a matching tourism payment confirmation could not be found
	 */
	public static TourismPaymentConfirmation
		fetchBygetTourismPaymentConfirmationBy_CI(
			String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismPaymentConfirmationBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the tourism payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the tourism payment confirmation that was removed
	 */
	public static TourismPaymentConfirmation
			removeBygetTourismPaymentConfirmationBy_CI(String caseId)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismPaymentConfirmationException {

		return getPersistence().removeBygetTourismPaymentConfirmationBy_CI(
			caseId);
	}

	/**
	 * Returns the number of tourism payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching tourism payment confirmations
	 */
	public static int countBygetTourismPaymentConfirmationBy_CI(String caseId) {
		return getPersistence().countBygetTourismPaymentConfirmationBy_CI(
			caseId);
	}

	/**
	 * Returns all the tourism payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching tourism payment confirmations
	 */
	public static List<TourismPaymentConfirmation>
		findBygetTourismPaymentConfirmations_By_CI(String caseId) {

		return getPersistence().findBygetTourismPaymentConfirmations_By_CI(
			caseId);
	}

	/**
	 * Returns a range of all the tourism payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of tourism payment confirmations
	 * @param end the upper bound of the range of tourism payment confirmations (not inclusive)
	 * @return the range of matching tourism payment confirmations
	 */
	public static List<TourismPaymentConfirmation>
		findBygetTourismPaymentConfirmations_By_CI(
			String caseId, int start, int end) {

		return getPersistence().findBygetTourismPaymentConfirmations_By_CI(
			caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the tourism payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of tourism payment confirmations
	 * @param end the upper bound of the range of tourism payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism payment confirmations
	 */
	public static List<TourismPaymentConfirmation>
		findBygetTourismPaymentConfirmations_By_CI(
			String caseId, int start, int end,
			OrderByComparator<TourismPaymentConfirmation> orderByComparator) {

		return getPersistence().findBygetTourismPaymentConfirmations_By_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of tourism payment confirmations
	 * @param end the upper bound of the range of tourism payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism payment confirmations
	 */
	public static List<TourismPaymentConfirmation>
		findBygetTourismPaymentConfirmations_By_CI(
			String caseId, int start, int end,
			OrderByComparator<TourismPaymentConfirmation> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetTourismPaymentConfirmations_By_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first tourism payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism payment confirmation
	 * @throws NoSuchTourismPaymentConfirmationException if a matching tourism payment confirmation could not be found
	 */
	public static TourismPaymentConfirmation
			findBygetTourismPaymentConfirmations_By_CI_First(
				String caseId,
				OrderByComparator<TourismPaymentConfirmation> orderByComparator)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismPaymentConfirmationException {

		return getPersistence().
			findBygetTourismPaymentConfirmations_By_CI_First(
				caseId, orderByComparator);
	}

	/**
	 * Returns the first tourism payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism payment confirmation, or <code>null</code> if a matching tourism payment confirmation could not be found
	 */
	public static TourismPaymentConfirmation
		fetchBygetTourismPaymentConfirmations_By_CI_First(
			String caseId,
			OrderByComparator<TourismPaymentConfirmation> orderByComparator) {

		return getPersistence().
			fetchBygetTourismPaymentConfirmations_By_CI_First(
				caseId, orderByComparator);
	}

	/**
	 * Returns the last tourism payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism payment confirmation
	 * @throws NoSuchTourismPaymentConfirmationException if a matching tourism payment confirmation could not be found
	 */
	public static TourismPaymentConfirmation
			findBygetTourismPaymentConfirmations_By_CI_Last(
				String caseId,
				OrderByComparator<TourismPaymentConfirmation> orderByComparator)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismPaymentConfirmationException {

		return getPersistence().findBygetTourismPaymentConfirmations_By_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last tourism payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism payment confirmation, or <code>null</code> if a matching tourism payment confirmation could not be found
	 */
	public static TourismPaymentConfirmation
		fetchBygetTourismPaymentConfirmations_By_CI_Last(
			String caseId,
			OrderByComparator<TourismPaymentConfirmation> orderByComparator) {

		return getPersistence().
			fetchBygetTourismPaymentConfirmations_By_CI_Last(
				caseId, orderByComparator);
	}

	/**
	 * Returns the tourism payment confirmations before and after the current tourism payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param tourismPaymentId the primary key of the current tourism payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism payment confirmation
	 * @throws NoSuchTourismPaymentConfirmationException if a tourism payment confirmation with the primary key could not be found
	 */
	public static TourismPaymentConfirmation[]
			findBygetTourismPaymentConfirmations_By_CI_PrevAndNext(
				long tourismPaymentId, String caseId,
				OrderByComparator<TourismPaymentConfirmation> orderByComparator)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismPaymentConfirmationException {

		return getPersistence().
			findBygetTourismPaymentConfirmations_By_CI_PrevAndNext(
				tourismPaymentId, caseId, orderByComparator);
	}

	/**
	 * Removes all the tourism payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetTourismPaymentConfirmations_By_CI(
		String caseId) {

		getPersistence().removeBygetTourismPaymentConfirmations_By_CI(caseId);
	}

	/**
	 * Returns the number of tourism payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching tourism payment confirmations
	 */
	public static int countBygetTourismPaymentConfirmations_By_CI(
		String caseId) {

		return getPersistence().countBygetTourismPaymentConfirmations_By_CI(
			caseId);
	}

	/**
	 * Caches the tourism payment confirmation in the entity cache if it is enabled.
	 *
	 * @param tourismPaymentConfirmation the tourism payment confirmation
	 */
	public static void cacheResult(
		TourismPaymentConfirmation tourismPaymentConfirmation) {

		getPersistence().cacheResult(tourismPaymentConfirmation);
	}

	/**
	 * Caches the tourism payment confirmations in the entity cache if it is enabled.
	 *
	 * @param tourismPaymentConfirmations the tourism payment confirmations
	 */
	public static void cacheResult(
		List<TourismPaymentConfirmation> tourismPaymentConfirmations) {

		getPersistence().cacheResult(tourismPaymentConfirmations);
	}

	/**
	 * Creates a new tourism payment confirmation with the primary key. Does not add the tourism payment confirmation to the database.
	 *
	 * @param tourismPaymentId the primary key for the new tourism payment confirmation
	 * @return the new tourism payment confirmation
	 */
	public static TourismPaymentConfirmation create(long tourismPaymentId) {
		return getPersistence().create(tourismPaymentId);
	}

	/**
	 * Removes the tourism payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismPaymentId the primary key of the tourism payment confirmation
	 * @return the tourism payment confirmation that was removed
	 * @throws NoSuchTourismPaymentConfirmationException if a tourism payment confirmation with the primary key could not be found
	 */
	public static TourismPaymentConfirmation remove(long tourismPaymentId)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismPaymentConfirmationException {

		return getPersistence().remove(tourismPaymentId);
	}

	public static TourismPaymentConfirmation updateImpl(
		TourismPaymentConfirmation tourismPaymentConfirmation) {

		return getPersistence().updateImpl(tourismPaymentConfirmation);
	}

	/**
	 * Returns the tourism payment confirmation with the primary key or throws a <code>NoSuchTourismPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param tourismPaymentId the primary key of the tourism payment confirmation
	 * @return the tourism payment confirmation
	 * @throws NoSuchTourismPaymentConfirmationException if a tourism payment confirmation with the primary key could not be found
	 */
	public static TourismPaymentConfirmation findByPrimaryKey(
			long tourismPaymentId)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismPaymentConfirmationException {

		return getPersistence().findByPrimaryKey(tourismPaymentId);
	}

	/**
	 * Returns the tourism payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismPaymentId the primary key of the tourism payment confirmation
	 * @return the tourism payment confirmation, or <code>null</code> if a tourism payment confirmation with the primary key could not be found
	 */
	public static TourismPaymentConfirmation fetchByPrimaryKey(
		long tourismPaymentId) {

		return getPersistence().fetchByPrimaryKey(tourismPaymentId);
	}

	/**
	 * Returns all the tourism payment confirmations.
	 *
	 * @return the tourism payment confirmations
	 */
	public static List<TourismPaymentConfirmation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism payment confirmations
	 * @param end the upper bound of the range of tourism payment confirmations (not inclusive)
	 * @return the range of tourism payment confirmations
	 */
	public static List<TourismPaymentConfirmation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism payment confirmations
	 * @param end the upper bound of the range of tourism payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism payment confirmations
	 */
	public static List<TourismPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<TourismPaymentConfirmation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism payment confirmations
	 * @param end the upper bound of the range of tourism payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism payment confirmations
	 */
	public static List<TourismPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<TourismPaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism payment confirmations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism payment confirmations.
	 *
	 * @return the number of tourism payment confirmations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismPaymentConfirmationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismPaymentConfirmationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismPaymentConfirmationPersistence _persistence;

}