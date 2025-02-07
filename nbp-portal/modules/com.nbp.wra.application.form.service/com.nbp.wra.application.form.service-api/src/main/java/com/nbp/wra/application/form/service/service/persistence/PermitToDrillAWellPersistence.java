/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.wra.application.form.service.exception.NoSuchPermitToDrillAWellException;
import com.nbp.wra.application.form.service.model.PermitToDrillAWell;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the permit to drill a well service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PermitToDrillAWellUtil
 * @generated
 */
@ProviderType
public interface PermitToDrillAWellPersistence
	extends BasePersistence<PermitToDrillAWell> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PermitToDrillAWellUtil} to access the permit to drill a well persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the permit to drill a well where wraApplicationId = &#63; or throws a <code>NoSuchPermitToDrillAWellException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching permit to drill a well
	 * @throws NoSuchPermitToDrillAWellException if a matching permit to drill a well could not be found
	 */
	public PermitToDrillAWell findBygetWRA_By_Id(long wraApplicationId)
		throws NoSuchPermitToDrillAWellException;

	/**
	 * Returns the permit to drill a well where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching permit to drill a well, or <code>null</code> if a matching permit to drill a well could not be found
	 */
	public PermitToDrillAWell fetchBygetWRA_By_Id(long wraApplicationId);

	/**
	 * Returns the permit to drill a well where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching permit to drill a well, or <code>null</code> if a matching permit to drill a well could not be found
	 */
	public PermitToDrillAWell fetchBygetWRA_By_Id(
		long wraApplicationId, boolean useFinderCache);

	/**
	 * Removes the permit to drill a well where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the permit to drill a well that was removed
	 */
	public PermitToDrillAWell removeBygetWRA_By_Id(long wraApplicationId)
		throws NoSuchPermitToDrillAWellException;

	/**
	 * Returns the number of permit to drill a wells where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching permit to drill a wells
	 */
	public int countBygetWRA_By_Id(long wraApplicationId);

	/**
	 * Caches the permit to drill a well in the entity cache if it is enabled.
	 *
	 * @param permitToDrillAWell the permit to drill a well
	 */
	public void cacheResult(PermitToDrillAWell permitToDrillAWell);

	/**
	 * Caches the permit to drill a wells in the entity cache if it is enabled.
	 *
	 * @param permitToDrillAWells the permit to drill a wells
	 */
	public void cacheResult(
		java.util.List<PermitToDrillAWell> permitToDrillAWells);

	/**
	 * Creates a new permit to drill a well with the primary key. Does not add the permit to drill a well to the database.
	 *
	 * @param drillAWellApplicationId the primary key for the new permit to drill a well
	 * @return the new permit to drill a well
	 */
	public PermitToDrillAWell create(long drillAWellApplicationId);

	/**
	 * Removes the permit to drill a well with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param drillAWellApplicationId the primary key of the permit to drill a well
	 * @return the permit to drill a well that was removed
	 * @throws NoSuchPermitToDrillAWellException if a permit to drill a well with the primary key could not be found
	 */
	public PermitToDrillAWell remove(long drillAWellApplicationId)
		throws NoSuchPermitToDrillAWellException;

	public PermitToDrillAWell updateImpl(PermitToDrillAWell permitToDrillAWell);

	/**
	 * Returns the permit to drill a well with the primary key or throws a <code>NoSuchPermitToDrillAWellException</code> if it could not be found.
	 *
	 * @param drillAWellApplicationId the primary key of the permit to drill a well
	 * @return the permit to drill a well
	 * @throws NoSuchPermitToDrillAWellException if a permit to drill a well with the primary key could not be found
	 */
	public PermitToDrillAWell findByPrimaryKey(long drillAWellApplicationId)
		throws NoSuchPermitToDrillAWellException;

	/**
	 * Returns the permit to drill a well with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param drillAWellApplicationId the primary key of the permit to drill a well
	 * @return the permit to drill a well, or <code>null</code> if a permit to drill a well with the primary key could not be found
	 */
	public PermitToDrillAWell fetchByPrimaryKey(long drillAWellApplicationId);

	/**
	 * Returns all the permit to drill a wells.
	 *
	 * @return the permit to drill a wells
	 */
	public java.util.List<PermitToDrillAWell> findAll();

	/**
	 * Returns a range of all the permit to drill a wells.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PermitToDrillAWellModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of permit to drill a wells
	 * @param end the upper bound of the range of permit to drill a wells (not inclusive)
	 * @return the range of permit to drill a wells
	 */
	public java.util.List<PermitToDrillAWell> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the permit to drill a wells.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PermitToDrillAWellModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of permit to drill a wells
	 * @param end the upper bound of the range of permit to drill a wells (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of permit to drill a wells
	 */
	public java.util.List<PermitToDrillAWell> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PermitToDrillAWell>
			orderByComparator);

	/**
	 * Returns an ordered range of all the permit to drill a wells.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PermitToDrillAWellModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of permit to drill a wells
	 * @param end the upper bound of the range of permit to drill a wells (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of permit to drill a wells
	 */
	public java.util.List<PermitToDrillAWell> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PermitToDrillAWell>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the permit to drill a wells from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of permit to drill a wells.
	 *
	 * @return the number of permit to drill a wells
	 */
	public int countAll();

}