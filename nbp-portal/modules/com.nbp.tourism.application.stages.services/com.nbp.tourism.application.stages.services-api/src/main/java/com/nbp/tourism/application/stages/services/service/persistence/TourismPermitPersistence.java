/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.stages.services.exception.NoSuchTourismPermitException;
import com.nbp.tourism.application.stages.services.model.TourismPermit;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism permit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismPermitUtil
 * @generated
 */
@ProviderType
public interface TourismPermitPersistence
	extends BasePersistence<TourismPermit> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismPermitUtil} to access the tourism permit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism permit where caseId = &#63; or throws a <code>NoSuchTourismPermitException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching tourism permit
	 * @throws NoSuchTourismPermitException if a matching tourism permit could not be found
	 */
	public TourismPermit findBygetManufacturingPermitBY_CI(String caseId)
		throws NoSuchTourismPermitException;

	/**
	 * Returns the tourism permit where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching tourism permit, or <code>null</code> if a matching tourism permit could not be found
	 */
	public TourismPermit fetchBygetManufacturingPermitBY_CI(String caseId);

	/**
	 * Returns the tourism permit where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism permit, or <code>null</code> if a matching tourism permit could not be found
	 */
	public TourismPermit fetchBygetManufacturingPermitBY_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the tourism permit where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the tourism permit that was removed
	 */
	public TourismPermit removeBygetManufacturingPermitBY_CI(String caseId)
		throws NoSuchTourismPermitException;

	/**
	 * Returns the number of tourism permits where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching tourism permits
	 */
	public int countBygetManufacturingPermitBY_CI(String caseId);

	/**
	 * Caches the tourism permit in the entity cache if it is enabled.
	 *
	 * @param tourismPermit the tourism permit
	 */
	public void cacheResult(TourismPermit tourismPermit);

	/**
	 * Caches the tourism permits in the entity cache if it is enabled.
	 *
	 * @param tourismPermits the tourism permits
	 */
	public void cacheResult(java.util.List<TourismPermit> tourismPermits);

	/**
	 * Creates a new tourism permit with the primary key. Does not add the tourism permit to the database.
	 *
	 * @param tourismgPermitId the primary key for the new tourism permit
	 * @return the new tourism permit
	 */
	public TourismPermit create(long tourismgPermitId);

	/**
	 * Removes the tourism permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismgPermitId the primary key of the tourism permit
	 * @return the tourism permit that was removed
	 * @throws NoSuchTourismPermitException if a tourism permit with the primary key could not be found
	 */
	public TourismPermit remove(long tourismgPermitId)
		throws NoSuchTourismPermitException;

	public TourismPermit updateImpl(TourismPermit tourismPermit);

	/**
	 * Returns the tourism permit with the primary key or throws a <code>NoSuchTourismPermitException</code> if it could not be found.
	 *
	 * @param tourismgPermitId the primary key of the tourism permit
	 * @return the tourism permit
	 * @throws NoSuchTourismPermitException if a tourism permit with the primary key could not be found
	 */
	public TourismPermit findByPrimaryKey(long tourismgPermitId)
		throws NoSuchTourismPermitException;

	/**
	 * Returns the tourism permit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismgPermitId the primary key of the tourism permit
	 * @return the tourism permit, or <code>null</code> if a tourism permit with the primary key could not be found
	 */
	public TourismPermit fetchByPrimaryKey(long tourismgPermitId);

	/**
	 * Returns all the tourism permits.
	 *
	 * @return the tourism permits
	 */
	public java.util.List<TourismPermit> findAll();

	/**
	 * Returns a range of all the tourism permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism permits
	 * @param end the upper bound of the range of tourism permits (not inclusive)
	 * @return the range of tourism permits
	 */
	public java.util.List<TourismPermit> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the tourism permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism permits
	 * @param end the upper bound of the range of tourism permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism permits
	 */
	public java.util.List<TourismPermit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TourismPermit>
			orderByComparator);

	/**
	 * Returns an ordered range of all the tourism permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism permits
	 * @param end the upper bound of the range of tourism permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism permits
	 */
	public java.util.List<TourismPermit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TourismPermit>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism permits from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism permits.
	 *
	 * @return the number of tourism permits
	 */
	public int countAll();

}