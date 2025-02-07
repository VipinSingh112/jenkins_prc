/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.ShareholdersHoldings;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the shareholders holdings service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.ShareholdersHoldingsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ShareholdersHoldingsPersistence
 * @generated
 */
public class ShareholdersHoldingsUtil {

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
	public static void clearCache(ShareholdersHoldings shareholdersHoldings) {
		getPersistence().clearCache(shareholdersHoldings);
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
	public static Map<Serializable, ShareholdersHoldings> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ShareholdersHoldings> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ShareholdersHoldings> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ShareholdersHoldings> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ShareholdersHoldings> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ShareholdersHoldings update(
		ShareholdersHoldings shareholdersHoldings) {

		return getPersistence().update(shareholdersHoldings);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ShareholdersHoldings update(
		ShareholdersHoldings shareholdersHoldings,
		ServiceContext serviceContext) {

		return getPersistence().update(shareholdersHoldings, serviceContext);
	}

	/**
	 * Returns all the shareholders holdingses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching shareholders holdingses
	 */
	public static List<ShareholdersHoldings> findBygetOsiById(
		long osiInsolvencyId) {

		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns a range of all the shareholders holdingses where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShareholdersHoldingsModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of shareholders holdingses
	 * @param end the upper bound of the range of shareholders holdingses (not inclusive)
	 * @return the range of matching shareholders holdingses
	 */
	public static List<ShareholdersHoldings> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return getPersistence().findBygetOsiById(osiInsolvencyId, start, end);
	}

	/**
	 * Returns an ordered range of all the shareholders holdingses where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShareholdersHoldingsModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of shareholders holdingses
	 * @param end the upper bound of the range of shareholders holdingses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching shareholders holdingses
	 */
	public static List<ShareholdersHoldings> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<ShareholdersHoldings> orderByComparator) {

		return getPersistence().findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the shareholders holdingses where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShareholdersHoldingsModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of shareholders holdingses
	 * @param end the upper bound of the range of shareholders holdingses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching shareholders holdingses
	 */
	public static List<ShareholdersHoldings> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<ShareholdersHoldings> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first shareholders holdings in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shareholders holdings
	 * @throws NoSuchShareholdersHoldingsException if a matching shareholders holdings could not be found
	 */
	public static ShareholdersHoldings findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<ShareholdersHoldings> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchShareholdersHoldingsException {

		return getPersistence().findBygetOsiById_First(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the first shareholders holdings in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shareholders holdings, or <code>null</code> if a matching shareholders holdings could not be found
	 */
	public static ShareholdersHoldings fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<ShareholdersHoldings> orderByComparator) {

		return getPersistence().fetchBygetOsiById_First(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last shareholders holdings in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shareholders holdings
	 * @throws NoSuchShareholdersHoldingsException if a matching shareholders holdings could not be found
	 */
	public static ShareholdersHoldings findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<ShareholdersHoldings> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchShareholdersHoldingsException {

		return getPersistence().findBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last shareholders holdings in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shareholders holdings, or <code>null</code> if a matching shareholders holdings could not be found
	 */
	public static ShareholdersHoldings fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<ShareholdersHoldings> orderByComparator) {

		return getPersistence().fetchBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the shareholders holdingses before and after the current shareholders holdings in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param shareholdersHoldingsId the primary key of the current shareholders holdings
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next shareholders holdings
	 * @throws NoSuchShareholdersHoldingsException if a shareholders holdings with the primary key could not be found
	 */
	public static ShareholdersHoldings[] findBygetOsiById_PrevAndNext(
			long shareholdersHoldingsId, long osiInsolvencyId,
			OrderByComparator<ShareholdersHoldings> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchShareholdersHoldingsException {

		return getPersistence().findBygetOsiById_PrevAndNext(
			shareholdersHoldingsId, osiInsolvencyId, orderByComparator);
	}

	/**
	 * Removes all the shareholders holdingses where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public static void removeBygetOsiById(long osiInsolvencyId) {
		getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of shareholders holdingses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching shareholders holdingses
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the shareholders holdings in the entity cache if it is enabled.
	 *
	 * @param shareholdersHoldings the shareholders holdings
	 */
	public static void cacheResult(ShareholdersHoldings shareholdersHoldings) {
		getPersistence().cacheResult(shareholdersHoldings);
	}

	/**
	 * Caches the shareholders holdingses in the entity cache if it is enabled.
	 *
	 * @param shareholdersHoldingses the shareholders holdingses
	 */
	public static void cacheResult(
		List<ShareholdersHoldings> shareholdersHoldingses) {

		getPersistence().cacheResult(shareholdersHoldingses);
	}

	/**
	 * Creates a new shareholders holdings with the primary key. Does not add the shareholders holdings to the database.
	 *
	 * @param shareholdersHoldingsId the primary key for the new shareholders holdings
	 * @return the new shareholders holdings
	 */
	public static ShareholdersHoldings create(long shareholdersHoldingsId) {
		return getPersistence().create(shareholdersHoldingsId);
	}

	/**
	 * Removes the shareholders holdings with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param shareholdersHoldingsId the primary key of the shareholders holdings
	 * @return the shareholders holdings that was removed
	 * @throws NoSuchShareholdersHoldingsException if a shareholders holdings with the primary key could not be found
	 */
	public static ShareholdersHoldings remove(long shareholdersHoldingsId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchShareholdersHoldingsException {

		return getPersistence().remove(shareholdersHoldingsId);
	}

	public static ShareholdersHoldings updateImpl(
		ShareholdersHoldings shareholdersHoldings) {

		return getPersistence().updateImpl(shareholdersHoldings);
	}

	/**
	 * Returns the shareholders holdings with the primary key or throws a <code>NoSuchShareholdersHoldingsException</code> if it could not be found.
	 *
	 * @param shareholdersHoldingsId the primary key of the shareholders holdings
	 * @return the shareholders holdings
	 * @throws NoSuchShareholdersHoldingsException if a shareholders holdings with the primary key could not be found
	 */
	public static ShareholdersHoldings findByPrimaryKey(
			long shareholdersHoldingsId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchShareholdersHoldingsException {

		return getPersistence().findByPrimaryKey(shareholdersHoldingsId);
	}

	/**
	 * Returns the shareholders holdings with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param shareholdersHoldingsId the primary key of the shareholders holdings
	 * @return the shareholders holdings, or <code>null</code> if a shareholders holdings with the primary key could not be found
	 */
	public static ShareholdersHoldings fetchByPrimaryKey(
		long shareholdersHoldingsId) {

		return getPersistence().fetchByPrimaryKey(shareholdersHoldingsId);
	}

	/**
	 * Returns all the shareholders holdingses.
	 *
	 * @return the shareholders holdingses
	 */
	public static List<ShareholdersHoldings> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the shareholders holdingses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShareholdersHoldingsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of shareholders holdingses
	 * @param end the upper bound of the range of shareholders holdingses (not inclusive)
	 * @return the range of shareholders holdingses
	 */
	public static List<ShareholdersHoldings> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the shareholders holdingses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShareholdersHoldingsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of shareholders holdingses
	 * @param end the upper bound of the range of shareholders holdingses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of shareholders holdingses
	 */
	public static List<ShareholdersHoldings> findAll(
		int start, int end,
		OrderByComparator<ShareholdersHoldings> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the shareholders holdingses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ShareholdersHoldingsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of shareholders holdingses
	 * @param end the upper bound of the range of shareholders holdingses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of shareholders holdingses
	 */
	public static List<ShareholdersHoldings> findAll(
		int start, int end,
		OrderByComparator<ShareholdersHoldings> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the shareholders holdingses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of shareholders holdingses.
	 *
	 * @return the number of shareholders holdingses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ShareholdersHoldingsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		ShareholdersHoldingsPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile ShareholdersHoldingsPersistence _persistence;

}