/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.jadsc.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.stage.services.model.JadscAppliPreInitiation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jadsc appli pre initiation service. This utility wraps <code>com.nbp.jadsc.stage.services.service.persistence.impl.JadscAppliPreInitiationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliPreInitiationPersistence
 * @generated
 */
public class JadscAppliPreInitiationUtil {

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
		JadscAppliPreInitiation jadscAppliPreInitiation) {

		getPersistence().clearCache(jadscAppliPreInitiation);
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
	public static Map<Serializable, JadscAppliPreInitiation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JadscAppliPreInitiation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JadscAppliPreInitiation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JadscAppliPreInitiation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JadscAppliPreInitiation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JadscAppliPreInitiation update(
		JadscAppliPreInitiation jadscAppliPreInitiation) {

		return getPersistence().update(jadscAppliPreInitiation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JadscAppliPreInitiation update(
		JadscAppliPreInitiation jadscAppliPreInitiation,
		ServiceContext serviceContext) {

		return getPersistence().update(jadscAppliPreInitiation, serviceContext);
	}

	/**
	 * Returns the jadsc appli pre initiation where caseId = &#63; or throws a <code>NoSuchJadscAppliPreInitiationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc appli pre initiation
	 * @throws NoSuchJadscAppliPreInitiationException if a matching jadsc appli pre initiation could not be found
	 */
	public static JadscAppliPreInitiation findBygetJadsc_PI_CI(String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliPreInitiationException {

		return getPersistence().findBygetJadsc_PI_CI(caseId);
	}

	/**
	 * Returns the jadsc appli pre initiation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc appli pre initiation, or <code>null</code> if a matching jadsc appli pre initiation could not be found
	 */
	public static JadscAppliPreInitiation fetchBygetJadsc_PI_CI(String caseId) {
		return getPersistence().fetchBygetJadsc_PI_CI(caseId);
	}

	/**
	 * Returns the jadsc appli pre initiation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc appli pre initiation, or <code>null</code> if a matching jadsc appli pre initiation could not be found
	 */
	public static JadscAppliPreInitiation fetchBygetJadsc_PI_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetJadsc_PI_CI(caseId, useFinderCache);
	}

	/**
	 * Removes the jadsc appli pre initiation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jadsc appli pre initiation that was removed
	 */
	public static JadscAppliPreInitiation removeBygetJadsc_PI_CI(String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliPreInitiationException {

		return getPersistence().removeBygetJadsc_PI_CI(caseId);
	}

	/**
	 * Returns the number of jadsc appli pre initiations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc appli pre initiations
	 */
	public static int countBygetJadsc_PI_CI(String caseId) {
		return getPersistence().countBygetJadsc_PI_CI(caseId);
	}

	/**
	 * Returns all the jadsc appli pre initiations where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @return the matching jadsc appli pre initiations
	 */
	public static List<JadscAppliPreInitiation> findBygetJadsc_By_PI(
		String outcome) {

		return getPersistence().findBygetJadsc_By_PI(outcome);
	}

	/**
	 * Returns a range of all the jadsc appli pre initiations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc appli pre initiations
	 * @param end the upper bound of the range of jadsc appli pre initiations (not inclusive)
	 * @return the range of matching jadsc appli pre initiations
	 */
	public static List<JadscAppliPreInitiation> findBygetJadsc_By_PI(
		String outcome, int start, int end) {

		return getPersistence().findBygetJadsc_By_PI(outcome, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc appli pre initiations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc appli pre initiations
	 * @param end the upper bound of the range of jadsc appli pre initiations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc appli pre initiations
	 */
	public static List<JadscAppliPreInitiation> findBygetJadsc_By_PI(
		String outcome, int start, int end,
		OrderByComparator<JadscAppliPreInitiation> orderByComparator) {

		return getPersistence().findBygetJadsc_By_PI(
			outcome, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc appli pre initiations where outcome = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param outcome the outcome
	 * @param start the lower bound of the range of jadsc appli pre initiations
	 * @param end the upper bound of the range of jadsc appli pre initiations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc appli pre initiations
	 */
	public static List<JadscAppliPreInitiation> findBygetJadsc_By_PI(
		String outcome, int start, int end,
		OrderByComparator<JadscAppliPreInitiation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJadsc_By_PI(
			outcome, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc appli pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc appli pre initiation
	 * @throws NoSuchJadscAppliPreInitiationException if a matching jadsc appli pre initiation could not be found
	 */
	public static JadscAppliPreInitiation findBygetJadsc_By_PI_First(
			String outcome,
			OrderByComparator<JadscAppliPreInitiation> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliPreInitiationException {

		return getPersistence().findBygetJadsc_By_PI_First(
			outcome, orderByComparator);
	}

	/**
	 * Returns the first jadsc appli pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc appli pre initiation, or <code>null</code> if a matching jadsc appli pre initiation could not be found
	 */
	public static JadscAppliPreInitiation fetchBygetJadsc_By_PI_First(
		String outcome,
		OrderByComparator<JadscAppliPreInitiation> orderByComparator) {

		return getPersistence().fetchBygetJadsc_By_PI_First(
			outcome, orderByComparator);
	}

	/**
	 * Returns the last jadsc appli pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc appli pre initiation
	 * @throws NoSuchJadscAppliPreInitiationException if a matching jadsc appli pre initiation could not be found
	 */
	public static JadscAppliPreInitiation findBygetJadsc_By_PI_Last(
			String outcome,
			OrderByComparator<JadscAppliPreInitiation> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliPreInitiationException {

		return getPersistence().findBygetJadsc_By_PI_Last(
			outcome, orderByComparator);
	}

	/**
	 * Returns the last jadsc appli pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc appli pre initiation, or <code>null</code> if a matching jadsc appli pre initiation could not be found
	 */
	public static JadscAppliPreInitiation fetchBygetJadsc_By_PI_Last(
		String outcome,
		OrderByComparator<JadscAppliPreInitiation> orderByComparator) {

		return getPersistence().fetchBygetJadsc_By_PI_Last(
			outcome, orderByComparator);
	}

	/**
	 * Returns the jadsc appli pre initiations before and after the current jadsc appli pre initiation in the ordered set where outcome = &#63;.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the current jadsc appli pre initiation
	 * @param outcome the outcome
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc appli pre initiation
	 * @throws NoSuchJadscAppliPreInitiationException if a jadsc appli pre initiation with the primary key could not be found
	 */
	public static JadscAppliPreInitiation[] findBygetJadsc_By_PI_PrevAndNext(
			long jadscAppliPreInitiationId, String outcome,
			OrderByComparator<JadscAppliPreInitiation> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliPreInitiationException {

		return getPersistence().findBygetJadsc_By_PI_PrevAndNext(
			jadscAppliPreInitiationId, outcome, orderByComparator);
	}

	/**
	 * Removes all the jadsc appli pre initiations where outcome = &#63; from the database.
	 *
	 * @param outcome the outcome
	 */
	public static void removeBygetJadsc_By_PI(String outcome) {
		getPersistence().removeBygetJadsc_By_PI(outcome);
	}

	/**
	 * Returns the number of jadsc appli pre initiations where outcome = &#63;.
	 *
	 * @param outcome the outcome
	 * @return the number of matching jadsc appli pre initiations
	 */
	public static int countBygetJadsc_By_PI(String outcome) {
		return getPersistence().countBygetJadsc_By_PI(outcome);
	}

	/**
	 * Caches the jadsc appli pre initiation in the entity cache if it is enabled.
	 *
	 * @param jadscAppliPreInitiation the jadsc appli pre initiation
	 */
	public static void cacheResult(
		JadscAppliPreInitiation jadscAppliPreInitiation) {

		getPersistence().cacheResult(jadscAppliPreInitiation);
	}

	/**
	 * Caches the jadsc appli pre initiations in the entity cache if it is enabled.
	 *
	 * @param jadscAppliPreInitiations the jadsc appli pre initiations
	 */
	public static void cacheResult(
		List<JadscAppliPreInitiation> jadscAppliPreInitiations) {

		getPersistence().cacheResult(jadscAppliPreInitiations);
	}

	/**
	 * Creates a new jadsc appli pre initiation with the primary key. Does not add the jadsc appli pre initiation to the database.
	 *
	 * @param jadscAppliPreInitiationId the primary key for the new jadsc appli pre initiation
	 * @return the new jadsc appli pre initiation
	 */
	public static JadscAppliPreInitiation create(
		long jadscAppliPreInitiationId) {

		return getPersistence().create(jadscAppliPreInitiationId);
	}

	/**
	 * Removes the jadsc appli pre initiation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc appli pre initiation
	 * @return the jadsc appli pre initiation that was removed
	 * @throws NoSuchJadscAppliPreInitiationException if a jadsc appli pre initiation with the primary key could not be found
	 */
	public static JadscAppliPreInitiation remove(long jadscAppliPreInitiationId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliPreInitiationException {

		return getPersistence().remove(jadscAppliPreInitiationId);
	}

	public static JadscAppliPreInitiation updateImpl(
		JadscAppliPreInitiation jadscAppliPreInitiation) {

		return getPersistence().updateImpl(jadscAppliPreInitiation);
	}

	/**
	 * Returns the jadsc appli pre initiation with the primary key or throws a <code>NoSuchJadscAppliPreInitiationException</code> if it could not be found.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc appli pre initiation
	 * @return the jadsc appli pre initiation
	 * @throws NoSuchJadscAppliPreInitiationException if a jadsc appli pre initiation with the primary key could not be found
	 */
	public static JadscAppliPreInitiation findByPrimaryKey(
			long jadscAppliPreInitiationId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliPreInitiationException {

		return getPersistence().findByPrimaryKey(jadscAppliPreInitiationId);
	}

	/**
	 * Returns the jadsc appli pre initiation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc appli pre initiation
	 * @return the jadsc appli pre initiation, or <code>null</code> if a jadsc appli pre initiation with the primary key could not be found
	 */
	public static JadscAppliPreInitiation fetchByPrimaryKey(
		long jadscAppliPreInitiationId) {

		return getPersistence().fetchByPrimaryKey(jadscAppliPreInitiationId);
	}

	/**
	 * Returns all the jadsc appli pre initiations.
	 *
	 * @return the jadsc appli pre initiations
	 */
	public static List<JadscAppliPreInitiation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jadsc appli pre initiations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli pre initiations
	 * @param end the upper bound of the range of jadsc appli pre initiations (not inclusive)
	 * @return the range of jadsc appli pre initiations
	 */
	public static List<JadscAppliPreInitiation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc appli pre initiations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli pre initiations
	 * @param end the upper bound of the range of jadsc appli pre initiations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc appli pre initiations
	 */
	public static List<JadscAppliPreInitiation> findAll(
		int start, int end,
		OrderByComparator<JadscAppliPreInitiation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc appli pre initiations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli pre initiations
	 * @param end the upper bound of the range of jadsc appli pre initiations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc appli pre initiations
	 */
	public static List<JadscAppliPreInitiation> findAll(
		int start, int end,
		OrderByComparator<JadscAppliPreInitiation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jadsc appli pre initiations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jadsc appli pre initiations.
	 *
	 * @return the number of jadsc appli pre initiations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JadscAppliPreInitiationPersistence getPersistence() {
		return _persistence;
	}

	private static volatile JadscAppliPreInitiationPersistence _persistence;

}