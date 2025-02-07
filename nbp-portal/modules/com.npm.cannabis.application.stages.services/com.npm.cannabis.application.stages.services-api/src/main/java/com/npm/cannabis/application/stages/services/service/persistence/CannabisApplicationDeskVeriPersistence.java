/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisApplicationDeskVeriException;
import com.npm.cannabis.application.stages.services.model.CannabisApplicationDeskVeri;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis application desk veri service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationDeskVeriUtil
 * @generated
 */
@ProviderType
public interface CannabisApplicationDeskVeriPersistence
	extends BasePersistence<CannabisApplicationDeskVeri> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisApplicationDeskVeriUtil} to access the cannabis application desk veri persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the cannabis application desk veris where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application desk veris
	 */
	public java.util.List<CannabisApplicationDeskVeri>
		findBygetCannabisAppDV_ById(long cannabisApplicationId);

	/**
	 * Returns a range of all the cannabis application desk veris where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis application desk veris
	 * @param end the upper bound of the range of cannabis application desk veris (not inclusive)
	 * @return the range of matching cannabis application desk veris
	 */
	public java.util.List<CannabisApplicationDeskVeri>
		findBygetCannabisAppDV_ById(
			long cannabisApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application desk veris where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis application desk veris
	 * @param end the upper bound of the range of cannabis application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application desk veris
	 */
	public java.util.List<CannabisApplicationDeskVeri>
		findBygetCannabisAppDV_ById(
			long cannabisApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationDeskVeri> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application desk veris where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis application desk veris
	 * @param end the upper bound of the range of cannabis application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application desk veris
	 */
	public java.util.List<CannabisApplicationDeskVeri>
		findBygetCannabisAppDV_ById(
			long cannabisApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationDeskVeri> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first cannabis application desk veri in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application desk veri
	 * @throws NoSuchCannabisApplicationDeskVeriException if a matching cannabis application desk veri could not be found
	 */
	public CannabisApplicationDeskVeri findBygetCannabisAppDV_ById_First(
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationDeskVeri> orderByComparator)
		throws NoSuchCannabisApplicationDeskVeriException;

	/**
	 * Returns the first cannabis application desk veri in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application desk veri, or <code>null</code> if a matching cannabis application desk veri could not be found
	 */
	public CannabisApplicationDeskVeri fetchBygetCannabisAppDV_ById_First(
		long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationDeskVeri> orderByComparator);

	/**
	 * Returns the last cannabis application desk veri in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application desk veri
	 * @throws NoSuchCannabisApplicationDeskVeriException if a matching cannabis application desk veri could not be found
	 */
	public CannabisApplicationDeskVeri findBygetCannabisAppDV_ById_Last(
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationDeskVeri> orderByComparator)
		throws NoSuchCannabisApplicationDeskVeriException;

	/**
	 * Returns the last cannabis application desk veri in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application desk veri, or <code>null</code> if a matching cannabis application desk veri could not be found
	 */
	public CannabisApplicationDeskVeri fetchBygetCannabisAppDV_ById_Last(
		long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationDeskVeri> orderByComparator);

	/**
	 * Returns the cannabis application desk veris before and after the current cannabis application desk veri in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisDeskVeriId the primary key of the current cannabis application desk veri
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application desk veri
	 * @throws NoSuchCannabisApplicationDeskVeriException if a cannabis application desk veri with the primary key could not be found
	 */
	public CannabisApplicationDeskVeri[]
			findBygetCannabisAppDV_ById_PrevAndNext(
				long cannabisDeskVeriId, long cannabisApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisApplicationDeskVeri> orderByComparator)
		throws NoSuchCannabisApplicationDeskVeriException;

	/**
	 * Removes all the cannabis application desk veris where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public void removeBygetCannabisAppDV_ById(long cannabisApplicationId);

	/**
	 * Returns the number of cannabis application desk veris where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis application desk veris
	 */
	public int countBygetCannabisAppDV_ById(long cannabisApplicationId);

	/**
	 * Caches the cannabis application desk veri in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationDeskVeri the cannabis application desk veri
	 */
	public void cacheResult(
		CannabisApplicationDeskVeri cannabisApplicationDeskVeri);

	/**
	 * Caches the cannabis application desk veris in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationDeskVeris the cannabis application desk veris
	 */
	public void cacheResult(
		java.util.List<CannabisApplicationDeskVeri>
			cannabisApplicationDeskVeris);

	/**
	 * Creates a new cannabis application desk veri with the primary key. Does not add the cannabis application desk veri to the database.
	 *
	 * @param cannabisDeskVeriId the primary key for the new cannabis application desk veri
	 * @return the new cannabis application desk veri
	 */
	public CannabisApplicationDeskVeri create(long cannabisDeskVeriId);

	/**
	 * Removes the cannabis application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisDeskVeriId the primary key of the cannabis application desk veri
	 * @return the cannabis application desk veri that was removed
	 * @throws NoSuchCannabisApplicationDeskVeriException if a cannabis application desk veri with the primary key could not be found
	 */
	public CannabisApplicationDeskVeri remove(long cannabisDeskVeriId)
		throws NoSuchCannabisApplicationDeskVeriException;

	public CannabisApplicationDeskVeri updateImpl(
		CannabisApplicationDeskVeri cannabisApplicationDeskVeri);

	/**
	 * Returns the cannabis application desk veri with the primary key or throws a <code>NoSuchCannabisApplicationDeskVeriException</code> if it could not be found.
	 *
	 * @param cannabisDeskVeriId the primary key of the cannabis application desk veri
	 * @return the cannabis application desk veri
	 * @throws NoSuchCannabisApplicationDeskVeriException if a cannabis application desk veri with the primary key could not be found
	 */
	public CannabisApplicationDeskVeri findByPrimaryKey(long cannabisDeskVeriId)
		throws NoSuchCannabisApplicationDeskVeriException;

	/**
	 * Returns the cannabis application desk veri with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisDeskVeriId the primary key of the cannabis application desk veri
	 * @return the cannabis application desk veri, or <code>null</code> if a cannabis application desk veri with the primary key could not be found
	 */
	public CannabisApplicationDeskVeri fetchByPrimaryKey(
		long cannabisDeskVeriId);

	/**
	 * Returns all the cannabis application desk veris.
	 *
	 * @return the cannabis application desk veris
	 */
	public java.util.List<CannabisApplicationDeskVeri> findAll();

	/**
	 * Returns a range of all the cannabis application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application desk veris
	 * @param end the upper bound of the range of cannabis application desk veris (not inclusive)
	 * @return the range of cannabis application desk veris
	 */
	public java.util.List<CannabisApplicationDeskVeri> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application desk veris
	 * @param end the upper bound of the range of cannabis application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application desk veris
	 */
	public java.util.List<CannabisApplicationDeskVeri> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationDeskVeri> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application desk veris
	 * @param end the upper bound of the range of cannabis application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application desk veris
	 */
	public java.util.List<CannabisApplicationDeskVeri> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationDeskVeri> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis application desk veris from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis application desk veris.
	 *
	 * @return the number of cannabis application desk veris
	 */
	public int countAll();

}