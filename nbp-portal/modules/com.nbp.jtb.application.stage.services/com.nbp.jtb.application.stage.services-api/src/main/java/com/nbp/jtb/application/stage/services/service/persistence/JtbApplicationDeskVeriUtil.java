/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.stage.services.model.JtbApplicationDeskVeri;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jtb application desk veri service. This utility wraps <code>com.nbp.jtb.application.stage.services.service.persistence.impl.JtbApplicationDeskVeriPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbApplicationDeskVeriPersistence
 * @generated
 */
public class JtbApplicationDeskVeriUtil {

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
		JtbApplicationDeskVeri jtbApplicationDeskVeri) {

		getPersistence().clearCache(jtbApplicationDeskVeri);
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
	public static Map<Serializable, JtbApplicationDeskVeri> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JtbApplicationDeskVeri> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JtbApplicationDeskVeri> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JtbApplicationDeskVeri> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JtbApplicationDeskVeri> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JtbApplicationDeskVeri update(
		JtbApplicationDeskVeri jtbApplicationDeskVeri) {

		return getPersistence().update(jtbApplicationDeskVeri);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JtbApplicationDeskVeri update(
		JtbApplicationDeskVeri jtbApplicationDeskVeri,
		ServiceContext serviceContext) {

		return getPersistence().update(jtbApplicationDeskVeri, serviceContext);
	}

	/**
	 * Returns all the jtb application desk veris where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb application desk veris
	 */
	public static List<JtbApplicationDeskVeri> findBygetJtbAppDV_ById(
		long jtbApplicationId) {

		return getPersistence().findBygetJtbAppDV_ById(jtbApplicationId);
	}

	/**
	 * Returns a range of all the jtb application desk veris where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb application desk veris
	 * @param end the upper bound of the range of jtb application desk veris (not inclusive)
	 * @return the range of matching jtb application desk veris
	 */
	public static List<JtbApplicationDeskVeri> findBygetJtbAppDV_ById(
		long jtbApplicationId, int start, int end) {

		return getPersistence().findBygetJtbAppDV_ById(
			jtbApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the jtb application desk veris where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb application desk veris
	 * @param end the upper bound of the range of jtb application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb application desk veris
	 */
	public static List<JtbApplicationDeskVeri> findBygetJtbAppDV_ById(
		long jtbApplicationId, int start, int end,
		OrderByComparator<JtbApplicationDeskVeri> orderByComparator) {

		return getPersistence().findBygetJtbAppDV_ById(
			jtbApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb application desk veris where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb application desk veris
	 * @param end the upper bound of the range of jtb application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb application desk veris
	 */
	public static List<JtbApplicationDeskVeri> findBygetJtbAppDV_ById(
		long jtbApplicationId, int start, int end,
		OrderByComparator<JtbApplicationDeskVeri> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJtbAppDV_ById(
			jtbApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jtb application desk veri in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application desk veri
	 * @throws NoSuchJtbApplicationDeskVeriException if a matching jtb application desk veri could not be found
	 */
	public static JtbApplicationDeskVeri findBygetJtbAppDV_ById_First(
			long jtbApplicationId,
			OrderByComparator<JtbApplicationDeskVeri> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationDeskVeriException {

		return getPersistence().findBygetJtbAppDV_ById_First(
			jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the first jtb application desk veri in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application desk veri, or <code>null</code> if a matching jtb application desk veri could not be found
	 */
	public static JtbApplicationDeskVeri fetchBygetJtbAppDV_ById_First(
		long jtbApplicationId,
		OrderByComparator<JtbApplicationDeskVeri> orderByComparator) {

		return getPersistence().fetchBygetJtbAppDV_ById_First(
			jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the last jtb application desk veri in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application desk veri
	 * @throws NoSuchJtbApplicationDeskVeriException if a matching jtb application desk veri could not be found
	 */
	public static JtbApplicationDeskVeri findBygetJtbAppDV_ById_Last(
			long jtbApplicationId,
			OrderByComparator<JtbApplicationDeskVeri> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationDeskVeriException {

		return getPersistence().findBygetJtbAppDV_ById_Last(
			jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the last jtb application desk veri in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application desk veri, or <code>null</code> if a matching jtb application desk veri could not be found
	 */
	public static JtbApplicationDeskVeri fetchBygetJtbAppDV_ById_Last(
		long jtbApplicationId,
		OrderByComparator<JtbApplicationDeskVeri> orderByComparator) {

		return getPersistence().fetchBygetJtbAppDV_ById_Last(
			jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the jtb application desk veris before and after the current jtb application desk veri in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationDeskVeriId the primary key of the current jtb application desk veri
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application desk veri
	 * @throws NoSuchJtbApplicationDeskVeriException if a jtb application desk veri with the primary key could not be found
	 */
	public static JtbApplicationDeskVeri[] findBygetJtbAppDV_ById_PrevAndNext(
			long jtbApplicationDeskVeriId, long jtbApplicationId,
			OrderByComparator<JtbApplicationDeskVeri> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationDeskVeriException {

		return getPersistence().findBygetJtbAppDV_ById_PrevAndNext(
			jtbApplicationDeskVeriId, jtbApplicationId, orderByComparator);
	}

	/**
	 * Removes all the jtb application desk veris where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 */
	public static void removeBygetJtbAppDV_ById(long jtbApplicationId) {
		getPersistence().removeBygetJtbAppDV_ById(jtbApplicationId);
	}

	/**
	 * Returns the number of jtb application desk veris where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb application desk veris
	 */
	public static int countBygetJtbAppDV_ById(long jtbApplicationId) {
		return getPersistence().countBygetJtbAppDV_ById(jtbApplicationId);
	}

	/**
	 * Caches the jtb application desk veri in the entity cache if it is enabled.
	 *
	 * @param jtbApplicationDeskVeri the jtb application desk veri
	 */
	public static void cacheResult(
		JtbApplicationDeskVeri jtbApplicationDeskVeri) {

		getPersistence().cacheResult(jtbApplicationDeskVeri);
	}

	/**
	 * Caches the jtb application desk veris in the entity cache if it is enabled.
	 *
	 * @param jtbApplicationDeskVeris the jtb application desk veris
	 */
	public static void cacheResult(
		List<JtbApplicationDeskVeri> jtbApplicationDeskVeris) {

		getPersistence().cacheResult(jtbApplicationDeskVeris);
	}

	/**
	 * Creates a new jtb application desk veri with the primary key. Does not add the jtb application desk veri to the database.
	 *
	 * @param jtbApplicationDeskVeriId the primary key for the new jtb application desk veri
	 * @return the new jtb application desk veri
	 */
	public static JtbApplicationDeskVeri create(long jtbApplicationDeskVeriId) {
		return getPersistence().create(jtbApplicationDeskVeriId);
	}

	/**
	 * Removes the jtb application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbApplicationDeskVeriId the primary key of the jtb application desk veri
	 * @return the jtb application desk veri that was removed
	 * @throws NoSuchJtbApplicationDeskVeriException if a jtb application desk veri with the primary key could not be found
	 */
	public static JtbApplicationDeskVeri remove(long jtbApplicationDeskVeriId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationDeskVeriException {

		return getPersistence().remove(jtbApplicationDeskVeriId);
	}

	public static JtbApplicationDeskVeri updateImpl(
		JtbApplicationDeskVeri jtbApplicationDeskVeri) {

		return getPersistence().updateImpl(jtbApplicationDeskVeri);
	}

	/**
	 * Returns the jtb application desk veri with the primary key or throws a <code>NoSuchJtbApplicationDeskVeriException</code> if it could not be found.
	 *
	 * @param jtbApplicationDeskVeriId the primary key of the jtb application desk veri
	 * @return the jtb application desk veri
	 * @throws NoSuchJtbApplicationDeskVeriException if a jtb application desk veri with the primary key could not be found
	 */
	public static JtbApplicationDeskVeri findByPrimaryKey(
			long jtbApplicationDeskVeriId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationDeskVeriException {

		return getPersistence().findByPrimaryKey(jtbApplicationDeskVeriId);
	}

	/**
	 * Returns the jtb application desk veri with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbApplicationDeskVeriId the primary key of the jtb application desk veri
	 * @return the jtb application desk veri, or <code>null</code> if a jtb application desk veri with the primary key could not be found
	 */
	public static JtbApplicationDeskVeri fetchByPrimaryKey(
		long jtbApplicationDeskVeriId) {

		return getPersistence().fetchByPrimaryKey(jtbApplicationDeskVeriId);
	}

	/**
	 * Returns all the jtb application desk veris.
	 *
	 * @return the jtb application desk veris
	 */
	public static List<JtbApplicationDeskVeri> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jtb application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb application desk veris
	 * @param end the upper bound of the range of jtb application desk veris (not inclusive)
	 * @return the range of jtb application desk veris
	 */
	public static List<JtbApplicationDeskVeri> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jtb application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb application desk veris
	 * @param end the upper bound of the range of jtb application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb application desk veris
	 */
	public static List<JtbApplicationDeskVeri> findAll(
		int start, int end,
		OrderByComparator<JtbApplicationDeskVeri> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb application desk veris
	 * @param end the upper bound of the range of jtb application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb application desk veris
	 */
	public static List<JtbApplicationDeskVeri> findAll(
		int start, int end,
		OrderByComparator<JtbApplicationDeskVeri> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jtb application desk veris from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jtb application desk veris.
	 *
	 * @return the number of jtb application desk veris
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JtbApplicationDeskVeriPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JtbApplicationDeskVeriPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JtbApplicationDeskVeriPersistence _persistence;

}