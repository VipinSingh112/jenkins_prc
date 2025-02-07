/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjSpecificActivitiesException;
import com.nbp.ncbj.application.form.service.model.NcbjSpecificActivities;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj specific activities service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSpecificActivitiesUtil
 * @generated
 */
@ProviderType
public interface NcbjSpecificActivitiesPersistence
	extends BasePersistence<NcbjSpecificActivities> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjSpecificActivitiesUtil} to access the ncbj specific activities persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the ncbj specific activitieses where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj specific activitieses
	 */
	public java.util.List<NcbjSpecificActivities> findBygetNcbjAppById(
		long ncbjApplicationId);

	/**
	 * Returns a range of all the ncbj specific activitieses where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSpecificActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj specific activitieses
	 * @param end the upper bound of the range of ncbj specific activitieses (not inclusive)
	 * @return the range of matching ncbj specific activitieses
	 */
	public java.util.List<NcbjSpecificActivities> findBygetNcbjAppById(
		long ncbjApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj specific activitieses where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSpecificActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj specific activitieses
	 * @param end the upper bound of the range of ncbj specific activitieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj specific activitieses
	 */
	public java.util.List<NcbjSpecificActivities> findBygetNcbjAppById(
		long ncbjApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSpecificActivities>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj specific activitieses where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSpecificActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj specific activitieses
	 * @param end the upper bound of the range of ncbj specific activitieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj specific activitieses
	 */
	public java.util.List<NcbjSpecificActivities> findBygetNcbjAppById(
		long ncbjApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSpecificActivities>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj specific activities in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj specific activities
	 * @throws NoSuchNcbjSpecificActivitiesException if a matching ncbj specific activities could not be found
	 */
	public NcbjSpecificActivities findBygetNcbjAppById_First(
			long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjSpecificActivities> orderByComparator)
		throws NoSuchNcbjSpecificActivitiesException;

	/**
	 * Returns the first ncbj specific activities in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj specific activities, or <code>null</code> if a matching ncbj specific activities could not be found
	 */
	public NcbjSpecificActivities fetchBygetNcbjAppById_First(
		long ncbjApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSpecificActivities>
			orderByComparator);

	/**
	 * Returns the last ncbj specific activities in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj specific activities
	 * @throws NoSuchNcbjSpecificActivitiesException if a matching ncbj specific activities could not be found
	 */
	public NcbjSpecificActivities findBygetNcbjAppById_Last(
			long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjSpecificActivities> orderByComparator)
		throws NoSuchNcbjSpecificActivitiesException;

	/**
	 * Returns the last ncbj specific activities in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj specific activities, or <code>null</code> if a matching ncbj specific activities could not be found
	 */
	public NcbjSpecificActivities fetchBygetNcbjAppById_Last(
		long ncbjApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSpecificActivities>
			orderByComparator);

	/**
	 * Returns the ncbj specific activitieses before and after the current ncbj specific activities in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjSpecificActivitiesId the primary key of the current ncbj specific activities
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj specific activities
	 * @throws NoSuchNcbjSpecificActivitiesException if a ncbj specific activities with the primary key could not be found
	 */
	public NcbjSpecificActivities[] findBygetNcbjAppById_PrevAndNext(
			long ncbjSpecificActivitiesId, long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjSpecificActivities> orderByComparator)
		throws NoSuchNcbjSpecificActivitiesException;

	/**
	 * Removes all the ncbj specific activitieses where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	public void removeBygetNcbjAppById(long ncbjApplicationId);

	/**
	 * Returns the number of ncbj specific activitieses where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj specific activitieses
	 */
	public int countBygetNcbjAppById(long ncbjApplicationId);

	/**
	 * Returns the ncbj specific activities where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjSpecificActivitiesException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj specific activities
	 * @throws NoSuchNcbjSpecificActivitiesException if a matching ncbj specific activities could not be found
	 */
	public NcbjSpecificActivities findBygetApp_byNcbjID(long ncbjApplicationId)
		throws NoSuchNcbjSpecificActivitiesException;

	/**
	 * Returns the ncbj specific activities where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj specific activities, or <code>null</code> if a matching ncbj specific activities could not be found
	 */
	public NcbjSpecificActivities fetchBygetApp_byNcbjID(
		long ncbjApplicationId);

	/**
	 * Returns the ncbj specific activities where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj specific activities, or <code>null</code> if a matching ncbj specific activities could not be found
	 */
	public NcbjSpecificActivities fetchBygetApp_byNcbjID(
		long ncbjApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncbj specific activities where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj specific activities that was removed
	 */
	public NcbjSpecificActivities removeBygetApp_byNcbjID(
			long ncbjApplicationId)
		throws NoSuchNcbjSpecificActivitiesException;

	/**
	 * Returns the number of ncbj specific activitieses where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj specific activitieses
	 */
	public int countBygetApp_byNcbjID(long ncbjApplicationId);

	/**
	 * Caches the ncbj specific activities in the entity cache if it is enabled.
	 *
	 * @param ncbjSpecificActivities the ncbj specific activities
	 */
	public void cacheResult(NcbjSpecificActivities ncbjSpecificActivities);

	/**
	 * Caches the ncbj specific activitieses in the entity cache if it is enabled.
	 *
	 * @param ncbjSpecificActivitieses the ncbj specific activitieses
	 */
	public void cacheResult(
		java.util.List<NcbjSpecificActivities> ncbjSpecificActivitieses);

	/**
	 * Creates a new ncbj specific activities with the primary key. Does not add the ncbj specific activities to the database.
	 *
	 * @param ncbjSpecificActivitiesId the primary key for the new ncbj specific activities
	 * @return the new ncbj specific activities
	 */
	public NcbjSpecificActivities create(long ncbjSpecificActivitiesId);

	/**
	 * Removes the ncbj specific activities with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjSpecificActivitiesId the primary key of the ncbj specific activities
	 * @return the ncbj specific activities that was removed
	 * @throws NoSuchNcbjSpecificActivitiesException if a ncbj specific activities with the primary key could not be found
	 */
	public NcbjSpecificActivities remove(long ncbjSpecificActivitiesId)
		throws NoSuchNcbjSpecificActivitiesException;

	public NcbjSpecificActivities updateImpl(
		NcbjSpecificActivities ncbjSpecificActivities);

	/**
	 * Returns the ncbj specific activities with the primary key or throws a <code>NoSuchNcbjSpecificActivitiesException</code> if it could not be found.
	 *
	 * @param ncbjSpecificActivitiesId the primary key of the ncbj specific activities
	 * @return the ncbj specific activities
	 * @throws NoSuchNcbjSpecificActivitiesException if a ncbj specific activities with the primary key could not be found
	 */
	public NcbjSpecificActivities findByPrimaryKey(
			long ncbjSpecificActivitiesId)
		throws NoSuchNcbjSpecificActivitiesException;

	/**
	 * Returns the ncbj specific activities with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjSpecificActivitiesId the primary key of the ncbj specific activities
	 * @return the ncbj specific activities, or <code>null</code> if a ncbj specific activities with the primary key could not be found
	 */
	public NcbjSpecificActivities fetchByPrimaryKey(
		long ncbjSpecificActivitiesId);

	/**
	 * Returns all the ncbj specific activitieses.
	 *
	 * @return the ncbj specific activitieses
	 */
	public java.util.List<NcbjSpecificActivities> findAll();

	/**
	 * Returns a range of all the ncbj specific activitieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSpecificActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj specific activitieses
	 * @param end the upper bound of the range of ncbj specific activitieses (not inclusive)
	 * @return the range of ncbj specific activitieses
	 */
	public java.util.List<NcbjSpecificActivities> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj specific activitieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSpecificActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj specific activitieses
	 * @param end the upper bound of the range of ncbj specific activitieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj specific activitieses
	 */
	public java.util.List<NcbjSpecificActivities> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSpecificActivities>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj specific activitieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSpecificActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj specific activitieses
	 * @param end the upper bound of the range of ncbj specific activitieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj specific activitieses
	 */
	public java.util.List<NcbjSpecificActivities> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjSpecificActivities>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj specific activitieses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj specific activitieses.
	 *
	 * @return the number of ncbj specific activitieses
	 */
	public int countAll();

}