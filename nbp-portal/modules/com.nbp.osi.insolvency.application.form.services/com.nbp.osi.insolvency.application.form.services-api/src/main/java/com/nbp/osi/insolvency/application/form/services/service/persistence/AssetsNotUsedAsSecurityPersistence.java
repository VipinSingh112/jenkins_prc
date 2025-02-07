/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchAssetsNotUsedAsSecurityException;
import com.nbp.osi.insolvency.application.form.services.model.AssetsNotUsedAsSecurity;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the assets not used as security service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetsNotUsedAsSecurityUtil
 * @generated
 */
@ProviderType
public interface AssetsNotUsedAsSecurityPersistence
	extends BasePersistence<AssetsNotUsedAsSecurity> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssetsNotUsedAsSecurityUtil} to access the assets not used as security persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the assets not used as securities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching assets not used as securities
	 */
	public java.util.List<AssetsNotUsedAsSecurity> findBygetOsiById(
		long osiInsolvencyId);

	/**
	 * Returns a range of all the assets not used as securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsNotUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of assets not used as securities
	 * @param end the upper bound of the range of assets not used as securities (not inclusive)
	 * @return the range of matching assets not used as securities
	 */
	public java.util.List<AssetsNotUsedAsSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end);

	/**
	 * Returns an ordered range of all the assets not used as securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsNotUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of assets not used as securities
	 * @param end the upper bound of the range of assets not used as securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assets not used as securities
	 */
	public java.util.List<AssetsNotUsedAsSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AssetsNotUsedAsSecurity> orderByComparator);

	/**
	 * Returns an ordered range of all the assets not used as securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsNotUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of assets not used as securities
	 * @param end the upper bound of the range of assets not used as securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assets not used as securities
	 */
	public java.util.List<AssetsNotUsedAsSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AssetsNotUsedAsSecurity> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first assets not used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assets not used as security
	 * @throws NoSuchAssetsNotUsedAsSecurityException if a matching assets not used as security could not be found
	 */
	public AssetsNotUsedAsSecurity findBygetOsiById_First(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AssetsNotUsedAsSecurity> orderByComparator)
		throws NoSuchAssetsNotUsedAsSecurityException;

	/**
	 * Returns the first assets not used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assets not used as security, or <code>null</code> if a matching assets not used as security could not be found
	 */
	public AssetsNotUsedAsSecurity fetchBygetOsiById_First(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AssetsNotUsedAsSecurity> orderByComparator);

	/**
	 * Returns the last assets not used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assets not used as security
	 * @throws NoSuchAssetsNotUsedAsSecurityException if a matching assets not used as security could not be found
	 */
	public AssetsNotUsedAsSecurity findBygetOsiById_Last(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AssetsNotUsedAsSecurity> orderByComparator)
		throws NoSuchAssetsNotUsedAsSecurityException;

	/**
	 * Returns the last assets not used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assets not used as security, or <code>null</code> if a matching assets not used as security could not be found
	 */
	public AssetsNotUsedAsSecurity fetchBygetOsiById_Last(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AssetsNotUsedAsSecurity> orderByComparator);

	/**
	 * Returns the assets not used as securities before and after the current assets not used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param assetsNotUsedAsSecurityId the primary key of the current assets not used as security
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assets not used as security
	 * @throws NoSuchAssetsNotUsedAsSecurityException if a assets not used as security with the primary key could not be found
	 */
	public AssetsNotUsedAsSecurity[] findBygetOsiById_PrevAndNext(
			long assetsNotUsedAsSecurityId, long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AssetsNotUsedAsSecurity> orderByComparator)
		throws NoSuchAssetsNotUsedAsSecurityException;

	/**
	 * Removes all the assets not used as securities where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public void removeBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the number of assets not used as securities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching assets not used as securities
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the assets not used as security in the entity cache if it is enabled.
	 *
	 * @param assetsNotUsedAsSecurity the assets not used as security
	 */
	public void cacheResult(AssetsNotUsedAsSecurity assetsNotUsedAsSecurity);

	/**
	 * Caches the assets not used as securities in the entity cache if it is enabled.
	 *
	 * @param assetsNotUsedAsSecurities the assets not used as securities
	 */
	public void cacheResult(
		java.util.List<AssetsNotUsedAsSecurity> assetsNotUsedAsSecurities);

	/**
	 * Creates a new assets not used as security with the primary key. Does not add the assets not used as security to the database.
	 *
	 * @param assetsNotUsedAsSecurityId the primary key for the new assets not used as security
	 * @return the new assets not used as security
	 */
	public AssetsNotUsedAsSecurity create(long assetsNotUsedAsSecurityId);

	/**
	 * Removes the assets not used as security with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assetsNotUsedAsSecurityId the primary key of the assets not used as security
	 * @return the assets not used as security that was removed
	 * @throws NoSuchAssetsNotUsedAsSecurityException if a assets not used as security with the primary key could not be found
	 */
	public AssetsNotUsedAsSecurity remove(long assetsNotUsedAsSecurityId)
		throws NoSuchAssetsNotUsedAsSecurityException;

	public AssetsNotUsedAsSecurity updateImpl(
		AssetsNotUsedAsSecurity assetsNotUsedAsSecurity);

	/**
	 * Returns the assets not used as security with the primary key or throws a <code>NoSuchAssetsNotUsedAsSecurityException</code> if it could not be found.
	 *
	 * @param assetsNotUsedAsSecurityId the primary key of the assets not used as security
	 * @return the assets not used as security
	 * @throws NoSuchAssetsNotUsedAsSecurityException if a assets not used as security with the primary key could not be found
	 */
	public AssetsNotUsedAsSecurity findByPrimaryKey(
			long assetsNotUsedAsSecurityId)
		throws NoSuchAssetsNotUsedAsSecurityException;

	/**
	 * Returns the assets not used as security with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param assetsNotUsedAsSecurityId the primary key of the assets not used as security
	 * @return the assets not used as security, or <code>null</code> if a assets not used as security with the primary key could not be found
	 */
	public AssetsNotUsedAsSecurity fetchByPrimaryKey(
		long assetsNotUsedAsSecurityId);

	/**
	 * Returns all the assets not used as securities.
	 *
	 * @return the assets not used as securities
	 */
	public java.util.List<AssetsNotUsedAsSecurity> findAll();

	/**
	 * Returns a range of all the assets not used as securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsNotUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets not used as securities
	 * @param end the upper bound of the range of assets not used as securities (not inclusive)
	 * @return the range of assets not used as securities
	 */
	public java.util.List<AssetsNotUsedAsSecurity> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the assets not used as securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsNotUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets not used as securities
	 * @param end the upper bound of the range of assets not used as securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assets not used as securities
	 */
	public java.util.List<AssetsNotUsedAsSecurity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AssetsNotUsedAsSecurity> orderByComparator);

	/**
	 * Returns an ordered range of all the assets not used as securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsNotUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets not used as securities
	 * @param end the upper bound of the range of assets not used as securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of assets not used as securities
	 */
	public java.util.List<AssetsNotUsedAsSecurity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AssetsNotUsedAsSecurity> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the assets not used as securities from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of assets not used as securities.
	 *
	 * @return the number of assets not used as securities
	 */
	public int countAll();

}