/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevShareholdingInfoException;
import com.nbp.sez.status.application.form.service.model.SezDevShareholdingInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez dev shareholding info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareholdingInfoUtil
 * @generated
 */
@ProviderType
public interface SezDevShareholdingInfoPersistence
	extends BasePersistence<SezDevShareholdingInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezDevShareholdingInfoUtil} to access the sez dev shareholding info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez dev shareholding info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezDevShareholdingInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev shareholding info
	 * @throws NoSuchSezDevShareholdingInfoException if a matching sez dev shareholding info could not be found
	 */
	public SezDevShareholdingInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevShareholdingInfoException;

	/**
	 * Returns the sez dev shareholding info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev shareholding info, or <code>null</code> if a matching sez dev shareholding info could not be found
	 */
	public SezDevShareholdingInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns the sez dev shareholding info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez dev shareholding info, or <code>null</code> if a matching sez dev shareholding info could not be found
	 */
	public SezDevShareholdingInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez dev shareholding info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez dev shareholding info that was removed
	 */
	public SezDevShareholdingInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevShareholdingInfoException;

	/**
	 * Returns the number of sez dev shareholding infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev shareholding infos
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez dev shareholding info in the entity cache if it is enabled.
	 *
	 * @param sezDevShareholdingInfo the sez dev shareholding info
	 */
	public void cacheResult(SezDevShareholdingInfo sezDevShareholdingInfo);

	/**
	 * Caches the sez dev shareholding infos in the entity cache if it is enabled.
	 *
	 * @param sezDevShareholdingInfos the sez dev shareholding infos
	 */
	public void cacheResult(
		java.util.List<SezDevShareholdingInfo> sezDevShareholdingInfos);

	/**
	 * Creates a new sez dev shareholding info with the primary key. Does not add the sez dev shareholding info to the database.
	 *
	 * @param sezDevShareholdingInfoId the primary key for the new sez dev shareholding info
	 * @return the new sez dev shareholding info
	 */
	public SezDevShareholdingInfo create(long sezDevShareholdingInfoId);

	/**
	 * Removes the sez dev shareholding info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevShareholdingInfoId the primary key of the sez dev shareholding info
	 * @return the sez dev shareholding info that was removed
	 * @throws NoSuchSezDevShareholdingInfoException if a sez dev shareholding info with the primary key could not be found
	 */
	public SezDevShareholdingInfo remove(long sezDevShareholdingInfoId)
		throws NoSuchSezDevShareholdingInfoException;

	public SezDevShareholdingInfo updateImpl(
		SezDevShareholdingInfo sezDevShareholdingInfo);

	/**
	 * Returns the sez dev shareholding info with the primary key or throws a <code>NoSuchSezDevShareholdingInfoException</code> if it could not be found.
	 *
	 * @param sezDevShareholdingInfoId the primary key of the sez dev shareholding info
	 * @return the sez dev shareholding info
	 * @throws NoSuchSezDevShareholdingInfoException if a sez dev shareholding info with the primary key could not be found
	 */
	public SezDevShareholdingInfo findByPrimaryKey(
			long sezDevShareholdingInfoId)
		throws NoSuchSezDevShareholdingInfoException;

	/**
	 * Returns the sez dev shareholding info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevShareholdingInfoId the primary key of the sez dev shareholding info
	 * @return the sez dev shareholding info, or <code>null</code> if a sez dev shareholding info with the primary key could not be found
	 */
	public SezDevShareholdingInfo fetchByPrimaryKey(
		long sezDevShareholdingInfoId);

	/**
	 * Returns all the sez dev shareholding infos.
	 *
	 * @return the sez dev shareholding infos
	 */
	public java.util.List<SezDevShareholdingInfo> findAll();

	/**
	 * Returns a range of all the sez dev shareholding infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareholdingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev shareholding infos
	 * @param end the upper bound of the range of sez dev shareholding infos (not inclusive)
	 * @return the range of sez dev shareholding infos
	 */
	public java.util.List<SezDevShareholdingInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez dev shareholding infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareholdingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev shareholding infos
	 * @param end the upper bound of the range of sez dev shareholding infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev shareholding infos
	 */
	public java.util.List<SezDevShareholdingInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezDevShareholdingInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez dev shareholding infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareholdingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev shareholding infos
	 * @param end the upper bound of the range of sez dev shareholding infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev shareholding infos
	 */
	public java.util.List<SezDevShareholdingInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezDevShareholdingInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez dev shareholding infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez dev shareholding infos.
	 *
	 * @return the number of sez dev shareholding infos
	 */
	public int countAll();

}