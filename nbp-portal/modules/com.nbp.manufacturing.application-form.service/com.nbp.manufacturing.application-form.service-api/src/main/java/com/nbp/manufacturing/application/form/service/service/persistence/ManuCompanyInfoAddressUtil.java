/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.form.service.model.ManuCompanyInfoAddress;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the manu company info address service. This utility wraps <code>com.nbp.manufacturing.application.form.service.service.persistence.impl.ManuCompanyInfoAddressPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuCompanyInfoAddressPersistence
 * @generated
 */
public class ManuCompanyInfoAddressUtil {

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
		ManuCompanyInfoAddress manuCompanyInfoAddress) {

		getPersistence().clearCache(manuCompanyInfoAddress);
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
	public static Map<Serializable, ManuCompanyInfoAddress> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ManuCompanyInfoAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ManuCompanyInfoAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ManuCompanyInfoAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ManuCompanyInfoAddress> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ManuCompanyInfoAddress update(
		ManuCompanyInfoAddress manuCompanyInfoAddress) {

		return getPersistence().update(manuCompanyInfoAddress);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ManuCompanyInfoAddress update(
		ManuCompanyInfoAddress manuCompanyInfoAddress,
		ServiceContext serviceContext) {

		return getPersistence().update(manuCompanyInfoAddress, serviceContext);
	}

	/**
	 * Returns all the manu company info addresses where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu company info addresses
	 */
	public static List<ManuCompanyInfoAddress> findBygetMA_CIA(
		long manufacturingApplicationId) {

		return getPersistence().findBygetMA_CIA(manufacturingApplicationId);
	}

	/**
	 * Returns a range of all the manu company info addresses where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoAddressModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu company info addresses
	 * @param end the upper bound of the range of manu company info addresses (not inclusive)
	 * @return the range of matching manu company info addresses
	 */
	public static List<ManuCompanyInfoAddress> findBygetMA_CIA(
		long manufacturingApplicationId, int start, int end) {

		return getPersistence().findBygetMA_CIA(
			manufacturingApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the manu company info addresses where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoAddressModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu company info addresses
	 * @param end the upper bound of the range of manu company info addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu company info addresses
	 */
	public static List<ManuCompanyInfoAddress> findBygetMA_CIA(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuCompanyInfoAddress> orderByComparator) {

		return getPersistence().findBygetMA_CIA(
			manufacturingApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu company info addresses where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoAddressModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu company info addresses
	 * @param end the upper bound of the range of manu company info addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu company info addresses
	 */
	public static List<ManuCompanyInfoAddress> findBygetMA_CIA(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuCompanyInfoAddress> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMA_CIA(
			manufacturingApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first manu company info address in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu company info address
	 * @throws NoSuchManuCompanyInfoAddressException if a matching manu company info address could not be found
	 */
	public static ManuCompanyInfoAddress findBygetMA_CIA_First(
			long manufacturingApplicationId,
			OrderByComparator<ManuCompanyInfoAddress> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuCompanyInfoAddressException {

		return getPersistence().findBygetMA_CIA_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the first manu company info address in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu company info address, or <code>null</code> if a matching manu company info address could not be found
	 */
	public static ManuCompanyInfoAddress fetchBygetMA_CIA_First(
		long manufacturingApplicationId,
		OrderByComparator<ManuCompanyInfoAddress> orderByComparator) {

		return getPersistence().fetchBygetMA_CIA_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last manu company info address in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu company info address
	 * @throws NoSuchManuCompanyInfoAddressException if a matching manu company info address could not be found
	 */
	public static ManuCompanyInfoAddress findBygetMA_CIA_Last(
			long manufacturingApplicationId,
			OrderByComparator<ManuCompanyInfoAddress> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuCompanyInfoAddressException {

		return getPersistence().findBygetMA_CIA_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last manu company info address in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu company info address, or <code>null</code> if a matching manu company info address could not be found
	 */
	public static ManuCompanyInfoAddress fetchBygetMA_CIA_Last(
		long manufacturingApplicationId,
		OrderByComparator<ManuCompanyInfoAddress> orderByComparator) {

		return getPersistence().fetchBygetMA_CIA_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the manu company info addresses before and after the current manu company info address in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuCompanyInfoAddressId the primary key of the current manu company info address
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu company info address
	 * @throws NoSuchManuCompanyInfoAddressException if a manu company info address with the primary key could not be found
	 */
	public static ManuCompanyInfoAddress[] findBygetMA_CIA_PrevAndNext(
			long manuCompanyInfoAddressId, long manufacturingApplicationId,
			OrderByComparator<ManuCompanyInfoAddress> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuCompanyInfoAddressException {

		return getPersistence().findBygetMA_CIA_PrevAndNext(
			manuCompanyInfoAddressId, manufacturingApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the manu company info addresses where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public static void removeBygetMA_CIA(long manufacturingApplicationId) {
		getPersistence().removeBygetMA_CIA(manufacturingApplicationId);
	}

	/**
	 * Returns the number of manu company info addresses where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu company info addresses
	 */
	public static int countBygetMA_CIA(long manufacturingApplicationId) {
		return getPersistence().countBygetMA_CIA(manufacturingApplicationId);
	}

	/**
	 * Returns all the manu company info addresses where manuCompanyInfoId = &#63;.
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 * @return the matching manu company info addresses
	 */
	public static List<ManuCompanyInfoAddress> findBygetMA_CII(
		long manuCompanyInfoId) {

		return getPersistence().findBygetMA_CII(manuCompanyInfoId);
	}

	/**
	 * Returns a range of all the manu company info addresses where manuCompanyInfoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoAddressModelImpl</code>.
	 * </p>
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 * @param start the lower bound of the range of manu company info addresses
	 * @param end the upper bound of the range of manu company info addresses (not inclusive)
	 * @return the range of matching manu company info addresses
	 */
	public static List<ManuCompanyInfoAddress> findBygetMA_CII(
		long manuCompanyInfoId, int start, int end) {

		return getPersistence().findBygetMA_CII(manuCompanyInfoId, start, end);
	}

	/**
	 * Returns an ordered range of all the manu company info addresses where manuCompanyInfoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoAddressModelImpl</code>.
	 * </p>
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 * @param start the lower bound of the range of manu company info addresses
	 * @param end the upper bound of the range of manu company info addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu company info addresses
	 */
	public static List<ManuCompanyInfoAddress> findBygetMA_CII(
		long manuCompanyInfoId, int start, int end,
		OrderByComparator<ManuCompanyInfoAddress> orderByComparator) {

		return getPersistence().findBygetMA_CII(
			manuCompanyInfoId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu company info addresses where manuCompanyInfoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoAddressModelImpl</code>.
	 * </p>
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 * @param start the lower bound of the range of manu company info addresses
	 * @param end the upper bound of the range of manu company info addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu company info addresses
	 */
	public static List<ManuCompanyInfoAddress> findBygetMA_CII(
		long manuCompanyInfoId, int start, int end,
		OrderByComparator<ManuCompanyInfoAddress> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMA_CII(
			manuCompanyInfoId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first manu company info address in the ordered set where manuCompanyInfoId = &#63;.
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu company info address
	 * @throws NoSuchManuCompanyInfoAddressException if a matching manu company info address could not be found
	 */
	public static ManuCompanyInfoAddress findBygetMA_CII_First(
			long manuCompanyInfoId,
			OrderByComparator<ManuCompanyInfoAddress> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuCompanyInfoAddressException {

		return getPersistence().findBygetMA_CII_First(
			manuCompanyInfoId, orderByComparator);
	}

	/**
	 * Returns the first manu company info address in the ordered set where manuCompanyInfoId = &#63;.
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu company info address, or <code>null</code> if a matching manu company info address could not be found
	 */
	public static ManuCompanyInfoAddress fetchBygetMA_CII_First(
		long manuCompanyInfoId,
		OrderByComparator<ManuCompanyInfoAddress> orderByComparator) {

		return getPersistence().fetchBygetMA_CII_First(
			manuCompanyInfoId, orderByComparator);
	}

	/**
	 * Returns the last manu company info address in the ordered set where manuCompanyInfoId = &#63;.
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu company info address
	 * @throws NoSuchManuCompanyInfoAddressException if a matching manu company info address could not be found
	 */
	public static ManuCompanyInfoAddress findBygetMA_CII_Last(
			long manuCompanyInfoId,
			OrderByComparator<ManuCompanyInfoAddress> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuCompanyInfoAddressException {

		return getPersistence().findBygetMA_CII_Last(
			manuCompanyInfoId, orderByComparator);
	}

	/**
	 * Returns the last manu company info address in the ordered set where manuCompanyInfoId = &#63;.
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu company info address, or <code>null</code> if a matching manu company info address could not be found
	 */
	public static ManuCompanyInfoAddress fetchBygetMA_CII_Last(
		long manuCompanyInfoId,
		OrderByComparator<ManuCompanyInfoAddress> orderByComparator) {

		return getPersistence().fetchBygetMA_CII_Last(
			manuCompanyInfoId, orderByComparator);
	}

	/**
	 * Returns the manu company info addresses before and after the current manu company info address in the ordered set where manuCompanyInfoId = &#63;.
	 *
	 * @param manuCompanyInfoAddressId the primary key of the current manu company info address
	 * @param manuCompanyInfoId the manu company info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu company info address
	 * @throws NoSuchManuCompanyInfoAddressException if a manu company info address with the primary key could not be found
	 */
	public static ManuCompanyInfoAddress[] findBygetMA_CII_PrevAndNext(
			long manuCompanyInfoAddressId, long manuCompanyInfoId,
			OrderByComparator<ManuCompanyInfoAddress> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuCompanyInfoAddressException {

		return getPersistence().findBygetMA_CII_PrevAndNext(
			manuCompanyInfoAddressId, manuCompanyInfoId, orderByComparator);
	}

	/**
	 * Removes all the manu company info addresses where manuCompanyInfoId = &#63; from the database.
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 */
	public static void removeBygetMA_CII(long manuCompanyInfoId) {
		getPersistence().removeBygetMA_CII(manuCompanyInfoId);
	}

	/**
	 * Returns the number of manu company info addresses where manuCompanyInfoId = &#63;.
	 *
	 * @param manuCompanyInfoId the manu company info ID
	 * @return the number of matching manu company info addresses
	 */
	public static int countBygetMA_CII(long manuCompanyInfoId) {
		return getPersistence().countBygetMA_CII(manuCompanyInfoId);
	}

	/**
	 * Caches the manu company info address in the entity cache if it is enabled.
	 *
	 * @param manuCompanyInfoAddress the manu company info address
	 */
	public static void cacheResult(
		ManuCompanyInfoAddress manuCompanyInfoAddress) {

		getPersistence().cacheResult(manuCompanyInfoAddress);
	}

	/**
	 * Caches the manu company info addresses in the entity cache if it is enabled.
	 *
	 * @param manuCompanyInfoAddresses the manu company info addresses
	 */
	public static void cacheResult(
		List<ManuCompanyInfoAddress> manuCompanyInfoAddresses) {

		getPersistence().cacheResult(manuCompanyInfoAddresses);
	}

	/**
	 * Creates a new manu company info address with the primary key. Does not add the manu company info address to the database.
	 *
	 * @param manuCompanyInfoAddressId the primary key for the new manu company info address
	 * @return the new manu company info address
	 */
	public static ManuCompanyInfoAddress create(long manuCompanyInfoAddressId) {
		return getPersistence().create(manuCompanyInfoAddressId);
	}

	/**
	 * Removes the manu company info address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuCompanyInfoAddressId the primary key of the manu company info address
	 * @return the manu company info address that was removed
	 * @throws NoSuchManuCompanyInfoAddressException if a manu company info address with the primary key could not be found
	 */
	public static ManuCompanyInfoAddress remove(long manuCompanyInfoAddressId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuCompanyInfoAddressException {

		return getPersistence().remove(manuCompanyInfoAddressId);
	}

	public static ManuCompanyInfoAddress updateImpl(
		ManuCompanyInfoAddress manuCompanyInfoAddress) {

		return getPersistence().updateImpl(manuCompanyInfoAddress);
	}

	/**
	 * Returns the manu company info address with the primary key or throws a <code>NoSuchManuCompanyInfoAddressException</code> if it could not be found.
	 *
	 * @param manuCompanyInfoAddressId the primary key of the manu company info address
	 * @return the manu company info address
	 * @throws NoSuchManuCompanyInfoAddressException if a manu company info address with the primary key could not be found
	 */
	public static ManuCompanyInfoAddress findByPrimaryKey(
			long manuCompanyInfoAddressId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuCompanyInfoAddressException {

		return getPersistence().findByPrimaryKey(manuCompanyInfoAddressId);
	}

	/**
	 * Returns the manu company info address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuCompanyInfoAddressId the primary key of the manu company info address
	 * @return the manu company info address, or <code>null</code> if a manu company info address with the primary key could not be found
	 */
	public static ManuCompanyInfoAddress fetchByPrimaryKey(
		long manuCompanyInfoAddressId) {

		return getPersistence().fetchByPrimaryKey(manuCompanyInfoAddressId);
	}

	/**
	 * Returns all the manu company info addresses.
	 *
	 * @return the manu company info addresses
	 */
	public static List<ManuCompanyInfoAddress> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the manu company info addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu company info addresses
	 * @param end the upper bound of the range of manu company info addresses (not inclusive)
	 * @return the range of manu company info addresses
	 */
	public static List<ManuCompanyInfoAddress> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the manu company info addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu company info addresses
	 * @param end the upper bound of the range of manu company info addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu company info addresses
	 */
	public static List<ManuCompanyInfoAddress> findAll(
		int start, int end,
		OrderByComparator<ManuCompanyInfoAddress> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu company info addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuCompanyInfoAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu company info addresses
	 * @param end the upper bound of the range of manu company info addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu company info addresses
	 */
	public static List<ManuCompanyInfoAddress> findAll(
		int start, int end,
		OrderByComparator<ManuCompanyInfoAddress> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the manu company info addresses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of manu company info addresses.
	 *
	 * @return the number of manu company info addresses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ManuCompanyInfoAddressPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		ManuCompanyInfoAddressPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile ManuCompanyInfoAddressPersistence _persistence;

}