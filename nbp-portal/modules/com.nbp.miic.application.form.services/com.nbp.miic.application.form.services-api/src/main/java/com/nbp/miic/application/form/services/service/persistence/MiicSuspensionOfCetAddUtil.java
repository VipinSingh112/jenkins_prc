/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the miic suspension of cet add service. This utility wraps <code>com.nbp.miic.application.form.services.service.persistence.impl.MiicSuspensionOfCetAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicSuspensionOfCetAddPersistence
 * @generated
 */
public class MiicSuspensionOfCetAddUtil {

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
		MiicSuspensionOfCetAdd miicSuspensionOfCetAdd) {

		getPersistence().clearCache(miicSuspensionOfCetAdd);
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
	public static Map<Serializable, MiicSuspensionOfCetAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MiicSuspensionOfCetAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MiicSuspensionOfCetAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MiicSuspensionOfCetAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MiicSuspensionOfCetAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MiicSuspensionOfCetAdd update(
		MiicSuspensionOfCetAdd miicSuspensionOfCetAdd) {

		return getPersistence().update(miicSuspensionOfCetAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MiicSuspensionOfCetAdd update(
		MiicSuspensionOfCetAdd miicSuspensionOfCetAdd,
		ServiceContext serviceContext) {

		return getPersistence().update(miicSuspensionOfCetAdd, serviceContext);
	}

	/**
	 * Returns all the miic suspension of cet adds where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic suspension of cet adds
	 */
	public static List<MiicSuspensionOfCetAdd> findBygetMiicById(
		long miicApplicationId) {

		return getPersistence().findBygetMiicById(miicApplicationId);
	}

	/**
	 * Returns a range of all the miic suspension of cet adds where miicApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetAddModelImpl</code>.
	 * </p>
	 *
	 * @param miicApplicationId the miic application ID
	 * @param start the lower bound of the range of miic suspension of cet adds
	 * @param end the upper bound of the range of miic suspension of cet adds (not inclusive)
	 * @return the range of matching miic suspension of cet adds
	 */
	public static List<MiicSuspensionOfCetAdd> findBygetMiicById(
		long miicApplicationId, int start, int end) {

		return getPersistence().findBygetMiicById(
			miicApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the miic suspension of cet adds where miicApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetAddModelImpl</code>.
	 * </p>
	 *
	 * @param miicApplicationId the miic application ID
	 * @param start the lower bound of the range of miic suspension of cet adds
	 * @param end the upper bound of the range of miic suspension of cet adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic suspension of cet adds
	 */
	public static List<MiicSuspensionOfCetAdd> findBygetMiicById(
		long miicApplicationId, int start, int end,
		OrderByComparator<MiicSuspensionOfCetAdd> orderByComparator) {

		return getPersistence().findBygetMiicById(
			miicApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the miic suspension of cet adds where miicApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetAddModelImpl</code>.
	 * </p>
	 *
	 * @param miicApplicationId the miic application ID
	 * @param start the lower bound of the range of miic suspension of cet adds
	 * @param end the upper bound of the range of miic suspension of cet adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic suspension of cet adds
	 */
	public static List<MiicSuspensionOfCetAdd> findBygetMiicById(
		long miicApplicationId, int start, int end,
		OrderByComparator<MiicSuspensionOfCetAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMiicById(
			miicApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first miic suspension of cet add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic suspension of cet add
	 * @throws NoSuchMiicSuspensionOfCetAddException if a matching miic suspension of cet add could not be found
	 */
	public static MiicSuspensionOfCetAdd findBygetMiicById_First(
			long miicApplicationId,
			OrderByComparator<MiicSuspensionOfCetAdd> orderByComparator)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicSuspensionOfCetAddException {

		return getPersistence().findBygetMiicById_First(
			miicApplicationId, orderByComparator);
	}

	/**
	 * Returns the first miic suspension of cet add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic suspension of cet add, or <code>null</code> if a matching miic suspension of cet add could not be found
	 */
	public static MiicSuspensionOfCetAdd fetchBygetMiicById_First(
		long miicApplicationId,
		OrderByComparator<MiicSuspensionOfCetAdd> orderByComparator) {

		return getPersistence().fetchBygetMiicById_First(
			miicApplicationId, orderByComparator);
	}

	/**
	 * Returns the last miic suspension of cet add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic suspension of cet add
	 * @throws NoSuchMiicSuspensionOfCetAddException if a matching miic suspension of cet add could not be found
	 */
	public static MiicSuspensionOfCetAdd findBygetMiicById_Last(
			long miicApplicationId,
			OrderByComparator<MiicSuspensionOfCetAdd> orderByComparator)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicSuspensionOfCetAddException {

		return getPersistence().findBygetMiicById_Last(
			miicApplicationId, orderByComparator);
	}

	/**
	 * Returns the last miic suspension of cet add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic suspension of cet add, or <code>null</code> if a matching miic suspension of cet add could not be found
	 */
	public static MiicSuspensionOfCetAdd fetchBygetMiicById_Last(
		long miicApplicationId,
		OrderByComparator<MiicSuspensionOfCetAdd> orderByComparator) {

		return getPersistence().fetchBygetMiicById_Last(
			miicApplicationId, orderByComparator);
	}

	/**
	 * Returns the miic suspension of cet adds before and after the current miic suspension of cet add in the ordered set where miicApplicationId = &#63;.
	 *
	 * @param miicSuspensionOfCetAddId the primary key of the current miic suspension of cet add
	 * @param miicApplicationId the miic application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic suspension of cet add
	 * @throws NoSuchMiicSuspensionOfCetAddException if a miic suspension of cet add with the primary key could not be found
	 */
	public static MiicSuspensionOfCetAdd[] findBygetMiicById_PrevAndNext(
			long miicSuspensionOfCetAddId, long miicApplicationId,
			OrderByComparator<MiicSuspensionOfCetAdd> orderByComparator)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicSuspensionOfCetAddException {

		return getPersistence().findBygetMiicById_PrevAndNext(
			miicSuspensionOfCetAddId, miicApplicationId, orderByComparator);
	}

	/**
	 * Removes all the miic suspension of cet adds where miicApplicationId = &#63; from the database.
	 *
	 * @param miicApplicationId the miic application ID
	 */
	public static void removeBygetMiicById(long miicApplicationId) {
		getPersistence().removeBygetMiicById(miicApplicationId);
	}

	/**
	 * Returns the number of miic suspension of cet adds where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the number of matching miic suspension of cet adds
	 */
	public static int countBygetMiicById(long miicApplicationId) {
		return getPersistence().countBygetMiicById(miicApplicationId);
	}

	/**
	 * Caches the miic suspension of cet add in the entity cache if it is enabled.
	 *
	 * @param miicSuspensionOfCetAdd the miic suspension of cet add
	 */
	public static void cacheResult(
		MiicSuspensionOfCetAdd miicSuspensionOfCetAdd) {

		getPersistence().cacheResult(miicSuspensionOfCetAdd);
	}

	/**
	 * Caches the miic suspension of cet adds in the entity cache if it is enabled.
	 *
	 * @param miicSuspensionOfCetAdds the miic suspension of cet adds
	 */
	public static void cacheResult(
		List<MiicSuspensionOfCetAdd> miicSuspensionOfCetAdds) {

		getPersistence().cacheResult(miicSuspensionOfCetAdds);
	}

	/**
	 * Creates a new miic suspension of cet add with the primary key. Does not add the miic suspension of cet add to the database.
	 *
	 * @param miicSuspensionOfCetAddId the primary key for the new miic suspension of cet add
	 * @return the new miic suspension of cet add
	 */
	public static MiicSuspensionOfCetAdd create(long miicSuspensionOfCetAddId) {
		return getPersistence().create(miicSuspensionOfCetAddId);
	}

	/**
	 * Removes the miic suspension of cet add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicSuspensionOfCetAddId the primary key of the miic suspension of cet add
	 * @return the miic suspension of cet add that was removed
	 * @throws NoSuchMiicSuspensionOfCetAddException if a miic suspension of cet add with the primary key could not be found
	 */
	public static MiicSuspensionOfCetAdd remove(long miicSuspensionOfCetAddId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicSuspensionOfCetAddException {

		return getPersistence().remove(miicSuspensionOfCetAddId);
	}

	public static MiicSuspensionOfCetAdd updateImpl(
		MiicSuspensionOfCetAdd miicSuspensionOfCetAdd) {

		return getPersistence().updateImpl(miicSuspensionOfCetAdd);
	}

	/**
	 * Returns the miic suspension of cet add with the primary key or throws a <code>NoSuchMiicSuspensionOfCetAddException</code> if it could not be found.
	 *
	 * @param miicSuspensionOfCetAddId the primary key of the miic suspension of cet add
	 * @return the miic suspension of cet add
	 * @throws NoSuchMiicSuspensionOfCetAddException if a miic suspension of cet add with the primary key could not be found
	 */
	public static MiicSuspensionOfCetAdd findByPrimaryKey(
			long miicSuspensionOfCetAddId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicSuspensionOfCetAddException {

		return getPersistence().findByPrimaryKey(miicSuspensionOfCetAddId);
	}

	/**
	 * Returns the miic suspension of cet add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicSuspensionOfCetAddId the primary key of the miic suspension of cet add
	 * @return the miic suspension of cet add, or <code>null</code> if a miic suspension of cet add with the primary key could not be found
	 */
	public static MiicSuspensionOfCetAdd fetchByPrimaryKey(
		long miicSuspensionOfCetAddId) {

		return getPersistence().fetchByPrimaryKey(miicSuspensionOfCetAddId);
	}

	/**
	 * Returns all the miic suspension of cet adds.
	 *
	 * @return the miic suspension of cet adds
	 */
	public static List<MiicSuspensionOfCetAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the miic suspension of cet adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic suspension of cet adds
	 * @param end the upper bound of the range of miic suspension of cet adds (not inclusive)
	 * @return the range of miic suspension of cet adds
	 */
	public static List<MiicSuspensionOfCetAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the miic suspension of cet adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic suspension of cet adds
	 * @param end the upper bound of the range of miic suspension of cet adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic suspension of cet adds
	 */
	public static List<MiicSuspensionOfCetAdd> findAll(
		int start, int end,
		OrderByComparator<MiicSuspensionOfCetAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the miic suspension of cet adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicSuspensionOfCetAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic suspension of cet adds
	 * @param end the upper bound of the range of miic suspension of cet adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic suspension of cet adds
	 */
	public static List<MiicSuspensionOfCetAdd> findAll(
		int start, int end,
		OrderByComparator<MiicSuspensionOfCetAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the miic suspension of cet adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of miic suspension of cet adds.
	 *
	 * @return the number of miic suspension of cet adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MiicSuspensionOfCetAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MiicSuspensionOfCetAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MiicSuspensionOfCetAddPersistence _persistence;

}