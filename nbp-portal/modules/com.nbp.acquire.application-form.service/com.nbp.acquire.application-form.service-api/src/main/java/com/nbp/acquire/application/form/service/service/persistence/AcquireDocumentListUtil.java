/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.application.form.service.model.AcquireDocumentList;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acquire document list service. This utility wraps <code>com.nbp.acquire.application.form.service.service.persistence.impl.AcquireDocumentListPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDocumentListPersistence
 * @generated
 */
public class AcquireDocumentListUtil {

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
	public static void clearCache(AcquireDocumentList acquireDocumentList) {
		getPersistence().clearCache(acquireDocumentList);
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
	public static Map<Serializable, AcquireDocumentList> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AcquireDocumentList> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AcquireDocumentList> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AcquireDocumentList> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AcquireDocumentList> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AcquireDocumentList update(
		AcquireDocumentList acquireDocumentList) {

		return getPersistence().update(acquireDocumentList);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AcquireDocumentList update(
		AcquireDocumentList acquireDocumentList,
		ServiceContext serviceContext) {

		return getPersistence().update(acquireDocumentList, serviceContext);
	}

	/**
	 * Returns all the acquire document lists where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @return the matching acquire document lists
	 */
	public static List<AcquireDocumentList> findBygetAcquireDocListByDocType(
		String documentType) {

		return getPersistence().findBygetAcquireDocListByDocType(documentType);
	}

	/**
	 * Returns a range of all the acquire document lists where documentType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param documentType the document type
	 * @param start the lower bound of the range of acquire document lists
	 * @param end the upper bound of the range of acquire document lists (not inclusive)
	 * @return the range of matching acquire document lists
	 */
	public static List<AcquireDocumentList> findBygetAcquireDocListByDocType(
		String documentType, int start, int end) {

		return getPersistence().findBygetAcquireDocListByDocType(
			documentType, start, end);
	}

	/**
	 * Returns an ordered range of all the acquire document lists where documentType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param documentType the document type
	 * @param start the lower bound of the range of acquire document lists
	 * @param end the upper bound of the range of acquire document lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire document lists
	 */
	public static List<AcquireDocumentList> findBygetAcquireDocListByDocType(
		String documentType, int start, int end,
		OrderByComparator<AcquireDocumentList> orderByComparator) {

		return getPersistence().findBygetAcquireDocListByDocType(
			documentType, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire document lists where documentType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param documentType the document type
	 * @param start the lower bound of the range of acquire document lists
	 * @param end the upper bound of the range of acquire document lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire document lists
	 */
	public static List<AcquireDocumentList> findBygetAcquireDocListByDocType(
		String documentType, int start, int end,
		OrderByComparator<AcquireDocumentList> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetAcquireDocListByDocType(
			documentType, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acquire document list in the ordered set where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire document list
	 * @throws NoSuchAcquireDocumentListException if a matching acquire document list could not be found
	 */
	public static AcquireDocumentList findBygetAcquireDocListByDocType_First(
			String documentType,
			OrderByComparator<AcquireDocumentList> orderByComparator)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireDocumentListException {

		return getPersistence().findBygetAcquireDocListByDocType_First(
			documentType, orderByComparator);
	}

	/**
	 * Returns the first acquire document list in the ordered set where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire document list, or <code>null</code> if a matching acquire document list could not be found
	 */
	public static AcquireDocumentList fetchBygetAcquireDocListByDocType_First(
		String documentType,
		OrderByComparator<AcquireDocumentList> orderByComparator) {

		return getPersistence().fetchBygetAcquireDocListByDocType_First(
			documentType, orderByComparator);
	}

	/**
	 * Returns the last acquire document list in the ordered set where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire document list
	 * @throws NoSuchAcquireDocumentListException if a matching acquire document list could not be found
	 */
	public static AcquireDocumentList findBygetAcquireDocListByDocType_Last(
			String documentType,
			OrderByComparator<AcquireDocumentList> orderByComparator)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireDocumentListException {

		return getPersistence().findBygetAcquireDocListByDocType_Last(
			documentType, orderByComparator);
	}

	/**
	 * Returns the last acquire document list in the ordered set where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire document list, or <code>null</code> if a matching acquire document list could not be found
	 */
	public static AcquireDocumentList fetchBygetAcquireDocListByDocType_Last(
		String documentType,
		OrderByComparator<AcquireDocumentList> orderByComparator) {

		return getPersistence().fetchBygetAcquireDocListByDocType_Last(
			documentType, orderByComparator);
	}

	/**
	 * Returns the acquire document lists before and after the current acquire document list in the ordered set where documentType = &#63;.
	 *
	 * @param acquireDocumentListId the primary key of the current acquire document list
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire document list
	 * @throws NoSuchAcquireDocumentListException if a acquire document list with the primary key could not be found
	 */
	public static AcquireDocumentList[]
			findBygetAcquireDocListByDocType_PrevAndNext(
				long acquireDocumentListId, String documentType,
				OrderByComparator<AcquireDocumentList> orderByComparator)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireDocumentListException {

		return getPersistence().findBygetAcquireDocListByDocType_PrevAndNext(
			acquireDocumentListId, documentType, orderByComparator);
	}

	/**
	 * Removes all the acquire document lists where documentType = &#63; from the database.
	 *
	 * @param documentType the document type
	 */
	public static void removeBygetAcquireDocListByDocType(String documentType) {
		getPersistence().removeBygetAcquireDocListByDocType(documentType);
	}

	/**
	 * Returns the number of acquire document lists where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @return the number of matching acquire document lists
	 */
	public static int countBygetAcquireDocListByDocType(String documentType) {
		return getPersistence().countBygetAcquireDocListByDocType(documentType);
	}

	/**
	 * Caches the acquire document list in the entity cache if it is enabled.
	 *
	 * @param acquireDocumentList the acquire document list
	 */
	public static void cacheResult(AcquireDocumentList acquireDocumentList) {
		getPersistence().cacheResult(acquireDocumentList);
	}

	/**
	 * Caches the acquire document lists in the entity cache if it is enabled.
	 *
	 * @param acquireDocumentLists the acquire document lists
	 */
	public static void cacheResult(
		List<AcquireDocumentList> acquireDocumentLists) {

		getPersistence().cacheResult(acquireDocumentLists);
	}

	/**
	 * Creates a new acquire document list with the primary key. Does not add the acquire document list to the database.
	 *
	 * @param acquireDocumentListId the primary key for the new acquire document list
	 * @return the new acquire document list
	 */
	public static AcquireDocumentList create(long acquireDocumentListId) {
		return getPersistence().create(acquireDocumentListId);
	}

	/**
	 * Removes the acquire document list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireDocumentListId the primary key of the acquire document list
	 * @return the acquire document list that was removed
	 * @throws NoSuchAcquireDocumentListException if a acquire document list with the primary key could not be found
	 */
	public static AcquireDocumentList remove(long acquireDocumentListId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireDocumentListException {

		return getPersistence().remove(acquireDocumentListId);
	}

	public static AcquireDocumentList updateImpl(
		AcquireDocumentList acquireDocumentList) {

		return getPersistence().updateImpl(acquireDocumentList);
	}

	/**
	 * Returns the acquire document list with the primary key or throws a <code>NoSuchAcquireDocumentListException</code> if it could not be found.
	 *
	 * @param acquireDocumentListId the primary key of the acquire document list
	 * @return the acquire document list
	 * @throws NoSuchAcquireDocumentListException if a acquire document list with the primary key could not be found
	 */
	public static AcquireDocumentList findByPrimaryKey(
			long acquireDocumentListId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireDocumentListException {

		return getPersistence().findByPrimaryKey(acquireDocumentListId);
	}

	/**
	 * Returns the acquire document list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireDocumentListId the primary key of the acquire document list
	 * @return the acquire document list, or <code>null</code> if a acquire document list with the primary key could not be found
	 */
	public static AcquireDocumentList fetchByPrimaryKey(
		long acquireDocumentListId) {

		return getPersistence().fetchByPrimaryKey(acquireDocumentListId);
	}

	/**
	 * Returns all the acquire document lists.
	 *
	 * @return the acquire document lists
	 */
	public static List<AcquireDocumentList> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acquire document lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire document lists
	 * @param end the upper bound of the range of acquire document lists (not inclusive)
	 * @return the range of acquire document lists
	 */
	public static List<AcquireDocumentList> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acquire document lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire document lists
	 * @param end the upper bound of the range of acquire document lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire document lists
	 */
	public static List<AcquireDocumentList> findAll(
		int start, int end,
		OrderByComparator<AcquireDocumentList> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire document lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire document lists
	 * @param end the upper bound of the range of acquire document lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire document lists
	 */
	public static List<AcquireDocumentList> findAll(
		int start, int end,
		OrderByComparator<AcquireDocumentList> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acquire document lists from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acquire document lists.
	 *
	 * @return the number of acquire document lists
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AcquireDocumentListPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AcquireDocumentListPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AcquireDocumentListPersistence _persistence;

}