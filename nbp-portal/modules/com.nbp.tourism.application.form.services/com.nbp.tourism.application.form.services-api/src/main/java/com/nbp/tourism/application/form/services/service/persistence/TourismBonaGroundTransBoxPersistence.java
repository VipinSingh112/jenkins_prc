/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaGroundTransBoxException;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransBox;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism bona ground trans box service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransBoxUtil
 * @generated
 */
@ProviderType
public interface TourismBonaGroundTransBoxPersistence
	extends BasePersistence<TourismBonaGroundTransBox> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismBonaGroundTransBoxUtil} to access the tourism bona ground trans box persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the tourism bona ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground trans boxes
	 */
	public java.util.List<TourismBonaGroundTransBox> findBygetTAP_TAI(
		long tourismApplicationId);

	/**
	 * Returns a range of all the tourism bona ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism bona ground trans boxes
	 * @param end the upper bound of the range of tourism bona ground trans boxes (not inclusive)
	 * @return the range of matching tourism bona ground trans boxes
	 */
	public java.util.List<TourismBonaGroundTransBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the tourism bona ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism bona ground trans boxes
	 * @param end the upper bound of the range of tourism bona ground trans boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism bona ground trans boxes
	 */
	public java.util.List<TourismBonaGroundTransBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaGroundTransBox> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism bona ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism bona ground trans boxes
	 * @param end the upper bound of the range of tourism bona ground trans boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism bona ground trans boxes
	 */
	public java.util.List<TourismBonaGroundTransBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaGroundTransBox> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first tourism bona ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism bona ground trans box
	 * @throws NoSuchTourismBonaGroundTransBoxException if a matching tourism bona ground trans box could not be found
	 */
	public TourismBonaGroundTransBox findBygetTAP_TAI_First(
			long tourismApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismBonaGroundTransBox> orderByComparator)
		throws NoSuchTourismBonaGroundTransBoxException;

	/**
	 * Returns the first tourism bona ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism bona ground trans box, or <code>null</code> if a matching tourism bona ground trans box could not be found
	 */
	public TourismBonaGroundTransBox fetchBygetTAP_TAI_First(
		long tourismApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaGroundTransBox> orderByComparator);

	/**
	 * Returns the last tourism bona ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism bona ground trans box
	 * @throws NoSuchTourismBonaGroundTransBoxException if a matching tourism bona ground trans box could not be found
	 */
	public TourismBonaGroundTransBox findBygetTAP_TAI_Last(
			long tourismApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismBonaGroundTransBox> orderByComparator)
		throws NoSuchTourismBonaGroundTransBoxException;

	/**
	 * Returns the last tourism bona ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism bona ground trans box, or <code>null</code> if a matching tourism bona ground trans box could not be found
	 */
	public TourismBonaGroundTransBox fetchBygetTAP_TAI_Last(
		long tourismApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaGroundTransBox> orderByComparator);

	/**
	 * Returns the tourism bona ground trans boxes before and after the current tourism bona ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismVehicleBoxBonaId the primary key of the current tourism bona ground trans box
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism bona ground trans box
	 * @throws NoSuchTourismBonaGroundTransBoxException if a tourism bona ground trans box with the primary key could not be found
	 */
	public TourismBonaGroundTransBox[] findBygetTAP_TAI_PrevAndNext(
			long tourismVehicleBoxBonaId, long tourismApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismBonaGroundTransBox> orderByComparator)
		throws NoSuchTourismBonaGroundTransBoxException;

	/**
	 * Removes all the tourism bona ground trans boxes where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 */
	public void removeBygetTAP_TAI(long tourismApplicationId);

	/**
	 * Returns the number of tourism bona ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona ground trans boxes
	 */
	public int countBygetTAP_TAI(long tourismApplicationId);

	/**
	 * Caches the tourism bona ground trans box in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransBox the tourism bona ground trans box
	 */
	public void cacheResult(
		TourismBonaGroundTransBox tourismBonaGroundTransBox);

	/**
	 * Caches the tourism bona ground trans boxes in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransBoxes the tourism bona ground trans boxes
	 */
	public void cacheResult(
		java.util.List<TourismBonaGroundTransBox> tourismBonaGroundTransBoxes);

	/**
	 * Creates a new tourism bona ground trans box with the primary key. Does not add the tourism bona ground trans box to the database.
	 *
	 * @param tourismVehicleBoxBonaId the primary key for the new tourism bona ground trans box
	 * @return the new tourism bona ground trans box
	 */
	public TourismBonaGroundTransBox create(long tourismVehicleBoxBonaId);

	/**
	 * Removes the tourism bona ground trans box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismVehicleBoxBonaId the primary key of the tourism bona ground trans box
	 * @return the tourism bona ground trans box that was removed
	 * @throws NoSuchTourismBonaGroundTransBoxException if a tourism bona ground trans box with the primary key could not be found
	 */
	public TourismBonaGroundTransBox remove(long tourismVehicleBoxBonaId)
		throws NoSuchTourismBonaGroundTransBoxException;

	public TourismBonaGroundTransBox updateImpl(
		TourismBonaGroundTransBox tourismBonaGroundTransBox);

	/**
	 * Returns the tourism bona ground trans box with the primary key or throws a <code>NoSuchTourismBonaGroundTransBoxException</code> if it could not be found.
	 *
	 * @param tourismVehicleBoxBonaId the primary key of the tourism bona ground trans box
	 * @return the tourism bona ground trans box
	 * @throws NoSuchTourismBonaGroundTransBoxException if a tourism bona ground trans box with the primary key could not be found
	 */
	public TourismBonaGroundTransBox findByPrimaryKey(
			long tourismVehicleBoxBonaId)
		throws NoSuchTourismBonaGroundTransBoxException;

	/**
	 * Returns the tourism bona ground trans box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismVehicleBoxBonaId the primary key of the tourism bona ground trans box
	 * @return the tourism bona ground trans box, or <code>null</code> if a tourism bona ground trans box with the primary key could not be found
	 */
	public TourismBonaGroundTransBox fetchByPrimaryKey(
		long tourismVehicleBoxBonaId);

	/**
	 * Returns all the tourism bona ground trans boxes.
	 *
	 * @return the tourism bona ground trans boxes
	 */
	public java.util.List<TourismBonaGroundTransBox> findAll();

	/**
	 * Returns a range of all the tourism bona ground trans boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground trans boxes
	 * @param end the upper bound of the range of tourism bona ground trans boxes (not inclusive)
	 * @return the range of tourism bona ground trans boxes
	 */
	public java.util.List<TourismBonaGroundTransBox> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism bona ground trans boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground trans boxes
	 * @param end the upper bound of the range of tourism bona ground trans boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona ground trans boxes
	 */
	public java.util.List<TourismBonaGroundTransBox> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaGroundTransBox> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism bona ground trans boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground trans boxes
	 * @param end the upper bound of the range of tourism bona ground trans boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona ground trans boxes
	 */
	public java.util.List<TourismBonaGroundTransBox> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaGroundTransBox> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism bona ground trans boxes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism bona ground trans boxes.
	 *
	 * @return the number of tourism bona ground trans boxes
	 */
	public int countAll();

}