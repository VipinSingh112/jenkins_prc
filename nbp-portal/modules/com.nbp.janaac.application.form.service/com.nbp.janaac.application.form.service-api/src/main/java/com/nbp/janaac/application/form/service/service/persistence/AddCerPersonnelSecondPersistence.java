/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddCerPersonnelSecondException;
import com.nbp.janaac.application.form.service.model.AddCerPersonnelSecond;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add cer personnel second service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddCerPersonnelSecondUtil
 * @generated
 */
@ProviderType
public interface AddCerPersonnelSecondPersistence
	extends BasePersistence<AddCerPersonnelSecond> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddCerPersonnelSecondUtil} to access the add cer personnel second persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add cer personnel seconds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add cer personnel seconds
	 */
	public java.util.List<AddCerPersonnelSecond> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add cer personnel seconds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer personnel seconds
	 * @param end the upper bound of the range of add cer personnel seconds (not inclusive)
	 * @return the range of matching add cer personnel seconds
	 */
	public java.util.List<AddCerPersonnelSecond> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add cer personnel seconds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer personnel seconds
	 * @param end the upper bound of the range of add cer personnel seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add cer personnel seconds
	 */
	public java.util.List<AddCerPersonnelSecond> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddCerPersonnelSecond>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add cer personnel seconds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer personnel seconds
	 * @param end the upper bound of the range of add cer personnel seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add cer personnel seconds
	 */
	public java.util.List<AddCerPersonnelSecond> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddCerPersonnelSecond>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add cer personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer personnel second
	 * @throws NoSuchAddCerPersonnelSecondException if a matching add cer personnel second could not be found
	 */
	public AddCerPersonnelSecond findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddCerPersonnelSecond> orderByComparator)
		throws NoSuchAddCerPersonnelSecondException;

	/**
	 * Returns the first add cer personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer personnel second, or <code>null</code> if a matching add cer personnel second could not be found
	 */
	public AddCerPersonnelSecond fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddCerPersonnelSecond>
			orderByComparator);

	/**
	 * Returns the last add cer personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer personnel second
	 * @throws NoSuchAddCerPersonnelSecondException if a matching add cer personnel second could not be found
	 */
	public AddCerPersonnelSecond findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddCerPersonnelSecond> orderByComparator)
		throws NoSuchAddCerPersonnelSecondException;

	/**
	 * Returns the last add cer personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer personnel second, or <code>null</code> if a matching add cer personnel second could not be found
	 */
	public AddCerPersonnelSecond fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddCerPersonnelSecond>
			orderByComparator);

	/**
	 * Returns the add cer personnel seconds before and after the current add cer personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addCerPersonnelSecondId the primary key of the current add cer personnel second
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add cer personnel second
	 * @throws NoSuchAddCerPersonnelSecondException if a add cer personnel second with the primary key could not be found
	 */
	public AddCerPersonnelSecond[] findBygetJanaacById_PrevAndNext(
			long addCerPersonnelSecondId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddCerPersonnelSecond> orderByComparator)
		throws NoSuchAddCerPersonnelSecondException;

	/**
	 * Removes all the add cer personnel seconds where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add cer personnel seconds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add cer personnel seconds
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add cer personnel second in the entity cache if it is enabled.
	 *
	 * @param addCerPersonnelSecond the add cer personnel second
	 */
	public void cacheResult(AddCerPersonnelSecond addCerPersonnelSecond);

	/**
	 * Caches the add cer personnel seconds in the entity cache if it is enabled.
	 *
	 * @param addCerPersonnelSeconds the add cer personnel seconds
	 */
	public void cacheResult(
		java.util.List<AddCerPersonnelSecond> addCerPersonnelSeconds);

	/**
	 * Creates a new add cer personnel second with the primary key. Does not add the add cer personnel second to the database.
	 *
	 * @param addCerPersonnelSecondId the primary key for the new add cer personnel second
	 * @return the new add cer personnel second
	 */
	public AddCerPersonnelSecond create(long addCerPersonnelSecondId);

	/**
	 * Removes the add cer personnel second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addCerPersonnelSecondId the primary key of the add cer personnel second
	 * @return the add cer personnel second that was removed
	 * @throws NoSuchAddCerPersonnelSecondException if a add cer personnel second with the primary key could not be found
	 */
	public AddCerPersonnelSecond remove(long addCerPersonnelSecondId)
		throws NoSuchAddCerPersonnelSecondException;

	public AddCerPersonnelSecond updateImpl(
		AddCerPersonnelSecond addCerPersonnelSecond);

	/**
	 * Returns the add cer personnel second with the primary key or throws a <code>NoSuchAddCerPersonnelSecondException</code> if it could not be found.
	 *
	 * @param addCerPersonnelSecondId the primary key of the add cer personnel second
	 * @return the add cer personnel second
	 * @throws NoSuchAddCerPersonnelSecondException if a add cer personnel second with the primary key could not be found
	 */
	public AddCerPersonnelSecond findByPrimaryKey(long addCerPersonnelSecondId)
		throws NoSuchAddCerPersonnelSecondException;

	/**
	 * Returns the add cer personnel second with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addCerPersonnelSecondId the primary key of the add cer personnel second
	 * @return the add cer personnel second, or <code>null</code> if a add cer personnel second with the primary key could not be found
	 */
	public AddCerPersonnelSecond fetchByPrimaryKey(
		long addCerPersonnelSecondId);

	/**
	 * Returns all the add cer personnel seconds.
	 *
	 * @return the add cer personnel seconds
	 */
	public java.util.List<AddCerPersonnelSecond> findAll();

	/**
	 * Returns a range of all the add cer personnel seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel seconds
	 * @param end the upper bound of the range of add cer personnel seconds (not inclusive)
	 * @return the range of add cer personnel seconds
	 */
	public java.util.List<AddCerPersonnelSecond> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add cer personnel seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel seconds
	 * @param end the upper bound of the range of add cer personnel seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add cer personnel seconds
	 */
	public java.util.List<AddCerPersonnelSecond> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddCerPersonnelSecond>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add cer personnel seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel seconds
	 * @param end the upper bound of the range of add cer personnel seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add cer personnel seconds
	 */
	public java.util.List<AddCerPersonnelSecond> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddCerPersonnelSecond>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add cer personnel seconds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add cer personnel seconds.
	 *
	 * @return the number of add cer personnel seconds
	 */
	public int countAll();

}