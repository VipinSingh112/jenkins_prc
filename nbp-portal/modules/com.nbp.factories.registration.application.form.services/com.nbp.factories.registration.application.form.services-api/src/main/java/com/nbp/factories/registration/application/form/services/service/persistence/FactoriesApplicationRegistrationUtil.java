/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.factories.registration.application.form.services.model.FactoriesApplicationRegistration;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the factories application registration service. This utility wraps <code>com.nbp.factories.registration.application.form.services.service.persistence.impl.FactoriesApplicationRegistrationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesApplicationRegistrationPersistence
 * @generated
 */
public class FactoriesApplicationRegistrationUtil {

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
		FactoriesApplicationRegistration factoriesApplicationRegistration) {

		getPersistence().clearCache(factoriesApplicationRegistration);
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
	public static Map<Serializable, FactoriesApplicationRegistration>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FactoriesApplicationRegistration> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FactoriesApplicationRegistration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FactoriesApplicationRegistration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FactoriesApplicationRegistration> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FactoriesApplicationRegistration update(
		FactoriesApplicationRegistration factoriesApplicationRegistration) {

		return getPersistence().update(factoriesApplicationRegistration);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FactoriesApplicationRegistration update(
		FactoriesApplicationRegistration factoriesApplicationRegistration,
		ServiceContext serviceContext) {

		return getPersistence().update(
			factoriesApplicationRegistration, serviceContext);
	}

	/**
	 * Returns the factories application registration where factoriesApplicationId = &#63; or throws a <code>NoSuchFactoriesApplicationRegistrationException</code> if it could not be found.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
			findBygetFactoriesRegistrationById(long factoriesApplicationId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesApplicationRegistrationException {

		return getPersistence().findBygetFactoriesRegistrationById(
			factoriesApplicationId);
	}

	/**
	 * Returns the factories application registration where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationById(long factoriesApplicationId) {

		return getPersistence().fetchBygetFactoriesRegistrationById(
			factoriesApplicationId);
	}

	/**
	 * Returns the factories application registration where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationById(
			long factoriesApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetFactoriesRegistrationById(
			factoriesApplicationId, useFinderCache);
	}

	/**
	 * Removes the factories application registration where factoriesApplicationId = &#63; from the database.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the factories application registration that was removed
	 */
	public static FactoriesApplicationRegistration
			removeBygetFactoriesRegistrationById(long factoriesApplicationId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesApplicationRegistrationException {

		return getPersistence().removeBygetFactoriesRegistrationById(
			factoriesApplicationId);
	}

	/**
	 * Returns the number of factories application registrations where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories application registrations
	 */
	public static int countBygetFactoriesRegistrationById(
		long factoriesApplicationId) {

		return getPersistence().countBygetFactoriesRegistrationById(
			factoriesApplicationId);
	}

	/**
	 * Returns all the factories application registrations where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching factories application registrations
	 */
	public static List<FactoriesApplicationRegistration>
		findBygetFactoriesRegistrationApplicationByStatusUser(
			int status, long userId) {

		return getPersistence().
			findBygetFactoriesRegistrationApplicationByStatusUser(
				status, userId);
	}

	/**
	 * Returns a range of all the factories application registrations where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @return the range of matching factories application registrations
	 */
	public static List<FactoriesApplicationRegistration>
		findBygetFactoriesRegistrationApplicationByStatusUser(
			int status, long userId, int start, int end) {

		return getPersistence().
			findBygetFactoriesRegistrationApplicationByStatusUser(
				status, userId, start, end);
	}

	/**
	 * Returns an ordered range of all the factories application registrations where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories application registrations
	 */
	public static List<FactoriesApplicationRegistration>
		findBygetFactoriesRegistrationApplicationByStatusUser(
			int status, long userId, int start, int end,
			OrderByComparator<FactoriesApplicationRegistration>
				orderByComparator) {

		return getPersistence().
			findBygetFactoriesRegistrationApplicationByStatusUser(
				status, userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories application registrations where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories application registrations
	 */
	public static List<FactoriesApplicationRegistration>
		findBygetFactoriesRegistrationApplicationByStatusUser(
			int status, long userId, int start, int end,
			OrderByComparator<FactoriesApplicationRegistration>
				orderByComparator,
			boolean useFinderCache) {

		return getPersistence().
			findBygetFactoriesRegistrationApplicationByStatusUser(
				status, userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first factories application registration in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
			findBygetFactoriesRegistrationApplicationByStatusUser_First(
				int status, long userId,
				OrderByComparator<FactoriesApplicationRegistration>
					orderByComparator)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesApplicationRegistrationException {

		return getPersistence().
			findBygetFactoriesRegistrationApplicationByStatusUser_First(
				status, userId, orderByComparator);
	}

	/**
	 * Returns the first factories application registration in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationApplicationByStatusUser_First(
			int status, long userId,
			OrderByComparator<FactoriesApplicationRegistration>
				orderByComparator) {

		return getPersistence().
			fetchBygetFactoriesRegistrationApplicationByStatusUser_First(
				status, userId, orderByComparator);
	}

	/**
	 * Returns the last factories application registration in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
			findBygetFactoriesRegistrationApplicationByStatusUser_Last(
				int status, long userId,
				OrderByComparator<FactoriesApplicationRegistration>
					orderByComparator)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesApplicationRegistrationException {

		return getPersistence().
			findBygetFactoriesRegistrationApplicationByStatusUser_Last(
				status, userId, orderByComparator);
	}

	/**
	 * Returns the last factories application registration in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationApplicationByStatusUser_Last(
			int status, long userId,
			OrderByComparator<FactoriesApplicationRegistration>
				orderByComparator) {

		return getPersistence().
			fetchBygetFactoriesRegistrationApplicationByStatusUser_Last(
				status, userId, orderByComparator);
	}

	/**
	 * Returns the factories application registrations before and after the current factories application registration in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param factoriesApplicationId the primary key of the current factories application registration
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a factories application registration with the primary key could not be found
	 */
	public static FactoriesApplicationRegistration[]
			findBygetFactoriesRegistrationApplicationByStatusUser_PrevAndNext(
				long factoriesApplicationId, int status, long userId,
				OrderByComparator<FactoriesApplicationRegistration>
					orderByComparator)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesApplicationRegistrationException {

		return getPersistence().
			findBygetFactoriesRegistrationApplicationByStatusUser_PrevAndNext(
				factoriesApplicationId, status, userId, orderByComparator);
	}

	/**
	 * Removes all the factories application registrations where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public static void removeBygetFactoriesRegistrationApplicationByStatusUser(
		int status, long userId) {

		getPersistence().
			removeBygetFactoriesRegistrationApplicationByStatusUser(
				status, userId);
	}

	/**
	 * Returns the number of factories application registrations where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching factories application registrations
	 */
	public static int countBygetFactoriesRegistrationApplicationByStatusUser(
		int status, long userId) {

		return getPersistence().
			countBygetFactoriesRegistrationApplicationByStatusUser(
				status, userId);
	}

	/**
	 * Returns all the factories application registrations where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching factories application registrations
	 */
	public static List<FactoriesApplicationRegistration>
		findBygetFactoriesRegistrationByStatus(int status) {

		return getPersistence().findBygetFactoriesRegistrationByStatus(status);
	}

	/**
	 * Returns a range of all the factories application registrations where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @return the range of matching factories application registrations
	 */
	public static List<FactoriesApplicationRegistration>
		findBygetFactoriesRegistrationByStatus(int status, int start, int end) {

		return getPersistence().findBygetFactoriesRegistrationByStatus(
			status, start, end);
	}

	/**
	 * Returns an ordered range of all the factories application registrations where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories application registrations
	 */
	public static List<FactoriesApplicationRegistration>
		findBygetFactoriesRegistrationByStatus(
			int status, int start, int end,
			OrderByComparator<FactoriesApplicationRegistration>
				orderByComparator) {

		return getPersistence().findBygetFactoriesRegistrationByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories application registrations where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories application registrations
	 */
	public static List<FactoriesApplicationRegistration>
		findBygetFactoriesRegistrationByStatus(
			int status, int start, int end,
			OrderByComparator<FactoriesApplicationRegistration>
				orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetFactoriesRegistrationByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first factories application registration in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
			findBygetFactoriesRegistrationByStatus_First(
				int status,
				OrderByComparator<FactoriesApplicationRegistration>
					orderByComparator)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesApplicationRegistrationException {

		return getPersistence().findBygetFactoriesRegistrationByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first factories application registration in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationByStatus_First(
			int status,
			OrderByComparator<FactoriesApplicationRegistration>
				orderByComparator) {

		return getPersistence().fetchBygetFactoriesRegistrationByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last factories application registration in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
			findBygetFactoriesRegistrationByStatus_Last(
				int status,
				OrderByComparator<FactoriesApplicationRegistration>
					orderByComparator)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesApplicationRegistrationException {

		return getPersistence().findBygetFactoriesRegistrationByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last factories application registration in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationByStatus_Last(
			int status,
			OrderByComparator<FactoriesApplicationRegistration>
				orderByComparator) {

		return getPersistence().fetchBygetFactoriesRegistrationByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the factories application registrations before and after the current factories application registration in the ordered set where status = &#63;.
	 *
	 * @param factoriesApplicationId the primary key of the current factories application registration
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a factories application registration with the primary key could not be found
	 */
	public static FactoriesApplicationRegistration[]
			findBygetFactoriesRegistrationByStatus_PrevAndNext(
				long factoriesApplicationId, int status,
				OrderByComparator<FactoriesApplicationRegistration>
					orderByComparator)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesApplicationRegistrationException {

		return getPersistence().
			findBygetFactoriesRegistrationByStatus_PrevAndNext(
				factoriesApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the factories application registrations where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetFactoriesRegistrationByStatus(int status) {
		getPersistence().removeBygetFactoriesRegistrationByStatus(status);
	}

	/**
	 * Returns the number of factories application registrations where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching factories application registrations
	 */
	public static int countBygetFactoriesRegistrationByStatus(int status) {
		return getPersistence().countBygetFactoriesRegistrationByStatus(status);
	}

	/**
	 * Returns the factories application registration where applicationNumber = &#63; or throws a <code>NoSuchFactoriesApplicationRegistrationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
			findBygetFactoriesRegistrationByAppNo(String applicationNumber)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesApplicationRegistrationException {

		return getPersistence().findBygetFactoriesRegistrationByAppNo(
			applicationNumber);
	}

	/**
	 * Returns the factories application registration where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationByAppNo(String applicationNumber) {

		return getPersistence().fetchBygetFactoriesRegistrationByAppNo(
			applicationNumber);
	}

	/**
	 * Returns the factories application registration where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationByAppNo(
			String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetFactoriesRegistrationByAppNo(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the factories application registration where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the factories application registration that was removed
	 */
	public static FactoriesApplicationRegistration
			removeBygetFactoriesRegistrationByAppNo(String applicationNumber)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesApplicationRegistrationException {

		return getPersistence().removeBygetFactoriesRegistrationByAppNo(
			applicationNumber);
	}

	/**
	 * Returns the number of factories application registrations where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching factories application registrations
	 */
	public static int countBygetFactoriesRegistrationByAppNo(
		String applicationNumber) {

		return getPersistence().countBygetFactoriesRegistrationByAppNo(
			applicationNumber);
	}

	/**
	 * Returns the factories application registration where caseId = &#63; or throws a <code>NoSuchFactoriesApplicationRegistrationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
			findBygetFactoriesRegistrationByCaseId(String caseId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesApplicationRegistrationException {

		return getPersistence().findBygetFactoriesRegistrationByCaseId(caseId);
	}

	/**
	 * Returns the factories application registration where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationByCaseId(String caseId) {

		return getPersistence().fetchBygetFactoriesRegistrationByCaseId(caseId);
	}

	/**
	 * Returns the factories application registration where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
		fetchBygetFactoriesRegistrationByCaseId(
			String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetFactoriesRegistrationByCaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the factories application registration where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the factories application registration that was removed
	 */
	public static FactoriesApplicationRegistration
			removeBygetFactoriesRegistrationByCaseId(String caseId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesApplicationRegistrationException {

		return getPersistence().removeBygetFactoriesRegistrationByCaseId(
			caseId);
	}

	/**
	 * Returns the number of factories application registrations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories application registrations
	 */
	public static int countBygetFactoriesRegistrationByCaseId(String caseId) {
		return getPersistence().countBygetFactoriesRegistrationByCaseId(caseId);
	}

	/**
	 * Returns the factories application registration where applicationNumber = &#63; or throws a <code>NoSuchFactoriesApplicationRegistrationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
			findBygetFactoriesRegstBy_AppNo(String applicationNumber)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesApplicationRegistrationException {

		return getPersistence().findBygetFactoriesRegstBy_AppNo(
			applicationNumber);
	}

	/**
	 * Returns the factories application registration where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
		fetchBygetFactoriesRegstBy_AppNo(String applicationNumber) {

		return getPersistence().fetchBygetFactoriesRegstBy_AppNo(
			applicationNumber);
	}

	/**
	 * Returns the factories application registration where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
		fetchBygetFactoriesRegstBy_AppNo(
			String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetFactoriesRegstBy_AppNo(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the factories application registration where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the factories application registration that was removed
	 */
	public static FactoriesApplicationRegistration
			removeBygetFactoriesRegstBy_AppNo(String applicationNumber)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesApplicationRegistrationException {

		return getPersistence().removeBygetFactoriesRegstBy_AppNo(
			applicationNumber);
	}

	/**
	 * Returns the number of factories application registrations where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching factories application registrations
	 */
	public static int countBygetFactoriesRegstBy_AppNo(
		String applicationNumber) {

		return getPersistence().countBygetFactoriesRegstBy_AppNo(
			applicationNumber);
	}

	/**
	 * Returns the factories application registration where caseId = &#63; or throws a <code>NoSuchFactoriesApplicationRegistrationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
			findBygetFactoriesRegstBy_CaseId(String caseId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesApplicationRegistrationException {

		return getPersistence().findBygetFactoriesRegstBy_CaseId(caseId);
	}

	/**
	 * Returns the factories application registration where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
		fetchBygetFactoriesRegstBy_CaseId(String caseId) {

		return getPersistence().fetchBygetFactoriesRegstBy_CaseId(caseId);
	}

	/**
	 * Returns the factories application registration where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
		fetchBygetFactoriesRegstBy_CaseId(
			String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetFactoriesRegstBy_CaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the factories application registration where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the factories application registration that was removed
	 */
	public static FactoriesApplicationRegistration
			removeBygetFactoriesRegstBy_CaseId(String caseId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesApplicationRegistrationException {

		return getPersistence().removeBygetFactoriesRegstBy_CaseId(caseId);
	}

	/**
	 * Returns the number of factories application registrations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories application registrations
	 */
	public static int countBygetFactoriesRegstBy_CaseId(String caseId) {
		return getPersistence().countBygetFactoriesRegstBy_CaseId(caseId);
	}

	/**
	 * Returns the factories application registration where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchFactoriesApplicationRegistrationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
			findBygetFactoriesRegstByAT_AppNo(
				String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesApplicationRegistrationException {

		return getPersistence().findBygetFactoriesRegstByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the factories application registration where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
		fetchBygetFactoriesRegstByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber) {

		return getPersistence().fetchBygetFactoriesRegstByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the factories application registration where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application registration, or <code>null</code> if a matching factories application registration could not be found
	 */
	public static FactoriesApplicationRegistration
		fetchBygetFactoriesRegstByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber,
			boolean useFinderCache) {

		return getPersistence().fetchBygetFactoriesRegstByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber, useFinderCache);
	}

	/**
	 * Removes the factories application registration where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the factories application registration that was removed
	 */
	public static FactoriesApplicationRegistration
			removeBygetFactoriesRegstByAT_AppNo(
				String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesApplicationRegistrationException {

		return getPersistence().removeBygetFactoriesRegstByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the number of factories application registrations where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching factories application registrations
	 */
	public static int countBygetFactoriesRegstByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		return getPersistence().countBygetFactoriesRegstByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Caches the factories application registration in the entity cache if it is enabled.
	 *
	 * @param factoriesApplicationRegistration the factories application registration
	 */
	public static void cacheResult(
		FactoriesApplicationRegistration factoriesApplicationRegistration) {

		getPersistence().cacheResult(factoriesApplicationRegistration);
	}

	/**
	 * Caches the factories application registrations in the entity cache if it is enabled.
	 *
	 * @param factoriesApplicationRegistrations the factories application registrations
	 */
	public static void cacheResult(
		List<FactoriesApplicationRegistration>
			factoriesApplicationRegistrations) {

		getPersistence().cacheResult(factoriesApplicationRegistrations);
	}

	/**
	 * Creates a new factories application registration with the primary key. Does not add the factories application registration to the database.
	 *
	 * @param factoriesApplicationId the primary key for the new factories application registration
	 * @return the new factories application registration
	 */
	public static FactoriesApplicationRegistration create(
		long factoriesApplicationId) {

		return getPersistence().create(factoriesApplicationId);
	}

	/**
	 * Removes the factories application registration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesApplicationId the primary key of the factories application registration
	 * @return the factories application registration that was removed
	 * @throws NoSuchFactoriesApplicationRegistrationException if a factories application registration with the primary key could not be found
	 */
	public static FactoriesApplicationRegistration remove(
			long factoriesApplicationId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesApplicationRegistrationException {

		return getPersistence().remove(factoriesApplicationId);
	}

	public static FactoriesApplicationRegistration updateImpl(
		FactoriesApplicationRegistration factoriesApplicationRegistration) {

		return getPersistence().updateImpl(factoriesApplicationRegistration);
	}

	/**
	 * Returns the factories application registration with the primary key or throws a <code>NoSuchFactoriesApplicationRegistrationException</code> if it could not be found.
	 *
	 * @param factoriesApplicationId the primary key of the factories application registration
	 * @return the factories application registration
	 * @throws NoSuchFactoriesApplicationRegistrationException if a factories application registration with the primary key could not be found
	 */
	public static FactoriesApplicationRegistration findByPrimaryKey(
			long factoriesApplicationId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesApplicationRegistrationException {

		return getPersistence().findByPrimaryKey(factoriesApplicationId);
	}

	/**
	 * Returns the factories application registration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesApplicationId the primary key of the factories application registration
	 * @return the factories application registration, or <code>null</code> if a factories application registration with the primary key could not be found
	 */
	public static FactoriesApplicationRegistration fetchByPrimaryKey(
		long factoriesApplicationId) {

		return getPersistence().fetchByPrimaryKey(factoriesApplicationId);
	}

	/**
	 * Returns all the factories application registrations.
	 *
	 * @return the factories application registrations
	 */
	public static List<FactoriesApplicationRegistration> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the factories application registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @return the range of factories application registrations
	 */
	public static List<FactoriesApplicationRegistration> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the factories application registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories application registrations
	 */
	public static List<FactoriesApplicationRegistration> findAll(
		int start, int end,
		OrderByComparator<FactoriesApplicationRegistration> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories application registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories application registrations
	 */
	public static List<FactoriesApplicationRegistration> findAll(
		int start, int end,
		OrderByComparator<FactoriesApplicationRegistration> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the factories application registrations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of factories application registrations.
	 *
	 * @return the number of factories application registrations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FactoriesApplicationRegistrationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FactoriesApplicationRegistrationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FactoriesApplicationRegistrationPersistence
		_persistence;

}