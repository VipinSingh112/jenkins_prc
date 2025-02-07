/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.stage.services.model.JadscApplicationInitiateInvestigation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jadsc application initiate investigation service. This utility wraps <code>com.nbp.jadsc.stage.services.service.persistence.impl.JadscApplicationInitiateInvestigationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JadscApplicationInitiateInvestigationPersistence
 * @generated
 */
public class JadscApplicationInitiateInvestigationUtil {

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
		JadscApplicationInitiateInvestigation
			jadscApplicationInitiateInvestigation) {

		getPersistence().clearCache(jadscApplicationInitiateInvestigation);
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
	public static Map<Serializable, JadscApplicationInitiateInvestigation>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JadscApplicationInitiateInvestigation>
		findWithDynamicQuery(DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JadscApplicationInitiateInvestigation>
		findWithDynamicQuery(DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JadscApplicationInitiateInvestigation>
		findWithDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<JadscApplicationInitiateInvestigation>
				orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JadscApplicationInitiateInvestigation update(
		JadscApplicationInitiateInvestigation
			jadscApplicationInitiateInvestigation) {

		return getPersistence().update(jadscApplicationInitiateInvestigation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JadscApplicationInitiateInvestigation update(
		JadscApplicationInitiateInvestigation
			jadscApplicationInitiateInvestigation,
		ServiceContext serviceContext) {

		return getPersistence().update(
			jadscApplicationInitiateInvestigation, serviceContext);
	}

	/**
	 * Returns the jadsc application initiate investigation where caseId = &#63; or throws a <code>NoSuchJadscApplicationInitiateInvestigationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application initiate investigation
	 * @throws NoSuchJadscApplicationInitiateInvestigationException if a matching jadsc application initiate investigation could not be found
	 */
	public static JadscApplicationInitiateInvestigation findBygetJadsc_II_CI(
			String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationInitiateInvestigationException {

		return getPersistence().findBygetJadsc_II_CI(caseId);
	}

	/**
	 * Returns the jadsc application initiate investigation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application initiate investigation, or <code>null</code> if a matching jadsc application initiate investigation could not be found
	 */
	public static JadscApplicationInitiateInvestigation fetchBygetJadsc_II_CI(
		String caseId) {

		return getPersistence().fetchBygetJadsc_II_CI(caseId);
	}

	/**
	 * Returns the jadsc application initiate investigation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application initiate investigation, or <code>null</code> if a matching jadsc application initiate investigation could not be found
	 */
	public static JadscApplicationInitiateInvestigation fetchBygetJadsc_II_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetJadsc_II_CI(caseId, useFinderCache);
	}

	/**
	 * Removes the jadsc application initiate investigation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jadsc application initiate investigation that was removed
	 */
	public static JadscApplicationInitiateInvestigation removeBygetJadsc_II_CI(
			String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationInitiateInvestigationException {

		return getPersistence().removeBygetJadsc_II_CI(caseId);
	}

	/**
	 * Returns the number of jadsc application initiate investigations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc application initiate investigations
	 */
	public static int countBygetJadsc_II_CI(String caseId) {
		return getPersistence().countBygetJadsc_II_CI(caseId);
	}

	/**
	 * Returns all the jadsc application initiate investigations where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @return the matching jadsc application initiate investigations
	 */
	public static List<JadscApplicationInitiateInvestigation>
		findBygetJadsc_By_II(String outcome) {

		return getPersistence().findBygetJadsc_By_II(outcome);
	}

	/**
	 * Returns a range of all the jadsc application initiate investigations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationInitiateInvestigationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc application initiate investigations
	 * @param end the upper bound of the range of jadsc application initiate investigations (not inclusive)
	 * @return the range of matching jadsc application initiate investigations
	 */
	public static List<JadscApplicationInitiateInvestigation>
		findBygetJadsc_By_II(String outcome, int start, int end) {

		return getPersistence().findBygetJadsc_By_II(outcome, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc application initiate investigations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationInitiateInvestigationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc application initiate investigations
	 * @param end the upper bound of the range of jadsc application initiate investigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc application initiate investigations
	 */
	public static List<JadscApplicationInitiateInvestigation>
		findBygetJadsc_By_II(
			String outcome, int start, int end,
			OrderByComparator<JadscApplicationInitiateInvestigation>
				orderByComparator) {

		return getPersistence().findBygetJadsc_By_II(
			outcome, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc application initiate investigations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationInitiateInvestigationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc application initiate investigations
	 * @param end the upper bound of the range of jadsc application initiate investigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc application initiate investigations
	 */
	public static List<JadscApplicationInitiateInvestigation>
		findBygetJadsc_By_II(
			String outcome, int start, int end,
			OrderByComparator<JadscApplicationInitiateInvestigation>
				orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetJadsc_By_II(
			outcome, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc application initiate investigation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application initiate investigation
	 * @throws NoSuchJadscApplicationInitiateInvestigationException if a matching jadsc application initiate investigation could not be found
	 */
	public static JadscApplicationInitiateInvestigation
			findBygetJadsc_By_II_First(
				String outcome,
				OrderByComparator<JadscApplicationInitiateInvestigation>
					orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationInitiateInvestigationException {

		return getPersistence().findBygetJadsc_By_II_First(
			outcome, orderByComparator);
	}

	/**
	 * Returns the first jadsc application initiate investigation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application initiate investigation, or <code>null</code> if a matching jadsc application initiate investigation could not be found
	 */
	public static JadscApplicationInitiateInvestigation
		fetchBygetJadsc_By_II_First(
			String outcome,
			OrderByComparator<JadscApplicationInitiateInvestigation>
				orderByComparator) {

		return getPersistence().fetchBygetJadsc_By_II_First(
			outcome, orderByComparator);
	}

	/**
	 * Returns the last jadsc application initiate investigation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application initiate investigation
	 * @throws NoSuchJadscApplicationInitiateInvestigationException if a matching jadsc application initiate investigation could not be found
	 */
	public static JadscApplicationInitiateInvestigation
			findBygetJadsc_By_II_Last(
				String outcome,
				OrderByComparator<JadscApplicationInitiateInvestigation>
					orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationInitiateInvestigationException {

		return getPersistence().findBygetJadsc_By_II_Last(
			outcome, orderByComparator);
	}

	/**
	 * Returns the last jadsc application initiate investigation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application initiate investigation, or <code>null</code> if a matching jadsc application initiate investigation could not be found
	 */
	public static JadscApplicationInitiateInvestigation
		fetchBygetJadsc_By_II_Last(
			String outcome,
			OrderByComparator<JadscApplicationInitiateInvestigation>
				orderByComparator) {

		return getPersistence().fetchBygetJadsc_By_II_Last(
			outcome, orderByComparator);
	}

	/**
	 * Returns the jadsc application initiate investigations before and after the current jadsc application initiate investigation in the ordered set where outcome = &#63;.
	 *
	 * @param jadscAppliInvestiId the primary key of the current jadsc application initiate investigation
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application initiate investigation
	 * @throws NoSuchJadscApplicationInitiateInvestigationException if a jadsc application initiate investigation with the primary key could not be found
	 */
	public static JadscApplicationInitiateInvestigation[]
			findBygetJadsc_By_II_PrevAndNext(
				long jadscAppliInvestiId, String outcome,
				OrderByComparator<JadscApplicationInitiateInvestigation>
					orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationInitiateInvestigationException {

		return getPersistence().findBygetJadsc_By_II_PrevAndNext(
			jadscAppliInvestiId, outcome, orderByComparator);
	}

	/**
	 * Removes all the jadsc application initiate investigations where outcome = &#63; from the database.
	 *
	 * @param outcome the outcome
	 */
	public static void removeBygetJadsc_By_II(String outcome) {
		getPersistence().removeBygetJadsc_By_II(outcome);
	}

	/**
	 * Returns the number of jadsc application initiate investigations where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @return the number of matching jadsc application initiate investigations
	 */
	public static int countBygetJadsc_By_II(String outcome) {
		return getPersistence().countBygetJadsc_By_II(outcome);
	}

	/**
	 * Caches the jadsc application initiate investigation in the entity cache if it is enabled.
	 *
	 * @param jadscApplicationInitiateInvestigation the jadsc application initiate investigation
	 */
	public static void cacheResult(
		JadscApplicationInitiateInvestigation
			jadscApplicationInitiateInvestigation) {

		getPersistence().cacheResult(jadscApplicationInitiateInvestigation);
	}

	/**
	 * Caches the jadsc application initiate investigations in the entity cache if it is enabled.
	 *
	 * @param jadscApplicationInitiateInvestigations the jadsc application initiate investigations
	 */
	public static void cacheResult(
		List<JadscApplicationInitiateInvestigation>
			jadscApplicationInitiateInvestigations) {

		getPersistence().cacheResult(jadscApplicationInitiateInvestigations);
	}

	/**
	 * Creates a new jadsc application initiate investigation with the primary key. Does not add the jadsc application initiate investigation to the database.
	 *
	 * @param jadscAppliInvestiId the primary key for the new jadsc application initiate investigation
	 * @return the new jadsc application initiate investigation
	 */
	public static JadscApplicationInitiateInvestigation create(
		long jadscAppliInvestiId) {

		return getPersistence().create(jadscAppliInvestiId);
	}

	/**
	 * Removes the jadsc application initiate investigation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscAppliInvestiId the primary key of the jadsc application initiate investigation
	 * @return the jadsc application initiate investigation that was removed
	 * @throws NoSuchJadscApplicationInitiateInvestigationException if a jadsc application initiate investigation with the primary key could not be found
	 */
	public static JadscApplicationInitiateInvestigation remove(
			long jadscAppliInvestiId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationInitiateInvestigationException {

		return getPersistence().remove(jadscAppliInvestiId);
	}

	public static JadscApplicationInitiateInvestigation updateImpl(
		JadscApplicationInitiateInvestigation
			jadscApplicationInitiateInvestigation) {

		return getPersistence().updateImpl(
			jadscApplicationInitiateInvestigation);
	}

	/**
	 * Returns the jadsc application initiate investigation with the primary key or throws a <code>NoSuchJadscApplicationInitiateInvestigationException</code> if it could not be found.
	 *
	 * @param jadscAppliInvestiId the primary key of the jadsc application initiate investigation
	 * @return the jadsc application initiate investigation
	 * @throws NoSuchJadscApplicationInitiateInvestigationException if a jadsc application initiate investigation with the primary key could not be found
	 */
	public static JadscApplicationInitiateInvestigation findByPrimaryKey(
			long jadscAppliInvestiId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationInitiateInvestigationException {

		return getPersistence().findByPrimaryKey(jadscAppliInvestiId);
	}

	/**
	 * Returns the jadsc application initiate investigation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscAppliInvestiId the primary key of the jadsc application initiate investigation
	 * @return the jadsc application initiate investigation, or <code>null</code> if a jadsc application initiate investigation with the primary key could not be found
	 */
	public static JadscApplicationInitiateInvestigation fetchByPrimaryKey(
		long jadscAppliInvestiId) {

		return getPersistence().fetchByPrimaryKey(jadscAppliInvestiId);
	}

	/**
	 * Returns all the jadsc application initiate investigations.
	 *
	 * @return the jadsc application initiate investigations
	 */
	public static List<JadscApplicationInitiateInvestigation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jadsc application initiate investigations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationInitiateInvestigationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application initiate investigations
	 * @param end the upper bound of the range of jadsc application initiate investigations (not inclusive)
	 * @return the range of jadsc application initiate investigations
	 */
	public static List<JadscApplicationInitiateInvestigation> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc application initiate investigations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationInitiateInvestigationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application initiate investigations
	 * @param end the upper bound of the range of jadsc application initiate investigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc application initiate investigations
	 */
	public static List<JadscApplicationInitiateInvestigation> findAll(
		int start, int end,
		OrderByComparator<JadscApplicationInitiateInvestigation>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc application initiate investigations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationInitiateInvestigationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application initiate investigations
	 * @param end the upper bound of the range of jadsc application initiate investigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc application initiate investigations
	 */
	public static List<JadscApplicationInitiateInvestigation> findAll(
		int start, int end,
		OrderByComparator<JadscApplicationInitiateInvestigation>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jadsc application initiate investigations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jadsc application initiate investigations.
	 *
	 * @return the number of jadsc application initiate investigations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JadscApplicationInitiateInvestigationPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		JadscApplicationInitiateInvestigationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JadscApplicationInitiateInvestigationPersistence
		_persistence;

}