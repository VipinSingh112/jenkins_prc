/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.wra.application.form.service.exception.NoSuchRenewLicAbstractAndWaterException;
import com.nbp.wra.application.form.service.model.RenewLicAbstractAndWater;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the renew lic abstract and water service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RenewLicAbstractAndWaterUtil
 * @generated
 */
@ProviderType
public interface RenewLicAbstractAndWaterPersistence
	extends BasePersistence<RenewLicAbstractAndWater> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RenewLicAbstractAndWaterUtil} to access the renew lic abstract and water persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the renew lic abstract and water where wraApplicationId = &#63; or throws a <code>NoSuchRenewLicAbstractAndWaterException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching renew lic abstract and water
	 * @throws NoSuchRenewLicAbstractAndWaterException if a matching renew lic abstract and water could not be found
	 */
	public RenewLicAbstractAndWater findBygetWRA_By_Id(long wraApplicationId)
		throws NoSuchRenewLicAbstractAndWaterException;

	/**
	 * Returns the renew lic abstract and water where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching renew lic abstract and water, or <code>null</code> if a matching renew lic abstract and water could not be found
	 */
	public RenewLicAbstractAndWater fetchBygetWRA_By_Id(long wraApplicationId);

	/**
	 * Returns the renew lic abstract and water where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching renew lic abstract and water, or <code>null</code> if a matching renew lic abstract and water could not be found
	 */
	public RenewLicAbstractAndWater fetchBygetWRA_By_Id(
		long wraApplicationId, boolean useFinderCache);

	/**
	 * Removes the renew lic abstract and water where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the renew lic abstract and water that was removed
	 */
	public RenewLicAbstractAndWater removeBygetWRA_By_Id(long wraApplicationId)
		throws NoSuchRenewLicAbstractAndWaterException;

	/**
	 * Returns the number of renew lic abstract and waters where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching renew lic abstract and waters
	 */
	public int countBygetWRA_By_Id(long wraApplicationId);

	/**
	 * Caches the renew lic abstract and water in the entity cache if it is enabled.
	 *
	 * @param renewLicAbstractAndWater the renew lic abstract and water
	 */
	public void cacheResult(RenewLicAbstractAndWater renewLicAbstractAndWater);

	/**
	 * Caches the renew lic abstract and waters in the entity cache if it is enabled.
	 *
	 * @param renewLicAbstractAndWaters the renew lic abstract and waters
	 */
	public void cacheResult(
		java.util.List<RenewLicAbstractAndWater> renewLicAbstractAndWaters);

	/**
	 * Creates a new renew lic abstract and water with the primary key. Does not add the renew lic abstract and water to the database.
	 *
	 * @param renewLicAbstractAndWaterId the primary key for the new renew lic abstract and water
	 * @return the new renew lic abstract and water
	 */
	public RenewLicAbstractAndWater create(long renewLicAbstractAndWaterId);

	/**
	 * Removes the renew lic abstract and water with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param renewLicAbstractAndWaterId the primary key of the renew lic abstract and water
	 * @return the renew lic abstract and water that was removed
	 * @throws NoSuchRenewLicAbstractAndWaterException if a renew lic abstract and water with the primary key could not be found
	 */
	public RenewLicAbstractAndWater remove(long renewLicAbstractAndWaterId)
		throws NoSuchRenewLicAbstractAndWaterException;

	public RenewLicAbstractAndWater updateImpl(
		RenewLicAbstractAndWater renewLicAbstractAndWater);

	/**
	 * Returns the renew lic abstract and water with the primary key or throws a <code>NoSuchRenewLicAbstractAndWaterException</code> if it could not be found.
	 *
	 * @param renewLicAbstractAndWaterId the primary key of the renew lic abstract and water
	 * @return the renew lic abstract and water
	 * @throws NoSuchRenewLicAbstractAndWaterException if a renew lic abstract and water with the primary key could not be found
	 */
	public RenewLicAbstractAndWater findByPrimaryKey(
			long renewLicAbstractAndWaterId)
		throws NoSuchRenewLicAbstractAndWaterException;

	/**
	 * Returns the renew lic abstract and water with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param renewLicAbstractAndWaterId the primary key of the renew lic abstract and water
	 * @return the renew lic abstract and water, or <code>null</code> if a renew lic abstract and water with the primary key could not be found
	 */
	public RenewLicAbstractAndWater fetchByPrimaryKey(
		long renewLicAbstractAndWaterId);

	/**
	 * Returns all the renew lic abstract and waters.
	 *
	 * @return the renew lic abstract and waters
	 */
	public java.util.List<RenewLicAbstractAndWater> findAll();

	/**
	 * Returns a range of all the renew lic abstract and waters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RenewLicAbstractAndWaterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of renew lic abstract and waters
	 * @param end the upper bound of the range of renew lic abstract and waters (not inclusive)
	 * @return the range of renew lic abstract and waters
	 */
	public java.util.List<RenewLicAbstractAndWater> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the renew lic abstract and waters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RenewLicAbstractAndWaterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of renew lic abstract and waters
	 * @param end the upper bound of the range of renew lic abstract and waters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of renew lic abstract and waters
	 */
	public java.util.List<RenewLicAbstractAndWater> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<RenewLicAbstractAndWater> orderByComparator);

	/**
	 * Returns an ordered range of all the renew lic abstract and waters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RenewLicAbstractAndWaterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of renew lic abstract and waters
	 * @param end the upper bound of the range of renew lic abstract and waters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of renew lic abstract and waters
	 */
	public java.util.List<RenewLicAbstractAndWater> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<RenewLicAbstractAndWater> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the renew lic abstract and waters from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of renew lic abstract and waters.
	 *
	 * @return the number of renew lic abstract and waters
	 */
	public int countAll();

}