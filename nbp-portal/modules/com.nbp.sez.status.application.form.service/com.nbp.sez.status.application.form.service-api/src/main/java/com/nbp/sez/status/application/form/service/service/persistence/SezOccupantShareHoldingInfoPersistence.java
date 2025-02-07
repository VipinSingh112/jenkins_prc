/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupantShareHoldingInfoException;
import com.nbp.sez.status.application.form.service.model.SezOccupantShareHoldingInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez occupant share holding info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantShareHoldingInfoUtil
 * @generated
 */
@ProviderType
public interface SezOccupantShareHoldingInfoPersistence
	extends BasePersistence<SezOccupantShareHoldingInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezOccupantShareHoldingInfoUtil} to access the sez occupant share holding info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sez occupant share holding infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant share holding infos
	 */
	public java.util.List<SezOccupantShareHoldingInfo>
		findBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns a range of all the sez occupant share holding infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantShareHoldingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant share holding infos
	 * @param end the upper bound of the range of sez occupant share holding infos (not inclusive)
	 * @return the range of matching sez occupant share holding infos
	 */
	public java.util.List<SezOccupantShareHoldingInfo>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the sez occupant share holding infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantShareHoldingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant share holding infos
	 * @param end the upper bound of the range of sez occupant share holding infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez occupant share holding infos
	 */
	public java.util.List<SezOccupantShareHoldingInfo>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezOccupantShareHoldingInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the sez occupant share holding infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantShareHoldingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez occupant share holding infos
	 * @param end the upper bound of the range of sez occupant share holding infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez occupant share holding infos
	 */
	public java.util.List<SezOccupantShareHoldingInfo>
		findBygetSezStatusByAppId(
			long sezStatusApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezOccupantShareHoldingInfo> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first sez occupant share holding info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant share holding info
	 * @throws NoSuchSezOccupantShareHoldingInfoException if a matching sez occupant share holding info could not be found
	 */
	public SezOccupantShareHoldingInfo findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezOccupantShareHoldingInfo> orderByComparator)
		throws NoSuchSezOccupantShareHoldingInfoException;

	/**
	 * Returns the first sez occupant share holding info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez occupant share holding info, or <code>null</code> if a matching sez occupant share holding info could not be found
	 */
	public SezOccupantShareHoldingInfo fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantShareHoldingInfo> orderByComparator);

	/**
	 * Returns the last sez occupant share holding info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant share holding info
	 * @throws NoSuchSezOccupantShareHoldingInfoException if a matching sez occupant share holding info could not be found
	 */
	public SezOccupantShareHoldingInfo findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezOccupantShareHoldingInfo> orderByComparator)
		throws NoSuchSezOccupantShareHoldingInfoException;

	/**
	 * Returns the last sez occupant share holding info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez occupant share holding info, or <code>null</code> if a matching sez occupant share holding info could not be found
	 */
	public SezOccupantShareHoldingInfo fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantShareHoldingInfo> orderByComparator);

	/**
	 * Returns the sez occupant share holding infos before and after the current sez occupant share holding info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezOccShareHolderId the primary key of the current sez occupant share holding info
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez occupant share holding info
	 * @throws NoSuchSezOccupantShareHoldingInfoException if a sez occupant share holding info with the primary key could not be found
	 */
	public SezOccupantShareHoldingInfo[] findBygetSezStatusByAppId_PrevAndNext(
			long sezOccShareHolderId, long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezOccupantShareHoldingInfo> orderByComparator)
		throws NoSuchSezOccupantShareHoldingInfoException;

	/**
	 * Removes all the sez occupant share holding infos where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns the number of sez occupant share holding infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant share holding infos
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns the sez occupant share holding info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupantShareHoldingInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant share holding info
	 * @throws NoSuchSezOccupantShareHoldingInfoException if a matching sez occupant share holding info could not be found
	 */
	public SezOccupantShareHoldingInfo findBygetSezStatusBy_App_Id(
			long sezStatusApplicationId)
		throws NoSuchSezOccupantShareHoldingInfoException;

	/**
	 * Returns the sez occupant share holding info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant share holding info, or <code>null</code> if a matching sez occupant share holding info could not be found
	 */
	public SezOccupantShareHoldingInfo fetchBygetSezStatusBy_App_Id(
		long sezStatusApplicationId);

	/**
	 * Returns the sez occupant share holding info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant share holding info, or <code>null</code> if a matching sez occupant share holding info could not be found
	 */
	public SezOccupantShareHoldingInfo fetchBygetSezStatusBy_App_Id(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez occupant share holding info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupant share holding info that was removed
	 */
	public SezOccupantShareHoldingInfo removeBygetSezStatusBy_App_Id(
			long sezStatusApplicationId)
		throws NoSuchSezOccupantShareHoldingInfoException;

	/**
	 * Returns the number of sez occupant share holding infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant share holding infos
	 */
	public int countBygetSezStatusBy_App_Id(long sezStatusApplicationId);

	/**
	 * Caches the sez occupant share holding info in the entity cache if it is enabled.
	 *
	 * @param sezOccupantShareHoldingInfo the sez occupant share holding info
	 */
	public void cacheResult(
		SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo);

	/**
	 * Caches the sez occupant share holding infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupantShareHoldingInfos the sez occupant share holding infos
	 */
	public void cacheResult(
		java.util.List<SezOccupantShareHoldingInfo>
			sezOccupantShareHoldingInfos);

	/**
	 * Creates a new sez occupant share holding info with the primary key. Does not add the sez occupant share holding info to the database.
	 *
	 * @param sezOccShareHolderId the primary key for the new sez occupant share holding info
	 * @return the new sez occupant share holding info
	 */
	public SezOccupantShareHoldingInfo create(long sezOccShareHolderId);

	/**
	 * Removes the sez occupant share holding info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccShareHolderId the primary key of the sez occupant share holding info
	 * @return the sez occupant share holding info that was removed
	 * @throws NoSuchSezOccupantShareHoldingInfoException if a sez occupant share holding info with the primary key could not be found
	 */
	public SezOccupantShareHoldingInfo remove(long sezOccShareHolderId)
		throws NoSuchSezOccupantShareHoldingInfoException;

	public SezOccupantShareHoldingInfo updateImpl(
		SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo);

	/**
	 * Returns the sez occupant share holding info with the primary key or throws a <code>NoSuchSezOccupantShareHoldingInfoException</code> if it could not be found.
	 *
	 * @param sezOccShareHolderId the primary key of the sez occupant share holding info
	 * @return the sez occupant share holding info
	 * @throws NoSuchSezOccupantShareHoldingInfoException if a sez occupant share holding info with the primary key could not be found
	 */
	public SezOccupantShareHoldingInfo findByPrimaryKey(
			long sezOccShareHolderId)
		throws NoSuchSezOccupantShareHoldingInfoException;

	/**
	 * Returns the sez occupant share holding info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccShareHolderId the primary key of the sez occupant share holding info
	 * @return the sez occupant share holding info, or <code>null</code> if a sez occupant share holding info with the primary key could not be found
	 */
	public SezOccupantShareHoldingInfo fetchByPrimaryKey(
		long sezOccShareHolderId);

	/**
	 * Returns all the sez occupant share holding infos.
	 *
	 * @return the sez occupant share holding infos
	 */
	public java.util.List<SezOccupantShareHoldingInfo> findAll();

	/**
	 * Returns a range of all the sez occupant share holding infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantShareHoldingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant share holding infos
	 * @param end the upper bound of the range of sez occupant share holding infos (not inclusive)
	 * @return the range of sez occupant share holding infos
	 */
	public java.util.List<SezOccupantShareHoldingInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez occupant share holding infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantShareHoldingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant share holding infos
	 * @param end the upper bound of the range of sez occupant share holding infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant share holding infos
	 */
	public java.util.List<SezOccupantShareHoldingInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantShareHoldingInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the sez occupant share holding infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantShareHoldingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant share holding infos
	 * @param end the upper bound of the range of sez occupant share holding infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant share holding infos
	 */
	public java.util.List<SezOccupantShareHoldingInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantShareHoldingInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez occupant share holding infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez occupant share holding infos.
	 *
	 * @return the number of sez occupant share holding infos
	 */
	public int countAll();

}