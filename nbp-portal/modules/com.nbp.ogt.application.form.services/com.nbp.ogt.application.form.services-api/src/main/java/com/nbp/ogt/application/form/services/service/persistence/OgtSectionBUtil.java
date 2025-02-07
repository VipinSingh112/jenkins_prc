/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ogt.application.form.services.model.OgtSectionB;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ogt section b service. This utility wraps <code>com.nbp.ogt.application.form.services.service.persistence.impl.OgtSectionBPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OgtSectionBPersistence
 * @generated
 */
public class OgtSectionBUtil {

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
	public static void clearCache(OgtSectionB ogtSectionB) {
		getPersistence().clearCache(ogtSectionB);
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
	public static Map<Serializable, OgtSectionB> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OgtSectionB> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OgtSectionB> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OgtSectionB> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OgtSectionB> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OgtSectionB update(OgtSectionB ogtSectionB) {
		return getPersistence().update(ogtSectionB);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OgtSectionB update(
		OgtSectionB ogtSectionB, ServiceContext serviceContext) {

		return getPersistence().update(ogtSectionB, serviceContext);
	}

	/**
	 * Returns the ogt section b where ogtApplicationId = &#63; or throws a <code>NoSuchOgtSectionBException</code> if it could not be found.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt section b
	 * @throws NoSuchOgtSectionBException if a matching ogt section b could not be found
	 */
	public static OgtSectionB findBygetOgtById(long ogtApplicationId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtSectionBException {

		return getPersistence().findBygetOgtById(ogtApplicationId);
	}

	/**
	 * Returns the ogt section b where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt section b, or <code>null</code> if a matching ogt section b could not be found
	 */
	public static OgtSectionB fetchBygetOgtById(long ogtApplicationId) {
		return getPersistence().fetchBygetOgtById(ogtApplicationId);
	}

	/**
	 * Returns the ogt section b where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt section b, or <code>null</code> if a matching ogt section b could not be found
	 */
	public static OgtSectionB fetchBygetOgtById(
		long ogtApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetOgtById(
			ogtApplicationId, useFinderCache);
	}

	/**
	 * Removes the ogt section b where ogtApplicationId = &#63; from the database.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the ogt section b that was removed
	 */
	public static OgtSectionB removeBygetOgtById(long ogtApplicationId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtSectionBException {

		return getPersistence().removeBygetOgtById(ogtApplicationId);
	}

	/**
	 * Returns the number of ogt section bs where ogtApplicationId = &#63;.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the number of matching ogt section bs
	 */
	public static int countBygetOgtById(long ogtApplicationId) {
		return getPersistence().countBygetOgtById(ogtApplicationId);
	}

	/**
	 * Caches the ogt section b in the entity cache if it is enabled.
	 *
	 * @param ogtSectionB the ogt section b
	 */
	public static void cacheResult(OgtSectionB ogtSectionB) {
		getPersistence().cacheResult(ogtSectionB);
	}

	/**
	 * Caches the ogt section bs in the entity cache if it is enabled.
	 *
	 * @param ogtSectionBs the ogt section bs
	 */
	public static void cacheResult(List<OgtSectionB> ogtSectionBs) {
		getPersistence().cacheResult(ogtSectionBs);
	}

	/**
	 * Creates a new ogt section b with the primary key. Does not add the ogt section b to the database.
	 *
	 * @param ogtSectionBId the primary key for the new ogt section b
	 * @return the new ogt section b
	 */
	public static OgtSectionB create(long ogtSectionBId) {
		return getPersistence().create(ogtSectionBId);
	}

	/**
	 * Removes the ogt section b with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ogtSectionBId the primary key of the ogt section b
	 * @return the ogt section b that was removed
	 * @throws NoSuchOgtSectionBException if a ogt section b with the primary key could not be found
	 */
	public static OgtSectionB remove(long ogtSectionBId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtSectionBException {

		return getPersistence().remove(ogtSectionBId);
	}

	public static OgtSectionB updateImpl(OgtSectionB ogtSectionB) {
		return getPersistence().updateImpl(ogtSectionB);
	}

	/**
	 * Returns the ogt section b with the primary key or throws a <code>NoSuchOgtSectionBException</code> if it could not be found.
	 *
	 * @param ogtSectionBId the primary key of the ogt section b
	 * @return the ogt section b
	 * @throws NoSuchOgtSectionBException if a ogt section b with the primary key could not be found
	 */
	public static OgtSectionB findByPrimaryKey(long ogtSectionBId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtSectionBException {

		return getPersistence().findByPrimaryKey(ogtSectionBId);
	}

	/**
	 * Returns the ogt section b with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ogtSectionBId the primary key of the ogt section b
	 * @return the ogt section b, or <code>null</code> if a ogt section b with the primary key could not be found
	 */
	public static OgtSectionB fetchByPrimaryKey(long ogtSectionBId) {
		return getPersistence().fetchByPrimaryKey(ogtSectionBId);
	}

	/**
	 * Returns all the ogt section bs.
	 *
	 * @return the ogt section bs
	 */
	public static List<OgtSectionB> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ogt section bs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtSectionBModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt section bs
	 * @param end the upper bound of the range of ogt section bs (not inclusive)
	 * @return the range of ogt section bs
	 */
	public static List<OgtSectionB> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ogt section bs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtSectionBModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt section bs
	 * @param end the upper bound of the range of ogt section bs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ogt section bs
	 */
	public static List<OgtSectionB> findAll(
		int start, int end, OrderByComparator<OgtSectionB> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ogt section bs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtSectionBModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt section bs
	 * @param end the upper bound of the range of ogt section bs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ogt section bs
	 */
	public static List<OgtSectionB> findAll(
		int start, int end, OrderByComparator<OgtSectionB> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ogt section bs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ogt section bs.
	 *
	 * @return the number of ogt section bs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OgtSectionBPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(OgtSectionBPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile OgtSectionBPersistence _persistence;

}