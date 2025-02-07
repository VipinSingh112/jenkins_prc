/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchAddOutsourcedActivitiesException;
import com.nbp.janaac.application.form.service.model.AddOutsourcedActivities;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add outsourced activities service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddOutsourcedActivitiesUtil
 * @generated
 */
@ProviderType
public interface AddOutsourcedActivitiesPersistence
	extends BasePersistence<AddOutsourcedActivities> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddOutsourcedActivitiesUtil} to access the add outsourced activities persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add outsourced activitieses where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add outsourced activitieses
	 */
	public java.util.List<AddOutsourcedActivities> findBygetJanaac_OutSrc_Id(
		long janaacApplicationId);

	/**
	 * Returns a range of all the add outsourced activitieses where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddOutsourcedActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add outsourced activitieses
	 * @param end the upper bound of the range of add outsourced activitieses (not inclusive)
	 * @return the range of matching add outsourced activitieses
	 */
	public java.util.List<AddOutsourcedActivities> findBygetJanaac_OutSrc_Id(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add outsourced activitieses where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddOutsourcedActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add outsourced activitieses
	 * @param end the upper bound of the range of add outsourced activitieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add outsourced activitieses
	 */
	public java.util.List<AddOutsourcedActivities> findBygetJanaac_OutSrc_Id(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddOutsourcedActivities> orderByComparator);

	/**
	 * Returns an ordered range of all the add outsourced activitieses where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddOutsourcedActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add outsourced activitieses
	 * @param end the upper bound of the range of add outsourced activitieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add outsourced activitieses
	 */
	public java.util.List<AddOutsourcedActivities> findBygetJanaac_OutSrc_Id(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddOutsourcedActivities> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add outsourced activities in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add outsourced activities
	 * @throws NoSuchAddOutsourcedActivitiesException if a matching add outsourced activities could not be found
	 */
	public AddOutsourcedActivities findBygetJanaac_OutSrc_Id_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddOutsourcedActivities> orderByComparator)
		throws NoSuchAddOutsourcedActivitiesException;

	/**
	 * Returns the first add outsourced activities in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add outsourced activities, or <code>null</code> if a matching add outsourced activities could not be found
	 */
	public AddOutsourcedActivities fetchBygetJanaac_OutSrc_Id_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddOutsourcedActivities> orderByComparator);

	/**
	 * Returns the last add outsourced activities in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add outsourced activities
	 * @throws NoSuchAddOutsourcedActivitiesException if a matching add outsourced activities could not be found
	 */
	public AddOutsourcedActivities findBygetJanaac_OutSrc_Id_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddOutsourcedActivities> orderByComparator)
		throws NoSuchAddOutsourcedActivitiesException;

	/**
	 * Returns the last add outsourced activities in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add outsourced activities, or <code>null</code> if a matching add outsourced activities could not be found
	 */
	public AddOutsourcedActivities fetchBygetJanaac_OutSrc_Id_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddOutsourcedActivities> orderByComparator);

	/**
	 * Returns the add outsourced activitieses before and after the current add outsourced activities in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addOutsourcedActivitiesId the primary key of the current add outsourced activities
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add outsourced activities
	 * @throws NoSuchAddOutsourcedActivitiesException if a add outsourced activities with the primary key could not be found
	 */
	public AddOutsourcedActivities[] findBygetJanaac_OutSrc_Id_PrevAndNext(
			long addOutsourcedActivitiesId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddOutsourcedActivities> orderByComparator)
		throws NoSuchAddOutsourcedActivitiesException;

	/**
	 * Removes all the add outsourced activitieses where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaac_OutSrc_Id(long janaacApplicationId);

	/**
	 * Returns the number of add outsourced activitieses where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add outsourced activitieses
	 */
	public int countBygetJanaac_OutSrc_Id(long janaacApplicationId);

	/**
	 * Caches the add outsourced activities in the entity cache if it is enabled.
	 *
	 * @param addOutsourcedActivities the add outsourced activities
	 */
	public void cacheResult(AddOutsourcedActivities addOutsourcedActivities);

	/**
	 * Caches the add outsourced activitieses in the entity cache if it is enabled.
	 *
	 * @param addOutsourcedActivitieses the add outsourced activitieses
	 */
	public void cacheResult(
		java.util.List<AddOutsourcedActivities> addOutsourcedActivitieses);

	/**
	 * Creates a new add outsourced activities with the primary key. Does not add the add outsourced activities to the database.
	 *
	 * @param addOutsourcedActivitiesId the primary key for the new add outsourced activities
	 * @return the new add outsourced activities
	 */
	public AddOutsourcedActivities create(long addOutsourcedActivitiesId);

	/**
	 * Removes the add outsourced activities with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addOutsourcedActivitiesId the primary key of the add outsourced activities
	 * @return the add outsourced activities that was removed
	 * @throws NoSuchAddOutsourcedActivitiesException if a add outsourced activities with the primary key could not be found
	 */
	public AddOutsourcedActivities remove(long addOutsourcedActivitiesId)
		throws NoSuchAddOutsourcedActivitiesException;

	public AddOutsourcedActivities updateImpl(
		AddOutsourcedActivities addOutsourcedActivities);

	/**
	 * Returns the add outsourced activities with the primary key or throws a <code>NoSuchAddOutsourcedActivitiesException</code> if it could not be found.
	 *
	 * @param addOutsourcedActivitiesId the primary key of the add outsourced activities
	 * @return the add outsourced activities
	 * @throws NoSuchAddOutsourcedActivitiesException if a add outsourced activities with the primary key could not be found
	 */
	public AddOutsourcedActivities findByPrimaryKey(
			long addOutsourcedActivitiesId)
		throws NoSuchAddOutsourcedActivitiesException;

	/**
	 * Returns the add outsourced activities with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addOutsourcedActivitiesId the primary key of the add outsourced activities
	 * @return the add outsourced activities, or <code>null</code> if a add outsourced activities with the primary key could not be found
	 */
	public AddOutsourcedActivities fetchByPrimaryKey(
		long addOutsourcedActivitiesId);

	/**
	 * Returns all the add outsourced activitieses.
	 *
	 * @return the add outsourced activitieses
	 */
	public java.util.List<AddOutsourcedActivities> findAll();

	/**
	 * Returns a range of all the add outsourced activitieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddOutsourcedActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add outsourced activitieses
	 * @param end the upper bound of the range of add outsourced activitieses (not inclusive)
	 * @return the range of add outsourced activitieses
	 */
	public java.util.List<AddOutsourcedActivities> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add outsourced activitieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddOutsourcedActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add outsourced activitieses
	 * @param end the upper bound of the range of add outsourced activitieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add outsourced activitieses
	 */
	public java.util.List<AddOutsourcedActivities> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddOutsourcedActivities> orderByComparator);

	/**
	 * Returns an ordered range of all the add outsourced activitieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddOutsourcedActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add outsourced activitieses
	 * @param end the upper bound of the range of add outsourced activitieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add outsourced activitieses
	 */
	public java.util.List<AddOutsourcedActivities> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddOutsourcedActivities> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add outsourced activitieses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add outsourced activitieses.
	 *
	 * @return the number of add outsourced activitieses
	 */
	public int countAll();

}