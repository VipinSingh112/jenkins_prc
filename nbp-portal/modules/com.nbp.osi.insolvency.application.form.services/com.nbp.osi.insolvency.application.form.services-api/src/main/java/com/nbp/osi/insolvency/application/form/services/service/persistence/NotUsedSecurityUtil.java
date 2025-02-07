/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.NotUsedSecurity;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the not used security service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.NotUsedSecurityPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NotUsedSecurityPersistence
 * @generated
 */
public class NotUsedSecurityUtil {

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
	public static void clearCache(NotUsedSecurity notUsedSecurity) {
		getPersistence().clearCache(notUsedSecurity);
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
	public static Map<Serializable, NotUsedSecurity> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NotUsedSecurity> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NotUsedSecurity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NotUsedSecurity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NotUsedSecurity> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NotUsedSecurity update(NotUsedSecurity notUsedSecurity) {
		return getPersistence().update(notUsedSecurity);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NotUsedSecurity update(
		NotUsedSecurity notUsedSecurity, ServiceContext serviceContext) {

		return getPersistence().update(notUsedSecurity, serviceContext);
	}

	/**
	 * Returns all the not used securities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching not used securities
	 */
	public static List<NotUsedSecurity> findBygetOsiById(long osiInsolvencyId) {
		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns a range of all the not used securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotUsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of not used securities
	 * @param end the upper bound of the range of not used securities (not inclusive)
	 * @return the range of matching not used securities
	 */
	public static List<NotUsedSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return getPersistence().findBygetOsiById(osiInsolvencyId, start, end);
	}

	/**
	 * Returns an ordered range of all the not used securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotUsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of not used securities
	 * @param end the upper bound of the range of not used securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching not used securities
	 */
	public static List<NotUsedSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<NotUsedSecurity> orderByComparator) {

		return getPersistence().findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the not used securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotUsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of not used securities
	 * @param end the upper bound of the range of not used securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching not used securities
	 */
	public static List<NotUsedSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<NotUsedSecurity> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first not used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching not used security
	 * @throws NoSuchNotUsedSecurityException if a matching not used security could not be found
	 */
	public static NotUsedSecurity findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<NotUsedSecurity> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchNotUsedSecurityException {

		return getPersistence().findBygetOsiById_First(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the first not used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching not used security, or <code>null</code> if a matching not used security could not be found
	 */
	public static NotUsedSecurity fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<NotUsedSecurity> orderByComparator) {

		return getPersistence().fetchBygetOsiById_First(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last not used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching not used security
	 * @throws NoSuchNotUsedSecurityException if a matching not used security could not be found
	 */
	public static NotUsedSecurity findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<NotUsedSecurity> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchNotUsedSecurityException {

		return getPersistence().findBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last not used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching not used security, or <code>null</code> if a matching not used security could not be found
	 */
	public static NotUsedSecurity fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<NotUsedSecurity> orderByComparator) {

		return getPersistence().fetchBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the not used securities before and after the current not used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param notUsedSecurityId the primary key of the current not used security
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next not used security
	 * @throws NoSuchNotUsedSecurityException if a not used security with the primary key could not be found
	 */
	public static NotUsedSecurity[] findBygetOsiById_PrevAndNext(
			long notUsedSecurityId, long osiInsolvencyId,
			OrderByComparator<NotUsedSecurity> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchNotUsedSecurityException {

		return getPersistence().findBygetOsiById_PrevAndNext(
			notUsedSecurityId, osiInsolvencyId, orderByComparator);
	}

	/**
	 * Removes all the not used securities where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public static void removeBygetOsiById(long osiInsolvencyId) {
		getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of not used securities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching not used securities
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the not used security in the entity cache if it is enabled.
	 *
	 * @param notUsedSecurity the not used security
	 */
	public static void cacheResult(NotUsedSecurity notUsedSecurity) {
		getPersistence().cacheResult(notUsedSecurity);
	}

	/**
	 * Caches the not used securities in the entity cache if it is enabled.
	 *
	 * @param notUsedSecurities the not used securities
	 */
	public static void cacheResult(List<NotUsedSecurity> notUsedSecurities) {
		getPersistence().cacheResult(notUsedSecurities);
	}

	/**
	 * Creates a new not used security with the primary key. Does not add the not used security to the database.
	 *
	 * @param notUsedSecurityId the primary key for the new not used security
	 * @return the new not used security
	 */
	public static NotUsedSecurity create(long notUsedSecurityId) {
		return getPersistence().create(notUsedSecurityId);
	}

	/**
	 * Removes the not used security with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param notUsedSecurityId the primary key of the not used security
	 * @return the not used security that was removed
	 * @throws NoSuchNotUsedSecurityException if a not used security with the primary key could not be found
	 */
	public static NotUsedSecurity remove(long notUsedSecurityId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchNotUsedSecurityException {

		return getPersistence().remove(notUsedSecurityId);
	}

	public static NotUsedSecurity updateImpl(NotUsedSecurity notUsedSecurity) {
		return getPersistence().updateImpl(notUsedSecurity);
	}

	/**
	 * Returns the not used security with the primary key or throws a <code>NoSuchNotUsedSecurityException</code> if it could not be found.
	 *
	 * @param notUsedSecurityId the primary key of the not used security
	 * @return the not used security
	 * @throws NoSuchNotUsedSecurityException if a not used security with the primary key could not be found
	 */
	public static NotUsedSecurity findByPrimaryKey(long notUsedSecurityId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchNotUsedSecurityException {

		return getPersistence().findByPrimaryKey(notUsedSecurityId);
	}

	/**
	 * Returns the not used security with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param notUsedSecurityId the primary key of the not used security
	 * @return the not used security, or <code>null</code> if a not used security with the primary key could not be found
	 */
	public static NotUsedSecurity fetchByPrimaryKey(long notUsedSecurityId) {
		return getPersistence().fetchByPrimaryKey(notUsedSecurityId);
	}

	/**
	 * Returns all the not used securities.
	 *
	 * @return the not used securities
	 */
	public static List<NotUsedSecurity> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the not used securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotUsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of not used securities
	 * @param end the upper bound of the range of not used securities (not inclusive)
	 * @return the range of not used securities
	 */
	public static List<NotUsedSecurity> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the not used securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotUsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of not used securities
	 * @param end the upper bound of the range of not used securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of not used securities
	 */
	public static List<NotUsedSecurity> findAll(
		int start, int end,
		OrderByComparator<NotUsedSecurity> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the not used securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotUsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of not used securities
	 * @param end the upper bound of the range of not used securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of not used securities
	 */
	public static List<NotUsedSecurity> findAll(
		int start, int end,
		OrderByComparator<NotUsedSecurity> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the not used securities from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of not used securities.
	 *
	 * @return the number of not used securities
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NotUsedSecurityPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(NotUsedSecurityPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile NotUsedSecurityPersistence _persistence;

}