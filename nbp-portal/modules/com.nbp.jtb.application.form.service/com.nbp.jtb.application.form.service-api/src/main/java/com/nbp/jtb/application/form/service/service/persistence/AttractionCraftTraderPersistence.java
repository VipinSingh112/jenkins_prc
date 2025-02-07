/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionCraftTraderException;
import com.nbp.jtb.application.form.service.model.AttractionCraftTrader;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the attraction craft trader service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCraftTraderUtil
 * @generated
 */
@ProviderType
public interface AttractionCraftTraderPersistence
	extends BasePersistence<AttractionCraftTrader> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AttractionCraftTraderUtil} to access the attraction craft trader persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the attraction craft trader where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionCraftTraderException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction craft trader
	 * @throws NoSuchAttractionCraftTraderException if a matching attraction craft trader could not be found
	 */
	public AttractionCraftTrader findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionCraftTraderException;

	/**
	 * Returns the attraction craft trader where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction craft trader, or <code>null</code> if a matching attraction craft trader could not be found
	 */
	public AttractionCraftTrader fetchBygetJTB_ByApplicationId(
		long jtbApplicationId);

	/**
	 * Returns the attraction craft trader where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction craft trader, or <code>null</code> if a matching attraction craft trader could not be found
	 */
	public AttractionCraftTrader fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the attraction craft trader where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction craft trader that was removed
	 */
	public AttractionCraftTrader removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionCraftTraderException;

	/**
	 * Returns the number of attraction craft traders where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction craft traders
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Caches the attraction craft trader in the entity cache if it is enabled.
	 *
	 * @param attractionCraftTrader the attraction craft trader
	 */
	public void cacheResult(AttractionCraftTrader attractionCraftTrader);

	/**
	 * Caches the attraction craft traders in the entity cache if it is enabled.
	 *
	 * @param attractionCraftTraders the attraction craft traders
	 */
	public void cacheResult(
		java.util.List<AttractionCraftTrader> attractionCraftTraders);

	/**
	 * Creates a new attraction craft trader with the primary key. Does not add the attraction craft trader to the database.
	 *
	 * @param attractionCraftTraderId the primary key for the new attraction craft trader
	 * @return the new attraction craft trader
	 */
	public AttractionCraftTrader create(long attractionCraftTraderId);

	/**
	 * Removes the attraction craft trader with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionCraftTraderId the primary key of the attraction craft trader
	 * @return the attraction craft trader that was removed
	 * @throws NoSuchAttractionCraftTraderException if a attraction craft trader with the primary key could not be found
	 */
	public AttractionCraftTrader remove(long attractionCraftTraderId)
		throws NoSuchAttractionCraftTraderException;

	public AttractionCraftTrader updateImpl(
		AttractionCraftTrader attractionCraftTrader);

	/**
	 * Returns the attraction craft trader with the primary key or throws a <code>NoSuchAttractionCraftTraderException</code> if it could not be found.
	 *
	 * @param attractionCraftTraderId the primary key of the attraction craft trader
	 * @return the attraction craft trader
	 * @throws NoSuchAttractionCraftTraderException if a attraction craft trader with the primary key could not be found
	 */
	public AttractionCraftTrader findByPrimaryKey(long attractionCraftTraderId)
		throws NoSuchAttractionCraftTraderException;

	/**
	 * Returns the attraction craft trader with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionCraftTraderId the primary key of the attraction craft trader
	 * @return the attraction craft trader, or <code>null</code> if a attraction craft trader with the primary key could not be found
	 */
	public AttractionCraftTrader fetchByPrimaryKey(
		long attractionCraftTraderId);

	/**
	 * Returns all the attraction craft traders.
	 *
	 * @return the attraction craft traders
	 */
	public java.util.List<AttractionCraftTrader> findAll();

	/**
	 * Returns a range of all the attraction craft traders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCraftTraderModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction craft traders
	 * @param end the upper bound of the range of attraction craft traders (not inclusive)
	 * @return the range of attraction craft traders
	 */
	public java.util.List<AttractionCraftTrader> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the attraction craft traders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCraftTraderModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction craft traders
	 * @param end the upper bound of the range of attraction craft traders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction craft traders
	 */
	public java.util.List<AttractionCraftTrader> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AttractionCraftTrader>
			orderByComparator);

	/**
	 * Returns an ordered range of all the attraction craft traders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCraftTraderModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction craft traders
	 * @param end the upper bound of the range of attraction craft traders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction craft traders
	 */
	public java.util.List<AttractionCraftTrader> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AttractionCraftTrader>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the attraction craft traders from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of attraction craft traders.
	 *
	 * @return the number of attraction craft traders
	 */
	public int countAll();

}