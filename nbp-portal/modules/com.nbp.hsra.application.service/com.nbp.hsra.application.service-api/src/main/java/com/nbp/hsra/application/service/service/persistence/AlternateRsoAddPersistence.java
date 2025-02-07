/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchAlternateRsoAddException;
import com.nbp.hsra.application.service.model.AlternateRsoAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the alternate rso add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AlternateRsoAddUtil
 * @generated
 */
@ProviderType
public interface AlternateRsoAddPersistence
	extends BasePersistence<AlternateRsoAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AlternateRsoAddUtil} to access the alternate rso add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the alternate rso adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching alternate rso adds
	 */
	public java.util.List<AlternateRsoAdd> findBygetHsraById(
		long hsraApplicationId);

	/**
	 * Returns a range of all the alternate rso adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of alternate rso adds
	 * @param end the upper bound of the range of alternate rso adds (not inclusive)
	 * @return the range of matching alternate rso adds
	 */
	public java.util.List<AlternateRsoAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the alternate rso adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of alternate rso adds
	 * @param end the upper bound of the range of alternate rso adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching alternate rso adds
	 */
	public java.util.List<AlternateRsoAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AlternateRsoAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the alternate rso adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of alternate rso adds
	 * @param end the upper bound of the range of alternate rso adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching alternate rso adds
	 */
	public java.util.List<AlternateRsoAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AlternateRsoAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first alternate rso add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching alternate rso add
	 * @throws NoSuchAlternateRsoAddException if a matching alternate rso add could not be found
	 */
	public AlternateRsoAdd findBygetHsraById_First(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AlternateRsoAdd>
				orderByComparator)
		throws NoSuchAlternateRsoAddException;

	/**
	 * Returns the first alternate rso add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching alternate rso add, or <code>null</code> if a matching alternate rso add could not be found
	 */
	public AlternateRsoAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AlternateRsoAdd>
			orderByComparator);

	/**
	 * Returns the last alternate rso add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching alternate rso add
	 * @throws NoSuchAlternateRsoAddException if a matching alternate rso add could not be found
	 */
	public AlternateRsoAdd findBygetHsraById_Last(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AlternateRsoAdd>
				orderByComparator)
		throws NoSuchAlternateRsoAddException;

	/**
	 * Returns the last alternate rso add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching alternate rso add, or <code>null</code> if a matching alternate rso add could not be found
	 */
	public AlternateRsoAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AlternateRsoAdd>
			orderByComparator);

	/**
	 * Returns the alternate rso adds before and after the current alternate rso add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param alternateRsoAddId the primary key of the current alternate rso add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next alternate rso add
	 * @throws NoSuchAlternateRsoAddException if a alternate rso add with the primary key could not be found
	 */
	public AlternateRsoAdd[] findBygetHsraById_PrevAndNext(
			long alternateRsoAddId, long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AlternateRsoAdd>
				orderByComparator)
		throws NoSuchAlternateRsoAddException;

	/**
	 * Removes all the alternate rso adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public void removeBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the number of alternate rso adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching alternate rso adds
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the alternate rso add in the entity cache if it is enabled.
	 *
	 * @param alternateRsoAdd the alternate rso add
	 */
	public void cacheResult(AlternateRsoAdd alternateRsoAdd);

	/**
	 * Caches the alternate rso adds in the entity cache if it is enabled.
	 *
	 * @param alternateRsoAdds the alternate rso adds
	 */
	public void cacheResult(java.util.List<AlternateRsoAdd> alternateRsoAdds);

	/**
	 * Creates a new alternate rso add with the primary key. Does not add the alternate rso add to the database.
	 *
	 * @param alternateRsoAddId the primary key for the new alternate rso add
	 * @return the new alternate rso add
	 */
	public AlternateRsoAdd create(long alternateRsoAddId);

	/**
	 * Removes the alternate rso add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param alternateRsoAddId the primary key of the alternate rso add
	 * @return the alternate rso add that was removed
	 * @throws NoSuchAlternateRsoAddException if a alternate rso add with the primary key could not be found
	 */
	public AlternateRsoAdd remove(long alternateRsoAddId)
		throws NoSuchAlternateRsoAddException;

	public AlternateRsoAdd updateImpl(AlternateRsoAdd alternateRsoAdd);

	/**
	 * Returns the alternate rso add with the primary key or throws a <code>NoSuchAlternateRsoAddException</code> if it could not be found.
	 *
	 * @param alternateRsoAddId the primary key of the alternate rso add
	 * @return the alternate rso add
	 * @throws NoSuchAlternateRsoAddException if a alternate rso add with the primary key could not be found
	 */
	public AlternateRsoAdd findByPrimaryKey(long alternateRsoAddId)
		throws NoSuchAlternateRsoAddException;

	/**
	 * Returns the alternate rso add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param alternateRsoAddId the primary key of the alternate rso add
	 * @return the alternate rso add, or <code>null</code> if a alternate rso add with the primary key could not be found
	 */
	public AlternateRsoAdd fetchByPrimaryKey(long alternateRsoAddId);

	/**
	 * Returns all the alternate rso adds.
	 *
	 * @return the alternate rso adds
	 */
	public java.util.List<AlternateRsoAdd> findAll();

	/**
	 * Returns a range of all the alternate rso adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of alternate rso adds
	 * @param end the upper bound of the range of alternate rso adds (not inclusive)
	 * @return the range of alternate rso adds
	 */
	public java.util.List<AlternateRsoAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the alternate rso adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of alternate rso adds
	 * @param end the upper bound of the range of alternate rso adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of alternate rso adds
	 */
	public java.util.List<AlternateRsoAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AlternateRsoAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the alternate rso adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of alternate rso adds
	 * @param end the upper bound of the range of alternate rso adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of alternate rso adds
	 */
	public java.util.List<AlternateRsoAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AlternateRsoAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the alternate rso adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of alternate rso adds.
	 *
	 * @return the number of alternate rso adds
	 */
	public int countAll();

}