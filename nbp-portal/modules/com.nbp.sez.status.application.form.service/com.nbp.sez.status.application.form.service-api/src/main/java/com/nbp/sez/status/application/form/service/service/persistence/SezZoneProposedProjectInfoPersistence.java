/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezZoneProposedProjectInfoException;
import com.nbp.sez.status.application.form.service.model.SezZoneProposedProjectInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez zone proposed project info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneProposedProjectInfoUtil
 * @generated
 */
@ProviderType
public interface SezZoneProposedProjectInfoPersistence
	extends BasePersistence<SezZoneProposedProjectInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezZoneProposedProjectInfoUtil} to access the sez zone proposed project info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez zone proposed project info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezZoneProposedProjectInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone proposed project info
	 * @throws NoSuchSezZoneProposedProjectInfoException if a matching sez zone proposed project info could not be found
	 */
	public SezZoneProposedProjectInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneProposedProjectInfoException;

	/**
	 * Returns the sez zone proposed project info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone proposed project info, or <code>null</code> if a matching sez zone proposed project info could not be found
	 */
	public SezZoneProposedProjectInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns the sez zone proposed project info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone proposed project info, or <code>null</code> if a matching sez zone proposed project info could not be found
	 */
	public SezZoneProposedProjectInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez zone proposed project info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez zone proposed project info that was removed
	 */
	public SezZoneProposedProjectInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneProposedProjectInfoException;

	/**
	 * Returns the number of sez zone proposed project infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone proposed project infos
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez zone proposed project info in the entity cache if it is enabled.
	 *
	 * @param sezZoneProposedProjectInfo the sez zone proposed project info
	 */
	public void cacheResult(
		SezZoneProposedProjectInfo sezZoneProposedProjectInfo);

	/**
	 * Caches the sez zone proposed project infos in the entity cache if it is enabled.
	 *
	 * @param sezZoneProposedProjectInfos the sez zone proposed project infos
	 */
	public void cacheResult(
		java.util.List<SezZoneProposedProjectInfo> sezZoneProposedProjectInfos);

	/**
	 * Creates a new sez zone proposed project info with the primary key. Does not add the sez zone proposed project info to the database.
	 *
	 * @param sezZoneProposedProjectInfoId the primary key for the new sez zone proposed project info
	 * @return the new sez zone proposed project info
	 */
	public SezZoneProposedProjectInfo create(long sezZoneProposedProjectInfoId);

	/**
	 * Removes the sez zone proposed project info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneProposedProjectInfoId the primary key of the sez zone proposed project info
	 * @return the sez zone proposed project info that was removed
	 * @throws NoSuchSezZoneProposedProjectInfoException if a sez zone proposed project info with the primary key could not be found
	 */
	public SezZoneProposedProjectInfo remove(long sezZoneProposedProjectInfoId)
		throws NoSuchSezZoneProposedProjectInfoException;

	public SezZoneProposedProjectInfo updateImpl(
		SezZoneProposedProjectInfo sezZoneProposedProjectInfo);

	/**
	 * Returns the sez zone proposed project info with the primary key or throws a <code>NoSuchSezZoneProposedProjectInfoException</code> if it could not be found.
	 *
	 * @param sezZoneProposedProjectInfoId the primary key of the sez zone proposed project info
	 * @return the sez zone proposed project info
	 * @throws NoSuchSezZoneProposedProjectInfoException if a sez zone proposed project info with the primary key could not be found
	 */
	public SezZoneProposedProjectInfo findByPrimaryKey(
			long sezZoneProposedProjectInfoId)
		throws NoSuchSezZoneProposedProjectInfoException;

	/**
	 * Returns the sez zone proposed project info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneProposedProjectInfoId the primary key of the sez zone proposed project info
	 * @return the sez zone proposed project info, or <code>null</code> if a sez zone proposed project info with the primary key could not be found
	 */
	public SezZoneProposedProjectInfo fetchByPrimaryKey(
		long sezZoneProposedProjectInfoId);

	/**
	 * Returns all the sez zone proposed project infos.
	 *
	 * @return the sez zone proposed project infos
	 */
	public java.util.List<SezZoneProposedProjectInfo> findAll();

	/**
	 * Returns a range of all the sez zone proposed project infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneProposedProjectInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone proposed project infos
	 * @param end the upper bound of the range of sez zone proposed project infos (not inclusive)
	 * @return the range of sez zone proposed project infos
	 */
	public java.util.List<SezZoneProposedProjectInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez zone proposed project infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneProposedProjectInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone proposed project infos
	 * @param end the upper bound of the range of sez zone proposed project infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone proposed project infos
	 */
	public java.util.List<SezZoneProposedProjectInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezZoneProposedProjectInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the sez zone proposed project infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneProposedProjectInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone proposed project infos
	 * @param end the upper bound of the range of sez zone proposed project infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone proposed project infos
	 */
	public java.util.List<SezZoneProposedProjectInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezZoneProposedProjectInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez zone proposed project infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez zone proposed project infos.
	 *
	 * @return the number of sez zone proposed project infos
	 */
	public int countAll();

}