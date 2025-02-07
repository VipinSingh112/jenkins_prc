/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.factories.registration.application.form.services.exception.NoSuchFactoriesStandardActInfoException;
import com.nbp.factories.registration.application.form.services.model.FactoriesStandardActInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the factories standard act info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesStandardActInfoUtil
 * @generated
 */
@ProviderType
public interface FactoriesStandardActInfoPersistence
	extends BasePersistence<FactoriesStandardActInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FactoriesStandardActInfoUtil} to access the factories standard act info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the factories standard act info where factoriesApplicationId = &#63; or throws a <code>NoSuchFactoriesStandardActInfoException</code> if it could not be found.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories standard act info
	 * @throws NoSuchFactoriesStandardActInfoException if a matching factories standard act info could not be found
	 */
	public FactoriesStandardActInfo findBygetFactoriesById(
			long factoriesApplicationId)
		throws NoSuchFactoriesStandardActInfoException;

	/**
	 * Returns the factories standard act info where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories standard act info, or <code>null</code> if a matching factories standard act info could not be found
	 */
	public FactoriesStandardActInfo fetchBygetFactoriesById(
		long factoriesApplicationId);

	/**
	 * Returns the factories standard act info where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories standard act info, or <code>null</code> if a matching factories standard act info could not be found
	 */
	public FactoriesStandardActInfo fetchBygetFactoriesById(
		long factoriesApplicationId, boolean useFinderCache);

	/**
	 * Removes the factories standard act info where factoriesApplicationId = &#63; from the database.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the factories standard act info that was removed
	 */
	public FactoriesStandardActInfo removeBygetFactoriesById(
			long factoriesApplicationId)
		throws NoSuchFactoriesStandardActInfoException;

	/**
	 * Returns the number of factories standard act infos where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories standard act infos
	 */
	public int countBygetFactoriesById(long factoriesApplicationId);

	/**
	 * Caches the factories standard act info in the entity cache if it is enabled.
	 *
	 * @param factoriesStandardActInfo the factories standard act info
	 */
	public void cacheResult(FactoriesStandardActInfo factoriesStandardActInfo);

	/**
	 * Caches the factories standard act infos in the entity cache if it is enabled.
	 *
	 * @param factoriesStandardActInfos the factories standard act infos
	 */
	public void cacheResult(
		java.util.List<FactoriesStandardActInfo> factoriesStandardActInfos);

	/**
	 * Creates a new factories standard act info with the primary key. Does not add the factories standard act info to the database.
	 *
	 * @param factoriesStandardActId the primary key for the new factories standard act info
	 * @return the new factories standard act info
	 */
	public FactoriesStandardActInfo create(long factoriesStandardActId);

	/**
	 * Removes the factories standard act info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesStandardActId the primary key of the factories standard act info
	 * @return the factories standard act info that was removed
	 * @throws NoSuchFactoriesStandardActInfoException if a factories standard act info with the primary key could not be found
	 */
	public FactoriesStandardActInfo remove(long factoriesStandardActId)
		throws NoSuchFactoriesStandardActInfoException;

	public FactoriesStandardActInfo updateImpl(
		FactoriesStandardActInfo factoriesStandardActInfo);

	/**
	 * Returns the factories standard act info with the primary key or throws a <code>NoSuchFactoriesStandardActInfoException</code> if it could not be found.
	 *
	 * @param factoriesStandardActId the primary key of the factories standard act info
	 * @return the factories standard act info
	 * @throws NoSuchFactoriesStandardActInfoException if a factories standard act info with the primary key could not be found
	 */
	public FactoriesStandardActInfo findByPrimaryKey(
			long factoriesStandardActId)
		throws NoSuchFactoriesStandardActInfoException;

	/**
	 * Returns the factories standard act info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesStandardActId the primary key of the factories standard act info
	 * @return the factories standard act info, or <code>null</code> if a factories standard act info with the primary key could not be found
	 */
	public FactoriesStandardActInfo fetchByPrimaryKey(
		long factoriesStandardActId);

	/**
	 * Returns all the factories standard act infos.
	 *
	 * @return the factories standard act infos
	 */
	public java.util.List<FactoriesStandardActInfo> findAll();

	/**
	 * Returns a range of all the factories standard act infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesStandardActInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories standard act infos
	 * @param end the upper bound of the range of factories standard act infos (not inclusive)
	 * @return the range of factories standard act infos
	 */
	public java.util.List<FactoriesStandardActInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the factories standard act infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesStandardActInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories standard act infos
	 * @param end the upper bound of the range of factories standard act infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories standard act infos
	 */
	public java.util.List<FactoriesStandardActInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesStandardActInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the factories standard act infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesStandardActInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories standard act infos
	 * @param end the upper bound of the range of factories standard act infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories standard act infos
	 */
	public java.util.List<FactoriesStandardActInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FactoriesStandardActInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the factories standard act infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of factories standard act infos.
	 *
	 * @return the number of factories standard act infos
	 */
	public int countAll();

}