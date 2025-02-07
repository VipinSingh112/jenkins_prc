/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.stage.services.model.JadscAppliFinalDeter;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jadsc appli final deter service. This utility wraps <code>com.nbp.jadsc.stage.services.service.persistence.impl.JadscAppliFinalDeterPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliFinalDeterPersistence
 * @generated
 */
public class JadscAppliFinalDeterUtil {

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
	public static void clearCache(JadscAppliFinalDeter jadscAppliFinalDeter) {
		getPersistence().clearCache(jadscAppliFinalDeter);
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
	public static Map<Serializable, JadscAppliFinalDeter> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JadscAppliFinalDeter> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JadscAppliFinalDeter> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JadscAppliFinalDeter> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JadscAppliFinalDeter> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JadscAppliFinalDeter update(
		JadscAppliFinalDeter jadscAppliFinalDeter) {

		return getPersistence().update(jadscAppliFinalDeter);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JadscAppliFinalDeter update(
		JadscAppliFinalDeter jadscAppliFinalDeter,
		ServiceContext serviceContext) {

		return getPersistence().update(jadscAppliFinalDeter, serviceContext);
	}

	/**
	 * Returns the jadsc appli final deter where caseId = &#63; or throws a <code>NoSuchJadscAppliFinalDeterException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc appli final deter
	 * @throws NoSuchJadscAppliFinalDeterException if a matching jadsc appli final deter could not be found
	 */
	public static JadscAppliFinalDeter findBygetJadsc_FD_CI(String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliFinalDeterException {

		return getPersistence().findBygetJadsc_FD_CI(caseId);
	}

	/**
	 * Returns the jadsc appli final deter where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc appli final deter, or <code>null</code> if a matching jadsc appli final deter could not be found
	 */
	public static JadscAppliFinalDeter fetchBygetJadsc_FD_CI(String caseId) {
		return getPersistence().fetchBygetJadsc_FD_CI(caseId);
	}

	/**
	 * Returns the jadsc appli final deter where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc appli final deter, or <code>null</code> if a matching jadsc appli final deter could not be found
	 */
	public static JadscAppliFinalDeter fetchBygetJadsc_FD_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetJadsc_FD_CI(caseId, useFinderCache);
	}

	/**
	 * Removes the jadsc appli final deter where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jadsc appli final deter that was removed
	 */
	public static JadscAppliFinalDeter removeBygetJadsc_FD_CI(String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliFinalDeterException {

		return getPersistence().removeBygetJadsc_FD_CI(caseId);
	}

	/**
	 * Returns the number of jadsc appli final deters where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc appli final deters
	 */
	public static int countBygetJadsc_FD_CI(String caseId) {
		return getPersistence().countBygetJadsc_FD_CI(caseId);
	}

	/**
	 * Returns all the jadsc appli final deters where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @return the matching jadsc appli final deters
	 */
	public static List<JadscAppliFinalDeter> findBygetJadsc_By_FD(
		String Outcome) {

		return getPersistence().findBygetJadsc_By_FD(Outcome);
	}

	/**
	 * Returns a range of all the jadsc appli final deters where Outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliFinalDeterModelImpl</code>.
	 * </p>
	 *
	 * @param Outcome the outcome
	 * @param start the lower bound of the range of jadsc appli final deters
	 * @param end the upper bound of the range of jadsc appli final deters (not inclusive)
	 * @return the range of matching jadsc appli final deters
	 */
	public static List<JadscAppliFinalDeter> findBygetJadsc_By_FD(
		String Outcome, int start, int end) {

		return getPersistence().findBygetJadsc_By_FD(Outcome, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc appli final deters where Outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliFinalDeterModelImpl</code>.
	 * </p>
	 *
	 * @param Outcome the outcome
	 * @param start the lower bound of the range of jadsc appli final deters
	 * @param end the upper bound of the range of jadsc appli final deters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc appli final deters
	 */
	public static List<JadscAppliFinalDeter> findBygetJadsc_By_FD(
		String Outcome, int start, int end,
		OrderByComparator<JadscAppliFinalDeter> orderByComparator) {

		return getPersistence().findBygetJadsc_By_FD(
			Outcome, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc appli final deters where Outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliFinalDeterModelImpl</code>.
	 * </p>
	 *
	 * @param Outcome the outcome
	 * @param start the lower bound of the range of jadsc appli final deters
	 * @param end the upper bound of the range of jadsc appli final deters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc appli final deters
	 */
	public static List<JadscAppliFinalDeter> findBygetJadsc_By_FD(
		String Outcome, int start, int end,
		OrderByComparator<JadscAppliFinalDeter> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJadsc_By_FD(
			Outcome, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc appli final deter in the ordered set where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc appli final deter
	 * @throws NoSuchJadscAppliFinalDeterException if a matching jadsc appli final deter could not be found
	 */
	public static JadscAppliFinalDeter findBygetJadsc_By_FD_First(
			String Outcome,
			OrderByComparator<JadscAppliFinalDeter> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliFinalDeterException {

		return getPersistence().findBygetJadsc_By_FD_First(
			Outcome, orderByComparator);
	}

	/**
	 * Returns the first jadsc appli final deter in the ordered set where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc appli final deter, or <code>null</code> if a matching jadsc appli final deter could not be found
	 */
	public static JadscAppliFinalDeter fetchBygetJadsc_By_FD_First(
		String Outcome,
		OrderByComparator<JadscAppliFinalDeter> orderByComparator) {

		return getPersistence().fetchBygetJadsc_By_FD_First(
			Outcome, orderByComparator);
	}

	/**
	 * Returns the last jadsc appli final deter in the ordered set where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc appli final deter
	 * @throws NoSuchJadscAppliFinalDeterException if a matching jadsc appli final deter could not be found
	 */
	public static JadscAppliFinalDeter findBygetJadsc_By_FD_Last(
			String Outcome,
			OrderByComparator<JadscAppliFinalDeter> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliFinalDeterException {

		return getPersistence().findBygetJadsc_By_FD_Last(
			Outcome, orderByComparator);
	}

	/**
	 * Returns the last jadsc appli final deter in the ordered set where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc appli final deter, or <code>null</code> if a matching jadsc appli final deter could not be found
	 */
	public static JadscAppliFinalDeter fetchBygetJadsc_By_FD_Last(
		String Outcome,
		OrderByComparator<JadscAppliFinalDeter> orderByComparator) {

		return getPersistence().fetchBygetJadsc_By_FD_Last(
			Outcome, orderByComparator);
	}

	/**
	 * Returns the jadsc appli final deters before and after the current jadsc appli final deter in the ordered set where Outcome = &#63;.
	 *
	 * @param jadscAppliFinalDeterId the primary key of the current jadsc appli final deter
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc appli final deter
	 * @throws NoSuchJadscAppliFinalDeterException if a jadsc appli final deter with the primary key could not be found
	 */
	public static JadscAppliFinalDeter[] findBygetJadsc_By_FD_PrevAndNext(
			long jadscAppliFinalDeterId, String Outcome,
			OrderByComparator<JadscAppliFinalDeter> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliFinalDeterException {

		return getPersistence().findBygetJadsc_By_FD_PrevAndNext(
			jadscAppliFinalDeterId, Outcome, orderByComparator);
	}

	/**
	 * Removes all the jadsc appli final deters where Outcome = &#63; from the database.
	 *
	 * @param Outcome the outcome
	 */
	public static void removeBygetJadsc_By_FD(String Outcome) {
		getPersistence().removeBygetJadsc_By_FD(Outcome);
	}

	/**
	 * Returns the number of jadsc appli final deters where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @return the number of matching jadsc appli final deters
	 */
	public static int countBygetJadsc_By_FD(String Outcome) {
		return getPersistence().countBygetJadsc_By_FD(Outcome);
	}

	/**
	 * Caches the jadsc appli final deter in the entity cache if it is enabled.
	 *
	 * @param jadscAppliFinalDeter the jadsc appli final deter
	 */
	public static void cacheResult(JadscAppliFinalDeter jadscAppliFinalDeter) {
		getPersistence().cacheResult(jadscAppliFinalDeter);
	}

	/**
	 * Caches the jadsc appli final deters in the entity cache if it is enabled.
	 *
	 * @param jadscAppliFinalDeters the jadsc appli final deters
	 */
	public static void cacheResult(
		List<JadscAppliFinalDeter> jadscAppliFinalDeters) {

		getPersistence().cacheResult(jadscAppliFinalDeters);
	}

	/**
	 * Creates a new jadsc appli final deter with the primary key. Does not add the jadsc appli final deter to the database.
	 *
	 * @param jadscAppliFinalDeterId the primary key for the new jadsc appli final deter
	 * @return the new jadsc appli final deter
	 */
	public static JadscAppliFinalDeter create(long jadscAppliFinalDeterId) {
		return getPersistence().create(jadscAppliFinalDeterId);
	}

	/**
	 * Removes the jadsc appli final deter with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscAppliFinalDeterId the primary key of the jadsc appli final deter
	 * @return the jadsc appli final deter that was removed
	 * @throws NoSuchJadscAppliFinalDeterException if a jadsc appli final deter with the primary key could not be found
	 */
	public static JadscAppliFinalDeter remove(long jadscAppliFinalDeterId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliFinalDeterException {

		return getPersistence().remove(jadscAppliFinalDeterId);
	}

	public static JadscAppliFinalDeter updateImpl(
		JadscAppliFinalDeter jadscAppliFinalDeter) {

		return getPersistence().updateImpl(jadscAppliFinalDeter);
	}

	/**
	 * Returns the jadsc appli final deter with the primary key or throws a <code>NoSuchJadscAppliFinalDeterException</code> if it could not be found.
	 *
	 * @param jadscAppliFinalDeterId the primary key of the jadsc appli final deter
	 * @return the jadsc appli final deter
	 * @throws NoSuchJadscAppliFinalDeterException if a jadsc appli final deter with the primary key could not be found
	 */
	public static JadscAppliFinalDeter findByPrimaryKey(
			long jadscAppliFinalDeterId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliFinalDeterException {

		return getPersistence().findByPrimaryKey(jadscAppliFinalDeterId);
	}

	/**
	 * Returns the jadsc appli final deter with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscAppliFinalDeterId the primary key of the jadsc appli final deter
	 * @return the jadsc appli final deter, or <code>null</code> if a jadsc appli final deter with the primary key could not be found
	 */
	public static JadscAppliFinalDeter fetchByPrimaryKey(
		long jadscAppliFinalDeterId) {

		return getPersistence().fetchByPrimaryKey(jadscAppliFinalDeterId);
	}

	/**
	 * Returns all the jadsc appli final deters.
	 *
	 * @return the jadsc appli final deters
	 */
	public static List<JadscAppliFinalDeter> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jadsc appli final deters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliFinalDeterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli final deters
	 * @param end the upper bound of the range of jadsc appli final deters (not inclusive)
	 * @return the range of jadsc appli final deters
	 */
	public static List<JadscAppliFinalDeter> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc appli final deters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliFinalDeterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli final deters
	 * @param end the upper bound of the range of jadsc appli final deters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc appli final deters
	 */
	public static List<JadscAppliFinalDeter> findAll(
		int start, int end,
		OrderByComparator<JadscAppliFinalDeter> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc appli final deters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliFinalDeterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli final deters
	 * @param end the upper bound of the range of jadsc appli final deters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc appli final deters
	 */
	public static List<JadscAppliFinalDeter> findAll(
		int start, int end,
		OrderByComparator<JadscAppliFinalDeter> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jadsc appli final deters from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jadsc appli final deters.
	 *
	 * @return the number of jadsc appli final deters
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JadscAppliFinalDeterPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JadscAppliFinalDeterPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JadscAppliFinalDeterPersistence _persistence;

}