/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NCBJCompanyNew;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj company new service. This utility wraps <code>com.nbp.ncbj.application.form.service.service.persistence.impl.NCBJCompanyNewPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NCBJCompanyNewPersistence
 * @generated
 */
public class NCBJCompanyNewUtil {

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
	public static void clearCache(NCBJCompanyNew ncbjCompanyNew) {
		getPersistence().clearCache(ncbjCompanyNew);
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
	public static Map<Serializable, NCBJCompanyNew> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NCBJCompanyNew> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NCBJCompanyNew> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NCBJCompanyNew> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NCBJCompanyNew> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NCBJCompanyNew update(NCBJCompanyNew ncbjCompanyNew) {
		return getPersistence().update(ncbjCompanyNew);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NCBJCompanyNew update(
		NCBJCompanyNew ncbjCompanyNew, ServiceContext serviceContext) {

		return getPersistence().update(ncbjCompanyNew, serviceContext);
	}

	/**
	 * Returns the ncbj company new where ncbjApplicationId = &#63; or throws a <code>NoSuchNCBJCompanyNewException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company new
	 * @throws NoSuchNCBJCompanyNewException if a matching ncbj company new could not be found
	 */
	public static NCBJCompanyNew findBygetNCBJ_ById(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNCBJCompanyNewException {

		return getPersistence().findBygetNCBJ_ById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj company new where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company new, or <code>null</code> if a matching ncbj company new could not be found
	 */
	public static NCBJCompanyNew fetchBygetNCBJ_ById(long ncbjApplicationId) {
		return getPersistence().fetchBygetNCBJ_ById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj company new where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj company new, or <code>null</code> if a matching ncbj company new could not be found
	 */
	public static NCBJCompanyNew fetchBygetNCBJ_ById(
		long ncbjApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetNCBJ_ById(
			ncbjApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncbj company new where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj company new that was removed
	 */
	public static NCBJCompanyNew removeBygetNCBJ_ById(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNCBJCompanyNewException {

		return getPersistence().removeBygetNCBJ_ById(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj company news where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj company news
	 */
	public static int countBygetNCBJ_ById(long ncbjApplicationId) {
		return getPersistence().countBygetNCBJ_ById(ncbjApplicationId);
	}

	/**
	 * Returns all the ncbj company news where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company news
	 */
	public static List<NCBJCompanyNew> findByget_NCBJ_ListBy_AppId(
		long ncbjApplicationId) {

		return getPersistence().findByget_NCBJ_ListBy_AppId(ncbjApplicationId);
	}

	/**
	 * Returns a range of all the ncbj company news where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NCBJCompanyNewModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj company news
	 * @param end the upper bound of the range of ncbj company news (not inclusive)
	 * @return the range of matching ncbj company news
	 */
	public static List<NCBJCompanyNew> findByget_NCBJ_ListBy_AppId(
		long ncbjApplicationId, int start, int end) {

		return getPersistence().findByget_NCBJ_ListBy_AppId(
			ncbjApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj company news where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NCBJCompanyNewModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj company news
	 * @param end the upper bound of the range of ncbj company news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj company news
	 */
	public static List<NCBJCompanyNew> findByget_NCBJ_ListBy_AppId(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NCBJCompanyNew> orderByComparator) {

		return getPersistence().findByget_NCBJ_ListBy_AppId(
			ncbjApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj company news where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NCBJCompanyNewModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj company news
	 * @param end the upper bound of the range of ncbj company news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj company news
	 */
	public static List<NCBJCompanyNew> findByget_NCBJ_ListBy_AppId(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NCBJCompanyNew> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByget_NCBJ_ListBy_AppId(
			ncbjApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj company new in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj company new
	 * @throws NoSuchNCBJCompanyNewException if a matching ncbj company new could not be found
	 */
	public static NCBJCompanyNew findByget_NCBJ_ListBy_AppId_First(
			long ncbjApplicationId,
			OrderByComparator<NCBJCompanyNew> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNCBJCompanyNewException {

		return getPersistence().findByget_NCBJ_ListBy_AppId_First(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the first ncbj company new in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj company new, or <code>null</code> if a matching ncbj company new could not be found
	 */
	public static NCBJCompanyNew fetchByget_NCBJ_ListBy_AppId_First(
		long ncbjApplicationId,
		OrderByComparator<NCBJCompanyNew> orderByComparator) {

		return getPersistence().fetchByget_NCBJ_ListBy_AppId_First(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncbj company new in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj company new
	 * @throws NoSuchNCBJCompanyNewException if a matching ncbj company new could not be found
	 */
	public static NCBJCompanyNew findByget_NCBJ_ListBy_AppId_Last(
			long ncbjApplicationId,
			OrderByComparator<NCBJCompanyNew> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNCBJCompanyNewException {

		return getPersistence().findByget_NCBJ_ListBy_AppId_Last(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncbj company new in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj company new, or <code>null</code> if a matching ncbj company new could not be found
	 */
	public static NCBJCompanyNew fetchByget_NCBJ_ListBy_AppId_Last(
		long ncbjApplicationId,
		OrderByComparator<NCBJCompanyNew> orderByComparator) {

		return getPersistence().fetchByget_NCBJ_ListBy_AppId_Last(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the ncbj company news before and after the current ncbj company new in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param nCBJCompanyNewId the primary key of the current ncbj company new
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj company new
	 * @throws NoSuchNCBJCompanyNewException if a ncbj company new with the primary key could not be found
	 */
	public static NCBJCompanyNew[] findByget_NCBJ_ListBy_AppId_PrevAndNext(
			long nCBJCompanyNewId, long ncbjApplicationId,
			OrderByComparator<NCBJCompanyNew> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNCBJCompanyNewException {

		return getPersistence().findByget_NCBJ_ListBy_AppId_PrevAndNext(
			nCBJCompanyNewId, ncbjApplicationId, orderByComparator);
	}

	/**
	 * Removes all the ncbj company news where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	public static void removeByget_NCBJ_ListBy_AppId(long ncbjApplicationId) {
		getPersistence().removeByget_NCBJ_ListBy_AppId(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj company news where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj company news
	 */
	public static int countByget_NCBJ_ListBy_AppId(long ncbjApplicationId) {
		return getPersistence().countByget_NCBJ_ListBy_AppId(ncbjApplicationId);
	}

	/**
	 * Caches the ncbj company new in the entity cache if it is enabled.
	 *
	 * @param ncbjCompanyNew the ncbj company new
	 */
	public static void cacheResult(NCBJCompanyNew ncbjCompanyNew) {
		getPersistence().cacheResult(ncbjCompanyNew);
	}

	/**
	 * Caches the ncbj company news in the entity cache if it is enabled.
	 *
	 * @param ncbjCompanyNews the ncbj company news
	 */
	public static void cacheResult(List<NCBJCompanyNew> ncbjCompanyNews) {
		getPersistence().cacheResult(ncbjCompanyNews);
	}

	/**
	 * Creates a new ncbj company new with the primary key. Does not add the ncbj company new to the database.
	 *
	 * @param nCBJCompanyNewId the primary key for the new ncbj company new
	 * @return the new ncbj company new
	 */
	public static NCBJCompanyNew create(long nCBJCompanyNewId) {
		return getPersistence().create(nCBJCompanyNewId);
	}

	/**
	 * Removes the ncbj company new with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param nCBJCompanyNewId the primary key of the ncbj company new
	 * @return the ncbj company new that was removed
	 * @throws NoSuchNCBJCompanyNewException if a ncbj company new with the primary key could not be found
	 */
	public static NCBJCompanyNew remove(long nCBJCompanyNewId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNCBJCompanyNewException {

		return getPersistence().remove(nCBJCompanyNewId);
	}

	public static NCBJCompanyNew updateImpl(NCBJCompanyNew ncbjCompanyNew) {
		return getPersistence().updateImpl(ncbjCompanyNew);
	}

	/**
	 * Returns the ncbj company new with the primary key or throws a <code>NoSuchNCBJCompanyNewException</code> if it could not be found.
	 *
	 * @param nCBJCompanyNewId the primary key of the ncbj company new
	 * @return the ncbj company new
	 * @throws NoSuchNCBJCompanyNewException if a ncbj company new with the primary key could not be found
	 */
	public static NCBJCompanyNew findByPrimaryKey(long nCBJCompanyNewId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNCBJCompanyNewException {

		return getPersistence().findByPrimaryKey(nCBJCompanyNewId);
	}

	/**
	 * Returns the ncbj company new with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param nCBJCompanyNewId the primary key of the ncbj company new
	 * @return the ncbj company new, or <code>null</code> if a ncbj company new with the primary key could not be found
	 */
	public static NCBJCompanyNew fetchByPrimaryKey(long nCBJCompanyNewId) {
		return getPersistence().fetchByPrimaryKey(nCBJCompanyNewId);
	}

	/**
	 * Returns all the ncbj company news.
	 *
	 * @return the ncbj company news
	 */
	public static List<NCBJCompanyNew> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj company news.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NCBJCompanyNewModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company news
	 * @param end the upper bound of the range of ncbj company news (not inclusive)
	 * @return the range of ncbj company news
	 */
	public static List<NCBJCompanyNew> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj company news.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NCBJCompanyNewModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company news
	 * @param end the upper bound of the range of ncbj company news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj company news
	 */
	public static List<NCBJCompanyNew> findAll(
		int start, int end,
		OrderByComparator<NCBJCompanyNew> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj company news.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NCBJCompanyNewModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company news
	 * @param end the upper bound of the range of ncbj company news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj company news
	 */
	public static List<NCBJCompanyNew> findAll(
		int start, int end, OrderByComparator<NCBJCompanyNew> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj company news from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj company news.
	 *
	 * @return the number of ncbj company news
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NCBJCompanyNewPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(NCBJCompanyNewPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile NCBJCompanyNewPersistence _persistence;

}