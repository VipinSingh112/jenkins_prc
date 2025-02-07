/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.SecuredCreditor;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the secured creditor service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.SecuredCreditorPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SecuredCreditorPersistence
 * @generated
 */
public class SecuredCreditorUtil {

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
	public static void clearCache(SecuredCreditor securedCreditor) {
		getPersistence().clearCache(securedCreditor);
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
	public static Map<Serializable, SecuredCreditor> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SecuredCreditor> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SecuredCreditor> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SecuredCreditor> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SecuredCreditor> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SecuredCreditor update(SecuredCreditor securedCreditor) {
		return getPersistence().update(securedCreditor);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SecuredCreditor update(
		SecuredCreditor securedCreditor, ServiceContext serviceContext) {

		return getPersistence().update(securedCreditor, serviceContext);
	}

	/**
	 * Returns all the secured creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching secured creditors
	 */
	public static List<SecuredCreditor> findBygetOsiById(long osiInsolvencyId) {
		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns a range of all the secured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of secured creditors
	 * @param end the upper bound of the range of secured creditors (not inclusive)
	 * @return the range of matching secured creditors
	 */
	public static List<SecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return getPersistence().findBygetOsiById(osiInsolvencyId, start, end);
	}

	/**
	 * Returns an ordered range of all the secured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of secured creditors
	 * @param end the upper bound of the range of secured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching secured creditors
	 */
	public static List<SecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<SecuredCreditor> orderByComparator) {

		return getPersistence().findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the secured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of secured creditors
	 * @param end the upper bound of the range of secured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching secured creditors
	 */
	public static List<SecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<SecuredCreditor> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching secured creditor
	 * @throws NoSuchSecuredCreditorException if a matching secured creditor could not be found
	 */
	public static SecuredCreditor findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<SecuredCreditor> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchSecuredCreditorException {

		return getPersistence().findBygetOsiById_First(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the first secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching secured creditor, or <code>null</code> if a matching secured creditor could not be found
	 */
	public static SecuredCreditor fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<SecuredCreditor> orderByComparator) {

		return getPersistence().fetchBygetOsiById_First(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching secured creditor
	 * @throws NoSuchSecuredCreditorException if a matching secured creditor could not be found
	 */
	public static SecuredCreditor findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<SecuredCreditor> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchSecuredCreditorException {

		return getPersistence().findBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching secured creditor, or <code>null</code> if a matching secured creditor could not be found
	 */
	public static SecuredCreditor fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<SecuredCreditor> orderByComparator) {

		return getPersistence().fetchBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the secured creditors before and after the current secured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param securedCreditorId the primary key of the current secured creditor
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next secured creditor
	 * @throws NoSuchSecuredCreditorException if a secured creditor with the primary key could not be found
	 */
	public static SecuredCreditor[] findBygetOsiById_PrevAndNext(
			long securedCreditorId, long osiInsolvencyId,
			OrderByComparator<SecuredCreditor> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchSecuredCreditorException {

		return getPersistence().findBygetOsiById_PrevAndNext(
			securedCreditorId, osiInsolvencyId, orderByComparator);
	}

	/**
	 * Removes all the secured creditors where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public static void removeBygetOsiById(long osiInsolvencyId) {
		getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of secured creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching secured creditors
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the secured creditor in the entity cache if it is enabled.
	 *
	 * @param securedCreditor the secured creditor
	 */
	public static void cacheResult(SecuredCreditor securedCreditor) {
		getPersistence().cacheResult(securedCreditor);
	}

	/**
	 * Caches the secured creditors in the entity cache if it is enabled.
	 *
	 * @param securedCreditors the secured creditors
	 */
	public static void cacheResult(List<SecuredCreditor> securedCreditors) {
		getPersistence().cacheResult(securedCreditors);
	}

	/**
	 * Creates a new secured creditor with the primary key. Does not add the secured creditor to the database.
	 *
	 * @param securedCreditorId the primary key for the new secured creditor
	 * @return the new secured creditor
	 */
	public static SecuredCreditor create(long securedCreditorId) {
		return getPersistence().create(securedCreditorId);
	}

	/**
	 * Removes the secured creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param securedCreditorId the primary key of the secured creditor
	 * @return the secured creditor that was removed
	 * @throws NoSuchSecuredCreditorException if a secured creditor with the primary key could not be found
	 */
	public static SecuredCreditor remove(long securedCreditorId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchSecuredCreditorException {

		return getPersistence().remove(securedCreditorId);
	}

	public static SecuredCreditor updateImpl(SecuredCreditor securedCreditor) {
		return getPersistence().updateImpl(securedCreditor);
	}

	/**
	 * Returns the secured creditor with the primary key or throws a <code>NoSuchSecuredCreditorException</code> if it could not be found.
	 *
	 * @param securedCreditorId the primary key of the secured creditor
	 * @return the secured creditor
	 * @throws NoSuchSecuredCreditorException if a secured creditor with the primary key could not be found
	 */
	public static SecuredCreditor findByPrimaryKey(long securedCreditorId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchSecuredCreditorException {

		return getPersistence().findByPrimaryKey(securedCreditorId);
	}

	/**
	 * Returns the secured creditor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param securedCreditorId the primary key of the secured creditor
	 * @return the secured creditor, or <code>null</code> if a secured creditor with the primary key could not be found
	 */
	public static SecuredCreditor fetchByPrimaryKey(long securedCreditorId) {
		return getPersistence().fetchByPrimaryKey(securedCreditorId);
	}

	/**
	 * Returns all the secured creditors.
	 *
	 * @return the secured creditors
	 */
	public static List<SecuredCreditor> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the secured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of secured creditors
	 * @param end the upper bound of the range of secured creditors (not inclusive)
	 * @return the range of secured creditors
	 */
	public static List<SecuredCreditor> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the secured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of secured creditors
	 * @param end the upper bound of the range of secured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of secured creditors
	 */
	public static List<SecuredCreditor> findAll(
		int start, int end,
		OrderByComparator<SecuredCreditor> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the secured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of secured creditors
	 * @param end the upper bound of the range of secured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of secured creditors
	 */
	public static List<SecuredCreditor> findAll(
		int start, int end,
		OrderByComparator<SecuredCreditor> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the secured creditors from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of secured creditors.
	 *
	 * @return the number of secured creditors
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SecuredCreditorPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(SecuredCreditorPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile SecuredCreditorPersistence _persistence;

}