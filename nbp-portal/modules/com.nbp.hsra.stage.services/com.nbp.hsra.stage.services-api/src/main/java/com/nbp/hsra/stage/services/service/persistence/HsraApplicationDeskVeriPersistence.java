/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.stage.services.exception.NoSuchHsraApplicationDeskVeriException;
import com.nbp.hsra.stage.services.model.HsraApplicationDeskVeri;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the hsra application desk veri service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationDeskVeriUtil
 * @generated
 */
@ProviderType
public interface HsraApplicationDeskVeriPersistence
	extends BasePersistence<HsraApplicationDeskVeri> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HsraApplicationDeskVeriUtil} to access the hsra application desk veri persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the hsra application desk veris where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application desk veris
	 */
	public java.util.List<HsraApplicationDeskVeri> findBygetHsraAppDV_ById(
		long hsraApplicationId);

	/**
	 * Returns a range of all the hsra application desk veris where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra application desk veris
	 * @param end the upper bound of the range of hsra application desk veris (not inclusive)
	 * @return the range of matching hsra application desk veris
	 */
	public java.util.List<HsraApplicationDeskVeri> findBygetHsraAppDV_ById(
		long hsraApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the hsra application desk veris where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra application desk veris
	 * @param end the upper bound of the range of hsra application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra application desk veris
	 */
	public java.util.List<HsraApplicationDeskVeri> findBygetHsraAppDV_ById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HsraApplicationDeskVeri> orderByComparator);

	/**
	 * Returns an ordered range of all the hsra application desk veris where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra application desk veris
	 * @param end the upper bound of the range of hsra application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra application desk veris
	 */
	public java.util.List<HsraApplicationDeskVeri> findBygetHsraAppDV_ById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HsraApplicationDeskVeri> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first hsra application desk veri in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application desk veri
	 * @throws NoSuchHsraApplicationDeskVeriException if a matching hsra application desk veri could not be found
	 */
	public HsraApplicationDeskVeri findBygetHsraAppDV_ById_First(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HsraApplicationDeskVeri> orderByComparator)
		throws NoSuchHsraApplicationDeskVeriException;

	/**
	 * Returns the first hsra application desk veri in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application desk veri, or <code>null</code> if a matching hsra application desk veri could not be found
	 */
	public HsraApplicationDeskVeri fetchBygetHsraAppDV_ById_First(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<HsraApplicationDeskVeri> orderByComparator);

	/**
	 * Returns the last hsra application desk veri in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application desk veri
	 * @throws NoSuchHsraApplicationDeskVeriException if a matching hsra application desk veri could not be found
	 */
	public HsraApplicationDeskVeri findBygetHsraAppDV_ById_Last(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HsraApplicationDeskVeri> orderByComparator)
		throws NoSuchHsraApplicationDeskVeriException;

	/**
	 * Returns the last hsra application desk veri in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application desk veri, or <code>null</code> if a matching hsra application desk veri could not be found
	 */
	public HsraApplicationDeskVeri fetchBygetHsraAppDV_ById_Last(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<HsraApplicationDeskVeri> orderByComparator);

	/**
	 * Returns the hsra application desk veris before and after the current hsra application desk veri in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationDeskVeriId the primary key of the current hsra application desk veri
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application desk veri
	 * @throws NoSuchHsraApplicationDeskVeriException if a hsra application desk veri with the primary key could not be found
	 */
	public HsraApplicationDeskVeri[] findBygetHsraAppDV_ById_PrevAndNext(
			long hsraApplicationDeskVeriId, long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HsraApplicationDeskVeri> orderByComparator)
		throws NoSuchHsraApplicationDeskVeriException;

	/**
	 * Removes all the hsra application desk veris where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public void removeBygetHsraAppDV_ById(long hsraApplicationId);

	/**
	 * Returns the number of hsra application desk veris where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching hsra application desk veris
	 */
	public int countBygetHsraAppDV_ById(long hsraApplicationId);

	/**
	 * Caches the hsra application desk veri in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationDeskVeri the hsra application desk veri
	 */
	public void cacheResult(HsraApplicationDeskVeri hsraApplicationDeskVeri);

	/**
	 * Caches the hsra application desk veris in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationDeskVeris the hsra application desk veris
	 */
	public void cacheResult(
		java.util.List<HsraApplicationDeskVeri> hsraApplicationDeskVeris);

	/**
	 * Creates a new hsra application desk veri with the primary key. Does not add the hsra application desk veri to the database.
	 *
	 * @param hsraApplicationDeskVeriId the primary key for the new hsra application desk veri
	 * @return the new hsra application desk veri
	 */
	public HsraApplicationDeskVeri create(long hsraApplicationDeskVeriId);

	/**
	 * Removes the hsra application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraApplicationDeskVeriId the primary key of the hsra application desk veri
	 * @return the hsra application desk veri that was removed
	 * @throws NoSuchHsraApplicationDeskVeriException if a hsra application desk veri with the primary key could not be found
	 */
	public HsraApplicationDeskVeri remove(long hsraApplicationDeskVeriId)
		throws NoSuchHsraApplicationDeskVeriException;

	public HsraApplicationDeskVeri updateImpl(
		HsraApplicationDeskVeri hsraApplicationDeskVeri);

	/**
	 * Returns the hsra application desk veri with the primary key or throws a <code>NoSuchHsraApplicationDeskVeriException</code> if it could not be found.
	 *
	 * @param hsraApplicationDeskVeriId the primary key of the hsra application desk veri
	 * @return the hsra application desk veri
	 * @throws NoSuchHsraApplicationDeskVeriException if a hsra application desk veri with the primary key could not be found
	 */
	public HsraApplicationDeskVeri findByPrimaryKey(
			long hsraApplicationDeskVeriId)
		throws NoSuchHsraApplicationDeskVeriException;

	/**
	 * Returns the hsra application desk veri with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraApplicationDeskVeriId the primary key of the hsra application desk veri
	 * @return the hsra application desk veri, or <code>null</code> if a hsra application desk veri with the primary key could not be found
	 */
	public HsraApplicationDeskVeri fetchByPrimaryKey(
		long hsraApplicationDeskVeriId);

	/**
	 * Returns all the hsra application desk veris.
	 *
	 * @return the hsra application desk veris
	 */
	public java.util.List<HsraApplicationDeskVeri> findAll();

	/**
	 * Returns a range of all the hsra application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application desk veris
	 * @param end the upper bound of the range of hsra application desk veris (not inclusive)
	 * @return the range of hsra application desk veris
	 */
	public java.util.List<HsraApplicationDeskVeri> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the hsra application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application desk veris
	 * @param end the upper bound of the range of hsra application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra application desk veris
	 */
	public java.util.List<HsraApplicationDeskVeri> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HsraApplicationDeskVeri> orderByComparator);

	/**
	 * Returns an ordered range of all the hsra application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application desk veris
	 * @param end the upper bound of the range of hsra application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra application desk veris
	 */
	public java.util.List<HsraApplicationDeskVeri> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HsraApplicationDeskVeri> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the hsra application desk veris from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of hsra application desk veris.
	 *
	 * @return the number of hsra application desk veris
	 */
	public int countAll();

}