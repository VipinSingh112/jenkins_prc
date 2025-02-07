/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.acquire.application.form.service.exception.NoSuchAcquireDocumentListException;
import com.nbp.acquire.application.form.service.model.AcquireDocumentList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acquire document list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDocumentListUtil
 * @generated
 */
@ProviderType
public interface AcquireDocumentListPersistence
	extends BasePersistence<AcquireDocumentList> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AcquireDocumentListUtil} to access the acquire document list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acquire document lists where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @return the matching acquire document lists
	 */
	public java.util.List<AcquireDocumentList> findBygetAcquireDocListByDocType(
		String documentType);

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
	public java.util.List<AcquireDocumentList> findBygetAcquireDocListByDocType(
		String documentType, int start, int end);

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
	public java.util.List<AcquireDocumentList> findBygetAcquireDocListByDocType(
		String documentType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireDocumentList>
			orderByComparator);

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
	public java.util.List<AcquireDocumentList> findBygetAcquireDocListByDocType(
		String documentType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireDocumentList>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acquire document list in the ordered set where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire document list
	 * @throws NoSuchAcquireDocumentListException if a matching acquire document list could not be found
	 */
	public AcquireDocumentList findBygetAcquireDocListByDocType_First(
			String documentType,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquireDocumentList> orderByComparator)
		throws NoSuchAcquireDocumentListException;

	/**
	 * Returns the first acquire document list in the ordered set where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire document list, or <code>null</code> if a matching acquire document list could not be found
	 */
	public AcquireDocumentList fetchBygetAcquireDocListByDocType_First(
		String documentType,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireDocumentList>
			orderByComparator);

	/**
	 * Returns the last acquire document list in the ordered set where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire document list
	 * @throws NoSuchAcquireDocumentListException if a matching acquire document list could not be found
	 */
	public AcquireDocumentList findBygetAcquireDocListByDocType_Last(
			String documentType,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquireDocumentList> orderByComparator)
		throws NoSuchAcquireDocumentListException;

	/**
	 * Returns the last acquire document list in the ordered set where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire document list, or <code>null</code> if a matching acquire document list could not be found
	 */
	public AcquireDocumentList fetchBygetAcquireDocListByDocType_Last(
		String documentType,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireDocumentList>
			orderByComparator);

	/**
	 * Returns the acquire document lists before and after the current acquire document list in the ordered set where documentType = &#63;.
	 *
	 * @param acquireDocumentListId the primary key of the current acquire document list
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire document list
	 * @throws NoSuchAcquireDocumentListException if a acquire document list with the primary key could not be found
	 */
	public AcquireDocumentList[] findBygetAcquireDocListByDocType_PrevAndNext(
			long acquireDocumentListId, String documentType,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquireDocumentList> orderByComparator)
		throws NoSuchAcquireDocumentListException;

	/**
	 * Removes all the acquire document lists where documentType = &#63; from the database.
	 *
	 * @param documentType the document type
	 */
	public void removeBygetAcquireDocListByDocType(String documentType);

	/**
	 * Returns the number of acquire document lists where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @return the number of matching acquire document lists
	 */
	public int countBygetAcquireDocListByDocType(String documentType);

	/**
	 * Caches the acquire document list in the entity cache if it is enabled.
	 *
	 * @param acquireDocumentList the acquire document list
	 */
	public void cacheResult(AcquireDocumentList acquireDocumentList);

	/**
	 * Caches the acquire document lists in the entity cache if it is enabled.
	 *
	 * @param acquireDocumentLists the acquire document lists
	 */
	public void cacheResult(
		java.util.List<AcquireDocumentList> acquireDocumentLists);

	/**
	 * Creates a new acquire document list with the primary key. Does not add the acquire document list to the database.
	 *
	 * @param acquireDocumentListId the primary key for the new acquire document list
	 * @return the new acquire document list
	 */
	public AcquireDocumentList create(long acquireDocumentListId);

	/**
	 * Removes the acquire document list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireDocumentListId the primary key of the acquire document list
	 * @return the acquire document list that was removed
	 * @throws NoSuchAcquireDocumentListException if a acquire document list with the primary key could not be found
	 */
	public AcquireDocumentList remove(long acquireDocumentListId)
		throws NoSuchAcquireDocumentListException;

	public AcquireDocumentList updateImpl(
		AcquireDocumentList acquireDocumentList);

	/**
	 * Returns the acquire document list with the primary key or throws a <code>NoSuchAcquireDocumentListException</code> if it could not be found.
	 *
	 * @param acquireDocumentListId the primary key of the acquire document list
	 * @return the acquire document list
	 * @throws NoSuchAcquireDocumentListException if a acquire document list with the primary key could not be found
	 */
	public AcquireDocumentList findByPrimaryKey(long acquireDocumentListId)
		throws NoSuchAcquireDocumentListException;

	/**
	 * Returns the acquire document list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireDocumentListId the primary key of the acquire document list
	 * @return the acquire document list, or <code>null</code> if a acquire document list with the primary key could not be found
	 */
	public AcquireDocumentList fetchByPrimaryKey(long acquireDocumentListId);

	/**
	 * Returns all the acquire document lists.
	 *
	 * @return the acquire document lists
	 */
	public java.util.List<AcquireDocumentList> findAll();

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
	public java.util.List<AcquireDocumentList> findAll(int start, int end);

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
	public java.util.List<AcquireDocumentList> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireDocumentList>
			orderByComparator);

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
	public java.util.List<AcquireDocumentList> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireDocumentList>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acquire document lists from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acquire document lists.
	 *
	 * @return the number of acquire document lists
	 */
	public int countAll();

}