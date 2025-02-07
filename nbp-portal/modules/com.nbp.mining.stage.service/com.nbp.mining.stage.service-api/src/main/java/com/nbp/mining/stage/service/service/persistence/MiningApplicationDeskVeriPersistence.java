/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.mining.stage.service.exception.NoSuchMiningApplicationDeskVeriException;
import com.nbp.mining.stage.service.model.MiningApplicationDeskVeri;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the mining application desk veri service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationDeskVeriUtil
 * @generated
 */
@ProviderType
public interface MiningApplicationDeskVeriPersistence
	extends BasePersistence<MiningApplicationDeskVeri> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MiningApplicationDeskVeriUtil} to access the mining application desk veri persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the mining application desk veris where miningApplicationId = &#63;.
	 *
	 * @param miningApplicationId the mining application ID
	 * @return the matching mining application desk veris
	 */
	public java.util.List<MiningApplicationDeskVeri> findBygetMiningAppDV_ById(
		long miningApplicationId);

	/**
	 * Returns a range of all the mining application desk veris where miningApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param miningApplicationId the mining application ID
	 * @param start the lower bound of the range of mining application desk veris
	 * @param end the upper bound of the range of mining application desk veris (not inclusive)
	 * @return the range of matching mining application desk veris
	 */
	public java.util.List<MiningApplicationDeskVeri> findBygetMiningAppDV_ById(
		long miningApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the mining application desk veris where miningApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param miningApplicationId the mining application ID
	 * @param start the lower bound of the range of mining application desk veris
	 * @param end the upper bound of the range of mining application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application desk veris
	 */
	public java.util.List<MiningApplicationDeskVeri> findBygetMiningAppDV_ById(
		long miningApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationDeskVeri> orderByComparator);

	/**
	 * Returns an ordered range of all the mining application desk veris where miningApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param miningApplicationId the mining application ID
	 * @param start the lower bound of the range of mining application desk veris
	 * @param end the upper bound of the range of mining application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application desk veris
	 */
	public java.util.List<MiningApplicationDeskVeri> findBygetMiningAppDV_ById(
		long miningApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationDeskVeri> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first mining application desk veri in the ordered set where miningApplicationId = &#63;.
	 *
	 * @param miningApplicationId the mining application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application desk veri
	 * @throws NoSuchMiningApplicationDeskVeriException if a matching mining application desk veri could not be found
	 */
	public MiningApplicationDeskVeri findBygetMiningAppDV_ById_First(
			long miningApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationDeskVeri> orderByComparator)
		throws NoSuchMiningApplicationDeskVeriException;

	/**
	 * Returns the first mining application desk veri in the ordered set where miningApplicationId = &#63;.
	 *
	 * @param miningApplicationId the mining application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application desk veri, or <code>null</code> if a matching mining application desk veri could not be found
	 */
	public MiningApplicationDeskVeri fetchBygetMiningAppDV_ById_First(
		long miningApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationDeskVeri> orderByComparator);

	/**
	 * Returns the last mining application desk veri in the ordered set where miningApplicationId = &#63;.
	 *
	 * @param miningApplicationId the mining application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application desk veri
	 * @throws NoSuchMiningApplicationDeskVeriException if a matching mining application desk veri could not be found
	 */
	public MiningApplicationDeskVeri findBygetMiningAppDV_ById_Last(
			long miningApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationDeskVeri> orderByComparator)
		throws NoSuchMiningApplicationDeskVeriException;

	/**
	 * Returns the last mining application desk veri in the ordered set where miningApplicationId = &#63;.
	 *
	 * @param miningApplicationId the mining application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application desk veri, or <code>null</code> if a matching mining application desk veri could not be found
	 */
	public MiningApplicationDeskVeri fetchBygetMiningAppDV_ById_Last(
		long miningApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationDeskVeri> orderByComparator);

	/**
	 * Returns the mining application desk veris before and after the current mining application desk veri in the ordered set where miningApplicationId = &#63;.
	 *
	 * @param miningDeskVeriId the primary key of the current mining application desk veri
	 * @param miningApplicationId the mining application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application desk veri
	 * @throws NoSuchMiningApplicationDeskVeriException if a mining application desk veri with the primary key could not be found
	 */
	public MiningApplicationDeskVeri[] findBygetMiningAppDV_ById_PrevAndNext(
			long miningDeskVeriId, long miningApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationDeskVeri> orderByComparator)
		throws NoSuchMiningApplicationDeskVeriException;

	/**
	 * Removes all the mining application desk veris where miningApplicationId = &#63; from the database.
	 *
	 * @param miningApplicationId the mining application ID
	 */
	public void removeBygetMiningAppDV_ById(long miningApplicationId);

	/**
	 * Returns the number of mining application desk veris where miningApplicationId = &#63;.
	 *
	 * @param miningApplicationId the mining application ID
	 * @return the number of matching mining application desk veris
	 */
	public int countBygetMiningAppDV_ById(long miningApplicationId);

	/**
	 * Caches the mining application desk veri in the entity cache if it is enabled.
	 *
	 * @param miningApplicationDeskVeri the mining application desk veri
	 */
	public void cacheResult(
		MiningApplicationDeskVeri miningApplicationDeskVeri);

	/**
	 * Caches the mining application desk veris in the entity cache if it is enabled.
	 *
	 * @param miningApplicationDeskVeris the mining application desk veris
	 */
	public void cacheResult(
		java.util.List<MiningApplicationDeskVeri> miningApplicationDeskVeris);

	/**
	 * Creates a new mining application desk veri with the primary key. Does not add the mining application desk veri to the database.
	 *
	 * @param miningDeskVeriId the primary key for the new mining application desk veri
	 * @return the new mining application desk veri
	 */
	public MiningApplicationDeskVeri create(long miningDeskVeriId);

	/**
	 * Removes the mining application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningDeskVeriId the primary key of the mining application desk veri
	 * @return the mining application desk veri that was removed
	 * @throws NoSuchMiningApplicationDeskVeriException if a mining application desk veri with the primary key could not be found
	 */
	public MiningApplicationDeskVeri remove(long miningDeskVeriId)
		throws NoSuchMiningApplicationDeskVeriException;

	public MiningApplicationDeskVeri updateImpl(
		MiningApplicationDeskVeri miningApplicationDeskVeri);

	/**
	 * Returns the mining application desk veri with the primary key or throws a <code>NoSuchMiningApplicationDeskVeriException</code> if it could not be found.
	 *
	 * @param miningDeskVeriId the primary key of the mining application desk veri
	 * @return the mining application desk veri
	 * @throws NoSuchMiningApplicationDeskVeriException if a mining application desk veri with the primary key could not be found
	 */
	public MiningApplicationDeskVeri findByPrimaryKey(long miningDeskVeriId)
		throws NoSuchMiningApplicationDeskVeriException;

	/**
	 * Returns the mining application desk veri with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningDeskVeriId the primary key of the mining application desk veri
	 * @return the mining application desk veri, or <code>null</code> if a mining application desk veri with the primary key could not be found
	 */
	public MiningApplicationDeskVeri fetchByPrimaryKey(long miningDeskVeriId);

	/**
	 * Returns all the mining application desk veris.
	 *
	 * @return the mining application desk veris
	 */
	public java.util.List<MiningApplicationDeskVeri> findAll();

	/**
	 * Returns a range of all the mining application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application desk veris
	 * @param end the upper bound of the range of mining application desk veris (not inclusive)
	 * @return the range of mining application desk veris
	 */
	public java.util.List<MiningApplicationDeskVeri> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the mining application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application desk veris
	 * @param end the upper bound of the range of mining application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining application desk veris
	 */
	public java.util.List<MiningApplicationDeskVeri> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationDeskVeri> orderByComparator);

	/**
	 * Returns an ordered range of all the mining application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application desk veris
	 * @param end the upper bound of the range of mining application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining application desk veris
	 */
	public java.util.List<MiningApplicationDeskVeri> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationDeskVeri> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the mining application desk veris from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of mining application desk veris.
	 *
	 * @return the number of mining application desk veris
	 */
	public int countAll();

}