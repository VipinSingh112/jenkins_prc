/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.creative.application.form.service.exception.NoSuchCreativeContactInfoAddBoxException;
import com.nbp.creative.application.form.service.model.CreativeContactInfoAddBox;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the creative contact info add box service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeContactInfoAddBoxUtil
 * @generated
 */
@ProviderType
public interface CreativeContactInfoAddBoxPersistence
	extends BasePersistence<CreativeContactInfoAddBox> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CreativeContactInfoAddBoxUtil} to access the creative contact info add box persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the creative contact info add boxes where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative contact info add boxes
	 */
	public java.util.List<CreativeContactInfoAddBox> findBygetCA_CCB_CAI(
		long CreativeApplicationId);

	/**
	 * Returns a range of all the creative contact info add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeContactInfoAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative contact info add boxes
	 * @param end the upper bound of the range of creative contact info add boxes (not inclusive)
	 * @return the range of matching creative contact info add boxes
	 */
	public java.util.List<CreativeContactInfoAddBox> findBygetCA_CCB_CAI(
		long CreativeApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the creative contact info add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeContactInfoAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative contact info add boxes
	 * @param end the upper bound of the range of creative contact info add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative contact info add boxes
	 */
	public java.util.List<CreativeContactInfoAddBox> findBygetCA_CCB_CAI(
		long CreativeApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeContactInfoAddBox> orderByComparator);

	/**
	 * Returns an ordered range of all the creative contact info add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeContactInfoAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative contact info add boxes
	 * @param end the upper bound of the range of creative contact info add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative contact info add boxes
	 */
	public java.util.List<CreativeContactInfoAddBox> findBygetCA_CCB_CAI(
		long CreativeApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeContactInfoAddBox> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first creative contact info add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative contact info add box
	 * @throws NoSuchCreativeContactInfoAddBoxException if a matching creative contact info add box could not be found
	 */
	public CreativeContactInfoAddBox findBygetCA_CCB_CAI_First(
			long CreativeApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeContactInfoAddBox> orderByComparator)
		throws NoSuchCreativeContactInfoAddBoxException;

	/**
	 * Returns the first creative contact info add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative contact info add box, or <code>null</code> if a matching creative contact info add box could not be found
	 */
	public CreativeContactInfoAddBox fetchBygetCA_CCB_CAI_First(
		long CreativeApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeContactInfoAddBox> orderByComparator);

	/**
	 * Returns the last creative contact info add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative contact info add box
	 * @throws NoSuchCreativeContactInfoAddBoxException if a matching creative contact info add box could not be found
	 */
	public CreativeContactInfoAddBox findBygetCA_CCB_CAI_Last(
			long CreativeApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeContactInfoAddBox> orderByComparator)
		throws NoSuchCreativeContactInfoAddBoxException;

	/**
	 * Returns the last creative contact info add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative contact info add box, or <code>null</code> if a matching creative contact info add box could not be found
	 */
	public CreativeContactInfoAddBox fetchBygetCA_CCB_CAI_Last(
		long CreativeApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeContactInfoAddBox> orderByComparator);

	/**
	 * Returns the creative contact info add boxes before and after the current creative contact info add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param creativeContactBoxId the primary key of the current creative contact info add box
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative contact info add box
	 * @throws NoSuchCreativeContactInfoAddBoxException if a creative contact info add box with the primary key could not be found
	 */
	public CreativeContactInfoAddBox[] findBygetCA_CCB_CAI_PrevAndNext(
			long creativeContactBoxId, long CreativeApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeContactInfoAddBox> orderByComparator)
		throws NoSuchCreativeContactInfoAddBoxException;

	/**
	 * Removes all the creative contact info add boxes where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 */
	public void removeBygetCA_CCB_CAI(long CreativeApplicationId);

	/**
	 * Returns the number of creative contact info add boxes where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative contact info add boxes
	 */
	public int countBygetCA_CCB_CAI(long CreativeApplicationId);

	/**
	 * Caches the creative contact info add box in the entity cache if it is enabled.
	 *
	 * @param creativeContactInfoAddBox the creative contact info add box
	 */
	public void cacheResult(
		CreativeContactInfoAddBox creativeContactInfoAddBox);

	/**
	 * Caches the creative contact info add boxes in the entity cache if it is enabled.
	 *
	 * @param creativeContactInfoAddBoxes the creative contact info add boxes
	 */
	public void cacheResult(
		java.util.List<CreativeContactInfoAddBox> creativeContactInfoAddBoxes);

	/**
	 * Creates a new creative contact info add box with the primary key. Does not add the creative contact info add box to the database.
	 *
	 * @param creativeContactBoxId the primary key for the new creative contact info add box
	 * @return the new creative contact info add box
	 */
	public CreativeContactInfoAddBox create(long creativeContactBoxId);

	/**
	 * Removes the creative contact info add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeContactBoxId the primary key of the creative contact info add box
	 * @return the creative contact info add box that was removed
	 * @throws NoSuchCreativeContactInfoAddBoxException if a creative contact info add box with the primary key could not be found
	 */
	public CreativeContactInfoAddBox remove(long creativeContactBoxId)
		throws NoSuchCreativeContactInfoAddBoxException;

	public CreativeContactInfoAddBox updateImpl(
		CreativeContactInfoAddBox creativeContactInfoAddBox);

	/**
	 * Returns the creative contact info add box with the primary key or throws a <code>NoSuchCreativeContactInfoAddBoxException</code> if it could not be found.
	 *
	 * @param creativeContactBoxId the primary key of the creative contact info add box
	 * @return the creative contact info add box
	 * @throws NoSuchCreativeContactInfoAddBoxException if a creative contact info add box with the primary key could not be found
	 */
	public CreativeContactInfoAddBox findByPrimaryKey(long creativeContactBoxId)
		throws NoSuchCreativeContactInfoAddBoxException;

	/**
	 * Returns the creative contact info add box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeContactBoxId the primary key of the creative contact info add box
	 * @return the creative contact info add box, or <code>null</code> if a creative contact info add box with the primary key could not be found
	 */
	public CreativeContactInfoAddBox fetchByPrimaryKey(
		long creativeContactBoxId);

	/**
	 * Returns all the creative contact info add boxes.
	 *
	 * @return the creative contact info add boxes
	 */
	public java.util.List<CreativeContactInfoAddBox> findAll();

	/**
	 * Returns a range of all the creative contact info add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeContactInfoAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative contact info add boxes
	 * @param end the upper bound of the range of creative contact info add boxes (not inclusive)
	 * @return the range of creative contact info add boxes
	 */
	public java.util.List<CreativeContactInfoAddBox> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the creative contact info add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeContactInfoAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative contact info add boxes
	 * @param end the upper bound of the range of creative contact info add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative contact info add boxes
	 */
	public java.util.List<CreativeContactInfoAddBox> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeContactInfoAddBox> orderByComparator);

	/**
	 * Returns an ordered range of all the creative contact info add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeContactInfoAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative contact info add boxes
	 * @param end the upper bound of the range of creative contact info add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative contact info add boxes
	 */
	public java.util.List<CreativeContactInfoAddBox> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeContactInfoAddBox> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the creative contact info add boxes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of creative contact info add boxes.
	 *
	 * @return the number of creative contact info add boxes
	 */
	public int countAll();

}