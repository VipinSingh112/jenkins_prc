/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.pharmaceutical.application.form.service.exception.NoSuchPharmaDocumentListException;
import com.nbp.pharmaceutical.application.form.service.model.PharmaDocumentList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the pharma document list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaDocumentListUtil
 * @generated
 */
@ProviderType
public interface PharmaDocumentListPersistence
	extends BasePersistence<PharmaDocumentList> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PharmaDocumentListUtil} to access the pharma document list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the pharma document lists where pharmaAppType = &#63;.
	 *
	 * @param pharmaAppType the pharma app type
	 * @return the matching pharma document lists
	 */
	public java.util.List<PharmaDocumentList> findBygetPharmaDocByApplicant(
		String pharmaAppType);

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
	public java.util.List<PharmaDocumentList> findBygetPharmaDocByApplicant(
		String pharmaAppType, int start, int end);

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
	public java.util.List<PharmaDocumentList> findBygetPharmaDocByApplicant(
		String pharmaAppType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaDocumentList>
			orderByComparator);

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
	public java.util.List<PharmaDocumentList> findBygetPharmaDocByApplicant(
		String pharmaAppType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaDocumentList>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first pharma document list in the ordered set where pharmaAppType = &#63;.
	 *
	 * @param pharmaAppType the pharma app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma document list
	 * @throws NoSuchPharmaDocumentListException if a matching pharma document list could not be found
	 */
	public PharmaDocumentList findBygetPharmaDocByApplicant_First(
			String pharmaAppType,
			com.liferay.portal.kernel.util.OrderByComparator<PharmaDocumentList>
				orderByComparator)
		throws NoSuchPharmaDocumentListException;

	/**
	 * Returns the first pharma document list in the ordered set where pharmaAppType = &#63;.
	 *
	 * @param pharmaAppType the pharma app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma document list, or <code>null</code> if a matching pharma document list could not be found
	 */
	public PharmaDocumentList fetchBygetPharmaDocByApplicant_First(
		String pharmaAppType,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaDocumentList>
			orderByComparator);

	/**
	 * Returns the last pharma document list in the ordered set where pharmaAppType = &#63;.
	 *
	 * @param pharmaAppType the pharma app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma document list
	 * @throws NoSuchPharmaDocumentListException if a matching pharma document list could not be found
	 */
	public PharmaDocumentList findBygetPharmaDocByApplicant_Last(
			String pharmaAppType,
			com.liferay.portal.kernel.util.OrderByComparator<PharmaDocumentList>
				orderByComparator)
		throws NoSuchPharmaDocumentListException;

	/**
	 * Returns the last pharma document list in the ordered set where pharmaAppType = &#63;.
	 *
	 * @param pharmaAppType the pharma app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma document list, or <code>null</code> if a matching pharma document list could not be found
	 */
	public PharmaDocumentList fetchBygetPharmaDocByApplicant_Last(
		String pharmaAppType,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaDocumentList>
			orderByComparator);

	/**
	 * Returns the pharma document lists before and after the current pharma document list in the ordered set where pharmaAppType = &#63;.
	 *
	 * @param pharmaDocListId the primary key of the current pharma document list
	 * @param pharmaAppType the pharma app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma document list
	 * @throws NoSuchPharmaDocumentListException if a pharma document list with the primary key could not be found
	 */
	public PharmaDocumentList[] findBygetPharmaDocByApplicant_PrevAndNext(
			long pharmaDocListId, String pharmaAppType,
			com.liferay.portal.kernel.util.OrderByComparator<PharmaDocumentList>
				orderByComparator)
		throws NoSuchPharmaDocumentListException;

	/**
	 * Removes all the pharma document lists where pharmaAppType = &#63; from the database.
	 *
	 * @param pharmaAppType the pharma app type
	 */
	public void removeBygetPharmaDocByApplicant(String pharmaAppType);

	/**
	 * Returns the number of pharma document lists where pharmaAppType = &#63;.
	 *
	 * @param pharmaAppType the pharma app type
	 * @return the number of matching pharma document lists
	 */
	public int countBygetPharmaDocByApplicant(String pharmaAppType);

	/**
	 * Caches the pharma document list in the entity cache if it is enabled.
	 *
	 * @param pharmaDocumentList the pharma document list
	 */
	public void cacheResult(PharmaDocumentList pharmaDocumentList);

	/**
	 * Caches the pharma document lists in the entity cache if it is enabled.
	 *
	 * @param pharmaDocumentLists the pharma document lists
	 */
	public void cacheResult(
		java.util.List<PharmaDocumentList> pharmaDocumentLists);

	/**
	 * Creates a new pharma document list with the primary key. Does not add the pharma document list to the database.
	 *
	 * @param pharmaDocListId the primary key for the new pharma document list
	 * @return the new pharma document list
	 */
	public PharmaDocumentList create(long pharmaDocListId);

	/**
	 * Removes the pharma document list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaDocListId the primary key of the pharma document list
	 * @return the pharma document list that was removed
	 * @throws NoSuchPharmaDocumentListException if a pharma document list with the primary key could not be found
	 */
	public PharmaDocumentList remove(long pharmaDocListId)
		throws NoSuchPharmaDocumentListException;

	public PharmaDocumentList updateImpl(PharmaDocumentList pharmaDocumentList);

	/**
	 * Returns the pharma document list with the primary key or throws a <code>NoSuchPharmaDocumentListException</code> if it could not be found.
	 *
	 * @param pharmaDocListId the primary key of the pharma document list
	 * @return the pharma document list
	 * @throws NoSuchPharmaDocumentListException if a pharma document list with the primary key could not be found
	 */
	public PharmaDocumentList findByPrimaryKey(long pharmaDocListId)
		throws NoSuchPharmaDocumentListException;

	/**
	 * Returns the pharma document list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaDocListId the primary key of the pharma document list
	 * @return the pharma document list, or <code>null</code> if a pharma document list with the primary key could not be found
	 */
	public PharmaDocumentList fetchByPrimaryKey(long pharmaDocListId);

	/**
	 * Returns all the pharma document lists.
	 *
	 * @return the pharma document lists
	 */
	public java.util.List<PharmaDocumentList> findAll();

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
	public java.util.List<PharmaDocumentList> findAll(int start, int end);

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
	public java.util.List<PharmaDocumentList> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaDocumentList>
			orderByComparator);

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
	public java.util.List<PharmaDocumentList> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaDocumentList>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the pharma document lists from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of pharma document lists.
	 *
	 * @return the number of pharma document lists
	 */
	public int countAll();

}