/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.stage.services.model.JadscApplicationPreInitiation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jadsc application pre initiation service. This utility wraps <code>com.nbp.jadsc.stage.services.service.persistence.impl.JadscApplicationPreInitiationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JadscApplicationPreInitiationPersistence
 * @generated
 */
public class JadscApplicationPreInitiationUtil {

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
		JadscApplicationPreInitiation jadscApplicationPreInitiation) {

		getPersistence().clearCache(jadscApplicationPreInitiation);
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
	public static Map<Serializable, JadscApplicationPreInitiation>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JadscApplicationPreInitiation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JadscApplicationPreInitiation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JadscApplicationPreInitiation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JadscApplicationPreInitiation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JadscApplicationPreInitiation update(
		JadscApplicationPreInitiation jadscApplicationPreInitiation) {

		return getPersistence().update(jadscApplicationPreInitiation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JadscApplicationPreInitiation update(
		JadscApplicationPreInitiation jadscApplicationPreInitiation,
		ServiceContext serviceContext) {

		return getPersistence().update(
			jadscApplicationPreInitiation, serviceContext);
	}

	/**
	 * Returns the jadsc application pre initiation where caseId = &#63; or throws a <code>NoSuchJadscApplicationPreInitiationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application pre initiation
	 * @throws NoSuchJadscApplicationPreInitiationException if a matching jadsc application pre initiation could not be found
	 */
	public static JadscApplicationPreInitiation findBygetJadsc_PI_CI(
			String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationPreInitiationException {

		return getPersistence().findBygetJadsc_PI_CI(caseId);
	}

	/**
	 * Returns the jadsc application pre initiation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application pre initiation, or <code>null</code> if a matching jadsc application pre initiation could not be found
	 */
	public static JadscApplicationPreInitiation fetchBygetJadsc_PI_CI(
		String caseId) {

		return getPersistence().fetchBygetJadsc_PI_CI(caseId);
	}

	/**
	 * Returns the jadsc application pre initiation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application pre initiation, or <code>null</code> if a matching jadsc application pre initiation could not be found
	 */
	public static JadscApplicationPreInitiation fetchBygetJadsc_PI_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetJadsc_PI_CI(caseId, useFinderCache);
	}

	/**
	 * Removes the jadsc application pre initiation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jadsc application pre initiation that was removed
	 */
	public static JadscApplicationPreInitiation removeBygetJadsc_PI_CI(
			String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationPreInitiationException {

		return getPersistence().removeBygetJadsc_PI_CI(caseId);
	}

	/**
	 * Returns the number of jadsc application pre initiations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc application pre initiations
	 */
	public static int countBygetJadsc_PI_CI(String caseId) {
		return getPersistence().countBygetJadsc_PI_CI(caseId);
	}

	/**
	 * Returns all the jadsc application pre initiations where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @return the matching jadsc application pre initiations
	 */
	public static List<JadscApplicationPreInitiation> findBygetJadsc_By_PI(
		String outcome) {

		return getPersistence().findBygetJadsc_By_PI(outcome);
	}

	/**
	 * Returns a range of all the jadsc application pre initiations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc application pre initiations
	 * @param end the upper bound of the range of jadsc application pre initiations (not inclusive)
	 * @return the range of matching jadsc application pre initiations
	 */
	public static List<JadscApplicationPreInitiation> findBygetJadsc_By_PI(
		String outcome, int start, int end) {

		return getPersistence().findBygetJadsc_By_PI(outcome, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc application pre initiations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc application pre initiations
	 * @param end the upper bound of the range of jadsc application pre initiations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc application pre initiations
	 */
	public static List<JadscApplicationPreInitiation> findBygetJadsc_By_PI(
		String outcome, int start, int end,
		OrderByComparator<JadscApplicationPreInitiation> orderByComparator) {

		return getPersistence().findBygetJadsc_By_PI(
			outcome, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc application pre initiations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc application pre initiations
	 * @param end the upper bound of the range of jadsc application pre initiations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc application pre initiations
	 */
	public static List<JadscApplicationPreInitiation> findBygetJadsc_By_PI(
		String outcome, int start, int end,
		OrderByComparator<JadscApplicationPreInitiation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJadsc_By_PI(
			outcome, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc application pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application pre initiation
	 * @throws NoSuchJadscApplicationPreInitiationException if a matching jadsc application pre initiation could not be found
	 */
	public static JadscApplicationPreInitiation findBygetJadsc_By_PI_First(
			String outcome,
			OrderByComparator<JadscApplicationPreInitiation> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationPreInitiationException {

		return getPersistence().findBygetJadsc_By_PI_First(
			outcome, orderByComparator);
	}

	/**
	 * Returns the first jadsc application pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application pre initiation, or <code>null</code> if a matching jadsc application pre initiation could not be found
	 */
	public static JadscApplicationPreInitiation fetchBygetJadsc_By_PI_First(
		String outcome,
		OrderByComparator<JadscApplicationPreInitiation> orderByComparator) {

		return getPersistence().fetchBygetJadsc_By_PI_First(
			outcome, orderByComparator);
	}

	/**
	 * Returns the last jadsc application pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application pre initiation
	 * @throws NoSuchJadscApplicationPreInitiationException if a matching jadsc application pre initiation could not be found
	 */
	public static JadscApplicationPreInitiation findBygetJadsc_By_PI_Last(
			String outcome,
			OrderByComparator<JadscApplicationPreInitiation> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationPreInitiationException {

		return getPersistence().findBygetJadsc_By_PI_Last(
			outcome, orderByComparator);
	}

	/**
	 * Returns the last jadsc application pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application pre initiation, or <code>null</code> if a matching jadsc application pre initiation could not be found
	 */
	public static JadscApplicationPreInitiation fetchBygetJadsc_By_PI_Last(
		String outcome,
		OrderByComparator<JadscApplicationPreInitiation> orderByComparator) {

		return getPersistence().fetchBygetJadsc_By_PI_Last(
			outcome, orderByComparator);
	}

	/**
	 * Returns the jadsc application pre initiations before and after the current jadsc application pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the current jadsc application pre initiation
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application pre initiation
	 * @throws NoSuchJadscApplicationPreInitiationException if a jadsc application pre initiation with the primary key could not be found
	 */
	public static JadscApplicationPreInitiation[]
			findBygetJadsc_By_PI_PrevAndNext(
				long jadscAppliPreInitiationId, String outcome,
				OrderByComparator<JadscApplicationPreInitiation>
					orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationPreInitiationException {

		return getPersistence().findBygetJadsc_By_PI_PrevAndNext(
			jadscAppliPreInitiationId, outcome, orderByComparator);
	}

	/**
	 * Removes all the jadsc application pre initiations where outcome = &#63; from the database.
	 *
	 * @param outcome the outcome
	 */
	public static void removeBygetJadsc_By_PI(String outcome) {
		getPersistence().removeBygetJadsc_By_PI(outcome);
	}

	/**
	 * Returns the number of jadsc application pre initiations where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @return the number of matching jadsc application pre initiations
	 */
	public static int countBygetJadsc_By_PI(String outcome) {
		return getPersistence().countBygetJadsc_By_PI(outcome);
	}

	/**
	 * Caches the jadsc application pre initiation in the entity cache if it is enabled.
	 *
	 * @param jadscApplicationPreInitiation the jadsc application pre initiation
	 */
	public static void cacheResult(
		JadscApplicationPreInitiation jadscApplicationPreInitiation) {

		getPersistence().cacheResult(jadscApplicationPreInitiation);
	}

	/**
	 * Caches the jadsc application pre initiations in the entity cache if it is enabled.
	 *
	 * @param jadscApplicationPreInitiations the jadsc application pre initiations
	 */
	public static void cacheResult(
		List<JadscApplicationPreInitiation> jadscApplicationPreInitiations) {

		getPersistence().cacheResult(jadscApplicationPreInitiations);
	}

	/**
	 * Creates a new jadsc application pre initiation with the primary key. Does not add the jadsc application pre initiation to the database.
	 *
	 * @param jadscAppliPreInitiationId the primary key for the new jadsc application pre initiation
	 * @return the new jadsc application pre initiation
	 */
	public static JadscApplicationPreInitiation create(
		long jadscAppliPreInitiationId) {

		return getPersistence().create(jadscAppliPreInitiationId);
	}

	/**
	 * Removes the jadsc application pre initiation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc application pre initiation
	 * @return the jadsc application pre initiation that was removed
	 * @throws NoSuchJadscApplicationPreInitiationException if a jadsc application pre initiation with the primary key could not be found
	 */
	public static JadscApplicationPreInitiation remove(
			long jadscAppliPreInitiationId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationPreInitiationException {

		return getPersistence().remove(jadscAppliPreInitiationId);
	}

	public static JadscApplicationPreInitiation updateImpl(
		JadscApplicationPreInitiation jadscApplicationPreInitiation) {

		return getPersistence().updateImpl(jadscApplicationPreInitiation);
	}

	/**
	 * Returns the jadsc application pre initiation with the primary key or throws a <code>NoSuchJadscApplicationPreInitiationException</code> if it could not be found.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc application pre initiation
	 * @return the jadsc application pre initiation
	 * @throws NoSuchJadscApplicationPreInitiationException if a jadsc application pre initiation with the primary key could not be found
	 */
	public static JadscApplicationPreInitiation findByPrimaryKey(
			long jadscAppliPreInitiationId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationPreInitiationException {

		return getPersistence().findByPrimaryKey(jadscAppliPreInitiationId);
	}

	/**
	 * Returns the jadsc application pre initiation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc application pre initiation
	 * @return the jadsc application pre initiation, or <code>null</code> if a jadsc application pre initiation with the primary key could not be found
	 */
	public static JadscApplicationPreInitiation fetchByPrimaryKey(
		long jadscAppliPreInitiationId) {

		return getPersistence().fetchByPrimaryKey(jadscAppliPreInitiationId);
	}

	/**
	 * Returns all the jadsc application pre initiations.
	 *
	 * @return the jadsc application pre initiations
	 */
	public static List<JadscApplicationPreInitiation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jadsc application pre initiations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application pre initiations
	 * @param end the upper bound of the range of jadsc application pre initiations (not inclusive)
	 * @return the range of jadsc application pre initiations
	 */
	public static List<JadscApplicationPreInitiation> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc application pre initiations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application pre initiations
	 * @param end the upper bound of the range of jadsc application pre initiations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc application pre initiations
	 */
	public static List<JadscApplicationPreInitiation> findAll(
		int start, int end,
		OrderByComparator<JadscApplicationPreInitiation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc application pre initiations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application pre initiations
	 * @param end the upper bound of the range of jadsc application pre initiations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc application pre initiations
	 */
	public static List<JadscApplicationPreInitiation> findAll(
		int start, int end,
		OrderByComparator<JadscApplicationPreInitiation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jadsc application pre initiations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jadsc application pre initiations.
	 *
	 * @return the number of jadsc application pre initiations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JadscApplicationPreInitiationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JadscApplicationPreInitiationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JadscApplicationPreInitiationPersistence
		_persistence;

}