/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddFdaPersonnelFourException;
import com.nbp.janaac.application.form.service.model.AddFdaPersonnelFour;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add fda personnel four service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaPersonnelFourUtil
 * @generated
 */
@ProviderType
public interface AddFdaPersonnelFourPersistence
	extends BasePersistence<AddFdaPersonnelFour> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddFdaPersonnelFourUtil} to access the add fda personnel four persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add fda personnel fours where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add fda personnel fours
	 */
	public java.util.List<AddFdaPersonnelFour> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add fda personnel fours where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFourModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel fours
	 * @param end the upper bound of the range of add fda personnel fours (not inclusive)
	 * @return the range of matching add fda personnel fours
	 */
	public java.util.List<AddFdaPersonnelFour> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add fda personnel fours where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFourModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel fours
	 * @param end the upper bound of the range of add fda personnel fours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add fda personnel fours
	 */
	public java.util.List<AddFdaPersonnelFour> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaPersonnelFour>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add fda personnel fours where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFourModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel fours
	 * @param end the upper bound of the range of add fda personnel fours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add fda personnel fours
	 */
	public java.util.List<AddFdaPersonnelFour> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaPersonnelFour>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add fda personnel four in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda personnel four
	 * @throws NoSuchAddFdaPersonnelFourException if a matching add fda personnel four could not be found
	 */
	public AddFdaPersonnelFour findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddFdaPersonnelFour> orderByComparator)
		throws NoSuchAddFdaPersonnelFourException;

	/**
	 * Returns the first add fda personnel four in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda personnel four, or <code>null</code> if a matching add fda personnel four could not be found
	 */
	public AddFdaPersonnelFour fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaPersonnelFour>
			orderByComparator);

	/**
	 * Returns the last add fda personnel four in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda personnel four
	 * @throws NoSuchAddFdaPersonnelFourException if a matching add fda personnel four could not be found
	 */
	public AddFdaPersonnelFour findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddFdaPersonnelFour> orderByComparator)
		throws NoSuchAddFdaPersonnelFourException;

	/**
	 * Returns the last add fda personnel four in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda personnel four, or <code>null</code> if a matching add fda personnel four could not be found
	 */
	public AddFdaPersonnelFour fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaPersonnelFour>
			orderByComparator);

	/**
	 * Returns the add fda personnel fours before and after the current add fda personnel four in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addFdaPersonnelFourId the primary key of the current add fda personnel four
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add fda personnel four
	 * @throws NoSuchAddFdaPersonnelFourException if a add fda personnel four with the primary key could not be found
	 */
	public AddFdaPersonnelFour[] findBygetJanaacById_PrevAndNext(
			long addFdaPersonnelFourId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddFdaPersonnelFour> orderByComparator)
		throws NoSuchAddFdaPersonnelFourException;

	/**
	 * Removes all the add fda personnel fours where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add fda personnel fours where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add fda personnel fours
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add fda personnel four in the entity cache if it is enabled.
	 *
	 * @param addFdaPersonnelFour the add fda personnel four
	 */
	public void cacheResult(AddFdaPersonnelFour addFdaPersonnelFour);

	/**
	 * Caches the add fda personnel fours in the entity cache if it is enabled.
	 *
	 * @param addFdaPersonnelFours the add fda personnel fours
	 */
	public void cacheResult(
		java.util.List<AddFdaPersonnelFour> addFdaPersonnelFours);

	/**
	 * Creates a new add fda personnel four with the primary key. Does not add the add fda personnel four to the database.
	 *
	 * @param addFdaPersonnelFourId the primary key for the new add fda personnel four
	 * @return the new add fda personnel four
	 */
	public AddFdaPersonnelFour create(long addFdaPersonnelFourId);

	/**
	 * Removes the add fda personnel four with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addFdaPersonnelFourId the primary key of the add fda personnel four
	 * @return the add fda personnel four that was removed
	 * @throws NoSuchAddFdaPersonnelFourException if a add fda personnel four with the primary key could not be found
	 */
	public AddFdaPersonnelFour remove(long addFdaPersonnelFourId)
		throws NoSuchAddFdaPersonnelFourException;

	public AddFdaPersonnelFour updateImpl(
		AddFdaPersonnelFour addFdaPersonnelFour);

	/**
	 * Returns the add fda personnel four with the primary key or throws a <code>NoSuchAddFdaPersonnelFourException</code> if it could not be found.
	 *
	 * @param addFdaPersonnelFourId the primary key of the add fda personnel four
	 * @return the add fda personnel four
	 * @throws NoSuchAddFdaPersonnelFourException if a add fda personnel four with the primary key could not be found
	 */
	public AddFdaPersonnelFour findByPrimaryKey(long addFdaPersonnelFourId)
		throws NoSuchAddFdaPersonnelFourException;

	/**
	 * Returns the add fda personnel four with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addFdaPersonnelFourId the primary key of the add fda personnel four
	 * @return the add fda personnel four, or <code>null</code> if a add fda personnel four with the primary key could not be found
	 */
	public AddFdaPersonnelFour fetchByPrimaryKey(long addFdaPersonnelFourId);

	/**
	 * Returns all the add fda personnel fours.
	 *
	 * @return the add fda personnel fours
	 */
	public java.util.List<AddFdaPersonnelFour> findAll();

	/**
	 * Returns a range of all the add fda personnel fours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel fours
	 * @param end the upper bound of the range of add fda personnel fours (not inclusive)
	 * @return the range of add fda personnel fours
	 */
	public java.util.List<AddFdaPersonnelFour> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add fda personnel fours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel fours
	 * @param end the upper bound of the range of add fda personnel fours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add fda personnel fours
	 */
	public java.util.List<AddFdaPersonnelFour> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaPersonnelFour>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add fda personnel fours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel fours
	 * @param end the upper bound of the range of add fda personnel fours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add fda personnel fours
	 */
	public java.util.List<AddFdaPersonnelFour> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaPersonnelFour>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add fda personnel fours from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add fda personnel fours.
	 *
	 * @return the number of add fda personnel fours
	 */
	public int countAll();

}