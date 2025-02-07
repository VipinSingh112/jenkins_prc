/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddLabResourceReqFirstException;
import com.nbp.janaac.application.form.service.model.AddLabResourceReqFirst;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add lab resource req first service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabResourceReqFirstUtil
 * @generated
 */
@ProviderType
public interface AddLabResourceReqFirstPersistence
	extends BasePersistence<AddLabResourceReqFirst> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddLabResourceReqFirstUtil} to access the add lab resource req first persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add lab resource req firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab resource req firsts
	 */
	public java.util.List<AddLabResourceReqFirst> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add lab resource req firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab resource req firsts
	 * @param end the upper bound of the range of add lab resource req firsts (not inclusive)
	 * @return the range of matching add lab resource req firsts
	 */
	public java.util.List<AddLabResourceReqFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add lab resource req firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab resource req firsts
	 * @param end the upper bound of the range of add lab resource req firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab resource req firsts
	 */
	public java.util.List<AddLabResourceReqFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabResourceReqFirst>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add lab resource req firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab resource req firsts
	 * @param end the upper bound of the range of add lab resource req firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab resource req firsts
	 */
	public java.util.List<AddLabResourceReqFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabResourceReqFirst>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add lab resource req first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab resource req first
	 * @throws NoSuchAddLabResourceReqFirstException if a matching add lab resource req first could not be found
	 */
	public AddLabResourceReqFirst findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLabResourceReqFirst> orderByComparator)
		throws NoSuchAddLabResourceReqFirstException;

	/**
	 * Returns the first add lab resource req first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab resource req first, or <code>null</code> if a matching add lab resource req first could not be found
	 */
	public AddLabResourceReqFirst fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabResourceReqFirst>
			orderByComparator);

	/**
	 * Returns the last add lab resource req first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab resource req first
	 * @throws NoSuchAddLabResourceReqFirstException if a matching add lab resource req first could not be found
	 */
	public AddLabResourceReqFirst findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLabResourceReqFirst> orderByComparator)
		throws NoSuchAddLabResourceReqFirstException;

	/**
	 * Returns the last add lab resource req first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab resource req first, or <code>null</code> if a matching add lab resource req first could not be found
	 */
	public AddLabResourceReqFirst fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabResourceReqFirst>
			orderByComparator);

	/**
	 * Returns the add lab resource req firsts before and after the current add lab resource req first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabResourceReqFirstId the primary key of the current add lab resource req first
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab resource req first
	 * @throws NoSuchAddLabResourceReqFirstException if a add lab resource req first with the primary key could not be found
	 */
	public AddLabResourceReqFirst[] findBygetJanaacById_PrevAndNext(
			long addLabResourceReqFirstId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLabResourceReqFirst> orderByComparator)
		throws NoSuchAddLabResourceReqFirstException;

	/**
	 * Removes all the add lab resource req firsts where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add lab resource req firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab resource req firsts
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add lab resource req first in the entity cache if it is enabled.
	 *
	 * @param addLabResourceReqFirst the add lab resource req first
	 */
	public void cacheResult(AddLabResourceReqFirst addLabResourceReqFirst);

	/**
	 * Caches the add lab resource req firsts in the entity cache if it is enabled.
	 *
	 * @param addLabResourceReqFirsts the add lab resource req firsts
	 */
	public void cacheResult(
		java.util.List<AddLabResourceReqFirst> addLabResourceReqFirsts);

	/**
	 * Creates a new add lab resource req first with the primary key. Does not add the add lab resource req first to the database.
	 *
	 * @param addLabResourceReqFirstId the primary key for the new add lab resource req first
	 * @return the new add lab resource req first
	 */
	public AddLabResourceReqFirst create(long addLabResourceReqFirstId);

	/**
	 * Removes the add lab resource req first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabResourceReqFirstId the primary key of the add lab resource req first
	 * @return the add lab resource req first that was removed
	 * @throws NoSuchAddLabResourceReqFirstException if a add lab resource req first with the primary key could not be found
	 */
	public AddLabResourceReqFirst remove(long addLabResourceReqFirstId)
		throws NoSuchAddLabResourceReqFirstException;

	public AddLabResourceReqFirst updateImpl(
		AddLabResourceReqFirst addLabResourceReqFirst);

	/**
	 * Returns the add lab resource req first with the primary key or throws a <code>NoSuchAddLabResourceReqFirstException</code> if it could not be found.
	 *
	 * @param addLabResourceReqFirstId the primary key of the add lab resource req first
	 * @return the add lab resource req first
	 * @throws NoSuchAddLabResourceReqFirstException if a add lab resource req first with the primary key could not be found
	 */
	public AddLabResourceReqFirst findByPrimaryKey(
			long addLabResourceReqFirstId)
		throws NoSuchAddLabResourceReqFirstException;

	/**
	 * Returns the add lab resource req first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabResourceReqFirstId the primary key of the add lab resource req first
	 * @return the add lab resource req first, or <code>null</code> if a add lab resource req first with the primary key could not be found
	 */
	public AddLabResourceReqFirst fetchByPrimaryKey(
		long addLabResourceReqFirstId);

	/**
	 * Returns all the add lab resource req firsts.
	 *
	 * @return the add lab resource req firsts
	 */
	public java.util.List<AddLabResourceReqFirst> findAll();

	/**
	 * Returns a range of all the add lab resource req firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab resource req firsts
	 * @param end the upper bound of the range of add lab resource req firsts (not inclusive)
	 * @return the range of add lab resource req firsts
	 */
	public java.util.List<AddLabResourceReqFirst> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add lab resource req firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab resource req firsts
	 * @param end the upper bound of the range of add lab resource req firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab resource req firsts
	 */
	public java.util.List<AddLabResourceReqFirst> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabResourceReqFirst>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add lab resource req firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabResourceReqFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab resource req firsts
	 * @param end the upper bound of the range of add lab resource req firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab resource req firsts
	 */
	public java.util.List<AddLabResourceReqFirst> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabResourceReqFirst>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add lab resource req firsts from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add lab resource req firsts.
	 *
	 * @return the number of add lab resource req firsts
	 */
	public int countAll();

}