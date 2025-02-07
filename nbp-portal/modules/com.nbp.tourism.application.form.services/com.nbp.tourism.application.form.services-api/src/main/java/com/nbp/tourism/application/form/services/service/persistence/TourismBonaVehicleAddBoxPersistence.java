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

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaVehicleAddBoxException;
import com.nbp.tourism.application.form.services.model.TourismBonaVehicleAddBox;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism bona vehicle add box service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaVehicleAddBoxUtil
 * @generated
 */
@ProviderType
public interface TourismBonaVehicleAddBoxPersistence
	extends BasePersistence<TourismBonaVehicleAddBox> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismBonaVehicleAddBoxUtil} to access the tourism bona vehicle add box persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the tourism bona vehicle add boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona vehicle add boxes
	 */
	public java.util.List<TourismBonaVehicleAddBox> findBygetTAP_TAI(
		long tourismApplicationId);

	/**
	 * Returns a range of all the tourism bona vehicle add boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaVehicleAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism bona vehicle add boxes
	 * @param end the upper bound of the range of tourism bona vehicle add boxes (not inclusive)
	 * @return the range of matching tourism bona vehicle add boxes
	 */
	public java.util.List<TourismBonaVehicleAddBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the tourism bona vehicle add boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaVehicleAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism bona vehicle add boxes
	 * @param end the upper bound of the range of tourism bona vehicle add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism bona vehicle add boxes
	 */
	public java.util.List<TourismBonaVehicleAddBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaVehicleAddBox> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism bona vehicle add boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaVehicleAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism bona vehicle add boxes
	 * @param end the upper bound of the range of tourism bona vehicle add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism bona vehicle add boxes
	 */
	public java.util.List<TourismBonaVehicleAddBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaVehicleAddBox> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first tourism bona vehicle add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism bona vehicle add box
	 * @throws NoSuchTourismBonaVehicleAddBoxException if a matching tourism bona vehicle add box could not be found
	 */
	public TourismBonaVehicleAddBox findBygetTAP_TAI_First(
			long tourismApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismBonaVehicleAddBox> orderByComparator)
		throws NoSuchTourismBonaVehicleAddBoxException;

	/**
	 * Returns the first tourism bona vehicle add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism bona vehicle add box, or <code>null</code> if a matching tourism bona vehicle add box could not be found
	 */
	public TourismBonaVehicleAddBox fetchBygetTAP_TAI_First(
		long tourismApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaVehicleAddBox> orderByComparator);

	/**
	 * Returns the last tourism bona vehicle add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism bona vehicle add box
	 * @throws NoSuchTourismBonaVehicleAddBoxException if a matching tourism bona vehicle add box could not be found
	 */
	public TourismBonaVehicleAddBox findBygetTAP_TAI_Last(
			long tourismApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismBonaVehicleAddBox> orderByComparator)
		throws NoSuchTourismBonaVehicleAddBoxException;

	/**
	 * Returns the last tourism bona vehicle add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism bona vehicle add box, or <code>null</code> if a matching tourism bona vehicle add box could not be found
	 */
	public TourismBonaVehicleAddBox fetchBygetTAP_TAI_Last(
		long tourismApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaVehicleAddBox> orderByComparator);

	/**
	 * Returns the tourism bona vehicle add boxes before and after the current tourism bona vehicle add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismBonaVehBoxId the primary key of the current tourism bona vehicle add box
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism bona vehicle add box
	 * @throws NoSuchTourismBonaVehicleAddBoxException if a tourism bona vehicle add box with the primary key could not be found
	 */
	public TourismBonaVehicleAddBox[] findBygetTAP_TAI_PrevAndNext(
			long tourismBonaVehBoxId, long tourismApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismBonaVehicleAddBox> orderByComparator)
		throws NoSuchTourismBonaVehicleAddBoxException;

	/**
	 * Removes all the tourism bona vehicle add boxes where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 */
	public void removeBygetTAP_TAI(long tourismApplicationId);

	/**
	 * Returns the number of tourism bona vehicle add boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona vehicle add boxes
	 */
	public int countBygetTAP_TAI(long tourismApplicationId);

	/**
	 * Caches the tourism bona vehicle add box in the entity cache if it is enabled.
	 *
	 * @param tourismBonaVehicleAddBox the tourism bona vehicle add box
	 */
	public void cacheResult(TourismBonaVehicleAddBox tourismBonaVehicleAddBox);

	/**
	 * Caches the tourism bona vehicle add boxes in the entity cache if it is enabled.
	 *
	 * @param tourismBonaVehicleAddBoxes the tourism bona vehicle add boxes
	 */
	public void cacheResult(
		java.util.List<TourismBonaVehicleAddBox> tourismBonaVehicleAddBoxes);

	/**
	 * Creates a new tourism bona vehicle add box with the primary key. Does not add the tourism bona vehicle add box to the database.
	 *
	 * @param tourismBonaVehBoxId the primary key for the new tourism bona vehicle add box
	 * @return the new tourism bona vehicle add box
	 */
	public TourismBonaVehicleAddBox create(long tourismBonaVehBoxId);

	/**
	 * Removes the tourism bona vehicle add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaVehBoxId the primary key of the tourism bona vehicle add box
	 * @return the tourism bona vehicle add box that was removed
	 * @throws NoSuchTourismBonaVehicleAddBoxException if a tourism bona vehicle add box with the primary key could not be found
	 */
	public TourismBonaVehicleAddBox remove(long tourismBonaVehBoxId)
		throws NoSuchTourismBonaVehicleAddBoxException;

	public TourismBonaVehicleAddBox updateImpl(
		TourismBonaVehicleAddBox tourismBonaVehicleAddBox);

	/**
	 * Returns the tourism bona vehicle add box with the primary key or throws a <code>NoSuchTourismBonaVehicleAddBoxException</code> if it could not be found.
	 *
	 * @param tourismBonaVehBoxId the primary key of the tourism bona vehicle add box
	 * @return the tourism bona vehicle add box
	 * @throws NoSuchTourismBonaVehicleAddBoxException if a tourism bona vehicle add box with the primary key could not be found
	 */
	public TourismBonaVehicleAddBox findByPrimaryKey(long tourismBonaVehBoxId)
		throws NoSuchTourismBonaVehicleAddBoxException;

	/**
	 * Returns the tourism bona vehicle add box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaVehBoxId the primary key of the tourism bona vehicle add box
	 * @return the tourism bona vehicle add box, or <code>null</code> if a tourism bona vehicle add box with the primary key could not be found
	 */
	public TourismBonaVehicleAddBox fetchByPrimaryKey(long tourismBonaVehBoxId);

	/**
	 * Returns all the tourism bona vehicle add boxes.
	 *
	 * @return the tourism bona vehicle add boxes
	 */
	public java.util.List<TourismBonaVehicleAddBox> findAll();

	/**
	 * Returns a range of all the tourism bona vehicle add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaVehicleAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona vehicle add boxes
	 * @param end the upper bound of the range of tourism bona vehicle add boxes (not inclusive)
	 * @return the range of tourism bona vehicle add boxes
	 */
	public java.util.List<TourismBonaVehicleAddBox> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the tourism bona vehicle add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaVehicleAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona vehicle add boxes
	 * @param end the upper bound of the range of tourism bona vehicle add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona vehicle add boxes
	 */
	public java.util.List<TourismBonaVehicleAddBox> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaVehicleAddBox> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism bona vehicle add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaVehicleAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona vehicle add boxes
	 * @param end the upper bound of the range of tourism bona vehicle add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona vehicle add boxes
	 */
	public java.util.List<TourismBonaVehicleAddBox> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismBonaVehicleAddBox> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism bona vehicle add boxes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism bona vehicle add boxes.
	 *
	 * @return the number of tourism bona vehicle add boxes
	 */
	public int countAll();

}