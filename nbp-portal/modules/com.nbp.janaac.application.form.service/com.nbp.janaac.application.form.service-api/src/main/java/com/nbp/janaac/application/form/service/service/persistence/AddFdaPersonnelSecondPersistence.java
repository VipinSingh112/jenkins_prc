/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddFdaPersonnelSecondException;
import com.nbp.janaac.application.form.service.model.AddFdaPersonnelSecond;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add fda personnel second service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaPersonnelSecondUtil
 * @generated
 */
@ProviderType
public interface AddFdaPersonnelSecondPersistence
	extends BasePersistence<AddFdaPersonnelSecond> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddFdaPersonnelSecondUtil} to access the add fda personnel second persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add fda personnel seconds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add fda personnel seconds
	 */
	public java.util.List<AddFdaPersonnelSecond> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add fda personnel seconds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel seconds
	 * @param end the upper bound of the range of add fda personnel seconds (not inclusive)
	 * @return the range of matching add fda personnel seconds
	 */
	public java.util.List<AddFdaPersonnelSecond> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add fda personnel seconds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel seconds
	 * @param end the upper bound of the range of add fda personnel seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add fda personnel seconds
	 */
	public java.util.List<AddFdaPersonnelSecond> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaPersonnelSecond>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add fda personnel seconds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel seconds
	 * @param end the upper bound of the range of add fda personnel seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add fda personnel seconds
	 */
	public java.util.List<AddFdaPersonnelSecond> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaPersonnelSecond>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add fda personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda personnel second
	 * @throws NoSuchAddFdaPersonnelSecondException if a matching add fda personnel second could not be found
	 */
	public AddFdaPersonnelSecond findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddFdaPersonnelSecond> orderByComparator)
		throws NoSuchAddFdaPersonnelSecondException;

	/**
	 * Returns the first add fda personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda personnel second, or <code>null</code> if a matching add fda personnel second could not be found
	 */
	public AddFdaPersonnelSecond fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaPersonnelSecond>
			orderByComparator);

	/**
	 * Returns the last add fda personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda personnel second
	 * @throws NoSuchAddFdaPersonnelSecondException if a matching add fda personnel second could not be found
	 */
	public AddFdaPersonnelSecond findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddFdaPersonnelSecond> orderByComparator)
		throws NoSuchAddFdaPersonnelSecondException;

	/**
	 * Returns the last add fda personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda personnel second, or <code>null</code> if a matching add fda personnel second could not be found
	 */
	public AddFdaPersonnelSecond fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaPersonnelSecond>
			orderByComparator);

	/**
	 * Returns the add fda personnel seconds before and after the current add fda personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addFdaPersonnelSecondId the primary key of the current add fda personnel second
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add fda personnel second
	 * @throws NoSuchAddFdaPersonnelSecondException if a add fda personnel second with the primary key could not be found
	 */
	public AddFdaPersonnelSecond[] findBygetJanaacById_PrevAndNext(
			long addFdaPersonnelSecondId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddFdaPersonnelSecond> orderByComparator)
		throws NoSuchAddFdaPersonnelSecondException;

	/**
	 * Removes all the add fda personnel seconds where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add fda personnel seconds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add fda personnel seconds
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add fda personnel second in the entity cache if it is enabled.
	 *
	 * @param addFdaPersonnelSecond the add fda personnel second
	 */
	public void cacheResult(AddFdaPersonnelSecond addFdaPersonnelSecond);

	/**
	 * Caches the add fda personnel seconds in the entity cache if it is enabled.
	 *
	 * @param addFdaPersonnelSeconds the add fda personnel seconds
	 */
	public void cacheResult(
		java.util.List<AddFdaPersonnelSecond> addFdaPersonnelSeconds);

	/**
	 * Creates a new add fda personnel second with the primary key. Does not add the add fda personnel second to the database.
	 *
	 * @param addFdaPersonnelSecondId the primary key for the new add fda personnel second
	 * @return the new add fda personnel second
	 */
	public AddFdaPersonnelSecond create(long addFdaPersonnelSecondId);

	/**
	 * Removes the add fda personnel second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addFdaPersonnelSecondId the primary key of the add fda personnel second
	 * @return the add fda personnel second that was removed
	 * @throws NoSuchAddFdaPersonnelSecondException if a add fda personnel second with the primary key could not be found
	 */
	public AddFdaPersonnelSecond remove(long addFdaPersonnelSecondId)
		throws NoSuchAddFdaPersonnelSecondException;

	public AddFdaPersonnelSecond updateImpl(
		AddFdaPersonnelSecond addFdaPersonnelSecond);

	/**
	 * Returns the add fda personnel second with the primary key or throws a <code>NoSuchAddFdaPersonnelSecondException</code> if it could not be found.
	 *
	 * @param addFdaPersonnelSecondId the primary key of the add fda personnel second
	 * @return the add fda personnel second
	 * @throws NoSuchAddFdaPersonnelSecondException if a add fda personnel second with the primary key could not be found
	 */
	public AddFdaPersonnelSecond findByPrimaryKey(long addFdaPersonnelSecondId)
		throws NoSuchAddFdaPersonnelSecondException;

	/**
	 * Returns the add fda personnel second with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addFdaPersonnelSecondId the primary key of the add fda personnel second
	 * @return the add fda personnel second, or <code>null</code> if a add fda personnel second with the primary key could not be found
	 */
	public AddFdaPersonnelSecond fetchByPrimaryKey(
		long addFdaPersonnelSecondId);

	/**
	 * Returns all the add fda personnel seconds.
	 *
	 * @return the add fda personnel seconds
	 */
	public java.util.List<AddFdaPersonnelSecond> findAll();

	/**
	 * Returns a range of all the add fda personnel seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel seconds
	 * @param end the upper bound of the range of add fda personnel seconds (not inclusive)
	 * @return the range of add fda personnel seconds
	 */
	public java.util.List<AddFdaPersonnelSecond> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add fda personnel seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel seconds
	 * @param end the upper bound of the range of add fda personnel seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add fda personnel seconds
	 */
	public java.util.List<AddFdaPersonnelSecond> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaPersonnelSecond>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add fda personnel seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel seconds
	 * @param end the upper bound of the range of add fda personnel seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add fda personnel seconds
	 */
	public java.util.List<AddFdaPersonnelSecond> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaPersonnelSecond>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add fda personnel seconds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add fda personnel seconds.
	 *
	 * @return the number of add fda personnel seconds
	 */
	public int countAll();

}