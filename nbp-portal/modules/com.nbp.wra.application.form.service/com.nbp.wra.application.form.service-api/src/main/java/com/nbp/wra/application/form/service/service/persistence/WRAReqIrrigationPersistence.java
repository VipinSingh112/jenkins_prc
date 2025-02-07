/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.wra.application.form.service.exception.NoSuchWRAReqIrrigationException;
import com.nbp.wra.application.form.service.model.WRAReqIrrigation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the wra req irrigation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WRAReqIrrigationUtil
 * @generated
 */
@ProviderType
public interface WRAReqIrrigationPersistence
	extends BasePersistence<WRAReqIrrigation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link WRAReqIrrigationUtil} to access the wra req irrigation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the wra req irrigation where wraApplicationId = &#63; or throws a <code>NoSuchWRAReqIrrigationException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a matching wra req irrigation could not be found
	 */
	public WRAReqIrrigation findBygetWRA_By_Id(long wraApplicationId)
		throws NoSuchWRAReqIrrigationException;

	/**
	 * Returns the wra req irrigation where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra req irrigation, or <code>null</code> if a matching wra req irrigation could not be found
	 */
	public WRAReqIrrigation fetchBygetWRA_By_Id(long wraApplicationId);

	/**
	 * Returns the wra req irrigation where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra req irrigation, or <code>null</code> if a matching wra req irrigation could not be found
	 */
	public WRAReqIrrigation fetchBygetWRA_By_Id(
		long wraApplicationId, boolean useFinderCache);

	/**
	 * Removes the wra req irrigation where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the wra req irrigation that was removed
	 */
	public WRAReqIrrigation removeBygetWRA_By_Id(long wraApplicationId)
		throws NoSuchWRAReqIrrigationException;

	/**
	 * Returns the number of wra req irrigations where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra req irrigations
	 */
	public int countBygetWRA_By_Id(long wraApplicationId);

	/**
	 * Returns all the wra req irrigations where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra req irrigations
	 */
	public java.util.List<WRAReqIrrigation> findBygetWRA_By_AppId(
		long wraApplicationId);

	/**
	 * Returns a range of all the wra req irrigations where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @return the range of matching wra req irrigations
	 */
	public java.util.List<WRAReqIrrigation> findBygetWRA_By_AppId(
		long wraApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the wra req irrigations where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra req irrigations
	 */
	public java.util.List<WRAReqIrrigation> findBygetWRA_By_AppId(
		long wraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WRAReqIrrigation>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra req irrigations where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra req irrigations
	 */
	public java.util.List<WRAReqIrrigation> findBygetWRA_By_AppId(
		long wraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WRAReqIrrigation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a matching wra req irrigation could not be found
	 */
	public WRAReqIrrigation findBygetWRA_By_AppId_First(
			long wraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<WRAReqIrrigation>
				orderByComparator)
		throws NoSuchWRAReqIrrigationException;

	/**
	 * Returns the first wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra req irrigation, or <code>null</code> if a matching wra req irrigation could not be found
	 */
	public WRAReqIrrigation fetchBygetWRA_By_AppId_First(
		long wraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<WRAReqIrrigation>
			orderByComparator);

	/**
	 * Returns the last wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a matching wra req irrigation could not be found
	 */
	public WRAReqIrrigation findBygetWRA_By_AppId_Last(
			long wraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<WRAReqIrrigation>
				orderByComparator)
		throws NoSuchWRAReqIrrigationException;

	/**
	 * Returns the last wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra req irrigation, or <code>null</code> if a matching wra req irrigation could not be found
	 */
	public WRAReqIrrigation fetchBygetWRA_By_AppId_Last(
		long wraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<WRAReqIrrigation>
			orderByComparator);

	/**
	 * Returns the wra req irrigations before and after the current wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraReqIrrigationId the primary key of the current wra req irrigation
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a wra req irrigation with the primary key could not be found
	 */
	public WRAReqIrrigation[] findBygetWRA_By_AppId_PrevAndNext(
			long wraReqIrrigationId, long wraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<WRAReqIrrigation>
				orderByComparator)
		throws NoSuchWRAReqIrrigationException;

	/**
	 * Removes all the wra req irrigations where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 */
	public void removeBygetWRA_By_AppId(long wraApplicationId);

	/**
	 * Returns the number of wra req irrigations where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra req irrigations
	 */
	public int countBygetWRA_By_AppId(long wraApplicationId);

	/**
	 * Returns all the wra req irrigations where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra req irrigations
	 */
	public java.util.List<WRAReqIrrigation> findBygetWRA_By_CtrAppId(
		long wraApplicationId);

	/**
	 * Returns a range of all the wra req irrigations where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @return the range of matching wra req irrigations
	 */
	public java.util.List<WRAReqIrrigation> findBygetWRA_By_CtrAppId(
		long wraApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the wra req irrigations where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra req irrigations
	 */
	public java.util.List<WRAReqIrrigation> findBygetWRA_By_CtrAppId(
		long wraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WRAReqIrrigation>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra req irrigations where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra req irrigations
	 */
	public java.util.List<WRAReqIrrigation> findBygetWRA_By_CtrAppId(
		long wraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WRAReqIrrigation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a matching wra req irrigation could not be found
	 */
	public WRAReqIrrigation findBygetWRA_By_CtrAppId_First(
			long wraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<WRAReqIrrigation>
				orderByComparator)
		throws NoSuchWRAReqIrrigationException;

	/**
	 * Returns the first wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra req irrigation, or <code>null</code> if a matching wra req irrigation could not be found
	 */
	public WRAReqIrrigation fetchBygetWRA_By_CtrAppId_First(
		long wraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<WRAReqIrrigation>
			orderByComparator);

	/**
	 * Returns the last wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a matching wra req irrigation could not be found
	 */
	public WRAReqIrrigation findBygetWRA_By_CtrAppId_Last(
			long wraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<WRAReqIrrigation>
				orderByComparator)
		throws NoSuchWRAReqIrrigationException;

	/**
	 * Returns the last wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra req irrigation, or <code>null</code> if a matching wra req irrigation could not be found
	 */
	public WRAReqIrrigation fetchBygetWRA_By_CtrAppId_Last(
		long wraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<WRAReqIrrigation>
			orderByComparator);

	/**
	 * Returns the wra req irrigations before and after the current wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraReqIrrigationId the primary key of the current wra req irrigation
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a wra req irrigation with the primary key could not be found
	 */
	public WRAReqIrrigation[] findBygetWRA_By_CtrAppId_PrevAndNext(
			long wraReqIrrigationId, long wraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<WRAReqIrrigation>
				orderByComparator)
		throws NoSuchWRAReqIrrigationException;

	/**
	 * Removes all the wra req irrigations where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 */
	public void removeBygetWRA_By_CtrAppId(long wraApplicationId);

	/**
	 * Returns the number of wra req irrigations where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra req irrigations
	 */
	public int countBygetWRA_By_CtrAppId(long wraApplicationId);

	/**
	 * Caches the wra req irrigation in the entity cache if it is enabled.
	 *
	 * @param wraReqIrrigation the wra req irrigation
	 */
	public void cacheResult(WRAReqIrrigation wraReqIrrigation);

	/**
	 * Caches the wra req irrigations in the entity cache if it is enabled.
	 *
	 * @param wraReqIrrigations the wra req irrigations
	 */
	public void cacheResult(java.util.List<WRAReqIrrigation> wraReqIrrigations);

	/**
	 * Creates a new wra req irrigation with the primary key. Does not add the wra req irrigation to the database.
	 *
	 * @param wraReqIrrigationId the primary key for the new wra req irrigation
	 * @return the new wra req irrigation
	 */
	public WRAReqIrrigation create(long wraReqIrrigationId);

	/**
	 * Removes the wra req irrigation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraReqIrrigationId the primary key of the wra req irrigation
	 * @return the wra req irrigation that was removed
	 * @throws NoSuchWRAReqIrrigationException if a wra req irrigation with the primary key could not be found
	 */
	public WRAReqIrrigation remove(long wraReqIrrigationId)
		throws NoSuchWRAReqIrrigationException;

	public WRAReqIrrigation updateImpl(WRAReqIrrigation wraReqIrrigation);

	/**
	 * Returns the wra req irrigation with the primary key or throws a <code>NoSuchWRAReqIrrigationException</code> if it could not be found.
	 *
	 * @param wraReqIrrigationId the primary key of the wra req irrigation
	 * @return the wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a wra req irrigation with the primary key could not be found
	 */
	public WRAReqIrrigation findByPrimaryKey(long wraReqIrrigationId)
		throws NoSuchWRAReqIrrigationException;

	/**
	 * Returns the wra req irrigation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraReqIrrigationId the primary key of the wra req irrigation
	 * @return the wra req irrigation, or <code>null</code> if a wra req irrigation with the primary key could not be found
	 */
	public WRAReqIrrigation fetchByPrimaryKey(long wraReqIrrigationId);

	/**
	 * Returns all the wra req irrigations.
	 *
	 * @return the wra req irrigations
	 */
	public java.util.List<WRAReqIrrigation> findAll();

	/**
	 * Returns a range of all the wra req irrigations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @return the range of wra req irrigations
	 */
	public java.util.List<WRAReqIrrigation> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the wra req irrigations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra req irrigations
	 */
	public java.util.List<WRAReqIrrigation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WRAReqIrrigation>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra req irrigations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra req irrigations
	 */
	public java.util.List<WRAReqIrrigation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WRAReqIrrigation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the wra req irrigations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of wra req irrigations.
	 *
	 * @return the number of wra req irrigations
	 */
	public int countAll();

}