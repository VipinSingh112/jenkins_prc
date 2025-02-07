/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchSpecificReqPropLicActivityException;
import com.nbp.hsra.application.service.model.SpecificReqPropLicActivity;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the specific req prop lic activity service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SpecificReqPropLicActivityUtil
 * @generated
 */
@ProviderType
public interface SpecificReqPropLicActivityPersistence
	extends BasePersistence<SpecificReqPropLicActivity> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SpecificReqPropLicActivityUtil} to access the specific req prop lic activity persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the specific req prop lic activity where hsraApplicationId = &#63; or throws a <code>NoSuchSpecificReqPropLicActivityException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching specific req prop lic activity
	 * @throws NoSuchSpecificReqPropLicActivityException if a matching specific req prop lic activity could not be found
	 */
	public SpecificReqPropLicActivity findBygetHsraById(long hsraApplicationId)
		throws NoSuchSpecificReqPropLicActivityException;

	/**
	 * Returns the specific req prop lic activity where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching specific req prop lic activity, or <code>null</code> if a matching specific req prop lic activity could not be found
	 */
	public SpecificReqPropLicActivity fetchBygetHsraById(
		long hsraApplicationId);

	/**
	 * Returns the specific req prop lic activity where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching specific req prop lic activity, or <code>null</code> if a matching specific req prop lic activity could not be found
	 */
	public SpecificReqPropLicActivity fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache);

	/**
	 * Removes the specific req prop lic activity where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the specific req prop lic activity that was removed
	 */
	public SpecificReqPropLicActivity removeBygetHsraById(
			long hsraApplicationId)
		throws NoSuchSpecificReqPropLicActivityException;

	/**
	 * Returns the number of specific req prop lic activities where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching specific req prop lic activities
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the specific req prop lic activity in the entity cache if it is enabled.
	 *
	 * @param specificReqPropLicActivity the specific req prop lic activity
	 */
	public void cacheResult(
		SpecificReqPropLicActivity specificReqPropLicActivity);

	/**
	 * Caches the specific req prop lic activities in the entity cache if it is enabled.
	 *
	 * @param specificReqPropLicActivities the specific req prop lic activities
	 */
	public void cacheResult(
		java.util.List<SpecificReqPropLicActivity>
			specificReqPropLicActivities);

	/**
	 * Creates a new specific req prop lic activity with the primary key. Does not add the specific req prop lic activity to the database.
	 *
	 * @param specificReqPropLicActivityId the primary key for the new specific req prop lic activity
	 * @return the new specific req prop lic activity
	 */
	public SpecificReqPropLicActivity create(long specificReqPropLicActivityId);

	/**
	 * Removes the specific req prop lic activity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param specificReqPropLicActivityId the primary key of the specific req prop lic activity
	 * @return the specific req prop lic activity that was removed
	 * @throws NoSuchSpecificReqPropLicActivityException if a specific req prop lic activity with the primary key could not be found
	 */
	public SpecificReqPropLicActivity remove(long specificReqPropLicActivityId)
		throws NoSuchSpecificReqPropLicActivityException;

	public SpecificReqPropLicActivity updateImpl(
		SpecificReqPropLicActivity specificReqPropLicActivity);

	/**
	 * Returns the specific req prop lic activity with the primary key or throws a <code>NoSuchSpecificReqPropLicActivityException</code> if it could not be found.
	 *
	 * @param specificReqPropLicActivityId the primary key of the specific req prop lic activity
	 * @return the specific req prop lic activity
	 * @throws NoSuchSpecificReqPropLicActivityException if a specific req prop lic activity with the primary key could not be found
	 */
	public SpecificReqPropLicActivity findByPrimaryKey(
			long specificReqPropLicActivityId)
		throws NoSuchSpecificReqPropLicActivityException;

	/**
	 * Returns the specific req prop lic activity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param specificReqPropLicActivityId the primary key of the specific req prop lic activity
	 * @return the specific req prop lic activity, or <code>null</code> if a specific req prop lic activity with the primary key could not be found
	 */
	public SpecificReqPropLicActivity fetchByPrimaryKey(
		long specificReqPropLicActivityId);

	/**
	 * Returns all the specific req prop lic activities.
	 *
	 * @return the specific req prop lic activities
	 */
	public java.util.List<SpecificReqPropLicActivity> findAll();

	/**
	 * Returns a range of all the specific req prop lic activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SpecificReqPropLicActivityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of specific req prop lic activities
	 * @param end the upper bound of the range of specific req prop lic activities (not inclusive)
	 * @return the range of specific req prop lic activities
	 */
	public java.util.List<SpecificReqPropLicActivity> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the specific req prop lic activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SpecificReqPropLicActivityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of specific req prop lic activities
	 * @param end the upper bound of the range of specific req prop lic activities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of specific req prop lic activities
	 */
	public java.util.List<SpecificReqPropLicActivity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SpecificReqPropLicActivity> orderByComparator);

	/**
	 * Returns an ordered range of all the specific req prop lic activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SpecificReqPropLicActivityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of specific req prop lic activities
	 * @param end the upper bound of the range of specific req prop lic activities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of specific req prop lic activities
	 */
	public java.util.List<SpecificReqPropLicActivity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SpecificReqPropLicActivity> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the specific req prop lic activities from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of specific req prop lic activities.
	 *
	 * @return the number of specific req prop lic activities
	 */
	public int countAll();

}