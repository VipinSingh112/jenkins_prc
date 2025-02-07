/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddCerPersonnelFirstException;
import com.nbp.janaac.application.form.service.model.AddCerPersonnelFirst;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add cer personnel first service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddCerPersonnelFirstUtil
 * @generated
 */
@ProviderType
public interface AddCerPersonnelFirstPersistence
	extends BasePersistence<AddCerPersonnelFirst> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddCerPersonnelFirstUtil} to access the add cer personnel first persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add cer personnel firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add cer personnel firsts
	 */
	public java.util.List<AddCerPersonnelFirst> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add cer personnel firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer personnel firsts
	 * @param end the upper bound of the range of add cer personnel firsts (not inclusive)
	 * @return the range of matching add cer personnel firsts
	 */
	public java.util.List<AddCerPersonnelFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add cer personnel firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer personnel firsts
	 * @param end the upper bound of the range of add cer personnel firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add cer personnel firsts
	 */
	public java.util.List<AddCerPersonnelFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddCerPersonnelFirst>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add cer personnel firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer personnel firsts
	 * @param end the upper bound of the range of add cer personnel firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add cer personnel firsts
	 */
	public java.util.List<AddCerPersonnelFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddCerPersonnelFirst>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add cer personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer personnel first
	 * @throws NoSuchAddCerPersonnelFirstException if a matching add cer personnel first could not be found
	 */
	public AddCerPersonnelFirst findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddCerPersonnelFirst> orderByComparator)
		throws NoSuchAddCerPersonnelFirstException;

	/**
	 * Returns the first add cer personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer personnel first, or <code>null</code> if a matching add cer personnel first could not be found
	 */
	public AddCerPersonnelFirst fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddCerPersonnelFirst>
			orderByComparator);

	/**
	 * Returns the last add cer personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer personnel first
	 * @throws NoSuchAddCerPersonnelFirstException if a matching add cer personnel first could not be found
	 */
	public AddCerPersonnelFirst findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddCerPersonnelFirst> orderByComparator)
		throws NoSuchAddCerPersonnelFirstException;

	/**
	 * Returns the last add cer personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer personnel first, or <code>null</code> if a matching add cer personnel first could not be found
	 */
	public AddCerPersonnelFirst fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddCerPersonnelFirst>
			orderByComparator);

	/**
	 * Returns the add cer personnel firsts before and after the current add cer personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addCerPersonnelFirstId the primary key of the current add cer personnel first
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add cer personnel first
	 * @throws NoSuchAddCerPersonnelFirstException if a add cer personnel first with the primary key could not be found
	 */
	public AddCerPersonnelFirst[] findBygetJanaacById_PrevAndNext(
			long addCerPersonnelFirstId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddCerPersonnelFirst> orderByComparator)
		throws NoSuchAddCerPersonnelFirstException;

	/**
	 * Removes all the add cer personnel firsts where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add cer personnel firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add cer personnel firsts
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add cer personnel first in the entity cache if it is enabled.
	 *
	 * @param addCerPersonnelFirst the add cer personnel first
	 */
	public void cacheResult(AddCerPersonnelFirst addCerPersonnelFirst);

	/**
	 * Caches the add cer personnel firsts in the entity cache if it is enabled.
	 *
	 * @param addCerPersonnelFirsts the add cer personnel firsts
	 */
	public void cacheResult(
		java.util.List<AddCerPersonnelFirst> addCerPersonnelFirsts);

	/**
	 * Creates a new add cer personnel first with the primary key. Does not add the add cer personnel first to the database.
	 *
	 * @param addCerPersonnelFirstId the primary key for the new add cer personnel first
	 * @return the new add cer personnel first
	 */
	public AddCerPersonnelFirst create(long addCerPersonnelFirstId);

	/**
	 * Removes the add cer personnel first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addCerPersonnelFirstId the primary key of the add cer personnel first
	 * @return the add cer personnel first that was removed
	 * @throws NoSuchAddCerPersonnelFirstException if a add cer personnel first with the primary key could not be found
	 */
	public AddCerPersonnelFirst remove(long addCerPersonnelFirstId)
		throws NoSuchAddCerPersonnelFirstException;

	public AddCerPersonnelFirst updateImpl(
		AddCerPersonnelFirst addCerPersonnelFirst);

	/**
	 * Returns the add cer personnel first with the primary key or throws a <code>NoSuchAddCerPersonnelFirstException</code> if it could not be found.
	 *
	 * @param addCerPersonnelFirstId the primary key of the add cer personnel first
	 * @return the add cer personnel first
	 * @throws NoSuchAddCerPersonnelFirstException if a add cer personnel first with the primary key could not be found
	 */
	public AddCerPersonnelFirst findByPrimaryKey(long addCerPersonnelFirstId)
		throws NoSuchAddCerPersonnelFirstException;

	/**
	 * Returns the add cer personnel first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addCerPersonnelFirstId the primary key of the add cer personnel first
	 * @return the add cer personnel first, or <code>null</code> if a add cer personnel first with the primary key could not be found
	 */
	public AddCerPersonnelFirst fetchByPrimaryKey(long addCerPersonnelFirstId);

	/**
	 * Returns all the add cer personnel firsts.
	 *
	 * @return the add cer personnel firsts
	 */
	public java.util.List<AddCerPersonnelFirst> findAll();

	/**
	 * Returns a range of all the add cer personnel firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel firsts
	 * @param end the upper bound of the range of add cer personnel firsts (not inclusive)
	 * @return the range of add cer personnel firsts
	 */
	public java.util.List<AddCerPersonnelFirst> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add cer personnel firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel firsts
	 * @param end the upper bound of the range of add cer personnel firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add cer personnel firsts
	 */
	public java.util.List<AddCerPersonnelFirst> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddCerPersonnelFirst>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add cer personnel firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel firsts
	 * @param end the upper bound of the range of add cer personnel firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add cer personnel firsts
	 */
	public java.util.List<AddCerPersonnelFirst> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddCerPersonnelFirst>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add cer personnel firsts from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add cer personnel firsts.
	 *
	 * @return the number of add cer personnel firsts
	 */
	public int countAll();

}