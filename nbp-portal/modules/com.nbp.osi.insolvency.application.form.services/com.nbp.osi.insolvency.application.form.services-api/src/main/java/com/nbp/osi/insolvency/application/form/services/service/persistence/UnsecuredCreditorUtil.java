/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.UnsecuredCreditor;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the unsecured creditor service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.UnsecuredCreditorPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UnsecuredCreditorPersistence
 * @generated
 */
public class UnsecuredCreditorUtil {

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
	public static void clearCache(UnsecuredCreditor unsecuredCreditor) {
		getPersistence().clearCache(unsecuredCreditor);
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
	public static Map<Serializable, UnsecuredCreditor> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<UnsecuredCreditor> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UnsecuredCreditor> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UnsecuredCreditor> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<UnsecuredCreditor> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static UnsecuredCreditor update(
		UnsecuredCreditor unsecuredCreditor) {

		return getPersistence().update(unsecuredCreditor);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static UnsecuredCreditor update(
		UnsecuredCreditor unsecuredCreditor, ServiceContext serviceContext) {

		return getPersistence().update(unsecuredCreditor, serviceContext);
	}

	/**
	 * Returns all the unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching unsecured creditors
	 */
	public static List<UnsecuredCreditor> findBygetOsiById(
		long osiInsolvencyId) {

		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns a range of all the unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of unsecured creditors
	 * @param end the upper bound of the range of unsecured creditors (not inclusive)
	 * @return the range of matching unsecured creditors
	 */
	public static List<UnsecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return getPersistence().findBygetOsiById(osiInsolvencyId, start, end);
	}

	/**
	 * Returns an ordered range of all the unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of unsecured creditors
	 * @param end the upper bound of the range of unsecured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching unsecured creditors
	 */
	public static List<UnsecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<UnsecuredCreditor> orderByComparator) {

		return getPersistence().findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of unsecured creditors
	 * @param end the upper bound of the range of unsecured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching unsecured creditors
	 */
	public static List<UnsecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<UnsecuredCreditor> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching unsecured creditor
	 * @throws NoSuchUnsecuredCreditorException if a matching unsecured creditor could not be found
	 */
	public static UnsecuredCreditor findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<UnsecuredCreditor> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchUnsecuredCreditorException {

		return getPersistence().findBygetOsiById_First(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the first unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching unsecured creditor, or <code>null</code> if a matching unsecured creditor could not be found
	 */
	public static UnsecuredCreditor fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<UnsecuredCreditor> orderByComparator) {

		return getPersistence().fetchBygetOsiById_First(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching unsecured creditor
	 * @throws NoSuchUnsecuredCreditorException if a matching unsecured creditor could not be found
	 */
	public static UnsecuredCreditor findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<UnsecuredCreditor> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchUnsecuredCreditorException {

		return getPersistence().findBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching unsecured creditor, or <code>null</code> if a matching unsecured creditor could not be found
	 */
	public static UnsecuredCreditor fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<UnsecuredCreditor> orderByComparator) {

		return getPersistence().fetchBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the unsecured creditors before and after the current unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param unsecuredCreditorId the primary key of the current unsecured creditor
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next unsecured creditor
	 * @throws NoSuchUnsecuredCreditorException if a unsecured creditor with the primary key could not be found
	 */
	public static UnsecuredCreditor[] findBygetOsiById_PrevAndNext(
			long unsecuredCreditorId, long osiInsolvencyId,
			OrderByComparator<UnsecuredCreditor> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchUnsecuredCreditorException {

		return getPersistence().findBygetOsiById_PrevAndNext(
			unsecuredCreditorId, osiInsolvencyId, orderByComparator);
	}

	/**
	 * Removes all the unsecured creditors where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public static void removeBygetOsiById(long osiInsolvencyId) {
		getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching unsecured creditors
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the unsecured creditor in the entity cache if it is enabled.
	 *
	 * @param unsecuredCreditor the unsecured creditor
	 */
	public static void cacheResult(UnsecuredCreditor unsecuredCreditor) {
		getPersistence().cacheResult(unsecuredCreditor);
	}

	/**
	 * Caches the unsecured creditors in the entity cache if it is enabled.
	 *
	 * @param unsecuredCreditors the unsecured creditors
	 */
	public static void cacheResult(List<UnsecuredCreditor> unsecuredCreditors) {
		getPersistence().cacheResult(unsecuredCreditors);
	}

	/**
	 * Creates a new unsecured creditor with the primary key. Does not add the unsecured creditor to the database.
	 *
	 * @param unsecuredCreditorId the primary key for the new unsecured creditor
	 * @return the new unsecured creditor
	 */
	public static UnsecuredCreditor create(long unsecuredCreditorId) {
		return getPersistence().create(unsecuredCreditorId);
	}

	/**
	 * Removes the unsecured creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param unsecuredCreditorId the primary key of the unsecured creditor
	 * @return the unsecured creditor that was removed
	 * @throws NoSuchUnsecuredCreditorException if a unsecured creditor with the primary key could not be found
	 */
	public static UnsecuredCreditor remove(long unsecuredCreditorId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchUnsecuredCreditorException {

		return getPersistence().remove(unsecuredCreditorId);
	}

	public static UnsecuredCreditor updateImpl(
		UnsecuredCreditor unsecuredCreditor) {

		return getPersistence().updateImpl(unsecuredCreditor);
	}

	/**
	 * Returns the unsecured creditor with the primary key or throws a <code>NoSuchUnsecuredCreditorException</code> if it could not be found.
	 *
	 * @param unsecuredCreditorId the primary key of the unsecured creditor
	 * @return the unsecured creditor
	 * @throws NoSuchUnsecuredCreditorException if a unsecured creditor with the primary key could not be found
	 */
	public static UnsecuredCreditor findByPrimaryKey(long unsecuredCreditorId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchUnsecuredCreditorException {

		return getPersistence().findByPrimaryKey(unsecuredCreditorId);
	}

	/**
	 * Returns the unsecured creditor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param unsecuredCreditorId the primary key of the unsecured creditor
	 * @return the unsecured creditor, or <code>null</code> if a unsecured creditor with the primary key could not be found
	 */
	public static UnsecuredCreditor fetchByPrimaryKey(
		long unsecuredCreditorId) {

		return getPersistence().fetchByPrimaryKey(unsecuredCreditorId);
	}

	/**
	 * Returns all the unsecured creditors.
	 *
	 * @return the unsecured creditors
	 */
	public static List<UnsecuredCreditor> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the unsecured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of unsecured creditors
	 * @param end the upper bound of the range of unsecured creditors (not inclusive)
	 * @return the range of unsecured creditors
	 */
	public static List<UnsecuredCreditor> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the unsecured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of unsecured creditors
	 * @param end the upper bound of the range of unsecured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of unsecured creditors
	 */
	public static List<UnsecuredCreditor> findAll(
		int start, int end,
		OrderByComparator<UnsecuredCreditor> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the unsecured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of unsecured creditors
	 * @param end the upper bound of the range of unsecured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of unsecured creditors
	 */
	public static List<UnsecuredCreditor> findAll(
		int start, int end,
		OrderByComparator<UnsecuredCreditor> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the unsecured creditors from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of unsecured creditors.
	 *
	 * @return the number of unsecured creditors
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static UnsecuredCreditorPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		UnsecuredCreditorPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile UnsecuredCreditorPersistence _persistence;

}