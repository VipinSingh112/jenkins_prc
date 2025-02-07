/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.PreferredCreditor;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the preferred creditor service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.PreferredCreditorPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PreferredCreditorPersistence
 * @generated
 */
public class PreferredCreditorUtil {

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
	public static void clearCache(PreferredCreditor preferredCreditor) {
		getPersistence().clearCache(preferredCreditor);
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
	public static Map<Serializable, PreferredCreditor> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PreferredCreditor> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PreferredCreditor> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PreferredCreditor> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PreferredCreditor> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PreferredCreditor update(
		PreferredCreditor preferredCreditor) {

		return getPersistence().update(preferredCreditor);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PreferredCreditor update(
		PreferredCreditor preferredCreditor, ServiceContext serviceContext) {

		return getPersistence().update(preferredCreditor, serviceContext);
	}

	/**
	 * Returns all the preferred creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching preferred creditors
	 */
	public static List<PreferredCreditor> findBygetOsiById(
		long osiInsolvencyId) {

		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns a range of all the preferred creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PreferredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of preferred creditors
	 * @param end the upper bound of the range of preferred creditors (not inclusive)
	 * @return the range of matching preferred creditors
	 */
	public static List<PreferredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return getPersistence().findBygetOsiById(osiInsolvencyId, start, end);
	}

	/**
	 * Returns an ordered range of all the preferred creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PreferredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of preferred creditors
	 * @param end the upper bound of the range of preferred creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching preferred creditors
	 */
	public static List<PreferredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<PreferredCreditor> orderByComparator) {

		return getPersistence().findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the preferred creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PreferredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of preferred creditors
	 * @param end the upper bound of the range of preferred creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching preferred creditors
	 */
	public static List<PreferredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<PreferredCreditor> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first preferred creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching preferred creditor
	 * @throws NoSuchPreferredCreditorException if a matching preferred creditor could not be found
	 */
	public static PreferredCreditor findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<PreferredCreditor> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchPreferredCreditorException {

		return getPersistence().findBygetOsiById_First(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the first preferred creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching preferred creditor, or <code>null</code> if a matching preferred creditor could not be found
	 */
	public static PreferredCreditor fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<PreferredCreditor> orderByComparator) {

		return getPersistence().fetchBygetOsiById_First(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last preferred creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching preferred creditor
	 * @throws NoSuchPreferredCreditorException if a matching preferred creditor could not be found
	 */
	public static PreferredCreditor findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<PreferredCreditor> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchPreferredCreditorException {

		return getPersistence().findBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last preferred creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching preferred creditor, or <code>null</code> if a matching preferred creditor could not be found
	 */
	public static PreferredCreditor fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<PreferredCreditor> orderByComparator) {

		return getPersistence().fetchBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the preferred creditors before and after the current preferred creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param preferredCreditorId the primary key of the current preferred creditor
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next preferred creditor
	 * @throws NoSuchPreferredCreditorException if a preferred creditor with the primary key could not be found
	 */
	public static PreferredCreditor[] findBygetOsiById_PrevAndNext(
			long preferredCreditorId, long osiInsolvencyId,
			OrderByComparator<PreferredCreditor> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchPreferredCreditorException {

		return getPersistence().findBygetOsiById_PrevAndNext(
			preferredCreditorId, osiInsolvencyId, orderByComparator);
	}

	/**
	 * Removes all the preferred creditors where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public static void removeBygetOsiById(long osiInsolvencyId) {
		getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of preferred creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching preferred creditors
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the preferred creditor in the entity cache if it is enabled.
	 *
	 * @param preferredCreditor the preferred creditor
	 */
	public static void cacheResult(PreferredCreditor preferredCreditor) {
		getPersistence().cacheResult(preferredCreditor);
	}

	/**
	 * Caches the preferred creditors in the entity cache if it is enabled.
	 *
	 * @param preferredCreditors the preferred creditors
	 */
	public static void cacheResult(List<PreferredCreditor> preferredCreditors) {
		getPersistence().cacheResult(preferredCreditors);
	}

	/**
	 * Creates a new preferred creditor with the primary key. Does not add the preferred creditor to the database.
	 *
	 * @param preferredCreditorId the primary key for the new preferred creditor
	 * @return the new preferred creditor
	 */
	public static PreferredCreditor create(long preferredCreditorId) {
		return getPersistence().create(preferredCreditorId);
	}

	/**
	 * Removes the preferred creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param preferredCreditorId the primary key of the preferred creditor
	 * @return the preferred creditor that was removed
	 * @throws NoSuchPreferredCreditorException if a preferred creditor with the primary key could not be found
	 */
	public static PreferredCreditor remove(long preferredCreditorId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchPreferredCreditorException {

		return getPersistence().remove(preferredCreditorId);
	}

	public static PreferredCreditor updateImpl(
		PreferredCreditor preferredCreditor) {

		return getPersistence().updateImpl(preferredCreditor);
	}

	/**
	 * Returns the preferred creditor with the primary key or throws a <code>NoSuchPreferredCreditorException</code> if it could not be found.
	 *
	 * @param preferredCreditorId the primary key of the preferred creditor
	 * @return the preferred creditor
	 * @throws NoSuchPreferredCreditorException if a preferred creditor with the primary key could not be found
	 */
	public static PreferredCreditor findByPrimaryKey(long preferredCreditorId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchPreferredCreditorException {

		return getPersistence().findByPrimaryKey(preferredCreditorId);
	}

	/**
	 * Returns the preferred creditor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param preferredCreditorId the primary key of the preferred creditor
	 * @return the preferred creditor, or <code>null</code> if a preferred creditor with the primary key could not be found
	 */
	public static PreferredCreditor fetchByPrimaryKey(
		long preferredCreditorId) {

		return getPersistence().fetchByPrimaryKey(preferredCreditorId);
	}

	/**
	 * Returns all the preferred creditors.
	 *
	 * @return the preferred creditors
	 */
	public static List<PreferredCreditor> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the preferred creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PreferredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of preferred creditors
	 * @param end the upper bound of the range of preferred creditors (not inclusive)
	 * @return the range of preferred creditors
	 */
	public static List<PreferredCreditor> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the preferred creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PreferredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of preferred creditors
	 * @param end the upper bound of the range of preferred creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of preferred creditors
	 */
	public static List<PreferredCreditor> findAll(
		int start, int end,
		OrderByComparator<PreferredCreditor> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the preferred creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PreferredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of preferred creditors
	 * @param end the upper bound of the range of preferred creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of preferred creditors
	 */
	public static List<PreferredCreditor> findAll(
		int start, int end,
		OrderByComparator<PreferredCreditor> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the preferred creditors from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of preferred creditors.
	 *
	 * @return the number of preferred creditors
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PreferredCreditorPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		PreferredCreditorPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile PreferredCreditorPersistence _persistence;

}