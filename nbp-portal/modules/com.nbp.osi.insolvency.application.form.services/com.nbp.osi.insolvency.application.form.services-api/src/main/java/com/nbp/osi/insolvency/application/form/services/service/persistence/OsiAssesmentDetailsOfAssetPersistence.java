/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchOsiAssesmentDetailsOfAssetException;
import com.nbp.osi.insolvency.application.form.services.model.OsiAssesmentDetailsOfAsset;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi assesment details of asset service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiAssesmentDetailsOfAssetUtil
 * @generated
 */
@ProviderType
public interface OsiAssesmentDetailsOfAssetPersistence
	extends BasePersistence<OsiAssesmentDetailsOfAsset> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiAssesmentDetailsOfAssetUtil} to access the osi assesment details of asset persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the osi assesment details of asset where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiAssesmentDetailsOfAssetException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi assesment details of asset
	 * @throws NoSuchOsiAssesmentDetailsOfAssetException if a matching osi assesment details of asset could not be found
	 */
	public OsiAssesmentDetailsOfAsset findBygetOIP_OII(long osiInsolvencyId)
		throws NoSuchOsiAssesmentDetailsOfAssetException;

	/**
	 * Returns the osi assesment details of asset where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi assesment details of asset, or <code>null</code> if a matching osi assesment details of asset could not be found
	 */
	public OsiAssesmentDetailsOfAsset fetchBygetOIP_OII(long osiInsolvencyId);

	/**
	 * Returns the osi assesment details of asset where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi assesment details of asset, or <code>null</code> if a matching osi assesment details of asset could not be found
	 */
	public OsiAssesmentDetailsOfAsset fetchBygetOIP_OII(
		long osiInsolvencyId, boolean useFinderCache);

	/**
	 * Removes the osi assesment details of asset where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi assesment details of asset that was removed
	 */
	public OsiAssesmentDetailsOfAsset removeBygetOIP_OII(long osiInsolvencyId)
		throws NoSuchOsiAssesmentDetailsOfAssetException;

	/**
	 * Returns the number of osi assesment details of assets where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi assesment details of assets
	 */
	public int countBygetOIP_OII(long osiInsolvencyId);

	/**
	 * Caches the osi assesment details of asset in the entity cache if it is enabled.
	 *
	 * @param osiAssesmentDetailsOfAsset the osi assesment details of asset
	 */
	public void cacheResult(
		OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset);

	/**
	 * Caches the osi assesment details of assets in the entity cache if it is enabled.
	 *
	 * @param osiAssesmentDetailsOfAssets the osi assesment details of assets
	 */
	public void cacheResult(
		java.util.List<OsiAssesmentDetailsOfAsset> osiAssesmentDetailsOfAssets);

	/**
	 * Creates a new osi assesment details of asset with the primary key. Does not add the osi assesment details of asset to the database.
	 *
	 * @param osiAssetDetailsId the primary key for the new osi assesment details of asset
	 * @return the new osi assesment details of asset
	 */
	public OsiAssesmentDetailsOfAsset create(long osiAssetDetailsId);

	/**
	 * Removes the osi assesment details of asset with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiAssetDetailsId the primary key of the osi assesment details of asset
	 * @return the osi assesment details of asset that was removed
	 * @throws NoSuchOsiAssesmentDetailsOfAssetException if a osi assesment details of asset with the primary key could not be found
	 */
	public OsiAssesmentDetailsOfAsset remove(long osiAssetDetailsId)
		throws NoSuchOsiAssesmentDetailsOfAssetException;

	public OsiAssesmentDetailsOfAsset updateImpl(
		OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset);

	/**
	 * Returns the osi assesment details of asset with the primary key or throws a <code>NoSuchOsiAssesmentDetailsOfAssetException</code> if it could not be found.
	 *
	 * @param osiAssetDetailsId the primary key of the osi assesment details of asset
	 * @return the osi assesment details of asset
	 * @throws NoSuchOsiAssesmentDetailsOfAssetException if a osi assesment details of asset with the primary key could not be found
	 */
	public OsiAssesmentDetailsOfAsset findByPrimaryKey(long osiAssetDetailsId)
		throws NoSuchOsiAssesmentDetailsOfAssetException;

	/**
	 * Returns the osi assesment details of asset with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiAssetDetailsId the primary key of the osi assesment details of asset
	 * @return the osi assesment details of asset, or <code>null</code> if a osi assesment details of asset with the primary key could not be found
	 */
	public OsiAssesmentDetailsOfAsset fetchByPrimaryKey(long osiAssetDetailsId);

	/**
	 * Returns all the osi assesment details of assets.
	 *
	 * @return the osi assesment details of assets
	 */
	public java.util.List<OsiAssesmentDetailsOfAsset> findAll();

	/**
	 * Returns a range of all the osi assesment details of assets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiAssesmentDetailsOfAssetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi assesment details of assets
	 * @param end the upper bound of the range of osi assesment details of assets (not inclusive)
	 * @return the range of osi assesment details of assets
	 */
	public java.util.List<OsiAssesmentDetailsOfAsset> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the osi assesment details of assets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiAssesmentDetailsOfAssetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi assesment details of assets
	 * @param end the upper bound of the range of osi assesment details of assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi assesment details of assets
	 */
	public java.util.List<OsiAssesmentDetailsOfAsset> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiAssesmentDetailsOfAsset> orderByComparator);

	/**
	 * Returns an ordered range of all the osi assesment details of assets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiAssesmentDetailsOfAssetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi assesment details of assets
	 * @param end the upper bound of the range of osi assesment details of assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi assesment details of assets
	 */
	public java.util.List<OsiAssesmentDetailsOfAsset> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiAssesmentDetailsOfAsset> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi assesment details of assets from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi assesment details of assets.
	 *
	 * @return the number of osi assesment details of assets
	 */
	public int countAll();

}