/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.JtbAddCraftApplicantInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jtb add craft applicant info service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.JtbAddCraftApplicantInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddCraftApplicantInfoPersistence
 * @generated
 */
public class JtbAddCraftApplicantInfoUtil {

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
		JtbAddCraftApplicantInfo jtbAddCraftApplicantInfo) {

		getPersistence().clearCache(jtbAddCraftApplicantInfo);
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
	public static Map<Serializable, JtbAddCraftApplicantInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JtbAddCraftApplicantInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JtbAddCraftApplicantInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JtbAddCraftApplicantInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JtbAddCraftApplicantInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JtbAddCraftApplicantInfo update(
		JtbAddCraftApplicantInfo jtbAddCraftApplicantInfo) {

		return getPersistence().update(jtbAddCraftApplicantInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JtbAddCraftApplicantInfo update(
		JtbAddCraftApplicantInfo jtbAddCraftApplicantInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			jtbAddCraftApplicantInfo, serviceContext);
	}

	/**
	 * Returns all the jtb add craft applicant infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb add craft applicant infos
	 */
	public static List<JtbAddCraftApplicantInfo> findBygetByJtbAppId(
		long jtbApplicationId) {

		return getPersistence().findBygetByJtbAppId(jtbApplicationId);
	}

	/**
	 * Returns a range of all the jtb add craft applicant infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddCraftApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add craft applicant infos
	 * @param end the upper bound of the range of jtb add craft applicant infos (not inclusive)
	 * @return the range of matching jtb add craft applicant infos
	 */
	public static List<JtbAddCraftApplicantInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end) {

		return getPersistence().findBygetByJtbAppId(
			jtbApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the jtb add craft applicant infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddCraftApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add craft applicant infos
	 * @param end the upper bound of the range of jtb add craft applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb add craft applicant infos
	 */
	public static List<JtbAddCraftApplicantInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		OrderByComparator<JtbAddCraftApplicantInfo> orderByComparator) {

		return getPersistence().findBygetByJtbAppId(
			jtbApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb add craft applicant infos where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddCraftApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb add craft applicant infos
	 * @param end the upper bound of the range of jtb add craft applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb add craft applicant infos
	 */
	public static List<JtbAddCraftApplicantInfo> findBygetByJtbAppId(
		long jtbApplicationId, int start, int end,
		OrderByComparator<JtbAddCraftApplicantInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetByJtbAppId(
			jtbApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jtb add craft applicant info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add craft applicant info
	 * @throws NoSuchJtbAddCraftApplicantInfoException if a matching jtb add craft applicant info could not be found
	 */
	public static JtbAddCraftApplicantInfo findBygetByJtbAppId_First(
			long jtbApplicationId,
			OrderByComparator<JtbAddCraftApplicantInfo> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbAddCraftApplicantInfoException {

		return getPersistence().findBygetByJtbAppId_First(
			jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the first jtb add craft applicant info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb add craft applicant info, or <code>null</code> if a matching jtb add craft applicant info could not be found
	 */
	public static JtbAddCraftApplicantInfo fetchBygetByJtbAppId_First(
		long jtbApplicationId,
		OrderByComparator<JtbAddCraftApplicantInfo> orderByComparator) {

		return getPersistence().fetchBygetByJtbAppId_First(
			jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the last jtb add craft applicant info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add craft applicant info
	 * @throws NoSuchJtbAddCraftApplicantInfoException if a matching jtb add craft applicant info could not be found
	 */
	public static JtbAddCraftApplicantInfo findBygetByJtbAppId_Last(
			long jtbApplicationId,
			OrderByComparator<JtbAddCraftApplicantInfo> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbAddCraftApplicantInfoException {

		return getPersistence().findBygetByJtbAppId_Last(
			jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the last jtb add craft applicant info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb add craft applicant info, or <code>null</code> if a matching jtb add craft applicant info could not be found
	 */
	public static JtbAddCraftApplicantInfo fetchBygetByJtbAppId_Last(
		long jtbApplicationId,
		OrderByComparator<JtbAddCraftApplicantInfo> orderByComparator) {

		return getPersistence().fetchBygetByJtbAppId_Last(
			jtbApplicationId, orderByComparator);
	}

	/**
	 * Returns the jtb add craft applicant infos before and after the current jtb add craft applicant info in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbAddCraftApplicantInfoId the primary key of the current jtb add craft applicant info
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb add craft applicant info
	 * @throws NoSuchJtbAddCraftApplicantInfoException if a jtb add craft applicant info with the primary key could not be found
	 */
	public static JtbAddCraftApplicantInfo[] findBygetByJtbAppId_PrevAndNext(
			long jtbAddCraftApplicantInfoId, long jtbApplicationId,
			OrderByComparator<JtbAddCraftApplicantInfo> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbAddCraftApplicantInfoException {

		return getPersistence().findBygetByJtbAppId_PrevAndNext(
			jtbAddCraftApplicantInfoId, jtbApplicationId, orderByComparator);
	}

	/**
	 * Removes all the jtb add craft applicant infos where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 */
	public static void removeBygetByJtbAppId(long jtbApplicationId) {
		getPersistence().removeBygetByJtbAppId(jtbApplicationId);
	}

	/**
	 * Returns the number of jtb add craft applicant infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb add craft applicant infos
	 */
	public static int countBygetByJtbAppId(long jtbApplicationId) {
		return getPersistence().countBygetByJtbAppId(jtbApplicationId);
	}

	/**
	 * Caches the jtb add craft applicant info in the entity cache if it is enabled.
	 *
	 * @param jtbAddCraftApplicantInfo the jtb add craft applicant info
	 */
	public static void cacheResult(
		JtbAddCraftApplicantInfo jtbAddCraftApplicantInfo) {

		getPersistence().cacheResult(jtbAddCraftApplicantInfo);
	}

	/**
	 * Caches the jtb add craft applicant infos in the entity cache if it is enabled.
	 *
	 * @param jtbAddCraftApplicantInfos the jtb add craft applicant infos
	 */
	public static void cacheResult(
		List<JtbAddCraftApplicantInfo> jtbAddCraftApplicantInfos) {

		getPersistence().cacheResult(jtbAddCraftApplicantInfos);
	}

	/**
	 * Creates a new jtb add craft applicant info with the primary key. Does not add the jtb add craft applicant info to the database.
	 *
	 * @param jtbAddCraftApplicantInfoId the primary key for the new jtb add craft applicant info
	 * @return the new jtb add craft applicant info
	 */
	public static JtbAddCraftApplicantInfo create(
		long jtbAddCraftApplicantInfoId) {

		return getPersistence().create(jtbAddCraftApplicantInfoId);
	}

	/**
	 * Removes the jtb add craft applicant info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbAddCraftApplicantInfoId the primary key of the jtb add craft applicant info
	 * @return the jtb add craft applicant info that was removed
	 * @throws NoSuchJtbAddCraftApplicantInfoException if a jtb add craft applicant info with the primary key could not be found
	 */
	public static JtbAddCraftApplicantInfo remove(
			long jtbAddCraftApplicantInfoId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbAddCraftApplicantInfoException {

		return getPersistence().remove(jtbAddCraftApplicantInfoId);
	}

	public static JtbAddCraftApplicantInfo updateImpl(
		JtbAddCraftApplicantInfo jtbAddCraftApplicantInfo) {

		return getPersistence().updateImpl(jtbAddCraftApplicantInfo);
	}

	/**
	 * Returns the jtb add craft applicant info with the primary key or throws a <code>NoSuchJtbAddCraftApplicantInfoException</code> if it could not be found.
	 *
	 * @param jtbAddCraftApplicantInfoId the primary key of the jtb add craft applicant info
	 * @return the jtb add craft applicant info
	 * @throws NoSuchJtbAddCraftApplicantInfoException if a jtb add craft applicant info with the primary key could not be found
	 */
	public static JtbAddCraftApplicantInfo findByPrimaryKey(
			long jtbAddCraftApplicantInfoId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJtbAddCraftApplicantInfoException {

		return getPersistence().findByPrimaryKey(jtbAddCraftApplicantInfoId);
	}

	/**
	 * Returns the jtb add craft applicant info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbAddCraftApplicantInfoId the primary key of the jtb add craft applicant info
	 * @return the jtb add craft applicant info, or <code>null</code> if a jtb add craft applicant info with the primary key could not be found
	 */
	public static JtbAddCraftApplicantInfo fetchByPrimaryKey(
		long jtbAddCraftApplicantInfoId) {

		return getPersistence().fetchByPrimaryKey(jtbAddCraftApplicantInfoId);
	}

	/**
	 * Returns all the jtb add craft applicant infos.
	 *
	 * @return the jtb add craft applicant infos
	 */
	public static List<JtbAddCraftApplicantInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jtb add craft applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddCraftApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add craft applicant infos
	 * @param end the upper bound of the range of jtb add craft applicant infos (not inclusive)
	 * @return the range of jtb add craft applicant infos
	 */
	public static List<JtbAddCraftApplicantInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jtb add craft applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddCraftApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add craft applicant infos
	 * @param end the upper bound of the range of jtb add craft applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb add craft applicant infos
	 */
	public static List<JtbAddCraftApplicantInfo> findAll(
		int start, int end,
		OrderByComparator<JtbAddCraftApplicantInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb add craft applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbAddCraftApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add craft applicant infos
	 * @param end the upper bound of the range of jtb add craft applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb add craft applicant infos
	 */
	public static List<JtbAddCraftApplicantInfo> findAll(
		int start, int end,
		OrderByComparator<JtbAddCraftApplicantInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jtb add craft applicant infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jtb add craft applicant infos.
	 *
	 * @return the number of jtb add craft applicant infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JtbAddCraftApplicantInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JtbAddCraftApplicantInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JtbAddCraftApplicantInfoPersistence _persistence;

}