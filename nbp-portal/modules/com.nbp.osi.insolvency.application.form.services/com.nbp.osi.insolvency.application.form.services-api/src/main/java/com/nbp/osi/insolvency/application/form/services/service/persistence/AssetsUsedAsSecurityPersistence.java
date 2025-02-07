/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchAssetsUsedAsSecurityException;
import com.nbp.osi.insolvency.application.form.services.model.AssetsUsedAsSecurity;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the assets used as security service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetsUsedAsSecurityUtil
 * @generated
 */
@ProviderType
public interface AssetsUsedAsSecurityPersistence
	extends BasePersistence<AssetsUsedAsSecurity> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssetsUsedAsSecurityUtil} to access the assets used as security persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the assets used as securities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching assets used as securities
	 */
	public java.util.List<AssetsUsedAsSecurity> findBygetOsiById(
		long osiInsolvencyId);

	/**
	 * Returns a range of all the assets used as securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of assets used as securities
	 * @param end the upper bound of the range of assets used as securities (not inclusive)
	 * @return the range of matching assets used as securities
	 */
	public java.util.List<AssetsUsedAsSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end);

	/**
	 * Returns an ordered range of all the assets used as securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of assets used as securities
	 * @param end the upper bound of the range of assets used as securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assets used as securities
	 */
	public java.util.List<AssetsUsedAsSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetsUsedAsSecurity>
			orderByComparator);

	/**
	 * Returns an ordered range of all the assets used as securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of assets used as securities
	 * @param end the upper bound of the range of assets used as securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assets used as securities
	 */
	public java.util.List<AssetsUsedAsSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetsUsedAsSecurity>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first assets used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assets used as security
	 * @throws NoSuchAssetsUsedAsSecurityException if a matching assets used as security could not be found
	 */
	public AssetsUsedAsSecurity findBygetOsiById_First(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AssetsUsedAsSecurity> orderByComparator)
		throws NoSuchAssetsUsedAsSecurityException;

	/**
	 * Returns the first assets used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assets used as security, or <code>null</code> if a matching assets used as security could not be found
	 */
	public AssetsUsedAsSecurity fetchBygetOsiById_First(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetsUsedAsSecurity>
			orderByComparator);

	/**
	 * Returns the last assets used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assets used as security
	 * @throws NoSuchAssetsUsedAsSecurityException if a matching assets used as security could not be found
	 */
	public AssetsUsedAsSecurity findBygetOsiById_Last(
			long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AssetsUsedAsSecurity> orderByComparator)
		throws NoSuchAssetsUsedAsSecurityException;

	/**
	 * Returns the last assets used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assets used as security, or <code>null</code> if a matching assets used as security could not be found
	 */
	public AssetsUsedAsSecurity fetchBygetOsiById_Last(
		long osiInsolvencyId,
		com.liferay.portal.kernel.util.OrderByComparator<AssetsUsedAsSecurity>
			orderByComparator);

	/**
	 * Returns the assets used as securities before and after the current assets used as security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param assetsUsedAsSecurityId the primary key of the current assets used as security
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assets used as security
	 * @throws NoSuchAssetsUsedAsSecurityException if a assets used as security with the primary key could not be found
	 */
	public AssetsUsedAsSecurity[] findBygetOsiById_PrevAndNext(
			long assetsUsedAsSecurityId, long osiInsolvencyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AssetsUsedAsSecurity> orderByComparator)
		throws NoSuchAssetsUsedAsSecurityException;

	/**
	 * Removes all the assets used as securities where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public void removeBygetOsiById(long osiInsolvencyId);

	/**
	 * Returns the number of assets used as securities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching assets used as securities
	 */
	public int countBygetOsiById(long osiInsolvencyId);

	/**
	 * Caches the assets used as security in the entity cache if it is enabled.
	 *
	 * @param assetsUsedAsSecurity the assets used as security
	 */
	public void cacheResult(AssetsUsedAsSecurity assetsUsedAsSecurity);

	/**
	 * Caches the assets used as securities in the entity cache if it is enabled.
	 *
	 * @param assetsUsedAsSecurities the assets used as securities
	 */
	public void cacheResult(
		java.util.List<AssetsUsedAsSecurity> assetsUsedAsSecurities);

	/**
	 * Creates a new assets used as security with the primary key. Does not add the assets used as security to the database.
	 *
	 * @param assetsUsedAsSecurityId the primary key for the new assets used as security
	 * @return the new assets used as security
	 */
	public AssetsUsedAsSecurity create(long assetsUsedAsSecurityId);

	/**
	 * Removes the assets used as security with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assetsUsedAsSecurityId the primary key of the assets used as security
	 * @return the assets used as security that was removed
	 * @throws NoSuchAssetsUsedAsSecurityException if a assets used as security with the primary key could not be found
	 */
	public AssetsUsedAsSecurity remove(long assetsUsedAsSecurityId)
		throws NoSuchAssetsUsedAsSecurityException;

	public AssetsUsedAsSecurity updateImpl(
		AssetsUsedAsSecurity assetsUsedAsSecurity);

	/**
	 * Returns the assets used as security with the primary key or throws a <code>NoSuchAssetsUsedAsSecurityException</code> if it could not be found.
	 *
	 * @param assetsUsedAsSecurityId the primary key of the assets used as security
	 * @return the assets used as security
	 * @throws NoSuchAssetsUsedAsSecurityException if a assets used as security with the primary key could not be found
	 */
	public AssetsUsedAsSecurity findByPrimaryKey(long assetsUsedAsSecurityId)
		throws NoSuchAssetsUsedAsSecurityException;

	/**
	 * Returns the assets used as security with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param assetsUsedAsSecurityId the primary key of the assets used as security
	 * @return the assets used as security, or <code>null</code> if a assets used as security with the primary key could not be found
	 */
	public AssetsUsedAsSecurity fetchByPrimaryKey(long assetsUsedAsSecurityId);

	/**
	 * Returns all the assets used as securities.
	 *
	 * @return the assets used as securities
	 */
	public java.util.List<AssetsUsedAsSecurity> findAll();

	/**
	 * Returns a range of all the assets used as securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets used as securities
	 * @param end the upper bound of the range of assets used as securities (not inclusive)
	 * @return the range of assets used as securities
	 */
	public java.util.List<AssetsUsedAsSecurity> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the assets used as securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets used as securities
	 * @param end the upper bound of the range of assets used as securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assets used as securities
	 */
	public java.util.List<AssetsUsedAsSecurity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetsUsedAsSecurity>
			orderByComparator);

	/**
	 * Returns an ordered range of all the assets used as securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetsUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets used as securities
	 * @param end the upper bound of the range of assets used as securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of assets used as securities
	 */
	public java.util.List<AssetsUsedAsSecurity> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AssetsUsedAsSecurity>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the assets used as securities from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of assets used as securities.
	 *
	 * @return the number of assets used as securities
	 */
	public int countAll();

}