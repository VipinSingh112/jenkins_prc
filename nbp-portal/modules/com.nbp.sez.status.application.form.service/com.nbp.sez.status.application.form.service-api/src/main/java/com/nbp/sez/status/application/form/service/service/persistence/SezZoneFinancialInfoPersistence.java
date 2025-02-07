/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezZoneFinancialInfoException;
import com.nbp.sez.status.application.form.service.model.SezZoneFinancialInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez zone financial info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneFinancialInfoUtil
 * @generated
 */
@ProviderType
public interface SezZoneFinancialInfoPersistence
	extends BasePersistence<SezZoneFinancialInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezZoneFinancialInfoUtil} to access the sez zone financial info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez zone financial info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezZoneFinancialInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone financial info
	 * @throws NoSuchSezZoneFinancialInfoException if a matching sez zone financial info could not be found
	 */
	public SezZoneFinancialInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneFinancialInfoException;

	/**
	 * Returns the sez zone financial info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone financial info, or <code>null</code> if a matching sez zone financial info could not be found
	 */
	public SezZoneFinancialInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns the sez zone financial info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone financial info, or <code>null</code> if a matching sez zone financial info could not be found
	 */
	public SezZoneFinancialInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez zone financial info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez zone financial info that was removed
	 */
	public SezZoneFinancialInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneFinancialInfoException;

	/**
	 * Returns the number of sez zone financial infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone financial infos
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez zone financial info in the entity cache if it is enabled.
	 *
	 * @param sezZoneFinancialInfo the sez zone financial info
	 */
	public void cacheResult(SezZoneFinancialInfo sezZoneFinancialInfo);

	/**
	 * Caches the sez zone financial infos in the entity cache if it is enabled.
	 *
	 * @param sezZoneFinancialInfos the sez zone financial infos
	 */
	public void cacheResult(
		java.util.List<SezZoneFinancialInfo> sezZoneFinancialInfos);

	/**
	 * Creates a new sez zone financial info with the primary key. Does not add the sez zone financial info to the database.
	 *
	 * @param sezZoneFinancialnfoId the primary key for the new sez zone financial info
	 * @return the new sez zone financial info
	 */
	public SezZoneFinancialInfo create(long sezZoneFinancialnfoId);

	/**
	 * Removes the sez zone financial info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneFinancialnfoId the primary key of the sez zone financial info
	 * @return the sez zone financial info that was removed
	 * @throws NoSuchSezZoneFinancialInfoException if a sez zone financial info with the primary key could not be found
	 */
	public SezZoneFinancialInfo remove(long sezZoneFinancialnfoId)
		throws NoSuchSezZoneFinancialInfoException;

	public SezZoneFinancialInfo updateImpl(
		SezZoneFinancialInfo sezZoneFinancialInfo);

	/**
	 * Returns the sez zone financial info with the primary key or throws a <code>NoSuchSezZoneFinancialInfoException</code> if it could not be found.
	 *
	 * @param sezZoneFinancialnfoId the primary key of the sez zone financial info
	 * @return the sez zone financial info
	 * @throws NoSuchSezZoneFinancialInfoException if a sez zone financial info with the primary key could not be found
	 */
	public SezZoneFinancialInfo findByPrimaryKey(long sezZoneFinancialnfoId)
		throws NoSuchSezZoneFinancialInfoException;

	/**
	 * Returns the sez zone financial info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneFinancialnfoId the primary key of the sez zone financial info
	 * @return the sez zone financial info, or <code>null</code> if a sez zone financial info with the primary key could not be found
	 */
	public SezZoneFinancialInfo fetchByPrimaryKey(long sezZoneFinancialnfoId);

	/**
	 * Returns all the sez zone financial infos.
	 *
	 * @return the sez zone financial infos
	 */
	public java.util.List<SezZoneFinancialInfo> findAll();

	/**
	 * Returns a range of all the sez zone financial infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneFinancialInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone financial infos
	 * @param end the upper bound of the range of sez zone financial infos (not inclusive)
	 * @return the range of sez zone financial infos
	 */
	public java.util.List<SezZoneFinancialInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez zone financial infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneFinancialInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone financial infos
	 * @param end the upper bound of the range of sez zone financial infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone financial infos
	 */
	public java.util.List<SezZoneFinancialInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneFinancialInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez zone financial infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneFinancialInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone financial infos
	 * @param end the upper bound of the range of sez zone financial infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone financial infos
	 */
	public java.util.List<SezZoneFinancialInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneFinancialInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez zone financial infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez zone financial infos.
	 *
	 * @return the number of sez zone financial infos
	 */
	public int countAll();

}