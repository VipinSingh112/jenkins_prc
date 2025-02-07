/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.wra.stage.service.exception.NoSuchWraApplicationDeskVeriException;
import com.nbp.wra.stage.service.model.WraApplicationDeskVeri;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the wra application desk veri service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WraApplicationDeskVeriUtil
 * @generated
 */
@ProviderType
public interface WraApplicationDeskVeriPersistence
	extends BasePersistence<WraApplicationDeskVeri> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link WraApplicationDeskVeriUtil} to access the wra application desk veri persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the wra application desk veris where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra application desk veris
	 */
	public java.util.List<WraApplicationDeskVeri> findBygetWraAppDV_ById(
		long wraApplicationId);

	/**
	 * Returns a range of all the wra application desk veris where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra application desk veris
	 * @param end the upper bound of the range of wra application desk veris (not inclusive)
	 * @return the range of matching wra application desk veris
	 */
	public java.util.List<WraApplicationDeskVeri> findBygetWraAppDV_ById(
		long wraApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the wra application desk veris where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra application desk veris
	 * @param end the upper bound of the range of wra application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra application desk veris
	 */
	public java.util.List<WraApplicationDeskVeri> findBygetWraAppDV_ById(
		long wraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraApplicationDeskVeri>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra application desk veris where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra application desk veris
	 * @param end the upper bound of the range of wra application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra application desk veris
	 */
	public java.util.List<WraApplicationDeskVeri> findBygetWraAppDV_ById(
		long wraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraApplicationDeskVeri>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first wra application desk veri in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application desk veri
	 * @throws NoSuchWraApplicationDeskVeriException if a matching wra application desk veri could not be found
	 */
	public WraApplicationDeskVeri findBygetWraAppDV_ById_First(
			long wraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<WraApplicationDeskVeri> orderByComparator)
		throws NoSuchWraApplicationDeskVeriException;

	/**
	 * Returns the first wra application desk veri in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application desk veri, or <code>null</code> if a matching wra application desk veri could not be found
	 */
	public WraApplicationDeskVeri fetchBygetWraAppDV_ById_First(
		long wraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<WraApplicationDeskVeri>
			orderByComparator);

	/**
	 * Returns the last wra application desk veri in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application desk veri
	 * @throws NoSuchWraApplicationDeskVeriException if a matching wra application desk veri could not be found
	 */
	public WraApplicationDeskVeri findBygetWraAppDV_ById_Last(
			long wraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<WraApplicationDeskVeri> orderByComparator)
		throws NoSuchWraApplicationDeskVeriException;

	/**
	 * Returns the last wra application desk veri in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application desk veri, or <code>null</code> if a matching wra application desk veri could not be found
	 */
	public WraApplicationDeskVeri fetchBygetWraAppDV_ById_Last(
		long wraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<WraApplicationDeskVeri>
			orderByComparator);

	/**
	 * Returns the wra application desk veris before and after the current wra application desk veri in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationDeskVeriId the primary key of the current wra application desk veri
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application desk veri
	 * @throws NoSuchWraApplicationDeskVeriException if a wra application desk veri with the primary key could not be found
	 */
	public WraApplicationDeskVeri[] findBygetWraAppDV_ById_PrevAndNext(
			long wraApplicationDeskVeriId, long wraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<WraApplicationDeskVeri> orderByComparator)
		throws NoSuchWraApplicationDeskVeriException;

	/**
	 * Removes all the wra application desk veris where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 */
	public void removeBygetWraAppDV_ById(long wraApplicationId);

	/**
	 * Returns the number of wra application desk veris where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra application desk veris
	 */
	public int countBygetWraAppDV_ById(long wraApplicationId);

	/**
	 * Caches the wra application desk veri in the entity cache if it is enabled.
	 *
	 * @param wraApplicationDeskVeri the wra application desk veri
	 */
	public void cacheResult(WraApplicationDeskVeri wraApplicationDeskVeri);

	/**
	 * Caches the wra application desk veris in the entity cache if it is enabled.
	 *
	 * @param wraApplicationDeskVeris the wra application desk veris
	 */
	public void cacheResult(
		java.util.List<WraApplicationDeskVeri> wraApplicationDeskVeris);

	/**
	 * Creates a new wra application desk veri with the primary key. Does not add the wra application desk veri to the database.
	 *
	 * @param wraApplicationDeskVeriId the primary key for the new wra application desk veri
	 * @return the new wra application desk veri
	 */
	public WraApplicationDeskVeri create(long wraApplicationDeskVeriId);

	/**
	 * Removes the wra application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraApplicationDeskVeriId the primary key of the wra application desk veri
	 * @return the wra application desk veri that was removed
	 * @throws NoSuchWraApplicationDeskVeriException if a wra application desk veri with the primary key could not be found
	 */
	public WraApplicationDeskVeri remove(long wraApplicationDeskVeriId)
		throws NoSuchWraApplicationDeskVeriException;

	public WraApplicationDeskVeri updateImpl(
		WraApplicationDeskVeri wraApplicationDeskVeri);

	/**
	 * Returns the wra application desk veri with the primary key or throws a <code>NoSuchWraApplicationDeskVeriException</code> if it could not be found.
	 *
	 * @param wraApplicationDeskVeriId the primary key of the wra application desk veri
	 * @return the wra application desk veri
	 * @throws NoSuchWraApplicationDeskVeriException if a wra application desk veri with the primary key could not be found
	 */
	public WraApplicationDeskVeri findByPrimaryKey(
			long wraApplicationDeskVeriId)
		throws NoSuchWraApplicationDeskVeriException;

	/**
	 * Returns the wra application desk veri with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraApplicationDeskVeriId the primary key of the wra application desk veri
	 * @return the wra application desk veri, or <code>null</code> if a wra application desk veri with the primary key could not be found
	 */
	public WraApplicationDeskVeri fetchByPrimaryKey(
		long wraApplicationDeskVeriId);

	/**
	 * Returns all the wra application desk veris.
	 *
	 * @return the wra application desk veris
	 */
	public java.util.List<WraApplicationDeskVeri> findAll();

	/**
	 * Returns a range of all the wra application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application desk veris
	 * @param end the upper bound of the range of wra application desk veris (not inclusive)
	 * @return the range of wra application desk veris
	 */
	public java.util.List<WraApplicationDeskVeri> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the wra application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application desk veris
	 * @param end the upper bound of the range of wra application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra application desk veris
	 */
	public java.util.List<WraApplicationDeskVeri> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraApplicationDeskVeri>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application desk veris
	 * @param end the upper bound of the range of wra application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra application desk veris
	 */
	public java.util.List<WraApplicationDeskVeri> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraApplicationDeskVeri>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the wra application desk veris from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of wra application desk veris.
	 *
	 * @return the number of wra application desk veris
	 */
	public int countAll();

}