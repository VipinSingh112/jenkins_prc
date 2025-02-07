/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismSummaryAddBoxException;
import com.nbp.tourism.application.form.services.model.TourismSummaryAddBox;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism summary add box service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismSummaryAddBoxUtil
 * @generated
 */
@ProviderType
public interface TourismSummaryAddBoxPersistence
	extends BasePersistence<TourismSummaryAddBox> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismSummaryAddBoxUtil} to access the tourism summary add box persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the tourism summary add boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism summary add boxes
	 */
	public java.util.List<TourismSummaryAddBox> findBygetTAP_TAI(
		long tourismApplicationId);

	/**
	 * Returns a range of all the tourism summary add boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismSummaryAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism summary add boxes
	 * @param end the upper bound of the range of tourism summary add boxes (not inclusive)
	 * @return the range of matching tourism summary add boxes
	 */
	public java.util.List<TourismSummaryAddBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the tourism summary add boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismSummaryAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism summary add boxes
	 * @param end the upper bound of the range of tourism summary add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism summary add boxes
	 */
	public java.util.List<TourismSummaryAddBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TourismSummaryAddBox>
			orderByComparator);

	/**
	 * Returns an ordered range of all the tourism summary add boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismSummaryAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism summary add boxes
	 * @param end the upper bound of the range of tourism summary add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism summary add boxes
	 */
	public java.util.List<TourismSummaryAddBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TourismSummaryAddBox>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first tourism summary add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism summary add box
	 * @throws NoSuchTourismSummaryAddBoxException if a matching tourism summary add box could not be found
	 */
	public TourismSummaryAddBox findBygetTAP_TAI_First(
			long tourismApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismSummaryAddBox> orderByComparator)
		throws NoSuchTourismSummaryAddBoxException;

	/**
	 * Returns the first tourism summary add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism summary add box, or <code>null</code> if a matching tourism summary add box could not be found
	 */
	public TourismSummaryAddBox fetchBygetTAP_TAI_First(
		long tourismApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<TourismSummaryAddBox>
			orderByComparator);

	/**
	 * Returns the last tourism summary add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism summary add box
	 * @throws NoSuchTourismSummaryAddBoxException if a matching tourism summary add box could not be found
	 */
	public TourismSummaryAddBox findBygetTAP_TAI_Last(
			long tourismApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismSummaryAddBox> orderByComparator)
		throws NoSuchTourismSummaryAddBoxException;

	/**
	 * Returns the last tourism summary add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism summary add box, or <code>null</code> if a matching tourism summary add box could not be found
	 */
	public TourismSummaryAddBox fetchBygetTAP_TAI_Last(
		long tourismApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<TourismSummaryAddBox>
			orderByComparator);

	/**
	 * Returns the tourism summary add boxes before and after the current tourism summary add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismSummaryBoxId the primary key of the current tourism summary add box
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism summary add box
	 * @throws NoSuchTourismSummaryAddBoxException if a tourism summary add box with the primary key could not be found
	 */
	public TourismSummaryAddBox[] findBygetTAP_TAI_PrevAndNext(
			long tourismSummaryBoxId, long tourismApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<TourismSummaryAddBox> orderByComparator)
		throws NoSuchTourismSummaryAddBoxException;

	/**
	 * Removes all the tourism summary add boxes where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 */
	public void removeBygetTAP_TAI(long tourismApplicationId);

	/**
	 * Returns the number of tourism summary add boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism summary add boxes
	 */
	public int countBygetTAP_TAI(long tourismApplicationId);

	/**
	 * Caches the tourism summary add box in the entity cache if it is enabled.
	 *
	 * @param tourismSummaryAddBox the tourism summary add box
	 */
	public void cacheResult(TourismSummaryAddBox tourismSummaryAddBox);

	/**
	 * Caches the tourism summary add boxes in the entity cache if it is enabled.
	 *
	 * @param tourismSummaryAddBoxes the tourism summary add boxes
	 */
	public void cacheResult(
		java.util.List<TourismSummaryAddBox> tourismSummaryAddBoxes);

	/**
	 * Creates a new tourism summary add box with the primary key. Does not add the tourism summary add box to the database.
	 *
	 * @param tourismSummaryBoxId the primary key for the new tourism summary add box
	 * @return the new tourism summary add box
	 */
	public TourismSummaryAddBox create(long tourismSummaryBoxId);

	/**
	 * Removes the tourism summary add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismSummaryBoxId the primary key of the tourism summary add box
	 * @return the tourism summary add box that was removed
	 * @throws NoSuchTourismSummaryAddBoxException if a tourism summary add box with the primary key could not be found
	 */
	public TourismSummaryAddBox remove(long tourismSummaryBoxId)
		throws NoSuchTourismSummaryAddBoxException;

	public TourismSummaryAddBox updateImpl(
		TourismSummaryAddBox tourismSummaryAddBox);

	/**
	 * Returns the tourism summary add box with the primary key or throws a <code>NoSuchTourismSummaryAddBoxException</code> if it could not be found.
	 *
	 * @param tourismSummaryBoxId the primary key of the tourism summary add box
	 * @return the tourism summary add box
	 * @throws NoSuchTourismSummaryAddBoxException if a tourism summary add box with the primary key could not be found
	 */
	public TourismSummaryAddBox findByPrimaryKey(long tourismSummaryBoxId)
		throws NoSuchTourismSummaryAddBoxException;

	/**
	 * Returns the tourism summary add box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismSummaryBoxId the primary key of the tourism summary add box
	 * @return the tourism summary add box, or <code>null</code> if a tourism summary add box with the primary key could not be found
	 */
	public TourismSummaryAddBox fetchByPrimaryKey(long tourismSummaryBoxId);

	/**
	 * Returns all the tourism summary add boxes.
	 *
	 * @return the tourism summary add boxes
	 */
	public java.util.List<TourismSummaryAddBox> findAll();

	/**
	 * Returns a range of all the tourism summary add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismSummaryAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism summary add boxes
	 * @param end the upper bound of the range of tourism summary add boxes (not inclusive)
	 * @return the range of tourism summary add boxes
	 */
	public java.util.List<TourismSummaryAddBox> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the tourism summary add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismSummaryAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism summary add boxes
	 * @param end the upper bound of the range of tourism summary add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism summary add boxes
	 */
	public java.util.List<TourismSummaryAddBox> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TourismSummaryAddBox>
			orderByComparator);

	/**
	 * Returns an ordered range of all the tourism summary add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismSummaryAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism summary add boxes
	 * @param end the upper bound of the range of tourism summary add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism summary add boxes
	 */
	public java.util.List<TourismSummaryAddBox> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TourismSummaryAddBox>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism summary add boxes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism summary add boxes.
	 *
	 * @return the number of tourism summary add boxes
	 */
	public int countAll();

}