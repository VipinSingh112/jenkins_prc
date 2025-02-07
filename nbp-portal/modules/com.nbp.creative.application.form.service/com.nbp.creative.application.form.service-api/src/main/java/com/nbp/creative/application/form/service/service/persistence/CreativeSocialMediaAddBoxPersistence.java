/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.creative.application.form.service.exception.NoSuchCreativeSocialMediaAddBoxException;
import com.nbp.creative.application.form.service.model.CreativeSocialMediaAddBox;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the creative social media add box service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeSocialMediaAddBoxUtil
 * @generated
 */
@ProviderType
public interface CreativeSocialMediaAddBoxPersistence
	extends BasePersistence<CreativeSocialMediaAddBox> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CreativeSocialMediaAddBoxUtil} to access the creative social media add box persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the creative social media add boxes where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative social media add boxes
	 */
	public java.util.List<CreativeSocialMediaAddBox> findBygetCA_CSB_CAI(
		long CreativeApplicationId);

	/**
	 * Returns a range of all the creative social media add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeSocialMediaAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative social media add boxes
	 * @param end the upper bound of the range of creative social media add boxes (not inclusive)
	 * @return the range of matching creative social media add boxes
	 */
	public java.util.List<CreativeSocialMediaAddBox> findBygetCA_CSB_CAI(
		long CreativeApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the creative social media add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeSocialMediaAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative social media add boxes
	 * @param end the upper bound of the range of creative social media add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative social media add boxes
	 */
	public java.util.List<CreativeSocialMediaAddBox> findBygetCA_CSB_CAI(
		long CreativeApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeSocialMediaAddBox> orderByComparator);

	/**
	 * Returns an ordered range of all the creative social media add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeSocialMediaAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative social media add boxes
	 * @param end the upper bound of the range of creative social media add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative social media add boxes
	 */
	public java.util.List<CreativeSocialMediaAddBox> findBygetCA_CSB_CAI(
		long CreativeApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeSocialMediaAddBox> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first creative social media add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative social media add box
	 * @throws NoSuchCreativeSocialMediaAddBoxException if a matching creative social media add box could not be found
	 */
	public CreativeSocialMediaAddBox findBygetCA_CSB_CAI_First(
			long CreativeApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeSocialMediaAddBox> orderByComparator)
		throws NoSuchCreativeSocialMediaAddBoxException;

	/**
	 * Returns the first creative social media add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative social media add box, or <code>null</code> if a matching creative social media add box could not be found
	 */
	public CreativeSocialMediaAddBox fetchBygetCA_CSB_CAI_First(
		long CreativeApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeSocialMediaAddBox> orderByComparator);

	/**
	 * Returns the last creative social media add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative social media add box
	 * @throws NoSuchCreativeSocialMediaAddBoxException if a matching creative social media add box could not be found
	 */
	public CreativeSocialMediaAddBox findBygetCA_CSB_CAI_Last(
			long CreativeApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeSocialMediaAddBox> orderByComparator)
		throws NoSuchCreativeSocialMediaAddBoxException;

	/**
	 * Returns the last creative social media add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative social media add box, or <code>null</code> if a matching creative social media add box could not be found
	 */
	public CreativeSocialMediaAddBox fetchBygetCA_CSB_CAI_Last(
		long CreativeApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeSocialMediaAddBox> orderByComparator);

	/**
	 * Returns the creative social media add boxes before and after the current creative social media add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param creativeSocialBoxId the primary key of the current creative social media add box
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative social media add box
	 * @throws NoSuchCreativeSocialMediaAddBoxException if a creative social media add box with the primary key could not be found
	 */
	public CreativeSocialMediaAddBox[] findBygetCA_CSB_CAI_PrevAndNext(
			long creativeSocialBoxId, long CreativeApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeSocialMediaAddBox> orderByComparator)
		throws NoSuchCreativeSocialMediaAddBoxException;

	/**
	 * Removes all the creative social media add boxes where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 */
	public void removeBygetCA_CSB_CAI(long CreativeApplicationId);

	/**
	 * Returns the number of creative social media add boxes where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative social media add boxes
	 */
	public int countBygetCA_CSB_CAI(long CreativeApplicationId);

	/**
	 * Caches the creative social media add box in the entity cache if it is enabled.
	 *
	 * @param creativeSocialMediaAddBox the creative social media add box
	 */
	public void cacheResult(
		CreativeSocialMediaAddBox creativeSocialMediaAddBox);

	/**
	 * Caches the creative social media add boxes in the entity cache if it is enabled.
	 *
	 * @param creativeSocialMediaAddBoxes the creative social media add boxes
	 */
	public void cacheResult(
		java.util.List<CreativeSocialMediaAddBox> creativeSocialMediaAddBoxes);

	/**
	 * Creates a new creative social media add box with the primary key. Does not add the creative social media add box to the database.
	 *
	 * @param creativeSocialBoxId the primary key for the new creative social media add box
	 * @return the new creative social media add box
	 */
	public CreativeSocialMediaAddBox create(long creativeSocialBoxId);

	/**
	 * Removes the creative social media add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeSocialBoxId the primary key of the creative social media add box
	 * @return the creative social media add box that was removed
	 * @throws NoSuchCreativeSocialMediaAddBoxException if a creative social media add box with the primary key could not be found
	 */
	public CreativeSocialMediaAddBox remove(long creativeSocialBoxId)
		throws NoSuchCreativeSocialMediaAddBoxException;

	public CreativeSocialMediaAddBox updateImpl(
		CreativeSocialMediaAddBox creativeSocialMediaAddBox);

	/**
	 * Returns the creative social media add box with the primary key or throws a <code>NoSuchCreativeSocialMediaAddBoxException</code> if it could not be found.
	 *
	 * @param creativeSocialBoxId the primary key of the creative social media add box
	 * @return the creative social media add box
	 * @throws NoSuchCreativeSocialMediaAddBoxException if a creative social media add box with the primary key could not be found
	 */
	public CreativeSocialMediaAddBox findByPrimaryKey(long creativeSocialBoxId)
		throws NoSuchCreativeSocialMediaAddBoxException;

	/**
	 * Returns the creative social media add box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeSocialBoxId the primary key of the creative social media add box
	 * @return the creative social media add box, or <code>null</code> if a creative social media add box with the primary key could not be found
	 */
	public CreativeSocialMediaAddBox fetchByPrimaryKey(
		long creativeSocialBoxId);

	/**
	 * Returns all the creative social media add boxes.
	 *
	 * @return the creative social media add boxes
	 */
	public java.util.List<CreativeSocialMediaAddBox> findAll();

	/**
	 * Returns a range of all the creative social media add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeSocialMediaAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative social media add boxes
	 * @param end the upper bound of the range of creative social media add boxes (not inclusive)
	 * @return the range of creative social media add boxes
	 */
	public java.util.List<CreativeSocialMediaAddBox> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the creative social media add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeSocialMediaAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative social media add boxes
	 * @param end the upper bound of the range of creative social media add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative social media add boxes
	 */
	public java.util.List<CreativeSocialMediaAddBox> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeSocialMediaAddBox> orderByComparator);

	/**
	 * Returns an ordered range of all the creative social media add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeSocialMediaAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative social media add boxes
	 * @param end the upper bound of the range of creative social media add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative social media add boxes
	 */
	public java.util.List<CreativeSocialMediaAddBox> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeSocialMediaAddBox> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the creative social media add boxes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of creative social media add boxes.
	 *
	 * @return the number of creative social media add boxes
	 */
	public int countAll();

}