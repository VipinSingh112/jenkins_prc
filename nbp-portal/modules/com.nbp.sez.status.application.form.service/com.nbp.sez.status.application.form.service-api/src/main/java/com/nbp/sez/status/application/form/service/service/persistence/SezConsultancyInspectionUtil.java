/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezConsultancyInspection;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez consultancy inspection service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezConsultancyInspectionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezConsultancyInspectionPersistence
 * @generated
 */
public class SezConsultancyInspectionUtil {

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
		SezConsultancyInspection sezConsultancyInspection) {

		getPersistence().clearCache(sezConsultancyInspection);
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
	public static Map<Serializable, SezConsultancyInspection>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezConsultancyInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezConsultancyInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezConsultancyInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezConsultancyInspection> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezConsultancyInspection update(
		SezConsultancyInspection sezConsultancyInspection) {

		return getPersistence().update(sezConsultancyInspection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezConsultancyInspection update(
		SezConsultancyInspection sezConsultancyInspection,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezConsultancyInspection, serviceContext);
	}

	/**
	 * Returns the sez consultancy inspection where doYouWant = &#63; or throws a <code>NoSuchSezConsultancyInspectionException</code> if it could not be found.
	 *
	 * @param doYouWant the do you want
	 * @return the matching sez consultancy inspection
	 * @throws NoSuchSezConsultancyInspectionException if a matching sez consultancy inspection could not be found
	 */
	public static SezConsultancyInspection findBygetSezConsultancyByCat(
			String doYouWant)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezConsultancyInspectionException {

		return getPersistence().findBygetSezConsultancyByCat(doYouWant);
	}

	/**
	 * Returns the sez consultancy inspection where doYouWant = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param doYouWant the do you want
	 * @return the matching sez consultancy inspection, or <code>null</code> if a matching sez consultancy inspection could not be found
	 */
	public static SezConsultancyInspection fetchBygetSezConsultancyByCat(
		String doYouWant) {

		return getPersistence().fetchBygetSezConsultancyByCat(doYouWant);
	}

	/**
	 * Returns the sez consultancy inspection where doYouWant = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param doYouWant the do you want
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez consultancy inspection, or <code>null</code> if a matching sez consultancy inspection could not be found
	 */
	public static SezConsultancyInspection fetchBygetSezConsultancyByCat(
		String doYouWant, boolean useFinderCache) {

		return getPersistence().fetchBygetSezConsultancyByCat(
			doYouWant, useFinderCache);
	}

	/**
	 * Removes the sez consultancy inspection where doYouWant = &#63; from the database.
	 *
	 * @param doYouWant the do you want
	 * @return the sez consultancy inspection that was removed
	 */
	public static SezConsultancyInspection removeBygetSezConsultancyByCat(
			String doYouWant)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezConsultancyInspectionException {

		return getPersistence().removeBygetSezConsultancyByCat(doYouWant);
	}

	/**
	 * Returns the number of sez consultancy inspections where doYouWant = &#63;.
	 *
	 * @param doYouWant the do you want
	 * @return the number of matching sez consultancy inspections
	 */
	public static int countBygetSezConsultancyByCat(String doYouWant) {
		return getPersistence().countBygetSezConsultancyByCat(doYouWant);
	}

	/**
	 * Caches the sez consultancy inspection in the entity cache if it is enabled.
	 *
	 * @param sezConsultancyInspection the sez consultancy inspection
	 */
	public static void cacheResult(
		SezConsultancyInspection sezConsultancyInspection) {

		getPersistence().cacheResult(sezConsultancyInspection);
	}

	/**
	 * Caches the sez consultancy inspections in the entity cache if it is enabled.
	 *
	 * @param sezConsultancyInspections the sez consultancy inspections
	 */
	public static void cacheResult(
		List<SezConsultancyInspection> sezConsultancyInspections) {

		getPersistence().cacheResult(sezConsultancyInspections);
	}

	/**
	 * Creates a new sez consultancy inspection with the primary key. Does not add the sez consultancy inspection to the database.
	 *
	 * @param sezConsultancyInspectionId the primary key for the new sez consultancy inspection
	 * @return the new sez consultancy inspection
	 */
	public static SezConsultancyInspection create(
		long sezConsultancyInspectionId) {

		return getPersistence().create(sezConsultancyInspectionId);
	}

	/**
	 * Removes the sez consultancy inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezConsultancyInspectionId the primary key of the sez consultancy inspection
	 * @return the sez consultancy inspection that was removed
	 * @throws NoSuchSezConsultancyInspectionException if a sez consultancy inspection with the primary key could not be found
	 */
	public static SezConsultancyInspection remove(
			long sezConsultancyInspectionId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezConsultancyInspectionException {

		return getPersistence().remove(sezConsultancyInspectionId);
	}

	public static SezConsultancyInspection updateImpl(
		SezConsultancyInspection sezConsultancyInspection) {

		return getPersistence().updateImpl(sezConsultancyInspection);
	}

	/**
	 * Returns the sez consultancy inspection with the primary key or throws a <code>NoSuchSezConsultancyInspectionException</code> if it could not be found.
	 *
	 * @param sezConsultancyInspectionId the primary key of the sez consultancy inspection
	 * @return the sez consultancy inspection
	 * @throws NoSuchSezConsultancyInspectionException if a sez consultancy inspection with the primary key could not be found
	 */
	public static SezConsultancyInspection findByPrimaryKey(
			long sezConsultancyInspectionId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezConsultancyInspectionException {

		return getPersistence().findByPrimaryKey(sezConsultancyInspectionId);
	}

	/**
	 * Returns the sez consultancy inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezConsultancyInspectionId the primary key of the sez consultancy inspection
	 * @return the sez consultancy inspection, or <code>null</code> if a sez consultancy inspection with the primary key could not be found
	 */
	public static SezConsultancyInspection fetchByPrimaryKey(
		long sezConsultancyInspectionId) {

		return getPersistence().fetchByPrimaryKey(sezConsultancyInspectionId);
	}

	/**
	 * Returns all the sez consultancy inspections.
	 *
	 * @return the sez consultancy inspections
	 */
	public static List<SezConsultancyInspection> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez consultancy inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezConsultancyInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez consultancy inspections
	 * @param end the upper bound of the range of sez consultancy inspections (not inclusive)
	 * @return the range of sez consultancy inspections
	 */
	public static List<SezConsultancyInspection> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez consultancy inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezConsultancyInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez consultancy inspections
	 * @param end the upper bound of the range of sez consultancy inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez consultancy inspections
	 */
	public static List<SezConsultancyInspection> findAll(
		int start, int end,
		OrderByComparator<SezConsultancyInspection> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez consultancy inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezConsultancyInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez consultancy inspections
	 * @param end the upper bound of the range of sez consultancy inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez consultancy inspections
	 */
	public static List<SezConsultancyInspection> findAll(
		int start, int end,
		OrderByComparator<SezConsultancyInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez consultancy inspections from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez consultancy inspections.
	 *
	 * @return the number of sez consultancy inspections
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezConsultancyInspectionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezConsultancyInspectionPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezConsultancyInspectionPersistence _persistence;

}