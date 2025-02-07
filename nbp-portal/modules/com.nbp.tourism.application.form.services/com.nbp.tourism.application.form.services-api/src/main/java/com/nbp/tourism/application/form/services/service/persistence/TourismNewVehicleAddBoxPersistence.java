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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewVehicleAddBoxException;
import com.nbp.tourism.application.form.services.model.TourismNewVehicleAddBox;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism new vehicle add box service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewVehicleAddBoxUtil
 * @generated
 */
@ProviderType
public interface TourismNewVehicleAddBoxPersistence
	extends BasePersistence<TourismNewVehicleAddBox> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismNewVehicleAddBoxUtil} to access the tourism new vehicle add box persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the tourism new vehicle add boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new vehicle add boxes
	 */
	public java.util.List<TourismNewVehicleAddBox> findBygetTAP_TAI(
		long tourismApplicationId);

	/**
	 * Returns a range of all the tourism new vehicle add boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewVehicleAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism new vehicle add boxes
	 * @param end the upper bound of the range of tourism new vehicle add boxes (not inclusive)
	 * @return the range of matching tourism new vehicle add boxes
	 */
	public java.util.List<TourismNewVehicleAddBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the tourism new vehicle add boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewVehicleAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism new vehicle add boxes
	 * @param end the upper bound of the range of tourism new vehicle add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism new vehicle add boxes
	 */
	public java.util.List<TourismNewVehicleAddBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewVehicleAddBox> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism new vehicle add boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewVehicleAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism new vehicle add boxes
	 * @param end the upper bound of the range of tourism new vehicle add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism new vehicle add boxes
	 */
	public java.util.List<TourismNewVehicleAddBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewVehicleAddBox> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first tourism new vehicle add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism new vehicle add box
	 * @throws NoSuchTourismNewVehicleAddBoxException if a matching tourism new vehicle add box could not be found
	 */
	public TourismNewVehicleAddBox findBygetTAP_TAI_First(
			long tourismApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismNewVehicleAddBox> orderByComparator)
		throws NoSuchTourismNewVehicleAddBoxException;

	/**
	 * Returns the first tourism new vehicle add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism new vehicle add box, or <code>null</code> if a matching tourism new vehicle add box could not be found
	 */
	public TourismNewVehicleAddBox fetchBygetTAP_TAI_First(
		long tourismApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewVehicleAddBox> orderByComparator);

	/**
	 * Returns the last tourism new vehicle add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism new vehicle add box
	 * @throws NoSuchTourismNewVehicleAddBoxException if a matching tourism new vehicle add box could not be found
	 */
	public TourismNewVehicleAddBox findBygetTAP_TAI_Last(
			long tourismApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismNewVehicleAddBox> orderByComparator)
		throws NoSuchTourismNewVehicleAddBoxException;

	/**
	 * Returns the last tourism new vehicle add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism new vehicle add box, or <code>null</code> if a matching tourism new vehicle add box could not be found
	 */
	public TourismNewVehicleAddBox fetchBygetTAP_TAI_Last(
		long tourismApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewVehicleAddBox> orderByComparator);

	/**
	 * Returns the tourism new vehicle add boxes before and after the current tourism new vehicle add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismNewVehBoxId the primary key of the current tourism new vehicle add box
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism new vehicle add box
	 * @throws NoSuchTourismNewVehicleAddBoxException if a tourism new vehicle add box with the primary key could not be found
	 */
	public TourismNewVehicleAddBox[] findBygetTAP_TAI_PrevAndNext(
			long tourismNewVehBoxId, long tourismApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismNewVehicleAddBox> orderByComparator)
		throws NoSuchTourismNewVehicleAddBoxException;

	/**
	 * Removes all the tourism new vehicle add boxes where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 */
	public void removeBygetTAP_TAI(long tourismApplicationId);

	/**
	 * Returns the number of tourism new vehicle add boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new vehicle add boxes
	 */
	public int countBygetTAP_TAI(long tourismApplicationId);

	/**
	 * Caches the tourism new vehicle add box in the entity cache if it is enabled.
	 *
	 * @param tourismNewVehicleAddBox the tourism new vehicle add box
	 */
	public void cacheResult(TourismNewVehicleAddBox tourismNewVehicleAddBox);

	/**
	 * Caches the tourism new vehicle add boxes in the entity cache if it is enabled.
	 *
	 * @param tourismNewVehicleAddBoxes the tourism new vehicle add boxes
	 */
	public void cacheResult(
		java.util.List<TourismNewVehicleAddBox> tourismNewVehicleAddBoxes);

	/**
	 * Creates a new tourism new vehicle add box with the primary key. Does not add the tourism new vehicle add box to the database.
	 *
	 * @param tourismNewVehBoxId the primary key for the new tourism new vehicle add box
	 * @return the new tourism new vehicle add box
	 */
	public TourismNewVehicleAddBox create(long tourismNewVehBoxId);

	/**
	 * Removes the tourism new vehicle add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewVehBoxId the primary key of the tourism new vehicle add box
	 * @return the tourism new vehicle add box that was removed
	 * @throws NoSuchTourismNewVehicleAddBoxException if a tourism new vehicle add box with the primary key could not be found
	 */
	public TourismNewVehicleAddBox remove(long tourismNewVehBoxId)
		throws NoSuchTourismNewVehicleAddBoxException;

	public TourismNewVehicleAddBox updateImpl(
		TourismNewVehicleAddBox tourismNewVehicleAddBox);

	/**
	 * Returns the tourism new vehicle add box with the primary key or throws a <code>NoSuchTourismNewVehicleAddBoxException</code> if it could not be found.
	 *
	 * @param tourismNewVehBoxId the primary key of the tourism new vehicle add box
	 * @return the tourism new vehicle add box
	 * @throws NoSuchTourismNewVehicleAddBoxException if a tourism new vehicle add box with the primary key could not be found
	 */
	public TourismNewVehicleAddBox findByPrimaryKey(long tourismNewVehBoxId)
		throws NoSuchTourismNewVehicleAddBoxException;

	/**
	 * Returns the tourism new vehicle add box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewVehBoxId the primary key of the tourism new vehicle add box
	 * @return the tourism new vehicle add box, or <code>null</code> if a tourism new vehicle add box with the primary key could not be found
	 */
	public TourismNewVehicleAddBox fetchByPrimaryKey(long tourismNewVehBoxId);

	/**
	 * Returns all the tourism new vehicle add boxes.
	 *
	 * @return the tourism new vehicle add boxes
	 */
	public java.util.List<TourismNewVehicleAddBox> findAll();

	/**
	 * Returns a range of all the tourism new vehicle add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewVehicleAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new vehicle add boxes
	 * @param end the upper bound of the range of tourism new vehicle add boxes (not inclusive)
	 * @return the range of tourism new vehicle add boxes
	 */
	public java.util.List<TourismNewVehicleAddBox> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the tourism new vehicle add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewVehicleAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new vehicle add boxes
	 * @param end the upper bound of the range of tourism new vehicle add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new vehicle add boxes
	 */
	public java.util.List<TourismNewVehicleAddBox> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewVehicleAddBox> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism new vehicle add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewVehicleAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new vehicle add boxes
	 * @param end the upper bound of the range of tourism new vehicle add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new vehicle add boxes
	 */
	public java.util.List<TourismNewVehicleAddBox> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewVehicleAddBox> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism new vehicle add boxes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism new vehicle add boxes.
	 *
	 * @return the number of tourism new vehicle add boxes
	 */
	public int countAll();

}