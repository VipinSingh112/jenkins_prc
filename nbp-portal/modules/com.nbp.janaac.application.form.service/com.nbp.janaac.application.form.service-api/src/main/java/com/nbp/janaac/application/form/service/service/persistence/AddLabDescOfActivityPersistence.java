/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddLabDescOfActivityException;
import com.nbp.janaac.application.form.service.model.AddLabDescOfActivity;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add lab desc of activity service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabDescOfActivityUtil
 * @generated
 */
@ProviderType
public interface AddLabDescOfActivityPersistence
	extends BasePersistence<AddLabDescOfActivity> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddLabDescOfActivityUtil} to access the add lab desc of activity persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add lab desc of activities where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab desc of activities
	 */
	public java.util.List<AddLabDescOfActivity> findBygetJanaacById(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add lab desc of activities where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabDescOfActivityModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab desc of activities
	 * @param end the upper bound of the range of add lab desc of activities (not inclusive)
	 * @return the range of matching add lab desc of activities
	 */
	public java.util.List<AddLabDescOfActivity> findBygetJanaacById(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add lab desc of activities where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabDescOfActivityModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab desc of activities
	 * @param end the upper bound of the range of add lab desc of activities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab desc of activities
	 */
	public java.util.List<AddLabDescOfActivity> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabDescOfActivity>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add lab desc of activities where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabDescOfActivityModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab desc of activities
	 * @param end the upper bound of the range of add lab desc of activities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab desc of activities
	 */
	public java.util.List<AddLabDescOfActivity> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabDescOfActivity>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add lab desc of activity in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab desc of activity
	 * @throws NoSuchAddLabDescOfActivityException if a matching add lab desc of activity could not be found
	 */
	public AddLabDescOfActivity findBygetJanaacById_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLabDescOfActivity> orderByComparator)
		throws NoSuchAddLabDescOfActivityException;

	/**
	 * Returns the first add lab desc of activity in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab desc of activity, or <code>null</code> if a matching add lab desc of activity could not be found
	 */
	public AddLabDescOfActivity fetchBygetJanaacById_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabDescOfActivity>
			orderByComparator);

	/**
	 * Returns the last add lab desc of activity in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab desc of activity
	 * @throws NoSuchAddLabDescOfActivityException if a matching add lab desc of activity could not be found
	 */
	public AddLabDescOfActivity findBygetJanaacById_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLabDescOfActivity> orderByComparator)
		throws NoSuchAddLabDescOfActivityException;

	/**
	 * Returns the last add lab desc of activity in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab desc of activity, or <code>null</code> if a matching add lab desc of activity could not be found
	 */
	public AddLabDescOfActivity fetchBygetJanaacById_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabDescOfActivity>
			orderByComparator);

	/**
	 * Returns the add lab desc of activities before and after the current add lab desc of activity in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabDescOfActivityId the primary key of the current add lab desc of activity
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab desc of activity
	 * @throws NoSuchAddLabDescOfActivityException if a add lab desc of activity with the primary key could not be found
	 */
	public AddLabDescOfActivity[] findBygetJanaacById_PrevAndNext(
			long addLabDescOfActivityId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddLabDescOfActivity> orderByComparator)
		throws NoSuchAddLabDescOfActivityException;

	/**
	 * Removes all the add lab desc of activities where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaacById(long janaacApplicationId);

	/**
	 * Returns the number of add lab desc of activities where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab desc of activities
	 */
	public int countBygetJanaacById(long janaacApplicationId);

	/**
	 * Caches the add lab desc of activity in the entity cache if it is enabled.
	 *
	 * @param addLabDescOfActivity the add lab desc of activity
	 */
	public void cacheResult(AddLabDescOfActivity addLabDescOfActivity);

	/**
	 * Caches the add lab desc of activities in the entity cache if it is enabled.
	 *
	 * @param addLabDescOfActivities the add lab desc of activities
	 */
	public void cacheResult(
		java.util.List<AddLabDescOfActivity> addLabDescOfActivities);

	/**
	 * Creates a new add lab desc of activity with the primary key. Does not add the add lab desc of activity to the database.
	 *
	 * @param addLabDescOfActivityId the primary key for the new add lab desc of activity
	 * @return the new add lab desc of activity
	 */
	public AddLabDescOfActivity create(long addLabDescOfActivityId);

	/**
	 * Removes the add lab desc of activity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabDescOfActivityId the primary key of the add lab desc of activity
	 * @return the add lab desc of activity that was removed
	 * @throws NoSuchAddLabDescOfActivityException if a add lab desc of activity with the primary key could not be found
	 */
	public AddLabDescOfActivity remove(long addLabDescOfActivityId)
		throws NoSuchAddLabDescOfActivityException;

	public AddLabDescOfActivity updateImpl(
		AddLabDescOfActivity addLabDescOfActivity);

	/**
	 * Returns the add lab desc of activity with the primary key or throws a <code>NoSuchAddLabDescOfActivityException</code> if it could not be found.
	 *
	 * @param addLabDescOfActivityId the primary key of the add lab desc of activity
	 * @return the add lab desc of activity
	 * @throws NoSuchAddLabDescOfActivityException if a add lab desc of activity with the primary key could not be found
	 */
	public AddLabDescOfActivity findByPrimaryKey(long addLabDescOfActivityId)
		throws NoSuchAddLabDescOfActivityException;

	/**
	 * Returns the add lab desc of activity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabDescOfActivityId the primary key of the add lab desc of activity
	 * @return the add lab desc of activity, or <code>null</code> if a add lab desc of activity with the primary key could not be found
	 */
	public AddLabDescOfActivity fetchByPrimaryKey(long addLabDescOfActivityId);

	/**
	 * Returns all the add lab desc of activities.
	 *
	 * @return the add lab desc of activities
	 */
	public java.util.List<AddLabDescOfActivity> findAll();

	/**
	 * Returns a range of all the add lab desc of activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabDescOfActivityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab desc of activities
	 * @param end the upper bound of the range of add lab desc of activities (not inclusive)
	 * @return the range of add lab desc of activities
	 */
	public java.util.List<AddLabDescOfActivity> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add lab desc of activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabDescOfActivityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab desc of activities
	 * @param end the upper bound of the range of add lab desc of activities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab desc of activities
	 */
	public java.util.List<AddLabDescOfActivity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabDescOfActivity>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add lab desc of activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabDescOfActivityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab desc of activities
	 * @param end the upper bound of the range of add lab desc of activities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab desc of activities
	 */
	public java.util.List<AddLabDescOfActivity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddLabDescOfActivity>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add lab desc of activities from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add lab desc of activities.
	 *
	 * @return the number of add lab desc of activities
	 */
	public int countAll();

}