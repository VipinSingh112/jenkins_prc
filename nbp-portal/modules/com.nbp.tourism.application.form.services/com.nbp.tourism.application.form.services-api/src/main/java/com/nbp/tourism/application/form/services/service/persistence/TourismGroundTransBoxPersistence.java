/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismGroundTransBoxException;
import com.nbp.tourism.application.form.services.model.TourismGroundTransBox;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism ground trans box service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismGroundTransBoxUtil
 * @generated
 */
@ProviderType
public interface TourismGroundTransBoxPersistence
	extends BasePersistence<TourismGroundTransBox> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismGroundTransBoxUtil} to access the tourism ground trans box persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the tourism ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism ground trans boxes
	 */
	public java.util.List<TourismGroundTransBox> findBygetTAP_TAI(
		long tourismApplicationId);

	/**
	 * Returns a range of all the tourism ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism ground trans boxes
	 * @param end the upper bound of the range of tourism ground trans boxes (not inclusive)
	 * @return the range of matching tourism ground trans boxes
	 */
	public java.util.List<TourismGroundTransBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the tourism ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism ground trans boxes
	 * @param end the upper bound of the range of tourism ground trans boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism ground trans boxes
	 */
	public java.util.List<TourismGroundTransBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TourismGroundTransBox>
			orderByComparator);

	/**
	 * Returns an ordered range of all the tourism ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism ground trans boxes
	 * @param end the upper bound of the range of tourism ground trans boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism ground trans boxes
	 */
	public java.util.List<TourismGroundTransBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TourismGroundTransBox>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first tourism ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism ground trans box
	 * @throws NoSuchTourismGroundTransBoxException if a matching tourism ground trans box could not be found
	 */
	public TourismGroundTransBox findBygetTAP_TAI_First(
			long tourismApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismGroundTransBox> orderByComparator)
		throws NoSuchTourismGroundTransBoxException;

	/**
	 * Returns the first tourism ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism ground trans box, or <code>null</code> if a matching tourism ground trans box could not be found
	 */
	public TourismGroundTransBox fetchBygetTAP_TAI_First(
		long tourismApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<TourismGroundTransBox>
			orderByComparator);

	/**
	 * Returns the last tourism ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism ground trans box
	 * @throws NoSuchTourismGroundTransBoxException if a matching tourism ground trans box could not be found
	 */
	public TourismGroundTransBox findBygetTAP_TAI_Last(
			long tourismApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismGroundTransBox> orderByComparator)
		throws NoSuchTourismGroundTransBoxException;

	/**
	 * Returns the last tourism ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism ground trans box, or <code>null</code> if a matching tourism ground trans box could not be found
	 */
	public TourismGroundTransBox fetchBygetTAP_TAI_Last(
		long tourismApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<TourismGroundTransBox>
			orderByComparator);

	/**
	 * Returns the tourism ground trans boxes before and after the current tourism ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismVehicleBoxId the primary key of the current tourism ground trans box
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism ground trans box
	 * @throws NoSuchTourismGroundTransBoxException if a tourism ground trans box with the primary key could not be found
	 */
	public TourismGroundTransBox[] findBygetTAP_TAI_PrevAndNext(
			long tourismVehicleBoxId, long tourismApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismGroundTransBox> orderByComparator)
		throws NoSuchTourismGroundTransBoxException;

	/**
	 * Removes all the tourism ground trans boxes where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 */
	public void removeBygetTAP_TAI(long tourismApplicationId);

	/**
	 * Returns the number of tourism ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism ground trans boxes
	 */
	public int countBygetTAP_TAI(long tourismApplicationId);

	/**
	 * Caches the tourism ground trans box in the entity cache if it is enabled.
	 *
	 * @param tourismGroundTransBox the tourism ground trans box
	 */
	public void cacheResult(TourismGroundTransBox tourismGroundTransBox);

	/**
	 * Caches the tourism ground trans boxes in the entity cache if it is enabled.
	 *
	 * @param tourismGroundTransBoxes the tourism ground trans boxes
	 */
	public void cacheResult(
		java.util.List<TourismGroundTransBox> tourismGroundTransBoxes);

	/**
	 * Creates a new tourism ground trans box with the primary key. Does not add the tourism ground trans box to the database.
	 *
	 * @param tourismVehicleBoxId the primary key for the new tourism ground trans box
	 * @return the new tourism ground trans box
	 */
	public TourismGroundTransBox create(long tourismVehicleBoxId);

	/**
	 * Removes the tourism ground trans box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismVehicleBoxId the primary key of the tourism ground trans box
	 * @return the tourism ground trans box that was removed
	 * @throws NoSuchTourismGroundTransBoxException if a tourism ground trans box with the primary key could not be found
	 */
	public TourismGroundTransBox remove(long tourismVehicleBoxId)
		throws NoSuchTourismGroundTransBoxException;

	public TourismGroundTransBox updateImpl(
		TourismGroundTransBox tourismGroundTransBox);

	/**
	 * Returns the tourism ground trans box with the primary key or throws a <code>NoSuchTourismGroundTransBoxException</code> if it could not be found.
	 *
	 * @param tourismVehicleBoxId the primary key of the tourism ground trans box
	 * @return the tourism ground trans box
	 * @throws NoSuchTourismGroundTransBoxException if a tourism ground trans box with the primary key could not be found
	 */
	public TourismGroundTransBox findByPrimaryKey(long tourismVehicleBoxId)
		throws NoSuchTourismGroundTransBoxException;

	/**
	 * Returns the tourism ground trans box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismVehicleBoxId the primary key of the tourism ground trans box
	 * @return the tourism ground trans box, or <code>null</code> if a tourism ground trans box with the primary key could not be found
	 */
	public TourismGroundTransBox fetchByPrimaryKey(long tourismVehicleBoxId);

	/**
	 * Returns all the tourism ground trans boxes.
	 *
	 * @return the tourism ground trans boxes
	 */
	public java.util.List<TourismGroundTransBox> findAll();

	/**
	 * Returns a range of all the tourism ground trans boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism ground trans boxes
	 * @param end the upper bound of the range of tourism ground trans boxes (not inclusive)
	 * @return the range of tourism ground trans boxes
	 */
	public java.util.List<TourismGroundTransBox> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the tourism ground trans boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism ground trans boxes
	 * @param end the upper bound of the range of tourism ground trans boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism ground trans boxes
	 */
	public java.util.List<TourismGroundTransBox> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TourismGroundTransBox>
			orderByComparator);

	/**
	 * Returns an ordered range of all the tourism ground trans boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism ground trans boxes
	 * @param end the upper bound of the range of tourism ground trans boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism ground trans boxes
	 */
	public java.util.List<TourismGroundTransBox> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TourismGroundTransBox>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism ground trans boxes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism ground trans boxes.
	 *
	 * @return the number of tourism ground trans boxes
	 */
	public int countAll();

}