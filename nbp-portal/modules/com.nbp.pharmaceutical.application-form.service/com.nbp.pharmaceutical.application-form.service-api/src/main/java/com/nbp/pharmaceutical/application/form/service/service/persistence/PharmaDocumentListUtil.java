/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.pharmaceutical.application.form.service.model.PharmaDocumentList;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the pharma document list service. This utility wraps <code>com.nbp.pharmaceutical.application.form.service.service.persistence.impl.PharmaDocumentListPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaDocumentListPersistence
 * @generated
 */
public class PharmaDocumentListUtil {

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
	public static void clearCache(PharmaDocumentList pharmaDocumentList) {
		getPersistence().clearCache(pharmaDocumentList);
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
	public static Map<Serializable, PharmaDocumentList> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PharmaDocumentList> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PharmaDocumentList> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PharmaDocumentList> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PharmaDocumentList> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PharmaDocumentList update(
		PharmaDocumentList pharmaDocumentList) {

		return getPersistence().update(pharmaDocumentList);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PharmaDocumentList update(
		PharmaDocumentList pharmaDocumentList, ServiceContext serviceContext) {

		return getPersistence().update(pharmaDocumentList, serviceContext);
	}

	/**
	 * Returns all the pharma document lists where pharmaAppType = &#63;.
	 *
	 * @param pharmaAppType the pharma app type
	 * @return the matching pharma document lists
	 */
	public static List<PharmaDocumentList> findBygetPharmaDocByApplicant(
		String pharmaAppType) {

		return getPersistence().findBygetPharmaDocByApplicant(pharmaAppType);
	}

	/**
	 * Returns a range of all the pharma document lists where pharmaAppType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaAppType the pharma app type
	 * @param start the lower bound of the range of pharma document lists
	 * @param end the upper bound of the range of pharma document lists (not inclusive)
	 * @return the range of matching pharma document lists
	 */
	public static List<PharmaDocumentList> findBygetPharmaDocByApplicant(
		String pharmaAppType, int start, int end) {

		return getPersistence().findBygetPharmaDocByApplicant(
			pharmaAppType, start, end);
	}

	/**
	 * Returns an ordered range of all the pharma document lists where pharmaAppType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaAppType the pharma app type
	 * @param start the lower bound of the range of pharma document lists
	 * @param end the upper bound of the range of pharma document lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma document lists
	 */
	public static List<PharmaDocumentList> findBygetPharmaDocByApplicant(
		String pharmaAppType, int start, int end,
		OrderByComparator<PharmaDocumentList> orderByComparator) {

		return getPersistence().findBygetPharmaDocByApplicant(
			pharmaAppType, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma document lists where pharmaAppType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaAppType the pharma app type
	 * @param start the lower bound of the range of pharma document lists
	 * @param end the upper bound of the range of pharma document lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma document lists
	 */
	public static List<PharmaDocumentList> findBygetPharmaDocByApplicant(
		String pharmaAppType, int start, int end,
		OrderByComparator<PharmaDocumentList> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetPharmaDocByApplicant(
			pharmaAppType, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first pharma document list in the ordered set where pharmaAppType = &#63;.
	 *
	 * @param pharmaAppType the pharma app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma document list
	 * @throws NoSuchPharmaDocumentListException if a matching pharma document list could not be found
	 */
	public static PharmaDocumentList findBygetPharmaDocByApplicant_First(
			String pharmaAppType,
			OrderByComparator<PharmaDocumentList> orderByComparator)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaDocumentListException {

		return getPersistence().findBygetPharmaDocByApplicant_First(
			pharmaAppType, orderByComparator);
	}

	/**
	 * Returns the first pharma document list in the ordered set where pharmaAppType = &#63;.
	 *
	 * @param pharmaAppType the pharma app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma document list, or <code>null</code> if a matching pharma document list could not be found
	 */
	public static PharmaDocumentList fetchBygetPharmaDocByApplicant_First(
		String pharmaAppType,
		OrderByComparator<PharmaDocumentList> orderByComparator) {

		return getPersistence().fetchBygetPharmaDocByApplicant_First(
			pharmaAppType, orderByComparator);
	}

	/**
	 * Returns the last pharma document list in the ordered set where pharmaAppType = &#63;.
	 *
	 * @param pharmaAppType the pharma app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma document list
	 * @throws NoSuchPharmaDocumentListException if a matching pharma document list could not be found
	 */
	public static PharmaDocumentList findBygetPharmaDocByApplicant_Last(
			String pharmaAppType,
			OrderByComparator<PharmaDocumentList> orderByComparator)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaDocumentListException {

		return getPersistence().findBygetPharmaDocByApplicant_Last(
			pharmaAppType, orderByComparator);
	}

	/**
	 * Returns the last pharma document list in the ordered set where pharmaAppType = &#63;.
	 *
	 * @param pharmaAppType the pharma app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma document list, or <code>null</code> if a matching pharma document list could not be found
	 */
	public static PharmaDocumentList fetchBygetPharmaDocByApplicant_Last(
		String pharmaAppType,
		OrderByComparator<PharmaDocumentList> orderByComparator) {

		return getPersistence().fetchBygetPharmaDocByApplicant_Last(
			pharmaAppType, orderByComparator);
	}

	/**
	 * Returns the pharma document lists before and after the current pharma document list in the ordered set where pharmaAppType = &#63;.
	 *
	 * @param pharmaDocListId the primary key of the current pharma document list
	 * @param pharmaAppType the pharma app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma document list
	 * @throws NoSuchPharmaDocumentListException if a pharma document list with the primary key could not be found
	 */
	public static PharmaDocumentList[]
			findBygetPharmaDocByApplicant_PrevAndNext(
				long pharmaDocListId, String pharmaAppType,
				OrderByComparator<PharmaDocumentList> orderByComparator)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaDocumentListException {

		return getPersistence().findBygetPharmaDocByApplicant_PrevAndNext(
			pharmaDocListId, pharmaAppType, orderByComparator);
	}

	/**
	 * Removes all the pharma document lists where pharmaAppType = &#63; from the database.
	 *
	 * @param pharmaAppType the pharma app type
	 */
	public static void removeBygetPharmaDocByApplicant(String pharmaAppType) {
		getPersistence().removeBygetPharmaDocByApplicant(pharmaAppType);
	}

	/**
	 * Returns the number of pharma document lists where pharmaAppType = &#63;.
	 *
	 * @param pharmaAppType the pharma app type
	 * @return the number of matching pharma document lists
	 */
	public static int countBygetPharmaDocByApplicant(String pharmaAppType) {
		return getPersistence().countBygetPharmaDocByApplicant(pharmaAppType);
	}

	/**
	 * Caches the pharma document list in the entity cache if it is enabled.
	 *
	 * @param pharmaDocumentList the pharma document list
	 */
	public static void cacheResult(PharmaDocumentList pharmaDocumentList) {
		getPersistence().cacheResult(pharmaDocumentList);
	}

	/**
	 * Caches the pharma document lists in the entity cache if it is enabled.
	 *
	 * @param pharmaDocumentLists the pharma document lists
	 */
	public static void cacheResult(
		List<PharmaDocumentList> pharmaDocumentLists) {

		getPersistence().cacheResult(pharmaDocumentLists);
	}

	/**
	 * Creates a new pharma document list with the primary key. Does not add the pharma document list to the database.
	 *
	 * @param pharmaDocListId the primary key for the new pharma document list
	 * @return the new pharma document list
	 */
	public static PharmaDocumentList create(long pharmaDocListId) {
		return getPersistence().create(pharmaDocListId);
	}

	/**
	 * Removes the pharma document list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaDocListId the primary key of the pharma document list
	 * @return the pharma document list that was removed
	 * @throws NoSuchPharmaDocumentListException if a pharma document list with the primary key could not be found
	 */
	public static PharmaDocumentList remove(long pharmaDocListId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaDocumentListException {

		return getPersistence().remove(pharmaDocListId);
	}

	public static PharmaDocumentList updateImpl(
		PharmaDocumentList pharmaDocumentList) {

		return getPersistence().updateImpl(pharmaDocumentList);
	}

	/**
	 * Returns the pharma document list with the primary key or throws a <code>NoSuchPharmaDocumentListException</code> if it could not be found.
	 *
	 * @param pharmaDocListId the primary key of the pharma document list
	 * @return the pharma document list
	 * @throws NoSuchPharmaDocumentListException if a pharma document list with the primary key could not be found
	 */
	public static PharmaDocumentList findByPrimaryKey(long pharmaDocListId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaDocumentListException {

		return getPersistence().findByPrimaryKey(pharmaDocListId);
	}

	/**
	 * Returns the pharma document list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaDocListId the primary key of the pharma document list
	 * @return the pharma document list, or <code>null</code> if a pharma document list with the primary key could not be found
	 */
	public static PharmaDocumentList fetchByPrimaryKey(long pharmaDocListId) {
		return getPersistence().fetchByPrimaryKey(pharmaDocListId);
	}

	/**
	 * Returns all the pharma document lists.
	 *
	 * @return the pharma document lists
	 */
	public static List<PharmaDocumentList> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the pharma document lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma document lists
	 * @param end the upper bound of the range of pharma document lists (not inclusive)
	 * @return the range of pharma document lists
	 */
	public static List<PharmaDocumentList> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the pharma document lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma document lists
	 * @param end the upper bound of the range of pharma document lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma document lists
	 */
	public static List<PharmaDocumentList> findAll(
		int start, int end,
		OrderByComparator<PharmaDocumentList> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma document lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma document lists
	 * @param end the upper bound of the range of pharma document lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma document lists
	 */
	public static List<PharmaDocumentList> findAll(
		int start, int end,
		OrderByComparator<PharmaDocumentList> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the pharma document lists from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of pharma document lists.
	 *
	 * @return the number of pharma document lists
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PharmaDocumentListPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		PharmaDocumentListPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile PharmaDocumentListPersistence _persistence;

}