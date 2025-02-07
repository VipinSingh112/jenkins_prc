/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaGroundTransContractSignException;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransContractSign;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism bona ground trans contract sign service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransContractSignUtil
 * @generated
 */
@ProviderType
public interface TourismBonaGroundTransContractSignPersistence
	extends BasePersistence<TourismBonaGroundTransContractSign> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismBonaGroundTransContractSignUtil} to access the tourism bona ground trans contract sign persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism bona ground trans contract sign where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaGroundTransContractSignException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground trans contract sign
	 * @throws NoSuchTourismBonaGroundTransContractSignException if a matching tourism bona ground trans contract sign could not be found
	 */
	public TourismBonaGroundTransContractSign findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaGroundTransContractSignException;

	/**
	 * Returns the tourism bona ground trans contract sign where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground trans contract sign, or <code>null</code> if a matching tourism bona ground trans contract sign could not be found
	 */
	public TourismBonaGroundTransContractSign fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism bona ground trans contract sign where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona ground trans contract sign, or <code>null</code> if a matching tourism bona ground trans contract sign could not be found
	 */
	public TourismBonaGroundTransContractSign fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism bona ground trans contract sign where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona ground trans contract sign that was removed
	 */
	public TourismBonaGroundTransContractSign removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaGroundTransContractSignException;

	/**
	 * Returns the number of tourism bona ground trans contract signs where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona ground trans contract signs
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism bona ground trans contract sign in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransContractSign the tourism bona ground trans contract sign
	 */
	public void cacheResult(
		TourismBonaGroundTransContractSign tourismBonaGroundTransContractSign);

	/**
	 * Caches the tourism bona ground trans contract signs in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransContractSigns the tourism bona ground trans contract signs
	 */
	public void cacheResult(
		java.util.List<TourismBonaGroundTransContractSign>
			tourismBonaGroundTransContractSigns);

	/**
	 * Creates a new tourism bona ground trans contract sign with the primary key. Does not add the tourism bona ground trans contract sign to the database.
	 *
	 * @param tourismBonaGroTraCoSignId the primary key for the new tourism bona ground trans contract sign
	 * @return the new tourism bona ground trans contract sign
	 */
	public TourismBonaGroundTransContractSign create(
		long tourismBonaGroTraCoSignId);

	/**
	 * Removes the tourism bona ground trans contract sign with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaGroTraCoSignId the primary key of the tourism bona ground trans contract sign
	 * @return the tourism bona ground trans contract sign that was removed
	 * @throws NoSuchTourismBonaGroundTransContractSignException if a tourism bona ground trans contract sign with the primary key could not be found
	 */
	public TourismBonaGroundTransContractSign remove(
			long tourismBonaGroTraCoSignId)
		throws NoSuchTourismBonaGroundTransContractSignException;

	public TourismBonaGroundTransContractSign updateImpl(
		TourismBonaGroundTransContractSign tourismBonaGroundTransContractSign);

	/**
	 * Returns the tourism bona ground trans contract sign with the primary key or throws a <code>NoSuchTourismBonaGroundTransContractSignException</code> if it could not be found.
	 *
	 * @param tourismBonaGroTraCoSignId the primary key of the tourism bona ground trans contract sign
	 * @return the tourism bona ground trans contract sign
	 * @throws NoSuchTourismBonaGroundTransContractSignException if a tourism bona ground trans contract sign with the primary key could not be found
	 */
	public TourismBonaGroundTransContractSign findByPrimaryKey(
			long tourismBonaGroTraCoSignId)
		throws NoSuchTourismBonaGroundTransContractSignException;

	/**
	 * Returns the tourism bona ground trans contract sign with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaGroTraCoSignId the primary key of the tourism bona ground trans contract sign
	 * @return the tourism bona ground trans contract sign, or <code>null</code> if a tourism bona ground trans contract sign with the primary key could not be found
	 */
	public TourismBonaGroundTransContractSign fetchByPrimaryKey(
		long tourismBonaGroTraCoSignId);

	/**
	 * Returns all the tourism bona ground trans contract signs.
	 *
	 * @return the tourism bona ground trans contract signs
	 */
	public java.util.List<TourismBonaGroundTransContractSign> findAll();

	/**
	 * Returns a range of all the tourism bona ground trans contract signs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransContractSignModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground trans contract signs
	 * @param end the upper bound of the range of tourism bona ground trans contract signs (not inclusive)
	 * @return the range of tourism bona ground trans contract signs
	 */
	public java.util.List<TourismBonaGroundTransContractSign> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism bona ground trans contract signs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransContractSignModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground trans contract signs
	 * @param end the upper bound of the range of tourism bona ground trans contract signs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona ground trans contract signs
	 */
	public java.util.List<TourismBonaGroundTransContractSign> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaGroundTransContractSign> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism bona ground trans contract signs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransContractSignModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground trans contract signs
	 * @param end the upper bound of the range of tourism bona ground trans contract signs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona ground trans contract signs
	 */
	public java.util.List<TourismBonaGroundTransContractSign> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaGroundTransContractSign> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism bona ground trans contract signs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism bona ground trans contract signs.
	 *
	 * @return the number of tourism bona ground trans contract signs
	 */
	public int countAll();

}