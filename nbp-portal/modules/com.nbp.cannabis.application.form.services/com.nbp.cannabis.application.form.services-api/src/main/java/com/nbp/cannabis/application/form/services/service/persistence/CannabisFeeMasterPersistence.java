/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisFeeMasterException;
import com.nbp.cannabis.application.form.services.model.CannabisFeeMaster;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis fee master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisFeeMasterUtil
 * @generated
 */
@ProviderType
public interface CannabisFeeMasterPersistence
	extends BasePersistence<CannabisFeeMaster> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisFeeMasterUtil} to access the cannabis fee master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the cannabis fee master where category = &#63; and subCategory = &#63; or throws a <code>NoSuchCannabisFeeMasterException</code> if it could not be found.
	 *
	 * @param category the category
	 * @param subCategory the sub category
	 * @return the matching cannabis fee master
	 * @throws NoSuchCannabisFeeMasterException if a matching cannabis fee master could not be found
	 */
	public CannabisFeeMaster findBygetFee_by_CS(
			String category, String subCategory)
		throws NoSuchCannabisFeeMasterException;

	/**
	 * Returns the cannabis fee master where category = &#63; and subCategory = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param category the category
	 * @param subCategory the sub category
	 * @return the matching cannabis fee master, or <code>null</code> if a matching cannabis fee master could not be found
	 */
	public CannabisFeeMaster fetchBygetFee_by_CS(
		String category, String subCategory);

	/**
	 * Returns the cannabis fee master where category = &#63; and subCategory = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param category the category
	 * @param subCategory the sub category
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis fee master, or <code>null</code> if a matching cannabis fee master could not be found
	 */
	public CannabisFeeMaster fetchBygetFee_by_CS(
		String category, String subCategory, boolean useFinderCache);

	/**
	 * Removes the cannabis fee master where category = &#63; and subCategory = &#63; from the database.
	 *
	 * @param category the category
	 * @param subCategory the sub category
	 * @return the cannabis fee master that was removed
	 */
	public CannabisFeeMaster removeBygetFee_by_CS(
			String category, String subCategory)
		throws NoSuchCannabisFeeMasterException;

	/**
	 * Returns the number of cannabis fee masters where category = &#63; and subCategory = &#63;.
	 *
	 * @param category the category
	 * @param subCategory the sub category
	 * @return the number of matching cannabis fee masters
	 */
	public int countBygetFee_by_CS(String category, String subCategory);

	/**
	 * Caches the cannabis fee master in the entity cache if it is enabled.
	 *
	 * @param cannabisFeeMaster the cannabis fee master
	 */
	public void cacheResult(CannabisFeeMaster cannabisFeeMaster);

	/**
	 * Caches the cannabis fee masters in the entity cache if it is enabled.
	 *
	 * @param cannabisFeeMasters the cannabis fee masters
	 */
	public void cacheResult(
		java.util.List<CannabisFeeMaster> cannabisFeeMasters);

	/**
	 * Creates a new cannabis fee master with the primary key. Does not add the cannabis fee master to the database.
	 *
	 * @param cannabisFeeMasterId the primary key for the new cannabis fee master
	 * @return the new cannabis fee master
	 */
	public CannabisFeeMaster create(long cannabisFeeMasterId);

	/**
	 * Removes the cannabis fee master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisFeeMasterId the primary key of the cannabis fee master
	 * @return the cannabis fee master that was removed
	 * @throws NoSuchCannabisFeeMasterException if a cannabis fee master with the primary key could not be found
	 */
	public CannabisFeeMaster remove(long cannabisFeeMasterId)
		throws NoSuchCannabisFeeMasterException;

	public CannabisFeeMaster updateImpl(CannabisFeeMaster cannabisFeeMaster);

	/**
	 * Returns the cannabis fee master with the primary key or throws a <code>NoSuchCannabisFeeMasterException</code> if it could not be found.
	 *
	 * @param cannabisFeeMasterId the primary key of the cannabis fee master
	 * @return the cannabis fee master
	 * @throws NoSuchCannabisFeeMasterException if a cannabis fee master with the primary key could not be found
	 */
	public CannabisFeeMaster findByPrimaryKey(long cannabisFeeMasterId)
		throws NoSuchCannabisFeeMasterException;

	/**
	 * Returns the cannabis fee master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisFeeMasterId the primary key of the cannabis fee master
	 * @return the cannabis fee master, or <code>null</code> if a cannabis fee master with the primary key could not be found
	 */
	public CannabisFeeMaster fetchByPrimaryKey(long cannabisFeeMasterId);

	/**
	 * Returns all the cannabis fee masters.
	 *
	 * @return the cannabis fee masters
	 */
	public java.util.List<CannabisFeeMaster> findAll();

	/**
	 * Returns a range of all the cannabis fee masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisFeeMasterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis fee masters
	 * @param end the upper bound of the range of cannabis fee masters (not inclusive)
	 * @return the range of cannabis fee masters
	 */
	public java.util.List<CannabisFeeMaster> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the cannabis fee masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisFeeMasterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis fee masters
	 * @param end the upper bound of the range of cannabis fee masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis fee masters
	 */
	public java.util.List<CannabisFeeMaster> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisFeeMaster>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis fee masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisFeeMasterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis fee masters
	 * @param end the upper bound of the range of cannabis fee masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis fee masters
	 */
	public java.util.List<CannabisFeeMaster> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisFeeMaster>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis fee masters from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis fee masters.
	 *
	 * @return the number of cannabis fee masters
	 */
	public int countAll();

}