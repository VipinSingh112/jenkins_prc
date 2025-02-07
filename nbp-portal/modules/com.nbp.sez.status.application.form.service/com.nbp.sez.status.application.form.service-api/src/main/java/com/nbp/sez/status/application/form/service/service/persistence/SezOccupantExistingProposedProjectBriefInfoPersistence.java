/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupantExistingProposedProjectBriefInfoException;
import com.nbp.sez.status.application.form.service.model.SezOccupantExistingProposedProjectBriefInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez occupant existing proposed project brief info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantExistingProposedProjectBriefInfoUtil
 * @generated
 */
@ProviderType
public interface SezOccupantExistingProposedProjectBriefInfoPersistence
	extends BasePersistence<SezOccupantExistingProposedProjectBriefInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezOccupantExistingProposedProjectBriefInfoUtil} to access the sez occupant existing proposed project brief info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez occupant existing proposed project brief info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupantExistingProposedProjectBriefInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant existing proposed project brief info
	 * @throws NoSuchSezOccupantExistingProposedProjectBriefInfoException if a matching sez occupant existing proposed project brief info could not be found
	 */
	public SezOccupantExistingProposedProjectBriefInfo
			findBygetSezStatusByAppId(long sezStatusApplicationId)
		throws NoSuchSezOccupantExistingProposedProjectBriefInfoException;

	/**
	 * Returns the sez occupant existing proposed project brief info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant existing proposed project brief info, or <code>null</code> if a matching sez occupant existing proposed project brief info could not be found
	 */
	public SezOccupantExistingProposedProjectBriefInfo
		fetchBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns the sez occupant existing proposed project brief info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant existing proposed project brief info, or <code>null</code> if a matching sez occupant existing proposed project brief info could not be found
	 */
	public SezOccupantExistingProposedProjectBriefInfo
		fetchBygetSezStatusByAppId(
			long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez occupant existing proposed project brief info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupant existing proposed project brief info that was removed
	 */
	public SezOccupantExistingProposedProjectBriefInfo
			removeBygetSezStatusByAppId(long sezStatusApplicationId)
		throws NoSuchSezOccupantExistingProposedProjectBriefInfoException;

	/**
	 * Returns the number of sez occupant existing proposed project brief infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant existing proposed project brief infos
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez occupant existing proposed project brief info in the entity cache if it is enabled.
	 *
	 * @param sezOccupantExistingProposedProjectBriefInfo the sez occupant existing proposed project brief info
	 */
	public void cacheResult(
		SezOccupantExistingProposedProjectBriefInfo
			sezOccupantExistingProposedProjectBriefInfo);

	/**
	 * Caches the sez occupant existing proposed project brief infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupantExistingProposedProjectBriefInfos the sez occupant existing proposed project brief infos
	 */
	public void cacheResult(
		java.util.List<SezOccupantExistingProposedProjectBriefInfo>
			sezOccupantExistingProposedProjectBriefInfos);

	/**
	 * Creates a new sez occupant existing proposed project brief info with the primary key. Does not add the sez occupant existing proposed project brief info to the database.
	 *
	 * @param sezOccExistPorpId the primary key for the new sez occupant existing proposed project brief info
	 * @return the new sez occupant existing proposed project brief info
	 */
	public SezOccupantExistingProposedProjectBriefInfo create(
		long sezOccExistPorpId);

	/**
	 * Removes the sez occupant existing proposed project brief info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccExistPorpId the primary key of the sez occupant existing proposed project brief info
	 * @return the sez occupant existing proposed project brief info that was removed
	 * @throws NoSuchSezOccupantExistingProposedProjectBriefInfoException if a sez occupant existing proposed project brief info with the primary key could not be found
	 */
	public SezOccupantExistingProposedProjectBriefInfo remove(
			long sezOccExistPorpId)
		throws NoSuchSezOccupantExistingProposedProjectBriefInfoException;

	public SezOccupantExistingProposedProjectBriefInfo updateImpl(
		SezOccupantExistingProposedProjectBriefInfo
			sezOccupantExistingProposedProjectBriefInfo);

	/**
	 * Returns the sez occupant existing proposed project brief info with the primary key or throws a <code>NoSuchSezOccupantExistingProposedProjectBriefInfoException</code> if it could not be found.
	 *
	 * @param sezOccExistPorpId the primary key of the sez occupant existing proposed project brief info
	 * @return the sez occupant existing proposed project brief info
	 * @throws NoSuchSezOccupantExistingProposedProjectBriefInfoException if a sez occupant existing proposed project brief info with the primary key could not be found
	 */
	public SezOccupantExistingProposedProjectBriefInfo findByPrimaryKey(
			long sezOccExistPorpId)
		throws NoSuchSezOccupantExistingProposedProjectBriefInfoException;

	/**
	 * Returns the sez occupant existing proposed project brief info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccExistPorpId the primary key of the sez occupant existing proposed project brief info
	 * @return the sez occupant existing proposed project brief info, or <code>null</code> if a sez occupant existing proposed project brief info with the primary key could not be found
	 */
	public SezOccupantExistingProposedProjectBriefInfo fetchByPrimaryKey(
		long sezOccExistPorpId);

	/**
	 * Returns all the sez occupant existing proposed project brief infos.
	 *
	 * @return the sez occupant existing proposed project brief infos
	 */
	public java.util.List<SezOccupantExistingProposedProjectBriefInfo>
		findAll();

	/**
	 * Returns a range of all the sez occupant existing proposed project brief infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantExistingProposedProjectBriefInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant existing proposed project brief infos
	 * @param end the upper bound of the range of sez occupant existing proposed project brief infos (not inclusive)
	 * @return the range of sez occupant existing proposed project brief infos
	 */
	public java.util.List<SezOccupantExistingProposedProjectBriefInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez occupant existing proposed project brief infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantExistingProposedProjectBriefInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant existing proposed project brief infos
	 * @param end the upper bound of the range of sez occupant existing proposed project brief infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant existing proposed project brief infos
	 */
	public java.util.List<SezOccupantExistingProposedProjectBriefInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantExistingProposedProjectBriefInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the sez occupant existing proposed project brief infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantExistingProposedProjectBriefInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant existing proposed project brief infos
	 * @param end the upper bound of the range of sez occupant existing proposed project brief infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant existing proposed project brief infos
	 */
	public java.util.List<SezOccupantExistingProposedProjectBriefInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantExistingProposedProjectBriefInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez occupant existing proposed project brief infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez occupant existing proposed project brief infos.
	 *
	 * @return the number of sez occupant existing proposed project brief infos
	 */
	public int countAll();

}