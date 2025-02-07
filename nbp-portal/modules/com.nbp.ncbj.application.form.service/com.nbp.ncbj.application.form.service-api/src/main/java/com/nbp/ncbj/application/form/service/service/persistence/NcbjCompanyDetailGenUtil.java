/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj company detail gen service. This utility wraps <code>com.nbp.ncbj.application.form.service.service.persistence.impl.NcbjCompanyDetailGenPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjCompanyDetailGenPersistence
 * @generated
 */
public class NcbjCompanyDetailGenUtil {

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
	public static void clearCache(NcbjCompanyDetailGen ncbjCompanyDetailGen) {
		getPersistence().clearCache(ncbjCompanyDetailGen);
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
	public static Map<Serializable, NcbjCompanyDetailGen> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjCompanyDetailGen> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjCompanyDetailGen> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjCompanyDetailGen> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjCompanyDetailGen> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjCompanyDetailGen update(
		NcbjCompanyDetailGen ncbjCompanyDetailGen) {

		return getPersistence().update(ncbjCompanyDetailGen);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjCompanyDetailGen update(
		NcbjCompanyDetailGen ncbjCompanyDetailGen,
		ServiceContext serviceContext) {

		return getPersistence().update(ncbjCompanyDetailGen, serviceContext);
	}

	/**
	 * Returns the ncbj company detail gen where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjCompanyDetailGenException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company detail gen
	 * @throws NoSuchNcbjCompanyDetailGenException if a matching ncbj company detail gen could not be found
	 */
	public static NcbjCompanyDetailGen findBygetNCBJ_ById(
			long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCompanyDetailGenException {

		return getPersistence().findBygetNCBJ_ById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj company detail gen where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company detail gen, or <code>null</code> if a matching ncbj company detail gen could not be found
	 */
	public static NcbjCompanyDetailGen fetchBygetNCBJ_ById(
		long ncbjApplicationId) {

		return getPersistence().fetchBygetNCBJ_ById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj company detail gen where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj company detail gen, or <code>null</code> if a matching ncbj company detail gen could not be found
	 */
	public static NcbjCompanyDetailGen fetchBygetNCBJ_ById(
		long ncbjApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetNCBJ_ById(
			ncbjApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncbj company detail gen where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj company detail gen that was removed
	 */
	public static NcbjCompanyDetailGen removeBygetNCBJ_ById(
			long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCompanyDetailGenException {

		return getPersistence().removeBygetNCBJ_ById(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj company detail gens where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj company detail gens
	 */
	public static int countBygetNCBJ_ById(long ncbjApplicationId) {
		return getPersistence().countBygetNCBJ_ById(ncbjApplicationId);
	}

	/**
	 * Returns all the ncbj company detail gens where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company detail gens
	 */
	public static List<NcbjCompanyDetailGen> findByget_NCBJ_ListBy_AppId(
		long ncbjApplicationId) {

		return getPersistence().findByget_NCBJ_ListBy_AppId(ncbjApplicationId);
	}

	/**
	 * Returns a range of all the ncbj company detail gens where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailGenModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj company detail gens
	 * @param end the upper bound of the range of ncbj company detail gens (not inclusive)
	 * @return the range of matching ncbj company detail gens
	 */
	public static List<NcbjCompanyDetailGen> findByget_NCBJ_ListBy_AppId(
		long ncbjApplicationId, int start, int end) {

		return getPersistence().findByget_NCBJ_ListBy_AppId(
			ncbjApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj company detail gens where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailGenModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj company detail gens
	 * @param end the upper bound of the range of ncbj company detail gens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj company detail gens
	 */
	public static List<NcbjCompanyDetailGen> findByget_NCBJ_ListBy_AppId(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjCompanyDetailGen> orderByComparator) {

		return getPersistence().findByget_NCBJ_ListBy_AppId(
			ncbjApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj company detail gens where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailGenModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj company detail gens
	 * @param end the upper bound of the range of ncbj company detail gens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj company detail gens
	 */
	public static List<NcbjCompanyDetailGen> findByget_NCBJ_ListBy_AppId(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjCompanyDetailGen> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByget_NCBJ_ListBy_AppId(
			ncbjApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj company detail gen in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj company detail gen
	 * @throws NoSuchNcbjCompanyDetailGenException if a matching ncbj company detail gen could not be found
	 */
	public static NcbjCompanyDetailGen findByget_NCBJ_ListBy_AppId_First(
			long ncbjApplicationId,
			OrderByComparator<NcbjCompanyDetailGen> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCompanyDetailGenException {

		return getPersistence().findByget_NCBJ_ListBy_AppId_First(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the first ncbj company detail gen in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj company detail gen, or <code>null</code> if a matching ncbj company detail gen could not be found
	 */
	public static NcbjCompanyDetailGen fetchByget_NCBJ_ListBy_AppId_First(
		long ncbjApplicationId,
		OrderByComparator<NcbjCompanyDetailGen> orderByComparator) {

		return getPersistence().fetchByget_NCBJ_ListBy_AppId_First(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncbj company detail gen in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj company detail gen
	 * @throws NoSuchNcbjCompanyDetailGenException if a matching ncbj company detail gen could not be found
	 */
	public static NcbjCompanyDetailGen findByget_NCBJ_ListBy_AppId_Last(
			long ncbjApplicationId,
			OrderByComparator<NcbjCompanyDetailGen> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCompanyDetailGenException {

		return getPersistence().findByget_NCBJ_ListBy_AppId_Last(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncbj company detail gen in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj company detail gen, or <code>null</code> if a matching ncbj company detail gen could not be found
	 */
	public static NcbjCompanyDetailGen fetchByget_NCBJ_ListBy_AppId_Last(
		long ncbjApplicationId,
		OrderByComparator<NcbjCompanyDetailGen> orderByComparator) {

		return getPersistence().fetchByget_NCBJ_ListBy_AppId_Last(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the ncbj company detail gens before and after the current ncbj company detail gen in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjCompanyDetailGenId the primary key of the current ncbj company detail gen
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj company detail gen
	 * @throws NoSuchNcbjCompanyDetailGenException if a ncbj company detail gen with the primary key could not be found
	 */
	public static NcbjCompanyDetailGen[]
			findByget_NCBJ_ListBy_AppId_PrevAndNext(
				long ncbjCompanyDetailGenId, long ncbjApplicationId,
				OrderByComparator<NcbjCompanyDetailGen> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCompanyDetailGenException {

		return getPersistence().findByget_NCBJ_ListBy_AppId_PrevAndNext(
			ncbjCompanyDetailGenId, ncbjApplicationId, orderByComparator);
	}

	/**
	 * Removes all the ncbj company detail gens where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	public static void removeByget_NCBJ_ListBy_AppId(long ncbjApplicationId) {
		getPersistence().removeByget_NCBJ_ListBy_AppId(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj company detail gens where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj company detail gens
	 */
	public static int countByget_NCBJ_ListBy_AppId(long ncbjApplicationId) {
		return getPersistence().countByget_NCBJ_ListBy_AppId(ncbjApplicationId);
	}

	/**
	 * Caches the ncbj company detail gen in the entity cache if it is enabled.
	 *
	 * @param ncbjCompanyDetailGen the ncbj company detail gen
	 */
	public static void cacheResult(NcbjCompanyDetailGen ncbjCompanyDetailGen) {
		getPersistence().cacheResult(ncbjCompanyDetailGen);
	}

	/**
	 * Caches the ncbj company detail gens in the entity cache if it is enabled.
	 *
	 * @param ncbjCompanyDetailGens the ncbj company detail gens
	 */
	public static void cacheResult(
		List<NcbjCompanyDetailGen> ncbjCompanyDetailGens) {

		getPersistence().cacheResult(ncbjCompanyDetailGens);
	}

	/**
	 * Creates a new ncbj company detail gen with the primary key. Does not add the ncbj company detail gen to the database.
	 *
	 * @param ncbjCompanyDetailGenId the primary key for the new ncbj company detail gen
	 * @return the new ncbj company detail gen
	 */
	public static NcbjCompanyDetailGen create(long ncbjCompanyDetailGenId) {
		return getPersistence().create(ncbjCompanyDetailGenId);
	}

	/**
	 * Removes the ncbj company detail gen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjCompanyDetailGenId the primary key of the ncbj company detail gen
	 * @return the ncbj company detail gen that was removed
	 * @throws NoSuchNcbjCompanyDetailGenException if a ncbj company detail gen with the primary key could not be found
	 */
	public static NcbjCompanyDetailGen remove(long ncbjCompanyDetailGenId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCompanyDetailGenException {

		return getPersistence().remove(ncbjCompanyDetailGenId);
	}

	public static NcbjCompanyDetailGen updateImpl(
		NcbjCompanyDetailGen ncbjCompanyDetailGen) {

		return getPersistence().updateImpl(ncbjCompanyDetailGen);
	}

	/**
	 * Returns the ncbj company detail gen with the primary key or throws a <code>NoSuchNcbjCompanyDetailGenException</code> if it could not be found.
	 *
	 * @param ncbjCompanyDetailGenId the primary key of the ncbj company detail gen
	 * @return the ncbj company detail gen
	 * @throws NoSuchNcbjCompanyDetailGenException if a ncbj company detail gen with the primary key could not be found
	 */
	public static NcbjCompanyDetailGen findByPrimaryKey(
			long ncbjCompanyDetailGenId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCompanyDetailGenException {

		return getPersistence().findByPrimaryKey(ncbjCompanyDetailGenId);
	}

	/**
	 * Returns the ncbj company detail gen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjCompanyDetailGenId the primary key of the ncbj company detail gen
	 * @return the ncbj company detail gen, or <code>null</code> if a ncbj company detail gen with the primary key could not be found
	 */
	public static NcbjCompanyDetailGen fetchByPrimaryKey(
		long ncbjCompanyDetailGenId) {

		return getPersistence().fetchByPrimaryKey(ncbjCompanyDetailGenId);
	}

	/**
	 * Returns all the ncbj company detail gens.
	 *
	 * @return the ncbj company detail gens
	 */
	public static List<NcbjCompanyDetailGen> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj company detail gens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailGenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company detail gens
	 * @param end the upper bound of the range of ncbj company detail gens (not inclusive)
	 * @return the range of ncbj company detail gens
	 */
	public static List<NcbjCompanyDetailGen> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj company detail gens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailGenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company detail gens
	 * @param end the upper bound of the range of ncbj company detail gens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj company detail gens
	 */
	public static List<NcbjCompanyDetailGen> findAll(
		int start, int end,
		OrderByComparator<NcbjCompanyDetailGen> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj company detail gens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailGenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company detail gens
	 * @param end the upper bound of the range of ncbj company detail gens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj company detail gens
	 */
	public static List<NcbjCompanyDetailGen> findAll(
		int start, int end,
		OrderByComparator<NcbjCompanyDetailGen> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj company detail gens from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj company detail gens.
	 *
	 * @return the number of ncbj company detail gens
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjCompanyDetailGenPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		NcbjCompanyDetailGenPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile NcbjCompanyDetailGenPersistence _persistence;

}