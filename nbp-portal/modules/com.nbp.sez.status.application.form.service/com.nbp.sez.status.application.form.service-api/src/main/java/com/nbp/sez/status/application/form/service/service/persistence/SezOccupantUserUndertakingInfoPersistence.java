/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupantUserUndertakingInfoException;
import com.nbp.sez.status.application.form.service.model.SezOccupantUserUndertakingInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez occupant user undertaking info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantUserUndertakingInfoUtil
 * @generated
 */
@ProviderType
public interface SezOccupantUserUndertakingInfoPersistence
	extends BasePersistence<SezOccupantUserUndertakingInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezOccupantUserUndertakingInfoUtil} to access the sez occupant user undertaking info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez occupant user undertaking info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupantUserUndertakingInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant user undertaking info
	 * @throws NoSuchSezOccupantUserUndertakingInfoException if a matching sez occupant user undertaking info could not be found
	 */
	public SezOccupantUserUndertakingInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupantUserUndertakingInfoException;

	/**
	 * Returns the sez occupant user undertaking info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant user undertaking info, or <code>null</code> if a matching sez occupant user undertaking info could not be found
	 */
	public SezOccupantUserUndertakingInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns the sez occupant user undertaking info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant user undertaking info, or <code>null</code> if a matching sez occupant user undertaking info could not be found
	 */
	public SezOccupantUserUndertakingInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez occupant user undertaking info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupant user undertaking info that was removed
	 */
	public SezOccupantUserUndertakingInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupantUserUndertakingInfoException;

	/**
	 * Returns the number of sez occupant user undertaking infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant user undertaking infos
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez occupant user undertaking info in the entity cache if it is enabled.
	 *
	 * @param sezOccupantUserUndertakingInfo the sez occupant user undertaking info
	 */
	public void cacheResult(
		SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo);

	/**
	 * Caches the sez occupant user undertaking infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupantUserUndertakingInfos the sez occupant user undertaking infos
	 */
	public void cacheResult(
		java.util.List<SezOccupantUserUndertakingInfo>
			sezOccupantUserUndertakingInfos);

	/**
	 * Creates a new sez occupant user undertaking info with the primary key. Does not add the sez occupant user undertaking info to the database.
	 *
	 * @param sezOccUserunderId the primary key for the new sez occupant user undertaking info
	 * @return the new sez occupant user undertaking info
	 */
	public SezOccupantUserUndertakingInfo create(long sezOccUserunderId);

	/**
	 * Removes the sez occupant user undertaking info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccUserunderId the primary key of the sez occupant user undertaking info
	 * @return the sez occupant user undertaking info that was removed
	 * @throws NoSuchSezOccupantUserUndertakingInfoException if a sez occupant user undertaking info with the primary key could not be found
	 */
	public SezOccupantUserUndertakingInfo remove(long sezOccUserunderId)
		throws NoSuchSezOccupantUserUndertakingInfoException;

	public SezOccupantUserUndertakingInfo updateImpl(
		SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo);

	/**
	 * Returns the sez occupant user undertaking info with the primary key or throws a <code>NoSuchSezOccupantUserUndertakingInfoException</code> if it could not be found.
	 *
	 * @param sezOccUserunderId the primary key of the sez occupant user undertaking info
	 * @return the sez occupant user undertaking info
	 * @throws NoSuchSezOccupantUserUndertakingInfoException if a sez occupant user undertaking info with the primary key could not be found
	 */
	public SezOccupantUserUndertakingInfo findByPrimaryKey(
			long sezOccUserunderId)
		throws NoSuchSezOccupantUserUndertakingInfoException;

	/**
	 * Returns the sez occupant user undertaking info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccUserunderId the primary key of the sez occupant user undertaking info
	 * @return the sez occupant user undertaking info, or <code>null</code> if a sez occupant user undertaking info with the primary key could not be found
	 */
	public SezOccupantUserUndertakingInfo fetchByPrimaryKey(
		long sezOccUserunderId);

	/**
	 * Returns all the sez occupant user undertaking infos.
	 *
	 * @return the sez occupant user undertaking infos
	 */
	public java.util.List<SezOccupantUserUndertakingInfo> findAll();

	/**
	 * Returns a range of all the sez occupant user undertaking infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantUserUndertakingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant user undertaking infos
	 * @param end the upper bound of the range of sez occupant user undertaking infos (not inclusive)
	 * @return the range of sez occupant user undertaking infos
	 */
	public java.util.List<SezOccupantUserUndertakingInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez occupant user undertaking infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantUserUndertakingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant user undertaking infos
	 * @param end the upper bound of the range of sez occupant user undertaking infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant user undertaking infos
	 */
	public java.util.List<SezOccupantUserUndertakingInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantUserUndertakingInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the sez occupant user undertaking infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantUserUndertakingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant user undertaking infos
	 * @param end the upper bound of the range of sez occupant user undertaking infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant user undertaking infos
	 */
	public java.util.List<SezOccupantUserUndertakingInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantUserUndertakingInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez occupant user undertaking infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez occupant user undertaking infos.
	 *
	 * @return the number of sez occupant user undertaking infos
	 */
	public int countAll();

}