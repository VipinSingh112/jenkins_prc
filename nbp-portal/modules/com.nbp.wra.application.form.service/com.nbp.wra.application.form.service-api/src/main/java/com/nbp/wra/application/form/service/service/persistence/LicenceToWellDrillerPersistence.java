/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.wra.application.form.service.exception.NoSuchLicenceToWellDrillerException;
import com.nbp.wra.application.form.service.model.LicenceToWellDriller;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the licence to well driller service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LicenceToWellDrillerUtil
 * @generated
 */
@ProviderType
public interface LicenceToWellDrillerPersistence
	extends BasePersistence<LicenceToWellDriller> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LicenceToWellDrillerUtil} to access the licence to well driller persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the licence to well driller where wraApplicationId = &#63; or throws a <code>NoSuchLicenceToWellDrillerException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching licence to well driller
	 * @throws NoSuchLicenceToWellDrillerException if a matching licence to well driller could not be found
	 */
	public LicenceToWellDriller findBygetWRA_By_Id(long wraApplicationId)
		throws NoSuchLicenceToWellDrillerException;

	/**
	 * Returns the licence to well driller where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching licence to well driller, or <code>null</code> if a matching licence to well driller could not be found
	 */
	public LicenceToWellDriller fetchBygetWRA_By_Id(long wraApplicationId);

	/**
	 * Returns the licence to well driller where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching licence to well driller, or <code>null</code> if a matching licence to well driller could not be found
	 */
	public LicenceToWellDriller fetchBygetWRA_By_Id(
		long wraApplicationId, boolean useFinderCache);

	/**
	 * Removes the licence to well driller where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the licence to well driller that was removed
	 */
	public LicenceToWellDriller removeBygetWRA_By_Id(long wraApplicationId)
		throws NoSuchLicenceToWellDrillerException;

	/**
	 * Returns the number of licence to well drillers where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching licence to well drillers
	 */
	public int countBygetWRA_By_Id(long wraApplicationId);

	/**
	 * Caches the licence to well driller in the entity cache if it is enabled.
	 *
	 * @param licenceToWellDriller the licence to well driller
	 */
	public void cacheResult(LicenceToWellDriller licenceToWellDriller);

	/**
	 * Caches the licence to well drillers in the entity cache if it is enabled.
	 *
	 * @param licenceToWellDrillers the licence to well drillers
	 */
	public void cacheResult(
		java.util.List<LicenceToWellDriller> licenceToWellDrillers);

	/**
	 * Creates a new licence to well driller with the primary key. Does not add the licence to well driller to the database.
	 *
	 * @param licenceToWellDrillerId the primary key for the new licence to well driller
	 * @return the new licence to well driller
	 */
	public LicenceToWellDriller create(long licenceToWellDrillerId);

	/**
	 * Removes the licence to well driller with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param licenceToWellDrillerId the primary key of the licence to well driller
	 * @return the licence to well driller that was removed
	 * @throws NoSuchLicenceToWellDrillerException if a licence to well driller with the primary key could not be found
	 */
	public LicenceToWellDriller remove(long licenceToWellDrillerId)
		throws NoSuchLicenceToWellDrillerException;

	public LicenceToWellDriller updateImpl(
		LicenceToWellDriller licenceToWellDriller);

	/**
	 * Returns the licence to well driller with the primary key or throws a <code>NoSuchLicenceToWellDrillerException</code> if it could not be found.
	 *
	 * @param licenceToWellDrillerId the primary key of the licence to well driller
	 * @return the licence to well driller
	 * @throws NoSuchLicenceToWellDrillerException if a licence to well driller with the primary key could not be found
	 */
	public LicenceToWellDriller findByPrimaryKey(long licenceToWellDrillerId)
		throws NoSuchLicenceToWellDrillerException;

	/**
	 * Returns the licence to well driller with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param licenceToWellDrillerId the primary key of the licence to well driller
	 * @return the licence to well driller, or <code>null</code> if a licence to well driller with the primary key could not be found
	 */
	public LicenceToWellDriller fetchByPrimaryKey(long licenceToWellDrillerId);

	/**
	 * Returns all the licence to well drillers.
	 *
	 * @return the licence to well drillers
	 */
	public java.util.List<LicenceToWellDriller> findAll();

	/**
	 * Returns a range of all the licence to well drillers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LicenceToWellDrillerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of licence to well drillers
	 * @param end the upper bound of the range of licence to well drillers (not inclusive)
	 * @return the range of licence to well drillers
	 */
	public java.util.List<LicenceToWellDriller> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the licence to well drillers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LicenceToWellDrillerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of licence to well drillers
	 * @param end the upper bound of the range of licence to well drillers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of licence to well drillers
	 */
	public java.util.List<LicenceToWellDriller> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LicenceToWellDriller>
			orderByComparator);

	/**
	 * Returns an ordered range of all the licence to well drillers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LicenceToWellDrillerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of licence to well drillers
	 * @param end the upper bound of the range of licence to well drillers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of licence to well drillers
	 */
	public java.util.List<LicenceToWellDriller> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LicenceToWellDriller>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the licence to well drillers from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of licence to well drillers.
	 *
	 * @return the number of licence to well drillers
	 */
	public int countAll();

}