/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.creative.application.form.service.exception.NoSuchCreativeDirectorListinAddBoxException;
import com.nbp.creative.application.form.service.model.CreativeDirectorListinAddBox;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the creative director listin add box service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeDirectorListinAddBoxUtil
 * @generated
 */
@ProviderType
public interface CreativeDirectorListinAddBoxPersistence
	extends BasePersistence<CreativeDirectorListinAddBox> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CreativeDirectorListinAddBoxUtil} to access the creative director listin add box persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the creative director listin add boxes where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative director listin add boxes
	 */
	public java.util.List<CreativeDirectorListinAddBox> findBygetCA_DLB_CAI(
		long CreativeApplicationId);

	/**
	 * Returns a range of all the creative director listin add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDirectorListinAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative director listin add boxes
	 * @param end the upper bound of the range of creative director listin add boxes (not inclusive)
	 * @return the range of matching creative director listin add boxes
	 */
	public java.util.List<CreativeDirectorListinAddBox> findBygetCA_DLB_CAI(
		long CreativeApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the creative director listin add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDirectorListinAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative director listin add boxes
	 * @param end the upper bound of the range of creative director listin add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative director listin add boxes
	 */
	public java.util.List<CreativeDirectorListinAddBox> findBygetCA_DLB_CAI(
		long CreativeApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeDirectorListinAddBox> orderByComparator);

	/**
	 * Returns an ordered range of all the creative director listin add boxes where CreativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDirectorListinAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative director listin add boxes
	 * @param end the upper bound of the range of creative director listin add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative director listin add boxes
	 */
	public java.util.List<CreativeDirectorListinAddBox> findBygetCA_DLB_CAI(
		long CreativeApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeDirectorListinAddBox> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first creative director listin add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative director listin add box
	 * @throws NoSuchCreativeDirectorListinAddBoxException if a matching creative director listin add box could not be found
	 */
	public CreativeDirectorListinAddBox findBygetCA_DLB_CAI_First(
			long CreativeApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeDirectorListinAddBox> orderByComparator)
		throws NoSuchCreativeDirectorListinAddBoxException;

	/**
	 * Returns the first creative director listin add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative director listin add box, or <code>null</code> if a matching creative director listin add box could not be found
	 */
	public CreativeDirectorListinAddBox fetchBygetCA_DLB_CAI_First(
		long CreativeApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeDirectorListinAddBox> orderByComparator);

	/**
	 * Returns the last creative director listin add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative director listin add box
	 * @throws NoSuchCreativeDirectorListinAddBoxException if a matching creative director listin add box could not be found
	 */
	public CreativeDirectorListinAddBox findBygetCA_DLB_CAI_Last(
			long CreativeApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeDirectorListinAddBox> orderByComparator)
		throws NoSuchCreativeDirectorListinAddBoxException;

	/**
	 * Returns the last creative director listin add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative director listin add box, or <code>null</code> if a matching creative director listin add box could not be found
	 */
	public CreativeDirectorListinAddBox fetchBygetCA_DLB_CAI_Last(
		long CreativeApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeDirectorListinAddBox> orderByComparator);

	/**
	 * Returns the creative director listin add boxes before and after the current creative director listin add box in the ordered set where CreativeApplicationId = &#63;.
	 *
	 * @param creativeDirectorBoxId the primary key of the current creative director listin add box
	 * @param CreativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative director listin add box
	 * @throws NoSuchCreativeDirectorListinAddBoxException if a creative director listin add box with the primary key could not be found
	 */
	public CreativeDirectorListinAddBox[] findBygetCA_DLB_CAI_PrevAndNext(
			long creativeDirectorBoxId, long CreativeApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeDirectorListinAddBox> orderByComparator)
		throws NoSuchCreativeDirectorListinAddBoxException;

	/**
	 * Removes all the creative director listin add boxes where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 */
	public void removeBygetCA_DLB_CAI(long CreativeApplicationId);

	/**
	 * Returns the number of creative director listin add boxes where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative director listin add boxes
	 */
	public int countBygetCA_DLB_CAI(long CreativeApplicationId);

	/**
	 * Caches the creative director listin add box in the entity cache if it is enabled.
	 *
	 * @param creativeDirectorListinAddBox the creative director listin add box
	 */
	public void cacheResult(
		CreativeDirectorListinAddBox creativeDirectorListinAddBox);

	/**
	 * Caches the creative director listin add boxes in the entity cache if it is enabled.
	 *
	 * @param creativeDirectorListinAddBoxes the creative director listin add boxes
	 */
	public void cacheResult(
		java.util.List<CreativeDirectorListinAddBox>
			creativeDirectorListinAddBoxes);

	/**
	 * Creates a new creative director listin add box with the primary key. Does not add the creative director listin add box to the database.
	 *
	 * @param creativeDirectorBoxId the primary key for the new creative director listin add box
	 * @return the new creative director listin add box
	 */
	public CreativeDirectorListinAddBox create(long creativeDirectorBoxId);

	/**
	 * Removes the creative director listin add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeDirectorBoxId the primary key of the creative director listin add box
	 * @return the creative director listin add box that was removed
	 * @throws NoSuchCreativeDirectorListinAddBoxException if a creative director listin add box with the primary key could not be found
	 */
	public CreativeDirectorListinAddBox remove(long creativeDirectorBoxId)
		throws NoSuchCreativeDirectorListinAddBoxException;

	public CreativeDirectorListinAddBox updateImpl(
		CreativeDirectorListinAddBox creativeDirectorListinAddBox);

	/**
	 * Returns the creative director listin add box with the primary key or throws a <code>NoSuchCreativeDirectorListinAddBoxException</code> if it could not be found.
	 *
	 * @param creativeDirectorBoxId the primary key of the creative director listin add box
	 * @return the creative director listin add box
	 * @throws NoSuchCreativeDirectorListinAddBoxException if a creative director listin add box with the primary key could not be found
	 */
	public CreativeDirectorListinAddBox findByPrimaryKey(
			long creativeDirectorBoxId)
		throws NoSuchCreativeDirectorListinAddBoxException;

	/**
	 * Returns the creative director listin add box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeDirectorBoxId the primary key of the creative director listin add box
	 * @return the creative director listin add box, or <code>null</code> if a creative director listin add box with the primary key could not be found
	 */
	public CreativeDirectorListinAddBox fetchByPrimaryKey(
		long creativeDirectorBoxId);

	/**
	 * Returns all the creative director listin add boxes.
	 *
	 * @return the creative director listin add boxes
	 */
	public java.util.List<CreativeDirectorListinAddBox> findAll();

	/**
	 * Returns a range of all the creative director listin add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDirectorListinAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative director listin add boxes
	 * @param end the upper bound of the range of creative director listin add boxes (not inclusive)
	 * @return the range of creative director listin add boxes
	 */
	public java.util.List<CreativeDirectorListinAddBox> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the creative director listin add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDirectorListinAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative director listin add boxes
	 * @param end the upper bound of the range of creative director listin add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative director listin add boxes
	 */
	public java.util.List<CreativeDirectorListinAddBox> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeDirectorListinAddBox> orderByComparator);

	/**
	 * Returns an ordered range of all the creative director listin add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDirectorListinAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative director listin add boxes
	 * @param end the upper bound of the range of creative director listin add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative director listin add boxes
	 */
	public java.util.List<CreativeDirectorListinAddBox> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeDirectorListinAddBox> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the creative director listin add boxes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of creative director listin add boxes.
	 *
	 * @return the number of creative director listin add boxes
	 */
	public int countAll();

}