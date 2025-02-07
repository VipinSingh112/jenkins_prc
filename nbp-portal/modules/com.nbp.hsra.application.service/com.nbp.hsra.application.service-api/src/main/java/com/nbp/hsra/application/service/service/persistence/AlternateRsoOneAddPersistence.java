/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchAlternateRsoOneAddException;
import com.nbp.hsra.application.service.model.AlternateRsoOneAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the alternate rso one add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AlternateRsoOneAddUtil
 * @generated
 */
@ProviderType
public interface AlternateRsoOneAddPersistence
	extends BasePersistence<AlternateRsoOneAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AlternateRsoOneAddUtil} to access the alternate rso one add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the alternate rso one adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching alternate rso one adds
	 */
	public java.util.List<AlternateRsoOneAdd> findBygetHsraById(
		long hsraApplicationId);

	/**
	 * Returns a range of all the alternate rso one adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of alternate rso one adds
	 * @param end the upper bound of the range of alternate rso one adds (not inclusive)
	 * @return the range of matching alternate rso one adds
	 */
	public java.util.List<AlternateRsoOneAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the alternate rso one adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of alternate rso one adds
	 * @param end the upper bound of the range of alternate rso one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching alternate rso one adds
	 */
	public java.util.List<AlternateRsoOneAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AlternateRsoOneAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the alternate rso one adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of alternate rso one adds
	 * @param end the upper bound of the range of alternate rso one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching alternate rso one adds
	 */
	public java.util.List<AlternateRsoOneAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AlternateRsoOneAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first alternate rso one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching alternate rso one add
	 * @throws NoSuchAlternateRsoOneAddException if a matching alternate rso one add could not be found
	 */
	public AlternateRsoOneAdd findBygetHsraById_First(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AlternateRsoOneAdd>
				orderByComparator)
		throws NoSuchAlternateRsoOneAddException;

	/**
	 * Returns the first alternate rso one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching alternate rso one add, or <code>null</code> if a matching alternate rso one add could not be found
	 */
	public AlternateRsoOneAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AlternateRsoOneAdd>
			orderByComparator);

	/**
	 * Returns the last alternate rso one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching alternate rso one add
	 * @throws NoSuchAlternateRsoOneAddException if a matching alternate rso one add could not be found
	 */
	public AlternateRsoOneAdd findBygetHsraById_Last(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AlternateRsoOneAdd>
				orderByComparator)
		throws NoSuchAlternateRsoOneAddException;

	/**
	 * Returns the last alternate rso one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching alternate rso one add, or <code>null</code> if a matching alternate rso one add could not be found
	 */
	public AlternateRsoOneAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AlternateRsoOneAdd>
			orderByComparator);

	/**
	 * Returns the alternate rso one adds before and after the current alternate rso one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param alternateRsoOneAddId the primary key of the current alternate rso one add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next alternate rso one add
	 * @throws NoSuchAlternateRsoOneAddException if a alternate rso one add with the primary key could not be found
	 */
	public AlternateRsoOneAdd[] findBygetHsraById_PrevAndNext(
			long alternateRsoOneAddId, long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AlternateRsoOneAdd>
				orderByComparator)
		throws NoSuchAlternateRsoOneAddException;

	/**
	 * Removes all the alternate rso one adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public void removeBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the number of alternate rso one adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching alternate rso one adds
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the alternate rso one add in the entity cache if it is enabled.
	 *
	 * @param alternateRsoOneAdd the alternate rso one add
	 */
	public void cacheResult(AlternateRsoOneAdd alternateRsoOneAdd);

	/**
	 * Caches the alternate rso one adds in the entity cache if it is enabled.
	 *
	 * @param alternateRsoOneAdds the alternate rso one adds
	 */
	public void cacheResult(
		java.util.List<AlternateRsoOneAdd> alternateRsoOneAdds);

	/**
	 * Creates a new alternate rso one add with the primary key. Does not add the alternate rso one add to the database.
	 *
	 * @param alternateRsoOneAddId the primary key for the new alternate rso one add
	 * @return the new alternate rso one add
	 */
	public AlternateRsoOneAdd create(long alternateRsoOneAddId);

	/**
	 * Removes the alternate rso one add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param alternateRsoOneAddId the primary key of the alternate rso one add
	 * @return the alternate rso one add that was removed
	 * @throws NoSuchAlternateRsoOneAddException if a alternate rso one add with the primary key could not be found
	 */
	public AlternateRsoOneAdd remove(long alternateRsoOneAddId)
		throws NoSuchAlternateRsoOneAddException;

	public AlternateRsoOneAdd updateImpl(AlternateRsoOneAdd alternateRsoOneAdd);

	/**
	 * Returns the alternate rso one add with the primary key or throws a <code>NoSuchAlternateRsoOneAddException</code> if it could not be found.
	 *
	 * @param alternateRsoOneAddId the primary key of the alternate rso one add
	 * @return the alternate rso one add
	 * @throws NoSuchAlternateRsoOneAddException if a alternate rso one add with the primary key could not be found
	 */
	public AlternateRsoOneAdd findByPrimaryKey(long alternateRsoOneAddId)
		throws NoSuchAlternateRsoOneAddException;

	/**
	 * Returns the alternate rso one add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param alternateRsoOneAddId the primary key of the alternate rso one add
	 * @return the alternate rso one add, or <code>null</code> if a alternate rso one add with the primary key could not be found
	 */
	public AlternateRsoOneAdd fetchByPrimaryKey(long alternateRsoOneAddId);

	/**
	 * Returns all the alternate rso one adds.
	 *
	 * @return the alternate rso one adds
	 */
	public java.util.List<AlternateRsoOneAdd> findAll();

	/**
	 * Returns a range of all the alternate rso one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of alternate rso one adds
	 * @param end the upper bound of the range of alternate rso one adds (not inclusive)
	 * @return the range of alternate rso one adds
	 */
	public java.util.List<AlternateRsoOneAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the alternate rso one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of alternate rso one adds
	 * @param end the upper bound of the range of alternate rso one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of alternate rso one adds
	 */
	public java.util.List<AlternateRsoOneAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AlternateRsoOneAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the alternate rso one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of alternate rso one adds
	 * @param end the upper bound of the range of alternate rso one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of alternate rso one adds
	 */
	public java.util.List<AlternateRsoOneAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AlternateRsoOneAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the alternate rso one adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of alternate rso one adds.
	 *
	 * @return the number of alternate rso one adds
	 */
	public int countAll();

}