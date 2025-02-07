/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchOsiIndiTotalDetailOfAssetsException;
import com.nbp.osi.insolvency.application.form.services.model.OsiIndiTotalDetailOfAssets;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi indi total detail of assets service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiIndiTotalDetailOfAssetsUtil
 * @generated
 */
@ProviderType
public interface OsiIndiTotalDetailOfAssetsPersistence
	extends BasePersistence<OsiIndiTotalDetailOfAssets> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiIndiTotalDetailOfAssetsUtil} to access the osi indi total detail of assets persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the osi indi total detail of assets where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiIndiTotalDetailOfAssetsException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi indi total detail of assets
	 * @throws NoSuchOsiIndiTotalDetailOfAssetsException if a matching osi indi total detail of assets could not be found
	 */
	public OsiIndiTotalDetailOfAssets findBygetOsiById(long osiInsolvencyId)
		throws NoSuchOsiIndiTotalDetailOfAssetsException;

	/**
	 * Returns the osi indi total detail of assets where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi indi total detail of assets, or <code>null</code> if a matching osi indi total detail of assets could not be found
	 */
	public OsiIndiTotalDetailOfAssets fetchBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the osi indi total detail of assets where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi indi total detail of assets, or <code>null</code> if a matching osi indi total detail of assets could not be found
	 */
	public OsiIndiTotalDetailOfAssets fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache);

	/**
	 * Removes the osi indi total detail of assets where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi indi total detail of assets that was removed
	 */
	public OsiIndiTotalDetailOfAssets removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchOsiIndiTotalDetailOfAssetsException;

	/**
	 * Returns the number of osi indi total detail of assetses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi indi total detail of assetses
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the osi indi total detail of assets in the entity cache if it is enabled.
	 *
	 * @param osiIndiTotalDetailOfAssets the osi indi total detail of assets
	 */
	public void cacheResult(
		OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets);

	/**
	 * Caches the osi indi total detail of assetses in the entity cache if it is enabled.
	 *
	 * @param osiIndiTotalDetailOfAssetses the osi indi total detail of assetses
	 */
	public void cacheResult(
		java.util.List<OsiIndiTotalDetailOfAssets>
			osiIndiTotalDetailOfAssetses);

	/**
	 * Creates a new osi indi total detail of assets with the primary key. Does not add the osi indi total detail of assets to the database.
	 *
	 * @param osiIndiTotalDetailOfAssetsId the primary key for the new osi indi total detail of assets
	 * @return the new osi indi total detail of assets
	 */
	public OsiIndiTotalDetailOfAssets create(long osiIndiTotalDetailOfAssetsId);

	/**
	 * Removes the osi indi total detail of assets with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiIndiTotalDetailOfAssetsId the primary key of the osi indi total detail of assets
	 * @return the osi indi total detail of assets that was removed
	 * @throws NoSuchOsiIndiTotalDetailOfAssetsException if a osi indi total detail of assets with the primary key could not be found
	 */
	public OsiIndiTotalDetailOfAssets remove(long osiIndiTotalDetailOfAssetsId)
		throws NoSuchOsiIndiTotalDetailOfAssetsException;

	public OsiIndiTotalDetailOfAssets updateImpl(
		OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets);

	/**
	 * Returns the osi indi total detail of assets with the primary key or throws a <code>NoSuchOsiIndiTotalDetailOfAssetsException</code> if it could not be found.
	 *
	 * @param osiIndiTotalDetailOfAssetsId the primary key of the osi indi total detail of assets
	 * @return the osi indi total detail of assets
	 * @throws NoSuchOsiIndiTotalDetailOfAssetsException if a osi indi total detail of assets with the primary key could not be found
	 */
	public OsiIndiTotalDetailOfAssets findByPrimaryKey(
			long osiIndiTotalDetailOfAssetsId)
		throws NoSuchOsiIndiTotalDetailOfAssetsException;

	/**
	 * Returns the osi indi total detail of assets with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiIndiTotalDetailOfAssetsId the primary key of the osi indi total detail of assets
	 * @return the osi indi total detail of assets, or <code>null</code> if a osi indi total detail of assets with the primary key could not be found
	 */
	public OsiIndiTotalDetailOfAssets fetchByPrimaryKey(
		long osiIndiTotalDetailOfAssetsId);

	/**
	 * Returns all the osi indi total detail of assetses.
	 *
	 * @return the osi indi total detail of assetses
	 */
	public java.util.List<OsiIndiTotalDetailOfAssets> findAll();

	/**
	 * Returns a range of all the osi indi total detail of assetses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiIndiTotalDetailOfAssetsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi indi total detail of assetses
	 * @param end the upper bound of the range of osi indi total detail of assetses (not inclusive)
	 * @return the range of osi indi total detail of assetses
	 */
	public java.util.List<OsiIndiTotalDetailOfAssets> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the osi indi total detail of assetses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiIndiTotalDetailOfAssetsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi indi total detail of assetses
	 * @param end the upper bound of the range of osi indi total detail of assetses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi indi total detail of assetses
	 */
	public java.util.List<OsiIndiTotalDetailOfAssets> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiIndiTotalDetailOfAssets> orderByComparator);

	/**
	 * Returns an ordered range of all the osi indi total detail of assetses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiIndiTotalDetailOfAssetsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi indi total detail of assetses
	 * @param end the upper bound of the range of osi indi total detail of assetses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi indi total detail of assetses
	 */
	public java.util.List<OsiIndiTotalDetailOfAssets> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiIndiTotalDetailOfAssets> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi indi total detail of assetses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi indi total detail of assetses.
	 *
	 * @return the number of osi indi total detail of assetses
	 */
	public int countAll();

}