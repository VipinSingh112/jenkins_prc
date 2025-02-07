/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionWaterSportException;
import com.nbp.jtb.application.form.service.model.AttractionWaterSport;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the attraction water sport service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterSportUtil
 * @generated
 */
@ProviderType
public interface AttractionWaterSportPersistence
	extends BasePersistence<AttractionWaterSport> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AttractionWaterSportUtil} to access the attraction water sport persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the attraction water sport where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionWaterSportException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction water sport
	 * @throws NoSuchAttractionWaterSportException if a matching attraction water sport could not be found
	 */
	public AttractionWaterSport findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionWaterSportException;

	/**
	 * Returns the attraction water sport where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction water sport, or <code>null</code> if a matching attraction water sport could not be found
	 */
	public AttractionWaterSport fetchBygetJTB_ByApplicationId(
		long jtbApplicationId);

	/**
	 * Returns the attraction water sport where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction water sport, or <code>null</code> if a matching attraction water sport could not be found
	 */
	public AttractionWaterSport fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the attraction water sport where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction water sport that was removed
	 */
	public AttractionWaterSport removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionWaterSportException;

	/**
	 * Returns the number of attraction water sports where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction water sports
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Caches the attraction water sport in the entity cache if it is enabled.
	 *
	 * @param attractionWaterSport the attraction water sport
	 */
	public void cacheResult(AttractionWaterSport attractionWaterSport);

	/**
	 * Caches the attraction water sports in the entity cache if it is enabled.
	 *
	 * @param attractionWaterSports the attraction water sports
	 */
	public void cacheResult(
		java.util.List<AttractionWaterSport> attractionWaterSports);

	/**
	 * Creates a new attraction water sport with the primary key. Does not add the attraction water sport to the database.
	 *
	 * @param attractionWaterSportId the primary key for the new attraction water sport
	 * @return the new attraction water sport
	 */
	public AttractionWaterSport create(long attractionWaterSportId);

	/**
	 * Removes the attraction water sport with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionWaterSportId the primary key of the attraction water sport
	 * @return the attraction water sport that was removed
	 * @throws NoSuchAttractionWaterSportException if a attraction water sport with the primary key could not be found
	 */
	public AttractionWaterSport remove(long attractionWaterSportId)
		throws NoSuchAttractionWaterSportException;

	public AttractionWaterSport updateImpl(
		AttractionWaterSport attractionWaterSport);

	/**
	 * Returns the attraction water sport with the primary key or throws a <code>NoSuchAttractionWaterSportException</code> if it could not be found.
	 *
	 * @param attractionWaterSportId the primary key of the attraction water sport
	 * @return the attraction water sport
	 * @throws NoSuchAttractionWaterSportException if a attraction water sport with the primary key could not be found
	 */
	public AttractionWaterSport findByPrimaryKey(long attractionWaterSportId)
		throws NoSuchAttractionWaterSportException;

	/**
	 * Returns the attraction water sport with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionWaterSportId the primary key of the attraction water sport
	 * @return the attraction water sport, or <code>null</code> if a attraction water sport with the primary key could not be found
	 */
	public AttractionWaterSport fetchByPrimaryKey(long attractionWaterSportId);

	/**
	 * Returns all the attraction water sports.
	 *
	 * @return the attraction water sports
	 */
	public java.util.List<AttractionWaterSport> findAll();

	/**
	 * Returns a range of all the attraction water sports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterSportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water sports
	 * @param end the upper bound of the range of attraction water sports (not inclusive)
	 * @return the range of attraction water sports
	 */
	public java.util.List<AttractionWaterSport> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the attraction water sports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterSportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water sports
	 * @param end the upper bound of the range of attraction water sports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction water sports
	 */
	public java.util.List<AttractionWaterSport> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AttractionWaterSport>
			orderByComparator);

	/**
	 * Returns an ordered range of all the attraction water sports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterSportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water sports
	 * @param end the upper bound of the range of attraction water sports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction water sports
	 */
	public java.util.List<AttractionWaterSport> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AttractionWaterSport>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the attraction water sports from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of attraction water sports.
	 *
	 * @return the number of attraction water sports
	 */
	public int countAll();

}