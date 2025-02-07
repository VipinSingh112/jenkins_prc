/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddFdaPersonnelFirstException;
import com.nbp.janaac.application.form.service.model.AddFdaPersonnelFirst;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add fda personnel first service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaPersonnelFirstUtil
 * @generated
 */
@ProviderType
public interface AddFdaPersonnelFirstPersistence
	extends BasePersistence<AddFdaPersonnelFirst> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddFdaPersonnelFirstUtil} to access the add fda personnel first persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add fda personnel firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add fda personnel firsts
	 */
	public java.util.List<AddFdaPersonnelFirst> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add fda personnel firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel firsts
	 * @param end the upper bound of the range of add fda personnel firsts (not inclusive)
	 * @return the range of matching add fda personnel firsts
	 */
	public java.util.List<AddFdaPersonnelFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add fda personnel firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel firsts
	 * @param end the upper bound of the range of add fda personnel firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add fda personnel firsts
	 */
	public java.util.List<AddFdaPersonnelFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaPersonnelFirst>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add fda personnel firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel firsts
	 * @param end the upper bound of the range of add fda personnel firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add fda personnel firsts
	 */
	public java.util.List<AddFdaPersonnelFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaPersonnelFirst>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add fda personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda personnel first
	 * @throws NoSuchAddFdaPersonnelFirstException if a matching add fda personnel first could not be found
	 */
	public AddFdaPersonnelFirst findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddFdaPersonnelFirst> orderByComparator)
		throws NoSuchAddFdaPersonnelFirstException;

	/**
	 * Returns the first add fda personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda personnel first, or <code>null</code> if a matching add fda personnel first could not be found
	 */
	public AddFdaPersonnelFirst fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaPersonnelFirst>
			orderByComparator);

	/**
	 * Returns the last add fda personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda personnel first
	 * @throws NoSuchAddFdaPersonnelFirstException if a matching add fda personnel first could not be found
	 */
	public AddFdaPersonnelFirst findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddFdaPersonnelFirst> orderByComparator)
		throws NoSuchAddFdaPersonnelFirstException;

	/**
	 * Returns the last add fda personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda personnel first, or <code>null</code> if a matching add fda personnel first could not be found
	 */
	public AddFdaPersonnelFirst fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaPersonnelFirst>
			orderByComparator);

	/**
	 * Returns the add fda personnel firsts before and after the current add fda personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addFdaPersonnelFirstId the primary key of the current add fda personnel first
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add fda personnel first
	 * @throws NoSuchAddFdaPersonnelFirstException if a add fda personnel first with the primary key could not be found
	 */
	public AddFdaPersonnelFirst[] findBygetJanaacById_PrevAndNext(
			long addFdaPersonnelFirstId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddFdaPersonnelFirst> orderByComparator)
		throws NoSuchAddFdaPersonnelFirstException;

	/**
	 * Removes all the add fda personnel firsts where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add fda personnel firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add fda personnel firsts
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add fda personnel first in the entity cache if it is enabled.
	 *
	 * @param addFdaPersonnelFirst the add fda personnel first
	 */
	public void cacheResult(AddFdaPersonnelFirst addFdaPersonnelFirst);

	/**
	 * Caches the add fda personnel firsts in the entity cache if it is enabled.
	 *
	 * @param addFdaPersonnelFirsts the add fda personnel firsts
	 */
	public void cacheResult(
		java.util.List<AddFdaPersonnelFirst> addFdaPersonnelFirsts);

	/**
	 * Creates a new add fda personnel first with the primary key. Does not add the add fda personnel first to the database.
	 *
	 * @param addFdaPersonnelFirstId the primary key for the new add fda personnel first
	 * @return the new add fda personnel first
	 */
	public AddFdaPersonnelFirst create(long addFdaPersonnelFirstId);

	/**
	 * Removes the add fda personnel first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addFdaPersonnelFirstId the primary key of the add fda personnel first
	 * @return the add fda personnel first that was removed
	 * @throws NoSuchAddFdaPersonnelFirstException if a add fda personnel first with the primary key could not be found
	 */
	public AddFdaPersonnelFirst remove(long addFdaPersonnelFirstId)
		throws NoSuchAddFdaPersonnelFirstException;

	public AddFdaPersonnelFirst updateImpl(
		AddFdaPersonnelFirst addFdaPersonnelFirst);

	/**
	 * Returns the add fda personnel first with the primary key or throws a <code>NoSuchAddFdaPersonnelFirstException</code> if it could not be found.
	 *
	 * @param addFdaPersonnelFirstId the primary key of the add fda personnel first
	 * @return the add fda personnel first
	 * @throws NoSuchAddFdaPersonnelFirstException if a add fda personnel first with the primary key could not be found
	 */
	public AddFdaPersonnelFirst findByPrimaryKey(long addFdaPersonnelFirstId)
		throws NoSuchAddFdaPersonnelFirstException;

	/**
	 * Returns the add fda personnel first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addFdaPersonnelFirstId the primary key of the add fda personnel first
	 * @return the add fda personnel first, or <code>null</code> if a add fda personnel first with the primary key could not be found
	 */
	public AddFdaPersonnelFirst fetchByPrimaryKey(long addFdaPersonnelFirstId);

	/**
	 * Returns all the add fda personnel firsts.
	 *
	 * @return the add fda personnel firsts
	 */
	public java.util.List<AddFdaPersonnelFirst> findAll();

	/**
	 * Returns a range of all the add fda personnel firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel firsts
	 * @param end the upper bound of the range of add fda personnel firsts (not inclusive)
	 * @return the range of add fda personnel firsts
	 */
	public java.util.List<AddFdaPersonnelFirst> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add fda personnel firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel firsts
	 * @param end the upper bound of the range of add fda personnel firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add fda personnel firsts
	 */
	public java.util.List<AddFdaPersonnelFirst> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaPersonnelFirst>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add fda personnel firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel firsts
	 * @param end the upper bound of the range of add fda personnel firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add fda personnel firsts
	 */
	public java.util.List<AddFdaPersonnelFirst> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddFdaPersonnelFirst>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add fda personnel firsts from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add fda personnel firsts.
	 *
	 * @return the number of add fda personnel firsts
	 */
	public int countAll();

}