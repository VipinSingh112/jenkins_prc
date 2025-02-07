/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.wra.application.form.service.exception.NoSuchLicenceToAbstractInfoException;
import com.nbp.wra.application.form.service.model.LicenceToAbstractInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the licence to abstract info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LicenceToAbstractInfoUtil
 * @generated
 */
@ProviderType
public interface LicenceToAbstractInfoPersistence
	extends BasePersistence<LicenceToAbstractInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LicenceToAbstractInfoUtil} to access the licence to abstract info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the licence to abstract info where wraApplicationId = &#63; or throws a <code>NoSuchLicenceToAbstractInfoException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching licence to abstract info
	 * @throws NoSuchLicenceToAbstractInfoException if a matching licence to abstract info could not be found
	 */
	public LicenceToAbstractInfo findBygetWRA_By_Id(long wraApplicationId)
		throws NoSuchLicenceToAbstractInfoException;

	/**
	 * Returns the licence to abstract info where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching licence to abstract info, or <code>null</code> if a matching licence to abstract info could not be found
	 */
	public LicenceToAbstractInfo fetchBygetWRA_By_Id(long wraApplicationId);

	/**
	 * Returns the licence to abstract info where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching licence to abstract info, or <code>null</code> if a matching licence to abstract info could not be found
	 */
	public LicenceToAbstractInfo fetchBygetWRA_By_Id(
		long wraApplicationId, boolean useFinderCache);

	/**
	 * Removes the licence to abstract info where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the licence to abstract info that was removed
	 */
	public LicenceToAbstractInfo removeBygetWRA_By_Id(long wraApplicationId)
		throws NoSuchLicenceToAbstractInfoException;

	/**
	 * Returns the number of licence to abstract infos where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching licence to abstract infos
	 */
	public int countBygetWRA_By_Id(long wraApplicationId);

	/**
	 * Caches the licence to abstract info in the entity cache if it is enabled.
	 *
	 * @param licenceToAbstractInfo the licence to abstract info
	 */
	public void cacheResult(LicenceToAbstractInfo licenceToAbstractInfo);

	/**
	 * Caches the licence to abstract infos in the entity cache if it is enabled.
	 *
	 * @param licenceToAbstractInfos the licence to abstract infos
	 */
	public void cacheResult(
		java.util.List<LicenceToAbstractInfo> licenceToAbstractInfos);

	/**
	 * Creates a new licence to abstract info with the primary key. Does not add the licence to abstract info to the database.
	 *
	 * @param abstractLicenceId the primary key for the new licence to abstract info
	 * @return the new licence to abstract info
	 */
	public LicenceToAbstractInfo create(long abstractLicenceId);

	/**
	 * Removes the licence to abstract info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param abstractLicenceId the primary key of the licence to abstract info
	 * @return the licence to abstract info that was removed
	 * @throws NoSuchLicenceToAbstractInfoException if a licence to abstract info with the primary key could not be found
	 */
	public LicenceToAbstractInfo remove(long abstractLicenceId)
		throws NoSuchLicenceToAbstractInfoException;

	public LicenceToAbstractInfo updateImpl(
		LicenceToAbstractInfo licenceToAbstractInfo);

	/**
	 * Returns the licence to abstract info with the primary key or throws a <code>NoSuchLicenceToAbstractInfoException</code> if it could not be found.
	 *
	 * @param abstractLicenceId the primary key of the licence to abstract info
	 * @return the licence to abstract info
	 * @throws NoSuchLicenceToAbstractInfoException if a licence to abstract info with the primary key could not be found
	 */
	public LicenceToAbstractInfo findByPrimaryKey(long abstractLicenceId)
		throws NoSuchLicenceToAbstractInfoException;

	/**
	 * Returns the licence to abstract info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param abstractLicenceId the primary key of the licence to abstract info
	 * @return the licence to abstract info, or <code>null</code> if a licence to abstract info with the primary key could not be found
	 */
	public LicenceToAbstractInfo fetchByPrimaryKey(long abstractLicenceId);

	/**
	 * Returns all the licence to abstract infos.
	 *
	 * @return the licence to abstract infos
	 */
	public java.util.List<LicenceToAbstractInfo> findAll();

	/**
	 * Returns a range of all the licence to abstract infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LicenceToAbstractInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of licence to abstract infos
	 * @param end the upper bound of the range of licence to abstract infos (not inclusive)
	 * @return the range of licence to abstract infos
	 */
	public java.util.List<LicenceToAbstractInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the licence to abstract infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LicenceToAbstractInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of licence to abstract infos
	 * @param end the upper bound of the range of licence to abstract infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of licence to abstract infos
	 */
	public java.util.List<LicenceToAbstractInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LicenceToAbstractInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the licence to abstract infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LicenceToAbstractInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of licence to abstract infos
	 * @param end the upper bound of the range of licence to abstract infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of licence to abstract infos
	 */
	public java.util.List<LicenceToAbstractInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LicenceToAbstractInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the licence to abstract infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of licence to abstract infos.
	 *
	 * @return the number of licence to abstract infos
	 */
	public int countAll();

}