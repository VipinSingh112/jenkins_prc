/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ogt.application.form.services.model.OgtClaimToSpouse;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ogt claim to spouse service. This utility wraps <code>com.nbp.ogt.application.form.services.service.persistence.impl.OgtClaimToSpousePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OgtClaimToSpousePersistence
 * @generated
 */
public class OgtClaimToSpouseUtil {

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
	public static void clearCache(OgtClaimToSpouse ogtClaimToSpouse) {
		getPersistence().clearCache(ogtClaimToSpouse);
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
	public static Map<Serializable, OgtClaimToSpouse> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OgtClaimToSpouse> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OgtClaimToSpouse> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OgtClaimToSpouse> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OgtClaimToSpouse> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OgtClaimToSpouse update(OgtClaimToSpouse ogtClaimToSpouse) {
		return getPersistence().update(ogtClaimToSpouse);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OgtClaimToSpouse update(
		OgtClaimToSpouse ogtClaimToSpouse, ServiceContext serviceContext) {

		return getPersistence().update(ogtClaimToSpouse, serviceContext);
	}

	/**
	 * Returns the ogt claim to spouse where ogtApplicationId = &#63; or throws a <code>NoSuchOgtClaimToSpouseException</code> if it could not be found.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt claim to spouse
	 * @throws NoSuchOgtClaimToSpouseException if a matching ogt claim to spouse could not be found
	 */
	public static OgtClaimToSpouse findBygetOgtById(long ogtApplicationId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtClaimToSpouseException {

		return getPersistence().findBygetOgtById(ogtApplicationId);
	}

	/**
	 * Returns the ogt claim to spouse where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt claim to spouse, or <code>null</code> if a matching ogt claim to spouse could not be found
	 */
	public static OgtClaimToSpouse fetchBygetOgtById(long ogtApplicationId) {
		return getPersistence().fetchBygetOgtById(ogtApplicationId);
	}

	/**
	 * Returns the ogt claim to spouse where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt claim to spouse, or <code>null</code> if a matching ogt claim to spouse could not be found
	 */
	public static OgtClaimToSpouse fetchBygetOgtById(
		long ogtApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetOgtById(
			ogtApplicationId, useFinderCache);
	}

	/**
	 * Removes the ogt claim to spouse where ogtApplicationId = &#63; from the database.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the ogt claim to spouse that was removed
	 */
	public static OgtClaimToSpouse removeBygetOgtById(long ogtApplicationId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtClaimToSpouseException {

		return getPersistence().removeBygetOgtById(ogtApplicationId);
	}

	/**
	 * Returns the number of ogt claim to spouses where ogtApplicationId = &#63;.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the number of matching ogt claim to spouses
	 */
	public static int countBygetOgtById(long ogtApplicationId) {
		return getPersistence().countBygetOgtById(ogtApplicationId);
	}

	/**
	 * Caches the ogt claim to spouse in the entity cache if it is enabled.
	 *
	 * @param ogtClaimToSpouse the ogt claim to spouse
	 */
	public static void cacheResult(OgtClaimToSpouse ogtClaimToSpouse) {
		getPersistence().cacheResult(ogtClaimToSpouse);
	}

	/**
	 * Caches the ogt claim to spouses in the entity cache if it is enabled.
	 *
	 * @param ogtClaimToSpouses the ogt claim to spouses
	 */
	public static void cacheResult(List<OgtClaimToSpouse> ogtClaimToSpouses) {
		getPersistence().cacheResult(ogtClaimToSpouses);
	}

	/**
	 * Creates a new ogt claim to spouse with the primary key. Does not add the ogt claim to spouse to the database.
	 *
	 * @param ogtClaimToSpouseId the primary key for the new ogt claim to spouse
	 * @return the new ogt claim to spouse
	 */
	public static OgtClaimToSpouse create(long ogtClaimToSpouseId) {
		return getPersistence().create(ogtClaimToSpouseId);
	}

	/**
	 * Removes the ogt claim to spouse with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ogtClaimToSpouseId the primary key of the ogt claim to spouse
	 * @return the ogt claim to spouse that was removed
	 * @throws NoSuchOgtClaimToSpouseException if a ogt claim to spouse with the primary key could not be found
	 */
	public static OgtClaimToSpouse remove(long ogtClaimToSpouseId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtClaimToSpouseException {

		return getPersistence().remove(ogtClaimToSpouseId);
	}

	public static OgtClaimToSpouse updateImpl(
		OgtClaimToSpouse ogtClaimToSpouse) {

		return getPersistence().updateImpl(ogtClaimToSpouse);
	}

	/**
	 * Returns the ogt claim to spouse with the primary key or throws a <code>NoSuchOgtClaimToSpouseException</code> if it could not be found.
	 *
	 * @param ogtClaimToSpouseId the primary key of the ogt claim to spouse
	 * @return the ogt claim to spouse
	 * @throws NoSuchOgtClaimToSpouseException if a ogt claim to spouse with the primary key could not be found
	 */
	public static OgtClaimToSpouse findByPrimaryKey(long ogtClaimToSpouseId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtClaimToSpouseException {

		return getPersistence().findByPrimaryKey(ogtClaimToSpouseId);
	}

	/**
	 * Returns the ogt claim to spouse with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ogtClaimToSpouseId the primary key of the ogt claim to spouse
	 * @return the ogt claim to spouse, or <code>null</code> if a ogt claim to spouse with the primary key could not be found
	 */
	public static OgtClaimToSpouse fetchByPrimaryKey(long ogtClaimToSpouseId) {
		return getPersistence().fetchByPrimaryKey(ogtClaimToSpouseId);
	}

	/**
	 * Returns all the ogt claim to spouses.
	 *
	 * @return the ogt claim to spouses
	 */
	public static List<OgtClaimToSpouse> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ogt claim to spouses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtClaimToSpouseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt claim to spouses
	 * @param end the upper bound of the range of ogt claim to spouses (not inclusive)
	 * @return the range of ogt claim to spouses
	 */
	public static List<OgtClaimToSpouse> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ogt claim to spouses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtClaimToSpouseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt claim to spouses
	 * @param end the upper bound of the range of ogt claim to spouses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ogt claim to spouses
	 */
	public static List<OgtClaimToSpouse> findAll(
		int start, int end,
		OrderByComparator<OgtClaimToSpouse> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ogt claim to spouses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtClaimToSpouseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt claim to spouses
	 * @param end the upper bound of the range of ogt claim to spouses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ogt claim to spouses
	 */
	public static List<OgtClaimToSpouse> findAll(
		int start, int end,
		OrderByComparator<OgtClaimToSpouse> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ogt claim to spouses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ogt claim to spouses.
	 *
	 * @return the number of ogt claim to spouses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OgtClaimToSpousePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(OgtClaimToSpousePersistence persistence) {
		_persistence = persistence;
	}

	private static volatile OgtClaimToSpousePersistence _persistence;

}