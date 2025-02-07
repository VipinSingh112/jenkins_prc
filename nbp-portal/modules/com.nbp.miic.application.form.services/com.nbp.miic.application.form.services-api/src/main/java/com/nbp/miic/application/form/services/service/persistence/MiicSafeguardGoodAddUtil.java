/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.miic.application.form.services.model.MiicSafeguardGoodAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the miic safeguard good add service. This utility wraps <code>com.nbp.miic.application.form.services.service.persistence.impl.MiicSafeguardGoodAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicSafeguardGoodAddPersistence
 * @generated
 */
public class MiicSafeguardGoodAddUtil {

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
	public static void clearCache(MiicSafeguardGoodAdd miicSafeguardGoodAdd) {
		getPersistence().clearCache(miicSafeguardGoodAdd);
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
	public static Map<Serializable, MiicSafeguardGoodAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MiicSafeguardGoodAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MiicSafeguardGoodAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MiicSafeguardGoodAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MiicSafeguardGoodAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MiicSafeguardGoodAdd update(
		MiicSafeguardGoodAdd miicSafeguardGoodAdd) {

		return getPersistence().update(miicSafeguardGoodAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MiicSafeguardGoodAdd update(
		MiicSafeguardGoodAdd miicSafeguardGoodAdd,
		ServiceContext serviceContext) {

		return getPersistence().update(miicSafeguardGoodAdd, serviceContext);
	}

	/**
	 * Returns all the miic safeguard good adds where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic safeguard good adds
	 */
	public static List<MiicSafeguardGoodAdd> findBygetMiicById(
		long miicApplicationId) {

		return getPersistence().findBygetMiicById(miicApplicationId);
	}

	/**
	 * Returns a range of all the miic safeguard good adds where miicApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardGoodAddModelImpl</code>.
	 * </p>
	 *
	 * @param miicApplicationId the miic application ID
	 * @param start the lower bound of the range of miic safeguard good adds
	 * @param end the upper bound of the range of miic safeguard good adds (not inclusive)
	 * @return the range of matching miic safeguard good adds
	 */
	public static List<MiicSafeguardGoodAdd> findBygetMiicById(
		long miicApplicationId, int start, int end) {

		return getPersistence().findBygetMiicById(
			miicApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the miic safeguard good adds where miicApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardGoodAddModelImpl</code>.
	 * </p>
	 *
	 * @param miicApplicationId the miic application ID
	 * @param start the lower bound of the range of miic safeguard good adds
	 * @param end the upper bound of the range of miic safeguard good adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic safeguard good adds
	 */
	public static List<MiicSafeguardGoodAdd> findBygetMiicById(
		long miicApplicationId, int start, int end,
		OrderByComparator<MiicSafeguardGoodAdd> orderByComparator) {

		return getPersistence().findBygetMiicById(
			miicApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the miic safeguard good adds where miicApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardGoodAddModelImpl</code>.
	 * </p>
	 *
	 * @param miicApplicationId the miic application ID
	 * @param start the lower bound of the range of miic safeguard good adds
	 * @param end the upper bound of the range of miic safeguard good adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic safeguard good adds
	 */
	public static List<MiicSafeguardGoodAdd> findBygetMiicById(
		long miicApplicationId, int start, int end,
		OrderByComparator<MiicSafeguardGoodAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMiicById(
			miicApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first miic safeguard good add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic safeguard good add
	 * @throws NoSuchMiicSafeguardGoodAddException if a matching miic safeguard good add could not be found
	 */
	public static MiicSafeguardGoodAdd findBygetMiicById_First(
			long miicApplicationId,
			OrderByComparator<MiicSafeguardGoodAdd> orderByComparator)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicSafeguardGoodAddException {

		return getPersistence().findBygetMiicById_First(
			miicApplicationId, orderByComparator);
	}

	/**
	 * Returns the first miic safeguard good add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic safeguard good add, or <code>null</code> if a matching miic safeguard good add could not be found
	 */
	public static MiicSafeguardGoodAdd fetchBygetMiicById_First(
		long miicApplicationId,
		OrderByComparator<MiicSafeguardGoodAdd> orderByComparator) {

		return getPersistence().fetchBygetMiicById_First(
			miicApplicationId, orderByComparator);
	}

	/**
	 * Returns the last miic safeguard good add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic safeguard good add
	 * @throws NoSuchMiicSafeguardGoodAddException if a matching miic safeguard good add could not be found
	 */
	public static MiicSafeguardGoodAdd findBygetMiicById_Last(
			long miicApplicationId,
			OrderByComparator<MiicSafeguardGoodAdd> orderByComparator)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicSafeguardGoodAddException {

		return getPersistence().findBygetMiicById_Last(
			miicApplicationId, orderByComparator);
	}

	/**
	 * Returns the last miic safeguard good add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic safeguard good add, or <code>null</code> if a matching miic safeguard good add could not be found
	 */
	public static MiicSafeguardGoodAdd fetchBygetMiicById_Last(
		long miicApplicationId,
		OrderByComparator<MiicSafeguardGoodAdd> orderByComparator) {

		return getPersistence().fetchBygetMiicById_Last(
			miicApplicationId, orderByComparator);
	}

	/**
	 * Returns the miic safeguard good adds before and after the current miic safeguard good add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicSafeguardGoodAddId the primary key of the current miic safeguard good add
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic safeguard good add
	 * @throws NoSuchMiicSafeguardGoodAddException if a miic safeguard good add with the primary key could not be found
	 */
	public static MiicSafeguardGoodAdd[] findBygetMiicById_PrevAndNext(
			long miicSafeguardGoodAddId, long miicApplicationId,
			OrderByComparator<MiicSafeguardGoodAdd> orderByComparator)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicSafeguardGoodAddException {

		return getPersistence().findBygetMiicById_PrevAndNext(
			miicSafeguardGoodAddId, miicApplicationId, orderByComparator);
	}

	/**
	 * Removes all the miic safeguard good adds where miicApplicationId = &#63; from the database.
	 *
	 * @param miicApplicationId the miic application ID
	 */
	public static void removeBygetMiicById(long miicApplicationId) {
		getPersistence().removeBygetMiicById(miicApplicationId);
	}

	/**
	 * Returns the number of miic safeguard good adds where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the number of matching miic safeguard good adds
	 */
	public static int countBygetMiicById(long miicApplicationId) {
		return getPersistence().countBygetMiicById(miicApplicationId);
	}

	/**
	 * Caches the miic safeguard good add in the entity cache if it is enabled.
	 *
	 * @param miicSafeguardGoodAdd the miic safeguard good add
	 */
	public static void cacheResult(MiicSafeguardGoodAdd miicSafeguardGoodAdd) {
		getPersistence().cacheResult(miicSafeguardGoodAdd);
	}

	/**
	 * Caches the miic safeguard good adds in the entity cache if it is enabled.
	 *
	 * @param miicSafeguardGoodAdds the miic safeguard good adds
	 */
	public static void cacheResult(
		List<MiicSafeguardGoodAdd> miicSafeguardGoodAdds) {

		getPersistence().cacheResult(miicSafeguardGoodAdds);
	}

	/**
	 * Creates a new miic safeguard good add with the primary key. Does not add the miic safeguard good add to the database.
	 *
	 * @param miicSafeguardGoodAddId the primary key for the new miic safeguard good add
	 * @return the new miic safeguard good add
	 */
	public static MiicSafeguardGoodAdd create(long miicSafeguardGoodAddId) {
		return getPersistence().create(miicSafeguardGoodAddId);
	}

	/**
	 * Removes the miic safeguard good add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicSafeguardGoodAddId the primary key of the miic safeguard good add
	 * @return the miic safeguard good add that was removed
	 * @throws NoSuchMiicSafeguardGoodAddException if a miic safeguard good add with the primary key could not be found
	 */
	public static MiicSafeguardGoodAdd remove(long miicSafeguardGoodAddId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicSafeguardGoodAddException {

		return getPersistence().remove(miicSafeguardGoodAddId);
	}

	public static MiicSafeguardGoodAdd updateImpl(
		MiicSafeguardGoodAdd miicSafeguardGoodAdd) {

		return getPersistence().updateImpl(miicSafeguardGoodAdd);
	}

	/**
	 * Returns the miic safeguard good add with the primary key or throws a <code>NoSuchMiicSafeguardGoodAddException</code> if it could not be found.
	 *
	 * @param miicSafeguardGoodAddId the primary key of the miic safeguard good add
	 * @return the miic safeguard good add
	 * @throws NoSuchMiicSafeguardGoodAddException if a miic safeguard good add with the primary key could not be found
	 */
	public static MiicSafeguardGoodAdd findByPrimaryKey(
			long miicSafeguardGoodAddId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicSafeguardGoodAddException {

		return getPersistence().findByPrimaryKey(miicSafeguardGoodAddId);
	}

	/**
	 * Returns the miic safeguard good add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicSafeguardGoodAddId the primary key of the miic safeguard good add
	 * @return the miic safeguard good add, or <code>null</code> if a miic safeguard good add with the primary key could not be found
	 */
	public static MiicSafeguardGoodAdd fetchByPrimaryKey(
		long miicSafeguardGoodAddId) {

		return getPersistence().fetchByPrimaryKey(miicSafeguardGoodAddId);
	}

	/**
	 * Returns all the miic safeguard good adds.
	 *
	 * @return the miic safeguard good adds
	 */
	public static List<MiicSafeguardGoodAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the miic safeguard good adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardGoodAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic safeguard good adds
	 * @param end the upper bound of the range of miic safeguard good adds (not inclusive)
	 * @return the range of miic safeguard good adds
	 */
	public static List<MiicSafeguardGoodAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the miic safeguard good adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardGoodAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic safeguard good adds
	 * @param end the upper bound of the range of miic safeguard good adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic safeguard good adds
	 */
	public static List<MiicSafeguardGoodAdd> findAll(
		int start, int end,
		OrderByComparator<MiicSafeguardGoodAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the miic safeguard good adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSafeguardGoodAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic safeguard good adds
	 * @param end the upper bound of the range of miic safeguard good adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic safeguard good adds
	 */
	public static List<MiicSafeguardGoodAdd> findAll(
		int start, int end,
		OrderByComparator<MiicSafeguardGoodAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the miic safeguard good adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of miic safeguard good adds.
	 *
	 * @return the number of miic safeguard good adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MiicSafeguardGoodAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MiicSafeguardGoodAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MiicSafeguardGoodAddPersistence _persistence;

}