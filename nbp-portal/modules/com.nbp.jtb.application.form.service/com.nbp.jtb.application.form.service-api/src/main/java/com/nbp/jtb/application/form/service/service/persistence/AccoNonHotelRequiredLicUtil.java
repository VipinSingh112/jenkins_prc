/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.AccoNonHotelRequiredLic;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acco non hotel required lic service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.AccoNonHotelRequiredLicPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccoNonHotelRequiredLicPersistence
 * @generated
 */
public class AccoNonHotelRequiredLicUtil {

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
		AccoNonHotelRequiredLic accoNonHotelRequiredLic) {

		getPersistence().clearCache(accoNonHotelRequiredLic);
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
	public static Map<Serializable, AccoNonHotelRequiredLic> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AccoNonHotelRequiredLic> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AccoNonHotelRequiredLic> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AccoNonHotelRequiredLic> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AccoNonHotelRequiredLic> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AccoNonHotelRequiredLic update(
		AccoNonHotelRequiredLic accoNonHotelRequiredLic) {

		return getPersistence().update(accoNonHotelRequiredLic);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AccoNonHotelRequiredLic update(
		AccoNonHotelRequiredLic accoNonHotelRequiredLic,
		ServiceContext serviceContext) {

		return getPersistence().update(accoNonHotelRequiredLic, serviceContext);
	}

	/**
	 * Returns the acco non hotel required lic where jtbApplicationId = &#63; or throws a <code>NoSuchAccoNonHotelRequiredLicException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco non hotel required lic
	 * @throws NoSuchAccoNonHotelRequiredLicException if a matching acco non hotel required lic could not be found
	 */
	public static AccoNonHotelRequiredLic findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelRequiredLicException {

		return getPersistence().findBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the acco non hotel required lic where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco non hotel required lic, or <code>null</code> if a matching acco non hotel required lic could not be found
	 */
	public static AccoNonHotelRequiredLic fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return getPersistence().fetchBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the acco non hotel required lic where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco non hotel required lic, or <code>null</code> if a matching acco non hotel required lic could not be found
	 */
	public static AccoNonHotelRequiredLic fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJTB_ByApplicationId(
			jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the acco non hotel required lic where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the acco non hotel required lic that was removed
	 */
	public static AccoNonHotelRequiredLic removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelRequiredLicException {

		return getPersistence().removeBygetJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the number of acco non hotel required lics where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching acco non hotel required lics
	 */
	public static int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		return getPersistence().countBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Caches the acco non hotel required lic in the entity cache if it is enabled.
	 *
	 * @param accoNonHotelRequiredLic the acco non hotel required lic
	 */
	public static void cacheResult(
		AccoNonHotelRequiredLic accoNonHotelRequiredLic) {

		getPersistence().cacheResult(accoNonHotelRequiredLic);
	}

	/**
	 * Caches the acco non hotel required lics in the entity cache if it is enabled.
	 *
	 * @param accoNonHotelRequiredLics the acco non hotel required lics
	 */
	public static void cacheResult(
		List<AccoNonHotelRequiredLic> accoNonHotelRequiredLics) {

		getPersistence().cacheResult(accoNonHotelRequiredLics);
	}

	/**
	 * Creates a new acco non hotel required lic with the primary key. Does not add the acco non hotel required lic to the database.
	 *
	 * @param accoNonHotelRequiredLicId the primary key for the new acco non hotel required lic
	 * @return the new acco non hotel required lic
	 */
	public static AccoNonHotelRequiredLic create(
		long accoNonHotelRequiredLicId) {

		return getPersistence().create(accoNonHotelRequiredLicId);
	}

	/**
	 * Removes the acco non hotel required lic with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accoNonHotelRequiredLicId the primary key of the acco non hotel required lic
	 * @return the acco non hotel required lic that was removed
	 * @throws NoSuchAccoNonHotelRequiredLicException if a acco non hotel required lic with the primary key could not be found
	 */
	public static AccoNonHotelRequiredLic remove(long accoNonHotelRequiredLicId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelRequiredLicException {

		return getPersistence().remove(accoNonHotelRequiredLicId);
	}

	public static AccoNonHotelRequiredLic updateImpl(
		AccoNonHotelRequiredLic accoNonHotelRequiredLic) {

		return getPersistence().updateImpl(accoNonHotelRequiredLic);
	}

	/**
	 * Returns the acco non hotel required lic with the primary key or throws a <code>NoSuchAccoNonHotelRequiredLicException</code> if it could not be found.
	 *
	 * @param accoNonHotelRequiredLicId the primary key of the acco non hotel required lic
	 * @return the acco non hotel required lic
	 * @throws NoSuchAccoNonHotelRequiredLicException if a acco non hotel required lic with the primary key could not be found
	 */
	public static AccoNonHotelRequiredLic findByPrimaryKey(
			long accoNonHotelRequiredLicId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelRequiredLicException {

		return getPersistence().findByPrimaryKey(accoNonHotelRequiredLicId);
	}

	/**
	 * Returns the acco non hotel required lic with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accoNonHotelRequiredLicId the primary key of the acco non hotel required lic
	 * @return the acco non hotel required lic, or <code>null</code> if a acco non hotel required lic with the primary key could not be found
	 */
	public static AccoNonHotelRequiredLic fetchByPrimaryKey(
		long accoNonHotelRequiredLicId) {

		return getPersistence().fetchByPrimaryKey(accoNonHotelRequiredLicId);
	}

	/**
	 * Returns all the acco non hotel required lics.
	 *
	 * @return the acco non hotel required lics
	 */
	public static List<AccoNonHotelRequiredLic> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acco non hotel required lics.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelRequiredLicModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel required lics
	 * @param end the upper bound of the range of acco non hotel required lics (not inclusive)
	 * @return the range of acco non hotel required lics
	 */
	public static List<AccoNonHotelRequiredLic> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acco non hotel required lics.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelRequiredLicModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel required lics
	 * @param end the upper bound of the range of acco non hotel required lics (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acco non hotel required lics
	 */
	public static List<AccoNonHotelRequiredLic> findAll(
		int start, int end,
		OrderByComparator<AccoNonHotelRequiredLic> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acco non hotel required lics.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelRequiredLicModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel required lics
	 * @param end the upper bound of the range of acco non hotel required lics (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acco non hotel required lics
	 */
	public static List<AccoNonHotelRequiredLic> findAll(
		int start, int end,
		OrderByComparator<AccoNonHotelRequiredLic> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acco non hotel required lics from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acco non hotel required lics.
	 *
	 * @return the number of acco non hotel required lics
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AccoNonHotelRequiredLicPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AccoNonHotelRequiredLicPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AccoNonHotelRequiredLicPersistence _persistence;

}