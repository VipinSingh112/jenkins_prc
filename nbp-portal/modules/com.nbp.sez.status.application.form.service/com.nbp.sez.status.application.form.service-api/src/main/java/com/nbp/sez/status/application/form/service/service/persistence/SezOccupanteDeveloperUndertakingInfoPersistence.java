/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupanteDeveloperUndertakingInfoException;
import com.nbp.sez.status.application.form.service.model.SezOccupanteDeveloperUndertakingInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez occupante developer undertaking info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupanteDeveloperUndertakingInfoUtil
 * @generated
 */
@ProviderType
public interface SezOccupanteDeveloperUndertakingInfoPersistence
	extends BasePersistence<SezOccupanteDeveloperUndertakingInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezOccupanteDeveloperUndertakingInfoUtil} to access the sez occupante developer undertaking info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez occupante developer undertaking info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupanteDeveloperUndertakingInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupante developer undertaking info
	 * @throws NoSuchSezOccupanteDeveloperUndertakingInfoException if a matching sez occupante developer undertaking info could not be found
	 */
	public SezOccupanteDeveloperUndertakingInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupanteDeveloperUndertakingInfoException;

	/**
	 * Returns the sez occupante developer undertaking info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupante developer undertaking info, or <code>null</code> if a matching sez occupante developer undertaking info could not be found
	 */
	public SezOccupanteDeveloperUndertakingInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns the sez occupante developer undertaking info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupante developer undertaking info, or <code>null</code> if a matching sez occupante developer undertaking info could not be found
	 */
	public SezOccupanteDeveloperUndertakingInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez occupante developer undertaking info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupante developer undertaking info that was removed
	 */
	public SezOccupanteDeveloperUndertakingInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupanteDeveloperUndertakingInfoException;

	/**
	 * Returns the number of sez occupante developer undertaking infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupante developer undertaking infos
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez occupante developer undertaking info in the entity cache if it is enabled.
	 *
	 * @param sezOccupanteDeveloperUndertakingInfo the sez occupante developer undertaking info
	 */
	public void cacheResult(
		SezOccupanteDeveloperUndertakingInfo
			sezOccupanteDeveloperUndertakingInfo);

	/**
	 * Caches the sez occupante developer undertaking infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupanteDeveloperUndertakingInfos the sez occupante developer undertaking infos
	 */
	public void cacheResult(
		java.util.List<SezOccupanteDeveloperUndertakingInfo>
			sezOccupanteDeveloperUndertakingInfos);

	/**
	 * Creates a new sez occupante developer undertaking info with the primary key. Does not add the sez occupante developer undertaking info to the database.
	 *
	 * @param sezOccDevUnderId the primary key for the new sez occupante developer undertaking info
	 * @return the new sez occupante developer undertaking info
	 */
	public SezOccupanteDeveloperUndertakingInfo create(long sezOccDevUnderId);

	/**
	 * Removes the sez occupante developer undertaking info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccDevUnderId the primary key of the sez occupante developer undertaking info
	 * @return the sez occupante developer undertaking info that was removed
	 * @throws NoSuchSezOccupanteDeveloperUndertakingInfoException if a sez occupante developer undertaking info with the primary key could not be found
	 */
	public SezOccupanteDeveloperUndertakingInfo remove(long sezOccDevUnderId)
		throws NoSuchSezOccupanteDeveloperUndertakingInfoException;

	public SezOccupanteDeveloperUndertakingInfo updateImpl(
		SezOccupanteDeveloperUndertakingInfo
			sezOccupanteDeveloperUndertakingInfo);

	/**
	 * Returns the sez occupante developer undertaking info with the primary key or throws a <code>NoSuchSezOccupanteDeveloperUndertakingInfoException</code> if it could not be found.
	 *
	 * @param sezOccDevUnderId the primary key of the sez occupante developer undertaking info
	 * @return the sez occupante developer undertaking info
	 * @throws NoSuchSezOccupanteDeveloperUndertakingInfoException if a sez occupante developer undertaking info with the primary key could not be found
	 */
	public SezOccupanteDeveloperUndertakingInfo findByPrimaryKey(
			long sezOccDevUnderId)
		throws NoSuchSezOccupanteDeveloperUndertakingInfoException;

	/**
	 * Returns the sez occupante developer undertaking info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccDevUnderId the primary key of the sez occupante developer undertaking info
	 * @return the sez occupante developer undertaking info, or <code>null</code> if a sez occupante developer undertaking info with the primary key could not be found
	 */
	public SezOccupanteDeveloperUndertakingInfo fetchByPrimaryKey(
		long sezOccDevUnderId);

	/**
	 * Returns all the sez occupante developer undertaking infos.
	 *
	 * @return the sez occupante developer undertaking infos
	 */
	public java.util.List<SezOccupanteDeveloperUndertakingInfo> findAll();

	/**
	 * Returns a range of all the sez occupante developer undertaking infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupanteDeveloperUndertakingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupante developer undertaking infos
	 * @param end the upper bound of the range of sez occupante developer undertaking infos (not inclusive)
	 * @return the range of sez occupante developer undertaking infos
	 */
	public java.util.List<SezOccupanteDeveloperUndertakingInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez occupante developer undertaking infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupanteDeveloperUndertakingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupante developer undertaking infos
	 * @param end the upper bound of the range of sez occupante developer undertaking infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupante developer undertaking infos
	 */
	public java.util.List<SezOccupanteDeveloperUndertakingInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupanteDeveloperUndertakingInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the sez occupante developer undertaking infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupanteDeveloperUndertakingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupante developer undertaking infos
	 * @param end the upper bound of the range of sez occupante developer undertaking infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupante developer undertaking infos
	 */
	public java.util.List<SezOccupanteDeveloperUndertakingInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupanteDeveloperUndertakingInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez occupante developer undertaking infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez occupante developer undertaking infos.
	 *
	 * @return the number of sez occupante developer undertaking infos
	 */
	public int countAll();

}