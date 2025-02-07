/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.UsedSecurity;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the used security service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.UsedSecurityPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UsedSecurityPersistence
 * @generated
 */
public class UsedSecurityUtil {

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
	public static void clearCache(UsedSecurity usedSecurity) {
		getPersistence().clearCache(usedSecurity);
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
	public static Map<Serializable, UsedSecurity> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<UsedSecurity> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UsedSecurity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UsedSecurity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<UsedSecurity> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static UsedSecurity update(UsedSecurity usedSecurity) {
		return getPersistence().update(usedSecurity);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static UsedSecurity update(
		UsedSecurity usedSecurity, ServiceContext serviceContext) {

		return getPersistence().update(usedSecurity, serviceContext);
	}

	/**
	 * Returns all the used securities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching used securities
	 */
	public static List<UsedSecurity> findBygetOsiById(long osiInsolvencyId) {
		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns a range of all the used securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of used securities
	 * @param end the upper bound of the range of used securities (not inclusive)
	 * @return the range of matching used securities
	 */
	public static List<UsedSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return getPersistence().findBygetOsiById(osiInsolvencyId, start, end);
	}

	/**
	 * Returns an ordered range of all the used securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of used securities
	 * @param end the upper bound of the range of used securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching used securities
	 */
	public static List<UsedSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<UsedSecurity> orderByComparator) {

		return getPersistence().findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the used securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of used securities
	 * @param end the upper bound of the range of used securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching used securities
	 */
	public static List<UsedSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<UsedSecurity> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching used security
	 * @throws NoSuchUsedSecurityException if a matching used security could not be found
	 */
	public static UsedSecurity findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<UsedSecurity> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchUsedSecurityException {

		return getPersistence().findBygetOsiById_First(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the first used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching used security, or <code>null</code> if a matching used security could not be found
	 */
	public static UsedSecurity fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<UsedSecurity> orderByComparator) {

		return getPersistence().fetchBygetOsiById_First(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching used security
	 * @throws NoSuchUsedSecurityException if a matching used security could not be found
	 */
	public static UsedSecurity findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<UsedSecurity> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchUsedSecurityException {

		return getPersistence().findBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching used security, or <code>null</code> if a matching used security could not be found
	 */
	public static UsedSecurity fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<UsedSecurity> orderByComparator) {

		return getPersistence().fetchBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the used securities before and after the current used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param usedSecurityId the primary key of the current used security
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next used security
	 * @throws NoSuchUsedSecurityException if a used security with the primary key could not be found
	 */
	public static UsedSecurity[] findBygetOsiById_PrevAndNext(
			long usedSecurityId, long osiInsolvencyId,
			OrderByComparator<UsedSecurity> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchUsedSecurityException {

		return getPersistence().findBygetOsiById_PrevAndNext(
			usedSecurityId, osiInsolvencyId, orderByComparator);
	}

	/**
	 * Removes all the used securities where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public static void removeBygetOsiById(long osiInsolvencyId) {
		getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of used securities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching used securities
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the used security in the entity cache if it is enabled.
	 *
	 * @param usedSecurity the used security
	 */
	public static void cacheResult(UsedSecurity usedSecurity) {
		getPersistence().cacheResult(usedSecurity);
	}

	/**
	 * Caches the used securities in the entity cache if it is enabled.
	 *
	 * @param usedSecurities the used securities
	 */
	public static void cacheResult(List<UsedSecurity> usedSecurities) {
		getPersistence().cacheResult(usedSecurities);
	}

	/**
	 * Creates a new used security with the primary key. Does not add the used security to the database.
	 *
	 * @param usedSecurityId the primary key for the new used security
	 * @return the new used security
	 */
	public static UsedSecurity create(long usedSecurityId) {
		return getPersistence().create(usedSecurityId);
	}

	/**
	 * Removes the used security with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param usedSecurityId the primary key of the used security
	 * @return the used security that was removed
	 * @throws NoSuchUsedSecurityException if a used security with the primary key could not be found
	 */
	public static UsedSecurity remove(long usedSecurityId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchUsedSecurityException {

		return getPersistence().remove(usedSecurityId);
	}

	public static UsedSecurity updateImpl(UsedSecurity usedSecurity) {
		return getPersistence().updateImpl(usedSecurity);
	}

	/**
	 * Returns the used security with the primary key or throws a <code>NoSuchUsedSecurityException</code> if it could not be found.
	 *
	 * @param usedSecurityId the primary key of the used security
	 * @return the used security
	 * @throws NoSuchUsedSecurityException if a used security with the primary key could not be found
	 */
	public static UsedSecurity findByPrimaryKey(long usedSecurityId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchUsedSecurityException {

		return getPersistence().findByPrimaryKey(usedSecurityId);
	}

	/**
	 * Returns the used security with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param usedSecurityId the primary key of the used security
	 * @return the used security, or <code>null</code> if a used security with the primary key could not be found
	 */
	public static UsedSecurity fetchByPrimaryKey(long usedSecurityId) {
		return getPersistence().fetchByPrimaryKey(usedSecurityId);
	}

	/**
	 * Returns all the used securities.
	 *
	 * @return the used securities
	 */
	public static List<UsedSecurity> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the used securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of used securities
	 * @param end the upper bound of the range of used securities (not inclusive)
	 * @return the range of used securities
	 */
	public static List<UsedSecurity> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the used securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of used securities
	 * @param end the upper bound of the range of used securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of used securities
	 */
	public static List<UsedSecurity> findAll(
		int start, int end, OrderByComparator<UsedSecurity> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the used securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of used securities
	 * @param end the upper bound of the range of used securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of used securities
	 */
	public static List<UsedSecurity> findAll(
		int start, int end, OrderByComparator<UsedSecurity> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the used securities from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of used securities.
	 *
	 * @return the number of used securities
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static UsedSecurityPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(UsedSecurityPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile UsedSecurityPersistence _persistence;

}