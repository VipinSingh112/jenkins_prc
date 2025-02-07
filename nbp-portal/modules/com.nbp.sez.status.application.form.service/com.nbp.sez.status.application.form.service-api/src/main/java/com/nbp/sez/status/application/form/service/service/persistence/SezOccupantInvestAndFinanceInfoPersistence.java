/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupantInvestAndFinanceInfoException;
import com.nbp.sez.status.application.form.service.model.SezOccupantInvestAndFinanceInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez occupant invest and finance info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantInvestAndFinanceInfoUtil
 * @generated
 */
@ProviderType
public interface SezOccupantInvestAndFinanceInfoPersistence
	extends BasePersistence<SezOccupantInvestAndFinanceInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezOccupantInvestAndFinanceInfoUtil} to access the sez occupant invest and finance info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez occupant invest and finance info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupantInvestAndFinanceInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant invest and finance info
	 * @throws NoSuchSezOccupantInvestAndFinanceInfoException if a matching sez occupant invest and finance info could not be found
	 */
	public SezOccupantInvestAndFinanceInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupantInvestAndFinanceInfoException;

	/**
	 * Returns the sez occupant invest and finance info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant invest and finance info, or <code>null</code> if a matching sez occupant invest and finance info could not be found
	 */
	public SezOccupantInvestAndFinanceInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns the sez occupant invest and finance info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant invest and finance info, or <code>null</code> if a matching sez occupant invest and finance info could not be found
	 */
	public SezOccupantInvestAndFinanceInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez occupant invest and finance info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupant invest and finance info that was removed
	 */
	public SezOccupantInvestAndFinanceInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupantInvestAndFinanceInfoException;

	/**
	 * Returns the number of sez occupant invest and finance infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant invest and finance infos
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez occupant invest and finance info in the entity cache if it is enabled.
	 *
	 * @param sezOccupantInvestAndFinanceInfo the sez occupant invest and finance info
	 */
	public void cacheResult(
		SezOccupantInvestAndFinanceInfo sezOccupantInvestAndFinanceInfo);

	/**
	 * Caches the sez occupant invest and finance infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupantInvestAndFinanceInfos the sez occupant invest and finance infos
	 */
	public void cacheResult(
		java.util.List<SezOccupantInvestAndFinanceInfo>
			sezOccupantInvestAndFinanceInfos);

	/**
	 * Creates a new sez occupant invest and finance info with the primary key. Does not add the sez occupant invest and finance info to the database.
	 *
	 * @param sezOccInvestFinancId the primary key for the new sez occupant invest and finance info
	 * @return the new sez occupant invest and finance info
	 */
	public SezOccupantInvestAndFinanceInfo create(long sezOccInvestFinancId);

	/**
	 * Removes the sez occupant invest and finance info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccInvestFinancId the primary key of the sez occupant invest and finance info
	 * @return the sez occupant invest and finance info that was removed
	 * @throws NoSuchSezOccupantInvestAndFinanceInfoException if a sez occupant invest and finance info with the primary key could not be found
	 */
	public SezOccupantInvestAndFinanceInfo remove(long sezOccInvestFinancId)
		throws NoSuchSezOccupantInvestAndFinanceInfoException;

	public SezOccupantInvestAndFinanceInfo updateImpl(
		SezOccupantInvestAndFinanceInfo sezOccupantInvestAndFinanceInfo);

	/**
	 * Returns the sez occupant invest and finance info with the primary key or throws a <code>NoSuchSezOccupantInvestAndFinanceInfoException</code> if it could not be found.
	 *
	 * @param sezOccInvestFinancId the primary key of the sez occupant invest and finance info
	 * @return the sez occupant invest and finance info
	 * @throws NoSuchSezOccupantInvestAndFinanceInfoException if a sez occupant invest and finance info with the primary key could not be found
	 */
	public SezOccupantInvestAndFinanceInfo findByPrimaryKey(
			long sezOccInvestFinancId)
		throws NoSuchSezOccupantInvestAndFinanceInfoException;

	/**
	 * Returns the sez occupant invest and finance info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccInvestFinancId the primary key of the sez occupant invest and finance info
	 * @return the sez occupant invest and finance info, or <code>null</code> if a sez occupant invest and finance info with the primary key could not be found
	 */
	public SezOccupantInvestAndFinanceInfo fetchByPrimaryKey(
		long sezOccInvestFinancId);

	/**
	 * Returns all the sez occupant invest and finance infos.
	 *
	 * @return the sez occupant invest and finance infos
	 */
	public java.util.List<SezOccupantInvestAndFinanceInfo> findAll();

	/**
	 * Returns a range of all the sez occupant invest and finance infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantInvestAndFinanceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant invest and finance infos
	 * @param end the upper bound of the range of sez occupant invest and finance infos (not inclusive)
	 * @return the range of sez occupant invest and finance infos
	 */
	public java.util.List<SezOccupantInvestAndFinanceInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez occupant invest and finance infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantInvestAndFinanceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant invest and finance infos
	 * @param end the upper bound of the range of sez occupant invest and finance infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant invest and finance infos
	 */
	public java.util.List<SezOccupantInvestAndFinanceInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantInvestAndFinanceInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the sez occupant invest and finance infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantInvestAndFinanceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant invest and finance infos
	 * @param end the upper bound of the range of sez occupant invest and finance infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant invest and finance infos
	 */
	public java.util.List<SezOccupantInvestAndFinanceInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezOccupantInvestAndFinanceInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez occupant invest and finance infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez occupant invest and finance infos.
	 *
	 * @return the number of sez occupant invest and finance infos
	 */
	public int countAll();

}