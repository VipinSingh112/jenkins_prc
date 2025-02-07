/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchUnsealedSourceAddException;
import com.nbp.hsra.application.service.model.UnsealedSourceAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the unsealed source add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UnsealedSourceAddUtil
 * @generated
 */
@ProviderType
public interface UnsealedSourceAddPersistence
	extends BasePersistence<UnsealedSourceAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UnsealedSourceAddUtil} to access the unsealed source add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the unsealed source adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching unsealed source adds
	 */
	public java.util.List<UnsealedSourceAdd> findBygetHsraById(
		long hsraApplicationId);

	/**
	 * Returns a range of all the unsealed source adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsealedSourceAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of unsealed source adds
	 * @param end the upper bound of the range of unsealed source adds (not inclusive)
	 * @return the range of matching unsealed source adds
	 */
	public java.util.List<UnsealedSourceAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the unsealed source adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsealedSourceAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of unsealed source adds
	 * @param end the upper bound of the range of unsealed source adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching unsealed source adds
	 */
	public java.util.List<UnsealedSourceAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UnsealedSourceAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the unsealed source adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsealedSourceAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of unsealed source adds
	 * @param end the upper bound of the range of unsealed source adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching unsealed source adds
	 */
	public java.util.List<UnsealedSourceAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UnsealedSourceAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first unsealed source add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching unsealed source add
	 * @throws NoSuchUnsealedSourceAddException if a matching unsealed source add could not be found
	 */
	public UnsealedSourceAdd findBygetHsraById_First(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<UnsealedSourceAdd>
				orderByComparator)
		throws NoSuchUnsealedSourceAddException;

	/**
	 * Returns the first unsealed source add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching unsealed source add, or <code>null</code> if a matching unsealed source add could not be found
	 */
	public UnsealedSourceAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<UnsealedSourceAdd>
			orderByComparator);

	/**
	 * Returns the last unsealed source add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching unsealed source add
	 * @throws NoSuchUnsealedSourceAddException if a matching unsealed source add could not be found
	 */
	public UnsealedSourceAdd findBygetHsraById_Last(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<UnsealedSourceAdd>
				orderByComparator)
		throws NoSuchUnsealedSourceAddException;

	/**
	 * Returns the last unsealed source add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching unsealed source add, or <code>null</code> if a matching unsealed source add could not be found
	 */
	public UnsealedSourceAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<UnsealedSourceAdd>
			orderByComparator);

	/**
	 * Returns the unsealed source adds before and after the current unsealed source add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param unsealedSourceAddId the primary key of the current unsealed source add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next unsealed source add
	 * @throws NoSuchUnsealedSourceAddException if a unsealed source add with the primary key could not be found
	 */
	public UnsealedSourceAdd[] findBygetHsraById_PrevAndNext(
			long unsealedSourceAddId, long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<UnsealedSourceAdd>
				orderByComparator)
		throws NoSuchUnsealedSourceAddException;

	/**
	 * Removes all the unsealed source adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public void removeBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the number of unsealed source adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching unsealed source adds
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the unsealed source add in the entity cache if it is enabled.
	 *
	 * @param unsealedSourceAdd the unsealed source add
	 */
	public void cacheResult(UnsealedSourceAdd unsealedSourceAdd);

	/**
	 * Caches the unsealed source adds in the entity cache if it is enabled.
	 *
	 * @param unsealedSourceAdds the unsealed source adds
	 */
	public void cacheResult(
		java.util.List<UnsealedSourceAdd> unsealedSourceAdds);

	/**
	 * Creates a new unsealed source add with the primary key. Does not add the unsealed source add to the database.
	 *
	 * @param unsealedSourceAddId the primary key for the new unsealed source add
	 * @return the new unsealed source add
	 */
	public UnsealedSourceAdd create(long unsealedSourceAddId);

	/**
	 * Removes the unsealed source add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param unsealedSourceAddId the primary key of the unsealed source add
	 * @return the unsealed source add that was removed
	 * @throws NoSuchUnsealedSourceAddException if a unsealed source add with the primary key could not be found
	 */
	public UnsealedSourceAdd remove(long unsealedSourceAddId)
		throws NoSuchUnsealedSourceAddException;

	public UnsealedSourceAdd updateImpl(UnsealedSourceAdd unsealedSourceAdd);

	/**
	 * Returns the unsealed source add with the primary key or throws a <code>NoSuchUnsealedSourceAddException</code> if it could not be found.
	 *
	 * @param unsealedSourceAddId the primary key of the unsealed source add
	 * @return the unsealed source add
	 * @throws NoSuchUnsealedSourceAddException if a unsealed source add with the primary key could not be found
	 */
	public UnsealedSourceAdd findByPrimaryKey(long unsealedSourceAddId)
		throws NoSuchUnsealedSourceAddException;

	/**
	 * Returns the unsealed source add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param unsealedSourceAddId the primary key of the unsealed source add
	 * @return the unsealed source add, or <code>null</code> if a unsealed source add with the primary key could not be found
	 */
	public UnsealedSourceAdd fetchByPrimaryKey(long unsealedSourceAddId);

	/**
	 * Returns all the unsealed source adds.
	 *
	 * @return the unsealed source adds
	 */
	public java.util.List<UnsealedSourceAdd> findAll();

	/**
	 * Returns a range of all the unsealed source adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsealedSourceAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of unsealed source adds
	 * @param end the upper bound of the range of unsealed source adds (not inclusive)
	 * @return the range of unsealed source adds
	 */
	public java.util.List<UnsealedSourceAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the unsealed source adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsealedSourceAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of unsealed source adds
	 * @param end the upper bound of the range of unsealed source adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of unsealed source adds
	 */
	public java.util.List<UnsealedSourceAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UnsealedSourceAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the unsealed source adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsealedSourceAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of unsealed source adds
	 * @param end the upper bound of the range of unsealed source adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of unsealed source adds
	 */
	public java.util.List<UnsealedSourceAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UnsealedSourceAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the unsealed source adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of unsealed source adds.
	 *
	 * @return the number of unsealed source adds
	 */
	public int countAll();

}