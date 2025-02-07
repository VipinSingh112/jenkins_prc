/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ogt.application.form.services.model.OgtInsolventPersonDetail;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ogt insolvent person detail service. This utility wraps <code>com.nbp.ogt.application.form.services.service.persistence.impl.OgtInsolventPersonDetailPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OgtInsolventPersonDetailPersistence
 * @generated
 */
public class OgtInsolventPersonDetailUtil {

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
		OgtInsolventPersonDetail ogtInsolventPersonDetail) {

		getPersistence().clearCache(ogtInsolventPersonDetail);
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
	public static Map<Serializable, OgtInsolventPersonDetail>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OgtInsolventPersonDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OgtInsolventPersonDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OgtInsolventPersonDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OgtInsolventPersonDetail> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OgtInsolventPersonDetail update(
		OgtInsolventPersonDetail ogtInsolventPersonDetail) {

		return getPersistence().update(ogtInsolventPersonDetail);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OgtInsolventPersonDetail update(
		OgtInsolventPersonDetail ogtInsolventPersonDetail,
		ServiceContext serviceContext) {

		return getPersistence().update(
			ogtInsolventPersonDetail, serviceContext);
	}

	/**
	 * Returns the ogt insolvent person detail where ogtApplicationId = &#63; or throws a <code>NoSuchOgtInsolventPersonDetailException</code> if it could not be found.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt insolvent person detail
	 * @throws NoSuchOgtInsolventPersonDetailException if a matching ogt insolvent person detail could not be found
	 */
	public static OgtInsolventPersonDetail findBygetOgtById(
			long ogtApplicationId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtInsolventPersonDetailException {

		return getPersistence().findBygetOgtById(ogtApplicationId);
	}

	/**
	 * Returns the ogt insolvent person detail where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt insolvent person detail, or <code>null</code> if a matching ogt insolvent person detail could not be found
	 */
	public static OgtInsolventPersonDetail fetchBygetOgtById(
		long ogtApplicationId) {

		return getPersistence().fetchBygetOgtById(ogtApplicationId);
	}

	/**
	 * Returns the ogt insolvent person detail where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt insolvent person detail, or <code>null</code> if a matching ogt insolvent person detail could not be found
	 */
	public static OgtInsolventPersonDetail fetchBygetOgtById(
		long ogtApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetOgtById(
			ogtApplicationId, useFinderCache);
	}

	/**
	 * Removes the ogt insolvent person detail where ogtApplicationId = &#63; from the database.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the ogt insolvent person detail that was removed
	 */
	public static OgtInsolventPersonDetail removeBygetOgtById(
			long ogtApplicationId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtInsolventPersonDetailException {

		return getPersistence().removeBygetOgtById(ogtApplicationId);
	}

	/**
	 * Returns the number of ogt insolvent person details where ogtApplicationId = &#63;.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the number of matching ogt insolvent person details
	 */
	public static int countBygetOgtById(long ogtApplicationId) {
		return getPersistence().countBygetOgtById(ogtApplicationId);
	}

	/**
	 * Caches the ogt insolvent person detail in the entity cache if it is enabled.
	 *
	 * @param ogtInsolventPersonDetail the ogt insolvent person detail
	 */
	public static void cacheResult(
		OgtInsolventPersonDetail ogtInsolventPersonDetail) {

		getPersistence().cacheResult(ogtInsolventPersonDetail);
	}

	/**
	 * Caches the ogt insolvent person details in the entity cache if it is enabled.
	 *
	 * @param ogtInsolventPersonDetails the ogt insolvent person details
	 */
	public static void cacheResult(
		List<OgtInsolventPersonDetail> ogtInsolventPersonDetails) {

		getPersistence().cacheResult(ogtInsolventPersonDetails);
	}

	/**
	 * Creates a new ogt insolvent person detail with the primary key. Does not add the ogt insolvent person detail to the database.
	 *
	 * @param ogtInsolventPersonDetailId the primary key for the new ogt insolvent person detail
	 * @return the new ogt insolvent person detail
	 */
	public static OgtInsolventPersonDetail create(
		long ogtInsolventPersonDetailId) {

		return getPersistence().create(ogtInsolventPersonDetailId);
	}

	/**
	 * Removes the ogt insolvent person detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ogtInsolventPersonDetailId the primary key of the ogt insolvent person detail
	 * @return the ogt insolvent person detail that was removed
	 * @throws NoSuchOgtInsolventPersonDetailException if a ogt insolvent person detail with the primary key could not be found
	 */
	public static OgtInsolventPersonDetail remove(
			long ogtInsolventPersonDetailId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtInsolventPersonDetailException {

		return getPersistence().remove(ogtInsolventPersonDetailId);
	}

	public static OgtInsolventPersonDetail updateImpl(
		OgtInsolventPersonDetail ogtInsolventPersonDetail) {

		return getPersistence().updateImpl(ogtInsolventPersonDetail);
	}

	/**
	 * Returns the ogt insolvent person detail with the primary key or throws a <code>NoSuchOgtInsolventPersonDetailException</code> if it could not be found.
	 *
	 * @param ogtInsolventPersonDetailId the primary key of the ogt insolvent person detail
	 * @return the ogt insolvent person detail
	 * @throws NoSuchOgtInsolventPersonDetailException if a ogt insolvent person detail with the primary key could not be found
	 */
	public static OgtInsolventPersonDetail findByPrimaryKey(
			long ogtInsolventPersonDetailId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtInsolventPersonDetailException {

		return getPersistence().findByPrimaryKey(ogtInsolventPersonDetailId);
	}

	/**
	 * Returns the ogt insolvent person detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ogtInsolventPersonDetailId the primary key of the ogt insolvent person detail
	 * @return the ogt insolvent person detail, or <code>null</code> if a ogt insolvent person detail with the primary key could not be found
	 */
	public static OgtInsolventPersonDetail fetchByPrimaryKey(
		long ogtInsolventPersonDetailId) {

		return getPersistence().fetchByPrimaryKey(ogtInsolventPersonDetailId);
	}

	/**
	 * Returns all the ogt insolvent person details.
	 *
	 * @return the ogt insolvent person details
	 */
	public static List<OgtInsolventPersonDetail> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ogt insolvent person details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtInsolventPersonDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt insolvent person details
	 * @param end the upper bound of the range of ogt insolvent person details (not inclusive)
	 * @return the range of ogt insolvent person details
	 */
	public static List<OgtInsolventPersonDetail> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ogt insolvent person details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtInsolventPersonDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt insolvent person details
	 * @param end the upper bound of the range of ogt insolvent person details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ogt insolvent person details
	 */
	public static List<OgtInsolventPersonDetail> findAll(
		int start, int end,
		OrderByComparator<OgtInsolventPersonDetail> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ogt insolvent person details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtInsolventPersonDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt insolvent person details
	 * @param end the upper bound of the range of ogt insolvent person details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ogt insolvent person details
	 */
	public static List<OgtInsolventPersonDetail> findAll(
		int start, int end,
		OrderByComparator<OgtInsolventPersonDetail> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ogt insolvent person details from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ogt insolvent person details.
	 *
	 * @return the number of ogt insolvent person details
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OgtInsolventPersonDetailPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OgtInsolventPersonDetailPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OgtInsolventPersonDetailPersistence _persistence;

}