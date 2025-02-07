/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionTravelHaltAppException;
import com.nbp.jtb.application.form.service.model.AttractionTravelHaltApp;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the attraction travel halt app service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionTravelHaltAppUtil
 * @generated
 */
@ProviderType
public interface AttractionTravelHaltAppPersistence
	extends BasePersistence<AttractionTravelHaltApp> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AttractionTravelHaltAppUtil} to access the attraction travel halt app persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the attraction travel halt app where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionTravelHaltAppException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction travel halt app
	 * @throws NoSuchAttractionTravelHaltAppException if a matching attraction travel halt app could not be found
	 */
	public AttractionTravelHaltApp findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionTravelHaltAppException;

	/**
	 * Returns the attraction travel halt app where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction travel halt app, or <code>null</code> if a matching attraction travel halt app could not be found
	 */
	public AttractionTravelHaltApp fetchBygetJTB_ByApplicationId(
		long jtbApplicationId);

	/**
	 * Returns the attraction travel halt app where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction travel halt app, or <code>null</code> if a matching attraction travel halt app could not be found
	 */
	public AttractionTravelHaltApp fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the attraction travel halt app where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction travel halt app that was removed
	 */
	public AttractionTravelHaltApp removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionTravelHaltAppException;

	/**
	 * Returns the number of attraction travel halt apps where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction travel halt apps
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Caches the attraction travel halt app in the entity cache if it is enabled.
	 *
	 * @param attractionTravelHaltApp the attraction travel halt app
	 */
	public void cacheResult(AttractionTravelHaltApp attractionTravelHaltApp);

	/**
	 * Caches the attraction travel halt apps in the entity cache if it is enabled.
	 *
	 * @param attractionTravelHaltApps the attraction travel halt apps
	 */
	public void cacheResult(
		java.util.List<AttractionTravelHaltApp> attractionTravelHaltApps);

	/**
	 * Creates a new attraction travel halt app with the primary key. Does not add the attraction travel halt app to the database.
	 *
	 * @param attractionTravelHaltAppId the primary key for the new attraction travel halt app
	 * @return the new attraction travel halt app
	 */
	public AttractionTravelHaltApp create(long attractionTravelHaltAppId);

	/**
	 * Removes the attraction travel halt app with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionTravelHaltAppId the primary key of the attraction travel halt app
	 * @return the attraction travel halt app that was removed
	 * @throws NoSuchAttractionTravelHaltAppException if a attraction travel halt app with the primary key could not be found
	 */
	public AttractionTravelHaltApp remove(long attractionTravelHaltAppId)
		throws NoSuchAttractionTravelHaltAppException;

	public AttractionTravelHaltApp updateImpl(
		AttractionTravelHaltApp attractionTravelHaltApp);

	/**
	 * Returns the attraction travel halt app with the primary key or throws a <code>NoSuchAttractionTravelHaltAppException</code> if it could not be found.
	 *
	 * @param attractionTravelHaltAppId the primary key of the attraction travel halt app
	 * @return the attraction travel halt app
	 * @throws NoSuchAttractionTravelHaltAppException if a attraction travel halt app with the primary key could not be found
	 */
	public AttractionTravelHaltApp findByPrimaryKey(
			long attractionTravelHaltAppId)
		throws NoSuchAttractionTravelHaltAppException;

	/**
	 * Returns the attraction travel halt app with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionTravelHaltAppId the primary key of the attraction travel halt app
	 * @return the attraction travel halt app, or <code>null</code> if a attraction travel halt app with the primary key could not be found
	 */
	public AttractionTravelHaltApp fetchByPrimaryKey(
		long attractionTravelHaltAppId);

	/**
	 * Returns all the attraction travel halt apps.
	 *
	 * @return the attraction travel halt apps
	 */
	public java.util.List<AttractionTravelHaltApp> findAll();

	/**
	 * Returns a range of all the attraction travel halt apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionTravelHaltAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction travel halt apps
	 * @param end the upper bound of the range of attraction travel halt apps (not inclusive)
	 * @return the range of attraction travel halt apps
	 */
	public java.util.List<AttractionTravelHaltApp> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the attraction travel halt apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionTravelHaltAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction travel halt apps
	 * @param end the upper bound of the range of attraction travel halt apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction travel halt apps
	 */
	public java.util.List<AttractionTravelHaltApp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AttractionTravelHaltApp> orderByComparator);

	/**
	 * Returns an ordered range of all the attraction travel halt apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionTravelHaltAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction travel halt apps
	 * @param end the upper bound of the range of attraction travel halt apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction travel halt apps
	 */
	public java.util.List<AttractionTravelHaltApp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AttractionTravelHaltApp> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the attraction travel halt apps from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of attraction travel halt apps.
	 *
	 * @return the number of attraction travel halt apps
	 */
	public int countAll();

}