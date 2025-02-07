/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddPhyResourceFirstException;
import com.nbp.janaac.application.form.service.model.AddPhyResourceFirst;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add phy resource first service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddPhyResourceFirstUtil
 * @generated
 */
@ProviderType
public interface AddPhyResourceFirstPersistence
	extends BasePersistence<AddPhyResourceFirst> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddPhyResourceFirstUtil} to access the add phy resource first persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add phy resource firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add phy resource firsts
	 */
	public java.util.List<AddPhyResourceFirst> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add phy resource firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add phy resource firsts
	 * @param end the upper bound of the range of add phy resource firsts (not inclusive)
	 * @return the range of matching add phy resource firsts
	 */
	public java.util.List<AddPhyResourceFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add phy resource firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add phy resource firsts
	 * @param end the upper bound of the range of add phy resource firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add phy resource firsts
	 */
	public java.util.List<AddPhyResourceFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddPhyResourceFirst>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add phy resource firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add phy resource firsts
	 * @param end the upper bound of the range of add phy resource firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add phy resource firsts
	 */
	public java.util.List<AddPhyResourceFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddPhyResourceFirst>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add phy resource first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add phy resource first
	 * @throws NoSuchAddPhyResourceFirstException if a matching add phy resource first could not be found
	 */
	public AddPhyResourceFirst findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddPhyResourceFirst> orderByComparator)
		throws NoSuchAddPhyResourceFirstException;

	/**
	 * Returns the first add phy resource first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add phy resource first, or <code>null</code> if a matching add phy resource first could not be found
	 */
	public AddPhyResourceFirst fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddPhyResourceFirst>
			orderByComparator);

	/**
	 * Returns the last add phy resource first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add phy resource first
	 * @throws NoSuchAddPhyResourceFirstException if a matching add phy resource first could not be found
	 */
	public AddPhyResourceFirst findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddPhyResourceFirst> orderByComparator)
		throws NoSuchAddPhyResourceFirstException;

	/**
	 * Returns the last add phy resource first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add phy resource first, or <code>null</code> if a matching add phy resource first could not be found
	 */
	public AddPhyResourceFirst fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddPhyResourceFirst>
			orderByComparator);

	/**
	 * Returns the add phy resource firsts before and after the current add phy resource first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addPhyResourceFirstId the primary key of the current add phy resource first
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add phy resource first
	 * @throws NoSuchAddPhyResourceFirstException if a add phy resource first with the primary key could not be found
	 */
	public AddPhyResourceFirst[] findBygetJanaacById_PrevAndNext(
			long addPhyResourceFirstId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddPhyResourceFirst> orderByComparator)
		throws NoSuchAddPhyResourceFirstException;

	/**
	 * Removes all the add phy resource firsts where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add phy resource firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add phy resource firsts
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add phy resource first in the entity cache if it is enabled.
	 *
	 * @param addPhyResourceFirst the add phy resource first
	 */
	public void cacheResult(AddPhyResourceFirst addPhyResourceFirst);

	/**
	 * Caches the add phy resource firsts in the entity cache if it is enabled.
	 *
	 * @param addPhyResourceFirsts the add phy resource firsts
	 */
	public void cacheResult(
		java.util.List<AddPhyResourceFirst> addPhyResourceFirsts);

	/**
	 * Creates a new add phy resource first with the primary key. Does not add the add phy resource first to the database.
	 *
	 * @param addPhyResourceFirstId the primary key for the new add phy resource first
	 * @return the new add phy resource first
	 */
	public AddPhyResourceFirst create(long addPhyResourceFirstId);

	/**
	 * Removes the add phy resource first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addPhyResourceFirstId the primary key of the add phy resource first
	 * @return the add phy resource first that was removed
	 * @throws NoSuchAddPhyResourceFirstException if a add phy resource first with the primary key could not be found
	 */
	public AddPhyResourceFirst remove(long addPhyResourceFirstId)
		throws NoSuchAddPhyResourceFirstException;

	public AddPhyResourceFirst updateImpl(
		AddPhyResourceFirst addPhyResourceFirst);

	/**
	 * Returns the add phy resource first with the primary key or throws a <code>NoSuchAddPhyResourceFirstException</code> if it could not be found.
	 *
	 * @param addPhyResourceFirstId the primary key of the add phy resource first
	 * @return the add phy resource first
	 * @throws NoSuchAddPhyResourceFirstException if a add phy resource first with the primary key could not be found
	 */
	public AddPhyResourceFirst findByPrimaryKey(long addPhyResourceFirstId)
		throws NoSuchAddPhyResourceFirstException;

	/**
	 * Returns the add phy resource first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addPhyResourceFirstId the primary key of the add phy resource first
	 * @return the add phy resource first, or <code>null</code> if a add phy resource first with the primary key could not be found
	 */
	public AddPhyResourceFirst fetchByPrimaryKey(long addPhyResourceFirstId);

	/**
	 * Returns all the add phy resource firsts.
	 *
	 * @return the add phy resource firsts
	 */
	public java.util.List<AddPhyResourceFirst> findAll();

	/**
	 * Returns a range of all the add phy resource firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add phy resource firsts
	 * @param end the upper bound of the range of add phy resource firsts (not inclusive)
	 * @return the range of add phy resource firsts
	 */
	public java.util.List<AddPhyResourceFirst> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add phy resource firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add phy resource firsts
	 * @param end the upper bound of the range of add phy resource firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add phy resource firsts
	 */
	public java.util.List<AddPhyResourceFirst> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddPhyResourceFirst>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add phy resource firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddPhyResourceFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add phy resource firsts
	 * @param end the upper bound of the range of add phy resource firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add phy resource firsts
	 */
	public java.util.List<AddPhyResourceFirst> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddPhyResourceFirst>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add phy resource firsts from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add phy resource firsts.
	 *
	 * @return the number of add phy resource firsts
	 */
	public int countAll();

}