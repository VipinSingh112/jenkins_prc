/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismAnnualEntertainBoxException;
import com.nbp.tourism.application.form.services.model.TourismAnnualEntertainBox;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism annual entertain box service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismAnnualEntertainBoxUtil
 * @generated
 */
@ProviderType
public interface TourismAnnualEntertainBoxPersistence
	extends BasePersistence<TourismAnnualEntertainBox> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismAnnualEntertainBoxUtil} to access the tourism annual entertain box persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the tourism annual entertain boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism annual entertain boxes
	 */
	public java.util.List<TourismAnnualEntertainBox> findBygetTAP_TAI(
		long tourismApplicationId);

	/**
	 * Returns a range of all the tourism annual entertain boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismAnnualEntertainBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism annual entertain boxes
	 * @param end the upper bound of the range of tourism annual entertain boxes (not inclusive)
	 * @return the range of matching tourism annual entertain boxes
	 */
	public java.util.List<TourismAnnualEntertainBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the tourism annual entertain boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismAnnualEntertainBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism annual entertain boxes
	 * @param end the upper bound of the range of tourism annual entertain boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism annual entertain boxes
	 */
	public java.util.List<TourismAnnualEntertainBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismAnnualEntertainBox> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism annual entertain boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismAnnualEntertainBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism annual entertain boxes
	 * @param end the upper bound of the range of tourism annual entertain boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism annual entertain boxes
	 */
	public java.util.List<TourismAnnualEntertainBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismAnnualEntertainBox> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first tourism annual entertain box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism annual entertain box
	 * @throws NoSuchTourismAnnualEntertainBoxException if a matching tourism annual entertain box could not be found
	 */
	public TourismAnnualEntertainBox findBygetTAP_TAI_First(
			long tourismApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismAnnualEntertainBox> orderByComparator)
		throws NoSuchTourismAnnualEntertainBoxException;

	/**
	 * Returns the first tourism annual entertain box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism annual entertain box, or <code>null</code> if a matching tourism annual entertain box could not be found
	 */
	public TourismAnnualEntertainBox fetchBygetTAP_TAI_First(
		long tourismApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismAnnualEntertainBox> orderByComparator);

	/**
	 * Returns the last tourism annual entertain box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism annual entertain box
	 * @throws NoSuchTourismAnnualEntertainBoxException if a matching tourism annual entertain box could not be found
	 */
	public TourismAnnualEntertainBox findBygetTAP_TAI_Last(
			long tourismApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismAnnualEntertainBox> orderByComparator)
		throws NoSuchTourismAnnualEntertainBoxException;

	/**
	 * Returns the last tourism annual entertain box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism annual entertain box, or <code>null</code> if a matching tourism annual entertain box could not be found
	 */
	public TourismAnnualEntertainBox fetchBygetTAP_TAI_Last(
		long tourismApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismAnnualEntertainBox> orderByComparator);

	/**
	 * Returns the tourism annual entertain boxes before and after the current tourism annual entertain box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismAnnualEntertainBoxId the primary key of the current tourism annual entertain box
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism annual entertain box
	 * @throws NoSuchTourismAnnualEntertainBoxException if a tourism annual entertain box with the primary key could not be found
	 */
	public TourismAnnualEntertainBox[] findBygetTAP_TAI_PrevAndNext(
			long tourismAnnualEntertainBoxId, long tourismApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismAnnualEntertainBox> orderByComparator)
		throws NoSuchTourismAnnualEntertainBoxException;

	/**
	 * Removes all the tourism annual entertain boxes where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 */
	public void removeBygetTAP_TAI(long tourismApplicationId);

	/**
	 * Returns the number of tourism annual entertain boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism annual entertain boxes
	 */
	public int countBygetTAP_TAI(long tourismApplicationId);

	/**
	 * Caches the tourism annual entertain box in the entity cache if it is enabled.
	 *
	 * @param tourismAnnualEntertainBox the tourism annual entertain box
	 */
	public void cacheResult(
		TourismAnnualEntertainBox tourismAnnualEntertainBox);

	/**
	 * Caches the tourism annual entertain boxes in the entity cache if it is enabled.
	 *
	 * @param tourismAnnualEntertainBoxes the tourism annual entertain boxes
	 */
	public void cacheResult(
		java.util.List<TourismAnnualEntertainBox> tourismAnnualEntertainBoxes);

	/**
	 * Creates a new tourism annual entertain box with the primary key. Does not add the tourism annual entertain box to the database.
	 *
	 * @param tourismAnnualEntertainBoxId the primary key for the new tourism annual entertain box
	 * @return the new tourism annual entertain box
	 */
	public TourismAnnualEntertainBox create(long tourismAnnualEntertainBoxId);

	/**
	 * Removes the tourism annual entertain box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismAnnualEntertainBoxId the primary key of the tourism annual entertain box
	 * @return the tourism annual entertain box that was removed
	 * @throws NoSuchTourismAnnualEntertainBoxException if a tourism annual entertain box with the primary key could not be found
	 */
	public TourismAnnualEntertainBox remove(long tourismAnnualEntertainBoxId)
		throws NoSuchTourismAnnualEntertainBoxException;

	public TourismAnnualEntertainBox updateImpl(
		TourismAnnualEntertainBox tourismAnnualEntertainBox);

	/**
	 * Returns the tourism annual entertain box with the primary key or throws a <code>NoSuchTourismAnnualEntertainBoxException</code> if it could not be found.
	 *
	 * @param tourismAnnualEntertainBoxId the primary key of the tourism annual entertain box
	 * @return the tourism annual entertain box
	 * @throws NoSuchTourismAnnualEntertainBoxException if a tourism annual entertain box with the primary key could not be found
	 */
	public TourismAnnualEntertainBox findByPrimaryKey(
			long tourismAnnualEntertainBoxId)
		throws NoSuchTourismAnnualEntertainBoxException;

	/**
	 * Returns the tourism annual entertain box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismAnnualEntertainBoxId the primary key of the tourism annual entertain box
	 * @return the tourism annual entertain box, or <code>null</code> if a tourism annual entertain box with the primary key could not be found
	 */
	public TourismAnnualEntertainBox fetchByPrimaryKey(
		long tourismAnnualEntertainBoxId);

	/**
	 * Returns all the tourism annual entertain boxes.
	 *
	 * @return the tourism annual entertain boxes
	 */
	public java.util.List<TourismAnnualEntertainBox> findAll();

	/**
	 * Returns a range of all the tourism annual entertain boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismAnnualEntertainBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism annual entertain boxes
	 * @param end the upper bound of the range of tourism annual entertain boxes (not inclusive)
	 * @return the range of tourism annual entertain boxes
	 */
	public java.util.List<TourismAnnualEntertainBox> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism annual entertain boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismAnnualEntertainBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism annual entertain boxes
	 * @param end the upper bound of the range of tourism annual entertain boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism annual entertain boxes
	 */
	public java.util.List<TourismAnnualEntertainBox> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismAnnualEntertainBox> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism annual entertain boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismAnnualEntertainBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism annual entertain boxes
	 * @param end the upper bound of the range of tourism annual entertain boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism annual entertain boxes
	 */
	public java.util.List<TourismAnnualEntertainBox> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismAnnualEntertainBox> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism annual entertain boxes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism annual entertain boxes.
	 *
	 * @return the number of tourism annual entertain boxes
	 */
	public int countAll();

}