/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddInsOrgInfoFirstException;
import com.nbp.janaac.application.form.service.model.AddInsOrgInfoFirst;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add ins org info first service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddInsOrgInfoFirstUtil
 * @generated
 */
@ProviderType
public interface AddInsOrgInfoFirstPersistence
	extends BasePersistence<AddInsOrgInfoFirst> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddInsOrgInfoFirstUtil} to access the add ins org info first persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add ins org info firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add ins org info firsts
	 */
	public java.util.List<AddInsOrgInfoFirst> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add ins org info firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info firsts
	 * @param end the upper bound of the range of add ins org info firsts (not inclusive)
	 * @return the range of matching add ins org info firsts
	 */
	public java.util.List<AddInsOrgInfoFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add ins org info firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info firsts
	 * @param end the upper bound of the range of add ins org info firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add ins org info firsts
	 */
	public java.util.List<AddInsOrgInfoFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddInsOrgInfoFirst>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add ins org info firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info firsts
	 * @param end the upper bound of the range of add ins org info firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add ins org info firsts
	 */
	public java.util.List<AddInsOrgInfoFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddInsOrgInfoFirst>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add ins org info first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add ins org info first
	 * @throws NoSuchAddInsOrgInfoFirstException if a matching add ins org info first could not be found
	 */
	public AddInsOrgInfoFirst findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AddInsOrgInfoFirst>
				orderByComparator)
		throws NoSuchAddInsOrgInfoFirstException;

	/**
	 * Returns the first add ins org info first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add ins org info first, or <code>null</code> if a matching add ins org info first could not be found
	 */
	public AddInsOrgInfoFirst fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddInsOrgInfoFirst>
			orderByComparator);

	/**
	 * Returns the last add ins org info first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add ins org info first
	 * @throws NoSuchAddInsOrgInfoFirstException if a matching add ins org info first could not be found
	 */
	public AddInsOrgInfoFirst findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AddInsOrgInfoFirst>
				orderByComparator)
		throws NoSuchAddInsOrgInfoFirstException;

	/**
	 * Returns the last add ins org info first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add ins org info first, or <code>null</code> if a matching add ins org info first could not be found
	 */
	public AddInsOrgInfoFirst fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddInsOrgInfoFirst>
			orderByComparator);

	/**
	 * Returns the add ins org info firsts before and after the current add ins org info first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addInsOrgInfoFirstId the primary key of the current add ins org info first
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add ins org info first
	 * @throws NoSuchAddInsOrgInfoFirstException if a add ins org info first with the primary key could not be found
	 */
	public AddInsOrgInfoFirst[] findBygetJanaacById_PrevAndNext(
			long addInsOrgInfoFirstId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<AddInsOrgInfoFirst>
				orderByComparator)
		throws NoSuchAddInsOrgInfoFirstException;

	/**
	 * Removes all the add ins org info firsts where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add ins org info firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add ins org info firsts
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add ins org info first in the entity cache if it is enabled.
	 *
	 * @param addInsOrgInfoFirst the add ins org info first
	 */
	public void cacheResult(AddInsOrgInfoFirst addInsOrgInfoFirst);

	/**
	 * Caches the add ins org info firsts in the entity cache if it is enabled.
	 *
	 * @param addInsOrgInfoFirsts the add ins org info firsts
	 */
	public void cacheResult(
		java.util.List<AddInsOrgInfoFirst> addInsOrgInfoFirsts);

	/**
	 * Creates a new add ins org info first with the primary key. Does not add the add ins org info first to the database.
	 *
	 * @param addInsOrgInfoFirstId the primary key for the new add ins org info first
	 * @return the new add ins org info first
	 */
	public AddInsOrgInfoFirst create(long addInsOrgInfoFirstId);

	/**
	 * Removes the add ins org info first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addInsOrgInfoFirstId the primary key of the add ins org info first
	 * @return the add ins org info first that was removed
	 * @throws NoSuchAddInsOrgInfoFirstException if a add ins org info first with the primary key could not be found
	 */
	public AddInsOrgInfoFirst remove(long addInsOrgInfoFirstId)
		throws NoSuchAddInsOrgInfoFirstException;

	public AddInsOrgInfoFirst updateImpl(AddInsOrgInfoFirst addInsOrgInfoFirst);

	/**
	 * Returns the add ins org info first with the primary key or throws a <code>NoSuchAddInsOrgInfoFirstException</code> if it could not be found.
	 *
	 * @param addInsOrgInfoFirstId the primary key of the add ins org info first
	 * @return the add ins org info first
	 * @throws NoSuchAddInsOrgInfoFirstException if a add ins org info first with the primary key could not be found
	 */
	public AddInsOrgInfoFirst findByPrimaryKey(long addInsOrgInfoFirstId)
		throws NoSuchAddInsOrgInfoFirstException;

	/**
	 * Returns the add ins org info first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addInsOrgInfoFirstId the primary key of the add ins org info first
	 * @return the add ins org info first, or <code>null</code> if a add ins org info first with the primary key could not be found
	 */
	public AddInsOrgInfoFirst fetchByPrimaryKey(long addInsOrgInfoFirstId);

	/**
	 * Returns all the add ins org info firsts.
	 *
	 * @return the add ins org info firsts
	 */
	public java.util.List<AddInsOrgInfoFirst> findAll();

	/**
	 * Returns a range of all the add ins org info firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info firsts
	 * @param end the upper bound of the range of add ins org info firsts (not inclusive)
	 * @return the range of add ins org info firsts
	 */
	public java.util.List<AddInsOrgInfoFirst> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add ins org info firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info firsts
	 * @param end the upper bound of the range of add ins org info firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add ins org info firsts
	 */
	public java.util.List<AddInsOrgInfoFirst> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddInsOrgInfoFirst>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add ins org info firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info firsts
	 * @param end the upper bound of the range of add ins org info firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add ins org info firsts
	 */
	public java.util.List<AddInsOrgInfoFirst> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddInsOrgInfoFirst>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add ins org info firsts from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add ins org info firsts.
	 *
	 * @return the number of add ins org info firsts
	 */
	public int countAll();

}