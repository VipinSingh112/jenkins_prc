/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezConsultancyInspectionException;
import com.nbp.sez.status.application.form.service.model.SezConsultancyInspection;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez consultancy inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezConsultancyInspectionUtil
 * @generated
 */
@ProviderType
public interface SezConsultancyInspectionPersistence
	extends BasePersistence<SezConsultancyInspection> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezConsultancyInspectionUtil} to access the sez consultancy inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez consultancy inspection where doYouWant = &#63; or throws a <code>NoSuchSezConsultancyInspectionException</code> if it could not be found.
	 *
	 * @param doYouWant the do you want
	 * @return the matching sez consultancy inspection
	 * @throws NoSuchSezConsultancyInspectionException if a matching sez consultancy inspection could not be found
	 */
	public SezConsultancyInspection findBygetSezConsultancyByCat(
			String doYouWant)
		throws NoSuchSezConsultancyInspectionException;

	/**
	 * Returns the sez consultancy inspection where doYouWant = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param doYouWant the do you want
	 * @return the matching sez consultancy inspection, or <code>null</code> if a matching sez consultancy inspection could not be found
	 */
	public SezConsultancyInspection fetchBygetSezConsultancyByCat(
		String doYouWant);

	/**
	 * Returns the sez consultancy inspection where doYouWant = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param doYouWant the do you want
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez consultancy inspection, or <code>null</code> if a matching sez consultancy inspection could not be found
	 */
	public SezConsultancyInspection fetchBygetSezConsultancyByCat(
		String doYouWant, boolean useFinderCache);

	/**
	 * Removes the sez consultancy inspection where doYouWant = &#63; from the database.
	 *
	 * @param doYouWant the do you want
	 * @return the sez consultancy inspection that was removed
	 */
	public SezConsultancyInspection removeBygetSezConsultancyByCat(
			String doYouWant)
		throws NoSuchSezConsultancyInspectionException;

	/**
	 * Returns the number of sez consultancy inspections where doYouWant = &#63;.
	 *
	 * @param doYouWant the do you want
	 * @return the number of matching sez consultancy inspections
	 */
	public int countBygetSezConsultancyByCat(String doYouWant);

	/**
	 * Caches the sez consultancy inspection in the entity cache if it is enabled.
	 *
	 * @param sezConsultancyInspection the sez consultancy inspection
	 */
	public void cacheResult(SezConsultancyInspection sezConsultancyInspection);

	/**
	 * Caches the sez consultancy inspections in the entity cache if it is enabled.
	 *
	 * @param sezConsultancyInspections the sez consultancy inspections
	 */
	public void cacheResult(
		java.util.List<SezConsultancyInspection> sezConsultancyInspections);

	/**
	 * Creates a new sez consultancy inspection with the primary key. Does not add the sez consultancy inspection to the database.
	 *
	 * @param sezConsultancyInspectionId the primary key for the new sez consultancy inspection
	 * @return the new sez consultancy inspection
	 */
	public SezConsultancyInspection create(long sezConsultancyInspectionId);

	/**
	 * Removes the sez consultancy inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezConsultancyInspectionId the primary key of the sez consultancy inspection
	 * @return the sez consultancy inspection that was removed
	 * @throws NoSuchSezConsultancyInspectionException if a sez consultancy inspection with the primary key could not be found
	 */
	public SezConsultancyInspection remove(long sezConsultancyInspectionId)
		throws NoSuchSezConsultancyInspectionException;

	public SezConsultancyInspection updateImpl(
		SezConsultancyInspection sezConsultancyInspection);

	/**
	 * Returns the sez consultancy inspection with the primary key or throws a <code>NoSuchSezConsultancyInspectionException</code> if it could not be found.
	 *
	 * @param sezConsultancyInspectionId the primary key of the sez consultancy inspection
	 * @return the sez consultancy inspection
	 * @throws NoSuchSezConsultancyInspectionException if a sez consultancy inspection with the primary key could not be found
	 */
	public SezConsultancyInspection findByPrimaryKey(
			long sezConsultancyInspectionId)
		throws NoSuchSezConsultancyInspectionException;

	/**
	 * Returns the sez consultancy inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezConsultancyInspectionId the primary key of the sez consultancy inspection
	 * @return the sez consultancy inspection, or <code>null</code> if a sez consultancy inspection with the primary key could not be found
	 */
	public SezConsultancyInspection fetchByPrimaryKey(
		long sezConsultancyInspectionId);

	/**
	 * Returns all the sez consultancy inspections.
	 *
	 * @return the sez consultancy inspections
	 */
	public java.util.List<SezConsultancyInspection> findAll();

	/**
	 * Returns a range of all the sez consultancy inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezConsultancyInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez consultancy inspections
	 * @param end the upper bound of the range of sez consultancy inspections (not inclusive)
	 * @return the range of sez consultancy inspections
	 */
	public java.util.List<SezConsultancyInspection> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez consultancy inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezConsultancyInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez consultancy inspections
	 * @param end the upper bound of the range of sez consultancy inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez consultancy inspections
	 */
	public java.util.List<SezConsultancyInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezConsultancyInspection> orderByComparator);

	/**
	 * Returns an ordered range of all the sez consultancy inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezConsultancyInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez consultancy inspections
	 * @param end the upper bound of the range of sez consultancy inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez consultancy inspections
	 */
	public java.util.List<SezConsultancyInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezConsultancyInspection> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez consultancy inspections from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez consultancy inspections.
	 *
	 * @return the number of sez consultancy inspections
	 */
	public int countAll();

}