/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddInsOrgInfoSecondException;
import com.nbp.janaac.application.form.service.model.AddInsOrgInfoSecond;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add ins org info second service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddInsOrgInfoSecondUtil
 * @generated
 */
@ProviderType
public interface AddInsOrgInfoSecondPersistence
	extends BasePersistence<AddInsOrgInfoSecond> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddInsOrgInfoSecondUtil} to access the add ins org info second persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add ins org info seconds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add ins org info seconds
	 */
	public java.util.List<AddInsOrgInfoSecond> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add ins org info seconds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoSecondModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info seconds
	 * @param end the upper bound of the range of add ins org info seconds (not inclusive)
	 * @return the range of matching add ins org info seconds
	 */
	public java.util.List<AddInsOrgInfoSecond> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add ins org info seconds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoSecondModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info seconds
	 * @param end the upper bound of the range of add ins org info seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add ins org info seconds
	 */
	public java.util.List<AddInsOrgInfoSecond> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddInsOrgInfoSecond>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add ins org info seconds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoSecondModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info seconds
	 * @param end the upper bound of the range of add ins org info seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add ins org info seconds
	 */
	public java.util.List<AddInsOrgInfoSecond> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddInsOrgInfoSecond>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add ins org info second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add ins org info second
	 * @throws NoSuchAddInsOrgInfoSecondException if a matching add ins org info second could not be found
	 */
	public AddInsOrgInfoSecond findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddInsOrgInfoSecond> orderByComparator)
		throws NoSuchAddInsOrgInfoSecondException;

	/**
	 * Returns the first add ins org info second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add ins org info second, or <code>null</code> if a matching add ins org info second could not be found
	 */
	public AddInsOrgInfoSecond fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddInsOrgInfoSecond>
			orderByComparator);

	/**
	 * Returns the last add ins org info second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add ins org info second
	 * @throws NoSuchAddInsOrgInfoSecondException if a matching add ins org info second could not be found
	 */
	public AddInsOrgInfoSecond findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddInsOrgInfoSecond> orderByComparator)
		throws NoSuchAddInsOrgInfoSecondException;

	/**
	 * Returns the last add ins org info second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add ins org info second, or <code>null</code> if a matching add ins org info second could not be found
	 */
	public AddInsOrgInfoSecond fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddInsOrgInfoSecond>
			orderByComparator);

	/**
	 * Returns the add ins org info seconds before and after the current add ins org info second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addInsOrgInfoSecondId the primary key of the current add ins org info second
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add ins org info second
	 * @throws NoSuchAddInsOrgInfoSecondException if a add ins org info second with the primary key could not be found
	 */
	public AddInsOrgInfoSecond[] findBygetJanaacById_PrevAndNext(
			long addInsOrgInfoSecondId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddInsOrgInfoSecond> orderByComparator)
		throws NoSuchAddInsOrgInfoSecondException;

	/**
	 * Removes all the add ins org info seconds where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add ins org info seconds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add ins org info seconds
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add ins org info second in the entity cache if it is enabled.
	 *
	 * @param addInsOrgInfoSecond the add ins org info second
	 */
	public void cacheResult(AddInsOrgInfoSecond addInsOrgInfoSecond);

	/**
	 * Caches the add ins org info seconds in the entity cache if it is enabled.
	 *
	 * @param addInsOrgInfoSeconds the add ins org info seconds
	 */
	public void cacheResult(
		java.util.List<AddInsOrgInfoSecond> addInsOrgInfoSeconds);

	/**
	 * Creates a new add ins org info second with the primary key. Does not add the add ins org info second to the database.
	 *
	 * @param addInsOrgInfoSecondId the primary key for the new add ins org info second
	 * @return the new add ins org info second
	 */
	public AddInsOrgInfoSecond create(long addInsOrgInfoSecondId);

	/**
	 * Removes the add ins org info second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addInsOrgInfoSecondId the primary key of the add ins org info second
	 * @return the add ins org info second that was removed
	 * @throws NoSuchAddInsOrgInfoSecondException if a add ins org info second with the primary key could not be found
	 */
	public AddInsOrgInfoSecond remove(long addInsOrgInfoSecondId)
		throws NoSuchAddInsOrgInfoSecondException;

	public AddInsOrgInfoSecond updateImpl(
		AddInsOrgInfoSecond addInsOrgInfoSecond);

	/**
	 * Returns the add ins org info second with the primary key or throws a <code>NoSuchAddInsOrgInfoSecondException</code> if it could not be found.
	 *
	 * @param addInsOrgInfoSecondId the primary key of the add ins org info second
	 * @return the add ins org info second
	 * @throws NoSuchAddInsOrgInfoSecondException if a add ins org info second with the primary key could not be found
	 */
	public AddInsOrgInfoSecond findByPrimaryKey(long addInsOrgInfoSecondId)
		throws NoSuchAddInsOrgInfoSecondException;

	/**
	 * Returns the add ins org info second with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addInsOrgInfoSecondId the primary key of the add ins org info second
	 * @return the add ins org info second, or <code>null</code> if a add ins org info second with the primary key could not be found
	 */
	public AddInsOrgInfoSecond fetchByPrimaryKey(long addInsOrgInfoSecondId);

	/**
	 * Returns all the add ins org info seconds.
	 *
	 * @return the add ins org info seconds
	 */
	public java.util.List<AddInsOrgInfoSecond> findAll();

	/**
	 * Returns a range of all the add ins org info seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info seconds
	 * @param end the upper bound of the range of add ins org info seconds (not inclusive)
	 * @return the range of add ins org info seconds
	 */
	public java.util.List<AddInsOrgInfoSecond> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add ins org info seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info seconds
	 * @param end the upper bound of the range of add ins org info seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add ins org info seconds
	 */
	public java.util.List<AddInsOrgInfoSecond> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddInsOrgInfoSecond>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add ins org info seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info seconds
	 * @param end the upper bound of the range of add ins org info seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add ins org info seconds
	 */
	public java.util.List<AddInsOrgInfoSecond> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddInsOrgInfoSecond>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add ins org info seconds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add ins org info seconds.
	 *
	 * @return the number of add ins org info seconds
	 */
	public int countAll();

}