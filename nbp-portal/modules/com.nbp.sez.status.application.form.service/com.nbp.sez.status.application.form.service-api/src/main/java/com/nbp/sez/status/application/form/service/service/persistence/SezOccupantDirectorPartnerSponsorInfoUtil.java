/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezOccupantDirectorPartnerSponsorInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez occupant director partner sponsor info service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezOccupantDirectorPartnerSponsorInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantDirectorPartnerSponsorInfoPersistence
 * @generated
 */
public class SezOccupantDirectorPartnerSponsorInfoUtil {

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
		SezOccupantDirectorPartnerSponsorInfo
			sezOccupantDirectorPartnerSponsorInfo) {

		getPersistence().clearCache(sezOccupantDirectorPartnerSponsorInfo);
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
	public static Map<Serializable, SezOccupantDirectorPartnerSponsorInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezOccupantDirectorPartnerSponsorInfo>
		findWithDynamicQuery(DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezOccupantDirectorPartnerSponsorInfo>
		findWithDynamicQuery(DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezOccupantDirectorPartnerSponsorInfo>
		findWithDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<SezOccupantDirectorPartnerSponsorInfo>
				orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezOccupantDirectorPartnerSponsorInfo update(
		SezOccupantDirectorPartnerSponsorInfo
			sezOccupantDirectorPartnerSponsorInfo) {

		return getPersistence().update(sezOccupantDirectorPartnerSponsorInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezOccupantDirectorPartnerSponsorInfo update(
		SezOccupantDirectorPartnerSponsorInfo
			sezOccupantDirectorPartnerSponsorInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezOccupantDirectorPartnerSponsorInfo, serviceContext);
	}

	/**
	 * Returns all the sez occupant director partner sponsor infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant director partner sponsor infos
	 */
	public static List<SezOccupantDirectorPartnerSponsorInfo>
		findBygetSezStatusByAppId(long sezStatusApplicationId) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns a range of all the sez occupant director partner sponsor infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantDirectorPartnerSponsorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant director partner sponsor infos
	 * @param end the upper bound of the range of sez occupant director partner sponsor infos (not inclusive)
	 * @return the range of matching sez occupant director partner sponsor infos
	 */
	public static List<SezOccupantDirectorPartnerSponsorInfo>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez occupant director partner sponsor infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantDirectorPartnerSponsorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant director partner sponsor infos
	 * @param end the upper bound of the range of sez occupant director partner sponsor infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez occupant director partner sponsor infos
	 */
	public static List<SezOccupantDirectorPartnerSponsorInfo>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end,
			OrderByComparator<SezOccupantDirectorPartnerSponsorInfo>
				orderByComparator) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez occupant director partner sponsor infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantDirectorPartnerSponsorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant director partner sponsor infos
	 * @param end the upper bound of the range of sez occupant director partner sponsor infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez occupant director partner sponsor infos
	 */
	public static List<SezOccupantDirectorPartnerSponsorInfo>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end,
			OrderByComparator<SezOccupantDirectorPartnerSponsorInfo>
				orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first sez occupant director partner sponsor info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant director partner sponsor info
	 * @throws NoSuchSezOccupantDirectorPartnerSponsorInfoException if a matching sez occupant director partner sponsor info could not be found
	 */
	public static SezOccupantDirectorPartnerSponsorInfo
			findBygetSezStatusByAppId_First(
				long sezStatusApplicationId,
				OrderByComparator<SezOccupantDirectorPartnerSponsorInfo>
					orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantDirectorPartnerSponsorInfoException {

		return getPersistence().findBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the first sez occupant director partner sponsor info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant director partner sponsor info, or <code>null</code> if a matching sez occupant director partner sponsor info could not be found
	 */
	public static SezOccupantDirectorPartnerSponsorInfo
		fetchBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantDirectorPartnerSponsorInfo>
				orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez occupant director partner sponsor info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant director partner sponsor info
	 * @throws NoSuchSezOccupantDirectorPartnerSponsorInfoException if a matching sez occupant director partner sponsor info could not be found
	 */
	public static SezOccupantDirectorPartnerSponsorInfo
			findBygetSezStatusByAppId_Last(
				long sezStatusApplicationId,
				OrderByComparator<SezOccupantDirectorPartnerSponsorInfo>
					orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantDirectorPartnerSponsorInfoException {

		return getPersistence().findBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez occupant director partner sponsor info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant director partner sponsor info, or <code>null</code> if a matching sez occupant director partner sponsor info could not be found
	 */
	public static SezOccupantDirectorPartnerSponsorInfo
		fetchBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezOccupantDirectorPartnerSponsorInfo>
				orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the sez occupant director partner sponsor infos before and after the current sez occupant director partner sponsor info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezOccDirectSpoId the primary key of the current sez occupant director partner sponsor info
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez occupant director partner sponsor info
	 * @throws NoSuchSezOccupantDirectorPartnerSponsorInfoException if a sez occupant director partner sponsor info with the primary key could not be found
	 */
	public static SezOccupantDirectorPartnerSponsorInfo[]
			findBygetSezStatusByAppId_PrevAndNext(
				long sezOccDirectSpoId, long sezStatusApplicationId,
				OrderByComparator<SezOccupantDirectorPartnerSponsorInfo>
					orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantDirectorPartnerSponsorInfoException {

		return getPersistence().findBygetSezStatusByAppId_PrevAndNext(
			sezOccDirectSpoId, sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Removes all the sez occupant director partner sponsor infos where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public static void removeBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		getPersistence().removeBygetSezStatusByAppId(sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez occupant director partner sponsor infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant director partner sponsor infos
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez occupant director partner sponsor info in the entity cache if it is enabled.
	 *
	 * @param sezOccupantDirectorPartnerSponsorInfo the sez occupant director partner sponsor info
	 */
	public static void cacheResult(
		SezOccupantDirectorPartnerSponsorInfo
			sezOccupantDirectorPartnerSponsorInfo) {

		getPersistence().cacheResult(sezOccupantDirectorPartnerSponsorInfo);
	}

	/**
	 * Caches the sez occupant director partner sponsor infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupantDirectorPartnerSponsorInfos the sez occupant director partner sponsor infos
	 */
	public static void cacheResult(
		List<SezOccupantDirectorPartnerSponsorInfo>
			sezOccupantDirectorPartnerSponsorInfos) {

		getPersistence().cacheResult(sezOccupantDirectorPartnerSponsorInfos);
	}

	/**
	 * Creates a new sez occupant director partner sponsor info with the primary key. Does not add the sez occupant director partner sponsor info to the database.
	 *
	 * @param sezOccDirectSpoId the primary key for the new sez occupant director partner sponsor info
	 * @return the new sez occupant director partner sponsor info
	 */
	public static SezOccupantDirectorPartnerSponsorInfo create(
		long sezOccDirectSpoId) {

		return getPersistence().create(sezOccDirectSpoId);
	}

	/**
	 * Removes the sez occupant director partner sponsor info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccDirectSpoId the primary key of the sez occupant director partner sponsor info
	 * @return the sez occupant director partner sponsor info that was removed
	 * @throws NoSuchSezOccupantDirectorPartnerSponsorInfoException if a sez occupant director partner sponsor info with the primary key could not be found
	 */
	public static SezOccupantDirectorPartnerSponsorInfo remove(
			long sezOccDirectSpoId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantDirectorPartnerSponsorInfoException {

		return getPersistence().remove(sezOccDirectSpoId);
	}

	public static SezOccupantDirectorPartnerSponsorInfo updateImpl(
		SezOccupantDirectorPartnerSponsorInfo
			sezOccupantDirectorPartnerSponsorInfo) {

		return getPersistence().updateImpl(
			sezOccupantDirectorPartnerSponsorInfo);
	}

	/**
	 * Returns the sez occupant director partner sponsor info with the primary key or throws a <code>NoSuchSezOccupantDirectorPartnerSponsorInfoException</code> if it could not be found.
	 *
	 * @param sezOccDirectSpoId the primary key of the sez occupant director partner sponsor info
	 * @return the sez occupant director partner sponsor info
	 * @throws NoSuchSezOccupantDirectorPartnerSponsorInfoException if a sez occupant director partner sponsor info with the primary key could not be found
	 */
	public static SezOccupantDirectorPartnerSponsorInfo findByPrimaryKey(
			long sezOccDirectSpoId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantDirectorPartnerSponsorInfoException {

		return getPersistence().findByPrimaryKey(sezOccDirectSpoId);
	}

	/**
	 * Returns the sez occupant director partner sponsor info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccDirectSpoId the primary key of the sez occupant director partner sponsor info
	 * @return the sez occupant director partner sponsor info, or <code>null</code> if a sez occupant director partner sponsor info with the primary key could not be found
	 */
	public static SezOccupantDirectorPartnerSponsorInfo fetchByPrimaryKey(
		long sezOccDirectSpoId) {

		return getPersistence().fetchByPrimaryKey(sezOccDirectSpoId);
	}

	/**
	 * Returns all the sez occupant director partner sponsor infos.
	 *
	 * @return the sez occupant director partner sponsor infos
	 */
	public static List<SezOccupantDirectorPartnerSponsorInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez occupant director partner sponsor infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantDirectorPartnerSponsorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant director partner sponsor infos
	 * @param end the upper bound of the range of sez occupant director partner sponsor infos (not inclusive)
	 * @return the range of sez occupant director partner sponsor infos
	 */
	public static List<SezOccupantDirectorPartnerSponsorInfo> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez occupant director partner sponsor infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantDirectorPartnerSponsorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant director partner sponsor infos
	 * @param end the upper bound of the range of sez occupant director partner sponsor infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant director partner sponsor infos
	 */
	public static List<SezOccupantDirectorPartnerSponsorInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantDirectorPartnerSponsorInfo>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez occupant director partner sponsor infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantDirectorPartnerSponsorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant director partner sponsor infos
	 * @param end the upper bound of the range of sez occupant director partner sponsor infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant director partner sponsor infos
	 */
	public static List<SezOccupantDirectorPartnerSponsorInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantDirectorPartnerSponsorInfo>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez occupant director partner sponsor infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez occupant director partner sponsor infos.
	 *
	 * @return the number of sez occupant director partner sponsor infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezOccupantDirectorPartnerSponsorInfoPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		SezOccupantDirectorPartnerSponsorInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezOccupantDirectorPartnerSponsorInfoPersistence
		_persistence;

}