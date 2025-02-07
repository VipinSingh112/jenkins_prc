/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.stage.services.model.JadscAppliPreliminationDete;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jadsc appli prelimination dete service. This utility wraps <code>com.nbp.jadsc.stage.services.service.persistence.impl.JadscAppliPreliminationDetePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliPreliminationDetePersistence
 * @generated
 */
public class JadscAppliPreliminationDeteUtil {

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
		JadscAppliPreliminationDete jadscAppliPreliminationDete) {

		getPersistence().clearCache(jadscAppliPreliminationDete);
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
	public static Map<Serializable, JadscAppliPreliminationDete>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JadscAppliPreliminationDete> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JadscAppliPreliminationDete> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JadscAppliPreliminationDete> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JadscAppliPreliminationDete> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JadscAppliPreliminationDete update(
		JadscAppliPreliminationDete jadscAppliPreliminationDete) {

		return getPersistence().update(jadscAppliPreliminationDete);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JadscAppliPreliminationDete update(
		JadscAppliPreliminationDete jadscAppliPreliminationDete,
		ServiceContext serviceContext) {

		return getPersistence().update(
			jadscAppliPreliminationDete, serviceContext);
	}

	/**
	 * Returns the jadsc appli prelimination dete where caseId = &#63; or throws a <code>NoSuchJadscAppliPreliminationDeteException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc appli prelimination dete
	 * @throws NoSuchJadscAppliPreliminationDeteException if a matching jadsc appli prelimination dete could not be found
	 */
	public static JadscAppliPreliminationDete findBygetJadsc_PD_CI(
			String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliPreliminationDeteException {

		return getPersistence().findBygetJadsc_PD_CI(caseId);
	}

	/**
	 * Returns the jadsc appli prelimination dete where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc appli prelimination dete, or <code>null</code> if a matching jadsc appli prelimination dete could not be found
	 */
	public static JadscAppliPreliminationDete fetchBygetJadsc_PD_CI(
		String caseId) {

		return getPersistence().fetchBygetJadsc_PD_CI(caseId);
	}

	/**
	 * Returns the jadsc appli prelimination dete where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc appli prelimination dete, or <code>null</code> if a matching jadsc appli prelimination dete could not be found
	 */
	public static JadscAppliPreliminationDete fetchBygetJadsc_PD_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetJadsc_PD_CI(caseId, useFinderCache);
	}

	/**
	 * Removes the jadsc appli prelimination dete where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jadsc appli prelimination dete that was removed
	 */
	public static JadscAppliPreliminationDete removeBygetJadsc_PD_CI(
			String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliPreliminationDeteException {

		return getPersistence().removeBygetJadsc_PD_CI(caseId);
	}

	/**
	 * Returns the number of jadsc appli prelimination detes where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc appli prelimination detes
	 */
	public static int countBygetJadsc_PD_CI(String caseId) {
		return getPersistence().countBygetJadsc_PD_CI(caseId);
	}

	/**
	 * Returns all the jadsc appli prelimination detes where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @return the matching jadsc appli prelimination detes
	 */
	public static List<JadscAppliPreliminationDete> findBygetJadsc_By_PD(
		String Outcome) {

		return getPersistence().findBygetJadsc_By_PD(Outcome);
	}

	/**
	 * Returns a range of all the jadsc appli prelimination detes where Outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreliminationDeteModelImpl</code>.
	 * </p>
	 *
	 * @param Outcome the outcome
	 * @param start the lower bound of the range of jadsc appli prelimination detes
	 * @param end the upper bound of the range of jadsc appli prelimination detes (not inclusive)
	 * @return the range of matching jadsc appli prelimination detes
	 */
	public static List<JadscAppliPreliminationDete> findBygetJadsc_By_PD(
		String Outcome, int start, int end) {

		return getPersistence().findBygetJadsc_By_PD(Outcome, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc appli prelimination detes where Outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreliminationDeteModelImpl</code>.
	 * </p>
	 *
	 * @param Outcome the outcome
	 * @param start the lower bound of the range of jadsc appli prelimination detes
	 * @param end the upper bound of the range of jadsc appli prelimination detes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc appli prelimination detes
	 */
	public static List<JadscAppliPreliminationDete> findBygetJadsc_By_PD(
		String Outcome, int start, int end,
		OrderByComparator<JadscAppliPreliminationDete> orderByComparator) {

		return getPersistence().findBygetJadsc_By_PD(
			Outcome, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc appli prelimination detes where Outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreliminationDeteModelImpl</code>.
	 * </p>
	 *
	 * @param Outcome the outcome
	 * @param start the lower bound of the range of jadsc appli prelimination detes
	 * @param end the upper bound of the range of jadsc appli prelimination detes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc appli prelimination detes
	 */
	public static List<JadscAppliPreliminationDete> findBygetJadsc_By_PD(
		String Outcome, int start, int end,
		OrderByComparator<JadscAppliPreliminationDete> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJadsc_By_PD(
			Outcome, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc appli prelimination dete in the ordered set where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc appli prelimination dete
	 * @throws NoSuchJadscAppliPreliminationDeteException if a matching jadsc appli prelimination dete could not be found
	 */
	public static JadscAppliPreliminationDete findBygetJadsc_By_PD_First(
			String Outcome,
			OrderByComparator<JadscAppliPreliminationDete> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliPreliminationDeteException {

		return getPersistence().findBygetJadsc_By_PD_First(
			Outcome, orderByComparator);
	}

	/**
	 * Returns the first jadsc appli prelimination dete in the ordered set where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc appli prelimination dete, or <code>null</code> if a matching jadsc appli prelimination dete could not be found
	 */
	public static JadscAppliPreliminationDete fetchBygetJadsc_By_PD_First(
		String Outcome,
		OrderByComparator<JadscAppliPreliminationDete> orderByComparator) {

		return getPersistence().fetchBygetJadsc_By_PD_First(
			Outcome, orderByComparator);
	}

	/**
	 * Returns the last jadsc appli prelimination dete in the ordered set where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc appli prelimination dete
	 * @throws NoSuchJadscAppliPreliminationDeteException if a matching jadsc appli prelimination dete could not be found
	 */
	public static JadscAppliPreliminationDete findBygetJadsc_By_PD_Last(
			String Outcome,
			OrderByComparator<JadscAppliPreliminationDete> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliPreliminationDeteException {

		return getPersistence().findBygetJadsc_By_PD_Last(
			Outcome, orderByComparator);
	}

	/**
	 * Returns the last jadsc appli prelimination dete in the ordered set where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc appli prelimination dete, or <code>null</code> if a matching jadsc appli prelimination dete could not be found
	 */
	public static JadscAppliPreliminationDete fetchBygetJadsc_By_PD_Last(
		String Outcome,
		OrderByComparator<JadscAppliPreliminationDete> orderByComparator) {

		return getPersistence().fetchBygetJadsc_By_PD_Last(
			Outcome, orderByComparator);
	}

	/**
	 * Returns the jadsc appli prelimination detes before and after the current jadsc appli prelimination dete in the ordered set where Outcome = &#63;.
	 *
	 * @param jadscAppliPreliminationDeteId the primary key of the current jadsc appli prelimination dete
	 * @param Outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc appli prelimination dete
	 * @throws NoSuchJadscAppliPreliminationDeteException if a jadsc appli prelimination dete with the primary key could not be found
	 */
	public static JadscAppliPreliminationDete[]
			findBygetJadsc_By_PD_PrevAndNext(
				long jadscAppliPreliminationDeteId, String Outcome,
				OrderByComparator<JadscAppliPreliminationDete>
					orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliPreliminationDeteException {

		return getPersistence().findBygetJadsc_By_PD_PrevAndNext(
			jadscAppliPreliminationDeteId, Outcome, orderByComparator);
	}

	/**
	 * Removes all the jadsc appli prelimination detes where Outcome = &#63; from the database.
	 *
	 * @param Outcome the outcome
	 */
	public static void removeBygetJadsc_By_PD(String Outcome) {
		getPersistence().removeBygetJadsc_By_PD(Outcome);
	}

	/**
	 * Returns the number of jadsc appli prelimination detes where Outcome = &#63;.
	 *
	 * @param Outcome the outcome
	 * @return the number of matching jadsc appli prelimination detes
	 */
	public static int countBygetJadsc_By_PD(String Outcome) {
		return getPersistence().countBygetJadsc_By_PD(Outcome);
	}

	/**
	 * Caches the jadsc appli prelimination dete in the entity cache if it is enabled.
	 *
	 * @param jadscAppliPreliminationDete the jadsc appli prelimination dete
	 */
	public static void cacheResult(
		JadscAppliPreliminationDete jadscAppliPreliminationDete) {

		getPersistence().cacheResult(jadscAppliPreliminationDete);
	}

	/**
	 * Caches the jadsc appli prelimination detes in the entity cache if it is enabled.
	 *
	 * @param jadscAppliPreliminationDetes the jadsc appli prelimination detes
	 */
	public static void cacheResult(
		List<JadscAppliPreliminationDete> jadscAppliPreliminationDetes) {

		getPersistence().cacheResult(jadscAppliPreliminationDetes);
	}

	/**
	 * Creates a new jadsc appli prelimination dete with the primary key. Does not add the jadsc appli prelimination dete to the database.
	 *
	 * @param jadscAppliPreliminationDeteId the primary key for the new jadsc appli prelimination dete
	 * @return the new jadsc appli prelimination dete
	 */
	public static JadscAppliPreliminationDete create(
		long jadscAppliPreliminationDeteId) {

		return getPersistence().create(jadscAppliPreliminationDeteId);
	}

	/**
	 * Removes the jadsc appli prelimination dete with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscAppliPreliminationDeteId the primary key of the jadsc appli prelimination dete
	 * @return the jadsc appli prelimination dete that was removed
	 * @throws NoSuchJadscAppliPreliminationDeteException if a jadsc appli prelimination dete with the primary key could not be found
	 */
	public static JadscAppliPreliminationDete remove(
			long jadscAppliPreliminationDeteId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliPreliminationDeteException {

		return getPersistence().remove(jadscAppliPreliminationDeteId);
	}

	public static JadscAppliPreliminationDete updateImpl(
		JadscAppliPreliminationDete jadscAppliPreliminationDete) {

		return getPersistence().updateImpl(jadscAppliPreliminationDete);
	}

	/**
	 * Returns the jadsc appli prelimination dete with the primary key or throws a <code>NoSuchJadscAppliPreliminationDeteException</code> if it could not be found.
	 *
	 * @param jadscAppliPreliminationDeteId the primary key of the jadsc appli prelimination dete
	 * @return the jadsc appli prelimination dete
	 * @throws NoSuchJadscAppliPreliminationDeteException if a jadsc appli prelimination dete with the primary key could not be found
	 */
	public static JadscAppliPreliminationDete findByPrimaryKey(
			long jadscAppliPreliminationDeteId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliPreliminationDeteException {

		return getPersistence().findByPrimaryKey(jadscAppliPreliminationDeteId);
	}

	/**
	 * Returns the jadsc appli prelimination dete with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscAppliPreliminationDeteId the primary key of the jadsc appli prelimination dete
	 * @return the jadsc appli prelimination dete, or <code>null</code> if a jadsc appli prelimination dete with the primary key could not be found
	 */
	public static JadscAppliPreliminationDete fetchByPrimaryKey(
		long jadscAppliPreliminationDeteId) {

		return getPersistence().fetchByPrimaryKey(
			jadscAppliPreliminationDeteId);
	}

	/**
	 * Returns all the jadsc appli prelimination detes.
	 *
	 * @return the jadsc appli prelimination detes
	 */
	public static List<JadscAppliPreliminationDete> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jadsc appli prelimination detes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreliminationDeteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli prelimination detes
	 * @param end the upper bound of the range of jadsc appli prelimination detes (not inclusive)
	 * @return the range of jadsc appli prelimination detes
	 */
	public static List<JadscAppliPreliminationDete> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc appli prelimination detes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreliminationDeteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli prelimination detes
	 * @param end the upper bound of the range of jadsc appli prelimination detes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc appli prelimination detes
	 */
	public static List<JadscAppliPreliminationDete> findAll(
		int start, int end,
		OrderByComparator<JadscAppliPreliminationDete> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc appli prelimination detes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreliminationDeteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli prelimination detes
	 * @param end the upper bound of the range of jadsc appli prelimination detes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc appli prelimination detes
	 */
	public static List<JadscAppliPreliminationDete> findAll(
		int start, int end,
		OrderByComparator<JadscAppliPreliminationDete> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jadsc appli prelimination detes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jadsc appli prelimination detes.
	 *
	 * @return the number of jadsc appli prelimination detes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JadscAppliPreliminationDetePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JadscAppliPreliminationDetePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JadscAppliPreliminationDetePersistence _persistence;

}