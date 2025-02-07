/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjAddLocMultiSiteException;
import com.nbp.ncbj.application.form.service.model.NcbjAddLocMultiSite;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj add loc multi site service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjAddLocMultiSiteUtil
 * @generated
 */
@ProviderType
public interface NcbjAddLocMultiSitePersistence
	extends BasePersistence<NcbjAddLocMultiSite> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjAddLocMultiSiteUtil} to access the ncbj add loc multi site persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncbj add loc multi site where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjAddLocMultiSiteException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj add loc multi site
	 * @throws NoSuchNcbjAddLocMultiSiteException if a matching ncbj add loc multi site could not be found
	 */
	public NcbjAddLocMultiSite findBygetNCBJByAppId(long ncbjApplicationId)
		throws NoSuchNcbjAddLocMultiSiteException;

	/**
	 * Returns the ncbj add loc multi site where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj add loc multi site, or <code>null</code> if a matching ncbj add loc multi site could not be found
	 */
	public NcbjAddLocMultiSite fetchBygetNCBJByAppId(long ncbjApplicationId);

	/**
	 * Returns the ncbj add loc multi site where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj add loc multi site, or <code>null</code> if a matching ncbj add loc multi site could not be found
	 */
	public NcbjAddLocMultiSite fetchBygetNCBJByAppId(
		long ncbjApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncbj add loc multi site where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj add loc multi site that was removed
	 */
	public NcbjAddLocMultiSite removeBygetNCBJByAppId(long ncbjApplicationId)
		throws NoSuchNcbjAddLocMultiSiteException;

	/**
	 * Returns the number of ncbj add loc multi sites where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj add loc multi sites
	 */
	public int countBygetNCBJByAppId(long ncbjApplicationId);

	/**
	 * Caches the ncbj add loc multi site in the entity cache if it is enabled.
	 *
	 * @param ncbjAddLocMultiSite the ncbj add loc multi site
	 */
	public void cacheResult(NcbjAddLocMultiSite ncbjAddLocMultiSite);

	/**
	 * Caches the ncbj add loc multi sites in the entity cache if it is enabled.
	 *
	 * @param ncbjAddLocMultiSites the ncbj add loc multi sites
	 */
	public void cacheResult(
		java.util.List<NcbjAddLocMultiSite> ncbjAddLocMultiSites);

	/**
	 * Creates a new ncbj add loc multi site with the primary key. Does not add the ncbj add loc multi site to the database.
	 *
	 * @param ncbjAddLocMultiSiteId the primary key for the new ncbj add loc multi site
	 * @return the new ncbj add loc multi site
	 */
	public NcbjAddLocMultiSite create(long ncbjAddLocMultiSiteId);

	/**
	 * Removes the ncbj add loc multi site with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjAddLocMultiSiteId the primary key of the ncbj add loc multi site
	 * @return the ncbj add loc multi site that was removed
	 * @throws NoSuchNcbjAddLocMultiSiteException if a ncbj add loc multi site with the primary key could not be found
	 */
	public NcbjAddLocMultiSite remove(long ncbjAddLocMultiSiteId)
		throws NoSuchNcbjAddLocMultiSiteException;

	public NcbjAddLocMultiSite updateImpl(
		NcbjAddLocMultiSite ncbjAddLocMultiSite);

	/**
	 * Returns the ncbj add loc multi site with the primary key or throws a <code>NoSuchNcbjAddLocMultiSiteException</code> if it could not be found.
	 *
	 * @param ncbjAddLocMultiSiteId the primary key of the ncbj add loc multi site
	 * @return the ncbj add loc multi site
	 * @throws NoSuchNcbjAddLocMultiSiteException if a ncbj add loc multi site with the primary key could not be found
	 */
	public NcbjAddLocMultiSite findByPrimaryKey(long ncbjAddLocMultiSiteId)
		throws NoSuchNcbjAddLocMultiSiteException;

	/**
	 * Returns the ncbj add loc multi site with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjAddLocMultiSiteId the primary key of the ncbj add loc multi site
	 * @return the ncbj add loc multi site, or <code>null</code> if a ncbj add loc multi site with the primary key could not be found
	 */
	public NcbjAddLocMultiSite fetchByPrimaryKey(long ncbjAddLocMultiSiteId);

	/**
	 * Returns all the ncbj add loc multi sites.
	 *
	 * @return the ncbj add loc multi sites
	 */
	public java.util.List<NcbjAddLocMultiSite> findAll();

	/**
	 * Returns a range of all the ncbj add loc multi sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAddLocMultiSiteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj add loc multi sites
	 * @param end the upper bound of the range of ncbj add loc multi sites (not inclusive)
	 * @return the range of ncbj add loc multi sites
	 */
	public java.util.List<NcbjAddLocMultiSite> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj add loc multi sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAddLocMultiSiteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj add loc multi sites
	 * @param end the upper bound of the range of ncbj add loc multi sites (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj add loc multi sites
	 */
	public java.util.List<NcbjAddLocMultiSite> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjAddLocMultiSite>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj add loc multi sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAddLocMultiSiteModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj add loc multi sites
	 * @param end the upper bound of the range of ncbj add loc multi sites (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj add loc multi sites
	 */
	public java.util.List<NcbjAddLocMultiSite> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjAddLocMultiSite>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj add loc multi sites from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj add loc multi sites.
	 *
	 * @return the number of ncbj add loc multi sites
	 */
	public int countAll();

}