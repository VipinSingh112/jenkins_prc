/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.farm.application.stages.service.exception.NoSuchFarmPermitException;
import com.nbp.farm.application.stages.service.model.FarmPermit;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the farm permit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmPermitUtil
 * @generated
 */
@ProviderType
public interface FarmPermitPersistence extends BasePersistence<FarmPermit> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FarmPermitUtil} to access the farm permit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the farm permit where caseId = &#63; or throws a <code>NoSuchFarmPermitException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching farm permit
	 * @throws NoSuchFarmPermitException if a matching farm permit could not be found
	 */
	public FarmPermit findBygetFarmBy_CI(String caseId)
		throws NoSuchFarmPermitException;

	/**
	 * Returns the farm permit where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching farm permit, or <code>null</code> if a matching farm permit could not be found
	 */
	public FarmPermit fetchBygetFarmBy_CI(String caseId);

	/**
	 * Returns the farm permit where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farm permit, or <code>null</code> if a matching farm permit could not be found
	 */
	public FarmPermit fetchBygetFarmBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the farm permit where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the farm permit that was removed
	 */
	public FarmPermit removeBygetFarmBy_CI(String caseId)
		throws NoSuchFarmPermitException;

	/**
	 * Returns the number of farm permits where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching farm permits
	 */
	public int countBygetFarmBy_CI(String caseId);

	/**
	 * Caches the farm permit in the entity cache if it is enabled.
	 *
	 * @param farmPermit the farm permit
	 */
	public void cacheResult(FarmPermit farmPermit);

	/**
	 * Caches the farm permits in the entity cache if it is enabled.
	 *
	 * @param farmPermits the farm permits
	 */
	public void cacheResult(java.util.List<FarmPermit> farmPermits);

	/**
	 * Creates a new farm permit with the primary key. Does not add the farm permit to the database.
	 *
	 * @param farmPermitId the primary key for the new farm permit
	 * @return the new farm permit
	 */
	public FarmPermit create(long farmPermitId);

	/**
	 * Removes the farm permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmPermitId the primary key of the farm permit
	 * @return the farm permit that was removed
	 * @throws NoSuchFarmPermitException if a farm permit with the primary key could not be found
	 */
	public FarmPermit remove(long farmPermitId)
		throws NoSuchFarmPermitException;

	public FarmPermit updateImpl(FarmPermit farmPermit);

	/**
	 * Returns the farm permit with the primary key or throws a <code>NoSuchFarmPermitException</code> if it could not be found.
	 *
	 * @param farmPermitId the primary key of the farm permit
	 * @return the farm permit
	 * @throws NoSuchFarmPermitException if a farm permit with the primary key could not be found
	 */
	public FarmPermit findByPrimaryKey(long farmPermitId)
		throws NoSuchFarmPermitException;

	/**
	 * Returns the farm permit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmPermitId the primary key of the farm permit
	 * @return the farm permit, or <code>null</code> if a farm permit with the primary key could not be found
	 */
	public FarmPermit fetchByPrimaryKey(long farmPermitId);

	/**
	 * Returns all the farm permits.
	 *
	 * @return the farm permits
	 */
	public java.util.List<FarmPermit> findAll();

	/**
	 * Returns a range of all the farm permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm permits
	 * @param end the upper bound of the range of farm permits (not inclusive)
	 * @return the range of farm permits
	 */
	public java.util.List<FarmPermit> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the farm permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm permits
	 * @param end the upper bound of the range of farm permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farm permits
	 */
	public java.util.List<FarmPermit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmPermit>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farm permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm permits
	 * @param end the upper bound of the range of farm permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farm permits
	 */
	public java.util.List<FarmPermit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmPermit>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the farm permits from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of farm permits.
	 *
	 * @return the number of farm permits
	 */
	public int countAll();

}